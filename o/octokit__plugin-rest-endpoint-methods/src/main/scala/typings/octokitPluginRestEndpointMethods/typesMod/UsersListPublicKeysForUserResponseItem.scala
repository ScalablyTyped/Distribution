package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersListPublicKeysForUserResponseItem extends js.Object {
  var id: Double
  var key: String
}

object UsersListPublicKeysForUserResponseItem {
  @scala.inline
  def apply(id: Double, key: String): UsersListPublicKeysForUserResponseItem = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UsersListPublicKeysForUserResponseItem]
  }
}

