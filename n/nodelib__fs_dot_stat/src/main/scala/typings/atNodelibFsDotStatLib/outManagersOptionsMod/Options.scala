package typings
package atNodelibFsDotStatLib.outManagersOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var followSymlinks: js.UndefOr[scala.Boolean] = js.undefined
  var fs: js.UndefOr[stdLib.Partial[atNodelibFsDotStatLib.outAdaptersFsMod.FileSystemAdapter]] = js.undefined
  var throwErrorOnBrokenSymlinks: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    followSymlinks: js.UndefOr[scala.Boolean] = js.undefined,
    fs: stdLib.Partial[atNodelibFsDotStatLib.outAdaptersFsMod.FileSystemAdapter] = null,
    throwErrorOnBrokenSymlinks: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(followSymlinks)) __obj.updateDynamic("followSymlinks")(followSymlinks)
    if (fs != null) __obj.updateDynamic("fs")(fs)
    if (!js.isUndefined(throwErrorOnBrokenSymlinks)) __obj.updateDynamic("throwErrorOnBrokenSymlinks")(throwErrorOnBrokenSymlinks)
    __obj.asInstanceOf[Options]
  }
}

