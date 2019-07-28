package typings.nodemailer.libDkimMessageDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Header extends js.Object {
  var key: String
  var line: String
}

object Header {
  @scala.inline
  def apply(key: String, line: String): Header = {
    val __obj = js.Dynamic.literal(key = key, line = line)
  
    __obj.asInstanceOf[Header]
  }
}

