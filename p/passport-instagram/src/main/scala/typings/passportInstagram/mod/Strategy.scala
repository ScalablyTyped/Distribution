package typings.passportInstagram.mod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-instagram", "Strategy")
@js.native
class Strategy protected ()
  extends typings.passport.mod.Strategy {
  def this(
    options: StrategyOptionWithRequest,
    verify: js.Function5[
        /* req */ Request_[ParamsDictionary], 
        /* accessToken */ String, 
        /* refreshToken */ String, 
        /* profile */ Profile, 
        /* done */ js.Function2[/* error */ js.Any, /* user */ js.UndefOr[js.Any], Unit], 
        Unit
      ]
  ) = this()
  def this(
    options: StrategyOption,
    verify: js.Function4[
        /* accessToken */ String, 
        /* refreshToken */ String, 
        /* profile */ Profile, 
        /* done */ js.Function2[/* error */ js.Any, /* user */ js.UndefOr[js.Any], Unit], 
        Unit
      ]
  ) = this()
  def authenticate(req: Request_[ParamsDictionary], options: js.Object): Unit = js.native
}

