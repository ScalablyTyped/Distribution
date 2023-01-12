package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreTmplDomelementMod {
  
  @JSImport("sap/ui/core/tmpl/DOMElement", JSImport.Default)
  @js.native
  /**
    * Constructor for a new tmpl/DOMElement.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends DOMElement {
    def this(/**
      * initial settings for the new control
      */
    mSettings: DOMElementSettings) = this()
    def this(/**
      * id for the new control, generated automatically if no id is given
      */
    sId: String) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: String,
      /**
      * initial settings for the new control
      */
    mSettings: DOMElementSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: DOMElementSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/tmpl/DOMElement", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.core.tmpl.DOMElement with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Control.extend}.
      *
      * @returns Created class / constructor function
      */
    inline def extend[T /* <: Record[String, Any] */](/**
      * Name of the class being created
      */
    sClassName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: Unit,
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, DOMElement]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, DOMElement],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.tmpl.DOMElement.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait DOMElement
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some attribute to the aggregation {@link #getAttributes attributes}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAttribute(
      /**
      * The attribute to add; if empty, nothing is inserted
      */
    oAttribute: typings.openui5.sapUiCoreTmplDomattributeMod.default
    ): this.type = js.native
    
    /**
      * Adds some element to the aggregation {@link #getElements elements}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addElement(/**
      * The element to add; if empty, nothing is inserted
      */
    oElement: DOMElement): this.type = js.native
    
    /**
      * Returns the value of a DOM attribute if available or undefined if the DOM attribute is not available
      * when using this method with the parameter name only. When using the method with the parameter name and
      * value the method acts as a setter and sets the value of a DOM attribute. In this case the return value
      * is the reference to this DOM element to support method chaining. If you pass null as value of the attribute
      * the attribute will be removed.
      *
      * @returns value of attribute or `this` when called as a setter
      */
    def attr(
      /**
      * The name of the DOM attribute.
      */
    sName: String,
      /**
      * The value of the DOM attribute. If the value is undefined the DOM attribute will be removed.
      */
    sValue: String
    ): Any = js.native
    
    /**
      * Destroys all the attributes in the aggregation {@link #getAttributes attributes}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyAttributes(): this.type = js.native
    
    /**
      * Destroys all the elements in the aggregation {@link #getElements elements}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyElements(): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getAttributes attributes}.
      *
      * DOM attributes which are rendered as part of the DOM element and bindable
      */
    def getAttributes(): js.Array[typings.openui5.sapUiCoreTmplDomattributeMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getElements elements}.
      *
      * Nested DOM elements to support nested bindable structures
      */
    def getElements(): js.Array[DOMElement] = js.native
    
    /**
      * Gets current value of property {@link #getTag tag}.
      *
      * The HTML-tag of the DOM element which contains the text
      *
      * Default value is `'span'`.
      *
      * @returns Value of property `tag`
      */
    def getTag(): String = js.native
    
    /**
      * Gets current value of property {@link #getText text}.
      *
      * The text content of the DOM element
      *
      * @returns Value of property `text`
      */
    def getText(): String = js.native
    
    /**
      * Checks for the provided `sap.ui.core.tmpl.DOMAttribute` in the aggregation {@link #getAttributes attributes}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfAttribute(
      /**
      * The attribute whose index is looked for
      */
    oAttribute: typings.openui5.sapUiCoreTmplDomattributeMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.core.tmpl.DOMElement` in the aggregation {@link #getElements elements}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfElement(/**
      * The element whose index is looked for
      */
    oElement: DOMElement): int = js.native
    
    /**
      * Inserts a attribute into the aggregation {@link #getAttributes attributes}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertAttribute(
      /**
      * The attribute to insert; if empty, nothing is inserted
      */
    oAttribute: typings.openui5.sapUiCoreTmplDomattributeMod.default,
      /**
      * The `0`-based index the attribute should be inserted at; for a negative value of `iIndex`, the attribute
      * is inserted at position 0; for a value greater than the current size of the aggregation, the attribute
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a element into the aggregation {@link #getElements elements}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertElement(
      /**
      * The element to insert; if empty, nothing is inserted
      */
    oElement: DOMElement,
      /**
      * The `0`-based index the element should be inserted at; for a negative value of `iIndex`, the element
      * is inserted at position 0; for a value greater than the current size of the aggregation, the element
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getAttributes attributes}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAttributes(): js.Array[typings.openui5.sapUiCoreTmplDomattributeMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getElements elements}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllElements(): js.Array[DOMElement] = js.native
    
    /**
      * Removes the DOM attribute for the given name and returns the reference to this DOM element to support
      * method chaining.
      */
    def removeAttr(/**
      * The name of the DOM attribute.
      */
    sName: String): this.type = js.native
    
    def removeAttribute(/**
      * The attribute to remove or its index or id
      */
    vAttribute: String): typings.openui5.sapUiCoreTmplDomattributeMod.default | Null = js.native
    /**
      * Removes a attribute from the aggregation {@link #getAttributes attributes}.
      *
      * @returns The removed attribute or `null`
      */
    def removeAttribute(/**
      * The attribute to remove or its index or id
      */
    vAttribute: int): typings.openui5.sapUiCoreTmplDomattributeMod.default | Null = js.native
    def removeAttribute(
      /**
      * The attribute to remove or its index or id
      */
    vAttribute: typings.openui5.sapUiCoreTmplDomattributeMod.default
    ): typings.openui5.sapUiCoreTmplDomattributeMod.default | Null = js.native
    
    def removeElement(/**
      * The element to remove or its index or id
      */
    vElement: String): DOMElement | Null = js.native
    /**
      * Removes a element from the aggregation {@link #getElements elements}.
      *
      * @returns The removed element or `null`
      */
    def removeElement(/**
      * The element to remove or its index or id
      */
    vElement: int): DOMElement | Null = js.native
    def removeElement(/**
      * The element to remove or its index or id
      */
    vElement: DOMElement): DOMElement | Null = js.native
    
    /**
      * Sets a new value for property {@link #getTag tag}.
      *
      * The HTML-tag of the DOM element which contains the text
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'span'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTag(): this.type = js.native
    def setTag(/**
      * New value for property `tag`
      */
    sTag: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getText text}.
      *
      * The text content of the DOM element
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setText(): this.type = js.native
    def setText(/**
      * New value for property `text`
      */
    sText: String): this.type = js.native
  }
  
  trait DOMElementSettings
    extends StObject
       with ControlSettings {
    
    /**
      * DOM attributes which are rendered as part of the DOM element and bindable
      */
    var attributes: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreTmplDomattributeMod.default] | typings.openui5.sapUiCoreTmplDomattributeMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Nested DOM elements to support nested bindable structures
      */
    var elements: js.UndefOr[
        js.Array[DOMElement] | DOMElement | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The HTML-tag of the DOM element which contains the text
      */
    var tag: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The text content of the DOM element
      */
    var text: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object DOMElementSettings {
    
    inline def apply(): DOMElementSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DOMElementSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DOMElementSettings] (val x: Self) extends AnyVal {
      
      inline def setAttributes(
        value: js.Array[typings.openui5.sapUiCoreTmplDomattributeMod.default] | typings.openui5.sapUiCoreTmplDomattributeMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setAttributesVarargs(value: typings.openui5.sapUiCoreTmplDomattributeMod.default*): Self = StObject.set(x, "attributes", js.Array(value*))
      
      inline def setElements(
        value: js.Array[DOMElement] | DOMElement | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      inline def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
      
      inline def setElementsVarargs(value: DOMElement*): Self = StObject.set(x, "elements", js.Array(value*))
      
      inline def setTag(value: String | PropertyBindingInfo): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setText(value: String | PropertyBindingInfo): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
