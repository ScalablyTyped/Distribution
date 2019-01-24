package typings
package passportDashGithubLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object passportDashGithubMod {
  type OAuth2StrategyOptionsWithoutRequiredURLs = stdLib.Pick[
    passportDashOauth2Lib.passportDashOauth2Mod.OAuth2StrategyNs._StrategyOptionsBase, 
    stdLib.Exclude[
      java.lang.String, 
      passportDashGithubLib.passportDashGithubLibStrings.authorizationURL | passportDashGithubLib.passportDashGithubLibStrings.tokenURL
    ]
  ]
}
