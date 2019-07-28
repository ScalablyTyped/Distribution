package typings.nodeDashGeocoder.nodeDashGeocoderMod

import typings.nodeDashGeocoder.nodeDashGeocoderStrings.http
import typings.nodeDashGeocoder.nodeDashGeocoderStrings.https
import typings.nodeDashGeocoder.nodeDashGeocoderStrings.request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var apiKey: js.UndefOr[String] = js.undefined
  var appCode: js.UndefOr[String] = js.undefined
  var appId: js.UndefOr[String] = js.undefined
  var auth_id: js.UndefOr[String] = js.undefined
  var auth_token: js.UndefOr[String] = js.undefined
  var clientId: js.UndefOr[String] = js.undefined
  var client_id: js.UndefOr[String] = js.undefined
  var client_secret: js.UndefOr[String] = js.undefined
  var country: js.UndefOr[String] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var formatter: js.UndefOr[js.Any] = js.undefined
  var formatterPattern: js.UndefOr[String] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var httpAdapter: js.UndefOr[https | http | request] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var politicalView: js.UndefOr[String] = js.undefined
  var provider: Providers
  var region: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    provider: Providers,
    apiKey: String = null,
    appCode: String = null,
    appId: String = null,
    auth_id: String = null,
    auth_token: String = null,
    clientId: String = null,
    client_id: String = null,
    client_secret: String = null,
    country: String = null,
    email: String = null,
    formatter: js.Any = null,
    formatterPattern: String = null,
    host: String = null,
    httpAdapter: https | http | request = null,
    language: String = null,
    politicalView: String = null,
    region: String = null,
    state: String = null,
    timeout: Int | Double = null
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

