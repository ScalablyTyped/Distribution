package typings.openfin.windowMod

import typings.openfin.anon.AppUuid
import typings.openfin.eventsBaseMod.WindowEvent
import typings.openfin.openfinStrings.disband
import typings.openfin.openfinStrings.join
import typings.openfin.openfinStrings.leave
import typings.openfin.openfinStrings.merge
import typings.openfin.openfinStrings.nothing
import typings.openfin.openfinStrings.source
import typings.openfin.openfinStrings.target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowGroupChanged[Topic, Type]
  extends StObject
     with WindowEvent[Topic, Type] {
  
  var memberOf: source | target | nothing
  
  var reason: leave | join | merge | disband
  
  var sourceGroup: js.Array[AppUuid]
  
  var sourceWindowAppUuid: String
  
  var sourceWindowName: String
  
  var targetGroup: js.Array[AppUuid]
  
  var targetWindowAppUuid: String
  
  var targetWindowName: String
}
object WindowGroupChanged {
  
  inline def apply[Topic, Type](
    memberOf: source | target | nothing,
    name: String,
    reason: leave | join | merge | disband,
    sourceGroup: js.Array[AppUuid],
    sourceWindowAppUuid: String,
    sourceWindowName: String,
    targetGroup: js.Array[AppUuid],
    targetWindowAppUuid: String,
    targetWindowName: String,
    topic: Topic,
    `type`: Type,
    uuid: String
  ): WindowGroupChanged[Topic, Type] = {
    val __obj = js.Dynamic.literal(memberOf = memberOf.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], sourceGroup = sourceGroup.asInstanceOf[js.Any], sourceWindowAppUuid = sourceWindowAppUuid.asInstanceOf[js.Any], sourceWindowName = sourceWindowName.asInstanceOf[js.Any], targetGroup = targetGroup.asInstanceOf[js.Any], targetWindowAppUuid = targetWindowAppUuid.asInstanceOf[js.Any], targetWindowName = targetWindowName.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowGroupChanged[Topic, Type]]
  }
  
  extension [Self <: WindowGroupChanged[?, ?], Topic, Type](x: Self & (WindowGroupChanged[Topic, Type])) {
    
    inline def setMemberOf(value: source | target | nothing): Self = StObject.set(x, "memberOf", value.asInstanceOf[js.Any])
    
    inline def setReason(value: leave | join | merge | disband): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setSourceGroup(value: js.Array[AppUuid]): Self = StObject.set(x, "sourceGroup", value.asInstanceOf[js.Any])
    
    inline def setSourceGroupVarargs(value: AppUuid*): Self = StObject.set(x, "sourceGroup", js.Array(value*))
    
    inline def setSourceWindowAppUuid(value: String): Self = StObject.set(x, "sourceWindowAppUuid", value.asInstanceOf[js.Any])
    
    inline def setSourceWindowName(value: String): Self = StObject.set(x, "sourceWindowName", value.asInstanceOf[js.Any])
    
    inline def setTargetGroup(value: js.Array[AppUuid]): Self = StObject.set(x, "targetGroup", value.asInstanceOf[js.Any])
    
    inline def setTargetGroupVarargs(value: AppUuid*): Self = StObject.set(x, "targetGroup", js.Array(value*))
    
    inline def setTargetWindowAppUuid(value: String): Self = StObject.set(x, "targetWindowAppUuid", value.asInstanceOf[js.Any])
    
    inline def setTargetWindowName(value: String): Self = StObject.set(x, "targetWindowName", value.asInstanceOf[js.Any])
  }
}
