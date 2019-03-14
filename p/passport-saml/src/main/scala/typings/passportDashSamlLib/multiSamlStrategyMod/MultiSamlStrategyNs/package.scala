package typings
package passportDashSamlLib.multiSamlStrategyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object MultiSamlStrategyNs {
  type SamlOptionsCallback = js.Function2[
    /* err */ stdLib.Error | scala.Null, 
    /* samlOptions */ js.UndefOr[passportDashSamlLib.passportDashSamlMod.SamlConfig], 
    scala.Unit
  ]
}
