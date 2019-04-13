package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttachedParam0 extends js.Object {
  def attached(param0: java.lang.String): scala.Unit
}

object Anon_AttachedParam0 {
  @scala.inline
  def apply(attached: java.lang.String => scala.Unit): Anon_AttachedParam0 = {
    val __obj = js.Dynamic.literal(attached = js.Any.fromFunction1(attached))
  
    __obj.asInstanceOf[Anon_AttachedParam0]
  }
}

