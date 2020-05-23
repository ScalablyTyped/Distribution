package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Count
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetViewsResponseData extends js.Object {
  var count: Double
  var uniques: Double
  var views: js.Array[Count]
}

object ReposGetViewsResponseData {
  @scala.inline
  def apply(count: Double, uniques: Double, views: js.Array[Count]): ReposGetViewsResponseData = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], uniques = uniques.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetViewsResponseData]
  }
}

