package typings.mkdirp.mkdirpMod

import typings.mkdirp.Anon_Callback
import typings.mkdirp.Typeofstat
import typings.node.NodeJSNs.ErrnoException
import typings.node.fsMod.MakeDirectoryOptions
import typings.node.fsMod.PathLike
import typings.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FsImplementation extends js.Object {
  @JSName("mkdir")
  var mkdir_Original: Anon_Callback = js.native
  @JSName("stat")
  var stat_Original: (js.Function2[
    /* path */ PathLike, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit], 
    Unit
  ]) with Typeofstat = js.native
  def mkdir(path: PathLike, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  def mkdir(
    path: PathLike,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  def mkdir(path: PathLike, options: String, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  def mkdir(path: PathLike, options: Double, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  def mkdir(path: PathLike, options: Null, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  def mkdir(
    path: PathLike,
    options: MakeDirectoryOptions,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  def stat(path: PathLike, callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit]): Unit = js.native
}

