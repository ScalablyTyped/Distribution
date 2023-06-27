package typings.openui5

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreComponentSupportMod extends Shortcut {
  
  @JSImport("sap/ui/core/ComponentSupport", JSImport.Default)
  @js.native
  val default: ComponentSupport = js.native
  
  /**
    * @since 1.58.0
    *
    * The module `sap/ui/core/ComponentSupport` provides functionality which is used to find declared Components
    * in the HTML page and to create the Component instances which will be put into a {@link sap.ui.core.ComponentContainer}.
    *
    * The {@link module:sap/ui/core/ComponentSupport.run} function is called automatically once the module
    * has been required. This allows declarative support for components.
    *
    * Usage: To enable the `sap/ui/core/ComponentSupport` include it as the `oninit` module in the bootstrap:
    *
    * ```javascript
    *
    * <script id="sap-ui-bootstrap"
    *     src="/resources/sap-ui-core.js"
    *     ...
    *     data-sap-ui-oninit="module:sap/ui/core/ComponentSupport"
    *     ...>
    * </script>
    * ```
    *
    *
    * To load and render components inside the HTML page, a special data attribute has to be specified on the
    * respective DOM elements: `data-sap-ui-component`. All DOM elements marked with this data attribute will
    * be regarded as container elements for the created `ComponentContainer` instances.
    *
    *
    * ```javascript
    *
    * <body id="content" class="sapUiBody sapUiSizeCompact">
    *     ...
    *     <div data-sap-ui-component
    *         data-id="container"
    *         data-name="sap.ui.core.samples.formatting"
    *         ...
    *         data-handle-validation="true"
    *         ...>
    *     </div>
    *     ...
    * </body>
    * ```
    *
    *
    * Configuration: All configuration settings for the `ComponentContainer` have to be defined as `data` attributes
    * on the respective HTML tags. Each data attribute will be interpreted as a setting and parsed considering
    * the data type of the matching property in the `ComponentContainer`.
    *
    * As HTML is case-insensitive, in order to define a property with upper-case characters, you have to "escape"
    * them with a dash character, similar to CSS attributes. The following code gives an example:
    *
    *
    * ```javascript
    *
    * <div data-sap-ui-component ... data-handle-validation="true" ...></div>
    * ```
    *
    *
    * **Beware:**
    *
    * The `ComponentSupport` module enforces asynchronous loading of the respective component and its library
    * dependencies. This is done by applying default settings for the following properties of the `ComponentContainer`:
    *
    *
    * 	 - `async` {boolean} (**forced to `true`**)
    * 	 - `manifest` {boolean|string} (**forced to `true` if no string is provided to ensure manifest first**)
    *
    * 	 - `lifecycle` {sap.ui.core.ComponentLifecycle} (defaults to `Container`)
    * 	 - `autoPrefixId` {boolean} (defaults to `true`)
    *
    * See {@link https://ui5.sap.com/#/topic/82a0fcecc3cb427c91469bc537ebdddf Declarative API for Initial Components}.
    */
  trait ComponentSupport extends StObject {
    
    /**
      * Find all DOM elements with the attribute `data-sap-ui-component` and parse the attributes from these
      * DOM elements for the settings of the `ComponentContainer` which will be placed into these DOM elements.
      *
      * This function is called automatically once the module has been required.
      */
    def run(): Unit
  }
  object ComponentSupport {
    
    inline def apply(run: () => Unit): ComponentSupport = {
      val __obj = js.Dynamic.literal(run = js.Any.fromFunction0(run))
      __obj.asInstanceOf[ComponentSupport]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComponentSupport] (val x: Self) extends AnyVal {
      
      inline def setRun(value: () => Unit): Self = StObject.set(x, "run", js.Any.fromFunction0(value))
    }
  }
  
  type _To = ComponentSupport
  
  /* This means you don't have to write `default`, but can instead just say `sapUiCoreComponentSupportMod.foo` */
  override def _to: ComponentSupport = default
}
