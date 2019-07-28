package typings.passportDashSaml

import typings.passportDashSaml.passportDashSamlMod.SamlConfig
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object multiSamlStrategyMod {
  type SamlOptionsCallback = js.Function2[/* err */ Error | Null, /* samlOptions */ js.UndefOr[SamlConfig], Unit]
}
