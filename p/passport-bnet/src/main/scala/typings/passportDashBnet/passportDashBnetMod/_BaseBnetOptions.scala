package typings.passportDashBnet.passportDashBnetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// passport--bnet accepts any options that passport-oauth2 accepts, but add the option region and makes authorizationURL and tokenURL optional
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof passport-oauth2.passport-oauth2._StrategyOptionsBase ]:? passport-oauth2.passport-oauth2._StrategyOptionsBase[P]} */ trait _BaseBnetOptions extends js.Object {
  var clientID: String
  var clientSecret: String
  var region: js.UndefOr[String] = js.undefined
}

object _BaseBnetOptions {
  @scala.inline
  def apply(clientID: String, clientSecret: String, region: String = null): _BaseBnetOptions = {
    val __obj = js.Dynamic.literal(clientID = clientID, clientSecret = clientSecret)
    if (region != null) __obj.updateDynamic("region")(region)
    __obj.asInstanceOf[_BaseBnetOptions]
  }
}

