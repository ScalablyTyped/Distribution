package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// even this is just a forward declaration some properties are added otherwise
// it would be allowed to pass anything to e.g. Buffer.from()
@js.native
trait SharedArrayBuffer extends js.Object {
  val byteLength: Double = js.native
  def slice(): SharedArrayBuffer = js.native
  def slice(begin: Double): SharedArrayBuffer = js.native
  def slice(begin: Double, end: Double): SharedArrayBuffer = js.native
}

