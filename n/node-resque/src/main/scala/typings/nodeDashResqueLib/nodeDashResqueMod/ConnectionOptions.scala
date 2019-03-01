package typings
package nodeDashResqueLib.nodeDashResqueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionOptions extends js.Object {
  var database: js.UndefOr[scala.Double] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var looping: js.UndefOr[scala.Boolean] = js.undefined
  var namespace: js.UndefOr[java.lang.String] = js.undefined
  var options: js.UndefOr[js.Any] = js.undefined
  var pkg: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
}

object ConnectionOptions {
  @scala.inline
  def apply(
    database: scala.Int | scala.Double = null,
    host: java.lang.String = null,
    looping: js.UndefOr[scala.Boolean] = js.undefined,
    namespace: java.lang.String = null,
    options: js.Any = null,
    pkg: java.lang.String = null,
    port: scala.Int | scala.Double = null
  ): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host)
    if (!js.isUndefined(looping)) __obj.updateDynamic("looping")(looping)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (options != null) __obj.updateDynamic("options")(options)
    if (pkg != null) __obj.updateDynamic("pkg")(pkg)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionOptions]
  }
}

