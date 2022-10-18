package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelJsonJsonpropertybindingMod {
  
  @JSImport("sap/ui/model/json/JSONPropertyBinding", JSImport.Default)
  @js.native
  open class default protected ()
    extends typings.openui5.sapUiModelClientPropertyBindingMod.default {
    /**
      * Creates a new JSONListBinding.
      *
      * This constructor should only be called by subclasses or model implementations, not by application or
      * control code. Such code should use {@link sap.ui.model.json.JSONModel#bindProperty JSONModel#bindProperty}
      * on the corresponding model instance instead.
      */
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelJsonJsonmodelMod.default,
      /**
      * Binding path to be used for this binding
      */
    sPath: String,
      /**
      * Binding context relative to which a relative binding path will be resolved
      */
    oContext: typings.openui5.sapUiModelContextMod.default
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typings.openui5.sapUiModelJsonJsonmodelMod.default,
      /**
      * Binding path to be used for this binding
      */
    sPath: String,
      /**
      * Binding context relative to which a relative binding path will be resolved
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Map of optional parameters as defined by subclasses; this class does not introduce any own parameters
      */
    mParameters: js.Object
    ) = this()
  }
  
  type JSONPropertyBinding = typings.openui5.sapUiModelClientPropertyBindingMod.default
}
