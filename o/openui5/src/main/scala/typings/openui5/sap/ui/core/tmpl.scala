package typings.openui5.sap.ui.core

import typings.openui5.sap.ui.base.ManagedObject
import typings.openui5.sap.ui.core.mvc.View
import typings.openui5.sap.ui.core.tmpl.DOMAttribute
import typings.openui5.sap.ui.core.tmpl.DOMElement
import typings.openui5.sap.ui.core.tmpl.Template
import typings.openui5.sap.ui.core.tmpl.TemplateControl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.tmpl")
@js.native
object tmpl extends js.Object {
  @js.native
  class DOMAttribute protected () extends Element {
    /**
      * Constructor for a new tmpl/DOMAttribute.Accepts an object literal <code>mSettings</code> that
      * defines initialproperty values, aggregated and associated objects as well as event handlers.See
      * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
      * settings object.
      * @param sId id for the new control, generated automatically if no id is given
      * @param mSettings initial settings for the new control
      */
    def this(sId: String) = this()
    def this(sId: String, mSettings: js.Any) = this()
    /**
      * Gets current value of property <code>name</code>.Name of the DOM attribute
      * @returns Value of property <code>name</code>
      */
    def getName(): String = js.native
    /**
      * Gets current value of property <code>value</code>.Value of the DOM attribute
      * @returns Value of property <code>value</code>
      */
    def getValue(): String = js.native
    /**
      * Sets a new value for property <code>name</code>.Name of the DOM attributeWhen called with a value of
      * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
      * @param sName New value for property <code>name</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setName(sName: String): DOMAttribute = js.native
    /**
      * Sets a new value for property <code>value</code>.Value of the DOM attributeWhen called with a value
      * of <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
      * @param sValue New value for property <code>value</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setValue(sValue: String): DOMAttribute = js.native
  }
  
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
  
  @js.native
  abstract class HandlebarsTemplate protected () extends Template {
    /**
      * Creates and initializes a new handlebars template with the given <code>sId</code>and settings.The
      * set of allowed entries in the <code>mSettings</code> object depends onthe concrete subclass and is
      * described there.
      * @param sId optional id for the new template; generated automatically if           no non-empty id is
      * given Note: this can be omitted, no matter           whether <code>mSettings</code> will be given or
      * not!
      * @param mSettings optional map/JSON-object with initial settings for the           new component
      * instance
      */
    def this(sId: String) = this()
    def this(sId: String, mSettings: js.Any) = this()
  }
  
  @js.native
  abstract class Template protected () extends ManagedObject {
    /**
      * Creates and initializes a new template with the given <code>sId</code> andsettings.The set of
      * allowed entries in the <code>mSettings</code> object depends onthe concrete subclass and is
      * described there.Accepts an object literal <code>mSettings</code> that defines initialproperty
      * values, aggregated and associated objects as well as event handlers.See {@link
      * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
      * object.
      * @param sId optional id for the new template; generated automatically if           no non-empty id is
      * given Note: this can be omitted, no matter           whether <code>mSettings</code> will be given or
      * not!
      * @param mSettings optional map/JSON-object with initial settings for the           new component
      * instance
      */
    def this(sId: String) = this()
    def this(sId: String, mSettings: js.Any) = this()
    /**
      * Returns the registered template for the given id, if any.
      * @param sId undefined
      * @returns the template for the given id
      */
    def byId(sId: String): js.Any = js.native
    /**
      * Creates an anonymous TemplateControl for the Template.
      * @param sId the control ID
      * @param oContext the context for the renderer/templating
      * @param oView undefined
      * @returns the created control instance
      */
    def createControl(sId: String, oContext: js.Any, oView: View): TemplateControl = js.native
    /**
      * Declares a new control based on this template and returns the createdclass / constructor function.
      * The class is based on the information comingfrom the abstract functions <code>createMetadata</code>
      * and<code>createRenderer</code>.
      * @param sControl the fully qualified name of the control
      * @returns the created class / constructor function
      */
    def declareControl(sControl: String): js.Any = js.native
    /**
      * Gets current value of property <code>content</code>.The Template definition as a String.
      * @returns Value of property <code>content</code>
      */
    def getContent(): String = js.native
    /**
      * parses the given path and extracts the model and path
      * @param sPath the path
      * @returns the model and the path
      */
    def parsePath(sPath: String): js.Any = js.native
    /**
      * Creates an anonymous TemplateControl for the Template and places the controlinto the specified DOM
      * element.
      * @param oRef the id or the DOM reference where to render the template
      * @param oContext The context to use to evaluate the Template. It will be applied as value for the
      * context property of the created control.
      * @param vPosition Describes the position where the control should be put into the container
      * @param bInline undefined
      * @returns the created control instance
      */
    def placeAt(oRef: String, oContext: js.Any, vPosition: String, bInline: Boolean): TemplateControl = js.native
    def placeAt(oRef: String, oContext: js.Any, vPosition: Double, bInline: Boolean): TemplateControl = js.native
    def placeAt(oRef: js.Any, oContext: js.Any, vPosition: String, bInline: Boolean): TemplateControl = js.native
    def placeAt(oRef: js.Any, oContext: js.Any, vPosition: Double, bInline: Boolean): TemplateControl = js.native
    /**
      * Sets a new value for property <code>content</code>.The Template definition as a String.When called
      * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
      * be restored.
      * @param sContent New value for property <code>content</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setContent(sContent: String): js.Any = js.native
  }
  
  @js.native
  class TemplateControl protected () extends Control {
    /**
      * Constructor for a new tmpl/TemplateControl.Accepts an object literal <code>mSettings</code> that
      * defines initialproperty values, aggregated and associated objects as well as event handlers.See
      * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
      * settings object.
      * @param sId id for the new control, generated automatically if no id is given
      * @param mSettings initial settings for the new control
      */
    def this(sId: String) = this()
    def this(sId: String, mSettings: js.Any) = this()
    /**
      * Attaches event handler <code>fnFunction</code> to the <code>afterRendering</code> event of this
      * <code>sap.ui.core.tmpl.TemplateControl</code>.When called, the context of the event handler (its
      * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
      * to this <code>sap.ui.core.tmpl.TemplateControl</code> itself.Fired when the Template Control has
      * been (re-)rendered and its HTML is present in the DOM.
      * @param oData An application-specific payload object that will be passed to the event handler along
      * with the event object when firing the event
      * @param fnFunction The function to be called when the event occurs
      * @param oListener Context object to call the event handler with. Defaults to this
      * <code>sap.ui.core.tmpl.TemplateControl</code> itself
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def attachAfterRendering(oData: js.Any, fnFunction: js.Any): TemplateControl = js.native
    def attachAfterRendering(oData: js.Any, fnFunction: js.Any, oListener: js.Any): TemplateControl = js.native
    /**
      * Attaches event handler <code>fnFunction</code> to the <code>beforeRendering</code> event of this
      * <code>sap.ui.core.tmpl.TemplateControl</code>.When called, the context of the event handler (its
      * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
      * to this <code>sap.ui.core.tmpl.TemplateControl</code> itself.Fired before this Template Control is
      * re-rendered. Use to unbind event handlers from HTML elements etc.
      * @param oData An application-specific payload object that will be passed to the event handler along
      * with the event object when firing the event
      * @param fnFunction The function to be called when the event occurs
      * @param oListener Context object to call the event handler with. Defaults to this
      * <code>sap.ui.core.tmpl.TemplateControl</code> itself
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def attachBeforeRendering(oData: js.Any, fnFunction: js.Any): TemplateControl = js.native
    def attachBeforeRendering(oData: js.Any, fnFunction: js.Any, oListener: js.Any): TemplateControl = js.native
    /**
      * Creates a pseudo binding for a aggregation to get notified once the propertychanges to invalidate
      * the control and trigger a re-rendering.
      * @param sPath the binding path
      * @returns the value of the path
      */
    def bindList(sPath: String): js.Any = js.native
    /**
      * Creates a pseudo binding for a property to get notified once the propertychanges to invalidate the
      * control and trigger a re-rendering.
      * @param sPath the binding path
      * @returns the value of the path
      */
    def bindProp(sPath: String): js.Any = js.native
    /**
      * compiles (creates and registers) a new control
      * @param mSettings the settings for the new control
      * @param sParentPath the parent path for the control
      * @param bDoNotAdd if true, then the control will not be         added to the _controls aggregation
      * @param oView undefined
      * @returns new control instance
      */
    def createControl(mSettings: js.Any, sParentPath: String, bDoNotAdd: Boolean, oView: View): Control = js.native
    /**
      * compiles (creates and registers) a new DOM element
      * @param mSettings the settings for the new DOM element
      * @param sParentPath the parent path for the DOM element
      * @param bDoNotAdd if true, then the control will not be         added to the _controls aggregation
      * @returns new DOM element instance
      */
    def createDOMElement(mSettings: js.Any): Control = js.native
    def createDOMElement(mSettings: js.Any, sParentPath: String): Control = js.native
    def createDOMElement(mSettings: js.Any, sParentPath: String, bDoNotAdd: Boolean): Control = js.native
    /**
      * Detaches event handler <code>fnFunction</code> from the <code>afterRendering</code> event of this
      * <code>sap.ui.core.tmpl.TemplateControl</code>.The passed function and listener object must match the
      * ones used for event registration.
      * @param fnFunction The function to be called, when the event occurs
      * @param oListener Context object on which the given function had to be called
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def detachAfterRendering(fnFunction: js.Any, oListener: js.Any): TemplateControl = js.native
    /**
      * Detaches event handler <code>fnFunction</code> from the <code>beforeRendering</code> event of this
      * <code>sap.ui.core.tmpl.TemplateControl</code>.The passed function and listener object must match the
      * ones used for event registration.
      * @param fnFunction The function to be called, when the event occurs
      * @param oListener Context object on which the given function had to be called
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def detachBeforeRendering(fnFunction: js.Any, oListener: js.Any): TemplateControl = js.native
    /**
      * Fires event <code>afterRendering</code> to attached listeners.
      * @param mArguments The arguments to pass along with the event
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def fireAfterRendering(mArguments: js.Any): TemplateControl = js.native
    /**
      * Fires event <code>beforeRendering</code> to attached listeners.
      * @param mArguments The arguments to pass along with the event
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def fireBeforeRendering(mArguments: js.Any): TemplateControl = js.native
    /**
      * Gets current value of property <code>context</code>.The context is a data object. It can be used for
      * default template expressions. A change of the context object leads to a re-rendering whereas a
      * change of a nested property of the context object doesn't. By default the context is an empty
      * object.
      * @returns Value of property <code>context</code>
      */
    def getContext(): js.Any = js.native
    /**
      * ID of the element which is the current target of the association <code>template</code>, or
      * <code>null</code>.
      */
    def getTemplate(): js.Any = js.native
    /**
      * Returns the instance specific renderer for an anonymous template control.
      * @returns the instance specific renderer function
      */
    def getTemplateRenderer(): js.Any = js.native
    /**
      * checks whether the control is inline or not
      * @returns flag, whether to control is inline or not
      */
    def isInline(): Boolean = js.native
    /**
      * Sets a new value for property <code>context</code>.The context is a data object. It can be used for
      * default template expressions. A change of the context object leads to a re-rendering whereas a
      * change of a nested property of the context object doesn't. By default the context is an empty
      * object.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
      * the property will be restored.
      * @param oContext New value for property <code>context</code>
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setContext(oContext: js.Any): TemplateControl = js.native
    /**
      * Sets the associated <code>template</code>.
      * @param oTemplate ID of an element which becomes the new target of this template association;
      * alternatively, an element instance may be given
      * @returns Reference to <code>this</code> in order to allow method chaining
      */
    def setTemplate(oTemplate: js.Any): TemplateControl = js.native
    /**
      * Sets the instance specific renderer for an anonymous template control.
      * @param fnRenderer the instance specific renderer function
      * @returns <code>this</code> to allow method chaining
      */
    def setTemplateRenderer(fnRenderer: js.Any): js.Any = js.native
  }
  
}

