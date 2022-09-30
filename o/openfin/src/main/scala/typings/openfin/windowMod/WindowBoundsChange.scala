package typings.openfin.windowMod

import typings.openfin.eventsBaseMod.WindowEvent
import typings.openfin.openfinInts.`0`
import typings.openfin.openfinInts.`1`
import typings.openfin.openfinInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowBoundsChange[Topic, Type]
  extends StObject
     with WindowEvent[Topic, Type] {
  
  var changeType: `0` | `1` | `2`
  
  var deferred: Boolean
  
  var height: Double
  
  var left: Double
  
  var top: Double
  
  var width: Double
}
object WindowBoundsChange {
  
  inline def apply[Topic, Type](
    changeType: `0` | `1` | `2`,
    deferred: Boolean,
    height: Double,
    left: Double,
    name: String,
    top: Double,
    topic: Topic,
    `type`: Type,
    uuid: String,
    width: Double
  ): WindowBoundsChange[Topic, Type] = {
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any], deferred = deferred.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowBoundsChange[Topic, Type]]
  }
  
  extension [Self <: WindowBoundsChange[?, ?], Topic, Type](x: Self & (WindowBoundsChange[Topic, Type])) {
    
    inline def setChangeType(value: `0` | `1` | `2`): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    inline def setDeferred(value: Boolean): Self = StObject.set(x, "deferred", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
