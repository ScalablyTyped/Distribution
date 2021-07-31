package typings.openui5.sap.m

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuickViewCard
  extends StObject
     with QuickViewBase {
  
  /**
    * Gets current value of property <code>showVerticalScrollBar</code>.Determines whether the browser
    * displays the vertical scroll bar or simply cuts the content of the QuickViewCard.Default value is
    * <code>true</code>.
    * @returns Value of property <code>showVerticalScrollBar</code>
    */
  def getShowVerticalScrollBar(): Boolean = js.native
  
  /**
    * Sets a new value for property <code>showVerticalScrollBar</code>.Determines whether the browser
    * displays the vertical scroll bar or simply cuts the content of the QuickViewCard.When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>true</code>.
    * @param bShowVerticalScrollBar New value for property <code>showVerticalScrollBar</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowVerticalScrollBar(bShowVerticalScrollBar: Boolean): QuickViewCard = js.native
}
