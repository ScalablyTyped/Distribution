package typings.openui5.sapNs.uiNs.unifiedNs

import typings.openui5.sapNs.uiNs.coreNs.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.unified.ContentSwitcher")
@js.native
class ContentSwitcher protected () extends Control {
  /**
    * Constructor for a new ContentSwitcher.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Adds some content1 to the aggregation <code>content1</code>.
    * @param oContent1 the content1 to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addContent1(oContent1: Control): ContentSwitcher = js.native
  /**
    * Adds some content2 to the aggregation <code>content2</code>.
    * @param oContent2 the content2 to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addContent2(oContent2: Control): ContentSwitcher = js.native
  /**
    * Destroys all the content1 in the aggregation <code>content1</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyContent1(): ContentSwitcher = js.native
  /**
    * Destroys all the content2 in the aggregation <code>content2</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyContent2(): ContentSwitcher = js.native
  /**
    * Gets current value of property <code>activeContent</code>.The number of the currently active content
    * (1 or 2).Default value is <code>1</code>.
    * @returns Value of property <code>activeContent</code>
    */
  def getActiveContent(): Double = js.native
  /**
    * Gets current value of property <code>animation</code>.Set the used animation when changing content.
    * This just sets a CSS-class named "sapUiUnifiedACSwitcherAnimation" + this value on the root element
    * of the control. The animation has to be implemented in CSS. This also enables applications to
    * implement their own animations via CSS by reacting to the parent class.See the types
    * sap.ui.unified.ContentSwitcherAnimation for default implementations.Default value is
    * <code>None</code>.
    * @returns Value of property <code>animation</code>
    */
  def getAnimation(): String = js.native
  /**
    * Gets content of aggregation <code>content1</code>.The controls that should be shown in the first
    * content
    */
  def getContent1(): js.Array[Control] = js.native
  /**
    * Gets content of aggregation <code>content2</code>.The controls that should be shown in the second
    * content
    */
  def getContent2(): js.Array[Control] = js.native
  /**
    * Checks for the provided <code>sap.ui.core.Control</code> in the aggregation
    * <code>content1</code>.and returns its index if found or -1 otherwise.
    * @param oContent1 The content1 whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfContent1(oContent1: Control): Double = js.native
  /**
    * Checks for the provided <code>sap.ui.core.Control</code> in the aggregation
    * <code>content2</code>.and returns its index if found or -1 otherwise.
    * @param oContent2 The content2 whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfContent2(oContent2: Control): Double = js.native
  /**
    * Inserts a content1 into the aggregation <code>content1</code>.
    * @param oContent1 the content1 to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the content1 should be inserted at; for             a
    * negative value of <code>iIndex</code>, the content1 is inserted at position 0; for a value          
    *   greater than the current size of the aggregation, the content1 is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertContent1(oContent1: Control, iIndex: Double): ContentSwitcher = js.native
  /**
    * Inserts a content2 into the aggregation <code>content2</code>.
    * @param oContent2 the content2 to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the content2 should be inserted at; for             a
    * negative value of <code>iIndex</code>, the content2 is inserted at position 0; for a value          
    *   greater than the current size of the aggregation, the content2 is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertContent2(oContent2: Control, iIndex: Double): ContentSwitcher = js.native
  /**
    * Removes all the controls from the aggregation <code>content1</code>.Additionally, it unregisters
    * them from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllContent1(): js.Array[Control] = js.native
  /**
    * Removes all the controls from the aggregation <code>content2</code>.Additionally, it unregisters
    * them from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllContent2(): js.Array[Control] = js.native
  def removeContent1(vContent1: String): Control = js.native
  /**
    * Removes a content1 from the aggregation <code>content1</code>.
    * @param vContent1 The content1 to remove or its index or id
    * @returns The removed content1 or <code>null</code>
    */
  def removeContent1(vContent1: Double): Control = js.native
  def removeContent1(vContent1: Control): Control = js.native
  def removeContent2(vContent2: String): Control = js.native
  /**
    * Removes a content2 from the aggregation <code>content2</code>.
    * @param vContent2 The content2 to remove or its index or id
    * @returns The removed content2 or <code>null</code>
    */
  def removeContent2(vContent2: Double): Control = js.native
  def removeContent2(vContent2: Control): Control = js.native
  /**
    * Sets a new value for property <code>activeContent</code>.The number of the currently active content
    * (1 or 2).When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.Default value is <code>1</code>.
    * @param iActiveContent New value for property <code>activeContent</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setActiveContent(iActiveContent: Double): ContentSwitcher = js.native
  /**
    * Sets a new value for property <code>animation</code>.Set the used animation when changing content.
    * This just sets a CSS-class named "sapUiUnifiedACSwitcherAnimation" + this value on the root element
    * of the control. The animation has to be implemented in CSS. This also enables applications to
    * implement their own animations via CSS by reacting to the parent class.See the types
    * sap.ui.unified.ContentSwitcherAnimation for default implementations.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>None</code>.
    * @param sAnimation New value for property <code>animation</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setAnimation(sAnimation: String): ContentSwitcher = js.native
  /**
    * Changes the currently active content to the other one. If content 1 is active, content 2 willbe
    * activated and the other way around.
    */
  def switchContent(): Unit = js.native
}

