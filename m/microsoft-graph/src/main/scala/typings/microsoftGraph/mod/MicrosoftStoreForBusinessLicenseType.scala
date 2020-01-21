package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.offline
  - typings.microsoftGraph.microsoftGraphStrings.online
*/
trait MicrosoftStoreForBusinessLicenseType extends js.Object

object MicrosoftStoreForBusinessLicenseType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def offline: typings.microsoftGraph.microsoftGraphStrings.offline = this.cast("offline")
  @scala.inline
  def online: typings.microsoftGraph.microsoftGraphStrings.online = this.cast("online")
}

