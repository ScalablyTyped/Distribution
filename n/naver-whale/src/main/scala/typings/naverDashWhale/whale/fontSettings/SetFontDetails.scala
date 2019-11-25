package typings.naverDashWhale.whale.fontSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetFontDetails
  extends typings.chrome.chrome.fontSettings.FontDetails {
  /** The font ID. The empty string means to fallback to the global script font setting. */
  var fontId: String
}

object SetFontDetails {
  @scala.inline
  def apply(fontId: String, genericFamily: String, script: String = null): SetFontDetails = {
    val __obj = js.Dynamic.literal(fontId = fontId.asInstanceOf[js.Any], genericFamily = genericFamily.asInstanceOf[js.Any])
    if (script != null) __obj.updateDynamic("script")(script.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetFontDetails]
  }
}

