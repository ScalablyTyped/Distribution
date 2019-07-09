package typings
package atNodelibFsDotStatLib.outSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var followSymbolicLink: js.UndefOr[scala.Boolean] = js.undefined
  var fs: js.UndefOr[stdLib.Partial[atNodelibFsDotStatLib.outAdaptersFsMod.FileSystemAdapter]] = js.undefined
  var markSymbolicLink: js.UndefOr[scala.Boolean] = js.undefined
  var throwErrorOnBrokenSymbolicLink: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    followSymbolicLink: js.UndefOr[scala.Boolean] = js.undefined,
    fs: stdLib.Partial[atNodelibFsDotStatLib.outAdaptersFsMod.FileSystemAdapter] = null,
    markSymbolicLink: js.UndefOr[scala.Boolean] = js.undefined,
    throwErrorOnBrokenSymbolicLink: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(followSymbolicLink)) __obj.updateDynamic("followSymbolicLink")(followSymbolicLink)
    if (fs != null) __obj.updateDynamic("fs")(fs)
    if (!js.isUndefined(markSymbolicLink)) __obj.updateDynamic("markSymbolicLink")(markSymbolicLink)
    if (!js.isUndefined(throwErrorOnBrokenSymbolicLink)) __obj.updateDynamic("throwErrorOnBrokenSymbolicLink")(throwErrorOnBrokenSymbolicLink)
    __obj.asInstanceOf[Options]
  }
}

