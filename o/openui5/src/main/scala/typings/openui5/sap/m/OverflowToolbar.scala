package typings.openui5.sap.m

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverflowToolbar
  extends StObject
     with Toolbar {
  
  /**
    * Closes the overflow area.Useful to manually close the overflow after having suppressed automatic
    * closing with "closeOverflowOnInteraction=false".
    * @since 1.40
    */
  def closeOverflow(): Unit = js.native
}
