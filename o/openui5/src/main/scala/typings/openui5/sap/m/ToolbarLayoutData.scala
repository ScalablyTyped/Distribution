package typings.openui5.sap.m

import typings.openui5.sap.ui.core.LayoutData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolbarLayoutData extends LayoutData {
  
  /**
    * Gets current value of property <code>maxWidth</code>.Sets the maximum width of the toolbar item.
    * @returns Value of property <code>maxWidth</code>
    */
  def getMaxWidth(): js.Any = js.native
  
  /**
    * Gets current value of property <code>minWidth</code>.Sets the minimum width of the toolbar item.
    * @returns Value of property <code>minWidth</code>
    */
  def getMinWidth(): js.Any = js.native
  
  /**
    * Gets current value of property <code>shrinkable</code>.Determines whether the control, when in a
    * toolbar, is shrinkable or not. For controls with fixed width (100px, 5rem, etc...) this property is
    * ignored.Note: Nested layout controls should not be shrinkable.Default value is <code>false</code>.
    * @returns Value of property <code>shrinkable</code>
    */
  def getShrinkable(): Boolean = js.native
  
  /**
    * Sets a new value for property <code>maxWidth</code>.Sets the maximum width of the toolbar item.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.
    * @param sMaxWidth New value for property <code>maxWidth</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMaxWidth(sMaxWidth: js.Any): ToolbarLayoutData = js.native
  
  /**
    * Sets a new value for property <code>minWidth</code>.Sets the minimum width of the toolbar item.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.
    * @param sMinWidth New value for property <code>minWidth</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMinWidth(sMinWidth: js.Any): ToolbarLayoutData = js.native
  
  /**
    * Sets a new value for property <code>shrinkable</code>.Determines whether the control, when in a
    * toolbar, is shrinkable or not. For controls with fixed width (100px, 5rem, etc...) this property is
    * ignored.Note: Nested layout controls should not be shrinkable.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>false</code>.
    * @param bShrinkable New value for property <code>shrinkable</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShrinkable(bShrinkable: Boolean): ToolbarLayoutData = js.native
}
