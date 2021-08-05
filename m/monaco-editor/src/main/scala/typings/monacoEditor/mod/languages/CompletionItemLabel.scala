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
  
  inline def apply(name: String): CompletionItemLabel = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionItemLabel]
  }
  
  extension [Self <: CompletionItemLabel](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: String): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setQualifier(value: String): Self = StObject.set(x, "qualifier", value.asInstanceOf[js.Any])
    
    inline def setQualifierUndefined: Self = StObject.set(x, "qualifier", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
