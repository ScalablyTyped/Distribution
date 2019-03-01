package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomApplication extends js.Object {
  val ApplicationType: mfilesLib.MFilesNs.MFCustomApplicationType
  val ChecksumHash: java.lang.String
  val Description: java.lang.String
  val Enabled: scala.Boolean
  val ID: java.lang.String
  val MasterApplication: java.lang.String
  val Name: java.lang.String
  val Optional: scala.Boolean
  val Publisher: java.lang.String
  val RequireSystemAccess: scala.Boolean
  val Version: java.lang.String
  def Clone(): ICustomApplication
}

object ICustomApplication {
  @scala.inline
  def apply(
    ApplicationType: mfilesLib.MFilesNs.MFCustomApplicationType,
    ChecksumHash: java.lang.String,
    Clone: js.Function0[ICustomApplication],
    Description: java.lang.String,
    Enabled: scala.Boolean,
    ID: java.lang.String,
    MasterApplication: java.lang.String,
    Name: java.lang.String,
    Optional: scala.Boolean,
    Publisher: java.lang.String,
    RequireSystemAccess: scala.Boolean,
    Version: java.lang.String
  ): ICustomApplication = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ApplicationType")(ApplicationType)
    __obj.updateDynamic("ChecksumHash")(ChecksumHash)
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("Description")(Description)
    __obj.updateDynamic("Enabled")(Enabled)
    __obj.updateDynamic("ID")(ID)
    __obj.updateDynamic("MasterApplication")(MasterApplication)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("Optional")(Optional)
    __obj.updateDynamic("Publisher")(Publisher)
    __obj.updateDynamic("RequireSystemAccess")(RequireSystemAccess)
    __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[ICustomApplication]
  }
}

