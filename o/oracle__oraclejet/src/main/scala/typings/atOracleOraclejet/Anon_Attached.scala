package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attached extends js.Object {
  def attached(param0: js.Object): Unit
}

object Anon_Attached {
  @scala.inline
  def apply(attached: js.Object => Unit): Anon_Attached = {
    val __obj = js.Dynamic.literal(attached = js.Any.fromFunction1(attached))
  
    __obj.asInstanceOf[Anon_Attached]
  }
}

