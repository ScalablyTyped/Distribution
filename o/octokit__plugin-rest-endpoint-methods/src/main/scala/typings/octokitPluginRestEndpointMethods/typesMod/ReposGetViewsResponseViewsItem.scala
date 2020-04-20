package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetViewsResponseViewsItem extends js.Object {
  var count: Double
  var timestamp: String
  var uniques: Double
}

object ReposGetViewsResponseViewsItem {
  @scala.inline
  def apply(count: Double, timestamp: String, uniques: Double): ReposGetViewsResponseViewsItem = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], uniques = uniques.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetViewsResponseViewsItem]
  }
}

