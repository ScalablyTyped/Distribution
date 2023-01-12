package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventData extends StObject {
  
  var audioPath: String
  
  var balance: Double
  
  var floatValue: Double
  
  var intValue: Double
  
  var name: String
  
  var stringValue: String
  
  var volume: Double
}
object EventData {
  
  inline def apply(
    audioPath: String,
    balance: Double,
    floatValue: Double,
    intValue: Double,
    name: String,
    stringValue: String,
    volume: Double
  ): EventData = {
    val __obj = js.Dynamic.literal(audioPath = audioPath.asInstanceOf[js.Any], balance = balance.asInstanceOf[js.Any], floatValue = floatValue.asInstanceOf[js.Any], intValue = intValue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stringValue = stringValue.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventData] (val x: Self) extends AnyVal {
    
    inline def setAudioPath(value: String): Self = StObject.set(x, "audioPath", value.asInstanceOf[js.Any])
    
    inline def setBalance(value: Double): Self = StObject.set(x, "balance", value.asInstanceOf[js.Any])
    
    inline def setFloatValue(value: Double): Self = StObject.set(x, "floatValue", value.asInstanceOf[js.Any])
    
    inline def setIntValue(value: Double): Self = StObject.set(x, "intValue", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
  }
}
