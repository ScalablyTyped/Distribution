package typings
package passportDashWindowsauthLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Base extends js.Object {
  var base: js.UndefOr[java.lang.String] = js.undefined
  var bindCredentials: js.UndefOr[java.lang.String] = js.undefined
  var bindDN: js.UndefOr[java.lang.String] = js.undefined
  var binder: js.UndefOr[ldapjsLib.ldapjsMod.Client] = js.undefined
  var client: js.UndefOr[ldapjsLib.ldapjsMod.Client] = js.undefined
  var connectTimeout: js.UndefOr[scala.Double] = js.undefined
  var idleTimeout: js.UndefOr[scala.Double] = js.undefined
  var maxConnections: js.UndefOr[scala.Double] = js.undefined
  var reconnect: js.UndefOr[scala.Boolean | Anon_FailAfter] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var tlsOptions: js.UndefOr[nodeLib.tlsMod.TlsOptions] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Base {
  @scala.inline
  def apply(
    base: java.lang.String = null,
    bindCredentials: java.lang.String = null,
    bindDN: java.lang.String = null,
    binder: ldapjsLib.ldapjsMod.Client = null,
    client: ldapjsLib.ldapjsMod.Client = null,
    connectTimeout: scala.Int | scala.Double = null,
    idleTimeout: scala.Int | scala.Double = null,
    maxConnections: scala.Int | scala.Double = null,
    reconnect: scala.Boolean | Anon_FailAfter = null,
    timeout: scala.Int | scala.Double = null,
    tlsOptions: nodeLib.tlsMod.TlsOptions = null,
    url: java.lang.String = null
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

