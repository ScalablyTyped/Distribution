package typings.openfin.windowMod

import typings.openfin.eventsBaseMod.WindowEvent
import typings.openfin.identityMod.Identity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewDetached[Topic, Type]
  extends StObject
     with WindowEvent[Topic, Type] {
  
  var previousTarget: Identity
  
  var target: Identity
  
  var viewIdentity: Identity
}
object ViewDetached {
  
  inline def apply[Topic, Type](
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
  
  extension [Self <: ViewDetached[?, ?], Topic, Type](x: Self & (ViewDetached[Topic, Type])) {
    
    inline def setPreviousTarget(value: Identity): Self = StObject.set(x, "previousTarget", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Identity): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setViewIdentity(value: Identity): Self = StObject.set(x, "viewIdentity", value.asInstanceOf[js.Any])
  }
}
