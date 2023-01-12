package typings.nivoCore.anon

import typings.react.mod.CSSProperties
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Text extends StObject {
  
  var line: Partial[CSSProperties]
  
  var text: Partial[CSSProperties]
}
object Text {
  
  inline def apply(line: Partial[CSSProperties], text: Partial[CSSProperties]): Text = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
    
    inline def setLine(value: Partial[CSSProperties]): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setText(value: Partial[CSSProperties]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
