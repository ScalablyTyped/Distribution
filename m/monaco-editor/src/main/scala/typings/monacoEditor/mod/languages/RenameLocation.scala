package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenameLocation extends StObject {
  
  var range: IRange
  
  var text: String
}
object RenameLocation {
  
  inline def apply(range: IRange, text: String): RenameLocation = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameLocation]
  }
  
  extension [Self <: RenameLocation](x: Self) {
    
    inline def setRange(value: IRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
