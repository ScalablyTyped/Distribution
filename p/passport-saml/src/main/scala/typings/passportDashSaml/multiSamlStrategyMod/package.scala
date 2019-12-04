package typings.passportDashSaml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object multiSamlStrategyMod {
  import typings.passportDashSaml.passportDashSamlMod.SamlConfig
  import typings.std.Error

  type SamlOptionsCallback = js.Function2[/* err */ Error | Null, /* samlOptions */ js.UndefOr[SamlConfig], Unit]
}
