package typings
package meteorDashTypingsLib.meteorEjsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EJSONableCustomType extends js.Object {
  def equals(other: js.Object): scala.Boolean
  def toJSONValue(): JSONable
  def typeName(): java.lang.String
}

