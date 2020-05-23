package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Total extends js.Object {
  var author: Eventsurl
  var total: Double
  var weeks: js.Array[A]
}

object Total {
  @scala.inline
  def apply(author: Eventsurl, total: Double, weeks: js.Array[A]): Total = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], weeks = weeks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Total]
  }
}

