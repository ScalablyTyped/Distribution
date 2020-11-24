package typings.novaEditorNode

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://novadocs.panic.com/api-reference/process/
// This could be improved to split into automatic pipe and jsonrpc types with
// the appropriate methods enabled, but because stdio is configured within
// options it feels like overkill
@js.native
trait Process extends js.Object {
  
  val args: js.UndefOr[js.Array[String]] = js.native
  
  val command: String = js.native
  
  val env: js.UndefOr[StringDictionary[String]] = js.native
  
  def kill(): Unit = js.native
  
  // see no-unnecessary-generics for why these aren't stricter
  def notify(methodName: String): Unit = js.native
  def notify(methodName: String, params: js.Any): Unit = js.native
  
  def onDidExit(callback: js.Function1[/* status */ Double, Unit]): Disposable = js.native
  
  def onNotify(methodName: String, callback: js.Function1[/* message */ ProcessMessage[_, _, _], Unit]): Disposable = js.native
  
  def onRequest(methodName: String, callback: js.Function1[/* message */ ProcessMessage[_, _, _], _]): Disposable = js.native
  
  def onStderr(callback: js.Function1[/* line */ String, Unit]): Disposable = js.native
  
  def onStdout(callback: js.Function1[/* line */ String, Unit]): Disposable = js.native
  
  val pid: Double = js.native
  
  def request(methodName: String): js.Promise[_] = js.native
  def request(methodName: String, params: js.Any): js.Promise[_] = js.native
  
  def signal(signal: String): Unit = js.native
  def signal(signal: Double): Unit = js.native
  
  def start(): Unit = js.native
  
  val stderr: js.UndefOr[ReadableStream[_] | WritableStream[_] | Null] = js.native
  
  val stdin: js.UndefOr[ReadableStream[_] | WritableStream[_] | Null] = js.native
  
  val stdio: js.UndefOr[
    js.Tuple3[
      ReadableStream[_] | WritableStream[_] | Null, 
      ReadableStream[_] | WritableStream[_] | Null, 
      ReadableStream[_] | WritableStream[_] | Null
    ]
  ] = js.native
  
  val stdout: js.UndefOr[ReadableStream[_] | WritableStream[_] | Null] = js.native
  
  def terminate(): Unit = js.native
}
