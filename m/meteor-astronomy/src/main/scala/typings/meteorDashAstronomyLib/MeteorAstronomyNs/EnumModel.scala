package typings
package meteorDashAstronomyLib.MeteorAstronomyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnumModel[T] extends js.Object {
  var identifiers: js.Array[java.lang.String] | T
  var name: java.lang.String
}

object EnumModel {
  @scala.inline
  def apply[T](identifiers: js.Array[java.lang.String] | T, name: java.lang.String): EnumModel[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("identifiers")(identifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[EnumModel[T]]
  }
}

