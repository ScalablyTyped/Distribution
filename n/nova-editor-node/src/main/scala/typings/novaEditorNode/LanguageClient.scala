package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://docs.nova.app/api-reference/language-client/
@js.native
trait LanguageClient extends StObject {
  
  val identifier: String = js.native
  
  val name: String = js.native
  
  def onDidStop[T](callback: js.ThisFunction1[/* this */ T, /* err */ js.UndefOr[js.Error], Unit]): Disposable = js.native
  def onDidStop[T](callback: js.ThisFunction1[/* this */ T, /* err */ js.UndefOr[js.Error], Unit], thisValue: T): Disposable = js.native
  
  def onNotification(method: String, callback: js.Function1[/* parameters */ Any, Unit]): Unit = js.native
  
  def onRequest(method: String, callback: js.Function1[/* parameters */ Any, Any | js.Promise[Any]]): Unit = js.native
  
  val running: Boolean = js.native
  
  def sendNotification(method: String): Unit = js.native
  def sendNotification(method: String, parameters: Any): Unit = js.native
  
  def sendRequest(method: String): js.Promise[Any] = js.native
  def sendRequest(method: String, parameters: Any): js.Promise[Any] = js.native
  
  def start(): Unit = js.native
  
  def stop(): Unit = js.native
}
