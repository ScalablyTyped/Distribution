package typings.metroConfig.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<metro-config.metro-config/src/configTypes.WatcherConfigT> */
trait ReadonlyWatcherConfigT extends StObject {
  
  val additionalExts: js.Array[String]
  
  val healthCheck: Enabled
  
  val watchman: DeferStates
}
object ReadonlyWatcherConfigT {
  
  inline def apply(additionalExts: js.Array[String], healthCheck: Enabled, watchman: DeferStates): ReadonlyWatcherConfigT = {
    val __obj = js.Dynamic.literal(additionalExts = additionalExts.asInstanceOf[js.Any], healthCheck = healthCheck.asInstanceOf[js.Any], watchman = watchman.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyWatcherConfigT]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyWatcherConfigT] (val x: Self) extends AnyVal {
    
    inline def setAdditionalExts(value: js.Array[String]): Self = StObject.set(x, "additionalExts", value.asInstanceOf[js.Any])
    
    inline def setAdditionalExtsVarargs(value: String*): Self = StObject.set(x, "additionalExts", js.Array(value*))
    
    inline def setHealthCheck(value: Enabled): Self = StObject.set(x, "healthCheck", value.asInstanceOf[js.Any])
    
    inline def setWatchman(value: DeferStates): Self = StObject.set(x, "watchman", value.asInstanceOf[js.Any])
  }
}
