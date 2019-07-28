package typings.ol.renderReplayGroupMod

import typings.ol.renderReplayTypeMod.ReplayType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplayGroup extends js.Object {
  def addDeclutter(group: Boolean): js.Array[_]
  def getReplay(zIndex: Double, replayType: ReplayType): typings.ol.renderVectorContextMod.default
  def isEmpty(): Boolean
}

object ReplayGroup {
  @scala.inline
  def apply(
    addDeclutter: Boolean => js.Array[_],
    getReplay: (Double, ReplayType) => typings.ol.renderVectorContextMod.default,
    isEmpty: () => Boolean
  ): ReplayGroup = {
    val __obj = js.Dynamic.literal(addDeclutter = js.Any.fromFunction1(addDeclutter), getReplay = js.Any.fromFunction2(getReplay), isEmpty = js.Any.fromFunction0(isEmpty))
  
    __obj.asInstanceOf[ReplayGroup]
  }
}

