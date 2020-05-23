package typings.nodegit.diffOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.nodegit.strArrayMod.Strarray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiffOptions
  extends /* key */ StringDictionary[js.Any] {
  var contextLines: js.UndefOr[Double] = js.undefined
  var flags: js.UndefOr[Double] = js.undefined
  var idAbbrev: js.UndefOr[Double] = js.undefined
  var ignoreSubmodules: js.UndefOr[Double] = js.undefined
  var interhunkLines: js.UndefOr[Double] = js.undefined
  var maxSize: js.UndefOr[Double] = js.undefined
  var newPrefix: js.UndefOr[String] = js.undefined
  var notifyCb: js.UndefOr[js.Function] = js.undefined
  var oldPrefix: js.UndefOr[String] = js.undefined
  var pathspec: js.UndefOr[Strarray | String | js.Array[String]] = js.undefined
  var payload: js.UndefOr[js.Any] = js.undefined
  var progressCb: js.UndefOr[js.Any] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
}

object DiffOptions {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    contextLines: js.UndefOr[Double] = js.undefined,
    flags: js.UndefOr[Double] = js.undefined,
    idAbbrev: js.UndefOr[Double] = js.undefined,
    ignoreSubmodules: js.UndefOr[Double] = js.undefined,
    interhunkLines: js.UndefOr[Double] = js.undefined,
    maxSize: js.UndefOr[Double] = js.undefined,
    newPrefix: String = null,
    notifyCb: js.Function = null,
    oldPrefix: String = null,
    pathspec: Strarray | String | js.Array[String] = null,
    payload: js.Any = null,
    progressCb: js.Any = null,
    version: js.UndefOr[Double] = js.undefined
  ): DiffOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(contextLines)) __obj.updateDynamic("contextLines")(contextLines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flags)) __obj.updateDynamic("flags")(flags.get.asInstanceOf[js.Any])
    if (!js.isUndefined(idAbbrev)) __obj.updateDynamic("idAbbrev")(idAbbrev.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreSubmodules)) __obj.updateDynamic("ignoreSubmodules")(ignoreSubmodules.get.asInstanceOf[js.Any])
    if (!js.isUndefined(interhunkLines)) __obj.updateDynamic("interhunkLines")(interhunkLines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSize)) __obj.updateDynamic("maxSize")(maxSize.get.asInstanceOf[js.Any])
    if (newPrefix != null) __obj.updateDynamic("newPrefix")(newPrefix.asInstanceOf[js.Any])
    if (notifyCb != null) __obj.updateDynamic("notifyCb")(notifyCb.asInstanceOf[js.Any])
    if (oldPrefix != null) __obj.updateDynamic("oldPrefix")(oldPrefix.asInstanceOf[js.Any])
    if (pathspec != null) __obj.updateDynamic("pathspec")(pathspec.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (progressCb != null) __obj.updateDynamic("progressCb")(progressCb.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffOptions]
  }
}

