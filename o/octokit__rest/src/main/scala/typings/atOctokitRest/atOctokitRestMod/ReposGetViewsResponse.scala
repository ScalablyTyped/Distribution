package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetViewsResponse extends js.Object {
  var count: Double
  var uniques: Double
  var views: js.Array[ReposGetViewsResponseViewsItem]
}

object ReposGetViewsResponse {
  @scala.inline
  def apply(count: Double, uniques: Double, views: js.Array[ReposGetViewsResponseViewsItem]): ReposGetViewsResponse = {
    val __obj = js.Dynamic.literal(count = count, uniques = uniques, views = views)
  
    __obj.asInstanceOf[ReposGetViewsResponse]
  }
}

