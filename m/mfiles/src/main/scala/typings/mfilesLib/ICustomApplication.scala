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
    Clone: () => ICustomApplication,
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
    val __obj = js.Dynamic.literal(ApplicationType = ApplicationType, ChecksumHash = ChecksumHash, Clone = js.Any.fromFunction0(Clone), Description = Description, Enabled = Enabled, ID = ID, MasterApplication = MasterApplication, Name = Name, Optional = Optional, Publisher = Publisher, RequireSystemAccess = RequireSystemAccess, Version = Version)
  
    __obj.asInstanceOf[ICustomApplication]
  }
}

