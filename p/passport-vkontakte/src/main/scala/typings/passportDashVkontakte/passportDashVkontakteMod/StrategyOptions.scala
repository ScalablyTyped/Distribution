package typings.passportDashVkontakte.passportDashVkontakteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptions extends js.Object {
  var apiVersion: js.UndefOr[String] = js.undefined
  var callbackURL: String
  var clientID: String
  var clientSecret: String
  var lang: js.UndefOr[String] = js.undefined
  var profileFields: js.UndefOr[js.Array[String]] = js.undefined
}

object StrategyOptions {
  @scala.inline
  def apply(
    callbackURL: String,
    clientID: String,
    clientSecret: String,
    apiVersion: String = null,
    lang: String = null,
    profileFields: js.Array[String] = null
  ): StrategyOptions = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL, clientID = clientID, clientSecret = clientSecret)
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion)
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (profileFields != null) __obj.updateDynamic("profileFields")(profileFields)
    __obj.asInstanceOf[StrategyOptions]
  }
}

