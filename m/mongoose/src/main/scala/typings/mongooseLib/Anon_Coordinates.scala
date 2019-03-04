package typings
package mongooseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Coordinates extends js.Object {
  var coordinates: js.Array[_]
  var `type`: java.lang.String
}

object Anon_Coordinates {
  @scala.inline
  def apply(coordinates: js.Array[_], `type`: java.lang.String): Anon_Coordinates = {
    val __obj = js.Dynamic.literal(coordinates = coordinates)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Coordinates]
  }
}

