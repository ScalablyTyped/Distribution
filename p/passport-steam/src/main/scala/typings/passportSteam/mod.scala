package typings.passportSteam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: js.Any, validate: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], validate.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @JSImport("passport-steam", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // Circular reference from passport_steam
  @JSImport("passport-steam", "Strategy")
  @js.native
  val Strategy: js.Any = js.native
  
  object prototype {
    
    @JSImport("passport-steam", "prototype")
    @js.native
    val ^ : js.Any = js.native
    
    inline def authenticate(req: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")(req.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def loadAssociation(fn: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("loadAssociation")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def loadDiscoveredInfo(fn: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("loadDiscoveredInfo")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def loadDiscoveredInformation(fn: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("loadDiscoveredInformation")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def saveAssociation(fn: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("saveAssociation")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def saveDiscoveredInfo(fn: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("saveDiscoveredInfo")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def saveDiscoveredInformation(fn: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("saveDiscoveredInformation")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  @JSImport("passport-steam", "version")
  @js.native
  val version: String = js.native
}
