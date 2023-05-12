package typings.metroConfig.srcConfigTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  key :number | undefined}> */
trait PerfLoggerFactoryOptions extends StObject {
  
  val key: js.UndefOr[Double] = js.undefined
}
object PerfLoggerFactoryOptions {
  
  inline def apply(): PerfLoggerFactoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerfLoggerFactoryOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PerfLoggerFactoryOptions] (val x: Self) extends AnyVal {
    
    inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
