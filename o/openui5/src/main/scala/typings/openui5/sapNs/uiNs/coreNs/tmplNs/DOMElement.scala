package typings.openui5.sapNs.uiNs.coreNs.tmplNs

import typings.openui5.sapNs.uiNs.coreNs.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.tmpl.DOMElement")
@js.native
class DOMElement protected () extends Control {
  /**
    * Constructor for a new tmpl/DOMElement.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Adds some attribute to the aggregation <code>attributes</code>.
    * @param oAttribute the attribute to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAttribute(oAttribute: DOMAttribute): DOMElement = js.native
  /**
    * Adds some element to the aggregation <code>elements</code>.
    * @param oElement the element to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addElement(oElement: DOMElement): DOMElement = js.native
  /**
    * Returns the value of a DOM attribute if available or undefined if the DOM attribute is not available
    * when using this method with the parameter name only.When using the method with the parameter name
    * and value the method acts as a setter and sets the value of a DOM attribute.In this case the return
    * value is the reference to this DOM element to support method chaining. If you pass null as value of
    * the attribute the attribute will be removed.
    * @param sName The name of the DOM attribute.
    * @param sValue The value of the DOM attribute. If the value is undefined the DOM attribute will be
    * removed.
    * @returns value of attribute or <code>this</code> when called as a setter
    */
  def attr(sName: String, sValue: String): js.Any = js.native
  /**
    * Destroys all the attributes in the aggregation <code>attributes</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyAttributes(): DOMElement = js.native
  /**
    * Destroys all the elements in the aggregation <code>elements</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyElements(): DOMElement = js.native
  /**
    * Gets content of aggregation <code>attributes</code>.DOM attributes which are rendered as part of the
    * DOM element and bindable
    */
  def getAttributes(): js.Array[DOMAttribute] = js.native
  /**
    * Gets content of aggregation <code>elements</code>.Nested DOM elements to support nested bindable
    * structures
    */
  def getElements(): js.Array[DOMElement] = js.native
  /**
    * Gets current value of property <code>tag</code>.The HTML-tag of the DOM element which contains the
    * textDefault value is <code>span</code>.
    * @returns Value of property <code>tag</code>
    */
  def getTag(): String = js.native
  /**
    * Gets current value of property <code>text</code>.The text content of the DOM element
    * @returns Value of property <code>text</code>
    */
  def getText(): String = js.native
  /**
    * Checks for the provided <code>sap.ui.core.tmpl.DOMAttribute</code> in the aggregation
    * <code>attributes</code>.and returns its index if found or -1 otherwise.
    * @param oAttribute The attribute whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfAttribute(oAttribute: DOMAttribute): Double = js.native
  /**
    * Checks for the provided <code>sap.ui.core.tmpl.DOMElement</code> in the aggregation
    * <code>elements</code>.and returns its index if found or -1 otherwise.
    * @param oElement The element whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfElement(oElement: DOMElement): Double = js.native
  /**
    * Inserts a attribute into the aggregation <code>attributes</code>.
    * @param oAttribute the attribute to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the attribute should be inserted at; for             a
    * negative value of <code>iIndex</code>, the attribute is inserted at position 0; for a value         
    *    greater than the current size of the aggregation, the attribute is inserted at             the
    * last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertAttribute(oAttribute: DOMAttribute, iIndex: Double): DOMElement = js.native
  /**
    * Inserts a element into the aggregation <code>elements</code>.
    * @param oElement the element to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the element should be inserted at; for             a
    * negative value of <code>iIndex</code>, the element is inserted at position 0; for a value           
    *  greater than the current size of the aggregation, the element is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertElement(oElement: DOMElement, iIndex: Double): DOMElement = js.native
  /**
    * Removes all the controls from the aggregation <code>attributes</code>.Additionally, it unregisters
    * them from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllAttributes(): js.Array[DOMAttribute] = js.native
  /**
    * Removes all the controls from the aggregation <code>elements</code>.Additionally, it unregisters
    * them from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllElements(): js.Array[DOMElement] = js.native
  /**
    * Removes the DOM attribute for the given name and returns the reference to this DOM element to
    * support method chaining.
    * @param sName The name of the DOM attribute.
    */
  def removeAttr(sName: String): DOMElement = js.native
  def removeAttribute(vAttribute: String): DOMAttribute = js.native
  /**
    * Removes a attribute from the aggregation <code>attributes</code>.
    * @param vAttribute The attribute to remove or its index or id
    * @returns The removed attribute or <code>null</code>
    */
  def removeAttribute(vAttribute: Double): DOMAttribute = js.native
  def removeAttribute(vAttribute: DOMAttribute): DOMAttribute = js.native
  def removeElement(vElement: String): DOMElement = js.native
  /**
    * Removes a element from the aggregation <code>elements</code>.
    * @param vElement The element to remove or its index or id
    * @returns The removed element or <code>null</code>
    */
  def removeElement(vElement: Double): DOMElement = js.native
  def removeElement(vElement: DOMElement): DOMElement = js.native
  /**
    * Sets a new value for property <code>tag</code>.The HTML-tag of the DOM element which contains the
    * textWhen called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>span</code>.
    * @param sTag New value for property <code>tag</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTag(sTag: String): DOMElement = js.native
  /**
    * Sets a new value for property <code>text</code>.The text content of the DOM elementWhen called with
    * a value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @param sText New value for property <code>text</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setText(sText: String): DOMElement = js.native
}

