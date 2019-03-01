package typings
package postmanDashCollectionLib.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyConfigDefinition extends PropertyDefinition {
  var host: js.UndefOr[java.lang.String] = js.undefined
  var `match`: js.UndefOr[java.lang.String | postmanDashCollectionLib.Anon_Pattern | UrlMatchPattern] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var tunnel: js.UndefOr[scala.Boolean] = js.undefined
}

object ProxyConfigDefinition {
  @scala.inline
  def apply(
    description: java.lang.String | DescriptionDefinition = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    host: java.lang.String = null,
    id: java.lang.String = null,
    `match`: java.lang.String | postmanDashCollectionLib.Anon_Pattern | UrlMatchPattern = null,
    name: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    tunnel: js.UndefOr[scala.Boolean] = js.undefined
  ): ProxyConfigDefinition = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (host != null) __obj.updateDynamic("host")(host)
    if (id != null) __obj.updateDynamic("id")(id)
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(tunnel)) __obj.updateDynamic("tunnel")(tunnel)
    __obj.asInstanceOf[ProxyConfigDefinition]
  }
}

