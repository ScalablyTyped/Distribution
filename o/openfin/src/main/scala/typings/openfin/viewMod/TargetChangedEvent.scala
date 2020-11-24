package typings.openfin.viewMod

import typings.openfin.eventsBaseMod.WindowEvent
import typings.openfin.identityMod.NamedIdentity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetChangedEvent[Topic, Type] extends WindowEvent[Topic, Type] {
  
  var previousTarget: NamedIdentity = js.native
  
  var target: NamedIdentity = js.native
}
object TargetChangedEvent {
  
  @scala.inline
  def apply[Topic, Type](
    name: String,
    previousTarget: NamedIdentity,
    target: NamedIdentity,
    topic: Topic,
    `type`: Type,
    uuid: String
  ): TargetChangedEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], previousTarget = previousTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetChangedEvent[Topic, Type]]
  }
  
  @scala.inline
  implicit class TargetChangedEventOps[Self <: TargetChangedEvent[_, _], Topic, Type] (val x: Self with (TargetChangedEvent[Topic, Type])) extends AnyVal {
    
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
    def setPreviousTarget(value: NamedIdentity): Self = this.set("previousTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: NamedIdentity): Self = this.set("target", value.asInstanceOf[js.Any])
  }
}
