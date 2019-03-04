package typings
package numeralLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Format extends js.Object {
  var format: stdLib.RegExp
  var unformat: stdLib.RegExp
}

object Anon_Format {
  @scala.inline
  def apply(format: stdLib.RegExp, unformat: stdLib.RegExp): Anon_Format = {
    val __obj = js.Dynamic.literal(format = format, unformat = unformat)
  
    __obj.asInstanceOf[Anon_Format]
  }
}

