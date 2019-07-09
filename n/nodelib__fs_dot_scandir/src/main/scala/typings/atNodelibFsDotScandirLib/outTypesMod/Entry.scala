package typings
package atNodelibFsDotScandirLib.outTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entry extends js.Object {
  var dirent: Dirent
  var name: java.lang.String
  var path: java.lang.String
  var stats: js.UndefOr[Stats] = js.undefined
}

object Entry {
  @scala.inline
  def apply(dirent: Dirent, name: java.lang.String, path: java.lang.String, stats: Stats = null): Entry = {
    val __obj = js.Dynamic.literal(dirent = dirent, name = name, path = path)
    if (stats != null) __obj.updateDynamic("stats")(stats)
    __obj.asInstanceOf[Entry]
  }
}

