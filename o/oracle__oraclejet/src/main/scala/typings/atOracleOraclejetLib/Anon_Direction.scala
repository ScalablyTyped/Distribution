package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Direction extends js.Object {
  var direction: java.lang.String
  var parameters: js.Object
  var parentRouter: atOracleOraclejetLib.ojrouterMod.Router
}

object Anon_Direction {
  @scala.inline
  def apply(
    direction: java.lang.String,
    parameters: js.Object,
    parentRouter: atOracleOraclejetLib.ojrouterMod.Router
  ): Anon_Direction = {
    val __obj = js.Dynamic.literal(direction = direction, parameters = parameters, parentRouter = parentRouter)
  
    __obj.asInstanceOf[Anon_Direction]
  }
}

