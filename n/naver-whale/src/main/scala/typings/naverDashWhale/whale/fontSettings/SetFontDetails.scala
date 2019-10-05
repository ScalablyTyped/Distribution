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
    val __obj = js.Dynamic.literal(fontId = fontId, genericFamily = genericFamily)
    if (script != null) __obj.updateDynamic("script")(script)
    __obj.asInstanceOf[SetFontDetails]
  }
}

