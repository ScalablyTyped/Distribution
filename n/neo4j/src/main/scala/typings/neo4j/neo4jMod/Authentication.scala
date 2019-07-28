package typings.neo4j.neo4jMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Authentication extends js.Object {
  var password: String
  var username: String
}

object Authentication {
  @scala.inline
  def apply(password: String, username: String): Authentication = {
    val __obj = js.Dynamic.literal(password = password, username = username)
  
    __obj.asInstanceOf[Authentication]
  }
}

