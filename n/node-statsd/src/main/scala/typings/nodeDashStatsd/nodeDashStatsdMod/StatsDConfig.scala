package typings.nodeDashStatsd.nodeDashStatsdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatsDConfig extends js.Object {
  var cacheDns: js.UndefOr[Boolean] = js.undefined
  var global_tags: js.UndefOr[js.Array[String]] = js.undefined
  var globalize: js.UndefOr[Boolean] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var mock: js.UndefOr[Boolean] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var suffix: js.UndefOr[String] = js.undefined
}

object StatsDConfig {
  @scala.inline
  def apply(
    cacheDns: js.UndefOr[Boolean] = js.undefined,
    global_tags: js.Array[String] = null,
    globalize: js.UndefOr[Boolean] = js.undefined,
    host: String = null,
    mock: js.UndefOr[Boolean] = js.undefined,
    port: Int | Double = null,
    prefix: String = null,
    suffix: String = null
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

