package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalizationDatePattern extends js.Object {
  var dst_offset: Double
  var pattern: String
  var timezone: String
  var utc_offset: Double
}

object GlobalizationDatePattern {
  @scala.inline
  def apply(dst_offset: Double, pattern: String, timezone: String, utc_offset: Double): GlobalizationDatePattern = {
    val __obj = js.Dynamic.literal(dst_offset = dst_offset, pattern = pattern, timezone = timezone, utc_offset = utc_offset)
  
    __obj.asInstanceOf[GlobalizationDatePattern]
  }
}

