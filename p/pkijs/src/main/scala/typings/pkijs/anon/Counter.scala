package typings.pkijs.anon

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Counter extends js.Object {
  var counter: Double
  var result: ArrayBuffer
}

object Counter {
  @scala.inline
  def apply(counter: Double, result: ArrayBuffer): Counter = {
    val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Counter]
  }
}

