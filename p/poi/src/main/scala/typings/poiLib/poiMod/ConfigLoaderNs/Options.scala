package typings
package poiLib.poiMod.ConfigLoaderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  var files: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var packageKey: js.UndefOr[java.lang.String] = js.undefined
  var parseJSON: js.UndefOr[js.Function1[/* str */ java.lang.String, _]] = js.undefined
  var stopDir: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cwd: java.lang.String = null,
    files: js.Array[java.lang.String] = null,
    packageKey: java.lang.String = null,
    parseJSON: /* str */ java.lang.String => _ = null,
    stopDir: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (files != null) __obj.updateDynamic("files")(files)
    if (packageKey != null) __obj.updateDynamic("packageKey")(packageKey)
    if (parseJSON != null) __obj.updateDynamic("parseJSON")(js.Any.fromFunction1(parseJSON))
    if (stopDir != null) __obj.updateDynamic("stopDir")(stopDir)
    __obj.asInstanceOf[Options]
  }
}

