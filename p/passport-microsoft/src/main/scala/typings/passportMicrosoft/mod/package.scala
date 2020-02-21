package typings.passportMicrosoft

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type MicrosoftStrategyOptions = (typings.std.Omit[
    typings.passportOauth2.mod.StrategyOptions, 
    typings.passportMicrosoft.mod.OptionalOptionParameters
  ]) with typings.std.Partial[typings.passportOauth2.mod.StrategyOptions]
  type MicrosoftStrategyOptionsWithRequest = (typings.std.Omit[
    typings.passportOauth2.mod.StrategyOptionsWithRequest, 
    typings.passportMicrosoft.mod.OptionalOptionParameters
  ]) with typings.std.Partial[typings.passportOauth2.mod.StrategyOptionsWithRequest]
}
