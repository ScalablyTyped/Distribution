package typings.parcelTypes.mod

import typings.parcelTypes.parcelTypesStrings.log
import typings.parcelTypes.parcelTypesStrings.progress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProgressLogEvent
  extends StObject
     with LogEvent {
  
  val level: progress
  
  val message: String
  
  val phase: js.UndefOr[String] = js.undefined
  
  val `type`: log
}
object ProgressLogEvent {
  
  inline def apply(message: String): ProgressLogEvent = {
    val __obj = js.Dynamic.literal(level = "progress", message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("log")
    __obj.asInstanceOf[ProgressLogEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProgressLogEvent] (val x: Self) extends AnyVal {
    
    inline def setLevel(value: progress): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setPhase(value: String): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    inline def setPhaseUndefined: Self = StObject.set(x, "phase", js.undefined)
    
    inline def setType(value: log): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
