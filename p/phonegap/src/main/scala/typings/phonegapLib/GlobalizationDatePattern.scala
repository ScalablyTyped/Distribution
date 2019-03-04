package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalizationDatePattern extends js.Object {
  var dst_offset: scala.Double
  var pattern: java.lang.String
  var timezone: java.lang.String
  var utc_offset: scala.Double
}

object GlobalizationDatePattern {
  @scala.inline
  def apply(
    dst_offset: scala.Double,
    pattern: java.lang.String,
    timezone: java.lang.String,
    utc_offset: scala.Double
  ): GlobalizationDatePattern = {
    val __obj = js.Dynamic.literal(dst_offset = dst_offset, pattern = pattern, timezone = timezone, utc_offset = utc_offset)
  
    __obj.asInstanceOf[GlobalizationDatePattern]
  }
}

