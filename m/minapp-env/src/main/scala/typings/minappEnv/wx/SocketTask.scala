package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocketTask extends js.Object {
  /** [SocketTask.close(Object object)](SocketTask.close.md)
    *
    * 关闭 WebSocket 连接 */
  def close(option: CloseOption): Unit = js.native
  /** [SocketTask.onClose(function callback)](SocketTask.onClose.md)
    *
    * 监听 WebSocket 连接关闭事件 */
  def onClose(/** WebSocket 连接关闭事件的回调函数 */
  callback: OnCloseCallback): Unit = js.native
  /** [SocketTask.onError(function callback)](SocketTask.onError.md)
    *
    * 监听 WebSocket 错误事件 */
  def onError(/** WebSocket 错误事件的回调函数 */
  callback: SocketTaskOnErrorCallback): Unit = js.native
  /** [SocketTask.onMessage(function callback)](SocketTask.onMessage.md)
    *
    * 监听 WebSocket 接受到服务器的消息事件 */
  def onMessage(/** WebSocket 接受到服务器的消息事件的回调函数 */
  callback: SocketTaskOnMessageCallback): Unit = js.native
  /** [SocketTask.onOpen(function callback)](SocketTask.onOpen.md)
    *
    * 监听 WebSocket 连接打开事件 */
  def onOpen(/** WebSocket 连接打开事件的回调函数 */
  callback: OnOpenCallback): Unit = js.native
  /** [SocketTask.send(Object object)](SocketTask.send.md)
    *
    * 通过 WebSocket 连接发送数据 */
  def send(option: SendOption): Unit = js.native
}

object SocketTask {
  @scala.inline
  def apply(
    close: CloseOption => Unit,
    onClose: OnCloseCallback => Unit,
    onError: SocketTaskOnErrorCallback => Unit,
    onMessage: SocketTaskOnMessageCallback => Unit,
    onOpen: OnOpenCallback => Unit,
    send: SendOption => Unit
  ): SocketTask = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close), onClose = js.Any.fromFunction1(onClose), onError = js.Any.fromFunction1(onError), onMessage = js.Any.fromFunction1(onMessage), onOpen = js.Any.fromFunction1(onOpen), send = js.Any.fromFunction1(send))
    __obj.asInstanceOf[SocketTask]
  }
  @scala.inline
  implicit class SocketTaskOps[Self <: SocketTask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClose(value: CloseOption => Unit): Self = this.set("close", js.Any.fromFunction1(value))
    @scala.inline
    def setOnClose(value: OnCloseCallback => Unit): Self = this.set("onClose", js.Any.fromFunction1(value))
    @scala.inline
    def setOnError(value: SocketTaskOnErrorCallback => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def setOnMessage(value: SocketTaskOnMessageCallback => Unit): Self = this.set("onMessage", js.Any.fromFunction1(value))
    @scala.inline
    def setOnOpen(value: OnOpenCallback => Unit): Self = this.set("onOpen", js.Any.fromFunction1(value))
    @scala.inline
    def setSend(value: SendOption => Unit): Self = this.set("send", js.Any.fromFunction1(value))
  }
  
}

