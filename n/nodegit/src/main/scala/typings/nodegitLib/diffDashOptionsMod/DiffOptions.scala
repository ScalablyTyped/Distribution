package typings
package nodegitLib.diffDashOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiffOptions
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var contextLines: js.UndefOr[scala.Double] = js.undefined
  var flags: js.UndefOr[scala.Double] = js.undefined
  var idAbbrev: js.UndefOr[scala.Double] = js.undefined
  var ignoreSubmodules: js.UndefOr[scala.Double] = js.undefined
  var interhunkLines: js.UndefOr[scala.Double] = js.undefined
  var maxSize: js.UndefOr[scala.Double] = js.undefined
  var newPrefix: js.UndefOr[java.lang.String] = js.undefined
  var notifyCb: js.UndefOr[js.Function] = js.undefined
  var oldPrefix: js.UndefOr[java.lang.String] = js.undefined
  var pathspec: js.UndefOr[
    nodegitLib.strDashArrayMod.Strarray | java.lang.String | js.Array[java.lang.String]
  ] = js.undefined
  var payload: js.UndefOr[js.Any] = js.undefined
  var progressCb: js.UndefOr[js.Any] = js.undefined
  var version: js.UndefOr[scala.Double] = js.undefined
}

object DiffOptions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    contextLines: scala.Int | scala.Double = null,
    flags: scala.Int | scala.Double = null,
    idAbbrev: scala.Int | scala.Double = null,
    ignoreSubmodules: scala.Int | scala.Double = null,
    interhunkLines: scala.Int | scala.Double = null,
    maxSize: scala.Int | scala.Double = null,
    newPrefix: java.lang.String = null,
    notifyCb: js.Function = null,
    oldPrefix: java.lang.String = null,
    pathspec: nodegitLib.strDashArrayMod.Strarray | java.lang.String | js.Array[java.lang.String] = null,
    payload: js.Any = null,
    progressCb: js.Any = null,
    version: scala.Int | scala.Double = null
  ): DiffOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (contextLines != null) __obj.updateDynamic("contextLines")(contextLines.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (idAbbrev != null) __obj.updateDynamic("idAbbrev")(idAbbrev.asInstanceOf[js.Any])
    if (ignoreSubmodules != null) __obj.updateDynamic("ignoreSubmodules")(ignoreSubmodules.asInstanceOf[js.Any])
    if (interhunkLines != null) __obj.updateDynamic("interhunkLines")(interhunkLines.asInstanceOf[js.Any])
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (newPrefix != null) __obj.updateDynamic("newPrefix")(newPrefix)
    if (notifyCb != null) __obj.updateDynamic("notifyCb")(notifyCb)
    if (oldPrefix != null) __obj.updateDynamic("oldPrefix")(oldPrefix)
    if (pathspec != null) __obj.updateDynamic("pathspec")(pathspec.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload)
    if (progressCb != null) __obj.updateDynamic("progressCb")(progressCb)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffOptions]
  }
}

