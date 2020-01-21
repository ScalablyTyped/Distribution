package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.oneDriveForBusiness_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.oneDriveForBusiness_
  - typings.microsoftGraph.microsoftGraphStrings.sharePoint
  - typings.microsoftGraph.microsoftGraphStrings.localStorage
*/
trait ManagedAppDataStorageLocation extends js.Object

object ManagedAppDataStorageLocation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def localStorage: typings.microsoftGraph.microsoftGraphStrings.localStorage = this.cast("localStorage")
  @scala.inline
  def oneDriveForBusiness: oneDriveForBusiness_ = this.cast("oneDriveForBusiness")
  @scala.inline
  def sharePoint: typings.microsoftGraph.microsoftGraphStrings.sharePoint = this.cast("sharePoint")
}

