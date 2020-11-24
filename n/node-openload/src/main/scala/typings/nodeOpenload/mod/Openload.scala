package typings.nodeOpenload.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Openload base class, contains all the supported endpoints as member functions
  */
@js.native
trait Openload extends js.Object {
  
  var _config: OpenloadConfig = js.native
  
  var _locationPrefix: String = js.native
  
  var _version: Double = js.native
  
  // TypeScript Version: 3.6
  def config: OpenloadConfig = js.native
  // TypeScript Version: 3.6
  def config_=(`object`: OpenloadConfig): Unit = js.native
  
  def deleteFile(file: String): js.Promise[js.Array[Boolean]] = js.native
  def deleteFile(file: js.Array[String]): js.Promise[js.Array[Boolean]] = js.native
  
  def getAccountInfo(): js.Promise[AccountInfo] = js.native
  
  def getDownload(file: String): js.Promise[DownloadLink] = js.native
  
  def getDownloadLink(obj: DownloadLinkParam): js.Promise[DownloadLink] = js.native
  
  def getDownloadTicket(file: String): js.Promise[DownloadTicket] = js.native
  
  def getFileInfo(file: String): js.Promise[FileInfo] = js.native
  
  def getFolder(folder: String): js.Promise[ListFolder] = js.native
  
  def getSplashImage(file: String): js.Promise[String] = js.native
  
  def listFolder(folder: String): js.Promise[ListFolder] = js.native
  
  // TypeScript Version: 3.6
  def locationPrefix: String = js.native
  
  def remoteUpload(obj: RemoteUploadParam): js.Promise[RemoteUpload] = js.native
  
  def remoteUploadStatus(obj: RemoteUploadStatusParam): js.Promise[RemoteUploadStatus] = js.native
  
  def upload(obj: UploadParam, cb: js.Function1[/* progress */ UploadProgress, Unit]): js.Promise[Upload] = js.native
}
