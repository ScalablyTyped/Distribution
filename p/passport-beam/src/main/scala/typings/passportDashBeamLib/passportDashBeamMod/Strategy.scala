package typings
package passportDashBeamLib.passportDashBeamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-beam", "Strategy")
@js.native
class Strategy protected ()
  extends passportLib.passportMod.passportNs.Strategy {
  def this(options: passportDashBeamLib.passportDashBeamMod.StrategyNs.IStrategyOption, verify: js.Function4[
      /* accessToken */ java.lang.String, 
      /* refreshToken */ java.lang.String, 
      /* profile */ passportDashBeamLib.passportDashBeamMod.StrategyNs.Profile, 
      /* done */ js.Function2[/* error */ js.Any, /* user */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ]) = this()
  @JSName("name")
  var name_Strategy: java.lang.String = js.native
  def authenticate(req: expressLib.expressMod.eNs.Request): scala.Unit = js.native
  def authenticate(req: expressLib.expressMod.eNs.Request, options: js.Object): scala.Unit = js.native
}

