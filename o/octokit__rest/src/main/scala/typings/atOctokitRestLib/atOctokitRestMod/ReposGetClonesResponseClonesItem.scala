package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetClonesResponseClonesItem extends js.Object {
  var count: scala.Double
  var timestamp: java.lang.String
  var uniques: scala.Double
}

object ReposGetClonesResponseClonesItem {
  @scala.inline
  def apply(count: scala.Double, timestamp: java.lang.String, uniques: scala.Double): ReposGetClonesResponseClonesItem = {
    val __obj = js.Dynamic.literal(count = count, timestamp = timestamp, uniques = uniques)
  
    __obj.asInstanceOf[ReposGetClonesResponseClonesItem]
  }
}

