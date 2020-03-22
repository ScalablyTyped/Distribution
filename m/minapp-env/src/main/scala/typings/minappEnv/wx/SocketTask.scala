package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketTask extends js.Object {
  /** [SocketTask.close(Object object)](SocketTask.close.md)
    *
    * 关闭 WebSocket 连接 */
  def close(option: CloseOption): Unit
  /** [SocketTask.onClose(function callback)](SocketTask.onClose.md)
    *
    * 监听 WebSocket 连接关闭事件 */
  def onClose(/** WebSocket 连接关闭事件的回调函数 */
  callback: OnCloseCallback): Unit
  /** [SocketTask.onError(function callback)](SocketTask.onError.md)
    *
    * 监听 WebSocket 错误事件 */
  def onError(/** WebSocket 错误事件的回调函数 */
  callback: SocketTaskOnErrorCallback): Unit
  /** [SocketTask.onMessage(function callback)](SocketTask.onMessage.md)
    *
    * 监听 WebSocket 接受到服务器的消息事件 */
  def onMessage(/** WebSocket 接受到服务器的消息事件的回调函数 */
  callback: SocketTaskOnMessageCallback): Unit
  /** [SocketTask.onOpen(function callback)](SocketTask.onOpen.md)
    *
    * 监听 WebSocket 连接打开事件 */
  def onOpen(/** WebSocket 连接打开事件的回调函数 */
  callback: OnOpenCallback): Unit
  /** [SocketTask.send(Object object)](SocketTask.send.md)
    *
    * 通过 WebSocket 连接发送数据 */
  def send(option: SendOption): Unit
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
}

