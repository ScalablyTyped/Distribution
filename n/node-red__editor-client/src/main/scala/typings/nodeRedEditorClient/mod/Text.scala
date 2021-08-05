package typings.nodeRedEditorClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Text extends StObject {
  
  var bidi: TextBidi
  
  var format: TextFormat
}
object Text {
  
  inline def apply(bidi: TextBidi, format: TextFormat): Text = {
    val __obj = js.Dynamic.literal(bidi = bidi.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
  
  extension [Self <: Text](x: Self) {
    
    inline def setBidi(value: TextBidi): Self = StObject.set(x, "bidi", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: TextFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
  }
}
