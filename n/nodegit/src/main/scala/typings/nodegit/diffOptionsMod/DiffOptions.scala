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
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    contextLines: Int | Double = null,
    flags: Int | Double = null,
    idAbbrev: Int | Double = null,
    ignoreSubmodules: Int | Double = null,
    interhunkLines: Int | Double = null,
    maxSize: Int | Double = null,
    newPrefix: String = null,
    notifyCb: js.Function = null,
    oldPrefix: String = null,
    pathspec: Strarray | String | js.Array[String] = null,
    payload: js.Any = null,
    progressCb: js.Any = null,
    version: Int | Double = null
  ): DiffOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (contextLines != null) __obj.updateDynamic("contextLines")(contextLines.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (idAbbrev != null) __obj.updateDynamic("idAbbrev")(idAbbrev.asInstanceOf[js.Any])
    if (ignoreSubmodules != null) __obj.updateDynamic("ignoreSubmodules")(ignoreSubmodules.asInstanceOf[js.Any])
    if (interhunkLines != null) __obj.updateDynamic("interhunkLines")(interhunkLines.asInstanceOf[js.Any])
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (newPrefix != null) __obj.updateDynamic("newPrefix")(newPrefix.asInstanceOf[js.Any])
    if (notifyCb != null) __obj.updateDynamic("notifyCb")(notifyCb.asInstanceOf[js.Any])
    if (oldPrefix != null) __obj.updateDynamic("oldPrefix")(oldPrefix.asInstanceOf[js.Any])
    if (pathspec != null) __obj.updateDynamic("pathspec")(pathspec.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (progressCb != null) __obj.updateDynamic("progressCb")(progressCb.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffOptions]
  }
}

