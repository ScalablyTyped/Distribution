package typings
package nodegitLib.mergeDashFileDashOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergeFileOptions
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var ancestorLabel: js.UndefOr[java.lang.String] = js.undefined
  var favor: js.UndefOr[scala.Double] = js.undefined
  var flags: js.UndefOr[scala.Double] = js.undefined
  var ourLabel: js.UndefOr[java.lang.String] = js.undefined
  var theirLabel: js.UndefOr[java.lang.String] = js.undefined
  var version: js.UndefOr[scala.Double] = js.undefined
}

object MergeFileOptions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    ancestorLabel: java.lang.String = null,
    favor: scala.Int | scala.Double = null,
    flags: scala.Int | scala.Double = null,
    ourLabel: java.lang.String = null,
    theirLabel: java.lang.String = null,
    version: scala.Int | scala.Double = null
  ): MergeFileOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (ancestorLabel != null) __obj.updateDynamic("ancestorLabel")(ancestorLabel)
    if (favor != null) __obj.updateDynamic("favor")(favor.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (ourLabel != null) __obj.updateDynamic("ourLabel")(ourLabel)
    if (theirLabel != null) __obj.updateDynamic("theirLabel")(theirLabel)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeFileOptions]
  }
}

