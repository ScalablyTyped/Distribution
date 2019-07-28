package typings.naverDashWhale.whaleNs.fontSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontSizeDetails extends js.Object {
  /** The level of control this extension has over the setting. */
  var levelOfControl: String
  /** The font size in pixels. */
  var pixelSize: Double
}

object FontSizeDetails {
  @scala.inline
  def apply(levelOfControl: String, pixelSize: Double): FontSizeDetails = {
    val __obj = js.Dynamic.literal(levelOfControl = levelOfControl, pixelSize = pixelSize)
  
    __obj.asInstanceOf[FontSizeDetails]
  }
}

