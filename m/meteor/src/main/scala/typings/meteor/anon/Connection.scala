package typings.meteor.anon

import typings.meteor.Meteor.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection extends js.Object {
  var connection: typings.meteor.Meteor.Connection = js.native
  var user: User = js.native
}

object Connection {
  @scala.inline
  def apply(connection: typings.meteor.Meteor.Connection, user: User): Connection = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connection]
  }
  @scala.inline
  implicit class ConnectionOps[Self <: Connection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConnection(value: typings.meteor.Meteor.Connection): Self = this.set("connection", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: User): Self = this.set("user", value.asInstanceOf[js.Any])
  }
  
}

