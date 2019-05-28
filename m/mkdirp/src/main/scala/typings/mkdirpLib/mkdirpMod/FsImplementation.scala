package typings
package mkdirpLib.mkdirpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FsImplementation extends js.Object {
  @JSName("mkdir")
  var mkdir_Original: mkdirpLib.Anon_Callback = js.native
  @JSName("stat")
  var stat_Original: (js.Function2[
    /* path */ nodeLib.fsMod.PathLike, 
    /* callback */ js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* stats */ nodeLib.fsMod.Stats, 
      scala.Unit
    ], 
    scala.Unit
  ]) with mkdirpLib.Typeofstat = js.native
  def mkdir(
    path: nodeLib.fsMod.PathLike,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  def mkdir(
    path: nodeLib.fsMod.PathLike,
    options: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  def mkdir(
    path: nodeLib.fsMod.PathLike,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  def mkdir(
    path: nodeLib.fsMod.PathLike,
    options: nodeLib.fsMod.MakeDirectoryOptions,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  def mkdir(
    path: nodeLib.fsMod.PathLike,
    options: scala.Double,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  def mkdir(
    path: nodeLib.fsMod.PathLike,
    options: scala.Null,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  def stat(
    path: nodeLib.fsMod.PathLike,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* stats */ nodeLib.fsMod.Stats, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

