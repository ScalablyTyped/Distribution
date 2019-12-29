package typings.nodegit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/oid", JSImport.Namespace)
@js.native
object oidMod extends js.Object {
  @js.native
  class Oid () extends js.Object {
    def cmp(b: Oid): Double = js.native
    def cpy(): Oid = js.native
    def equal(b: Oid): Double = js.native
    def iszero(): Double = js.native
    def ncmp(b: Oid, len: Double): Double = js.native
    def strcmp(str: String): Double = js.native
    def streq(str: String): Double = js.native
    def tostrS(): String = js.native
  }
  
  /* static members */
  @js.native
  object Oid extends js.Object {
    def fromString(str: String): Oid = js.native
  }
  
}

