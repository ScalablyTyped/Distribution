package typings.pino

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Header extends js.Object {
  var header: String
  var statusCode: Double
}

object Anon_Header {
  @scala.inline
  def apply(header: String, statusCode: Double): Anon_Header = {
    val __obj = js.Dynamic.literal(header = header, statusCode = statusCode)
  
    __obj.asInstanceOf[Anon_Header]
  }
}

