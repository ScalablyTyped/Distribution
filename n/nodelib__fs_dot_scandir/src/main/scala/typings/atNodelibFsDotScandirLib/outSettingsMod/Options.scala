package typings
package atNodelibFsDotScandirLib.outSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var followSymbolicLinks: js.UndefOr[scala.Boolean] = js.undefined
  var fs: js.UndefOr[stdLib.Partial[atNodelibFsDotScandirLib.outAdaptersFsMod.FileSystemAdapter]] = js.undefined
  var pathSegmentSeparator: js.UndefOr[java.lang.String] = js.undefined
  var stats: js.UndefOr[scala.Boolean] = js.undefined
  var throwErrorOnBrokenSymbolicLink: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    followSymbolicLinks: js.UndefOr[scala.Boolean] = js.undefined,
    fs: stdLib.Partial[atNodelibFsDotScandirLib.outAdaptersFsMod.FileSystemAdapter] = null,
    pathSegmentSeparator: java.lang.String = null,
    stats: js.UndefOr[scala.Boolean] = js.undefined,
    throwErrorOnBrokenSymbolicLink: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(followSymbolicLinks)) __obj.updateDynamic("followSymbolicLinks")(followSymbolicLinks)
    if (fs != null) __obj.updateDynamic("fs")(fs)
    if (pathSegmentSeparator != null) __obj.updateDynamic("pathSegmentSeparator")(pathSegmentSeparator)
    if (!js.isUndefined(stats)) __obj.updateDynamic("stats")(stats)
    if (!js.isUndefined(throwErrorOnBrokenSymbolicLink)) __obj.updateDynamic("throwErrorOnBrokenSymbolicLink")(throwErrorOnBrokenSymbolicLink)
    __obj.asInstanceOf[Options]
  }
}

