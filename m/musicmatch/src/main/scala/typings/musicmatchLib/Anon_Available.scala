package typings
package musicmatchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Available extends js.Object {
  var available: scala.Double
  var execute_time: scala.Double
  var status_code: scala.Double
}

object Anon_Available {
  @scala.inline
  def apply(available: scala.Double, execute_time: scala.Double, status_code: scala.Double): Anon_Available = {
    val __obj = js.Dynamic.literal(available = available, execute_time = execute_time, status_code = status_code)
  
    __obj.asInstanceOf[Anon_Available]
  }
}

