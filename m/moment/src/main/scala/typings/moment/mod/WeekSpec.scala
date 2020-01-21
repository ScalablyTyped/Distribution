package typings.moment.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WeekSpec extends js.Object {
  var dow: Double
  var doy: Double
}

object WeekSpec {
  @scala.inline
  def apply(dow: Double, doy: Double): WeekSpec = {
    val __obj = js.Dynamic.literal(dow = dow.asInstanceOf[js.Any], doy = doy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WeekSpec]
  }
}

