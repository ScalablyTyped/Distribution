package typings.mfiles

import typings.mfiles.MFiles.MFCustomApplicationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICustomApplication extends js.Object {
  val ApplicationType: MFCustomApplicationType = js.native
  val ChecksumHash: String = js.native
  val Description: String = js.native
  val Enabled: Boolean = js.native
  val ID: String = js.native
  val MasterApplication: String = js.native
  val Name: String = js.native
  val Optional: Boolean = js.native
  val Publisher: String = js.native
  val RequireSystemAccess: Boolean = js.native
  val Version: String = js.native
  def Clone(): ICustomApplication = js.native
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
  @scala.inline
  implicit class ICustomApplicationOps[Self <: ICustomApplication] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplicationType(value: MFCustomApplicationType): Self = this.set("ApplicationType", value.asInstanceOf[js.Any])
    @scala.inline
    def setChecksumHash(value: String): Self = this.set("ChecksumHash", value.asInstanceOf[js.Any])
    @scala.inline
    def setClone(value: () => ICustomApplication): Self = this.set("Clone", js.Any.fromFunction0(value))
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setID(value: String): Self = this.set("ID", value.asInstanceOf[js.Any])
    @scala.inline
    def setMasterApplication(value: String): Self = this.set("MasterApplication", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptional(value: Boolean): Self = this.set("Optional", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublisher(value: String): Self = this.set("Publisher", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequireSystemAccess(value: Boolean): Self = this.set("RequireSystemAccess", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("Version", value.asInstanceOf[js.Any])
  }
  
}

