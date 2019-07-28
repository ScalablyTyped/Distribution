package typings.openui5.sapNs.uiNs.coreNs

import typings.openui5.sapNs.uiNs.baseNs.Interface
import typings.openui5.sapNs.uiNs.baseNs.ManagedObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.UIArea")
@js.native
class UIArea protected () extends ManagedObject {
  /**
    * Accepts an object literal <code>mSettings</code> that defines initialproperty values, aggregated and
    * associated objects as well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a
    * general description of the syntax of the settings object.
    * @param oCore internal API of the <core>Core</code> that manages this UIArea
    * @param oRootNode reference to the Dom Node that should be 'hosting' the UI Area.
    */
  def this(oCore: Core) = this()
  def this(oCore: Core, oRootNode: js.Any) = this()
  /**
    * Adds some content to the aggregation <code>content</code>.
    * @param oContent the content to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addContent(oContent: Control): UIArea = js.native
  /**
    * Adds some dependent to the aggregation <code>dependents</code>.
    * @param oDependent the dependent to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addDependent(oDependent: Control): UIArea = js.native
  /**
    * Destroys all the content in the aggregation <code>content</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyContent(): UIArea = js.native
  /**
    * Destroys all the dependents in the aggregation <code>dependents</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyDependents(): UIArea = js.native
  /**
    * Gets content of aggregation <code>content</code>.Content that is displayed in the UIArea.
    */
  def getContent(): js.Array[Control] = js.native
  /**
    * Gets content of aggregation <code>dependents</code>.Dependent objects whose lifecycle is bound to
    * the UIarea but which are not automatically rendered by the UIArea.
    */
  def getDependents(): js.Array[Control] = js.native
  /**
    * Returns the content control of this <code>UIArea</code> at the specified index.If no index is given
    * the first content control is returned.
    * @param idx index of the control in the content of this <code>UIArea</code>
    * @returns the content control of this <code>UIArea</code> at the specified index.
    */
  def getRootControl(idx: Double): Control = js.native
  /**
    * Returns the Root Node hosting this instance of <code>UIArea</code>.
    * @returns the Root Node hosting this instance of <code>UIArea</code>.
    */
  def getRootNode(): Element = js.native
  /**
    * Returns this UI area. Needed to stop recursive calls from an element to its parent.
    * @returns this
    */
  def getUIArea(): UIArea = js.native
  /**
    * Checks for the provided <code>sap.ui.core.Control</code> in the aggregation <code>content</code>.and
    * returns its index if found or -1 otherwise.
    * @param oContent The content whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfContent(oContent: Control): Double = js.native
  /**
    * Checks for the provided <code>sap.ui.core.Control</code> in the aggregation
    * <code>dependents</code>.and returns its index if found or -1 otherwise.
    * @param oDependent The dependent whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfDependent(oDependent: Control): Double = js.native
  /**
    * Inserts a content into the aggregation <code>content</code>.
    * @param oContent the content to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the content should be inserted at; for             a
    * negative value of <code>iIndex</code>, the content is inserted at position 0; for a value           
    *  greater than the current size of the aggregation, the content is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertContent(oContent: Control, iIndex: Double): UIArea = js.native
  /**
    * Inserts a dependent into the aggregation <code>dependents</code>.
    * @param oDependent the dependent to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the dependent should be inserted at; for             a
    * negative value of <code>iIndex</code>, the dependent is inserted at position 0; for a value         
    *    greater than the current size of the aggregation, the dependent is inserted at             the
    * last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertDependent(oDependent: Control, iIndex: Double): UIArea = js.native
  /**
    * Checks whether the control is still valid (is in the DOM)
    * @returns True if the control is still in the active DOM
    */
  def isActive(): Boolean = js.native
  /**
    * Returns the locked state of the <code>sap.ui.core.UIArea</code>
    * @returns locked state
    */
  def isLocked(): Boolean = js.native
  /**
    * Locks this instance of UIArea.Rerendering and eventing will not be active as long as no{@link
    * #unlock} is called.
    */
  def lock(): Unit = js.native
  /**
    * Removes all the controls from the aggregation <code>content</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllContent(): js.Array[Control] = js.native
  /**
    * Removes all the controls from the aggregation <code>dependents</code>.Additionally, it unregisters
    * them from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllDependents(): js.Array[Control] = js.native
  def removeContent(vContent: String): Control = js.native
  /**
    * Removes a content from the aggregation <code>content</code>.
    * @param vContent The content to remove or its index or id
    * @returns The removed content or <code>null</code>
    */
  def removeContent(vContent: Double): Control = js.native
  def removeContent(vContent: Control): Control = js.native
  def removeDependent(vDependent: String): Control = js.native
  /**
    * Removes a dependent from the aggregation <code>dependents</code>.
    * @param vDependent The dependent to remove or its index or id
    * @returns The removed dependent or <code>null</code>
    */
  def removeDependent(vDependent: Double): Control = js.native
  def removeDependent(vDependent: Control): Control = js.native
  /**
    * Sets the root control to be displayed in this UIArea.First, all old content controls (if any) will
    * be detached from this UIArea (e.g. their parentrelationship to this UIArea will be cut off). Then
    * the parent relationship for the newcontent control (if not empty) will be set to this UIArea and
    * finally, the UIArea willbe marked for re-rendering.The real re-rendering happens whenever the
    * re-rendering is called. Either implicitlyat the end of any control event or by calling
    * sap.ui.getCore().applyChanges().
    * @param oRootControl the Control that should be the Root for this <code>UIArea</code>.
    */
  def setRootControl(oRootControl: Interface): Unit = js.native
  def setRootControl(oRootControl: Control): Unit = js.native
  /**
    * Allows setting the Root Node hosting this instance of <code>UIArea</code>.<br/> The Dom Ref must
    * have an Id thatwill be used as Id for this instance of <code>UIArea</code>.
    * @param oRootNode the hosting Dom Ref for this instance of <code>UIArea</code>.
    */
  def setRootNode(oRootNode: js.Any): Unit = js.native
  /**
    * Un-Locks this instance of UIArea.Rerendering and eventing will now be enabled again.
    */
  def unlock(): Unit = js.native
}

