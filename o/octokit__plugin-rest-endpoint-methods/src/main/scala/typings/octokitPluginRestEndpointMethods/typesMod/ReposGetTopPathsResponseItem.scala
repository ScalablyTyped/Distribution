package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetTopPathsResponseItem extends js.Object {
  var count: Double
  var path: String
  var title: String
  var uniques: Double
}

object ReposGetTopPathsResponseItem {
  @scala.inline
  def apply(count: Double, path: String, title: String, uniques: Double): ReposGetTopPathsResponseItem = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], uniques = uniques.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposGetTopPathsResponseItem]
  }
}

