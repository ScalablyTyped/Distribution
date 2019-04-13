package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetTopPathsResponseItem extends js.Object {
  var count: scala.Double
  var path: java.lang.String
  var title: java.lang.String
  var uniques: scala.Double
}

object ReposGetTopPathsResponseItem {
  @scala.inline
  def apply(count: scala.Double, path: java.lang.String, title: java.lang.String, uniques: scala.Double): ReposGetTopPathsResponseItem = {
    val __obj = js.Dynamic.literal(count = count, path = path, title = title, uniques = uniques)
  
    __obj.asInstanceOf[ReposGetTopPathsResponseItem]
  }
}

