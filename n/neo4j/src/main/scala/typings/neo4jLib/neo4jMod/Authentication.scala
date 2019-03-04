package typings
package neo4jLib.neo4jMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Authentication extends js.Object {
  var password: java.lang.String
  var username: java.lang.String
}

object Authentication {
  @scala.inline
  def apply(password: java.lang.String, username: java.lang.String): Authentication = {
    val __obj = js.Dynamic.literal(password = password, username = username)
  
    __obj.asInstanceOf[Authentication]
  }
}

