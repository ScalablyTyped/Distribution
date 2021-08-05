package typings.mockery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mockery", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deregisterAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deregisterAll")().asInstanceOf[Unit]
  
  inline def deregisterAllowable(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deregisterAllowable")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def deregisterAllowables(names: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deregisterAllowables")(names.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def deregisterMock(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deregisterMock")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def deregisterSubstitute(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deregisterSubstitute")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def disable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")().asInstanceOf[Unit]
  
  inline def enable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[Unit]
  inline def enable(args: MockeryEnableArgs): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def registerAllowable(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerAllowable")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def registerAllowable(name: String, unhook: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerAllowable")(name.asInstanceOf[js.Any], unhook.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerAllowables(names: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerAllowables")(names.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def registerMock(name: String, mock: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerMock")(name.asInstanceOf[js.Any], mock.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerSubstitute(name: String, substitute: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerSubstitute")(name.asInstanceOf[js.Any], substitute.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def resetCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetCache")().asInstanceOf[Unit]
  
  inline def warnOnReplace(value: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warnOnReplace")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def warnOnUnregistered(value: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warnOnUnregistered")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait MockeryEnableArgs extends StObject {
    
    var useCleanCache: js.UndefOr[Boolean] = js.undefined
    
    var warnOnReplace: js.UndefOr[Boolean] = js.undefined
    
    var warnOnUnregistered: js.UndefOr[Boolean] = js.undefined
  }
  object MockeryEnableArgs {
    
    inline def apply(): MockeryEnableArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MockeryEnableArgs]
    }
    
    extension [Self <: MockeryEnableArgs](x: Self) {
      
      inline def setUseCleanCache(value: Boolean): Self = StObject.set(x, "useCleanCache", value.asInstanceOf[js.Any])
      
      inline def setUseCleanCacheUndefined: Self = StObject.set(x, "useCleanCache", js.undefined)
      
      inline def setWarnOnReplace(value: Boolean): Self = StObject.set(x, "warnOnReplace", value.asInstanceOf[js.Any])
      
      inline def setWarnOnReplaceUndefined: Self = StObject.set(x, "warnOnReplace", js.undefined)
      
      inline def setWarnOnUnregistered(value: Boolean): Self = StObject.set(x, "warnOnUnregistered", value.asInstanceOf[js.Any])
      
      inline def setWarnOnUnregisteredUndefined: Self = StObject.set(x, "warnOnUnregistered", js.undefined)
    }
  }
}
