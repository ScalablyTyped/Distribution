package typings
package newmanLib.newmanMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewmanRunSummary extends js.Object {
  var collection: js.Any
  var environment: js.Any
  var error: js.UndefOr[js.Any] = js.undefined
  var globals: js.Any
  var run: NewmanRun
}

object NewmanRunSummary {
  @scala.inline
  def apply(collection: js.Any, environment: js.Any, globals: js.Any, run: NewmanRun, error: js.Any = null): NewmanRunSummary = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("collection")(collection)
    __obj.updateDynamic("environment")(environment)
    __obj.updateDynamic("globals")(globals)
    __obj.updateDynamic("run")(run)
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[NewmanRunSummary]
  }
}

