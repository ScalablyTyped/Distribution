package typings.openui5.global.sap.ui.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object theming {
  
  object Parameters {
    
    @JSGlobal("sap.ui.core.theming.Parameters")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns the current value for one or more theming parameters, depending on the given
      * arguments.<ul><li>If no parameter is given a key-value map containing all parameters is
      * returned</li><li>If a <code>string</code> is given as first parameter the value is returned as a
      * <code>string</code></li><li>If an <code>array</code> is given as first parameter a key-value map
      * containing all parameters from the <code>array</code> is returned</li></ul><p>The returned key-value
      * maps are a copy so changing values in the map does not have any effect</p>
      * @param vName the (array with) CSS parameter name(s)
      * @param oElement Element / control instance to take into account when looking for a parameter value. 
      *                         This can make a difference when a parameter value is overridden in a theme
      * scope set via a CSS class.
      * @returns the CSS parameter value(s)
      */
    @scala.inline
    def get(vName: String): String | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(vName.asInstanceOf[js.Any]).asInstanceOf[String | js.Any]
    @scala.inline
    def get(vName: String, oElement: typings.openui5.sap.ui.core.Element): String | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(vName.asInstanceOf[js.Any], oElement.asInstanceOf[js.Any])).asInstanceOf[String | js.Any]
    @scala.inline
    def get(vName: js.Array[String]): String | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(vName.asInstanceOf[js.Any]).asInstanceOf[String | js.Any]
    @scala.inline
    def get(vName: js.Array[String], oElement: typings.openui5.sap.ui.core.Element): String | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(vName.asInstanceOf[js.Any], oElement.asInstanceOf[js.Any])).asInstanceOf[String | js.Any]
    
    /**
      * Returns the active scope(s) for a given control by looking up the hierarchy.The lookup navigates the
      * DOM hierarchy if it's available. Otherwise if controls aren't rendered yet,it navigates the control
      * hierarchy. By navigating the control hierarchy, inner-html elementswith the respective scope classes
      * can't get recognized as the Custom Style Class API does only forroot elements.
      * @param oElement element/control instance
      * @returns Two dimensional array with scopes in bottom up order
      */
    @scala.inline
    def getActiveScopesFor(oElement: js.Any): js.Array[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveScopesFor")(oElement.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[String]]]
    
    /**
      * Returns the scopes from current theming parameters.
      * @param bAvoidLoading Whether loading of parameters should be avoided
      * @returns Scope names
      */
    @scala.inline
    def getScopes(bAvoidLoading: Boolean): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("_getScopes")(bAvoidLoading.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
    
    /**
      * Resets the CSS parameters which finally will reload the parametersthe next time they are queried via
      * the method <code>get</code>.
      */
    @scala.inline
    def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
  }
}
