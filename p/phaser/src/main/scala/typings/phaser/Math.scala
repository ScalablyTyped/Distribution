package typings.phaser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Math extends js.Object {
  def fround(n: Double): Double
}

object Math {
  @scala.inline
  def apply(fround: Double => Double): Math = {
    val __obj = js.Dynamic.literal(fround = js.Any.fromFunction1(fround))
    __obj.asInstanceOf[Math]
  }
}

