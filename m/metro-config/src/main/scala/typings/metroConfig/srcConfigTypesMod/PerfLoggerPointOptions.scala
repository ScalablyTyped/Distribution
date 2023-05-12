package typings.metroConfig.srcConfigTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  timestamp :number | undefined}> */
trait PerfLoggerPointOptions extends StObject {
  
  val timestamp: js.UndefOr[Double] = js.undefined
}
object PerfLoggerPointOptions {
  
  inline def apply(): PerfLoggerPointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerfLoggerPointOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PerfLoggerPointOptions] (val x: Self) extends AnyVal {
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
