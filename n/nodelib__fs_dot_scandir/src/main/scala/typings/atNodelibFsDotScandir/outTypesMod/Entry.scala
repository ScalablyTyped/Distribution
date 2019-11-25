package typings.atNodelibFsDotScandir.outTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entry extends js.Object {
  var dirent: Dirent
  var name: String
  var path: String
  var stats: js.UndefOr[Stats] = js.undefined
}

object Entry {
  @scala.inline
  def apply(dirent: Dirent, name: String, path: String, stats: Stats = null): Entry = {
    val __obj = js.Dynamic.literal(dirent = dirent.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (stats != null) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entry]
  }
}

