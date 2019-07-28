package typings.openui5.sapNs.mNs

import typings.openui5.sapNs.uiNs.coreNs.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.Bar")
@js.native
class Bar protected () extends Control {
  /**
    * Constructor for a new Bar.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId ID for the new control, generated automatically if no ID is given
    * @param mSettings Initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Sets classes and tag according to the context of the page. Possible contexts are header, footer and
    * sub-header.
    */
  var applyTagAndContextClassFor: js.Any = js.native
  /**
    * Gets the available Bar contexts.
    */
  var getContext: js.Any = js.native
  /**
    * Gets the HTML tag of the root element.
    */
  var getHTMLTag: js.Any = js.native
  /**
    * Determines whether the Bar is sensitive to the container context.Implementation of the IBar
    * interface.
    */
  var isContextSensitive: js.Any = js.native
  /**
    * Sets the HTML tag of the root element.
    */
  var setHTMLTag: js.Any = js.native
  /**
    * Adds some ariaLabelledBy into the association <code>ariaLabelledBy</code>.
    * @param vAriaLabelledBy the ariaLabelledBy to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAriaLabelledBy(vAriaLabelledBy: js.Any): Bar = js.native
  def addAriaLabelledBy(vAriaLabelledBy: Control): Bar = js.native
  /**
    * Adds some contentLeft to the aggregation <code>contentLeft</code>.
    * @param oContentLeft the contentLeft to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addContentLeft(oContentLeft: Control): Bar = js.native
  /**
    * Adds some contentMiddle to the aggregation <code>contentMiddle</code>.
    * @param oContentMiddle the contentMiddle to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addContentMiddle(oContentMiddle: Control): Bar = js.native
  /**
    * Adds some contentRight to the aggregation <code>contentRight</code>.
    * @param oContentRight the contentRight to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addContentRight(oContentRight: Control): Bar = js.native
  /**
    * Destroys all the contentLeft in the aggregation <code>contentLeft</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyContentLeft(): Bar = js.native
  /**
    * Destroys all the contentMiddle in the aggregation <code>contentMiddle</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyContentMiddle(): Bar = js.native
  /**
    * Destroys all the contentRight in the aggregation <code>contentRight</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyContentRight(): Bar = js.native
  /**
    * Returns array of IDs of the elements which are the current targets of the association
    * <code>ariaLabelledBy</code>.
    */
  def getAriaLabelledBy(): js.Array[_] = js.native
  /**
    * Gets content of aggregation <code>contentLeft</code>.Represents the left content area, usually
    * containing a button or an app icon. If it is overlapped by the right content, its content will
    * disappear and the text will show an ellipsis.
    */
  def getContentLeft(): js.Array[Control] = js.native
  /**
    * Gets content of aggregation <code>contentMiddle</code>.Represents the middle content area. Controls
    * such as label, segmented buttons or select can be placed here. The content is centrally positioned
    * if there is enough space. If the right or left content overlaps the middle content, the middle
    * content will be centered in the space between the left and the right content.
    */
  def getContentMiddle(): js.Array[Control] = js.native
  /**
    * Gets content of aggregation <code>contentRight</code>.Represents the right content area. Controls
    * such as action buttons or search field can be placed here.
    */
  def getContentRight(): js.Array[Control] = js.native
  /**
    * Gets current value of property <code>design</code>.Determines the design of the bar. If set to auto,
    * it becomes dependent on the place where the bar is placed.Default value is <code>Auto</code>.
    * @since 1.22
    * @returns Value of property <code>design</code>
    */
  def getDesign(): BarDesign = js.native
  /**
    * Gets current value of property <code>enableFlexBox</code>.If this flag is set to true, contentMiddle
    * will be rendered as a HBox and layoutData can be used to allocate available space.Default value is
    * <code>false</code>.
    * @returns Value of property <code>enableFlexBox</code>
    */
  def getEnableFlexBox(): Boolean = js.native
  /**
    * Gets current value of property <code>translucent</code>.Indicates whether the Bar is partially
    * translucent.It is only applied for touch devices.Default value is <code>false</code>.
    * @since 1.12
    * @returns Value of property <code>translucent</code>
    */
  def getTranslucent(): Boolean = js.native
  /**
    * Checks for the provided <code>sap.ui.core.Control</code> in the aggregation
    * <code>contentLeft</code>.and returns its index if found or -1 otherwise.
    * @param oContentLeft The contentLeft whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfContentLeft(oContentLeft: Control): Double = js.native
  /**
    * Checks for the provided <code>sap.ui.core.Control</code> in the aggregation
    * <code>contentMiddle</code>.and returns its index if found or -1 otherwise.
    * @param oContentMiddle The contentMiddle whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfContentMiddle(oContentMiddle: Control): Double = js.native
  /**
    * Checks for the provided <code>sap.ui.core.Control</code> in the aggregation
    * <code>contentRight</code>.and returns its index if found or -1 otherwise.
    * @param oContentRight The contentRight whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfContentRight(oContentRight: Control): Double = js.native
  /**
    * Inserts a contentLeft into the aggregation <code>contentLeft</code>.
    * @param oContentLeft the contentLeft to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the contentLeft should be inserted at; for            
    * a negative value of <code>iIndex</code>, the contentLeft is inserted at position 0; for a value     
    *        greater than the current size of the aggregation, the contentLeft is inserted at            
    * the last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertContentLeft(oContentLeft: Control, iIndex: Double): Bar = js.native
  /**
    * Inserts a contentMiddle into the aggregation <code>contentMiddle</code>.
    * @param oContentMiddle the contentMiddle to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the contentMiddle should be inserted at; for           
    *  a negative value of <code>iIndex</code>, the contentMiddle is inserted at position 0; for a value  
    *           greater than the current size of the aggregation, the contentMiddle is inserted at        
    *     the last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertContentMiddle(oContentMiddle: Control, iIndex: Double): Bar = js.native
  /**
    * Inserts a contentRight into the aggregation <code>contentRight</code>.
    * @param oContentRight the contentRight to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the contentRight should be inserted at; for            
    * a negative value of <code>iIndex</code>, the contentRight is inserted at position 0; for a value    
    *         greater than the current size of the aggregation, the contentRight is inserted at           
    *  the last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertContentRight(oContentRight: Control, iIndex: Double): Bar = js.native
  /**
    * Removes all the controls in the association named <code>ariaLabelledBy</code>.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllAriaLabelledBy(): js.Array[_] = js.native
  /**
    * Removes all the controls from the aggregation <code>contentLeft</code>.Additionally, it unregisters
    * them from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllContentLeft(): js.Array[Control] = js.native
  /**
    * Removes all the controls from the aggregation <code>contentMiddle</code>.Additionally, it
    * unregisters them from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllContentMiddle(): js.Array[Control] = js.native
  /**
    * Removes all the controls from the aggregation <code>contentRight</code>.Additionally, it unregisters
    * them from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllContentRight(): js.Array[Control] = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: js.Any): js.Any = js.native
  /**
    * Removes an ariaLabelledBy from the association named <code>ariaLabelledBy</code>.
    * @param vAriaLabelledBy The ariaLabelledBy to be removed or its index or ID
    * @returns The removed ariaLabelledBy or <code>null</code>
    */
  def removeAriaLabelledBy(vAriaLabelledBy: Double): js.Any = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: Control): js.Any = js.native
  def removeContentLeft(vContentLeft: String): Control = js.native
  /**
    * Removes a contentLeft from the aggregation <code>contentLeft</code>.
    * @param vContentLeft The contentLeft to remove or its index or id
    * @returns The removed contentLeft or <code>null</code>
    */
  def removeContentLeft(vContentLeft: Double): Control = js.native
  def removeContentLeft(vContentLeft: Control): Control = js.native
  def removeContentMiddle(vContentMiddle: String): Control = js.native
  /**
    * Removes a contentMiddle from the aggregation <code>contentMiddle</code>.
    * @param vContentMiddle The contentMiddle to remove or its index or id
    * @returns The removed contentMiddle or <code>null</code>
    */
  def removeContentMiddle(vContentMiddle: Double): Control = js.native
  def removeContentMiddle(vContentMiddle: Control): Control = js.native
  def removeContentRight(vContentRight: String): Control = js.native
  /**
    * Removes a contentRight from the aggregation <code>contentRight</code>.
    * @param vContentRight The contentRight to remove or its index or id
    * @returns The removed contentRight or <code>null</code>
    */
  def removeContentRight(vContentRight: Double): Control = js.native
  def removeContentRight(vContentRight: Control): Control = js.native
  /**
    * Sets a new value for property <code>design</code>.Determines the design of the bar. If set to auto,
    * it becomes dependent on the place where the bar is placed.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>Auto</code>.
    * @since 1.22
    * @param sDesign New value for property <code>design</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setDesign(sDesign: BarDesign): Bar = js.native
  /**
    * Sets a new value for property <code>enableFlexBox</code>.If this flag is set to true, contentMiddle
    * will be rendered as a HBox and layoutData can be used to allocate available space.When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>false</code>.
    * @param bEnableFlexBox New value for property <code>enableFlexBox</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setEnableFlexBox(bEnableFlexBox: Boolean): Bar = js.native
  /**
    * Sets a new value for property <code>translucent</code>.Indicates whether the Bar is partially
    * translucent.It is only applied for touch devices.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>false</code>.
    * @since 1.12
    * @param bTranslucent New value for property <code>translucent</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTranslucent(bTranslucent: Boolean): Bar = js.native
}

