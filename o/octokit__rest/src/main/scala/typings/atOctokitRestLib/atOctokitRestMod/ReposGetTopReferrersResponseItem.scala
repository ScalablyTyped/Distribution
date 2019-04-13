package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetTopReferrersResponseItem extends js.Object {
  var count: scala.Double
  var referrer: java.lang.String
  var uniques: scala.Double
}

object ReposGetTopReferrersResponseItem {
  @scala.inline
  def apply(count: scala.Double, referrer: java.lang.String, uniques: scala.Double): ReposGetTopReferrersResponseItem = {
    val __obj = js.Dynamic.literal(count = count, referrer = referrer, uniques = uniques)
  
    __obj.asInstanceOf[ReposGetTopReferrersResponseItem]
  }
}

