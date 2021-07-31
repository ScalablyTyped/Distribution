package typings.ngCordova.ngCordova

import typings.cordovaPluginFile.FileEntry
import typings.cordovaPluginFileTransfer.FileUploadResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFileTransferService extends StObject {
  
  def download(url: String, filePath: String): IFileTransferPromise[FileEntry] = js.native
  def download(url: String, filePath: String, options: Unit, trustAllHosts: Boolean): IFileTransferPromise[FileEntry] = js.native
  def download(url: String, filePath: String, options: IFileDownloadOptions): IFileTransferPromise[FileEntry] = js.native
  def download(url: String, filePath: String, options: IFileDownloadOptions, trustAllHosts: Boolean): IFileTransferPromise[FileEntry] = js.native
  
  def upload(url: String, filePath: String): IFileTransferPromise[FileUploadResult] = js.native
  def upload(url: String, filePath: String, options: Unit, trustAllHosts: Boolean): IFileTransferPromise[FileUploadResult] = js.native
  def upload(url: String, filePath: String, options: IFileUploadOptions): IFileTransferPromise[FileUploadResult] = js.native
  def upload(url: String, filePath: String, options: IFileUploadOptions, trustAllHosts: Boolean): IFileTransferPromise[FileUploadResult] = js.native
}
