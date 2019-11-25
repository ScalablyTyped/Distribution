package typings.nuclearDashJs.nuclearDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactorConfig extends js.Object {
  /** If true it will log the entire app state for every dispatch. */
  var debug: js.UndefOr[Boolean] = js.undefined
}

object ReactorConfig {
  @scala.inline
  def apply(debug: js.UndefOr[Boolean] = js.undefined): ReactorConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactorConfig]
  }
}

