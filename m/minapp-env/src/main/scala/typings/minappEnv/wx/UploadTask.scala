package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadTask extends StObject {
  
  /** [UploadTask.abort()](UploadTask.abort.md)
    *
    * 中断上传任务
    *
    * 最低基础库： `1.4.0` */
  def abort(): Unit
  
  /** [UploadTask.offHeadersReceived(function callback)](UploadTask.offHeadersReceived.md)
    *
    * 取消监听 HTTP Response Header 事件
    *
    * 最低基础库： `2.1.0` */
  def offHeadersReceived(/** HTTP Response Header 事件的回调函数 */
  callback: UploadTaskOffHeadersReceivedCallback): Unit
  
  /** [UploadTask.offProgressUpdate(function callback)](UploadTask.offProgressUpdate.md)
    *
    * 取消监听上传进度变化事件
    *
    * 最低基础库： `2.1.0` */
  def offProgressUpdate(/** 上传进度变化事件的回调函数 */
  callback: UploadTaskOffProgressUpdateCallback): Unit
  
  /** [UploadTask.onHeadersReceived(function callback)](UploadTask.onHeadersReceived.md)
    *
    * 监听 HTTP Response Header 事件。会比请求完成事件更早
    *
    * 最低基础库： `2.1.0` */
  def onHeadersReceived(/** HTTP Response Header 事件的回调函数 */
  callback: UploadTaskOnHeadersReceivedCallback): Unit
  
  /** [UploadTask.onProgressUpdate(function callback)](UploadTask.onProgressUpdate.md)
    *
    * 监听上传进度变化事件
    *
    * 最低基础库： `1.4.0` */
  def onProgressUpdate(/** 上传进度变化事件的回调函数 */
  callback: UploadTaskOnProgressUpdateCallback): Unit
}
object UploadTask {
  
  inline def apply(
    abort: () => Unit,
    offHeadersReceived: UploadTaskOffHeadersReceivedCallback => Unit,
    offProgressUpdate: UploadTaskOffProgressUpdateCallback => Unit,
    onHeadersReceived: UploadTaskOnHeadersReceivedCallback => Unit,
    onProgressUpdate: UploadTaskOnProgressUpdateCallback => Unit
  ): UploadTask = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), offHeadersReceived = js.Any.fromFunction1(offHeadersReceived), offProgressUpdate = js.Any.fromFunction1(offProgressUpdate), onHeadersReceived = js.Any.fromFunction1(onHeadersReceived), onProgressUpdate = js.Any.fromFunction1(onProgressUpdate))
    __obj.asInstanceOf[UploadTask]
  }
  
  extension [Self <: UploadTask](x: Self) {
    
    inline def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
    
    inline def setOffHeadersReceived(value: UploadTaskOffHeadersReceivedCallback => Unit): Self = StObject.set(x, "offHeadersReceived", js.Any.fromFunction1(value))
    
    inline def setOffProgressUpdate(value: UploadTaskOffProgressUpdateCallback => Unit): Self = StObject.set(x, "offProgressUpdate", js.Any.fromFunction1(value))
    
    inline def setOnHeadersReceived(value: UploadTaskOnHeadersReceivedCallback => Unit): Self = StObject.set(x, "onHeadersReceived", js.Any.fromFunction1(value))
    
    inline def setOnProgressUpdate(value: UploadTaskOnProgressUpdateCallback => Unit): Self = StObject.set(x, "onProgressUpdate", js.Any.fromFunction1(value))
  }
}
