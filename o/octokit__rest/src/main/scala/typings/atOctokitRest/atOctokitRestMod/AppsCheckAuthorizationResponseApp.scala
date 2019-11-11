package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsCheckAuthorizationResponseApp extends js.Object {
  var client_id: String
  var name: String
  var url: String
}

object AppsCheckAuthorizationResponseApp {
  @scala.inline
  def apply(client_id: String, name: String, url: String): AppsCheckAuthorizationResponseApp = {
    val __obj = js.Dynamic.literal(client_id = client_id, name = name, url = url)
  
    __obj.asInstanceOf[AppsCheckAuthorizationResponseApp]
  }
}

