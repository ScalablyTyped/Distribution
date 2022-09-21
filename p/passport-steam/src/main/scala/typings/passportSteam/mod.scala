package typings.passportSteam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: Any, validate: Any): Any = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], validate.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("passport-steam", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // Circular reference from passport_steam
  @JSImport("passport-steam", "Strategy")
  @js.native
  val Strategy: Any = js.native
  
  object prototype {
    
    @JSImport("passport-steam", "prototype")
    @js.native
    val ^ : js.Any = js.native
    
    inline def authenticate(req: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")(req.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def loadAssociation(fn: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("loadAssociation")(fn.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def loadDiscoveredInfo(fn: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("loadDiscoveredInfo")(fn.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def loadDiscoveredInformation(fn: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("loadDiscoveredInformation")(fn.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def saveAssociation(fn: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("saveAssociation")(fn.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def saveDiscoveredInfo(fn: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("saveDiscoveredInfo")(fn.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def saveDiscoveredInformation(fn: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("saveDiscoveredInformation")(fn.asInstanceOf[js.Any]).asInstanceOf[Any]
  }
  
  @JSImport("passport-steam", "version")
  @js.native
  val version: String = js.native
}
