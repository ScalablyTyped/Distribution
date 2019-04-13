package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.VaultCustomApplicationManagementOperations")
@js.native
class VaultCustomApplicationManagementOperations ()
  extends mfilesLib.IVaultCustomApplicationManagementOperations {
  /* CompleteClass */
  override def DownloadCustomApplicationBlock(DownloadID: scala.Double, BlockSize: scala.Double, Offset: scala.Double): js.Array[scala.Double] = js.native
  /* CompleteClass */
  override def DownloadCustomApplicationBlockBegin(ApplicationID: java.lang.String): mfilesLib.IFileDownloadSession = js.native
  /* CompleteClass */
  override def DownloadCustomApplicationBlockBegin_32bit(ApplicationID: java.lang.String): mfilesLib.IFileDownloadSession = js.native
  /* CompleteClass */
  override def DownloadCustomApplicationBlock_32bit(DownloadID: scala.Double, BlockSize: scala.Double, Offset: scala.Double): js.Array[scala.Double] = js.native
  /* CompleteClass */
  override def EnableCustomApplication(ApplicationID: java.lang.String, Enabled: scala.Boolean): scala.Unit = js.native
  /* CompleteClass */
  override def GetCustomApplication(ApplicationID: java.lang.String): mfilesLib.ICustomApplication = js.native
  /* CompleteClass */
  override def GetCustomApplications(): mfilesLib.ICustomApplications = js.native
  /* CompleteClass */
  override def GetCustomApplicationsEx(Platform: MFExtApplicationPlatform): mfilesLib.ICustomApplications = js.native
  /* CompleteClass */
  override def InstallCustomApplication(File: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def UninstallCustomApplication(ApplicationID: java.lang.String): scala.Unit = js.native
}

@JSGlobal("MFiles.VaultCustomApplicationManagementOperations")
@js.native
object VaultCustomApplicationManagementOperations
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IVaultCustomApplicationManagementOperations]

