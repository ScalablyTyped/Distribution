package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiBaseInterfaceMod {
  
  @JSImport("sap/ui/base/Interface", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Interface {
    /**
      * Constructs a facade for the given object, containing only the named methods.
      *
      * For each method named in `aMethods`, a wrapper function will be added to the facade. When called, the
      * wrapper function calls the method with the same name in the original `oObject`, passing all its call
      * parameters to it without modification. A return value of the original method will be returned to the
      * caller. Before returning it, values of type `sap.ui.base.Object` will be replaced by their facades, calling
      * {@link sap.ui.base.Object#getInterface getInterface} on them.
      *
      * It is possible to create different facades exposing different sets of methods for the same object, but
      * as `getInterface` can only return one of those interfaces, the special handling of the return values
      * doesn't support multiple facades per object.
      */
    def this(
      /**
      * Object for which a facade should be created
      */
    oObject: typings.openui5.sapUiBaseObjectMod.default,
      /**
      * Names of the methods, that should be available in the new facade
      */
    aMethods: js.Array[String]
    ) = this()
  }
  
  trait Interface extends StObject
}
