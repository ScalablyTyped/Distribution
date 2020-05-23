package typings.nodegit.mergeFileOptionsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergeFileOptions
  extends /* key */ StringDictionary[js.Any] {
  var ancestorLabel: js.UndefOr[String] = js.undefined
  var favor: js.UndefOr[Double] = js.undefined
  var flags: js.UndefOr[Double] = js.undefined
  var ourLabel: js.UndefOr[String] = js.undefined
  var theirLabel: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
}

object MergeFileOptions {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    ancestorLabel: String = null,
    favor: js.UndefOr[Double] = js.undefined,
    flags: js.UndefOr[Double] = js.undefined,
    ourLabel: String = null,
    theirLabel: String = null,
    version: js.UndefOr[Double] = js.undefined
  ): MergeFileOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (ancestorLabel != null) __obj.updateDynamic("ancestorLabel")(ancestorLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(favor)) __obj.updateDynamic("favor")(favor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flags)) __obj.updateDynamic("flags")(flags.get.asInstanceOf[js.Any])
    if (ourLabel != null) __obj.updateDynamic("ourLabel")(ourLabel.asInstanceOf[js.Any])
    if (theirLabel != null) __obj.updateDynamic("theirLabel")(theirLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeFileOptions]
  }
}

