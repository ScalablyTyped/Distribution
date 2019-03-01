package typings
package nodeDashStatsdLib.nodeDashStatsdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatsDConfig extends js.Object {
  var cacheDns: js.UndefOr[scala.Boolean] = js.undefined
  var global_tags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var globalize: js.UndefOr[scala.Boolean] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var mock: js.UndefOr[scala.Boolean] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var suffix: js.UndefOr[java.lang.String] = js.undefined
}

object StatsDConfig {
  @scala.inline
  def apply(
    cacheDns: js.UndefOr[scala.Boolean] = js.undefined,
    global_tags: js.Array[java.lang.String] = null,
    globalize: js.UndefOr[scala.Boolean] = js.undefined,
    host: java.lang.String = null,
    mock: js.UndefOr[scala.Boolean] = js.undefined,
    port: scala.Int | scala.Double = null,
    prefix: java.lang.String = null,
    suffix: java.lang.String = null
  ): StatsDConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cacheDns)) __obj.updateDynamic("cacheDns")(cacheDns)
    if (global_tags != null) __obj.updateDynamic("global_tags")(global_tags)
    if (!js.isUndefined(globalize)) __obj.updateDynamic("globalize")(globalize)
    if (host != null) __obj.updateDynamic("host")(host)
    if (!js.isUndefined(mock)) __obj.updateDynamic("mock")(mock)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    __obj.asInstanceOf[StatsDConfig]
  }
}

