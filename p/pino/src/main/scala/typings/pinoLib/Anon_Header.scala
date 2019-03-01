package typings
package pinoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Header extends js.Object {
  var header: java.lang.String
  var statusCode: scala.Double
}

object Anon_Header {
  @scala.inline
  def apply(header: java.lang.String, statusCode: scala.Double): Anon_Header = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("header")(header)
    __obj.updateDynamic("statusCode")(statusCode)
    __obj.asInstanceOf[Anon_Header]
  }
}

