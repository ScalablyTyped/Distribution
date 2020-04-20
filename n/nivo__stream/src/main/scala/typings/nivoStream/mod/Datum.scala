package typings.nivoStream.mod

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
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Datum]
  }
}

