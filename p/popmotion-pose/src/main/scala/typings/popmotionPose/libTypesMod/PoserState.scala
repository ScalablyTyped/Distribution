package typings.popmotionPose.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PoserState[V, A, C, P] extends js.Object {
  
  var activeActions: ActiveActions[C] = js.native
  
  var activePoses: ActivePoses = js.native
  
  var children: ChildPosers[V, A, C, P] = js.native
  
  var props: Props = js.native
  
  var values: ValueMap[V] = js.native
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
    val __obj = js.Dynamic.literal(activeActions = activeActions.asInstanceOf[js.Any], activePoses = activePoses.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[PoserState[V, A, C, P]]
  }
  
  @scala.inline
  implicit class PoserStateOps[Self <: PoserState[_, _, _, _], V, A, C, P] (val x: Self with (PoserState[V, A, C, P])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActiveActions(value: ActiveActions[C]): Self = this.set("activeActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivePoses(value: ActivePoses): Self = this.set("activePoses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ChildPosers[V, A, C, P]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProps(value: Props): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: ValueMap[V]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
}
