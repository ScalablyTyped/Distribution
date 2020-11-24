package typings.minappEnv.anon

import typings.minappEnv.ICloud.CallFunctionParam
import typings.minappEnv.ICloud.CallFunctionResult
import typings.minappEnv.ICloud.DeleteFileParam
import typings.minappEnv.ICloud.DeleteFileResult
import typings.minappEnv.ICloud.DownloadFileParam
import typings.minappEnv.ICloud.DownloadFileResult
import typings.minappEnv.ICloud.GetTempFileURLParam
import typings.minappEnv.ICloud.GetTempFileURLResult
import typings.minappEnv.ICloud.UploadFileParam
import typings.minappEnv.ICloud.UploadFileResult
import typings.minappEnv.ICloudConfig
import typings.minappEnv.OQ
import typings.minappEnv.Promise
import typings.minappEnv.WXNS.IDownloadFileTask
import typings.minappEnv.WXNS.IUploadFileTask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallFunction extends js.Object {
  
  // callFunction: (param: ICloud.CallFunctionParam) => Promise<ICloud.CallFunctionResult> | void,
  // uploadFile: (param: ICloud.UploadFileParam) => Promise<ICloud.UploadFileResult> | WXNS.IUploadFileTask,
  // downloadFile: (param: ICloud.DownloadFileParam) => Promise<ICloud.DownloadFileResult> | WXNS.IDownloadFileTask,
  // getTempFileURL: (param: ICloud.GetTempFileURLParam) => Promise<ICloud.GetTempFileURLResult> | void,
  // deleteFile: (param: ICloud.DeleteFileParam) => Promise<ICloud.DeleteFileResult> | void,
  def callFunction(param: OQ[CallFunctionParam]): Unit = js.native
  def callFunction(param: RQCallFunctionParam): Promise[CallFunctionResult] = js.native
  
  def database(): typings.minappEnv.DB.Database = js.native
  def database(config: ICloudConfig): typings.minappEnv.DB.Database = js.native
  
  def deleteFile(param: OQ[DeleteFileParam]): Unit = js.native
  def deleteFile(param: RQDeleteFileParam): Promise[DeleteFileResult] = js.native
  
  def downloadFile(param: OQ[DownloadFileParam]): IDownloadFileTask = js.native
  def downloadFile(param: RQDownloadFileParam): Promise[DownloadFileResult] = js.native
  
  def getTempFileURL(param: OQ[GetTempFileURLParam]): Unit = js.native
  def getTempFileURL(param: RQGetTempFileURLParam): Promise[GetTempFileURLResult] = js.native
  
  def init(): Unit = js.native
  def init(config: ICloudConfig): Unit = js.native
  
  def uploadFile(param: OQ[UploadFileParam]): IUploadFileTask = js.native
  def uploadFile(param: RQUploadFileParam): Promise[UploadFileResult] = js.native
}
