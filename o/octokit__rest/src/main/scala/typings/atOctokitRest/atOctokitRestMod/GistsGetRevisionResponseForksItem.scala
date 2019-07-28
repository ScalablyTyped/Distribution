package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsGetRevisionResponseForksItem extends js.Object {
  var created_at: String
  var id: String
  var updated_at: String
  var url: String
  var user: GistsGetRevisionResponseForksItemUser
}

object GistsGetRevisionResponseForksItem {
  @scala.inline
  def apply(
    created_at: String,
    id: String,
    updated_at: String,
    url: String,
    user: GistsGetRevisionResponseForksItemUser
  ): GistsGetRevisionResponseForksItem = {
    val __obj = js.Dynamic.literal(created_at = created_at, id = id, updated_at = updated_at, url = url, user = user)
  
    __obj.asInstanceOf[GistsGetRevisionResponseForksItem]
  }
}

