package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DirectionParameters extends js.Object {
  var direction: java.lang.String
  var parameters: js.Object
  var parentRouter: atOracleOraclejetLib.ojrouterMod.Router
}

object Anon_DirectionParameters {
  @scala.inline
  def apply(
    direction: java.lang.String,
    parameters: js.Object,
    parentRouter: atOracleOraclejetLib.ojrouterMod.Router
  ): Anon_DirectionParameters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("direction")(direction)
    __obj.updateDynamic("parameters")(parameters)
    __obj.updateDynamic("parentRouter")(parentRouter)
    __obj.asInstanceOf[Anon_DirectionParameters]
  }
}

