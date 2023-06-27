package typings.openui5

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcOdataV4ChartDelegateMod extends Shortcut {
  
  @JSImport("sap/ui/mdc/odata/v4/ChartDelegate", JSImport.Default)
  @js.native
  val default: ChartDelegate = js.native
  
  /**
    * @since 1.88
    *
    * Delegate class for {@link sap.ui.mdc.Chart Chart} and ODataV4.
    *  This class provides method calls, which are called by the `Chart` at specific operations and allows
    * to overwrite an internal behaviour.
    */
  trait ChartDelegate extends StObject
  
  type _To = ChartDelegate
  
  /* This means you don't have to write `default`, but can instead just say `sapUiMdcOdataV4ChartDelegateMod.foo` */
  override def _to: ChartDelegate = default
}
