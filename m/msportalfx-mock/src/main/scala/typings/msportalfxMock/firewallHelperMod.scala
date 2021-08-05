package typings.msportalfxMock

import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firewallHelperMod {
  
  object FirewallHelper {
    
    @JSImport("msportalfx-mock/lib/src/Helpers/firewallHelper", "FirewallHelper")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Adds a firewall rule to open up a local port for node porxy server.
      * NOTE: Should be compiled with COMMENTS as this is required to execute PS scripts.
      *
      * @param name The name of the rule.
      * @param port The local port that is
      * @param overwrite Overwrite existing rule.
      * @return A promise that resolves when the rule is created.
      */
    inline def addFirewallRule(name: String, port: Double): Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("addFirewallRule")(name.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Promise[js.Any]]
    inline def addFirewallRule(name: String, port: Double, overwrite: Boolean): Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("addFirewallRule")(name.asInstanceOf[js.Any], port.asInstanceOf[js.Any], overwrite.asInstanceOf[js.Any])).asInstanceOf[Promise[js.Any]]
    
    /**
      * Removes a firewall rule.
      * NOTE: Should be compiled with COMMENTS as this is required to eecute PS scripts.
      *
      * @param name The name of the rule.
      * @return A promise that resolves when the rule is removed.
      */
    inline def removeFirewallRule(name: String): Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFirewallRule")(name.asInstanceOf[js.Any]).asInstanceOf[Promise[js.Any]]
  }
}
