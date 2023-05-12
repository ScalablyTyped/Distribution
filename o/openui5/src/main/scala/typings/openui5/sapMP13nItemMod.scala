package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMP13nItemMod {
  
  @JSImport("sap/m/P13nItem", JSImport.Default)
  @js.native
  /**
    * Constructor for a new P13nItem.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends P13nItem {
    def this(/**
      * initial settings for the new control
      */
    mSettings: P13nItemSettings) = this()
    def this(/**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String,
      /**
      * initial settings for the new control
      */
    mSettings: P13nItemSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: P13nItemSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/P13nItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.P13nItem with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, P13nItem]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, P13nItem],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.P13nItem.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait P13nItem
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * @SINCE 1.34.0
      *
      * Gets current value of property {@link #getAggregationRole aggregationRole}.
      *
      * Defines aggregation role
      *
      * @returns Value of property `aggregationRole`
      */
    def getAggregationRole(): String = js.native
    
    /**
      * Gets current value of property {@link #getColumnKey columnKey}.
      *
      * Can be used as input for subsequent actions.
      *
      * @returns Value of property `columnKey`
      */
    def getColumnKey(): String = js.native
    
    /**
      * @SINCE 1.56.0
      *
      * Gets current value of property {@link #getDescription description}.
      *
      * Defines additional information of the link.
      *
      * @returns Value of property `description`
      */
    def getDescription(): String = js.native
    
    /**
      * @SINCE 1.52
      *
      * Gets current value of property {@link #getFormatSettings formatSettings}.
      *
      * A JSON object containing the formatSettings which will be used to pass additional type/format settings
      * for the entered value. if type==time or date or datetime the object will be used for the DateFormatter,
      * TimeFormatter or DateTimeFormatter
      *
      * Below you can find a brief example
      *
      *
      * ```javascript
      *
      * {
      * 		UTC: false,
      * 		style: "medium" //"short" or "long"
      * }
      * ```
      *
      *
      * @returns Value of property `formatSettings`
      */
    def getFormatSettings(): js.Object = js.native
    
    /**
      * @SINCE 1.46.0
      *
      * Gets current value of property {@link #getHref href}.
      *
      * Defines href of a link.
      *
      * @returns Value of property `href`
      */
    def getHref(): String = js.native
    
    /**
      * Gets current value of property {@link #getIsDefault isDefault}.
      *
      * the column with isDefault==true will be used as the selected column item on the conditionPanel
      *
      * Default value is `false`.
      *
      * @returns Value of property `isDefault`
      */
    def getIsDefault(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getMaxLength maxLength}.
      *
      * specifies the number of characters which can be entered in the value fields of the condition panel
      *
      * @returns Value of property `maxLength`
      */
    def getMaxLength(): String = js.native
    
    /**
      * Gets current value of property {@link #getNullable nullable}.
      *
      * Defines if the item is nullable
      *
      * Default value is `false`.
      *
      * @returns Value of property `nullable`
      */
    def getNullable(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getPrecision precision}.
      *
      * if type==numeric the precision will be used to format the entered value (maxIntegerDigits of the used
      * Formatter)
      *
      * @returns Value of property `precision`
      */
    def getPrecision(): String = js.native
    
    /**
      * @SINCE 1.46.0
      *
      * Gets current value of property {@link #getPress press}.
      *
      * Defines press handler of a link.
      *
      * @returns Value of property `press`
      */
    def getPress(): js.Object = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Gets current value of property {@link #getRole role}.
      *
      * Defines role. The role is reflected in the manner how the dimension will influence the chart layout.
      *
      * @returns Value of property `role`
      */
    def getRole(): String = js.native
    
    /**
      * Gets current value of property {@link #getScale scale}.
      *
      * if type==numeric the scale will be used to format the entered value (maxFractionDigits of the used Formatter)
      *
      * @returns Value of property `scale`
      */
    def getScale(): String = js.native
    
    /**
      * Gets current value of property {@link #getTarget target}.
      *
      * Defines target of a link.
      *
      * @returns Value of property `target`
      */
    def getTarget(): String = js.native
    
    /**
      * Gets current value of property {@link #getText text}.
      *
      * The text to be displayed for the item.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `text`
      */
    def getText(): String = js.native
    
    /**
      * Gets current value of property {@link #getType type}.
      *
      * data type of the column (text, numeric or date is supported)
      *
      * Default value is `"text"`.
      *
      * @returns Value of property `type`
      */
    def getType(): String = js.native
    
    /**
      * @SINCE 1.56
      *
      * Gets current value of property {@link #getTypeInstance typeInstance}.
      *
      * data type instance of the column. Can be used instead of the type, precision, scale and formatSettings
      * properties
      *
      * @returns Value of property `typeInstance`
      */
    def getTypeInstance(): js.Object = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Gets current value of property {@link #getValues values}.
      *
      * the array of values for type bool. e.g. ["", "Off", "On"]. The first entry can be empty (used to blank
      * the value field). Next value represent the false value, last entry the true value.
      *
      * @returns Value of property `values`
      */
    def getValues(): js.Array[String] = js.native
    
    /**
      * Gets current value of property {@link #getVisible visible}.
      *
      * Defines visibility of column
      *
      * @returns Value of property `visible`
      */
    def getVisible(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Defines column width
      *
      * @returns Value of property `width`
      */
    def getWidth(): String = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Sets a new value for property {@link #getAggregationRole aggregationRole}.
      *
      * Defines aggregation role
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAggregationRole(): this.type = js.native
    def setAggregationRole(/**
      * New value for property `aggregationRole`
      */
    sAggregationRole: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getColumnKey columnKey}.
      *
      * Can be used as input for subsequent actions.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setColumnKey(): this.type = js.native
    def setColumnKey(/**
      * New value for property `columnKey`
      */
    sColumnKey: String): this.type = js.native
    
    /**
      * @SINCE 1.56.0
      *
      * Sets a new value for property {@link #getDescription description}.
      *
      * Defines additional information of the link.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDescription(): this.type = js.native
    def setDescription(/**
      * New value for property `description`
      */
    sDescription: String): this.type = js.native
    
    /**
      * @SINCE 1.52
      *
      * Sets a new value for property {@link #getFormatSettings formatSettings}.
      *
      * A JSON object containing the formatSettings which will be used to pass additional type/format settings
      * for the entered value. if type==time or date or datetime the object will be used for the DateFormatter,
      * TimeFormatter or DateTimeFormatter
      *
      * Below you can find a brief example
      *
      *
      * ```javascript
      *
      * {
      * 		UTC: false,
      * 		style: "medium" //"short" or "long"
      * }
      * ```
      *
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFormatSettings(): this.type = js.native
    def setFormatSettings(/**
      * New value for property `formatSettings`
      */
    oFormatSettings: js.Object): this.type = js.native
    
    /**
      * @SINCE 1.46.0
      *
      * Sets a new value for property {@link #getHref href}.
      *
      * Defines href of a link.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHref(): this.type = js.native
    def setHref(/**
      * New value for property `href`
      */
    sHref: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIsDefault isDefault}.
      *
      * the column with isDefault==true will be used as the selected column item on the conditionPanel
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIsDefault(): this.type = js.native
    def setIsDefault(/**
      * New value for property `isDefault`
      */
    bIsDefault: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMaxLength maxLength}.
      *
      * specifies the number of characters which can be entered in the value fields of the condition panel
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMaxLength(): this.type = js.native
    def setMaxLength(/**
      * New value for property `maxLength`
      */
    sMaxLength: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getNullable nullable}.
      *
      * Defines if the item is nullable
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setNullable(): this.type = js.native
    def setNullable(/**
      * New value for property `nullable`
      */
    bNullable: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getPrecision precision}.
      *
      * if type==numeric the precision will be used to format the entered value (maxIntegerDigits of the used
      * Formatter)
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPrecision(): this.type = js.native
    def setPrecision(/**
      * New value for property `precision`
      */
    sPrecision: String): this.type = js.native
    
    /**
      * @SINCE 1.46.0
      *
      * Sets a new value for property {@link #getPress press}.
      *
      * Defines press handler of a link.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPress(): this.type = js.native
    def setPress(/**
      * New value for property `press`
      */
    oPress: js.Object): this.type = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Sets a new value for property {@link #getRole role}.
      *
      * Defines role. The role is reflected in the manner how the dimension will influence the chart layout.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setRole(): this.type = js.native
    def setRole(/**
      * New value for property `role`
      */
    sRole: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getScale scale}.
      *
      * if type==numeric the scale will be used to format the entered value (maxFractionDigits of the used Formatter)
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setScale(): this.type = js.native
    def setScale(/**
      * New value for property `scale`
      */
    sScale: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTarget target}.
      *
      * Defines target of a link.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTarget(): this.type = js.native
    def setTarget(/**
      * New value for property `target`
      */
    sTarget: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getText text}.
      *
      * The text to be displayed for the item.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setText(): this.type = js.native
    def setText(/**
      * New value for property `text`
      */
    sText: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getType type}.
      *
      * data type of the column (text, numeric or date is supported)
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"text"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setType(): this.type = js.native
    def setType(/**
      * New value for property `type`
      */
    sType: String): this.type = js.native
    
    /**
      * @SINCE 1.56
      *
      * Sets a new value for property {@link #getTypeInstance typeInstance}.
      *
      * data type instance of the column. Can be used instead of the type, precision, scale and formatSettings
      * properties
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTypeInstance(): this.type = js.native
    def setTypeInstance(/**
      * New value for property `typeInstance`
      */
    oTypeInstance: js.Object): this.type = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Sets a new value for property {@link #getValues values}.
      *
      * the array of values for type bool. e.g. ["", "Off", "On"]. The first entry can be empty (used to blank
      * the value field). Next value represent the false value, last entry the true value.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValues(): this.type = js.native
    def setValues(/**
      * New value for property `values`
      */
    sValues: js.Array[String]): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getVisible visible}.
      *
      * Defines visibility of column
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVisible(): this.type = js.native
    def setVisible(/**
      * New value for property `visible`
      */
    bVisible: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Defines column width
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(): this.type = js.native
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: String): this.type = js.native
  }
  
  trait P13nItemSettings
    extends StObject
       with ElementSettings {
    
    /**
      * @SINCE 1.34.0
      *
      * Defines aggregation role
      */
    var aggregationRole: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Can be used as input for subsequent actions.
      */
    var columnKey: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.56.0
      *
      * Defines additional information of the link.
      */
    var description: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.52
      *
      * A JSON object containing the formatSettings which will be used to pass additional type/format settings
      * for the entered value. if type==time or date or datetime the object will be used for the DateFormatter,
      * TimeFormatter or DateTimeFormatter
      *
      * Below you can find a brief example
      *
      *
      * ```javascript
      *
      * {
      * 		UTC: false,
      * 		style: "medium" //"short" or "long"
      * }
      * ```
      */
    var formatSettings: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.46.0
      *
      * Defines href of a link.
      */
    var href: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * the column with isDefault==true will be used as the selected column item on the conditionPanel
      */
    var isDefault: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * specifies the number of characters which can be entered in the value fields of the condition panel
      */
    var maxLength: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines if the item is nullable
      */
    var nullable: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * if type==numeric the precision will be used to format the entered value (maxIntegerDigits of the used
      * Formatter)
      */
    var precision: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.46.0
      *
      * Defines press handler of a link.
      */
    var press: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.34.0
      *
      * Defines role. The role is reflected in the manner how the dimension will influence the chart layout.
      */
    var role: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * if type==numeric the scale will be used to format the entered value (maxFractionDigits of the used Formatter)
      */
    var scale: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines target of a link.
      */
    var target: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The text to be displayed for the item.
      */
    var text: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * data type of the column (text, numeric or date is supported)
      */
    var `type`: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.56
      *
      * data type instance of the column. Can be used instead of the type, precision, scale and formatSettings
      * properties
      */
    var typeInstance: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.34.0
      *
      * the array of values for type bool. e.g. ["", "Off", "On"]. The first entry can be empty (used to blank
      * the value field). Next value represent the false value, last entry the true value.
      */
    var values: js.UndefOr[
        js.Array[String] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines visibility of column
      */
    var visible: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines column width
      */
    var width: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object P13nItemSettings {
    
    inline def apply(): P13nItemSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[P13nItemSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: P13nItemSettings] (val x: Self) extends AnyVal {
      
      inline def setAggregationRole(value: String | PropertyBindingInfo): Self = StObject.set(x, "aggregationRole", value.asInstanceOf[js.Any])
      
      inline def setAggregationRoleUndefined: Self = StObject.set(x, "aggregationRole", js.undefined)
      
      inline def setColumnKey(value: String | PropertyBindingInfo): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
      
      inline def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
      
      inline def setDescription(value: String | PropertyBindingInfo): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setFormatSettings(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "formatSettings", value.asInstanceOf[js.Any])
      
      inline def setFormatSettingsUndefined: Self = StObject.set(x, "formatSettings", js.undefined)
      
      inline def setHref(value: String | PropertyBindingInfo): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setIsDefault(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
      
      inline def setIsDefaultUndefined: Self = StObject.set(x, "isDefault", js.undefined)
      
      inline def setMaxLength(value: String | PropertyBindingInfo): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setNullable(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
      
      inline def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
      
      inline def setPrecision(value: String | PropertyBindingInfo): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setPress(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "press", value.asInstanceOf[js.Any])
      
      inline def setPressUndefined: Self = StObject.set(x, "press", js.undefined)
      
      inline def setRole(value: String | PropertyBindingInfo): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setScale(value: String | PropertyBindingInfo): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setTarget(value: String | PropertyBindingInfo): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setText(value: String | PropertyBindingInfo): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: String | PropertyBindingInfo): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeInstance(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "typeInstance", value.asInstanceOf[js.Any])
      
      inline def setTypeInstanceUndefined: Self = StObject.set(x, "typeInstance", js.undefined)
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValues(
        value: js.Array[String] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
      
      inline def setVisible(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWidth(value: String | PropertyBindingInfo): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
