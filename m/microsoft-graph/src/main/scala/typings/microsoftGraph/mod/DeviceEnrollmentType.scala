package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.unknown_
  - typings.microsoftGraph.microsoftGraphStrings.userEnrollment
  - typings.microsoftGraph.microsoftGraphStrings.deviceEnrollmentManager
  - typings.microsoftGraph.microsoftGraphStrings.appleBulkWithUser
  - typings.microsoftGraph.microsoftGraphStrings.appleBulkWithoutUser
  - typings.microsoftGraph.microsoftGraphStrings.windowsAzureADJoin
  - typings.microsoftGraph.microsoftGraphStrings.windowsBulkUserless
  - typings.microsoftGraph.microsoftGraphStrings.windowsAutoEnrollment
  - typings.microsoftGraph.microsoftGraphStrings.windowsBulkAzureDomainJoin
  - typings.microsoftGraph.microsoftGraphStrings.windowsCoManagement
*/
trait DeviceEnrollmentType extends js.Object

object DeviceEnrollmentType {
  @scala.inline
  def appleBulkWithUser: typings.microsoftGraph.microsoftGraphStrings.appleBulkWithUser = this.cast("appleBulkWithUser")
  @scala.inline
  def appleBulkWithoutUser: typings.microsoftGraph.microsoftGraphStrings.appleBulkWithoutUser = this.cast("appleBulkWithoutUser")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deviceEnrollmentManager: typings.microsoftGraph.microsoftGraphStrings.deviceEnrollmentManager = this.cast("deviceEnrollmentManager")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def userEnrollment: typings.microsoftGraph.microsoftGraphStrings.userEnrollment = this.cast("userEnrollment")
  @scala.inline
  def windowsAutoEnrollment: typings.microsoftGraph.microsoftGraphStrings.windowsAutoEnrollment = this.cast("windowsAutoEnrollment")
  @scala.inline
  def windowsAzureADJoin: typings.microsoftGraph.microsoftGraphStrings.windowsAzureADJoin = this.cast("windowsAzureADJoin")
  @scala.inline
  def windowsBulkAzureDomainJoin: typings.microsoftGraph.microsoftGraphStrings.windowsBulkAzureDomainJoin = this.cast("windowsBulkAzureDomainJoin")
  @scala.inline
  def windowsBulkUserless: typings.microsoftGraph.microsoftGraphStrings.windowsBulkUserless = this.cast("windowsBulkUserless")
  @scala.inline
  def windowsCoManagement: typings.microsoftGraph.microsoftGraphStrings.windowsCoManagement = this.cast("windowsCoManagement")
}

