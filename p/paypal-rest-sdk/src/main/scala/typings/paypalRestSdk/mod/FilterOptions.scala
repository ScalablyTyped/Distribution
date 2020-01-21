package typings.paypalRestSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterOptions extends js.Object {
  var end_time: String
  var page_size: Double
  var start_time: String
}

object FilterOptions {
  @scala.inline
  def apply(end_time: String, page_size: Double, start_time: String): FilterOptions = {
    val __obj = js.Dynamic.literal(end_time = end_time.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FilterOptions]
  }
}

