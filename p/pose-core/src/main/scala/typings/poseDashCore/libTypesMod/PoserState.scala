package typings.poseDashCore.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PoserState[V, A, C, P] extends js.Object {
  var activeActions: ActiveActions[C]
  var activePoses: ActivePoses
  var children: ChildPosers[V, A, C, P]
  var props: Props
  var values: ValueMap[V]
}

object PoserState {
  @scala.inline
  def apply[V, A, C, P](
    activeActions: ActiveActions[C],
    activePoses: ActivePoses,
    children: ChildPosers[V, A, C, P],
    props: Props,
    values: ValueMap[V]
  ): PoserState[V, A, C, P] = {
    val __obj = js.Dynamic.literal(activeActions = activeActions, activePoses = activePoses, children = children, props = props, values = values)
  
    __obj.asInstanceOf[PoserState[V, A, C, P]]
  }
}

