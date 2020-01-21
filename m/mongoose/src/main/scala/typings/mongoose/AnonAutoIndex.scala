package typings.mongoose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoIndex extends js.Object {
  /**
    * set to false to disable automatic index creation for all
    * models associated with this connection.
    */
  var autoIndex: js.UndefOr[Boolean] = js.undefined
}

object AnonAutoIndex {
  @scala.inline
  def apply(autoIndex: js.UndefOr[Boolean] = js.undefined): AnonAutoIndex = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoIndex)) __obj.updateDynamic("autoIndex")(autoIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoIndex]
  }
}

