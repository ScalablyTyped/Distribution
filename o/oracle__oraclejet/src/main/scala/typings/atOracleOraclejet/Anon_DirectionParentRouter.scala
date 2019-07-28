package typings.atOracleOraclejet

import typings.atOracleOraclejet.ojrouterMod.Router
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DirectionParentRouter extends js.Object {
  var direction: String
  var parentRouter: Router
}

object Anon_DirectionParentRouter {
  @scala.inline
  def apply(direction: String, parentRouter: Router): Anon_DirectionParentRouter = {
    val __obj = js.Dynamic.literal(direction = direction, parentRouter = parentRouter)
  
    __obj.asInstanceOf[Anon_DirectionParentRouter]
  }
}

