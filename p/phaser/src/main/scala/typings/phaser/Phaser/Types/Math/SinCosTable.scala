package typings.phaser.Phaser.Types.Math

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinCosTable extends js.Object {
  /**
    * The cosine value.
    */
  var cos: Double
  /**
    * The length.
    */
  var length: Double
  /**
    * The sine value.
    */
  var sin: Double
}

object SinCosTable {
  @scala.inline
  def apply(cos: Double, length: Double, sin: Double): SinCosTable = {
    val __obj = js.Dynamic.literal(cos = cos.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], sin = sin.asInstanceOf[js.Any])
    __obj.asInstanceOf[SinCosTable]
  }
}

