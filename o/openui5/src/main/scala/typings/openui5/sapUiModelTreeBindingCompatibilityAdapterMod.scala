package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelTreeBindingCompatibilityAdapterMod {
  
  @JSImport("sap/ui/model/TreeBindingCompatibilityAdapter", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with TreeBindingCompatibilityAdapter {
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Adapter for TreeBindings to add the ListBinding functionality and use the tree structure in list based
      * controls.
      *
      * This module is only for experimental and internal use!
      */
    def this(
      /**
      * The binding to add ListBinding functionality to
      */
    oBinding: typings.openui5.sapUiModelTreeBindingMod.default,
      /**
      * The tree or tree table control using the given binding; the control is used for selection handling
      */
    oControl: js.Object
    ) = this()
  }
  
  trait TreeBindingCompatibilityAdapter extends StObject
}
