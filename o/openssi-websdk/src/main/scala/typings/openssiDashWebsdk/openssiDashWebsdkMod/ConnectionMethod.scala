package typings.openssiDashWebsdk.openssiDashWebsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.openssiDashWebsdk.openssiDashWebsdkStrings.out_of_band
  - typings.openssiDashWebsdk.openssiDashWebsdkStrings.in_band
  - typings.openssiDashWebsdk.openssiDashWebsdkStrings.invitation
*/
trait ConnectionMethod extends js.Object

object ConnectionMethod {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def in_band: typings.openssiDashWebsdk.openssiDashWebsdkStrings.in_band = this.cast("in_band")
  @scala.inline
  def invitation: typings.openssiDashWebsdk.openssiDashWebsdkStrings.invitation = this.cast("invitation")
  @scala.inline
  def out_of_band: typings.openssiDashWebsdk.openssiDashWebsdkStrings.out_of_band = this.cast("out_of_band")
}

