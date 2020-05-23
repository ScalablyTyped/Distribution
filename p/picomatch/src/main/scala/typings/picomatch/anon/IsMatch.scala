package typings.picomatch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsMatch extends js.Object {
  var isMatch: Boolean
  var `match`: Boolean
  var output: js.Any
}

object IsMatch {
  @scala.inline
  def apply(isMatch: Boolean, `match`: Boolean, output: js.Any): IsMatch = {
    val __obj = js.Dynamic.literal(isMatch = isMatch.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsMatch]
  }
}

