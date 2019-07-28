package typings.passportDashWindowsauth

import typings.ldapjs.ldapjsMod.Client
import typings.node.tlsMod.TlsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Base extends js.Object {
  var base: js.UndefOr[String] = js.undefined
  var bindCredentials: js.UndefOr[String] = js.undefined
  var bindDN: js.UndefOr[String] = js.undefined
  var binder: js.UndefOr[Client] = js.undefined
  var client: js.UndefOr[Client] = js.undefined
  var connectTimeout: js.UndefOr[Double] = js.undefined
  var idleTimeout: js.UndefOr[Double] = js.undefined
  var maxConnections: js.UndefOr[Double] = js.undefined
  var reconnect: js.UndefOr[Boolean | Anon_FailAfter] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var tlsOptions: js.UndefOr[TlsOptions] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object Anon_Base {
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
    reconnect: Boolean | Anon_FailAfter = null,
    timeout: Int | Double = null,
    tlsOptions: TlsOptions = null,
    url: String = null
  ): Anon_Base = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base)
    if (bindCredentials != null) __obj.updateDynamic("bindCredentials")(bindCredentials)
    if (bindDN != null) __obj.updateDynamic("bindDN")(bindDN)
    if (binder != null) __obj.updateDynamic("binder")(binder)
    if (client != null) __obj.updateDynamic("client")(client)
    if (connectTimeout != null) __obj.updateDynamic("connectTimeout")(connectTimeout.asInstanceOf[js.Any])
    if (idleTimeout != null) __obj.updateDynamic("idleTimeout")(idleTimeout.asInstanceOf[js.Any])
    if (maxConnections != null) __obj.updateDynamic("maxConnections")(maxConnections.asInstanceOf[js.Any])
    if (reconnect != null) __obj.updateDynamic("reconnect")(reconnect.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (tlsOptions != null) __obj.updateDynamic("tlsOptions")(tlsOptions)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_Base]
  }
}

