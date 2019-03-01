package typings
package paperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Roots extends js.Object {
  var roots: js.Array[scala.Double]
  var `type`: java.lang.String
}

object Anon_Roots {
  @scala.inline
  def apply(roots: js.Array[scala.Double], `type`: java.lang.String): Anon_Roots = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("roots")(roots)
    __obj.asInstanceOf[Anon_Roots]
  }
}

