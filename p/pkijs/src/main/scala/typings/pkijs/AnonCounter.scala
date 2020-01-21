package typings.pkijs

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCounter extends js.Object {
  var counter: Double
  var result: ArrayBuffer
}

object AnonCounter {
  @scala.inline
  def apply(counter: Double, result: ArrayBuffer): AnonCounter = {
    val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCounter]
  }
}

