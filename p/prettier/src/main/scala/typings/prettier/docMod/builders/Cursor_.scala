package typings.prettier.docMod.builders

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cursor_
  extends StObject
     with DocCommand {
  
  var placeholder: js.Symbol
  
  var `type`: typings.prettier.prettierStrings.cursor
}
object Cursor_ {
  
  inline def apply(placeholder: js.Symbol): Cursor_ = {
    val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("cursor")
    __obj.asInstanceOf[Cursor_]
  }
  
  extension [Self <: Cursor_](x: Self) {
    
    inline def setPlaceholder(value: js.Symbol): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.prettier.prettierStrings.cursor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
