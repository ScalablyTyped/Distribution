package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiTestMatchersAncestorMod {
  
  @JSImport("sap/ui/test/matchers/Ancestor", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Ancestor {
    def this(/**
      * the ancestor control to check, if undefined, validates every control to true. Can be a control or a control
      * ID
      */
    vAncestor: String) = this()
    def this(/**
      * the ancestor control to check, if undefined, validates every control to true. Can be a control or a control
      * ID
      */
    vAncestor: js.Object) = this()
    def this(
      /**
      * the ancestor control to check, if undefined, validates every control to true. Can be a control or a control
      * ID
      */
    vAncestor: String,
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ) = this()
    def this(
      /**
      * the ancestor control to check, if undefined, validates every control to true. Can be a control or a control
      * ID
      */
    vAncestor: js.Object,
      /**
      * specifies if the ancestor should be a direct ancestor (parent)
      */
    bDirect: Boolean
    ) = this()
  }
  
  trait Ancestor extends StObject
}
