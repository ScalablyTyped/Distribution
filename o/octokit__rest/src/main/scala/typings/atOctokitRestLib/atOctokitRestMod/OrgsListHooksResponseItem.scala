package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsListHooksResponseItem extends js.Object {
  var active: scala.Boolean
  var config: OrgsListHooksResponseItemConfig
  var created_at: java.lang.String
  var events: js.Array[java.lang.String]
  var id: scala.Double
  var name: java.lang.String
  var ping_url: java.lang.String
  var updated_at: java.lang.String
  var url: java.lang.String
}

object OrgsListHooksResponseItem {
  @scala.inline
  def apply(
    active: scala.Boolean,
    config: OrgsListHooksResponseItemConfig,
    created_at: java.lang.String,
    events: js.Array[java.lang.String],
    id: scala.Double,
    name: java.lang.String,
    ping_url: java.lang.String,
    updated_at: java.lang.String,
    url: java.lang.String
  ): OrgsListHooksResponseItem = {
    val __obj = js.Dynamic.literal(active = active, config = config, created_at = created_at, events = events, id = id, name = name, ping_url = ping_url, updated_at = updated_at, url = url)
  
    __obj.asInstanceOf[OrgsListHooksResponseItem]
  }
}

