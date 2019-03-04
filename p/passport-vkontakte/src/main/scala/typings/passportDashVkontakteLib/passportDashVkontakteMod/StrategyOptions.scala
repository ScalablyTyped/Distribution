package typings
package passportDashVkontakteLib.passportDashVkontakteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptions extends js.Object {
  var apiVersion: js.UndefOr[java.lang.String] = js.undefined
  var callbackURL: java.lang.String
  var clientID: java.lang.String
  var clientSecret: java.lang.String
  var lang: js.UndefOr[java.lang.String] = js.undefined
  var profileFields: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object StrategyOptions {
  @scala.inline
  def apply(
    callbackURL: java.lang.String,
    clientID: java.lang.String,
    clientSecret: java.lang.String,
    apiVersion: java.lang.String = null,
    lang: java.lang.String = null,
    profileFields: js.Array[java.lang.String] = null
  ): StrategyOptions = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL, clientID = clientID, clientSecret = clientSecret)
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion)
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (profileFields != null) __obj.updateDynamic("profileFields")(profileFields)
    __obj.asInstanceOf[StrategyOptions]
  }
}

