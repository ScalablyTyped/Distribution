package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompletionItemLabel extends StObject {
  
  /**
    * The function or variable. Rendered leftmost.
    */
  var name: String
  
  /**
    * The parameters without the return type. Render after `name`.
    */
  var parameters: js.UndefOr[String] = js.undefined
  
  /**
    * The fully qualified name, like package name or file path. Rendered after `signature`.
    */
  var qualifier: js.UndefOr[String] = js.undefined
  
  /**
    * The return-type of a function or type of a property/variable. Rendered rightmost.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object CompletionItemLabel {
  
  @scala.inline
  def apply(name: String): CompletionItemLabel = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionItemLabel]
  }
  
  @scala.inline
  implicit class CompletionItemLabelMutableBuilder[Self <: CompletionItemLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: String): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setQualifier(value: String): Self = StObject.set(x, "qualifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualifierUndefined: Self = StObject.set(x, "qualifier", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
