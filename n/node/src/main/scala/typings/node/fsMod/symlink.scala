package typings.node.fsMod

import typings.node.NodeJS.ErrnoException
import typings.node.fsMod.symlink.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("fs", "symlink")
@js.native
object symlink extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.node.nodeStrings.dir
    - typings.node.nodeStrings.file
    - typings.node.nodeStrings.junction
  */
  trait Type extends js.Object
  
  /**
    * Asynchronous symlink(2) - Create a new symbolic link to an existing file.
    * @param target A path to an existing file. If a URL is provided, it must use the `file:` protocol.
    * @param path A path to the new symlink. If a URL is provided, it must use the `file:` protocol.
    */
  def apply(target: PathLike, path: PathLike, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  def apply(
    target: PathLike,
    path: PathLike,
    `type`: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  def apply(
    target: PathLike,
    path: PathLike,
    `type`: Null,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  /**
    * Asynchronous symlink(2) - Create a new symbolic link to an existing file.
    * @param target A path to an existing file. If a URL is provided, it must use the `file:` protocol.
    * @param path A path to the new symlink. If a URL is provided, it must use the `file:` protocol.
    * @param type May be set to `'dir'`, `'file'`, or `'junction'` (default is `'file'`) and is only available on Windows (ignored on other platforms).
    * When using `'junction'`, the `target` argument will automatically be normalized to an absolute path.
    */
  def apply(
    target: PathLike,
    path: PathLike,
    `type`: Type,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  /**
    * Asynchronous symlink(2) - Create a new symbolic link to an existing file.
    * @param target A path to an existing file. If a URL is provided, it must use the `file:` protocol.
    * @param path A path to the new symlink. If a URL is provided, it must use the `file:` protocol.
    * @param type May be set to `'dir'`, `'file'`, or `'junction'` (default is `'file'`) and is only available on Windows (ignored on other platforms).
    * When using `'junction'`, the `target` argument will automatically be normalized to an absolute path.
    */
  def __promisify__(target: PathLike, path: PathLike): js.Promise[Unit] = js.native
  def __promisify__(target: PathLike, path: PathLike, `type`: java.lang.String): js.Promise[Unit] = js.native
}

