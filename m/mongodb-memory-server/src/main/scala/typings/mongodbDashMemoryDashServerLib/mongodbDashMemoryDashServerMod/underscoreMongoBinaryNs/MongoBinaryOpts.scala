package typings
package mongodbDashMemoryDashServerLib.mongodbDashMemoryDashServerMod.underscoreMongoBinaryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MongoBinaryOpts extends js.Object {
  var arch: js.UndefOr[java.lang.String] = js.undefined
  var debug: js.UndefOr[scala.Boolean | (js.Function1[/* repeated */ js.Any, _])] = js.undefined
  var downloadDir: js.UndefOr[java.lang.String] = js.undefined
  var platform: js.UndefOr[java.lang.String] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object MongoBinaryOpts {
  @scala.inline
  def apply(
    arch: java.lang.String = null,
    debug: scala.Boolean | (js.Function1[/* repeated */ js.Any, _]) = null,
    downloadDir: java.lang.String = null,
    platform: java.lang.String = null,
    version: java.lang.String = null
  ): MongoBinaryOpts = {
    val __obj = js.Dynamic.literal()
    if (arch != null) __obj.updateDynamic("arch")(arch)
    if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (downloadDir != null) __obj.updateDynamic("downloadDir")(downloadDir)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[MongoBinaryOpts]
  }
}

