package typings
package naverDashWhaleLib.whaleNs.fontSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetFontDetails
  extends chromeLib.chromeNs.fontSettingsNs.FontDetails {
  /** The font ID. The empty string means to fallback to the global script font setting. */
  var fontId: java.lang.String
}

object SetFontDetails {
  @scala.inline
  def apply(fontId: java.lang.String, genericFamily: java.lang.String, script: java.lang.String = null): SetFontDetails = {
    val __obj = js.Dynamic.literal(fontId = fontId, genericFamily = genericFamily)
    if (script != null) __obj.updateDynamic("script")(script)
    __obj.asInstanceOf[SetFontDetails]
  }
}

