package typings.pixiSpineRuntime41.mod

import typings.pixiSpineBase.mod.IEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Stores the current pose values for an {@link Event}.
  *
  * See Timeline {@link Timeline#apply()},
  * AnimationStateListener {@link AnimationStateListener#event()}, and
  * [Events](http://esotericsoftware.com/spine-events) in the Spine User Guide.
  * @public
  * */
trait Event2
  extends StObject
     with IEvent {
  
  var balance: Double
  
  @JSName("data")
  var data_Event2: EventData
  
  var floatValue: Double
  
  var intValue: Double
  
  var stringValue: String | Null
  
  var volume: Double
}
object Event2 {
  
  inline def apply(
    balance: Double,
    data: EventData,
    floatValue: Double,
    intValue: Double,
    time: Double,
    volume: Double
  ): Event2 = {
    val __obj = js.Dynamic.literal(balance = balance.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], floatValue = floatValue.asInstanceOf[js.Any], intValue = intValue.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any], stringValue = null)
    __obj.asInstanceOf[Event2]
  }
  
  extension [Self <: Event2](x: Self) {
    
    inline def setBalance(value: Double): Self = StObject.set(x, "balance", value.asInstanceOf[js.Any])
    
    inline def setData(value: EventData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setFloatValue(value: Double): Self = StObject.set(x, "floatValue", value.asInstanceOf[js.Any])
    
    inline def setIntValue(value: Double): Self = StObject.set(x, "intValue", value.asInstanceOf[js.Any])
    
    inline def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueNull: Self = StObject.set(x, "stringValue", null)
    
    inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
  }
}
