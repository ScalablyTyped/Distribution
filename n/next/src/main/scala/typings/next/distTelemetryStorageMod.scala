package typings.next

import typings.next.anon.DistDirString
import typings.node.cryptoMod.BinaryLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTelemetryStorageMod {
  
  @JSImport("next/dist/telemetry/storage", "Telemetry")
  @js.native
  open class Telemetry protected () extends StObject {
    def this(hasDistDir: DistDirString) = this()
    
    /* private */ var NEXT_TELEMETRY_DEBUG: Any = js.native
    
    /* private */ var NEXT_TELEMETRY_DISABLED: Any = js.native
    
    def anonymousId: String = js.native
    
    /* private */ var conf: Any = js.native
    
    def flush(): js.Promise[js.Array[RecordObject] | Null] = js.native
    
    /* private */ def isDisabled: Any = js.native
    
    def isEnabled: Boolean = js.native
    
    /* private */ @JSName("notify")
    var notify_FTelemetry: Any = js.native
    
    def oneWayHash(payload: BinaryLike): String = js.native
    
    /* private */ def projectId: Any = js.native
    
    /* private */ var queue: Any = js.native
    
    /* private */ var rawProjectId: Any = js.native
    
    def record(_events: js.Array[TelemetryEvent]): js.Promise[RecordObject] = js.native
    def record(_events: TelemetryEvent): js.Promise[RecordObject] = js.native
    
    def salt: String = js.native
    
    /* private */ var sessionId: Any = js.native
    
    def setEnabled(_enabled: Boolean): String | Null = js.native
    
    /* private */ var submitRecord: Any = js.native
  }
  
  trait RecordObject extends StObject {
    
    var isFulfilled: Boolean
    
    var isRejected: Boolean
    
    var reason: js.UndefOr[Any] = js.undefined
    
    var value: js.UndefOr[Any] = js.undefined
  }
  object RecordObject {
    
    inline def apply(isFulfilled: Boolean, isRejected: Boolean): RecordObject = {
      val __obj = js.Dynamic.literal(isFulfilled = isFulfilled.asInstanceOf[js.Any], isRejected = isRejected.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordObject]
    }
    
    extension [Self <: RecordObject](x: Self) {
      
      inline def setIsFulfilled(value: Boolean): Self = StObject.set(x, "isFulfilled", value.asInstanceOf[js.Any])
      
      inline def setIsRejected(value: Boolean): Self = StObject.set(x, "isRejected", value.asInstanceOf[js.Any])
      
      inline def setReason(value: Any): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait TelemetryEvent extends StObject {
    
    var eventName: String
    
    var payload: js.Object
  }
  object TelemetryEvent {
    
    inline def apply(eventName: String, payload: js.Object): TelemetryEvent = {
      val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[TelemetryEvent]
    }
    
    extension [Self <: TelemetryEvent](x: Self) {
      
      inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: js.Object): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
}
