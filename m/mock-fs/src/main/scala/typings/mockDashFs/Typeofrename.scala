package typings.mockDashFs

import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofrename extends js.Object {
  /**
    * Asynchronous rename(2) - Change the name or location of a file or directory.
    * @param oldPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * @param newPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def __promisify__(oldPath: PathLike, newPath: PathLike): js.Promise[Unit]
}

object Typeofrename {
  @scala.inline
  def apply(__promisify__ : (PathLike, PathLike) => js.Promise[Unit]): Typeofrename = {
    val __obj = js.Dynamic.literal(__promisify__ = js.Any.fromFunction2(__promisify__))
  
    __obj.asInstanceOf[Typeofrename]
  }
}

