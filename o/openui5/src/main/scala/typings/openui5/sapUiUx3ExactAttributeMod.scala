package typings.openui5

import typings.openui5.anon.Attribute
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.openui5.sapUiUx3LibraryMod.ExactOrder
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUx3ExactAttributeMod {
  
  @JSImport("sap/ui/ux3/ExactAttribute", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ExactAttribute.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ExactAttribute {
    def this(/**
      * initial settings for the new control
      */
    mSettings: ExactAttributeSettings) = this()
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
    mSettings: ExactAttributeSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: ExactAttributeSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/ux3/ExactAttribute", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.ux3.ExactAttribute with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Element.extend}.
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
    oClassInfo: ClassInfo[T, ExactAttribute]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ExactAttribute],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.ux3.ExactAttribute.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ExactAttribute
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * Adds some attribute to the aggregation {@link #getAttributes attributes}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAttribute(/**
      * The attribute to add; if empty, nothing is inserted
      */
    oAttribute: ExactAttribute): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:supplyAttributes supplyAttributes} event of
      * this `sap.ui.ux3.ExactAttribute`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.ExactAttribute` itself.
      *
      * A supply function is a handler which is attached to the supplyAttributes event. The event is fired when
      * the corresponding ExactAttribute is selected, it was already selected when a handler is attached or function
      * getAttributes() is called.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSupplyAttributes(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachSupplyAttributes(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.ExactAttribute` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:supplyAttributes supplyAttributes} event of
      * this `sap.ui.ux3.ExactAttribute`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.ExactAttribute` itself.
      *
      * A supply function is a handler which is attached to the supplyAttributes event. The event is fired when
      * the corresponding ExactAttribute is selected, it was already selected when a handler is attached or function
      * getAttributes() is called.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSupplyAttributes(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachSupplyAttributes(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.ExactAttribute` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the attributes in the aggregation {@link #getAttributes attributes}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyAttributes(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:supplyAttributes supplyAttributes} event of
      * this `sap.ui.ux3.ExactAttribute`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSupplyAttributes(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachSupplyAttributes(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:supplyAttributes supplyAttributes} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSupplyAttributes(): this.type = js.native
    def fireSupplyAttributes(/**
      * Parameters to pass along with the event
      */
    mParameters: Attribute): this.type = js.native
    
    /**
      * Gets current value of property {@link #getAdditionalData additionalData}.
      *
      * An example for additional data are database keys
      *
      * @returns Value of property `additionalData`
      */
    def getAdditionalData(): js.Object = js.native
    
    /**
      * Gets content of aggregation {@link #getAttributes attributes}.
      *
      * Values (sub attributes) of this attribute
      */
    def getAttributes(): js.Array[ExactAttribute] = js.native
    
    /**
      * Gets current value of property {@link #getAutoActivateSupply autoActivateSupply}.
      *
      * If you want the supply function to be called on every select, you can set the autoActivateSupply attribute
      * to true. In this case, supplyActive is automatically set to true on every unselect.
      *
      * Default value is `false`.
      *
      * @returns Value of property `autoActivateSupply`
      */
    def getAutoActivateSupply(): Boolean = js.native
    
    /**
      * @SINCE 1.7.1
      *
      * Gets current value of property {@link #getListOrder listOrder}.
      *
      * The order how the sublists of this attribute should be displayed.
      *
      * Default value is `Select`.
      *
      * @returns Value of property `listOrder`
      */
    def getListOrder(): ExactOrder | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ExactOrder * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getSelected selected}.
      *
      * Specifies whether the attribute shall be selected
      *
      * @returns Value of property `selected`
      */
    def getSelected(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowSubAttributesIndicator showSubAttributesIndicator}.
      *
      * Specifies whether the attribute shall have sub values for visual purposes. The indicator which is a little
      * arrow beside an attribute in the list is computed automatically (getShowSubAttributesIndicator_Computed()
      * of sap.ui.ux3.ExactAttribute). In the case that a supply function is attached, and the supplyActive attribute
      * has value 'true', then the Exact pattern needs a hint if sub attributes are available. The showSubAttributesIndicator
      * attribute is considered then and has to be maintained. If the back-end does not support count-calls,
      * for example, showSubAttributesIndicator should be set to true.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showSubAttributesIndicator`
      */
    def getShowSubAttributesIndicator(): Boolean = js.native
    
    /**
      * See attribute showSubAttributesIndicator
      */
    def getShowSubAttributesIndicator_Computed(): Unit = js.native
    
    /**
      * Gets current value of property {@link #getSupplyActive supplyActive}.
      *
      * The supplyAttributes event is only fired if supplyActive has value true which is the default. After firing
      * the event, the attribute is automatically set to false. The idea is that a supply function is called
      * only once when the data is requested. To enable the event again it is possible to manually set the attribute
      * back to true.
      *
      * Default value is `true`.
      *
      * @returns Value of property `supplyActive`
      */
    def getSupplyActive(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getText text}.
      *
      * The attribute name
      *
      * @returns Value of property `text`
      */
    def getText(): String = js.native
    
    /**
      * @SINCE 1.7.0
      *
      * Gets current value of property {@link #getWidth width}.
      *
      * Specifies the width of the corresponding list in pixels. The value must be between 70 and 500.
      *
      * Default value is `168`.
      *
      * @returns Value of property `width`
      */
    def getWidth(): int = js.native
    
    /**
      * Checks for the provided `sap.ui.ux3.ExactAttribute` in the aggregation {@link #getAttributes attributes}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfAttribute(/**
      * The attribute whose index is looked for
      */
    oAttribute: ExactAttribute): int = js.native
    
    /**
      * Inserts a attribute into the aggregation {@link #getAttributes attributes}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertAttribute(
      /**
      * The attribute to insert; if empty, nothing is inserted
      */
    oAttribute: ExactAttribute,
      /**
      * The `0`-based index the attribute should be inserted at; for a negative value of `iIndex`, the attribute
      * is inserted at position 0; for a value greater than the current size of the aggregation, the attribute
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
    def removeAllAttributes(): js.Array[ExactAttribute] = js.native
    
    def removeAttribute(/**
      * The attribute to remove or its index or id
      */
    vAttribute: String): ExactAttribute | Null = js.native
    /**
      * Removes a attribute from the aggregation {@link #getAttributes attributes}.
      *
      * @returns The removed attribute or `null`
      */
    def removeAttribute(/**
      * The attribute to remove or its index or id
      */
    vAttribute: int): ExactAttribute | Null = js.native
    def removeAttribute(/**
      * The attribute to remove or its index or id
      */
    vAttribute: ExactAttribute): ExactAttribute | Null = js.native
    
    /**
      * Scrolls the corresponding list of this attribute until the given direct child attribute is visible. If
      * the corresponding list is not yet visible the call is buffered until the list is available.
      */
    def scrollTo(/**
      * The direct child attribute
      */
    oOAttribute: ExactAttribute): Unit = js.native
    
    /**
      * Sets a new value for property {@link #getAdditionalData additionalData}.
      *
      * An example for additional data are database keys
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAdditionalData(): this.type = js.native
    def setAdditionalData(/**
      * New value for property `additionalData`
      */
    oAdditionalData: js.Object): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getAutoActivateSupply autoActivateSupply}.
      *
      * If you want the supply function to be called on every select, you can set the autoActivateSupply attribute
      * to true. In this case, supplyActive is automatically set to true on every unselect.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAutoActivateSupply(): this.type = js.native
    def setAutoActivateSupply(/**
      * New value for property `autoActivateSupply`
      */
    bAutoActivateSupply: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.7.1
      *
      * Sets a new value for property {@link #getListOrder listOrder}.
      *
      * The order how the sublists of this attribute should be displayed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Select`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setListOrder(): this.type = js.native
    def setListOrder(
      /**
      * New value for property `listOrder`
      */
    sListOrder: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ExactOrder * / any */ String
    ): this.type = js.native
    def setListOrder(/**
      * New value for property `listOrder`
      */
    sListOrder: ExactOrder): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * See:
      * 	sap.ui.base.ManagedObject.prototype.setProperty
      *
      * @returns Returns `this` to allow method chaining
      */
    def setProperty(sPropertyName: String, oValue: js.Object, bSuppressRerendering: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSelected selected}.
      *
      * Specifies whether the attribute shall be selected
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSelected(): this.type = js.native
    def setSelected(/**
      * New value for property `selected`
      */
    bSelected: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowSubAttributesIndicator showSubAttributesIndicator}.
      *
      * Specifies whether the attribute shall have sub values for visual purposes. The indicator which is a little
      * arrow beside an attribute in the list is computed automatically (getShowSubAttributesIndicator_Computed()
      * of sap.ui.ux3.ExactAttribute). In the case that a supply function is attached, and the supplyActive attribute
      * has value 'true', then the Exact pattern needs a hint if sub attributes are available. The showSubAttributesIndicator
      * attribute is considered then and has to be maintained. If the back-end does not support count-calls,
      * for example, showSubAttributesIndicator should be set to true.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowSubAttributesIndicator(): this.type = js.native
    def setShowSubAttributesIndicator(
      /**
      * New value for property `showSubAttributesIndicator`
      */
    bShowSubAttributesIndicator: Boolean
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSupplyActive supplyActive}.
      *
      * The supplyAttributes event is only fired if supplyActive has value true which is the default. After firing
      * the event, the attribute is automatically set to false. The idea is that a supply function is called
      * only once when the data is requested. To enable the event again it is possible to manually set the attribute
      * back to true.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSupplyActive(): this.type = js.native
    def setSupplyActive(/**
      * New value for property `supplyActive`
      */
    bSupplyActive: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getText text}.
      *
      * The attribute name
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
    
    /**
      * @SINCE 1.7.0
      *
      * Sets a new value for property {@link #getWidth width}.
      *
      * Specifies the width of the corresponding list in pixels. The value must be between 70 and 500.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `168`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(): this.type = js.native
    def setWidth(/**
      * New value for property `width`
      */
    iWidth: int): this.type = js.native
  }
  
  trait ExactAttributeSettings
    extends StObject
       with ElementSettings {
    
    /**
      * An example for additional data are database keys
      */
    var additionalData: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Values (sub attributes) of this attribute
      */
    var attributes: js.UndefOr[
        js.Array[ExactAttribute] | ExactAttribute | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * If you want the supply function to be called on every select, you can set the autoActivateSupply attribute
      * to true. In this case, supplyActive is automatically set to true on every unselect.
      */
    var autoActivateSupply: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.7.1
      *
      * The order how the sublists of this attribute should be displayed.
      */
    var listOrder: js.UndefOr[
        ExactOrder | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ExactOrder * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Specifies whether the attribute shall be selected
      */
    var selected: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Specifies whether the attribute shall have sub values for visual purposes. The indicator which is a little
      * arrow beside an attribute in the list is computed automatically (getShowSubAttributesIndicator_Computed()
      * of sap.ui.ux3.ExactAttribute). In the case that a supply function is attached, and the supplyActive attribute
      * has value 'true', then the Exact pattern needs a hint if sub attributes are available. The showSubAttributesIndicator
      * attribute is considered then and has to be maintained. If the back-end does not support count-calls,
      * for example, showSubAttributesIndicator should be set to true.
      */
    var showSubAttributesIndicator: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The supplyAttributes event is only fired if supplyActive has value true which is the default. After firing
      * the event, the attribute is automatically set to false. The idea is that a supply function is called
      * only once when the data is requested. To enable the event again it is possible to manually set the attribute
      * back to true.
      */
    var supplyActive: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * A supply function is a handler which is attached to the supplyAttributes event. The event is fired when
      * the corresponding ExactAttribute is selected, it was already selected when a handler is attached or function
      * getAttributes() is called.
      */
    var supplyAttributes: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * The attribute name
      */
    var text: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.7.0
      *
      * Specifies the width of the corresponding list in pixels. The value must be between 70 and 500.
      */
    var width: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
  }
  object ExactAttributeSettings {
    
    inline def apply(): ExactAttributeSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExactAttributeSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExactAttributeSettings] (val x: Self) extends AnyVal {
      
      inline def setAdditionalData(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "additionalData", value.asInstanceOf[js.Any])
      
      inline def setAdditionalDataUndefined: Self = StObject.set(x, "additionalData", js.undefined)
      
      inline def setAttributes(
        value: js.Array[ExactAttribute] | ExactAttribute | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setAttributesVarargs(value: ExactAttribute*): Self = StObject.set(x, "attributes", js.Array(value*))
      
      inline def setAutoActivateSupply(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "autoActivateSupply", value.asInstanceOf[js.Any])
      
      inline def setAutoActivateSupplyUndefined: Self = StObject.set(x, "autoActivateSupply", js.undefined)
      
      inline def setListOrder(
        value: ExactOrder | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ExactOrder * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "listOrder", value.asInstanceOf[js.Any])
      
      inline def setListOrderUndefined: Self = StObject.set(x, "listOrder", js.undefined)
      
      inline def setSelected(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setShowSubAttributesIndicator(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showSubAttributesIndicator", value.asInstanceOf[js.Any])
      
      inline def setShowSubAttributesIndicatorUndefined: Self = StObject.set(x, "showSubAttributesIndicator", js.undefined)
      
      inline def setSupplyActive(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "supplyActive", value.asInstanceOf[js.Any])
      
      inline def setSupplyActiveUndefined: Self = StObject.set(x, "supplyActive", js.undefined)
      
      inline def setSupplyAttributes(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "supplyAttributes", js.Any.fromFunction1(value))
      
      inline def setSupplyAttributesUndefined: Self = StObject.set(x, "supplyAttributes", js.undefined)
      
      inline def setText(value: String | PropertyBindingInfo): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setWidth(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
