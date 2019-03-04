package typings
package nodeDashHueDashApiLib.nodeDashHueDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRegisteredUser extends js.Object {
  var accessed: stdLib.Date
  var created: stdLib.Date
  var name: java.lang.String
  var username: java.lang.String
}

object IRegisteredUser {
  @scala.inline
  def apply(accessed: stdLib.Date, created: stdLib.Date, name: java.lang.String, username: java.lang.String): IRegisteredUser = {
    val __obj = js.Dynamic.literal(accessed = accessed, created = created, name = name, username = username)
  
    __obj.asInstanceOf[IRegisteredUser]
  }
}

