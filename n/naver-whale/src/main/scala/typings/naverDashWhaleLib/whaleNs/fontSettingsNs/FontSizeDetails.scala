package typings
package naverDashWhaleLib.whaleNs.fontSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontSizeDetails extends js.Object {
  /** The level of control this extension has over the setting. */
  var levelOfControl: java.lang.String
  /** The font size in pixels. */
  var pixelSize: scala.Double
}

object FontSizeDetails {
  @scala.inline
  def apply(levelOfControl: java.lang.String, pixelSize: scala.Double): FontSizeDetails = {
    val __obj = js.Dynamic.literal(levelOfControl = levelOfControl, pixelSize = pixelSize)
  
    __obj.asInstanceOf[FontSizeDetails]
  }
}

