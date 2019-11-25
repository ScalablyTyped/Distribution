package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetClonesResponse extends js.Object {
  var clones: js.Array[ReposGetClonesResponseClonesItem]
  var count: Double
  var uniques: Double
}

object ReposGetClonesResponse {
  @scala.inline
  def apply(clones: js.Array[ReposGetClonesResponseClonesItem], count: Double, uniques: Double): ReposGetClonesResponse = {
    val __obj = js.Dynamic.literal(clones = clones.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], uniques = uniques.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposGetClonesResponse]
  }
}

