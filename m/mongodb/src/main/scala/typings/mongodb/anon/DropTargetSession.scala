package typings.mongodb.anon

import typings.mongodb.mod.ClientSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropTargetSession extends js.Object {
  var dropTarget: js.UndefOr[Boolean] = js.undefined
  var session: js.UndefOr[ClientSession] = js.undefined
}

object DropTargetSession {
  @scala.inline
  def apply(dropTarget: js.UndefOr[Boolean] = js.undefined, session: ClientSession = null): DropTargetSession = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dropTarget)) __obj.updateDynamic("dropTarget")(dropTarget.get.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropTargetSession]
  }
}

