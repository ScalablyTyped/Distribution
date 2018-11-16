package typings
package nodegitLib.oidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/oid", "Oid")
@js.native
class Oid () extends js.Object {
  def cmp(b: Oid): scala.Double = js.native
  def cpy(): Oid = js.native
  def equal(b: Oid): scala.Double = js.native
  def iszero(): scala.Double = js.native
  def ncmp(b: Oid, len: scala.Double): scala.Double = js.native
  def strcmp(str: java.lang.String): scala.Double = js.native
  def streq(str: java.lang.String): scala.Double = js.native
  def tostrS(): java.lang.String = js.native
}

@JSImport("nodegit/oid", "Oid")
@js.native
object Oid extends js.Object {
  def fromString(str: java.lang.String): nodegitLib.oidMod.Oid = js.native
}

