package typings.ngxDashInfiniteDashScroll.srcModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInfiniteScrollAction extends js.Object {
  var payload: IInfiniteScrollEvent
  var `type`: String
}

object IInfiniteScrollAction {
  @scala.inline
  def apply(payload: IInfiniteScrollEvent, `type`: String): IInfiniteScrollAction = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInfiniteScrollAction]
  }
}

