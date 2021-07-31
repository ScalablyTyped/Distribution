package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyValueFormat extends StObject {
  
  /** Specifies the horizontal text positioning of key value. This field is optional. If not specified, default positioning is used. */
  var position: js.UndefOr[TextPosition] = js.undefined
  
  /** Text formatting options for key value. */
  var textFormat: js.UndefOr[TextFormat] = js.undefined
}
object KeyValueFormat {
  
  @scala.inline
  def apply(): KeyValueFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyValueFormat]
  }
  
  @scala.inline
  implicit class KeyValueFormatMutableBuilder[Self <: KeyValueFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: TextPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setTextFormat(value: TextFormat): Self = StObject.set(x, "textFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextFormatUndefined: Self = StObject.set(x, "textFormat", js.undefined)
  }
}
