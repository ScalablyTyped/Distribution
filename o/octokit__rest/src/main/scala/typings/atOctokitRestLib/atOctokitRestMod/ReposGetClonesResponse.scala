package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetClonesResponse extends js.Object {
  var clones: js.Array[ReposGetClonesResponseClonesItem]
  var count: scala.Double
  var uniques: scala.Double
}

object ReposGetClonesResponse {
  @scala.inline
  def apply(clones: js.Array[ReposGetClonesResponseClonesItem], count: scala.Double, uniques: scala.Double): ReposGetClonesResponse = {
    val __obj = js.Dynamic.literal(clones = clones, count = count, uniques = uniques)
  
    __obj.asInstanceOf[ReposGetClonesResponse]
  }
}

