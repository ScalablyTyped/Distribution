package typings
package passportDashBnetLib.passportDashBnetMod.BnetStrategyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// passport--bnet accepts any options that passport-oauth2 accepts, but add the option region and makes authorizationURL and tokenURL optional
/* RemoveDifficultInheritance: 
- Lifted 1 members from Set(std.Partial) */ 
trait _BaseBnetOptions extends js.Object {
  var clientID: java.lang.String
  var clientSecret: java.lang.String
  var region: js.UndefOr[java.lang.String] = js.undefined
}

