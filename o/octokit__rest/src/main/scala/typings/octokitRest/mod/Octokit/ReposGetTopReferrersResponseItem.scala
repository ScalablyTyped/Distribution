package typings.octokitRest.mod.Octokit

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
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], uniques = uniques.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposGetTopReferrersResponseItem]
  }
}

