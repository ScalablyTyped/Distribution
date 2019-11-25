package typings.nodeDashHueDashApi

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Createdate extends js.Object {
  var `create date`: Date
  var `last use date`: Date
  var name: String
}

object Anon_Createdate {
  @scala.inline
  def apply(`create date`: Date, `last use date`: Date, name: String): Anon_Createdate = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("create date")(`create date`.asInstanceOf[js.Any])
    __obj.updateDynamic("last use date")(`last use date`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Createdate]
  }
}

