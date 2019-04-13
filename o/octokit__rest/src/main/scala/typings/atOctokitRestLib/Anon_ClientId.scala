package typings
package atOctokitRestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientId extends js.Object {
  var clientId: java.lang.String
  var clientSecret: java.lang.String
}

object Anon_ClientId {
  @scala.inline
  def apply(clientId: java.lang.String, clientSecret: java.lang.String): Anon_ClientId = {
    val __obj = js.Dynamic.literal(clientId = clientId, clientSecret = clientSecret)
  
    __obj.asInstanceOf[Anon_ClientId]
  }
}

