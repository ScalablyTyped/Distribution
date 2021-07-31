package typings.openui5.sap.ui.layout

import typings.openui5.sap.ui.core.Control
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponsiveFlowLayout
  extends StObject
     with Control {
  
  /**
    * Adds content.This function needs to be overridden to prevent any rendering while somecontent is
    * still being added.
    * @param oContent The content that should be added to the layout
    */
  def addContent(oContent: Control): Unit = js.native
  
  /**
    * Destroys all the content in the aggregation <code>content</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyContent(): ResponsiveFlowLayout = js.native
  
  /**
    * Gets content of aggregation <code>content</code>.Added content that should be positioned. Every
    * content item should have a ResponsiveFlowLayoutData attached, or otherwise, the default values are
    * used.
    */
  def getContent(): js.Array[Control] = js.native
  
  /**
    * Gets current value of property <code>responsive</code>.If set to false, all added controls will keep
    * their width, or otherwise, the controls will be stretched to the possible width of a row.Default
    * value is <code>true</code>.
    * @returns Value of property <code>responsive</code>
    */
  def getResponsive(): Boolean = js.native
  
  /**
    * Checks for the provided <code>sap.ui.core.Control</code> in the aggregation <code>content</code>.and
    * returns its index if found or -1 otherwise.
    * @param oContent The content whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfContent(oContent: Control): Double = js.native
  
  /**
    * Inserts content.This function needs to be overridden to prevent any rendering while somecontent is
    * still being added.
    * @param oContent The content that should be inserted to the layout
    * @param iIndex The index where the content should be inserted into
    */
  def insertContent(oContent: Control, iIndex: Double): Unit = js.native
  
  /**
    * Removes all the controls from the aggregation <code>content</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllContent(): js.Array[Control] = js.native
  
  def removeContent(oContent: String): Control = js.native
  /**
    * Removes content.This function needs to be overridden to prevent any rendering while somecontent is
    * still being added.
    * @param oContent The content that should be removed from the layout
    * @returns The <code>this</code> pointer for chaining
    */
  def removeContent(oContent: Double): Control = js.native
  def removeContent(oContent: Control): Control = js.native
  
  /**
    * Sets a new value for property <code>responsive</code>.If set to false, all added controls will keep
    * their width, or otherwise, the controls will be stretched to the possible width of a row.When called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.Default value is <code>true</code>.
    * @param bResponsive New value for property <code>responsive</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setResponsive(bResponsive: Boolean): ResponsiveFlowLayout = js.native
}
