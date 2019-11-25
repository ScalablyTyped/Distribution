package typings.atOctokitRest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientId extends js.Object {
  var clientId: String
  var clientSecret: String
}

object Anon_ClientId {
  @scala.inline
  def apply(clientId: String, clientSecret: String): Anon_ClientId = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ClientId]
  }
}

