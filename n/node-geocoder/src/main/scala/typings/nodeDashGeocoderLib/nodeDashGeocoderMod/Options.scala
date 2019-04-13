package typings
package nodeDashGeocoderLib.nodeDashGeocoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var apiKey: js.UndefOr[java.lang.String] = js.undefined
  var appCode: js.UndefOr[java.lang.String] = js.undefined
  var appId: js.UndefOr[java.lang.String] = js.undefined
  var auth_id: js.UndefOr[java.lang.String] = js.undefined
  var auth_token: js.UndefOr[java.lang.String] = js.undefined
  var clientId: js.UndefOr[java.lang.String] = js.undefined
  var client_id: js.UndefOr[java.lang.String] = js.undefined
  var client_secret: js.UndefOr[java.lang.String] = js.undefined
  var country: js.UndefOr[java.lang.String] = js.undefined
  var email: js.UndefOr[java.lang.String] = js.undefined
  var formatter: js.UndefOr[js.Any] = js.undefined
  var formatterPattern: js.UndefOr[java.lang.String] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var httpAdapter: js.UndefOr[
    nodeDashGeocoderLib.nodeDashGeocoderLibStrings.https | nodeDashGeocoderLib.nodeDashGeocoderLibStrings.http | nodeDashGeocoderLib.nodeDashGeocoderLibStrings.request
  ] = js.undefined
  var language: js.UndefOr[java.lang.String] = js.undefined
  var politicalView: js.UndefOr[java.lang.String] = js.undefined
  var provider: Providers
  var region: js.UndefOr[java.lang.String] = js.undefined
  var state: js.UndefOr[java.lang.String] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    provider: Providers,
    apiKey: java.lang.String = null,
    appCode: java.lang.String = null,
    appId: java.lang.String = null,
    auth_id: java.lang.String = null,
    auth_token: java.lang.String = null,
    clientId: java.lang.String = null,
    client_id: java.lang.String = null,
    client_secret: java.lang.String = null,
    country: java.lang.String = null,
    email: java.lang.String = null,
    formatter: js.Any = null,
    formatterPattern: java.lang.String = null,
    host: java.lang.String = null,
    httpAdapter: nodeDashGeocoderLib.nodeDashGeocoderLibStrings.https | nodeDashGeocoderLib.nodeDashGeocoderLibStrings.http | nodeDashGeocoderLib.nodeDashGeocoderLibStrings.request = null,
    language: java.lang.String = null,
    politicalView: java.lang.String = null,
    region: java.lang.String = null,
    state: java.lang.String = null,
    timeout: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal(provider = provider)
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey)
    if (appCode != null) __obj.updateDynamic("appCode")(appCode)
    if (appId != null) __obj.updateDynamic("appId")(appId)
    if (auth_id != null) __obj.updateDynamic("auth_id")(auth_id)
    if (auth_token != null) __obj.updateDynamic("auth_token")(auth_token)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (client_id != null) __obj.updateDynamic("client_id")(client_id)
    if (client_secret != null) __obj.updateDynamic("client_secret")(client_secret)
    if (country != null) __obj.updateDynamic("country")(country)
    if (email != null) __obj.updateDynamic("email")(email)
    if (formatter != null) __obj.updateDynamic("formatter")(formatter)
    if (formatterPattern != null) __obj.updateDynamic("formatterPattern")(formatterPattern)
    if (host != null) __obj.updateDynamic("host")(host)
    if (httpAdapter != null) __obj.updateDynamic("httpAdapter")(httpAdapter.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language)
    if (politicalView != null) __obj.updateDynamic("politicalView")(politicalView)
    if (region != null) __obj.updateDynamic("region")(region)
    if (state != null) __obj.updateDynamic("state")(state)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

