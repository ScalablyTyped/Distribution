package typings.phoenix.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Diff extends js.Object {
  var diff: String
  var state: String
}

object Diff {
  @scala.inline
  def apply(diff: String, state: String): Diff = {
    val __obj = js.Dynamic.literal(diff = diff.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diff]
  }
}

