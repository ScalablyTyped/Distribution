package typings.meyda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Imag extends js.Object {
  var imag: js.Array[Double]
  var real: js.Array[Double]
}

object Anon_Imag {
  @scala.inline
  def apply(imag: js.Array[Double], real: js.Array[Double]): Anon_Imag = {
    val __obj = js.Dynamic.literal(imag = imag.asInstanceOf[js.Any], real = real.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Imag]
  }
}

