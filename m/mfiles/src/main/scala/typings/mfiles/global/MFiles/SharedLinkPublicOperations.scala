package typings.mfiles.global.MFiles

import typings.mfiles.IFileDownloadSession
import typings.mfiles.INamedValues
import typings.mfiles.ISharedFileInfo
import typings.mfiles.ISharedLinkPublicOperations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.SharedLinkPublicOperations")
@js.native
class SharedLinkPublicOperations ()
  extends StObject
     with ISharedLinkPublicOperations {
  
  /* CompleteClass */
  override def DownloadSharedFileInBlocks_Begin(VaultGUID: String, AccessKey: String, AdditionalData: INamedValues): IFileDownloadSession = js.native
  
  /* CompleteClass */
  override def DownloadSharedFileInBlocks_Begin_32bit(VaultGUID: String, AccessKey: String, AdditionalData: INamedValues): IFileDownloadSession = js.native
  
  /* CompleteClass */
  override def DownloadSharedFileInBlocks_ReadBlock(VaultGUID: String, AccessKey: String, DownloadID: Double, BlockSize: Double, Offset: Double): js.Array[Double] = js.native
  
  /* CompleteClass */
  override def DownloadSharedFileInBlocks_ReadBlock_32bit(VaultGUID: String, AccessKey: String, DownloadID: Double, BlockSize: Double, Offset: Double): js.Array[Double] = js.native
  
  /* CompleteClass */
  override def GetSharedLinkInfo(VaultGUID: String, AccessKey: String, AdditionalData: INamedValues): ISharedFileInfo = js.native
}
