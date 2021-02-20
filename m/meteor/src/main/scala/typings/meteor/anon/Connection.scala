package typings.meteor.anon

import typings.meteor.Meteor.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connection extends StObject {
  
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
  implicit class ConnectionMutableBuilder[Self <: Connection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnection(value: typings.meteor.Meteor.Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
