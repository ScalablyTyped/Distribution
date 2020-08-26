package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISharedLinkPublicOperations extends js.Object {
  def DownloadSharedFileInBlocks_Begin(VaultGUID: String, AccessKey: String, AdditionalData: INamedValues): IFileDownloadSession = js.native
  def DownloadSharedFileInBlocks_Begin_32bit(VaultGUID: String, AccessKey: String, AdditionalData: INamedValues): IFileDownloadSession = js.native
  def DownloadSharedFileInBlocks_ReadBlock(VaultGUID: String, AccessKey: String, DownloadID: Double, BlockSize: Double, Offset: Double): js.Array[Double] = js.native
  def DownloadSharedFileInBlocks_ReadBlock_32bit(VaultGUID: String, AccessKey: String, DownloadID: Double, BlockSize: Double, Offset: Double): js.Array[Double] = js.native
  def GetSharedLinkInfo(VaultGUID: String, AccessKey: String, AdditionalData: INamedValues): ISharedFileInfo = js.native
}

object ISharedLinkPublicOperations {
  @scala.inline
  def apply(
    DownloadSharedFileInBlocks_Begin: (String, String, INamedValues) => IFileDownloadSession,
    DownloadSharedFileInBlocks_Begin_32bit: (String, String, INamedValues) => IFileDownloadSession,
    DownloadSharedFileInBlocks_ReadBlock: (String, String, Double, Double, Double) => js.Array[Double],
    DownloadSharedFileInBlocks_ReadBlock_32bit: (String, String, Double, Double, Double) => js.Array[Double],
    GetSharedLinkInfo: (String, String, INamedValues) => ISharedFileInfo
  ): ISharedLinkPublicOperations = {
    val __obj = js.Dynamic.literal(DownloadSharedFileInBlocks_Begin = js.Any.fromFunction3(DownloadSharedFileInBlocks_Begin), DownloadSharedFileInBlocks_Begin_32bit = js.Any.fromFunction3(DownloadSharedFileInBlocks_Begin_32bit), DownloadSharedFileInBlocks_ReadBlock = js.Any.fromFunction5(DownloadSharedFileInBlocks_ReadBlock), DownloadSharedFileInBlocks_ReadBlock_32bit = js.Any.fromFunction5(DownloadSharedFileInBlocks_ReadBlock_32bit), GetSharedLinkInfo = js.Any.fromFunction3(GetSharedLinkInfo))
    __obj.asInstanceOf[ISharedLinkPublicOperations]
  }
  @scala.inline
  implicit class ISharedLinkPublicOperationsOps[Self <: ISharedLinkPublicOperations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDownloadSharedFileInBlocks_Begin(value: (String, String, INamedValues) => IFileDownloadSession): Self = this.set("DownloadSharedFileInBlocks_Begin", js.Any.fromFunction3(value))
    @scala.inline
    def setDownloadSharedFileInBlocks_Begin_32bit(value: (String, String, INamedValues) => IFileDownloadSession): Self = this.set("DownloadSharedFileInBlocks_Begin_32bit", js.Any.fromFunction3(value))
    @scala.inline
    def setDownloadSharedFileInBlocks_ReadBlock(value: (String, String, Double, Double, Double) => js.Array[Double]): Self = this.set("DownloadSharedFileInBlocks_ReadBlock", js.Any.fromFunction5(value))
    @scala.inline
    def setDownloadSharedFileInBlocks_ReadBlock_32bit(value: (String, String, Double, Double, Double) => js.Array[Double]): Self = this.set("DownloadSharedFileInBlocks_ReadBlock_32bit", js.Any.fromFunction5(value))
    @scala.inline
    def setGetSharedLinkInfo(value: (String, String, INamedValues) => ISharedFileInfo): Self = this.set("GetSharedLinkInfo", js.Any.fromFunction3(value))
  }
  
}

