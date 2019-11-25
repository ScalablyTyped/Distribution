package typings.phoenix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Diff extends js.Object {
  var diff: String
  var state: String
}

object Anon_Diff {
  @scala.inline
  def apply(diff: String, state: String): Anon_Diff = {
    val __obj = js.Dynamic.literal(diff = diff.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Diff]
  }
}

