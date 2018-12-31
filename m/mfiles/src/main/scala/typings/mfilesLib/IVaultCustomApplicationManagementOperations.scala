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

