package typings.pkijs

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Counter extends js.Object {
  var counter: Double
  var result: ArrayBuffer
}

object Anon_Counter {
  @scala.inline
  def apply(counter: Double, result: ArrayBuffer): Anon_Counter = {
    val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Counter]
  }
}

