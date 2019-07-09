package typings
package atNivoStreamLib.atNivoStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Datum extends js.Object {
  var color: java.lang.String
  var index: scala.Double
  var key: java.lang.String
  var value: scala.Double
  var x: scala.Double
  var y1: scala.Double
  var y2: scala.Double
}

object Datum {
  @scala.inline
  def apply(
    color: java.lang.String,
    index: scala.Double,
    key: java.lang.String,
    value: scala.Double,
    x: scala.Double,
    y1: scala.Double,
    y2: scala.Double
  ): Datum = {
    val __obj = js.Dynamic.literal(color = color, index = index, key = key, value = value, x = x, y1 = y1, y2 = y2)
  
    __obj.asInstanceOf[Datum]
  }
}

