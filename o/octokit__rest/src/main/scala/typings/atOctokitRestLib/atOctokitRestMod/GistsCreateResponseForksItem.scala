package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsCreateResponseForksItem extends js.Object {
  var created_at: java.lang.String
  var id: java.lang.String
  var updated_at: java.lang.String
  var url: java.lang.String
  var user: GistsCreateResponseForksItemUser
}

object GistsCreateResponseForksItem {
  @scala.inline
  def apply(
    created_at: java.lang.String,
    id: java.lang.String,
    updated_at: java.lang.String,
    url: java.lang.String,
    user: GistsCreateResponseForksItemUser
  ): GistsCreateResponseForksItem = {
    val __obj = js.Dynamic.literal(created_at = created_at, id = id, updated_at = updated_at, url = url, user = user)
  
    __obj.asInstanceOf[GistsCreateResponseForksItem]
  }
}

