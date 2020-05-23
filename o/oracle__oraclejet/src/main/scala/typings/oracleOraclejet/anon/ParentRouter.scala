package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojrouterMod.Router
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParentRouter extends js.Object {
  var direction: String
  var parentRouter: Router
}

object ParentRouter {
  @scala.inline
  def apply(direction: String, parentRouter: Router): ParentRouter = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], parentRouter = parentRouter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParentRouter]
  }
}

