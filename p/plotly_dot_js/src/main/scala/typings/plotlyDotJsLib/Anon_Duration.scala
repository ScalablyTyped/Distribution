package typings
package plotlyDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Duration extends js.Object {
  var duration: scala.Double
  var redraw: scala.Boolean
}

object Anon_Duration {
  @scala.inline
  def apply(duration: scala.Double, redraw: scala.Boolean): Anon_Duration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("redraw")(redraw)
    __obj.asInstanceOf[Anon_Duration]
  }
}

