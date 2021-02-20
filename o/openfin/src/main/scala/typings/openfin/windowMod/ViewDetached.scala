package typings.openfin.windowMod

import typings.openfin.eventsBaseMod.WindowEvent
import typings.openfin.identityMod.Identity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewDetached[Topic, Type] extends WindowEvent[Topic, Type] {
  
  var previousTarget: Identity = js.native
  
  var target: Identity = js.native
  
  var viewIdentity: Identity = js.native
}
object ViewDetached {
  
  @scala.inline
  def apply[Topic, Type](
    name: String,
    previousTarget: Identity,
    target: Identity,
    topic: Topic,
    `type`: Type,
    uuid: String,
    viewIdentity: Identity
  ): ViewDetached[Topic, Type] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], previousTarget = previousTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], viewIdentity = viewIdentity.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewDetached[Topic, Type]]
  }
  
  @scala.inline
  implicit class ViewDetachedMutableBuilder[Self <: ViewDetached[_, _], Topic, Type] (val x: Self with (ViewDetached[Topic, Type])) extends AnyVal {
    
    @scala.inline
    def setPreviousTarget(value: Identity): Self = StObject.set(x, "previousTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Identity): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewIdentity(value: Identity): Self = StObject.set(x, "viewIdentity", value.asInstanceOf[js.Any])
  }
}
