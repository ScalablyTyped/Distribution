package typings.passportWindowsauth.anon

import typings.ldapjs.mod.Client
import typings.node.tlsMod.TlsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Base extends js.Object {
  var base: js.UndefOr[String] = js.undefined
  var bindCredentials: js.UndefOr[String] = js.undefined
  var bindDN: js.UndefOr[String] = js.undefined
  var binder: js.UndefOr[Client] = js.undefined
  var client: js.UndefOr[Client] = js.undefined
  var connectTimeout: js.UndefOr[Double] = js.undefined
  var idleTimeout: js.UndefOr[Double] = js.undefined
  var maxConnections: js.UndefOr[Double] = js.undefined
  var reconnect: js.UndefOr[Boolean | FailAfter] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var tlsOptions: js.UndefOr[TlsOptions] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object Base {
  @scala.inline
  def apply(
    base: String = null,
    bindCredentials: String = null,
    bindDN: String = null,
    binder: Client = null,
    client: Client = null,
    connectTimeout: js.UndefOr[Double] = js.undefined,
    idleTimeout: js.UndefOr[Double] = js.undefined,
    maxConnections: js.UndefOr[Double] = js.undefined,
    reconnect: Boolean | FailAfter = null,
    timeout: js.UndefOr[Double] = js.undefined,
    tlsOptions: TlsOptions = null,
    url: String = null
  ): Base = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (bindCredentials != null) __obj.updateDynamic("bindCredentials")(bindCredentials.asInstanceOf[js.Any])
    if (bindDN != null) __obj.updateDynamic("bindDN")(bindDN.asInstanceOf[js.Any])
    if (binder != null) __obj.updateDynamic("binder")(binder.asInstanceOf[js.Any])
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (!js.isUndefined(connectTimeout)) __obj.updateDynamic("connectTimeout")(connectTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(idleTimeout)) __obj.updateDynamic("idleTimeout")(idleTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxConnections)) __obj.updateDynamic("maxConnections")(maxConnections.get.asInstanceOf[js.Any])
    if (reconnect != null) __obj.updateDynamic("reconnect")(reconnect.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (tlsOptions != null) __obj.updateDynamic("tlsOptions")(tlsOptions.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base]
  }
}

