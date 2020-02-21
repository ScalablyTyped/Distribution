package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

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
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], uniques = uniques.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposGetViewsResponse]
  }
}

