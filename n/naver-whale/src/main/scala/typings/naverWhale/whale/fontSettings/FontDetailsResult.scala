package typings.naverWhale.whale.fontSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontDetailsResult extends js.Object {
  /** The font ID. Rather than the literal font ID preference value, this may be the ID of the font that the system resolves the preference value to. So, fontId can differ from the font passed to setFont, if, for example, the font is not available on the system. The empty string signifies fallback to the global script font setting. */
  var fontId: String
  /** The level of control this extension has over the setting. */
  var levelOfControl: String
}

object FontDetailsResult {
  @scala.inline
  def apply(fontId: String, levelOfControl: String): FontDetailsResult = {
    val __obj = js.Dynamic.literal(fontId = fontId.asInstanceOf[js.Any], levelOfControl = levelOfControl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FontDetailsResult]
  }
}

