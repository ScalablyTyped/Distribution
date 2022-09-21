package typings.novaEditorNode

import org.scalablytyped.runtime.StringDictionary
import typings.std.ReadableStream
import typings.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://docs.nova.app/api-reference/process/
// This could be improved to split into automatic pipe and jsonrpc types with
// the appropriate methods enabled, but because stdio is configured within
// options it feels like overkill
@js.native
trait Process extends StObject {
  
  val args: js.UndefOr[js.Array[String]] = js.native
  
  val command: String = js.native
  
  val env: js.UndefOr[StringDictionary[String]] = js.native
  
  def kill(): Unit = js.native
  
  // see no-unnecessary-generics for why these aren't stricter
  def notify(methodName: String): Unit = js.native
  def notify(methodName: String, params: Any): Unit = js.native
  
  def onDidExit(callback: js.Function1[/* status */ Double, Unit]): Disposable = js.native
  
  def onNotify(methodName: String, callback: js.Function1[/* message */ ProcessMessage[Any, Any, Any], Unit]): Disposable = js.native
  
  def onRequest(methodName: String, callback: js.Function1[/* message */ ProcessMessage[Any, Any, Any], Any]): Disposable = js.native
  
  def onStderr(callback: js.Function1[/* line */ String, Unit]): Disposable = js.native
  
  def onStdout(callback: js.Function1[/* line */ String, Unit]): Disposable = js.native
  
  val pid: Double = js.native
  
  def request(methodName: String): js.Promise[Any] = js.native
  def request(methodName: String, params: Any): js.Promise[Any] = js.native
  
  def signal(signal: String): Unit = js.native
  def signal(signal: Double): Unit = js.native
  
  def start(): Unit = js.native
  
  val stderr: ReadableStream[Any] | Null = js.native
  
  val stdin: WritableStream[Any] | Null = js.native
  
  val stdio: js.Tuple3[WritableStream[Any] | Null, ReadableStream[Any] | Null, ReadableStream[Any] | Null] = js.native
  
  val stdout: ReadableStream[Any] | Null = js.native
  
  def terminate(): Unit = js.native
}
