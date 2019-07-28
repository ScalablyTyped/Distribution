package typings.atNodelibFsDotWalk.outSettingsMod

import typings.atNodelibFsDotScandir.outAdaptersFsMod.FileSystemAdapter
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var basePath: js.UndefOr[String] = js.undefined
  var concurrency: js.UndefOr[Double] = js.undefined
  var deepFilter: js.UndefOr[DeepFilterFunction] = js.undefined
  var entryFilter: js.UndefOr[EntryFilterFunction] = js.undefined
  var errorFilter: js.UndefOr[ErrorFilterFunction] = js.undefined
  var followSymbolicLinks: js.UndefOr[Boolean] = js.undefined
  var fs: js.UndefOr[Partial[FileSystemAdapter]] = js.undefined
  var pathSegmentSeparator: js.UndefOr[String] = js.undefined
  var stats: js.UndefOr[Boolean] = js.undefined
  var throwErrorOnBrokenSymbolicLink: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    basePath: String = null,
    concurrency: Int | Double = null,
    deepFilter: DeepFilterFunction = null,
    entryFilter: EntryFilterFunction = null,
    errorFilter: ErrorFilterFunction = null,
    followSymbolicLinks: js.UndefOr[Boolean] = js.undefined,
    fs: Partial[FileSystemAdapter] = null,
    pathSegmentSeparator: String = null,
    stats: js.UndefOr[Boolean] = js.undefined,
    throwErrorOnBrokenSymbolicLink: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (basePath != null) __obj.updateDynamic("basePath")(basePath)
    if (concurrency != null) __obj.updateDynamic("concurrency")(concurrency.asInstanceOf[js.Any])
    if (deepFilter != null) __obj.updateDynamic("deepFilter")(deepFilter)
    if (entryFilter != null) __obj.updateDynamic("entryFilter")(entryFilter)
    if (errorFilter != null) __obj.updateDynamic("errorFilter")(errorFilter)
    if (!js.isUndefined(followSymbolicLinks)) __obj.updateDynamic("followSymbolicLinks")(followSymbolicLinks)
    if (fs != null) __obj.updateDynamic("fs")(fs)
    if (pathSegmentSeparator != null) __obj.updateDynamic("pathSegmentSeparator")(pathSegmentSeparator)
    if (!js.isUndefined(stats)) __obj.updateDynamic("stats")(stats)
    if (!js.isUndefined(throwErrorOnBrokenSymbolicLink)) __obj.updateDynamic("throwErrorOnBrokenSymbolicLink")(throwErrorOnBrokenSymbolicLink)
    __obj.asInstanceOf[Options]
  }
}

