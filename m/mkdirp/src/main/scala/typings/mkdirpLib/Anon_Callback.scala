package typings
package mkdirpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Callback extends js.Object {
  def apply(
    path: nodeLib.fsMod.PathLike,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  def apply(
    path: nodeLib.fsMod.PathLike,
    options: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  def apply(
    path: nodeLib.fsMod.PathLike,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  def apply(
    path: nodeLib.fsMod.PathLike,
    options: nodeLib.fsMod.MakeDirectoryOptions,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  def apply(
    path: nodeLib.fsMod.PathLike,
    options: scala.Double,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  def apply(
    path: nodeLib.fsMod.PathLike,
    options: scala.Null,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Asynchronous mkdir(2) - create a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
    * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
    */
  def `__promisify__`(path: nodeLib.fsMod.PathLike): js.Promise[scala.Unit] = js.native
  def `__promisify__`(path: nodeLib.fsMod.PathLike, options: java.lang.String): js.Promise[scala.Unit] = js.native
  def `__promisify__`(path: nodeLib.fsMod.PathLike, options: nodeLib.fsMod.MakeDirectoryOptions): js.Promise[scala.Unit] = js.native
  def `__promisify__`(path: nodeLib.fsMod.PathLike, options: scala.Double): js.Promise[scala.Unit] = js.native
}

