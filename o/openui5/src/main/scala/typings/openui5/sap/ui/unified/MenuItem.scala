package typings.openui5.sap.ui.unified

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuItem extends MenuItemBase {
  
  /**
    * Gets current value of property <code>icon</code>.Defines the icon of the {@link sap.ui.core.IconPool
    * sap.ui.core.IconPool} or an image which should be displayed on the item.Default value is
    * <code></code>.
    * @returns Value of property <code>icon</code>
    */
  def getIcon(): js.Any = js.native
  
  /**
    * Gets current value of property <code>text</code>.Defines the text which should be displayed on the
    * item.Default value is <code></code>.
    * @returns Value of property <code>text</code>
    */
  def getText(): String = js.native
  
  /**
    * Sets a new value for property <code>icon</code>.Defines the icon of the {@link sap.ui.core.IconPool
    * sap.ui.core.IconPool} or an image which should be displayed on the item.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code></code>.
    * @param sIcon New value for property <code>icon</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIcon(sIcon: js.Any): MenuItem = js.native
  
  /**
    * Sets a new value for property <code>text</code>.Defines the text which should be displayed on the
    * item.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code></code>.
    * @param sText New value for property <code>text</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setText(sText: String): MenuItem = js.native
}
