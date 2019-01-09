package typings
package atNodelibFsDotStatLib.outAdaptersFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSystemAdapter extends js.Object {
  @JSName("lstatSync")
  var lstatSync_Original: js.Function1[/* path */ nodeLib.fsMod.PathLike, nodeLib.fsMod.Stats] = js.native
  @JSName("lstat")
  var lstat_Original: (js.Function2[
    /* path */ nodeLib.fsMod.PathLike, 
    /* callback */ js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* stats */ nodeLib.fsMod.Stats, 
      scala.Unit
    ], 
    scala.Unit
  ]) with atNodelibFsDotStatLib.Anon_Path = js.native
  @JSName("statSync")
  var statSync_Original: js.Function1[/* path */ nodeLib.fsMod.PathLike, nodeLib.fsMod.Stats] = js.native
  @JSName("stat")
  var stat_Original: (js.Function2[
    /* path */ nodeLib.fsMod.PathLike, 
    /* callback */ js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* stats */ nodeLib.fsMod.Stats, 
      scala.Unit
    ], 
    scala.Unit
  ]) with atNodelibFsDotStatLib.Anon_Path = js.native
  def lstat(
    path: nodeLib.fsMod.PathLike,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* stats */ nodeLib.fsMod.Stats, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def lstatSync(path: nodeLib.fsMod.PathLike): nodeLib.fsMod.Stats = js.native
  def stat(
    path: nodeLib.fsMod.PathLike,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* stats */ nodeLib.fsMod.Stats, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def statSync(path: nodeLib.fsMod.PathLike): nodeLib.fsMod.Stats = js.native
}

