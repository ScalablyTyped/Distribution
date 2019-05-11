package typings
package phaserLib.PhaserNs.TypesNs.MathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinCosTable extends js.Object {
  /**
    * The cosine value.
    */
  var cos: scala.Double
  /**
    * The length.
    */
  var length: scala.Double
  /**
    * The sine value.
    */
  var sin: scala.Double
}

object SinCosTable {
  @scala.inline
  def apply(cos: scala.Double, length: scala.Double, sin: scala.Double): SinCosTable = {
    val __obj = js.Dynamic.literal(cos = cos, length = length, sin = sin)
  
    __obj.asInstanceOf[SinCosTable]
  }
}

