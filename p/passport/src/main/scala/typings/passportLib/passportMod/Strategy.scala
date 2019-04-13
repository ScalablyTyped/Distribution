package typings
package passportLib.passportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Strategy extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.native
  def authenticate(
    `this`: StrategyCreated[this.type, this.type with StrategyCreatedStatic],
    req: expressLib.expressMod.Request
  ): js.Any = js.native
  def authenticate(
    `this`: StrategyCreated[this.type, this.type with StrategyCreatedStatic],
    req: expressLib.expressMod.Request,
    options: js.Any
  ): js.Any = js.native
}

