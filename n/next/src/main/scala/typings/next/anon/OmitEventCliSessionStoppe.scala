package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<next.next/dist/telemetry/events/session-stopped.EventCliSessionStopped, 'nextVersion' | 'nodeVersion'> */
trait OmitEventCliSessionStoppe extends StObject {
  
  var cliCommand: String
  
  var durationMilliseconds: js.UndefOr[Double | Null] = js.undefined
  
  var turboFlag: js.UndefOr[Boolean | Null] = js.undefined
}
object OmitEventCliSessionStoppe {
  
  inline def apply(cliCommand: String): OmitEventCliSessionStoppe = {
    val __obj = js.Dynamic.literal(cliCommand = cliCommand.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitEventCliSessionStoppe]
  }
  
  extension [Self <: OmitEventCliSessionStoppe](x: Self) {
    
    inline def setCliCommand(value: String): Self = StObject.set(x, "cliCommand", value.asInstanceOf[js.Any])
    
    inline def setDurationMilliseconds(value: Double): Self = StObject.set(x, "durationMilliseconds", value.asInstanceOf[js.Any])
    
    inline def setDurationMillisecondsNull: Self = StObject.set(x, "durationMilliseconds", null)
    
    inline def setDurationMillisecondsUndefined: Self = StObject.set(x, "durationMilliseconds", js.undefined)
    
    inline def setTurboFlag(value: Boolean): Self = StObject.set(x, "turboFlag", value.asInstanceOf[js.Any])
    
    inline def setTurboFlagNull: Self = StObject.set(x, "turboFlag", null)
    
    inline def setTurboFlagUndefined: Self = StObject.set(x, "turboFlag", js.undefined)
  }
}
