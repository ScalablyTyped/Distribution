package typings.atOracleOraclejet

import typings.atOracleOraclejet.ojrouterMod.Router
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Direction extends js.Object {
  var direction: String
  var parameters: js.Object
  var parentRouter: Router
}

object Anon_Direction {
  @scala.inline
  def apply(direction: String, parameters: js.Object, parentRouter: Router): Anon_Direction = {
    val __obj = js.Dynamic.literal(direction = direction, parameters = parameters, parentRouter = parentRouter)
  
    __obj.asInstanceOf[Anon_Direction]
  }
}

