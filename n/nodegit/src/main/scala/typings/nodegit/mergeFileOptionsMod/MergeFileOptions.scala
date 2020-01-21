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
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    ancestorLabel: String = null,
    favor: Int | Double = null,
    flags: Int | Double = null,
    ourLabel: String = null,
    theirLabel: String = null,
    version: Int | Double = null
  ): MergeFileOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (ancestorLabel != null) __obj.updateDynamic("ancestorLabel")(ancestorLabel.asInstanceOf[js.Any])
    if (favor != null) __obj.updateDynamic("favor")(favor.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (ourLabel != null) __obj.updateDynamic("ourLabel")(ourLabel.asInstanceOf[js.Any])
    if (theirLabel != null) __obj.updateDynamic("theirLabel")(theirLabel.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeFileOptions]
  }
}

