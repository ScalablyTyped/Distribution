package typings.pdfkit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Count extends js.Object {
  var count: Double
  var start: Double
}

object Count {
  @scala.inline
  def apply(count: Double, start: Double): Count = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
}

