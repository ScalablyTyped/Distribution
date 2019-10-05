package typings.passportDashBeam.passportDashBeamMod

import typings.express.expressMod.Request
import typings.passportDashBeam.passportDashBeamMod.Strategy.IStrategyOption
import typings.passportDashBeam.passportDashBeamMod.Strategy.Profile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-beam", "Strategy")
@js.native
class Strategy_ protected ()
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
  var name_Strategy_ : String = js.native
  def authenticate(req: Request): Unit = js.native
  def authenticate(req: Request, options: js.Object): Unit = js.native
}

