package typings.mrz.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Range extends js.Object {
  var end: Double
  var line: Double
  var raw: String
  var start: Double
}

object Range {
  @scala.inline
  def apply(end: Double, line: Double, raw: String, start: Double): Range = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
}

