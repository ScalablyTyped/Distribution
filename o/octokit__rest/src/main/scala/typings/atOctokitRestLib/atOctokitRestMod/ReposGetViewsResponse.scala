package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetViewsResponse extends js.Object {
  var count: scala.Double
  var uniques: scala.Double
  var views: js.Array[ReposGetViewsResponseViewsItem]
}

object ReposGetViewsResponse {
  @scala.inline
  def apply(count: scala.Double, uniques: scala.Double, views: js.Array[ReposGetViewsResponseViewsItem]): ReposGetViewsResponse = {
    val __obj = js.Dynamic.literal(count = count, uniques = uniques, views = views)
  
    __obj.asInstanceOf[ReposGetViewsResponse]
  }
}

