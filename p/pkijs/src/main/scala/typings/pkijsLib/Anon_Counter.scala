package typings
package pkijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Counter extends js.Object {
  var counter: scala.Double
  var result: stdLib.ArrayBuffer
}

object Anon_Counter {
  @scala.inline
  def apply(counter: scala.Double, result: stdLib.ArrayBuffer): Anon_Counter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("counter")(counter)
    __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[Anon_Counter]
  }
}

