package typings.pacote.mod

import typings.node.Buffer
import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pacote", "tarball")
@js.native
object tarball extends js.Object {
  
  def apply(spec: String): js.Promise[Buffer with FetchResult] = js.native
  def apply(spec: String, opts: Options): js.Promise[Buffer with FetchResult] = js.native
  
  /**
    * Save a package tarball data to a file on disk.
    */
  def file(spec: String, dest: String): js.Promise[FetchResult] = js.native
  def file(spec: String, dest: String, opts: Options): js.Promise[FetchResult] = js.native
  
  /**
    * Fetch a tarball and make the stream available to the streamHandler
    * function.
    *
    * This is mostly an internal function, but it is exposed because it does
    * provide some functionality that may be difficult to achieve otherwise.
    *
    * The `streamHandler` function MUST return a Promise that resolves when the
    * stream (and all associated work) is ended, or rejects if the stream has
    * an error.
    *
    * The `streamHandler` function MAY be called multiple times, as Pacote
    * retries requests in some scenarios, such as cache corruption or retriable
    * network failures.
    */
  def stream[T](spec: String, streamHandler: js.Function1[/* stream */ Transform, js.Promise[T]]): js.Promise[T] = js.native
  def stream[T](spec: String, streamHandler: js.Function1[/* stream */ Transform, js.Promise[T]], opts: Options): js.Promise[T] = js.native
}
