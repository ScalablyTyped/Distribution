package typings.openui5

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiRtaEnablementTestDelegateMod extends Shortcut {
  
  @JSImport("sap/ui/rta/enablement/TestDelegate", JSImport.Default)
  @js.native
  val default: TestDelegate = js.native
  
  /**
    * @since 1.77
    * @experimental (since 1.77)
    *
    * sap.ui.fl Delegate to be used in elementActionTests.
    */
  trait TestDelegate extends StObject
  
  type _To = TestDelegate
  
  /* This means you don't have to write `default`, but can instead just say `sapUiRtaEnablementTestDelegateMod.foo` */
  override def _to: TestDelegate = default
}
