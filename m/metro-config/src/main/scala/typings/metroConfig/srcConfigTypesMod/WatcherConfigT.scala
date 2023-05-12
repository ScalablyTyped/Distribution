package typings.metroConfig.srcConfigTypesMod

import typings.metroConfig.anon.DeferStates
import typings.metroConfig.anon.Enabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherConfigT extends StObject {
  
  var additionalExts: js.Array[String]
  
  var healthCheck: Enabled
  
  var watchman: DeferStates
}
object WatcherConfigT {
  
  inline def apply(additionalExts: js.Array[String], healthCheck: Enabled, watchman: DeferStates): WatcherConfigT = {
    val __obj = js.Dynamic.literal(additionalExts = additionalExts.asInstanceOf[js.Any], healthCheck = healthCheck.asInstanceOf[js.Any], watchman = watchman.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherConfigT]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatcherConfigT] (val x: Self) extends AnyVal {
    
    inline def setAdditionalExts(value: js.Array[String]): Self = StObject.set(x, "additionalExts", value.asInstanceOf[js.Any])
    
    inline def setAdditionalExtsVarargs(value: String*): Self = StObject.set(x, "additionalExts", js.Array(value*))
    
    inline def setHealthCheck(value: Enabled): Self = StObject.set(x, "healthCheck", value.asInstanceOf[js.Any])
    
    inline def setWatchman(value: DeferStates): Self = StObject.set(x, "watchman", value.asInstanceOf[js.Any])
  }
}
