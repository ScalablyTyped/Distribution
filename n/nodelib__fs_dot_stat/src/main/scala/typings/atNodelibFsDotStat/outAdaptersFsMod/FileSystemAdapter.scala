package typings.atNodelibFsDotStat.outAdaptersFsMod

import typings.atNodelibFsDotStat.Typeoflstat
import typings.atNodelibFsDotStat.Typeofstat
import typings.node.NodeJSNs.ErrnoException
import typings.node.fsMod.PathLike
import typings.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSystemAdapter extends js.Object {
  @JSName("lstatSync")
  var lstatSync_Original: js.Function1[/* path */ PathLike, Stats] = js.native
  @JSName("lstat")
  var lstat_Original: (js.Function2[
    /* path */ PathLike, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit], 
    Unit
  ]) with Typeoflstat = js.native
  @JSName("statSync")
  var statSync_Original: js.Function1[/* path */ PathLike, Stats] = js.native
  @JSName("stat")
  var stat_Original: (js.Function2[
    /* path */ PathLike, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit], 
    Unit
  ]) with Typeofstat = js.native
  def lstat(path: PathLike, callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit]): Unit = js.native
  def lstatSync(path: PathLike): Stats = js.native
  def stat(path: PathLike, callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit]): Unit = js.native
  def statSync(path: PathLike): Stats = js.native
}

