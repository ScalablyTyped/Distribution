package typings.nodelibFsWalk.settingsMod

import typings.nodelibFsWalk.anon.PartialFileSystemAdapter
import typings.nodelibFsWalk.typesMod.Entry
import typings.nodelibFsWalk.typesMod.Errno
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
  var fs: js.UndefOr[PartialFileSystemAdapter] = js.undefined
  var pathSegmentSeparator: js.UndefOr[String] = js.undefined
  var stats: js.UndefOr[Boolean] = js.undefined
  var throwErrorOnBrokenSymbolicLink: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    basePath: String = null,
    concurrency: js.UndefOr[Double] = js.undefined,
    deepFilter: Entry => Boolean = null,
    entryFilter: Entry => Boolean = null,
    errorFilter: Errno => Boolean = null,
    followSymbolicLinks: js.UndefOr[Boolean] = js.undefined,
    fs: PartialFileSystemAdapter = null,
    pathSegmentSeparator: String = null,
    stats: js.UndefOr[Boolean] = js.undefined,
    throwErrorOnBrokenSymbolicLink: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (basePath != null) __obj.updateDynamic("basePath")(basePath.asInstanceOf[js.Any])
    if (!js.isUndefined(concurrency)) __obj.updateDynamic("concurrency")(concurrency.get.asInstanceOf[js.Any])
    if (deepFilter != null) __obj.updateDynamic("deepFilter")(js.Any.fromFunction1(deepFilter))
    if (entryFilter != null) __obj.updateDynamic("entryFilter")(js.Any.fromFunction1(entryFilter))
    if (errorFilter != null) __obj.updateDynamic("errorFilter")(js.Any.fromFunction1(errorFilter))
    if (!js.isUndefined(followSymbolicLinks)) __obj.updateDynamic("followSymbolicLinks")(followSymbolicLinks.get.asInstanceOf[js.Any])
    if (fs != null) __obj.updateDynamic("fs")(fs.asInstanceOf[js.Any])
    if (pathSegmentSeparator != null) __obj.updateDynamic("pathSegmentSeparator")(pathSegmentSeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(stats)) __obj.updateDynamic("stats")(stats.get.asInstanceOf[js.Any])
    if (!js.isUndefined(throwErrorOnBrokenSymbolicLink)) __obj.updateDynamic("throwErrorOnBrokenSymbolicLink")(throwErrorOnBrokenSymbolicLink.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

