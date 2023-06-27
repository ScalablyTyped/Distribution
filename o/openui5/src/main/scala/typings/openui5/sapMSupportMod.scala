package typings.openui5

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMSupportMod extends Shortcut {
  
  /**
    * @since 1.11.0
    * Protected:  DO NOT USE IN APPLICATIONS (only for related classes in the framework)
    *
    *
    * ```javascript
    *
    * `sap.m.Support` shows the technical information for SAPUI5 Mobile Applications.
    * This technical information includes:
    *    * SAPUI5 Version
    *    * User Agent
    *    * Configurations (Bootstrap and Computed)
    *    * URI parameters
    *    * All loaded module names
    *
    * In order to show the device information, the user must follow the following gestures.
    *    1 - Hold two fingers for 3 seconds minimum.
    *    2 - Tab with a third finger while holding the first two fingers.
    *
    * NOTE: This class is internal and all its functions must not be used by an application
    *
    * Enable Support:
    * --------------------------------------------------
    * //import
    * sap.ui.require("sap/m/Support", function (Support) {
    *   // Support is initialized and is listening for fingers gestures combination
    * });
    *
    * //By default after require, support is enabled but implicitly we can call
    * Support.on();
    *
    * Disable Support:
    * --------------------------------------------------
    * Support.off();
    * ```
    */
  @JSImport("sap/m/Support", JSImport.Default)
  @js.native
  val default: /* undefined */ Any = js.native
  
  type _To = /* undefined */ Any
  
  /* This means you don't have to write `default`, but can instead just say `sapMSupportMod.foo` */
  override def _to: /* undefined */ Any = default
}
