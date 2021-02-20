package typings.passportSteam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-steam", JSImport.Namespace)
  @js.native
  def apply(options: js.Any, validate: js.Any): js.Any = js.native
  
  // Circular reference from passport_steam
  @JSImport("passport-steam", "Strategy")
  @js.native
  val Strategy: js.Any = js.native
  
  object prototype {
    
    object authenticate {
      
      @JSImport("passport-steam", "prototype.authenticate")
      @js.native
      def apply(req: js.Any): js.Any = js.native
    }
    
    object loadAssociation {
      
      @JSImport("passport-steam", "prototype.loadAssociation")
      @js.native
      def apply(fn: js.Any): js.Any = js.native
    }
    
    object loadDiscoveredInfo {
      
      @JSImport("passport-steam", "prototype.loadDiscoveredInfo")
      @js.native
      def apply(fn: js.Any): js.Any = js.native
    }
    
    object loadDiscoveredInformation {
      
      @JSImport("passport-steam", "prototype.loadDiscoveredInformation")
      @js.native
      def apply(fn: js.Any): js.Any = js.native
    }
    
    object saveAssociation {
      
      @JSImport("passport-steam", "prototype.saveAssociation")
      @js.native
      def apply(fn: js.Any): js.Any = js.native
    }
    
    object saveDiscoveredInfo {
      
      @JSImport("passport-steam", "prototype.saveDiscoveredInfo")
      @js.native
      def apply(fn: js.Any): js.Any = js.native
    }
    
    object saveDiscoveredInformation {
      
      @JSImport("passport-steam", "prototype.saveDiscoveredInformation")
      @js.native
      def apply(fn: js.Any): js.Any = js.native
    }
  }
  
  @JSImport("passport-steam", "version")
  @js.native
  val version: String = js.native
}
