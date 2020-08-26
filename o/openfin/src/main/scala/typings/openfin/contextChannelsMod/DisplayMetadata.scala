package typings.openfin.contextChannelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisplayMetadata extends js.Object {
  /**
    * The color that should be associated with this channel when displaying this channel in a UI, e.g. `#FF0000`.
    */
  var color: String = js.native
  /**
    * A URL of an image that can be used to display this channel
    */
  var glyph: String = js.native
  /**
    * A user-readable name for this channel, e.g. `"Red"`
    */
  var name: String = js.native
}

object DisplayMetadata {
  @scala.inline
  def apply(color: String, glyph: String, name: String): DisplayMetadata = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], glyph = glyph.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayMetadata]
  }
  @scala.inline
  implicit class DisplayMetadataOps[Self <: DisplayMetadata] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setGlyph(value: String): Self = this.set("glyph", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

