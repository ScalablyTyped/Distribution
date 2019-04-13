package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attached extends js.Object {
  def attached(param0: js.Object): scala.Unit
}

object Anon_Attached {
  @scala.inline
  def apply(attached: js.Object => scala.Unit): Anon_Attached = {
    val __obj = js.Dynamic.literal(attached = js.Any.fromFunction1(attached))
  
    __obj.asInstanceOf[Anon_Attached]
  }
}

