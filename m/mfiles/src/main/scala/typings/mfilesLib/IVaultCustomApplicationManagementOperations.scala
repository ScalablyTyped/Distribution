package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultCustomApplicationManagementOperations extends js.Object {
  def DownloadCustomApplicationBlock(DownloadID: scala.Double, BlockSize: scala.Double, Offset: scala.Double): js.Array[scala.Double]
  def DownloadCustomApplicationBlockBegin(ApplicationID: java.lang.String): IFileDownloadSession
  def DownloadCustomApplicationBlockBegin_32bit(ApplicationID: java.lang.String): IFileDownloadSession
  def DownloadCustomApplicationBlock_32bit(DownloadID: scala.Double, BlockSize: scala.Double, Offset: scala.Double): js.Array[scala.Double]
  def EnableCustomApplication(ApplicationID: java.lang.String, Enabled: scala.Boolean): scala.Unit
  def GetCustomApplication(ApplicationID: java.lang.String): ICustomApplication
  def GetCustomApplications(): ICustomApplications
  def GetCustomApplicationsEx(Platform: mfilesLib.MFilesNs.MFExtApplicationPlatform): ICustomApplications
  def InstallCustomApplication(File: java.lang.String): scala.Unit
  def UninstallCustomApplication(ApplicationID: java.lang.String): scala.Unit
}

object IVaultCustomApplicationManagementOperations {
  @scala.inline
  def apply(
    DownloadCustomApplicationBlock: js.Function3[scala.Double, scala.Double, scala.Double, js.Array[scala.Double]],
    DownloadCustomApplicationBlockBegin: js.Function1[java.lang.String, IFileDownloadSession],
    DownloadCustomApplicationBlockBegin_32bit: js.Function1[java.lang.String, IFileDownloadSession],
    DownloadCustomApplicationBlock_32bit: js.Function3[scala.Double, scala.Double, scala.Double, js.Array[scala.Double]],
    EnableCustomApplication: js.Function2[java.lang.String, scala.Boolean, scala.Unit],
    GetCustomApplication: js.Function1[java.lang.String, ICustomApplication],
    GetCustomApplications: js.Function0[ICustomApplications],
    GetCustomApplicationsEx: js.Function1[mfilesLib.MFilesNs.MFExtApplicationPlatform, ICustomApplications],
    InstallCustomApplication: js.Function1[java.lang.String, scala.Unit],
    UninstallCustomApplication: js.Function1[java.lang.String, scala.Unit]
  ): IVaultCustomApplicationManagementOperations = {
    val __obj = js.Dynamic.literal(DownloadCustomApplicationBlock = DownloadCustomApplicationBlock, DownloadCustomApplicationBlockBegin = DownloadCustomApplicationBlockBegin, DownloadCustomApplicationBlockBegin_32bit = DownloadCustomApplicationBlockBegin_32bit, DownloadCustomApplicationBlock_32bit = DownloadCustomApplicationBlock_32bit, EnableCustomApplication = EnableCustomApplication, GetCustomApplication = GetCustomApplication, GetCustomApplications = GetCustomApplications, GetCustomApplicationsEx = GetCustomApplicationsEx, InstallCustomApplication = InstallCustomApplication, UninstallCustomApplication = UninstallCustomApplication)
  
    __obj.asInstanceOf[IVaultCustomApplicationManagementOperations]
  }
}

