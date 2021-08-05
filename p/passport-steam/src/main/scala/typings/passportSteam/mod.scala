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
    
    object authenticate {
      
      inline def apply(req: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].apply(req.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      
      @JSImport("passport-steam", "prototype.authenticate")
      @js.native
      val ^ : js.Any = js.native
    }
    
    object loadAssociation {
      
      inline def apply(fn: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      
      @JSImport("passport-steam", "prototype.loadAssociation")
      @js.native
      val ^ : js.Any = js.native
    }
    
    object loadDiscoveredInfo {
      
      inline def apply(fn: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      
      @JSImport("passport-steam", "prototype.loadDiscoveredInfo")
      @js.native
      val ^ : js.Any = js.native
    }
    
    object loadDiscoveredInformation {
      
      inline def apply(fn: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      
      @JSImport("passport-steam", "prototype.loadDiscoveredInformation")
      @js.native
      val ^ : js.Any = js.native
    }
    
    object saveAssociation {
      
      inline def apply(fn: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      
      @JSImport("passport-steam", "prototype.saveAssociation")
      @js.native
      val ^ : js.Any = js.native
    }
    
    object saveDiscoveredInfo {
      
      inline def apply(fn: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      
      @JSImport("passport-steam", "prototype.saveDiscoveredInfo")
      @js.native
      val ^ : js.Any = js.native
    }
    
    object saveDiscoveredInformation {
      
      inline def apply(fn: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      
      @JSImport("passport-steam", "prototype.saveDiscoveredInformation")
      @js.native
      val ^ : js.Any = js.native
    }
  }
  
  @JSImport("passport-steam", "version")
  @js.native
  val version: String = js.native
}
