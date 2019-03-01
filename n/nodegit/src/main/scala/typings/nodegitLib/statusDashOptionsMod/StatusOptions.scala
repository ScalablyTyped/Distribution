package typings
package nodegitLib.statusDashOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusOptions
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var flags: js.UndefOr[scala.Double] = js.undefined
  var pathspec: js.UndefOr[
    nodegitLib.strDashArrayMod.Strarray | java.lang.String | js.Array[java.lang.String]
  ] = js.undefined
  var show: js.UndefOr[scala.Double] = js.undefined
  var version: js.UndefOr[scala.Double] = js.undefined
}

object StatusOptions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    flags: scala.Int | scala.Double = null,
    pathspec: nodegitLib.strDashArrayMod.Strarray | java.lang.String | js.Array[java.lang.String] = null,
    show: scala.Int | scala.Double = null,
    version: scala.Int | scala.Double = null
  ): StatusOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (pathspec != null) __obj.updateDynamic("pathspec")(pathspec.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusOptions]
  }
}

