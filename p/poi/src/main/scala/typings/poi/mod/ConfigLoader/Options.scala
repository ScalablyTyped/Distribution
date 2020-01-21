package typings.poi.mod.ConfigLoader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var cwd: js.UndefOr[String] = js.undefined
  var files: js.UndefOr[js.Array[String]] = js.undefined
  var packageKey: js.UndefOr[String] = js.undefined
  var parseJSON: js.UndefOr[js.Function1[/* str */ String, _]] = js.undefined
  var stopDir: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cwd: String = null,
    files: js.Array[String] = null,
    packageKey: String = null,
    parseJSON: /* str */ String => _ = null,
    stopDir: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (packageKey != null) __obj.updateDynamic("packageKey")(packageKey.asInstanceOf[js.Any])
    if (parseJSON != null) __obj.updateDynamic("parseJSON")(js.Any.fromFunction1(parseJSON))
    if (stopDir != null) __obj.updateDynamic("stopDir")(stopDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

