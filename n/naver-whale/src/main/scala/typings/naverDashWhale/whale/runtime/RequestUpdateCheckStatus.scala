package typings.naverDashWhale.whale.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.naverDashWhale.naverDashWhaleStrings.throttled
  - typings.naverDashWhale.naverDashWhaleStrings.no_update
  - typings.naverDashWhale.naverDashWhaleStrings.update_available
*/
trait RequestUpdateCheckStatus extends js.Object

object RequestUpdateCheckStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def no_update: typings.naverDashWhale.naverDashWhaleStrings.no_update = this.cast("no_update")
  @scala.inline
  def throttled: typings.naverDashWhale.naverDashWhaleStrings.throttled = this.cast("throttled")
  @scala.inline
  def update_available: typings.naverDashWhale.naverDashWhaleStrings.update_available = this.cast("update_available")
}

