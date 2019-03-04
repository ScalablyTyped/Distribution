package typings
package nodeDashHueDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Createdate extends js.Object {
  var `create date`: stdLib.Date
  var `last use date`: stdLib.Date
  var name: java.lang.String
}

object Anon_Createdate {
  @scala.inline
  def apply(`create date`: stdLib.Date, `last use date`: stdLib.Date, name: java.lang.String): Anon_Createdate = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("create date")(`create date`)
    __obj.updateDynamic("last use date")(`last use date`)
    __obj.asInstanceOf[Anon_Createdate]
  }
}

