package typings
package mongodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DropTargetSession extends js.Object {
  var dropTarget: js.UndefOr[scala.Boolean] = js.undefined
  var session: js.UndefOr[mongodbLib.mongodbMod.ClientSession] = js.undefined
}

object Anon_DropTargetSession {
  @scala.inline
  def apply(
    dropTarget: js.UndefOr[scala.Boolean] = js.undefined,
    session: mongodbLib.mongodbMod.ClientSession = null
  ): Anon_DropTargetSession = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dropTarget)) __obj.updateDynamic("dropTarget")(dropTarget)
    if (session != null) __obj.updateDynamic("session")(session)
    __obj.asInstanceOf[Anon_DropTargetSession]
  }
}

