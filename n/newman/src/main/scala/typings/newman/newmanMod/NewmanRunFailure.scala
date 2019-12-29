package typings.newman.newmanMod

import typings.newman.Anon_Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewmanRunFailure extends js.Object {
  /** The event where the failure occurred */
  var at: String
  var cursor: Anon_Ref | js.Object
  var error: NewmanRunExecutionAssertionError
  var parent: js.Any
  var source: js.UndefOr[NewmanRunExecutionItem] = js.undefined
}

object NewmanRunFailure {
  @scala.inline
  def apply(
    at: String,
    cursor: Anon_Ref | js.Object,
    error: NewmanRunExecutionAssertionError,
    parent: js.Any,
    source: NewmanRunExecutionItem = null
  ): NewmanRunFailure = {
    val __obj = js.Dynamic.literal(at = at.asInstanceOf[js.Any], cursor = cursor.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewmanRunFailure]
  }
}

