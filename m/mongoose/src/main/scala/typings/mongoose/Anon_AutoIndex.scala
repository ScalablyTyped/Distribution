package typings.mongoose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoIndex extends js.Object {
  /**
    * set to false to disable automatic index creation for all
    * models associated with this connection.
    */
  var autoIndex: js.UndefOr[Boolean] = js.undefined
}

object Anon_AutoIndex {
  @scala.inline
  def apply(autoIndex: js.UndefOr[Boolean] = js.undefined): Anon_AutoIndex = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoIndex)) __obj.updateDynamic("autoIndex")(autoIndex)
    __obj.asInstanceOf[Anon_AutoIndex]
  }
}

