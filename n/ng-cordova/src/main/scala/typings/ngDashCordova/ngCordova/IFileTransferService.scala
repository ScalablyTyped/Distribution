package typings.ngDashCordova.ngCordova

import typings.cordovaDashPluginDashFile.FileEntry
import typings.cordovaDashPluginDashFileDashTransfer.FileUploadResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFileTransferService extends js.Object {
  def download(url: String, filePath: String): IFileTransferPromise[FileEntry] = js.native
  def download(url: String, filePath: String, options: IFileDownloadOptions): IFileTransferPromise[FileEntry] = js.native
  def download(url: String, filePath: String, options: IFileDownloadOptions, trustAllHosts: Boolean): IFileTransferPromise[FileEntry] = js.native
  def upload(url: String, filePath: String): IFileTransferPromise[FileUploadResult] = js.native
  def upload(url: String, filePath: String, options: IFileUploadOptions): IFileTransferPromise[FileUploadResult] = js.native
  def upload(url: String, filePath: String, options: IFileUploadOptions, trustAllHosts: Boolean): IFileTransferPromise[FileUploadResult] = js.native
}

