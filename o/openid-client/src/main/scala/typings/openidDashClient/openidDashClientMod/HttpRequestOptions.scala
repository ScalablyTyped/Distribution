package typings.openidDashClient.openidDashClientMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.httpMod.Agent
import typings.node.tlsMod.SecureContextOptions
import typings.node.tlsMod.SecureVersion
import typings.openidDashClient.Anon_408
import typings.openidDashClient.Anon_Connect
import typings.openidDashClient.Anon_Http
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpRequestOptions
  extends SecureContextOptions
     with /* key */ StringDictionary[js.Any] {
  var agent: js.UndefOr[Agent | typings.node.httpsMod.Agent | Boolean | Anon_Http] = js.undefined
  var body: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var followRedirect: js.UndefOr[Boolean] = js.undefined
  var form: js.UndefOr[Boolean] = js.undefined
  var headers: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var json: js.UndefOr[Boolean] = js.undefined
  var query: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var retry: js.UndefOr[Double | Anon_408] = js.undefined
  var throwHttpErrors: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double | Anon_Connect] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object HttpRequestOptions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    agent: Agent | typings.node.httpsMod.Agent | Boolean | Anon_Http = null,
    body: StringDictionary[js.Any] = null,
    ca: String | Buffer | (js.Array[String | Buffer]) = null,
    cert: String | Buffer | (js.Array[String | Buffer]) = null,
    ciphers: String = null,
    clientCertEngine: String = null,
    crl: String | Buffer | (js.Array[String | Buffer]) = null,
    dhparam: String | Buffer = null,
    ecdhCurve: String = null,
    followRedirect: js.UndefOr[Boolean] = js.undefined,
    form: js.UndefOr[Boolean] = js.undefined,
    headers: StringDictionary[js.Any] = null,
    honorCipherOrder: js.UndefOr[Boolean] = js.undefined,
    json: js.UndefOr[Boolean] = js.undefined,
    key: String | Buffer | (js.Array[Buffer | js.Object]) = null,
    maxVersion: SecureVersion = null,
    minVersion: SecureVersion = null,
    passphrase: String = null,
    pfx: String | Buffer | (js.Array[String | Buffer | js.Object]) = null,
    query: StringDictionary[js.Any] = null,
    retry: Double | Anon_408 = null,
    secureOptions: Int | Double = null,
    secureProtocol: String = null,
    sessionIdContext: String = null,
    throwHttpErrors: js.UndefOr[Boolean] = js.undefined,
    timeout: Double | Anon_Connect = null,
    url: String = null
  ): HttpRequestOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers.asInstanceOf[js.Any])
    if (clientCertEngine != null) __obj.updateDynamic("clientCertEngine")(clientCertEngine.asInstanceOf[js.Any])
    if (crl != null) __obj.updateDynamic("crl")(crl.asInstanceOf[js.Any])
    if (dhparam != null) __obj.updateDynamic("dhparam")(dhparam.asInstanceOf[js.Any])
    if (ecdhCurve != null) __obj.updateDynamic("ecdhCurve")(ecdhCurve.asInstanceOf[js.Any])
    if (!js.isUndefined(followRedirect)) __obj.updateDynamic("followRedirect")(followRedirect.asInstanceOf[js.Any])
    if (!js.isUndefined(form)) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(honorCipherOrder)) __obj.updateDynamic("honorCipherOrder")(honorCipherOrder.asInstanceOf[js.Any])
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxVersion != null) __obj.updateDynamic("maxVersion")(maxVersion.asInstanceOf[js.Any])
    if (minVersion != null) __obj.updateDynamic("minVersion")(minVersion.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase.asInstanceOf[js.Any])
    if (pfx != null) __obj.updateDynamic("pfx")(pfx.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (retry != null) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    if (secureOptions != null) __obj.updateDynamic("secureOptions")(secureOptions.asInstanceOf[js.Any])
    if (secureProtocol != null) __obj.updateDynamic("secureProtocol")(secureProtocol.asInstanceOf[js.Any])
    if (sessionIdContext != null) __obj.updateDynamic("sessionIdContext")(sessionIdContext.asInstanceOf[js.Any])
    if (!js.isUndefined(throwHttpErrors)) __obj.updateDynamic("throwHttpErrors")(throwHttpErrors.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpRequestOptions]
  }
}

