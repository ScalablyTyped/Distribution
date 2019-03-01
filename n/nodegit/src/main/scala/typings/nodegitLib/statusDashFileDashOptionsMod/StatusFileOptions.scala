package typings
package nodegitLib.statusDashFileDashOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusFileOptions
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var entry: js.UndefOr[nodegitLib.statusDashEntryMod.StatusEntry] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[scala.Double] = js.undefined
}

object StatusFileOptions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    entry: nodegitLib.statusDashEntryMod.StatusEntry = null,
    path: java.lang.String = null,
    status: scala.Int | scala.Double = null
  ): StatusFileOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (entry != null) __obj.updateDynamic("entry")(entry)
    if (path != null) __obj.updateDynamic("path")(path)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusFileOptions]
  }
}

