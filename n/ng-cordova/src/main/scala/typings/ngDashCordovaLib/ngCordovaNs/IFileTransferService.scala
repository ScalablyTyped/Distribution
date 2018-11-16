package typings
package ngDashCordovaLib.ngCordovaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFileTransferService extends js.Object {
  def download(url: java.lang.String, filePath: java.lang.String): IFileTransferPromise[cordovaDashPluginDashFileLib.FileEntry] = js.native
  def download(url: java.lang.String, filePath: java.lang.String, options: IFileDownloadOptions): IFileTransferPromise[cordovaDashPluginDashFileLib.FileEntry] = js.native
  def download(
    url: java.lang.String,
    filePath: java.lang.String,
    options: IFileDownloadOptions,
    trustAllHosts: scala.Boolean
  ): IFileTransferPromise[cordovaDashPluginDashFileLib.FileEntry] = js.native
  def upload(url: java.lang.String, filePath: java.lang.String): IFileTransferPromise[cordovaDashPluginDashFileDashTransferLib.FileUploadResult] = js.native
  def upload(url: java.lang.String, filePath: java.lang.String, options: IFileUploadOptions): IFileTransferPromise[cordovaDashPluginDashFileDashTransferLib.FileUploadResult] = js.native
  def upload(
    url: java.lang.String,
    filePath: java.lang.String,
    options: IFileUploadOptions,
    trustAllHosts: scala.Boolean
  ): IFileTransferPromise[cordovaDashPluginDashFileDashTransferLib.FileUploadResult] = js.native
}

