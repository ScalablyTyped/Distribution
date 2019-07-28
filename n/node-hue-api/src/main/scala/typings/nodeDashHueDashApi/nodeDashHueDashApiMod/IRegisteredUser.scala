package typings.nodeDashHueDashApi.nodeDashHueDashApiMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRegisteredUser extends js.Object {
  var accessed: Date
  var created: Date
  var name: String
  var username: String
}

object IRegisteredUser {
  @scala.inline
  def apply(accessed: Date, created: Date, name: String, username: String): IRegisteredUser = {
    val __obj = js.Dynamic.literal(accessed = accessed, created = created, name = name, username = username)
  
    __obj.asInstanceOf[IRegisteredUser]
  }
}

