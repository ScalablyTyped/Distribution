package typings.mongoose.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoIndex extends js.Object {
  /**
    * set to false to disable automatic index creation for all
    * models associated with this connection.
    */
  var autoIndex: js.UndefOr[Boolean] = js.undefined
}

object AutoIndex {
  @scala.inline
  def apply(autoIndex: js.UndefOr[Boolean] = js.undefined): AutoIndex = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoIndex)) __obj.updateDynamic("autoIndex")(autoIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoIndex]
  }
}

