package typings.atNodelibFsDotScandir.outSettingsMod

import typings.atNodelibFsDotScandir.outAdaptersFsMod.FileSystemAdapter
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var followSymbolicLinks: js.UndefOr[Boolean] = js.undefined
  var fs: js.UndefOr[Partial[FileSystemAdapter]] = js.undefined
  var pathSegmentSeparator: js.UndefOr[String] = js.undefined
  var stats: js.UndefOr[Boolean] = js.undefined
  var throwErrorOnBrokenSymbolicLink: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    followSymbolicLinks: js.UndefOr[Boolean] = js.undefined,
    fs: Partial[FileSystemAdapter] = null,
    pathSegmentSeparator: String = null,
    stats: js.UndefOr[Boolean] = js.undefined,
    throwErrorOnBrokenSymbolicLink: js.UndefOr[Boolean] = js.undefined
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

