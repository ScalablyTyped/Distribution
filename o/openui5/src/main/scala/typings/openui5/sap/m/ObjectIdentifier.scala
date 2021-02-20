package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import typings.openui5.sap.ui.core.TextDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectIdentifier extends Control {
  
  /**
    * Adds some ariaLabelledBy into the association <code>ariaLabelledBy</code>.
    * @param vAriaLabelledBy the ariaLabelledBy to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAriaLabelledBy(vAriaLabelledBy: js.Any): ObjectIdentifier = js.native
  def addAriaLabelledBy(vAriaLabelledBy: Control): ObjectIdentifier = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>titlePress</code> event of this
    * <code>sap.m.ObjectIdentifier</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.ObjectIdentifier</code> itself.Fires when the title is active and the user
    * taps/clicks on it.
    * @since 1.26
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.ObjectIdentifier</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachTitlePress(oData: js.Any, fnFunction: js.Any): ObjectIdentifier = js.native
  def attachTitlePress(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ObjectIdentifier = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>titlePress</code> event of this
    * <code>sap.m.ObjectIdentifier</code>.The passed function and listener object must match the ones used
    * for event registration.
    * @since 1.26
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachTitlePress(fnFunction: js.Any, oListener: js.Any): ObjectIdentifier = js.native
  
  /**
    * Fires event <code>titlePress</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>domRef</code> of type <code>object</code>DOM reference of the object
    * identifier's title.</li></ul>
    * @since 1.26
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireTitlePress(mArguments: js.Any): ObjectIdentifier = js.native
  
  /**
    * Returns array of IDs of the elements which are the current targets of the association
    * <code>ariaLabelledBy</code>.
    */
  def getAriaLabelledBy(): js.Array[_] = js.native
  
  /**
    * Gets current value of property <code>badgeAttachments</code>.Indicates whether or not the
    * attachments icon is displayed.
    * @returns Value of property <code>badgeAttachments</code>
    */
  def getBadgeAttachments(): Boolean = js.native
  
  /**
    * Gets current value of property <code>badgeNotes</code>.Indicates whether or not the notes icon is
    * displayed.
    * @returns Value of property <code>badgeNotes</code>
    */
  def getBadgeNotes(): Boolean = js.native
  
  /**
    * Gets current value of property <code>badgePeople</code>.Indicates whether or not the address book
    * icon is displayed.
    * @returns Value of property <code>badgePeople</code>
    */
  def getBadgePeople(): Boolean = js.native
  
  /**
    * Gets current value of property <code>text</code>.Defines the object text.
    * @returns Value of property <code>text</code>
    */
  def getText(): String = js.native
  
  /**
    * Gets current value of property <code>textDirection</code>.Specifies the element's text
    * directionality with enumerated options. By default, the control inherits text direction from the
    * DOM.Default value is <code>Inherit</code>.
    * @since 1.28.0
    * @returns Value of property <code>textDirection</code>
    */
  def getTextDirection(): TextDirection = js.native
  
  /**
    * Gets current value of property <code>title</code>.Defines the object title.
    * @returns Value of property <code>title</code>
    */
  def getTitle(): String = js.native
  
  /**
    * Gets current value of property <code>titleActive</code>.Indicates if the ObjectIdentifier's title is
    * clickable.Default value is <code>false</code>.
    * @since 1.26
    * @returns Value of property <code>titleActive</code>
    */
  def getTitleActive(): Boolean = js.native
  
  /**
    * Removes all the controls in the association named <code>ariaLabelledBy</code>.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllAriaLabelledBy(): js.Array[_] = js.native
  
  def removeAriaLabelledBy(vAriaLabelledBy: js.Any): js.Any = js.native
  /**
    * Removes an ariaLabelledBy from the association named <code>ariaLabelledBy</code>.
    * @param vAriaLabelledBy The ariaLabelledBy to be removed or its index or ID
    * @returns The removed ariaLabelledBy or <code>null</code>
    */
  def removeAriaLabelledBy(vAriaLabelledBy: Double): js.Any = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: Control): js.Any = js.native
  
  /**
    * Sets a new value for property <code>badgeAttachments</code>.Indicates whether or not the attachments
    * icon is displayed.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.
    * @param bBadgeAttachments New value for property <code>badgeAttachments</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setBadgeAttachments(bBadgeAttachments: Boolean): ObjectIdentifier = js.native
  
  /**
    * Sets a new value for property <code>badgeNotes</code>.Indicates whether or not the notes icon is
    * displayed.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.
    * @param bBadgeNotes New value for property <code>badgeNotes</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setBadgeNotes(bBadgeNotes: Boolean): ObjectIdentifier = js.native
  
  /**
    * Sets a new value for property <code>badgePeople</code>.Indicates whether or not the address book
    * icon is displayed.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.
    * @param bBadgePeople New value for property <code>badgePeople</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setBadgePeople(bBadgePeople: Boolean): ObjectIdentifier = js.native
  
  /**
    * Sets text.Default value is empty/undefined.
    * @param sText New value for property text
    * @returns this to allow method chaining
    */
  def setText(sText: String): ObjectIdentifier = js.native
  
  /**
    * Sets a new value for property <code>textDirection</code>.Specifies the element's text directionality
    * with enumerated options. By default, the control inherits text direction from the DOM.When called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.Default value is <code>Inherit</code>.
    * @since 1.28.0
    * @param sTextDirection New value for property <code>textDirection</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTextDirection(sTextDirection: TextDirection): ObjectIdentifier = js.native
  
  /**
    * Sets the title.Default value is empty/undefined.
    * @param sTitle New value for property title
    * @returns this to allow method chaining
    */
  def setTitle(sTitle: String): ObjectIdentifier = js.native
  
  /**
    * Sets property titleActive.Default value is false.
    * @param bValue new value for property titleActive
    * @returns this to allow method chaining
    */
  def setTitleActive(bValue: Boolean): ObjectIdentifier = js.native
}
