package typings.atOctokitRest.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(count = count, path = path, title = title, uniques = uniques)
  
    __obj.asInstanceOf[ReposGetTopPathsResponseItem]
  }
}

