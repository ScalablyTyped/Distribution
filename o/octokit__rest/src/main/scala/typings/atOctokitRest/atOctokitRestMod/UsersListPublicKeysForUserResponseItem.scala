package typings.atOctokitRest.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(id = id, key = key)
  
    __obj.asInstanceOf[UsersListPublicKeysForUserResponseItem]
  }
}

