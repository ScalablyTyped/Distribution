package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// https://novadocs.panic.com/api-reference/language-client/
@js.native
trait LanguageClient extends js.Object {
  val identifier: String = js.native
  val name: String = js.native
  val running: Boolean = js.native
  def onNotification(method: String, callback: js.Function1[/* parameters */ js.Any, Unit]): Unit = js.native
  def onRequest(method: String, callback: js.Function1[/* parameters */ js.Any, _ | js.Promise[_]]): Unit = js.native
  def sendNotification(method: String): Unit = js.native
  def sendNotification(method: String, parameters: js.Any): Unit = js.native
  def sendRequest(method: String): js.Promise[_] = js.native
  def sendRequest(method: String, parameters: js.Any): js.Promise[_] = js.native
  def start(): Unit = js.native
  def stop(): Unit = js.native
}

