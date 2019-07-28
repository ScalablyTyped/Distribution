package typings.atNivoStream.atNivoStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Datum extends js.Object {
  var color: String
  var index: Double
  var key: String
  var value: Double
  var x: Double
  var y1: Double
  var y2: Double
}

object Datum {
  @scala.inline
  def apply(color: String, index: Double, key: String, value: Double, x: Double, y1: Double, y2: Double): Datum = {
    val __obj = js.Dynamic.literal(color = color, index = index, key = key, value = value, x = x, y1 = y1, y2 = y2)
  
    __obj.asInstanceOf[Datum]
  }
}

