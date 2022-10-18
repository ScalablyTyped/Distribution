package typings.openui5

import typings.openui5.anon.Next
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiTestMatchersSiblingMod {
  
  @JSImport("sap/ui/test/matchers/Sibling", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Sibling {
    def this(/**
      * the sibling control to check. Can be a control or a control ID. If undefined, the result will always
      * be true.
      */
    vSibling: String) = this()
    def this(/**
      * the sibling control to check. Can be a control or a control ID. If undefined, the result will always
      * be true.
      */
    vSibling: js.Object) = this()
    def this(
      /**
      * the sibling control to check. Can be a control or a control ID. If undefined, the result will always
      * be true.
      */
    vSibling: String,
      /**
      * specifies how to match
      */
    oOptions: Next
    ) = this()
    def this(
      /**
      * the sibling control to check. Can be a control or a control ID. If undefined, the result will always
      * be true.
      */
    vSibling: js.Object,
      /**
      * specifies how to match
      */
    oOptions: Next
    ) = this()
  }
  
  trait Sibling extends StObject
}
