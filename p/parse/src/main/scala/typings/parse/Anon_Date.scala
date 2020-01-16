package typings.parse

import typings.parse.parseMod._Global_.Parse.Object._Encode
import typings.parse.parseStrings.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Date
  extends _Encode[js.Any] {
  var __type: Date
  var iso: String
}

object Anon_Date {
  @scala.inline
  def apply(__type: Date, iso: String): Anon_Date = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], iso = iso.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Date]
  }
}

