package typings.passportDashBeam.passportDashBeamMod

import typings.express.expressMod.Request
import typings.passportDashBeam.passportDashBeamMod.StrategyNs.IStrategyOption
import typings.passportDashBeam.passportDashBeamMod.StrategyNs.Profile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-beam", "Strategy")
@js.native
class Strategy protected ()
  extends typings.passport.passportMod.Strategy {
  def this(
    options: IStrategyOption,
    verify: js.Function4[
        /* accessToken */ String, 
        /* refreshToken */ String, 
        /* profile */ Profile, 
        /* done */ js.Function2[/* error */ js.Any, /* user */ js.UndefOr[js.Any], Unit], 
        Unit
      ]
  ) = this()
  @JSName("name")
  var name_Strategy: String = js.native
  def authenticate(req: Request): Unit = js.native
  def authenticate(req: Request, options: js.Object): Unit = js.native
}

