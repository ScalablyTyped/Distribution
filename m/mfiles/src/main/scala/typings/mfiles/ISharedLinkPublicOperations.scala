package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISharedLinkPublicOperations extends StObject {
  
  def DownloadSharedFileInBlocks_Begin(VaultGUID: String, AccessKey: String, AdditionalData: INamedValues): IFileDownloadSession
  
  def DownloadSharedFileInBlocks_Begin_32bit(VaultGUID: String, AccessKey: String, AdditionalData: INamedValues): IFileDownloadSession
  
  def DownloadSharedFileInBlocks_ReadBlock(VaultGUID: String, AccessKey: String, DownloadID: Double, BlockSize: Double, Offset: Double): js.Array[Double]
  
  def DownloadSharedFileInBlocks_ReadBlock_32bit(VaultGUID: String, AccessKey: String, DownloadID: Double, BlockSize: Double, Offset: Double): js.Array[Double]
  
  def GetSharedLinkInfo(VaultGUID: String, AccessKey: String, AdditionalData: INamedValues): ISharedFileInfo
}
object ISharedLinkPublicOperations {
  
  inline def apply(
    DownloadSharedFileInBlocks_Begin: (String, String, INamedValues) => IFileDownloadSession,
    DownloadSharedFileInBlocks_Begin_32bit: (String, String, INamedValues) => IFileDownloadSession,
    DownloadSharedFileInBlocks_ReadBlock: (String, String, Double, Double, Double) => js.Array[Double],
    DownloadSharedFileInBlocks_ReadBlock_32bit: (String, String, Double, Double, Double) => js.Array[Double],
    GetSharedLinkInfo: (String, String, INamedValues) => ISharedFileInfo
  ): ISharedLinkPublicOperations = {
    val __obj = js.Dynamic.literal(DownloadSharedFileInBlocks_Begin = js.Any.fromFunction3(DownloadSharedFileInBlocks_Begin), DownloadSharedFileInBlocks_Begin_32bit = js.Any.fromFunction3(DownloadSharedFileInBlocks_Begin_32bit), DownloadSharedFileInBlocks_ReadBlock = js.Any.fromFunction5(DownloadSharedFileInBlocks_ReadBlock), DownloadSharedFileInBlocks_ReadBlock_32bit = js.Any.fromFunction5(DownloadSharedFileInBlocks_ReadBlock_32bit), GetSharedLinkInfo = js.Any.fromFunction3(GetSharedLinkInfo))
    __obj.asInstanceOf[ISharedLinkPublicOperations]
  }
  
  extension [Self <: ISharedLinkPublicOperations](x: Self) {
    
    inline def setDownloadSharedFileInBlocks_Begin(value: (String, String, INamedValues) => IFileDownloadSession): Self = StObject.set(x, "DownloadSharedFileInBlocks_Begin", js.Any.fromFunction3(value))
    
    inline def setDownloadSharedFileInBlocks_Begin_32bit(value: (String, String, INamedValues) => IFileDownloadSession): Self = StObject.set(x, "DownloadSharedFileInBlocks_Begin_32bit", js.Any.fromFunction3(value))
    
    inline def setDownloadSharedFileInBlocks_ReadBlock(value: (String, String, Double, Double, Double) => js.Array[Double]): Self = StObject.set(x, "DownloadSharedFileInBlocks_ReadBlock", js.Any.fromFunction5(value))
    
    inline def setDownloadSharedFileInBlocks_ReadBlock_32bit(value: (String, String, Double, Double, Double) => js.Array[Double]): Self = StObject.set(x, "DownloadSharedFileInBlocks_ReadBlock_32bit", js.Any.fromFunction5(value))
    
    inline def setGetSharedLinkInfo(value: (String, String, INamedValues) => ISharedFileInfo): Self = StObject.set(x, "GetSharedLinkInfo", js.Any.fromFunction3(value))
  }
}
