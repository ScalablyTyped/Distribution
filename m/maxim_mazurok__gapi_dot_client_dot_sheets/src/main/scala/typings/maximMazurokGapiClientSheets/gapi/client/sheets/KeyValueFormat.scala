package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyValueFormat extends StObject {
  
  /** Specifies the horizontal text positioning of key value. This field is optional. If not specified, default positioning is used. */
  var position: js.UndefOr[TextPosition] = js.undefined
  
  /** Text formatting options for key value. The link field is not supported. */
  var textFormat: js.UndefOr[TextFormat] = js.undefined
}
object KeyValueFormat {
  
  inline def apply(): KeyValueFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyValueFormat]
  }
  
  extension [Self <: KeyValueFormat](x: Self) {
    
    inline def setPosition(value: TextPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setTextFormat(value: TextFormat): Self = StObject.set(x, "textFormat", value.asInstanceOf[js.Any])
    
    inline def setTextFormatUndefined: Self = StObject.set(x, "textFormat", js.undefined)
  }
}
