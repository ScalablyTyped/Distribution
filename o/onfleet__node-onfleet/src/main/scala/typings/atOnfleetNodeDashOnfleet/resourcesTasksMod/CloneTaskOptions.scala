package typings.atOnfleetNodeDashOnfleet.resourcesTasksMod

import typings.atOnfleetNodeDashOnfleet.Anon_CompleteAfter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloneTaskOptions extends js.Object {
  var includeBarCodes: Boolean
  var includeDependencies: Boolean
  var includeMetadata: Boolean
  var overrides: js.UndefOr[Anon_CompleteAfter] = js.undefined
}

object CloneTaskOptions {
  @scala.inline
  def apply(
    includeBarCodes: Boolean,
    includeDependencies: Boolean,
    includeMetadata: Boolean,
    overrides: Anon_CompleteAfter = null
  ): CloneTaskOptions = {
    val __obj = js.Dynamic.literal(includeBarCodes = includeBarCodes, includeDependencies = includeDependencies, includeMetadata = includeMetadata)
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    __obj.asInstanceOf[CloneTaskOptions]
  }
}

