package typings.nodelibFsStat.anon

import typings.node.fsMod.PathLike
import typings.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@nodelib/fs.stat.@nodelib/fs.stat/out/adapters/fs.FileSystemAdapter> */
trait PartialFileSystemAdapter extends js.Object {
  var lstat: js.UndefOr[Typeoflstat] = js.undefined
  var lstatSync: js.UndefOr[js.Function1[/* path */ PathLike, Stats]] = js.undefined
  var stat: js.UndefOr[Typeofstat] = js.undefined
  var statSync: js.UndefOr[js.Function1[/* path */ PathLike, Stats]] = js.undefined
}

object PartialFileSystemAdapter {
  @scala.inline
  def apply(
    lstat: Typeoflstat = null,
    lstatSync: /* path */ PathLike => Stats = null,
    stat: Typeofstat = null,
    statSync: /* path */ PathLike => Stats = null
  ): PartialFileSystemAdapter = {
    val __obj = js.Dynamic.literal()
    if (lstat != null) __obj.updateDynamic("lstat")(lstat.asInstanceOf[js.Any])
    if (lstatSync != null) __obj.updateDynamic("lstatSync")(js.Any.fromFunction1(lstatSync))
    if (stat != null) __obj.updateDynamic("stat")(stat.asInstanceOf[js.Any])
    if (statSync != null) __obj.updateDynamic("statSync")(js.Any.fromFunction1(statSync))
    __obj.asInstanceOf[PartialFileSystemAdapter]
  }
}

