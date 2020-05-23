package typings.openfin.contextChannelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplayMetadata extends js.Object {
  /**
    * The color that should be associated with this channel when displaying this channel in a UI, e.g. `#FF0000`.
    */
  var color: String
  /**
    * A URL of an image that can be used to display this channel
    */
  var glyph: String
  /**
    * A user-readable name for this channel, e.g. `"Red"`
    */
  var name: String
}

object DisplayMetadata {
  @scala.inline
  def apply(color: String, glyph: String, name: String): DisplayMetadata = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], glyph = glyph.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayMetadata]
  }
}

