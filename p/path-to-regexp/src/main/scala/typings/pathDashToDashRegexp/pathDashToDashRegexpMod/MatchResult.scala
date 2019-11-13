package typings.pathDashToDashRegexp.pathDashToDashRegexpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchResult[P /* <: js.Object */] extends Match[P] {
  var index: Double
  var params: P
  var path: String
}

object MatchResult {
  @scala.inline
  def apply[P /* <: js.Object */](index: Double, params: P, path: String): MatchResult[P] = {
    val __obj = js.Dynamic.literal(index = index, params = params.asInstanceOf[js.Any], path = path)
  
    __obj.asInstanceOf[MatchResult[P]]
  }
}

