package typings.passport.passportMod

import typings.express.expressMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Strategy extends js.Object {
  var name: js.UndefOr[String] = js.native
  def authenticate(`this`: StrategyCreated[this.type, this.type with StrategyCreatedStatic], req: Request): js.Any = js.native
  def authenticate(
    `this`: StrategyCreated[this.type, this.type with StrategyCreatedStatic],
    req: Request,
    options: js.Any
  ): js.Any = js.native
}

