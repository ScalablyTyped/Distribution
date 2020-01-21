package typings.passportWindowsauth

import typings.ldapjs.mod.Client
import typings.node.tlsMod.TlsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBase extends js.Object {
  var base: js.UndefOr[String] = js.undefined
  var bindCredentials: js.UndefOr[String] = js.undefined
  var bindDN: js.UndefOr[String] = js.undefined
  var binder: js.UndefOr[Client] = js.undefined
  var client: js.UndefOr[Client] = js.undefined
  var connectTimeout: js.UndefOr[Double] = js.undefined
  var idleTimeout: js.UndefOr[Double] = js.undefined
  var maxConnections: js.UndefOr[Double] = js.undefined
  var reconnect: js.UndefOr[Boolean | AnonFailAfter] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var tlsOptions: js.UndefOr[TlsOptions] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object AnonBase {
  @scala.inline
  def apply(
    base: String = null,
    bindCredentials: String = null,
    bindDN: String = null,
    binder: Client = null,
    client: Client = null,
    connectTimeout: Int | Double = null,
    idleTimeout: Int | Double = null,
    maxConnections: Int | Double = null,
    reconnect: Boolean | AnonFailAfter = null,
    timeout: Int | Double = null,
    tlsOptions: TlsOptions = null,
    url: String = null
  ): AnonBase = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (bindCredentials != null) __obj.updateDynamic("bindCredentials")(bindCredentials.asInstanceOf[js.Any])
    if (bindDN != null) __obj.updateDynamic("bindDN")(bindDN.asInstanceOf[js.Any])
    if (binder != null) __obj.updateDynamic("binder")(binder.asInstanceOf[js.Any])
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (connectTimeout != null) __obj.updateDynamic("connectTimeout")(connectTimeout.asInstanceOf[js.Any])
    if (idleTimeout != null) __obj.updateDynamic("idleTimeout")(idleTimeout.asInstanceOf[js.Any])
    if (maxConnections != null) __obj.updateDynamic("maxConnections")(maxConnections.asInstanceOf[js.Any])
    if (reconnect != null) __obj.updateDynamic("reconnect")(reconnect.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (tlsOptions != null) __obj.updateDynamic("tlsOptions")(tlsOptions.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBase]
  }
}

