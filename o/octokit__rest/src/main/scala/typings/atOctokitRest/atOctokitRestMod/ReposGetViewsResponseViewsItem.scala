package typings.atOctokitRest.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(count = count, timestamp = timestamp, uniques = uniques)
  
    __obj.asInstanceOf[ReposGetViewsResponseViewsItem]
  }
}

