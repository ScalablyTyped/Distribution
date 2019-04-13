package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsListResponseItem extends js.Object {
  var description: java.lang.String
  var id: scala.Double
  var members_url: java.lang.String
  var name: java.lang.String
  var node_id: java.lang.String
  var parent: scala.Null
  var permission: java.lang.String
  var privacy: java.lang.String
  var repositories_url: java.lang.String
  var slug: java.lang.String
  var url: java.lang.String
}

object TeamsListResponseItem {
  @scala.inline
  def apply(
    description: java.lang.String,
    id: scala.Double,
    members_url: java.lang.String,
    name: java.lang.String,
    node_id: java.lang.String,
    parent: scala.Null,
    permission: java.lang.String,
    privacy: java.lang.String,
    repositories_url: java.lang.String,
    slug: java.lang.String,
    url: java.lang.String
  ): TeamsListResponseItem = {
    val __obj = js.Dynamic.literal(description = description, id = id, members_url = members_url, name = name, node_id = node_id, parent = parent, permission = permission, privacy = privacy, repositories_url = repositories_url, slug = slug, url = url)
  
    __obj.asInstanceOf[TeamsListResponseItem]
  }
}

