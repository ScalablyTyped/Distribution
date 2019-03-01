package typings
package pdfkitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Count extends js.Object {
  var count: scala.Double
  var start: scala.Double
}

object Anon_Count {
  @scala.inline
  def apply(count: scala.Double, start: scala.Double): Anon_Count = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("count")(count)
    __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[Anon_Count]
  }
}

