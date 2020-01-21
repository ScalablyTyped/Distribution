package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.Unknown
  - typings.microsoftGraph.microsoftGraphStrings.OneDrive
  - typings.microsoftGraph.microsoftGraphStrings.OneDriveForBusiness
  - typings.microsoftGraph.microsoftGraphStrings.OnPremOneDriveForBusiness
*/
trait OnenoteSourceService extends js.Object

object OnenoteSourceService {
  @scala.inline
  def OnPremOneDriveForBusiness: typings.microsoftGraph.microsoftGraphStrings.OnPremOneDriveForBusiness = this.cast("OnPremOneDriveForBusiness")
  @scala.inline
  def OneDrive: typings.microsoftGraph.microsoftGraphStrings.OneDrive = this.cast("OneDrive")
  @scala.inline
  def OneDriveForBusiness: typings.microsoftGraph.microsoftGraphStrings.OneDriveForBusiness = this.cast("OneDriveForBusiness")
  @scala.inline
  def Unknown: typings.microsoftGraph.microsoftGraphStrings.Unknown = this.cast("Unknown")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

