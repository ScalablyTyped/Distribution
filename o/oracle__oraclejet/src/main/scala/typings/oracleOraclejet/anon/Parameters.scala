package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojrouterMod.Router
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parameters extends js.Object {
  var direction: String
  var parameters: js.Object
  var parentRouter: Router
}

object Parameters {
  @scala.inline
  def apply(direction: String, parameters: js.Object, parentRouter: Router): Parameters = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], parentRouter = parentRouter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters]
  }
}

