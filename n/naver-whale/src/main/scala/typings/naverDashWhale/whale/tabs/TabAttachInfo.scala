package typings.naverDashWhale.whale.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabAttachInfo extends js.Object {
  var newPosition: Double
  var newWindowId: Double
}

object TabAttachInfo {
  @scala.inline
  def apply(newPosition: Double, newWindowId: Double): TabAttachInfo = {
    val __obj = js.Dynamic.literal(newPosition = newPosition, newWindowId = newWindowId)
  
    __obj.asInstanceOf[TabAttachInfo]
  }
}

