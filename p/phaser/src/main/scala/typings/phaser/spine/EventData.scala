package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventData extends StObject {
  
  var audioPath: String = js.native
  
  var balance: Double = js.native
  
  var floatValue: Double = js.native
  
  var intValue: Double = js.native
  
  var name: String = js.native
  
  var stringValue: String = js.native
  
  var volume: Double = js.native
}
object EventData {
  
  @scala.inline
  def apply(
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
  implicit class EventDataMutableBuilder[Self <: EventData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioPath(value: String): Self = StObject.set(x, "audioPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBalance(value: Double): Self = StObject.set(x, "balance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatValue(value: Double): Self = StObject.set(x, "floatValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntValue(value: Double): Self = StObject.set(x, "intValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
  }
}
