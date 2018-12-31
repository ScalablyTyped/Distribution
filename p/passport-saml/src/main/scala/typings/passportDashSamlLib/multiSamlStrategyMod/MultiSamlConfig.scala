package typings
package passportDashSamlLib.multiSamlStrategyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiSamlConfig
  extends passportDashSamlLib.passportDashSamlMod.SamlConfig {
  def getSamlOptions(
    req: expressLib.expressMod.eNs.Request,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* samlOptions */ passportDashSamlLib.passportDashSamlMod.SamlConfig, 
      scala.Unit
    ]
  ): scala.Unit
}

