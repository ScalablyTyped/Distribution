package typings.meyda.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Imag extends js.Object {
  var imag: js.Array[Double]
  var real: js.Array[Double]
}

object Imag {
  @scala.inline
  def apply(imag: js.Array[Double], real: js.Array[Double]): Imag = {
    val __obj = js.Dynamic.literal(imag = imag.asInstanceOf[js.Any], real = real.asInstanceOf[js.Any])
    __obj.asInstanceOf[Imag]
  }
}

