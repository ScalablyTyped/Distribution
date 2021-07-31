package typings.mfiles.global.MFiles

import typings.mfiles.ICustomApplication
import typings.mfiles.ICustomApplications
import typings.mfiles.IFileDownloadSession
import typings.mfiles.IVaultCustomApplicationManagementOperations
import typings.mfiles.MFiles.MFExtApplicationPlatform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.VaultCustomApplicationManagementOperations")
@js.native
class VaultCustomApplicationManagementOperations ()
  extends StObject
     with IVaultCustomApplicationManagementOperations {
  
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
