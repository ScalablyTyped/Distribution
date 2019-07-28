package typings.mongodb

import typings.mongodb.mongodbMod.ClientSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DropTargetSession extends js.Object {
  var dropTarget: js.UndefOr[Boolean] = js.undefined
  var session: js.UndefOr[ClientSession] = js.undefined
}

object Anon_DropTargetSession {
  @scala.inline
  def apply(dropTarget: js.UndefOr[Boolean] = js.undefined, session: ClientSession = null): Anon_DropTargetSession = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dropTarget)) __obj.updateDynamic("dropTarget")(dropTarget)
    if (session != null) __obj.updateDynamic("session")(session)
    __obj.asInstanceOf[Anon_DropTargetSession]
  }
}

