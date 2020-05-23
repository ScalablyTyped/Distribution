package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Count
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetClonesResponseData extends js.Object {
  var clones: js.Array[Count]
  var count: Double
  var uniques: Double
}

object ReposGetClonesResponseData {
  @scala.inline
  def apply(clones: js.Array[Count], count: Double, uniques: Double): ReposGetClonesResponseData = {
    val __obj = js.Dynamic.literal(clones = clones.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], uniques = uniques.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetClonesResponseData]
  }
}

