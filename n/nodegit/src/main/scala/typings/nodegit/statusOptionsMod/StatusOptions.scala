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
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    flags: Int | Double = null,
    pathspec: Strarray | String | js.Array[String] = null,
    show: Int | Double = null,
    version: Int | Double = null
  ): StatusOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (pathspec != null) __obj.updateDynamic("pathspec")(pathspec.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusOptions]
  }
}

