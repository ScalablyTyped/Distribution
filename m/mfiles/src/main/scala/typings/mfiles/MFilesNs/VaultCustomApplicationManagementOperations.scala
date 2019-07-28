package typings.mfiles.MFilesNs

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.ICustomApplication
import typings.mfiles.ICustomApplications
import typings.mfiles.IFileDownloadSession
import typings.mfiles.IVaultCustomApplicationManagementOperations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.VaultCustomApplicationManagementOperations")
@js.native
class VaultCustomApplicationManagementOperations () extends IVaultCustomApplicationManagementOperations {
  /* CompleteClass */
  override def DownloadCustomApplicationBlock(DownloadID: Double, BlockSize: Double, Offset: Double): js.Array[Double] = js.native
  /* CompleteClass */
  override def DownloadCustomApplicationBlockBegin(ApplicationID: String): IFileDownloadSession = js.native
  /* CompleteClass */
  override def DownloadCustomApplicationBlockBegin_32bit(ApplicationID: String): IFileDownloadSession = js.native
  /* CompleteClass */
  override def DownloadCustomApplicationBlock_32bit(DownloadID: Double, BlockSize: Double, Offset: Double): js.Array[Double] = js.native
  /* CompleteClass */
  override def EnableCustomApplication(ApplicationID: String, Enabled: Boolean): Unit = js.native
  /* CompleteClass */
  override def GetCustomApplication(ApplicationID: String): ICustomApplication = js.native
  /* CompleteClass */
  override def GetCustomApplications(): ICustomApplications = js.native
  /* CompleteClass */
  override def GetCustomApplicationsEx(Platform: MFExtApplicationPlatform): ICustomApplications = js.native
  /* CompleteClass */
  override def InstallCustomApplication(File: String): Unit = js.native
  /* CompleteClass */
  override def UninstallCustomApplication(ApplicationID: String): Unit = js.native
}

@JSGlobal("MFiles.VaultCustomApplicationManagementOperations")
@js.native
object VaultCustomApplicationManagementOperations extends Instantiable0[IVaultCustomApplicationManagementOperations]

