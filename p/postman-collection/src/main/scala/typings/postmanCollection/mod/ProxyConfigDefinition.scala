package typings.postmanCollection.mod

import typings.postmanCollection.AnonPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyConfigDefinition extends PropertyDefinition {
  var host: js.UndefOr[String] = js.undefined
  var `match`: js.UndefOr[String | AnonPattern | UrlMatchPattern] = js.undefined
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
    `match`: String | AnonPattern | UrlMatchPattern = null,
    name: String = null,
    port: Int | Double = null,
    tunnel: js.UndefOr[Boolean] = js.undefined
  ): ProxyConfigDefinition = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(tunnel)) __obj.updateDynamic("tunnel")(tunnel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyConfigDefinition]
  }
}

