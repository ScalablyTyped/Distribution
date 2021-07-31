package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeLens extends StObject {
  
  var command: js.UndefOr[Command] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var range: IRange
}
object CodeLens {
  
  @scala.inline
  def apply(range: IRange): CodeLens = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeLens]
  }
  
  @scala.inline
  implicit class CodeLensMutableBuilder[Self <: CodeLens] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommand(value: Command): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setRange(value: IRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
