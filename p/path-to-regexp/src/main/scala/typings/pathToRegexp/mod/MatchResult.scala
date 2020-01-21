package typings.pathToRegexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchResult[P /* <: js.Object */] extends Match_[P] {
  var index: Double
  var params: P
  var path: String
}

object MatchResult {
  @scala.inline
  def apply[P /* <: js.Object */](index: Double, params: P, path: String): MatchResult[P] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MatchResult[P]]
  }
}

