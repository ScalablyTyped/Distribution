package typings
package naverDashWhaleLib.whaleNs.fontSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullFontDetails extends js.Object {
  /** The font ID. See the description in getFont. */
  var fontId: java.lang.String
  /** The generic font family for which the font setting has changed. */
  var genericFamily: java.lang.String
  /** The level of control this extension has over the setting. */
  var levelOfControl: java.lang.String
  /** Optional. The script code for which the font setting has changed.  */
  var script: js.UndefOr[java.lang.String] = js.undefined
}

object FullFontDetails {
  @scala.inline
  def apply(
    fontId: java.lang.String,
    genericFamily: java.lang.String,
    levelOfControl: java.lang.String,
    script: java.lang.String = null
  ): FullFontDetails = {
    val __obj = js.Dynamic.literal(fontId = fontId, genericFamily = genericFamily, levelOfControl = levelOfControl)
    if (script != null) __obj.updateDynamic("script")(script)
    __obj.asInstanceOf[FullFontDetails]
  }
}

