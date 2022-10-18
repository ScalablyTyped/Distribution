package typings.openui5

import org.scalablytyped.runtime.Shortcut
import typings.openui5.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreThemingParametersMod extends Shortcut {
  
  @JSImport("sap/ui/core/theming/Parameters", JSImport.Default)
  @js.native
  val default: Parameters = js.native
  
  /**
    * A helper used for (read-only) access to CSS parameters at runtime.
    */
  @js.native
  trait Parameters extends StObject {
    
    /**
      *  Returns the current value for one or more theming parameters, depending on the given arguments. The
      * synchronous usage of this API has been deprecated and only the asynchronous usage should still be used
      * (see the 4th bullet point and the code examples below).
      *
      *  The theming parameters are immutable and cannot be changed at runtime. Multiple `Parameters.get()`
      * API calls for the same parameter name will always result in the same parameter value.
      *
      *  The following API variants are available (see also the below examples):
      * 	 -  **(deprecated since 1.92)** If no parameter is given a key-value map containing all parameters is
      * 			returned
      * 	 -  **(deprecated since 1.94)** If a `string` is given as first parameter the value is returned as a
      * 			`string`
      * 	 -  **(deprecated since 1.94)** If an `array` is given as first parameter a key-value map containing
      * 			all parameters from the `array` is returned
      * 	 - If an `object` is given as first parameter the result is returned immediately in case all parameters
      * 			are loaded and available or within the callback in case not all CSS files are already loaded. This is
      * 			the **only asynchronous** API variant. This variant is the preferred way to retrieve theming parameters.
      * 			The structure of the return value is the same as listed above depending on the type of the name property
      * 			within the `object`.
      *
      * The returned key-value maps are a copy so changing values in the map does not have any effect
      *
      *  Please see the examples below for a detailed guide on how to use the **asynchronous variant** of
      * the API.
      *
      * @returns the CSS parameter value(s) or `undefined` if the parameters could not be retrieved.
      */
    def get(
      /**
      * the (array with) CSS parameter name(s) or an object containing the (array with) CSS parameter name(s),
      * the scopeElement and a callback for async retrieval of parameters.
      */
    vName: String
    ): js.UndefOr[String | js.Object] = js.native
    def get(
      /**
      * the (array with) CSS parameter name(s) or an object containing the (array with) CSS parameter name(s),
      * the scopeElement and a callback for async retrieval of parameters.
      */
    vName: String,
      /**
      * Element / control instance to take into account when looking for a parameter value. This can make a difference
      * when a parameter value is overridden in a theme scope set via a CSS class.
      */
    oElement: typings.openui5.sapUiCoreElementMod.default
    ): js.UndefOr[String | js.Object] = js.native
    def get(
      /**
      * the (array with) CSS parameter name(s) or an object containing the (array with) CSS parameter name(s),
      * the scopeElement and a callback for async retrieval of parameters.
      */
    vName: js.Array[String]
    ): js.UndefOr[String | js.Object] = js.native
    def get(
      /**
      * the (array with) CSS parameter name(s) or an object containing the (array with) CSS parameter name(s),
      * the scopeElement and a callback for async retrieval of parameters.
      */
    vName: js.Array[String],
      /**
      * Element / control instance to take into account when looking for a parameter value. This can make a difference
      * when a parameter value is overridden in a theme scope set via a CSS class.
      */
    oElement: typings.openui5.sapUiCoreElementMod.default
    ): js.UndefOr[String | js.Object] = js.native
    def get(
      /**
      * the (array with) CSS parameter name(s) or an object containing the (array with) CSS parameter name(s),
      * the scopeElement and a callback for async retrieval of parameters.
      */
    vName: Callback
    ): js.UndefOr[String | js.Object] = js.native
    def get(
      /**
      * the (array with) CSS parameter name(s) or an object containing the (array with) CSS parameter name(s),
      * the scopeElement and a callback for async retrieval of parameters.
      */
    vName: Callback,
      /**
      * Element / control instance to take into account when looking for a parameter value. This can make a difference
      * when a parameter value is overridden in a theme scope set via a CSS class.
      */
    oElement: typings.openui5.sapUiCoreElementMod.default
    ): js.UndefOr[String | js.Object] = js.native
    
    /**
      * @deprecated (since 1.92)
      *
      * Resets the CSS parameters which finally will reload the parameters the next time they are queried via
      * the method `get`.
      */
    def reset(): Unit = js.native
  }
  
  type _To = Parameters
  
  /* This means you don't have to write `default`, but can instead just say `sapUiCoreThemingParametersMod.foo` */
  override def _to: Parameters = default
}
