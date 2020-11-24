package typings.passportHttpBearer.mod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("passport-http-bearer", "Strategy")
@js.native
class Strategy[T /* <: VerifyFunctions */] protected ()
  extends typings.passport.mod.Strategy {
  def this(verify: VerifyFunction) = this()
  def this(options: IStrategyOptions, verify: T) = this()
  
  def authenticate(req: Request_[ParamsDictionary, _, _, Query], options: js.Object): Unit = js.native
}
