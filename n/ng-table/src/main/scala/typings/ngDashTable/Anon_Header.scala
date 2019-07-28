package typings.ngDashTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Header extends js.Object {
  var header: String
  var pagination: String
}

object Anon_Header {
  @scala.inline
  def apply(header: String, pagination: String): Anon_Header = {
    val __obj = js.Dynamic.literal(header = header, pagination = pagination)
  
    __obj.asInstanceOf[Anon_Header]
  }
}

