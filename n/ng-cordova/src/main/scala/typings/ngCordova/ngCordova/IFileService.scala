package typings.ngCordova.ngCordova

import typings.angular.mod.IPromise
import typings.cordovaPluginFile.DirectoryEntry
import typings.cordovaPluginFile.FileEntry
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.EventTarget
import typings.std.ProgressEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFileService extends js.Object {
  
  def checkDir(path: String, directory: String): IFilePromise[DirectoryEntry] = js.native
  
  def checkFile(path: String, file: String): IFilePromise[FileEntry] = js.native
  
  def copyDir(path: String, directory: String, newPath: String): IFilePromise[DirectoryEntry] = js.native
  def copyDir(path: String, directory: String, newPath: String, newDirectory: String): IFilePromise[DirectoryEntry] = js.native
  
  def copyFile(path: String, file: String, newPath: String): IFilePromise[FileEntry] = js.native
  def copyFile(path: String, file: String, newPath: String, newFile: String): IFilePromise[FileEntry] = js.native
  
  def createDir(path: String, directory: String): IFilePromise[DirectoryEntry] = js.native
  def createDir(path: String, directory: String, replace: Boolean): IFilePromise[DirectoryEntry] = js.native
  
  def createFile(path: String, file: String): IFilePromise[FileEntry] = js.native
  def createFile(path: String, file: String, replace: Boolean): IFilePromise[FileEntry] = js.native
  
  def getFreeDiskSpace(): IFilePromise[Double] = js.native
  
  def moveDir(path: String, directory: String, newPath: String): IFilePromise[DirectoryEntry] = js.native
  def moveDir(path: String, directory: String, newPath: String, newDirectory: String): IFilePromise[DirectoryEntry] = js.native
  
  def moveFile(path: String, file: String, newPath: String): IFilePromise[FileEntry] = js.native
  def moveFile(path: String, file: String, newPath: String, newFile: String): IFilePromise[FileEntry] = js.native
  
  def readAsArrayBuffer(path: String, file: String): IPromise[ArrayBuffer] = js.native
  
  def readAsBinaryString(path: String, file: String): IPromise[String] = js.native
  
  def readAsDataURL(path: String, file: String): IPromise[String] = js.native
  
  def readAsText(path: String, file: String): IPromise[String] = js.native
  
  def removeDir(path: String, directory: String): IFilePromise[IFileRemoveResult[DirectoryEntry]] = js.native
  
  def removeFile(path: String, file: String): IFilePromise[IFileRemoveResult[FileEntry]] = js.native
  
  def removeRecursively(path: String, directory: String): IFilePromise[IFileRemoveResult[DirectoryEntry]] = js.native
  
  def writeExistingFile(path: String, file: String, text: String): IFilePromise[ProgressEvent[EventTarget]] = js.native
  def writeExistingFile(path: String, file: String, text: Blob): IFilePromise[ProgressEvent[EventTarget]] = js.native
  
  def writeFile(path: String, file: String, text: String): IFilePromise[ProgressEvent[EventTarget]] = js.native
  def writeFile(path: String, file: String, text: String, replace: Boolean): IFilePromise[ProgressEvent[EventTarget]] = js.native
  def writeFile(path: String, file: String, text: Blob): IFilePromise[ProgressEvent[EventTarget]] = js.native
  def writeFile(path: String, file: String, text: Blob, replace: Boolean): IFilePromise[ProgressEvent[EventTarget]] = js.native
}
