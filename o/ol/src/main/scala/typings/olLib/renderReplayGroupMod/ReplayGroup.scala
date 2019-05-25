package typings
package olLib.renderReplayGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplayGroup extends js.Object {
  def addDeclutter(group: scala.Boolean): js.Array[_]
  def getReplay(zIndex: scala.Double, replayType: olLib.renderReplayTypeMod.ReplayType): olLib.renderVectorContextMod.default
  def isEmpty(): scala.Boolean
}

object ReplayGroup {
  @scala.inline
  def apply(
    addDeclutter: scala.Boolean => js.Array[_],
    getReplay: (scala.Double, olLib.renderReplayTypeMod.ReplayType) => olLib.renderVectorContextMod.default,
    isEmpty: () => scala.Boolean
  ): ReplayGroup = {
    val __obj = js.Dynamic.literal(addDeclutter = js.Any.fromFunction1(addDeclutter), getReplay = js.Any.fromFunction2(getReplay), isEmpty = js.Any.fromFunction0(isEmpty))
  
    __obj.asInstanceOf[ReplayGroup]
  }
}

