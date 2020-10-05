package typings.node.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs", "link")
@js.native
object link extends js.Object {
  def apply(existingPath: PathLike, newPath: PathLike, callback: NoParamCallback): Unit = js.native
  /**
    * Asynchronous link(2) - Create a new link (also known as a hard link) to an existing file.
    * @param existingPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param newPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  @JSName("__promisify__")
  def promisify(existingPath: PathLike, newPath: PathLike): js.Promise[Unit] = js.native
}

