package typings.nodegit.statusOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.nodegit.strArrayMod.Strarray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusOptions
  extends /* key */ StringDictionary[js.Any] {
  var flags: js.UndefOr[Double] = js.undefined
  var pathspec: js.UndefOr[Strarray | String | js.Array[String]] = js.undefined
  var show: js.UndefOr[Double] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
}

object StatusOptions {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    flags: js.UndefOr[Double] = js.undefined,
    pathspec: Strarray | String | js.Array[String] = null,
    show: js.UndefOr[Double] = js.undefined,
    version: js.UndefOr[Double] = js.undefined
  ): StatusOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(flags)) __obj.updateDynamic("flags")(flags.get.asInstanceOf[js.Any])
    if (pathspec != null) __obj.updateDynamic("pathspec")(pathspec.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.get.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusOptions]
  }
}

