package typings.oracleOraclejet

import typings.oracleOraclejet.ojrouterMod.Router
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParentRouter extends js.Object {
  var direction: String
  var parentRouter: Router
}

object AnonParentRouter {
  @scala.inline
  def apply(direction: String, parentRouter: Router): AnonParentRouter = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], parentRouter = parentRouter.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonParentRouter]
  }
}

