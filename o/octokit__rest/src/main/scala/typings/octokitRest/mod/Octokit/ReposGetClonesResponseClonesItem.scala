package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetClonesResponseClonesItem extends js.Object {
  var count: Double
  var timestamp: String
  var uniques: Double
}

object ReposGetClonesResponseClonesItem {
  @scala.inline
  def apply(count: Double, timestamp: String, uniques: Double): ReposGetClonesResponseClonesItem = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], uniques = uniques.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposGetClonesResponseClonesItem]
  }
}

