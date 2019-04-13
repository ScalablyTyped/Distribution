package typings
package passportDashSamlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object multiSamlStrategyMod {
  type MultiSamlStrategy = passportDashSamlLib.passportDashSamlMod.Strategy
  type SamlOptionsCallback = js.Function2[
    /* err */ stdLib.Error | scala.Null, 
    /* samlOptions */ js.UndefOr[passportDashSamlLib.passportDashSamlMod.SamlConfig], 
    scala.Unit
  ]
}
