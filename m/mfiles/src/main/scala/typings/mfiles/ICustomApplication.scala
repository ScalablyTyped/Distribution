package typings.mfiles

import typings.mfiles.MFiles.MFCustomApplicationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomApplication extends js.Object {
  val ApplicationType: MFCustomApplicationType
  val ChecksumHash: String
  val Description: String
  val Enabled: Boolean
  val ID: String
  val MasterApplication: String
  val Name: String
  val Optional: Boolean
  val Publisher: String
  val RequireSystemAccess: Boolean
  val Version: String
  def Clone(): ICustomApplication
}

object ICustomApplication {
  @scala.inline
  def apply(
    ApplicationType: MFCustomApplicationType,
    ChecksumHash: String,
    Clone: () => ICustomApplication,
    Description: String,
    Enabled: Boolean,
    ID: String,
    MasterApplication: String,
    Name: String,
    Optional: Boolean,
    Publisher: String,
    RequireSystemAccess: Boolean,
    Version: String
  ): ICustomApplication = {
    val __obj = js.Dynamic.literal(ApplicationType = ApplicationType.asInstanceOf[js.Any], ChecksumHash = ChecksumHash.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), Description = Description.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], MasterApplication = MasterApplication.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Optional = Optional.asInstanceOf[js.Any], Publisher = Publisher.asInstanceOf[js.Any], RequireSystemAccess = RequireSystemAccess.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomApplication]
  }
}

