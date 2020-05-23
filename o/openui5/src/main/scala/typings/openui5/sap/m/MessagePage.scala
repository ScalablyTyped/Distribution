package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import typings.openui5.sap.ui.core.TextDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessagePage extends Control {
  /**
    * Adds some ariaDescribedBy into the association <code>ariaDescribedBy</code>.
    * @param vAriaDescribedBy the ariaDescribedBy to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAriaDescribedBy(vAriaDescribedBy: js.Any): MessagePage = js.native
  def addAriaDescribedBy(vAriaDescribedBy: Control): MessagePage = js.native
  /**
    * Adds some ariaLabelledBy into the association <code>ariaLabelledBy</code>.
    * @param vAriaLabelledBy the ariaLabelledBy to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAriaLabelledBy(vAriaLabelledBy: js.Any): MessagePage = js.native
  def addAriaLabelledBy(vAriaLabelledBy: Control): MessagePage = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>navButtonPress</code> event of this
    * <code>sap.m.MessagePage</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.MessagePage</code> itself.This event is fired when Nav Button is pressed.
    * @since 1.28.1
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.MessagePage</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachNavButtonPress(oData: js.Any, fnFunction: js.Any): MessagePage = js.native
  def attachNavButtonPress(oData: js.Any, fnFunction: js.Any, oListener: js.Any): MessagePage = js.native
  /**
    * Destroys the customDescription in the aggregation <code>customDescription</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyCustomDescription(): MessagePage = js.native
  /**
    * Destroys the customText in the aggregation <code>customText</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyCustomText(): MessagePage = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>navButtonPress</code> event of this
    * <code>sap.m.MessagePage</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @since 1.28.1
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachNavButtonPress(fnFunction: js.Any, oListener: js.Any): MessagePage = js.native
  /**
    * Fires event <code>navButtonPress</code> to attached listeners.
    * @since 1.28.1
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireNavButtonPress(mArguments: js.Any): MessagePage = js.native
  /**
    * Returns array of IDs of the elements which are the current targets of the association
    * <code>ariaDescribedBy</code>.
    */
  def getAriaDescribedBy(): js.Array[_] = js.native
  /**
    * Returns array of IDs of the elements which are the current targets of the association
    * <code>ariaLabelledBy</code>.
    */
  def getAriaLabelledBy(): js.Array[_] = js.native
  /**
    * Gets content of aggregation <code>customDescription</code>.The (optional) custom description control
    * of this page.Use this aggregation when the "description" (sap.m.Text) control needs to be replaced
    * with a sap.m.Link control."description" and "textDirection" setters can be used for this
    * aggregation.
    */
  def getCustomDescription(): Link = js.native
  /**
    * Gets content of aggregation <code>customText</code>.The (optional) custom Text control of this
    * page.Use this aggregation when the "text" (sap.m.Text) control needs to be replaced with a
    * sap.m.Link control."text" and "textDirection" setters can be used for this aggregation.
    */
  def getCustomText(): Link = js.native
  /**
    * Gets current value of property <code>description</code>.Determines the detailed description that
    * shows additional information on the MessagePage.Default value is <code>Check the filter
    * settings.</code>.
    * @returns Value of property <code>description</code>
    */
  def getDescription(): String = js.native
  /**
    * Gets current value of property <code>icon</code>.Determines the icon displayed on the
    * MessagePage.Default value is <code>sap-icon://documents</code>.
    * @returns Value of property <code>icon</code>
    */
  def getIcon(): js.Any = js.native
  /**
    * Gets current value of property <code>showHeader</code>.Determines the visibility of the MessagePage
    * header.Can be used to hide the header of the MessagePage when it's embedded in another page.Default
    * value is <code>true</code>.
    * @returns Value of property <code>showHeader</code>
    */
  def getShowHeader(): Boolean = js.native
  /**
    * Gets current value of property <code>showNavButton</code>.Determines the visibility of the
    * navigation button in MessagePage header.Default value is <code>false</code>.
    * @returns Value of property <code>showNavButton</code>
    */
  def getShowNavButton(): Boolean = js.native
  /**
    * Gets current value of property <code>text</code>.Determines the main text displayed on the
    * MessagePage.Default value is <code>No matching items found.</code>.
    * @returns Value of property <code>text</code>
    */
  def getText(): String = js.native
  /**
    * Gets current value of property <code>textDirection</code>.Determines the element's text
    * directionality with enumerated options. By default, the control inherits text direction from the
    * DOM.Default value is <code>Inherit</code>.
    * @returns Value of property <code>textDirection</code>
    */
  def getTextDirection(): TextDirection = js.native
  /**
    * Gets current value of property <code>title</code>.Determines the title in the header of MessagePage.
    * @returns Value of property <code>title</code>
    */
  def getTitle(): String = js.native
  /**
    * Removes all the controls in the association named <code>ariaDescribedBy</code>.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllAriaDescribedBy(): js.Array[_] = js.native
  /**
    * Removes all the controls in the association named <code>ariaLabelledBy</code>.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllAriaLabelledBy(): js.Array[_] = js.native
  def removeAriaDescribedBy(vAriaDescribedBy: js.Any): js.Any = js.native
  /**
    * Removes an ariaDescribedBy from the association named <code>ariaDescribedBy</code>.
    * @param vAriaDescribedBy The ariaDescribedBy to be removed or its index or ID
    * @returns The removed ariaDescribedBy or <code>null</code>
    */
  def removeAriaDescribedBy(vAriaDescribedBy: Double): js.Any = js.native
  def removeAriaDescribedBy(vAriaDescribedBy: Control): js.Any = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: js.Any): js.Any = js.native
  /**
    * Removes an ariaLabelledBy from the association named <code>ariaLabelledBy</code>.
    * @param vAriaLabelledBy The ariaLabelledBy to be removed or its index or ID
    * @returns The removed ariaLabelledBy or <code>null</code>
    */
  def removeAriaLabelledBy(vAriaLabelledBy: Double): js.Any = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: Control): js.Any = js.native
  /**
    * Sets the aggregated <code>customDescription</code>.
    * @param oCustomDescription The customDescription to set
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setCustomDescription(oCustomDescription: Link): MessagePage = js.native
  /**
    * Sets the aggregated <code>customText</code>.
    * @param oCustomText The customText to set
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setCustomText(oCustomText: Link): MessagePage = js.native
  /**
    * Sets a new value for property <code>description</code>.Determines the detailed description that
    * shows additional information on the MessagePage.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>Check the filter settings.</code>.
    * @param sDescription New value for property <code>description</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setDescription(sDescription: String): MessagePage = js.native
  /**
    * Sets a new value for property <code>icon</code>.Determines the icon displayed on the
    * MessagePage.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>sap-icon://documents</code>.
    * @param sIcon New value for property <code>icon</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIcon(sIcon: js.Any): MessagePage = js.native
  /**
    * Sets a new value for property <code>showHeader</code>.Determines the visibility of the MessagePage
    * header.Can be used to hide the header of the MessagePage when it's embedded in another page.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>true</code>.
    * @param bShowHeader New value for property <code>showHeader</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowHeader(bShowHeader: Boolean): MessagePage = js.native
  /**
    * Sets a new value for property <code>showNavButton</code>.Determines the visibility of the navigation
    * button in MessagePage header.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>false</code>.
    * @param bShowNavButton New value for property <code>showNavButton</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowNavButton(bShowNavButton: Boolean): MessagePage = js.native
  /**
    * Sets a new value for property <code>text</code>.Determines the main text displayed on the
    * MessagePage.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>No matching items found.</code>.
    * @param sText New value for property <code>text</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setText(sText: String): MessagePage = js.native
  /**
    * Sets a new value for property <code>textDirection</code>.Determines the element's text
    * directionality with enumerated options. By default, the control inherits text direction from the
    * DOM.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>Inherit</code>.
    * @param sTextDirection New value for property <code>textDirection</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTextDirection(sTextDirection: TextDirection): MessagePage = js.native
  /**
    * Sets a new value for property <code>title</code>.Determines the title in the header of
    * MessagePage.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.
    * @param sTitle New value for property <code>title</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTitle(sTitle: String): MessagePage = js.native
}

