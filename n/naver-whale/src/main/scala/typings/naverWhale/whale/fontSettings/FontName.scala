package typings.naverWhale.whale.fontSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontName extends js.Object {
  /** The display name of the font. */
  var displayName: String
  /** The font ID. */
  var fontId: String
}

object FontName {
  @scala.inline
  def apply(displayName: String, fontId: String): FontName = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], fontId = fontId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontName]
  }
}

