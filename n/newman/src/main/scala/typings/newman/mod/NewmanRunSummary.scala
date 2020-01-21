package typings.newman.mod

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
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], globals = globals.asInstanceOf[js.Any], run = run.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewmanRunSummary]
  }
}

