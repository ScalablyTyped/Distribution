package typings
package ngxDashInfiniteDashScrollLib.srcModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInfiniteScrollAction extends js.Object {
  var payload: InfiniteScrollEvent
  var `type`: java.lang.String
}

object IInfiniteScrollAction {
  @scala.inline
  def apply(payload: InfiniteScrollEvent, `type`: java.lang.String): IInfiniteScrollAction = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("payload")(payload)
    __obj.asInstanceOf[IInfiniteScrollAction]
  }
}

