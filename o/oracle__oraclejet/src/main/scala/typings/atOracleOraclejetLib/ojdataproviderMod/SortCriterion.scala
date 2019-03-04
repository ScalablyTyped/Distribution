package typings
package atOracleOraclejetLib.ojdataproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortCriterion[D] extends js.Object {
  var attribute: java.lang.String
  var direction: java.lang.String
}

object SortCriterion {
  @scala.inline
  def apply[D](attribute: java.lang.String, direction: java.lang.String): SortCriterion[D] = {
    val __obj = js.Dynamic.literal(attribute = attribute, direction = direction)
  
    __obj.asInstanceOf[SortCriterion[D]]
  }
}

