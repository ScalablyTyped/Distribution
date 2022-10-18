package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiTestMatchersDescendantMod {
  
  @JSImport("sap/ui/test/matchers/Descendant", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Descendant {
    def this(/**
      * The descendant control to check. If undefined, it validates every control to true. Can be a control or
      * a control ID
      */
    vDescendantControl: String) = this()
    def this(/**
      * The descendant control to check. If undefined, it validates every control to true. Can be a control or
      * a control ID
      */
    vDescendantControl: js.Object) = this()
    def this(
      /**
      * The descendant control to check. If undefined, it validates every control to true. Can be a control or
      * a control ID
      */
    vDescendantControl: String,
      /**
      * specifies if the descendant should be a direct child
      */
    bDirect: Boolean
    ) = this()
    def this(
      /**
      * The descendant control to check. If undefined, it validates every control to true. Can be a control or
      * a control ID
      */
    vDescendantControl: js.Object,
      /**
      * specifies if the descendant should be a direct child
      */
    bDirect: Boolean
    ) = this()
  }
  
  trait Descendant extends StObject
}
