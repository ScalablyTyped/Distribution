package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyValueFormat extends js.Object {
  
  /** Specifies the horizontal text positioning of key value. This field is optional. If not specified, default positioning is used. */
  var position: js.UndefOr[TextPosition] = js.native
  
  /** Text formatting options for key value. */
  var textFormat: js.UndefOr[TextFormat] = js.native
}
object KeyValueFormat {
  
  @scala.inline
  def apply(): KeyValueFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyValueFormat]
  }
  
  @scala.inline
  implicit class KeyValueFormatOps[Self <: KeyValueFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPosition(value: TextPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setTextFormat(value: TextFormat): Self = this.set("textFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextFormat: Self = this.set("textFormat", js.undefined)
  }
}
