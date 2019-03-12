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
    DownloadCustomApplicationBlock: (scala.Double, scala.Double, scala.Double) => js.Array[scala.Double],
    DownloadCustomApplicationBlockBegin: java.lang.String => IFileDownloadSession,
    DownloadCustomApplicationBlockBegin_32bit: java.lang.String => IFileDownloadSession,
    DownloadCustomApplicationBlock_32bit: (scala.Double, scala.Double, scala.Double) => js.Array[scala.Double],
    EnableCustomApplication: (java.lang.String, scala.Boolean) => scala.Unit,
    GetCustomApplication: java.lang.String => ICustomApplication,
    GetCustomApplications: () => ICustomApplications,
    GetCustomApplicationsEx: mfilesLib.MFilesNs.MFExtApplicationPlatform => ICustomApplications,
    InstallCustomApplication: java.lang.String => scala.Unit,
    UninstallCustomApplication: java.lang.String => scala.Unit
  ): IVaultCustomApplicationManagementOperations = {
    val __obj = js.Dynamic.literal(DownloadCustomApplicationBlock = js.Any.fromFunction3(DownloadCustomApplicationBlock), DownloadCustomApplicationBlockBegin = js.Any.fromFunction1(DownloadCustomApplicationBlockBegin), DownloadCustomApplicationBlockBegin_32bit = js.Any.fromFunction1(DownloadCustomApplicationBlockBegin_32bit), DownloadCustomApplicationBlock_32bit = js.Any.fromFunction3(DownloadCustomApplicationBlock_32bit), EnableCustomApplication = js.Any.fromFunction2(EnableCustomApplication), GetCustomApplication = js.Any.fromFunction1(GetCustomApplication), GetCustomApplications = js.Any.fromFunction0(GetCustomApplications), GetCustomApplicationsEx = js.Any.fromFunction1(GetCustomApplicationsEx), InstallCustomApplication = js.Any.fromFunction1(InstallCustomApplication), UninstallCustomApplication = js.Any.fromFunction1(UninstallCustomApplication))
  
    __obj.asInstanceOf[IVaultCustomApplicationManagementOperations]
  }
}

