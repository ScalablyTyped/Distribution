package typings.nodelibFsStat.settingsMod

import typings.nodelibFsStat.PartialFileSystemAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var followSymbolicLink: js.UndefOr[Boolean] = js.undefined
  var fs: js.UndefOr[PartialFileSystemAdapter] = js.undefined
  var markSymbolicLink: js.UndefOr[Boolean] = js.undefined
  var throwErrorOnBrokenSymbolicLink: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    followSymbolicLink: js.UndefOr[Boolean] = js.undefined,
    fs: PartialFileSystemAdapter = null,
    markSymbolicLink: js.UndefOr[Boolean] = js.undefined,
    throwErrorOnBrokenSymbolicLink: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(followSymbolicLink)) __obj.updateDynamic("followSymbolicLink")(followSymbolicLink.asInstanceOf[js.Any])
    if (fs != null) __obj.updateDynamic("fs")(fs.asInstanceOf[js.Any])
    if (!js.isUndefined(markSymbolicLink)) __obj.updateDynamic("markSymbolicLink")(markSymbolicLink.asInstanceOf[js.Any])
    if (!js.isUndefined(throwErrorOnBrokenSymbolicLink)) __obj.updateDynamic("throwErrorOnBrokenSymbolicLink")(throwErrorOnBrokenSymbolicLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

