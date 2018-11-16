package typings
package passportDashGithub2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object passportDashGithub2Mod {
  type OAuth2StrategyOptionsWithoutRequiredURLs = stdLib.Pick[
    passportDashOauth2Lib.passportDashOauth2Mod.OAuth2StrategyNs._StrategyOptionsBase, 
    stdLib.Exclude[
      java.lang.String, 
      passportDashGithub2Lib.passportDashGithub2LibStrings.authorizationURL | passportDashGithub2Lib.passportDashGithub2LibStrings.tokenURL
    ]
  ]
}
