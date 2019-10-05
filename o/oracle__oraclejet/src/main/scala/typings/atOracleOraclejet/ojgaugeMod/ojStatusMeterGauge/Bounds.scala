package typings.atOracleOraclejet.ojgaugeMod.ojStatusMeterGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait Bounds extends js.Object {
  var height: Double
  var width: Double
  var x: Double
  var y: Double
}

object Bounds {
  @scala.inline
  def apply(height: Double, width: Double, x: Double, y: Double): Bounds = {
    val __obj = js.Dynamic.literal(height = height, width = width, x = x, y = y)
  
    __obj.asInstanceOf[Bounds]
  }
}

