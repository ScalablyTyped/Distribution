package typings.mobileMessagingCordova.MobileMessagingCordova

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mobileMessagingCordova.mobileMessagingCordovaStrings.Male
  - typings.mobileMessagingCordova.mobileMessagingCordovaStrings.Female
*/
trait Gender extends js.Object

object Gender {
  @scala.inline
  def Female: typings.mobileMessagingCordova.mobileMessagingCordovaStrings.Female = this.cast("Female")
  @scala.inline
  def Male: typings.mobileMessagingCordova.mobileMessagingCordovaStrings.Male = this.cast("Male")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

