package typings.natural.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubstringDistanceResult extends js.Object {
  var distance: Double
  var substring: String
}

object SubstringDistanceResult {
  @scala.inline
  def apply(distance: Double, substring: String): SubstringDistanceResult = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], substring = substring.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SubstringDistanceResult]
  }
}

