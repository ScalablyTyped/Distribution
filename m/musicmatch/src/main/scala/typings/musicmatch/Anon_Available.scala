package typings.musicmatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Available extends js.Object {
  var available: Double
  var execute_time: Double
  var status_code: Double
}

object Anon_Available {
  @scala.inline
  def apply(available: Double, execute_time: Double, status_code: Double): Anon_Available = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], execute_time = execute_time.asInstanceOf[js.Any], status_code = status_code.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Available]
  }
}

