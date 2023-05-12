package typings.metroConfig.srcConfigTypesMod

import typings.metroConfig.anon.DeferStates
import typings.metroConfig.anon.Enabled
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<std.Omit<metro-config.metro-config/src/configTypes.WatcherConfigT, 'healthCheck'>> */
trait WatcherInputConfigT extends StObject {
  
  var additionalExts: js.UndefOr[js.Array[String]] = js.undefined
  
  var healthCheck: js.UndefOr[Partial[Enabled]] = js.undefined
  
  var watchman: js.UndefOr[DeferStates] = js.undefined
}
object WatcherInputConfigT {
  
  inline def apply(): WatcherInputConfigT = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatcherInputConfigT]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatcherInputConfigT] (val x: Self) extends AnyVal {
    
    inline def setAdditionalExts(value: js.Array[String]): Self = StObject.set(x, "additionalExts", value.asInstanceOf[js.Any])
    
    inline def setAdditionalExtsUndefined: Self = StObject.set(x, "additionalExts", js.undefined)
    
    inline def setAdditionalExtsVarargs(value: String*): Self = StObject.set(x, "additionalExts", js.Array(value*))
    
    inline def setHealthCheck(value: Partial[Enabled]): Self = StObject.set(x, "healthCheck", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckUndefined: Self = StObject.set(x, "healthCheck", js.undefined)
    
    inline def setWatchman(value: DeferStates): Self = StObject.set(x, "watchman", value.asInstanceOf[js.Any])
    
    inline def setWatchmanUndefined: Self = StObject.set(x, "watchman", js.undefined)
  }
}
