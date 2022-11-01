package typings.next

import typings.next.anon.OmitEventCliSessionStoppe
import typings.next.anon.PayloadEventCliSessionStopped
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTelemetryEventsSessionStoppedMod {
  
  @JSImport("next/dist/telemetry/events/session-stopped", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def eventCliSession(event: OmitEventCliSessionStoppe): js.Array[PayloadEventCliSessionStopped] = ^.asInstanceOf[js.Dynamic].applyDynamic("eventCliSession")(event.asInstanceOf[js.Any]).asInstanceOf[js.Array[PayloadEventCliSessionStopped]]
  
  trait EventCliSessionStopped extends StObject {
    
    var cliCommand: String
    
    var durationMilliseconds: js.UndefOr[Double | Null] = js.undefined
    
    var nextVersion: String
    
    var nodeVersion: String
    
    var turboFlag: js.UndefOr[Boolean | Null] = js.undefined
  }
  object EventCliSessionStopped {
    
    inline def apply(cliCommand: String, nextVersion: String, nodeVersion: String): EventCliSessionStopped = {
      val __obj = js.Dynamic.literal(cliCommand = cliCommand.asInstanceOf[js.Any], nextVersion = nextVersion.asInstanceOf[js.Any], nodeVersion = nodeVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventCliSessionStopped]
    }
    
    extension [Self <: EventCliSessionStopped](x: Self) {
      
      inline def setCliCommand(value: String): Self = StObject.set(x, "cliCommand", value.asInstanceOf[js.Any])
      
      inline def setDurationMilliseconds(value: Double): Self = StObject.set(x, "durationMilliseconds", value.asInstanceOf[js.Any])
      
      inline def setDurationMillisecondsNull: Self = StObject.set(x, "durationMilliseconds", null)
      
      inline def setDurationMillisecondsUndefined: Self = StObject.set(x, "durationMilliseconds", js.undefined)
      
      inline def setNextVersion(value: String): Self = StObject.set(x, "nextVersion", value.asInstanceOf[js.Any])
      
      inline def setNodeVersion(value: String): Self = StObject.set(x, "nodeVersion", value.asInstanceOf[js.Any])
      
      inline def setTurboFlag(value: Boolean): Self = StObject.set(x, "turboFlag", value.asInstanceOf[js.Any])
      
      inline def setTurboFlagNull: Self = StObject.set(x, "turboFlag", null)
      
      inline def setTurboFlagUndefined: Self = StObject.set(x, "turboFlag", js.undefined)
    }
  }
}
