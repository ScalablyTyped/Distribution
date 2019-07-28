package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetTopReferrersResponseItem extends js.Object {
  var count: Double
  var referrer: String
  var uniques: Double
}

object ReposGetTopReferrersResponseItem {
  @scala.inline
  def apply(count: Double, referrer: String, uniques: Double): ReposGetTopReferrersResponseItem = {
    val __obj = js.Dynamic.literal(count = count, referrer = referrer, uniques = uniques)
  
    __obj.asInstanceOf[ReposGetTopReferrersResponseItem]
  }
}

