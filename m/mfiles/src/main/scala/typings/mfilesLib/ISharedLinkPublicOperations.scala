package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ISharedLinkPublicOperations extends js.Object {
  def DownloadSharedFileInBlocks_Begin(VaultGUID: java.lang.String, AccessKey: java.lang.String, AdditionalData: INamedValues): IFileDownloadSession
  def DownloadSharedFileInBlocks_Begin_32bit(VaultGUID: java.lang.String, AccessKey: java.lang.String, AdditionalData: INamedValues): IFileDownloadSession
  def DownloadSharedFileInBlocks_ReadBlock(
    VaultGUID: java.lang.String,
    AccessKey: java.lang.String,
    DownloadID: scala.Double,
    BlockSize: scala.Double,
    Offset: scala.Double
  ): js.Array[scala.Double]
  def DownloadSharedFileInBlocks_ReadBlock_32bit(
    VaultGUID: java.lang.String,
    AccessKey: java.lang.String,
    DownloadID: scala.Double,
    BlockSize: scala.Double,
    Offset: scala.Double
  ): js.Array[scala.Double]
  def GetSharedLinkInfo(VaultGUID: java.lang.String, AccessKey: java.lang.String, AdditionalData: INamedValues): ISharedFileInfo
}

