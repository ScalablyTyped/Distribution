package typings.openui5.sap.ui.core

import typings.openui5.sap.ui.base.ManagedObject
import typings.openui5.sap.ui.model.Binding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.Element")
@js.native
/**
  * Constructs and initializes an UI Element with the given <code>sId</code> and settings.If the
  * optional <code>mSettings</code> are given, they must be a JSON-like object (object literal)that
  * defines values for properties, aggregations, associations or events keyed by their name.<b>Valid
  * Names:</b>The property (key) names supported in the object literal are exactly the (case
  * sensitive)names documented in the JSDoc for the properties, aggregations, associations and eventsof
  * the control and its base classes. Note that for  0..n aggregations and associations thisusually is
  * the plural name, whereas it is the singular name in case of 0..1 relations.If a key name is
  * ambiguous for a specific control class (e.g. a property has the samename as an event), then this
  * method prefers property, aggregation, association andevent in that order. To resolve such
  * ambiguities, the keys can be prefixed with<code>aggregation:</code>, <code>association:</code> or
  * <code>event:</code>.In that case the keys must be quoted due to the ':'.Each subclass should
  * document the set of supported names in its constructor documentation.<b>Valid Values:</b><ul><li>for
  * normal properties, the value has to be of the correct simple type (no type conversion occurs)<li>for
  * 0..1 aggregations, the value has to be an instance of the aggregated control or element type<li>for
  * 0..n aggregations, the value has to be an array of instances of the aggregated type<li>for 0..1
  * associations, an instance of the associated type or an id (string) is accepted<li>0..n associations
  * are not supported yet<li>for events either a function (event handler) is accepted or an array of
  * length 2    where the first element is a function and the 2nd element is an object to invoke the
  * method on.</ul>Special aggregation "dependents" is connected to the lifecycle management and
  * databinding,but not rendered automatically and can be used for popups or other dependent controls.
  * This allowsdefinition of popup controls in declarative views and enables propagation of model and
  * contextinformation to them.Accepts an object literal <code>mSettings</code> that defines
  * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
  * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
  * object.
  * @param sId id for the new control; generated automatically if no non-empty id is given     Note:
  * this can be omitted, no matter whether <code>mSettings</code> will be given or not!
  * @param mSettings optional map/JSON-object with initial property values, aggregated objects etc. for
  * the new element
  */
class Element () extends ManagedObject {
  def this(mSettings: js.Any) = this()
  /**
    * Constructs and initializes an UI Element with the given <code>sId</code> and settings.If the
    * optional <code>mSettings</code> are given, they must be a JSON-like object (object literal)that
    * defines values for properties, aggregations, associations or events keyed by their name.<b>Valid
    * Names:</b>The property (key) names supported in the object literal are exactly the (case
    * sensitive)names documented in the JSDoc for the properties, aggregations, associations and eventsof
    * the control and its base classes. Note that for  0..n aggregations and associations thisusually is
    * the plural name, whereas it is the singular name in case of 0..1 relations.If a key name is
    * ambiguous for a specific control class (e.g. a property has the samename as an event), then this
    * method prefers property, aggregation, association andevent in that order. To resolve such
    * ambiguities, the keys can be prefixed with<code>aggregation:</code>, <code>association:</code> or
    * <code>event:</code>.In that case the keys must be quoted due to the ':'.Each subclass should
    * document the set of supported names in its constructor documentation.<b>Valid Values:</b><ul><li>for
    * normal properties, the value has to be of the correct simple type (no type conversion occurs)<li>for
    * 0..1 aggregations, the value has to be an instance of the aggregated control or element type<li>for
    * 0..n aggregations, the value has to be an array of instances of the aggregated type<li>for 0..1
    * associations, an instance of the associated type or an id (string) is accepted<li>0..n associations
    * are not supported yet<li>for events either a function (event handler) is accepted or an array of
    * length 2    where the first element is a function and the 2nd element is an object to invoke the
    * method on.</ul>Special aggregation "dependents" is connected to the lifecycle management and
    * databinding,but not rendered automatically and can be used for popups or other dependent controls.
    * This allowsdefinition of popup controls in declarative views and enables propagation of model and
    * contextinformation to them.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId id for the new control; generated automatically if no non-empty id is given     Note:
    * this can be omitted, no matter whether <code>mSettings</code> will be given or not!
    * @param mSettings optional map/JSON-object with initial property values, aggregated objects etc. for
    * the new element
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Returns the best suitable DOM node that represents this Element wrapped as jQuery object.I.e. the
    * element returned by {@link sap.ui.core.Element#getDomRef} is wrapped and returned.If an ID suffix is
    * given, the ID of this Element is concatenated with the suffix(separated by a single dash) and the
    * DOM node with that compound ID will be wrapped by jQuery.This matches the UI5 naming convention for
    * named inner DOM nodes of a control.
    * @param sSuffix ID suffix to get a jQuery object for
    * @returns The jQuery wrapped element's DOM reference
    */
  @JSName("$")
  def $(sSuffix: String): typings.jquery.JQueryStatic = js.native
  /**
    * Adds some customData to the aggregation <code>customData</code>.
    * @param oCustomData the customData to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addCustomData(oCustomData: CustomData): Element = js.native
  /**
    * Adds some dependent to the aggregation <code>dependents</code>.
    * @since 1.19
    * @param oDependent the dependent to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addDependent(oDependent: Control): Element = js.native
  /**
    * Adds a delegate that listens to the events that are fired on this element (as opposed to events
    * which are fired BY this element).When this element is cloned, the same delegate will be added to all
    * clones. This behavior is well-suited for applications which want to add delegatesthat also work with
    * templates in aggregation bindings.For control development the internal "addDelegate" method which
    * does not clone delegates by default may be more suitable, as typically each control instance takes
    * care of its own delegates.To avoid double registrations, all registrations of the given delegate are
    * firstremoved and then the delegate is added.<strong>Important:</strong> If event delegates were
    * added the delegate will still be called even ifthe event was processed and/or cancelled via
    * <code>preventDefault</code> by the Element or another event delegate.<code>preventDefault</code>
    * only prevents the event from bubbling.It should be checked e.g. in the event delegate's listener
    * whether an Element is still enabled via <code>getEnabled</code>.Additionally there might be other
    * things that delegates need to check depending on the event(e.g. not adding a key twice to an output
    * string etc.).
    * @since 1.9.0
    * @param oDelegate the delegate object
    * @param oThis if given, this object will be the "this" context in the listener methods; default is
    * the delegate object itself
    * @returns Returns <code>this</code> to allow method chaining
    */
  def addEventDelegate(oDelegate: js.Any): Element = js.native
  def addEventDelegate(oDelegate: js.Any, oThis: js.Any): Element = js.native
  /**
    * Applies the focus info.To be overwritten by the specific control method.
    * @param oFocusInfo undefined
    */
  def applyFocusInfo(oFocusInfo: js.Any): Unit = js.native
  /**
    * Bind the object to the referenced entity in the model, which is used as the binding contextto
    * resolve bound properties or aggregations of the object itself and all of its childrenrelatively to
    * the given path.If a relative binding path is used, this will be applied whenever the parent context
    * changes.
    * @param vPath the binding path or an object with more detailed binding options
    * @param mParameters map of additional parameters for this binding (only taken into account when vPath
    * is a string in that case the properties described for vPath above are valid here).
    * @returns reference to the instance itself
    */
  def bindElement(vPath: String): ManagedObject = js.native
  def bindElement(vPath: String, mParameters: js.Any): ManagedObject = js.native
  def bindElement(vPath: js.Any): ManagedObject = js.native
  def bindElement(vPath: js.Any, mParameters: js.Any): ManagedObject = js.native
  def create(vData: js.Any): Unit = js.native
  /**
    * Creates a new Element from the given data.If vData is an Element already, that element is
    * returned.If vData is an object (literal), then a new element is created with vData as settings.The
    * type of the element is either determined by a "Type" entry in the vData orby a type information in
    * the oKeyInfo object
    * @param vData the data to create the element from
    * @param oKeyInfo an entity information (e.g. aggregation info)
    */
  def create(vData: Element): Unit = js.native
  def create(vData: Element, oKeyInfo: js.Any): Unit = js.native
  /**
    * Attaches custom data to an Element or retrieves attached data.Usage:   data("myKey", myData)attaches
    * myData (which can be any JS data type, e.g. a number, a string, an object, or a function) to this
    * element, under the given key "myKey". If the key already exists,the value will be updated.  
    * data("myKey", myData, writeToDom)attaches myData to this element, under the given key "myKey" and
    * (if writeToDom is true) writes key and value to the HTML. If the key already exists,the value will
    * be updated. While oValue can be any JS data type to be attached, it must be a string to be also
    * written to DOM. The key must also be a valid HTML attribute name (it must conform to any
    * and may contain no colon) and may not start with "sap-ui". When written to HTML, the key is prefixed
    * with "data-".   data("myKey")retrieves whatever data has been attached to this Element (using the
    * key "myKey") before   data("myKey", null)removes whatever data has been attached to this Element
    * (using the key "myKey") before   data(null)removes all data   data()returns all data, as a map
    */
  def data(): Unit = js.native
  /**
    * Destroys all the customData in the aggregation <code>customData</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyCustomData(): Element = js.native
  /**
    * Destroys all the dependents in the aggregation <code>dependents</code>.
    * @since 1.19
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyDependents(): Element = js.native
  /**
    * Destroys the layoutData in the aggregation <code>layoutData</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyLayoutData(): Element = js.native
  /**
    * Destroys the tooltip in the aggregationnamed <code>tooltip</code>.
    * @returns <code>this</code> to allow method chaining
    */
  def destroyTooltip(): Element = js.native
  /**
    * Allows the parent of a control to enhance the aria information during rendering.This function is
    * called by the RenderManager's writeAccessibilityState methodfor the parent of the currently rendered
    * control - if the parent implements it.
    * @param oElement the Control/Element for which aria properties are rendered
    * @param mAriaProps map of aria properties keyed by there name (withour prefix "aria-")
    * @returns map of enhanced aria properties
    */
  def enhanceAccessibilityState(oElement: Element, mAriaProps: js.Any): js.Any = js.native
  /**
    * Cleans up the element instance before destruction.Applications must not call this hook method
    * directly, it is called by the frameworkwhen the element is {@link #destroy destroyed}.Subclasses of
    * Element should override this hook to implement any necessary cleanup.
    */
  def exit(): Unit = js.native
  /**
    * Searches and returns an array of child elements and controls which arereferenced within an
    * aggregation or aggregations of child elements/controls.This can be either done recursive or
    * not.<br><b>Take care: this operation might be expensive.</b>
    * @param bRecursive true, if all nested children should be returned.
    * @returns array of child elements and controls
    */
  def findElements(bRecursive: Boolean): js.Array[Element] = js.native
  /**
    * Sets the focus to the stored focus DOM reference
    */
  def focus(): Unit = js.native
  /**
    * Gets content of aggregation <code>customData</code>.Custom Data, a data structure like a map
    * containing arbitrary key value pairs.
    */
  def getCustomData(): js.Array[CustomData] = js.native
  /**
    * Gets content of aggregation <code>dependents</code>.Dependents are not rendered, but their
    * databinding context and lifecycle are bound to the aggregating Element.
    * @since 1.19
    */
  def getDependents(): js.Array[Control] = js.native
  /**
    * Returns the best suitable DOM Element that represents this UI5 Element.By default the DOM Element
    * with the same ID as this Element is returned.Subclasses should override this method if the lookup
    * via id is not sufficient.Note that such a DOM Element does not necessarily exist in all cases.Some
    * elements or controls might not have a DOM representation at all (e.g.a naive FlowLayout) while
    * others might not have one due to their currentstate (e.g. an initial, not yet rendered control).If
    * an ID suffix is given, the ID of this Element is concatenated with the suffix(separated by a single
    * dash) and the DOM node with that compound ID will be returned.This matches the UI5 naming convention
    * for named inner DOM nodes of a control.
    * @param sSuffix ID suffix to get the DOMRef for
    * @returns The Element's DOM Element sub DOM Element or null
    */
  def getDomRef(sSuffix: String): Element = js.native
  /**
    * Get the element binding object for a specific model
    * @param sModelName the name of the model
    * @returns the element binding for the given model name
    */
  def getElementBinding(sModelName: String): Binding = js.native
  /**
    * Returns the DOM Element that should get the focus.To be overwritten by the specific control method.
    * @returns Returns the DOM Element that should get the focus
    */
  def getFocusDomRef(): Element = js.native
  /**
    * Returns an object representing the serialized focus informationTo be overwritten by the specific
    * control method
    * @returns an object representing the serialized focus information
    */
  def getFocusInfo(): js.Any = js.native
  /**
    * Gets content of aggregation <code>layoutData</code>.Defines the layout constraints for this control
    * when it is used inside a Layout.LayoutData classes are typed classes and must match the embedding
    * Layout.See VariantLayoutData for aggregating multiple alternative LayoutData instances to a single
    * Element.
    */
  def getLayoutData(): LayoutData = js.native
  /**
    * Returns the runtime metadata for this UI element.When using the defineClass method, this function is
    * automatically created and returnsa runtime representation of the design time metadata.
    * @returns runtime metadata
    */
  @JSName("getMetadata")
  def getMetadata_Any(): js.Any = js.native
  /**
    * Returns the tooltip for this element if any or an undefined value.The tooltip can either be a simple
    * string or a subclass of{@link sap.ui.core.TooltipBase}.Callers that are only interested in tooltips
    * of type string (e.g. to renderthem as a <code>title</code> attribute), should call the convenience
    * method{@link #getTooltip_AsString} instead. If they want to get a tooltip text nomatter where it
    * comes from (be it a string tooltip or the text from a TooltipBaseinstance) then they could call
    * {@link #getTooltip_Text} instead.
    * @returns The tooltip for this Element.
    */
  def getTooltip(): String | TooltipBase = js.native
  /**
    * Returns the tooltip for this element but only if it is a simple string.Otherwise an undefined value
    * is returned.
    * @returns string tooltip or undefined
    */
  def getTooltip_AsString(): String = js.native
  /**
    * Returns the main text for the current tooltip or undefined if there is no such text.If the tooltip
    * is an object derived from sap.ui.core.Tooltip, then the text propertyof that object is returned.
    * Otherwise the object itself is returned (either a stringor undefined or null).
    * @returns text of the current tooltip or undefined
    */
  def getTooltip_Text(): String = js.native
  /**
    * Checks for the provided <code>sap.ui.core.CustomData</code> in the aggregation
    * <code>customData</code>.and returns its index if found or -1 otherwise.
    * @param oCustomData The customData whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfCustomData(oCustomData: CustomData): Double = js.native
  /**
    * Checks for the provided <code>sap.ui.core.Control</code> in the aggregation
    * <code>dependents</code>.and returns its index if found or -1 otherwise.
    * @since 1.19
    * @param oDependent The dependent whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfDependent(oDependent: Control): Double = js.native
  /**
    * Initializes the element instance after creation.Applications must not call this hook method
    * directly, it is called by the frameworkwhile the constructor of an element is executed.Subclasses of
    * Element should override this hook to implement any necessary initialization.
    */
  def init(): Unit = js.native
  /**
    * Inserts a customData into the aggregation <code>customData</code>.
    * @param oCustomData the customData to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the customData should be inserted at; for             a
    * negative value of <code>iIndex</code>, the customData is inserted at position 0; for a value        
    *     greater than the current size of the aggregation, the customData is inserted at             the
    * last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertCustomData(oCustomData: CustomData, iIndex: Double): Element = js.native
  /**
    * Inserts a dependent into the aggregation <code>dependents</code>.
    * @since 1.19
    * @param oDependent the dependent to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the dependent should be inserted at; for             a
    * negative value of <code>iIndex</code>, the dependent is inserted at position 0; for a value         
    *    greater than the current size of the aggregation, the dependent is inserted at             the
    * last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertDependent(oDependent: Control, iIndex: Double): Element = js.native
  /**
    * This function either calls set[sPropertyName] or get[sPropertyName] with the specified property
    * namedepending if an <code>oValue</code> is provided or not.
    * @param sPropertyName name of the property to set
    * @param oValue value to set the property to
    * @returns Returns <code>this</code> to allow method chaining in case of setter and the property value
    * in case of getter
    */
  def prop(sPropertyName: String): js.Any | Element = js.native
  def prop(sPropertyName: String, oValue: js.Any): js.Any | Element = js.native
  /**
    * Removes all the controls from the aggregation <code>customData</code>.Additionally, it unregisters
    * them from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllCustomData(): js.Array[CustomData] = js.native
  /**
    * Removes all the controls from the aggregation <code>dependents</code>.Additionally, it unregisters
    * them from the hosting UIArea.
    * @since 1.19
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllDependents(): js.Array[Control] = js.native
  def removeCustomData(vCustomData: String): CustomData = js.native
  /**
    * Removes a customData from the aggregation <code>customData</code>.
    * @param vCustomData The customData to remove or its index or id
    * @returns The removed customData or <code>null</code>
    */
  def removeCustomData(vCustomData: Double): CustomData = js.native
  def removeCustomData(vCustomData: CustomData): CustomData = js.native
  def removeDependent(vDependent: String): Control = js.native
  /**
    * Removes a dependent from the aggregation <code>dependents</code>.
    * @since 1.19
    * @param vDependent The dependent to remove or its index or id
    * @returns The removed dependent or <code>null</code>
    */
  def removeDependent(vDependent: Double): Control = js.native
  def removeDependent(vDependent: Control): Control = js.native
  /**
    * Removes the given delegate from this element.This method will remove all registrations of the given
    * delegate, not only one.
    * @since 1.9.0
    * @param oDelegate the delegate object
    * @returns Returns <code>this</code> to allow method chaining
    */
  def removeEventDelegate(oDelegate: js.Any): Element = js.native
  /**
    * This triggers immediate rerendering of its parent and thus of itself and its children.<br/> As
    * <code>sap.ui.core.Element</code> "bubbles up" thererender, changes to child-<code>Elements</code>
    * will also result in immediate rerendering of the whole sub tree.
    */
  def rerender(): Unit = js.native
  /**
    * Sets the {@link sap.ui.core.LayoutData} defining the layout constraintsfor this control when it is
    * used inside a layout.
    * @param oLayoutData undefined
    */
  def setLayoutData(oLayoutData: LayoutData): Unit = js.native
  /**
    * Sets a new tooltip for this object. The tooltip can either be a simple string(which in most cases
    * will be rendered as the <code>title</code> attribute of thisElement) or an instance of {@link
    * sap.ui.core.TooltipBase}.If a new tooltip is set, any previously set tooltip is deactivated.
    * @param vTooltip undefined
    */
  def setTooltip(vTooltip: String): Unit = js.native
  def setTooltip(vTooltip: TooltipBase): Unit = js.native
  /**
    * Removes the defined binding context of this object, all bindings will now resolverelative to the
    * parent context again.
    * @param sModelName undefined
    * @returns reference to the instance itself
    */
  def unbindElement(sModelName: String): ManagedObject = js.native
}

