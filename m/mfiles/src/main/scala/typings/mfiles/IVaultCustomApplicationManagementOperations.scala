package typings.mfiles

import typings.mfiles.MFiles.MFExtApplicationPlatform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultCustomApplicationManagementOperations extends js.Object {
  def DownloadCustomApplicationBlock(DownloadID: Double, BlockSize: Double, Offset: Double): js.Array[Double]
  def DownloadCustomApplicationBlockBegin(ApplicationID: String): IFileDownloadSession
  def DownloadCustomApplicationBlockBegin_32bit(ApplicationID: String): IFileDownloadSession
  def DownloadCustomApplicationBlock_32bit(DownloadID: Double, BlockSize: Double, Offset: Double): js.Array[Double]
  def EnableCustomApplication(ApplicationID: String, Enabled: Boolean): Unit
  def GetCustomApplication(ApplicationID: String): ICustomApplication
  def GetCustomApplications(): ICustomApplications
  def GetCustomApplicationsEx(Platform: MFExtApplicationPlatform): ICustomApplications
  def InstallCustomApplication(File: String): Unit
  def UninstallCustomApplication(ApplicationID: String): Unit
}

object IVaultCustomApplicationManagementOperations {
  @scala.inline
  def apply(
    DownloadCustomApplicationBlock: (Double, Double, Double) => js.Array[Double],
    DownloadCustomApplicationBlockBegin: String => IFileDownloadSession,
    DownloadCustomApplicationBlockBegin_32bit: String => IFileDownloadSession,
    DownloadCustomApplicationBlock_32bit: (Double, Double, Double) => js.Array[Double],
    EnableCustomApplication: (String, Boolean) => Unit,
    GetCustomApplication: String => ICustomApplication,
    GetCustomApplications: () => ICustomApplications,
    GetCustomApplicationsEx: MFExtApplicationPlatform => ICustomApplications,
    InstallCustomApplication: String => Unit,
    UninstallCustomApplication: String => Unit
  ): IVaultCustomApplicationManagementOperations = {
    val __obj = js.Dynamic.literal(DownloadCustomApplicationBlock = js.Any.fromFunction3(DownloadCustomApplicationBlock), DownloadCustomApplicationBlockBegin = js.Any.fromFunction1(DownloadCustomApplicationBlockBegin), DownloadCustomApplicationBlockBegin_32bit = js.Any.fromFunction1(DownloadCustomApplicationBlockBegin_32bit), DownloadCustomApplicationBlock_32bit = js.Any.fromFunction3(DownloadCustomApplicationBlock_32bit), EnableCustomApplication = js.Any.fromFunction2(EnableCustomApplication), GetCustomApplication = js.Any.fromFunction1(GetCustomApplication), GetCustomApplications = js.Any.fromFunction0(GetCustomApplications), GetCustomApplicationsEx = js.Any.fromFunction1(GetCustomApplicationsEx), InstallCustomApplication = js.Any.fromFunction1(InstallCustomApplication), UninstallCustomApplication = js.Any.fromFunction1(UninstallCustomApplication))
    __obj.asInstanceOf[IVaultCustomApplicationManagementOperations]
  }
}

