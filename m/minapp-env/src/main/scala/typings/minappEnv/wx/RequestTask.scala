package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestTask extends js.Object {
  /** [RequestTask.abort()](RequestTask.abort.md)
    *
    * 中断请求任务
    *
    * 最低基础库： `1.4.0` */
  def abort(): Unit
  /** [RequestTask.offHeadersReceived(function callback)](RequestTask.offHeadersReceived.md)
    *
    * 取消监听 HTTP Response Header 事件
    *
    * 最低基础库： `2.1.0` */
  def offHeadersReceived(/** HTTP Response Header 事件的回调函数 */
  callback: RequestTaskOffHeadersReceivedCallback): Unit
  /** [RequestTask.onHeadersReceived(function callback)](RequestTask.onHeadersReceived.md)
    *
    * 监听 HTTP Response Header 事件。会比请求完成事件更早
    *
    * 最低基础库： `2.1.0` */
  def onHeadersReceived(/** HTTP Response Header 事件的回调函数 */
  callback: RequestTaskOnHeadersReceivedCallback): Unit
}

object RequestTask {
  @scala.inline
  def apply(
    abort: () => Unit,
    offHeadersReceived: RequestTaskOffHeadersReceivedCallback => Unit,
    onHeadersReceived: RequestTaskOnHeadersReceivedCallback => Unit
  ): RequestTask = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), offHeadersReceived = js.Any.fromFunction1(offHeadersReceived), onHeadersReceived = js.Any.fromFunction1(onHeadersReceived))
  
    __obj.asInstanceOf[RequestTask]
  }
}

