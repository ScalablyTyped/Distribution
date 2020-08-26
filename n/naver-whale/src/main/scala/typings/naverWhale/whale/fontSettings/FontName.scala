package typings.naverWhale.whale.fontSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontName extends js.Object {
  /** The display name of the font. */
  var displayName: String = js.native
  /** The font ID. */
  var fontId: String = js.native
}

object FontName {
  @scala.inline
  def apply(displayName: String, fontId: String): FontName = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], fontId = fontId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontName]
  }
  @scala.inline
  implicit class FontNameOps[Self <: FontName] (val x: Self) extends AnyVal {
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontId(value: String): Self = this.set("fontId", value.asInstanceOf[js.Any])
  }
  
}

