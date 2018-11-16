package typings
package ngDashCordovaLib.ngCordovaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFileService extends js.Object {
  def checkDir(path: java.lang.String, directory: java.lang.String): IFilePromise[cordovaDashPluginDashFileLib.DirectoryEntry] = js.native
  def checkFile(path: java.lang.String, file: java.lang.String): IFilePromise[cordovaDashPluginDashFileLib.FileEntry] = js.native
  def copyDir(path: java.lang.String, directory: java.lang.String, newPath: java.lang.String): IFilePromise[cordovaDashPluginDashFileLib.DirectoryEntry] = js.native
  def copyDir(
    path: java.lang.String,
    directory: java.lang.String,
    newPath: java.lang.String,
    newDirectory: java.lang.String
  ): IFilePromise[cordovaDashPluginDashFileLib.DirectoryEntry] = js.native
  def copyFile(path: java.lang.String, file: java.lang.String, newPath: java.lang.String): IFilePromise[cordovaDashPluginDashFileLib.FileEntry] = js.native
  def copyFile(
    path: java.lang.String,
    file: java.lang.String,
    newPath: java.lang.String,
    newFile: java.lang.String
  ): IFilePromise[cordovaDashPluginDashFileLib.FileEntry] = js.native
  def createDir(path: java.lang.String, directory: java.lang.String): IFilePromise[cordovaDashPluginDashFileLib.DirectoryEntry] = js.native
  def createDir(path: java.lang.String, directory: java.lang.String, replace: scala.Boolean): IFilePromise[cordovaDashPluginDashFileLib.DirectoryEntry] = js.native
  def createFile(path: java.lang.String, file: java.lang.String): IFilePromise[cordovaDashPluginDashFileLib.FileEntry] = js.native
  def createFile(path: java.lang.String, file: java.lang.String, replace: scala.Boolean): IFilePromise[cordovaDashPluginDashFileLib.FileEntry] = js.native
  def getFreeDiskSpace(): IFilePromise[scala.Double] = js.native
  def moveDir(path: java.lang.String, directory: java.lang.String, newPath: java.lang.String): IFilePromise[cordovaDashPluginDashFileLib.DirectoryEntry] = js.native
  def moveDir(
    path: java.lang.String,
    directory: java.lang.String,
    newPath: java.lang.String,
    newDirectory: java.lang.String
  ): IFilePromise[cordovaDashPluginDashFileLib.DirectoryEntry] = js.native
  def moveFile(path: java.lang.String, file: java.lang.String, newPath: java.lang.String): IFilePromise[cordovaDashPluginDashFileLib.FileEntry] = js.native
  def moveFile(
    path: java.lang.String,
    file: java.lang.String,
    newPath: java.lang.String,
    newFile: java.lang.String
  ): IFilePromise[cordovaDashPluginDashFileLib.FileEntry] = js.native
  def readAsArrayBuffer(path: java.lang.String, file: java.lang.String): js.Any = js.native
  def readAsBinaryString(path: java.lang.String, file: java.lang.String): js.Any = js.native
  def readAsDataURL(path: java.lang.String, file: java.lang.String): js.Any = js.native
  def readAsText(path: java.lang.String, file: java.lang.String): js.Any = js.native
  def removeDir(path: java.lang.String, directory: java.lang.String): IFilePromise[IFileRemoveResult[cordovaDashPluginDashFileLib.DirectoryEntry]] = js.native
  def removeFile(path: java.lang.String, file: java.lang.String): IFilePromise[IFileRemoveResult[cordovaDashPluginDashFileLib.FileEntry]] = js.native
  def removeRecursively(path: java.lang.String, directory: java.lang.String): IFilePromise[IFileRemoveResult[cordovaDashPluginDashFileLib.DirectoryEntry]] = js.native
  def writeExistingFile(path: java.lang.String, file: java.lang.String, text: java.lang.String): IFilePromise[stdLib.ProgressEvent] = js.native
  def writeExistingFile(path: java.lang.String, file: java.lang.String, text: stdLib.Blob): IFilePromise[stdLib.ProgressEvent] = js.native
  def writeFile(path: java.lang.String, file: java.lang.String, text: java.lang.String): IFilePromise[stdLib.ProgressEvent] = js.native
  def writeFile(path: java.lang.String, file: java.lang.String, text: java.lang.String, replace: scala.Boolean): IFilePromise[stdLib.ProgressEvent] = js.native
  def writeFile(path: java.lang.String, file: java.lang.String, text: stdLib.Blob): IFilePromise[stdLib.ProgressEvent] = js.native
  def writeFile(path: java.lang.String, file: java.lang.String, text: stdLib.Blob, replace: scala.Boolean): IFilePromise[stdLib.ProgressEvent] = js.native
}

