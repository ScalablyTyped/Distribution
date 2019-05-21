package typings
package nodemailerLib.libDkimMessageDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Header extends js.Object {
  var key: java.lang.String
  var line: java.lang.String
}

object Header {
  @scala.inline
  def apply(key: java.lang.String, line: java.lang.String): Header = {
    val __obj = js.Dynamic.literal(key = key, line = line)
  
    __obj.asInstanceOf[Header]
  }
}

