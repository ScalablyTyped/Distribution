package typings.passportBnet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// passport--bnet accepts any options that passport-oauth2 accepts, but add the option region and makes authorizationURL and tokenURL optional
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof passport-oauth2.passport-oauth2._StrategyOptionsBase ]:? passport-oauth2.passport-oauth2._StrategyOptionsBase[P]} */ trait BaseBnetOptions extends js.Object {
  var clientID: String
  var clientSecret: String
  var region: js.UndefOr[String] = js.undefined
}

object BaseBnetOptions {
  @scala.inline
  def apply(clientID: String, clientSecret: String, region: String = null): BaseBnetOptions = {
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseBnetOptions]
  }
}

