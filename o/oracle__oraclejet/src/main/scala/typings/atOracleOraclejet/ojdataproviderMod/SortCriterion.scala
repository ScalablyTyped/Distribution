package typings.atOracleOraclejet.ojdataproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortCriterion[D] extends js.Object {
  var attribute: String
  var direction: String
}

object SortCriterion {
  @scala.inline
  def apply[D](attribute: String, direction: String): SortCriterion[D] = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SortCriterion[D]]
  }
}

