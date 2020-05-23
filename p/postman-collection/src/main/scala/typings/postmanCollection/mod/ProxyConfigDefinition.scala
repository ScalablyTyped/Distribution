package typings.postmanCollection.mod

import typings.postmanCollection.anon.Pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyConfigDefinition extends PropertyDefinition {
  var host: js.UndefOr[String] = js.undefined
  var `match`: js.UndefOr[String | Pattern | UrlMatchPattern] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var tunnel: js.UndefOr[Boolean] = js.undefined
}

object ProxyConfigDefinition {
  @scala.inline
  def apply(
    description: String | DescriptionDefinition = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    host: String = null,
    id: String = null,
    `match`: String | Pattern | UrlMatchPattern = null,
    name: String = null,
    port: js.UndefOr[Double] = js.undefined,
    tunnel: js.UndefOr[Boolean] = js.undefined
  ): ProxyConfigDefinition = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tunnel)) __obj.updateDynamic("tunnel")(tunnel.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyConfigDefinition]
  }
}

