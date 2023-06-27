package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.HorizontalAlign
import typings.openui5.sapUiCoreLibraryMod.Priority
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcTableColumnMod {
  
  @JSImport("sap/ui/mdc/table/Column", JSImport.Default)
  @js.native
  /**
    * Constructor for a new Column.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Column {
    def this(/**
      * initial settings for the new control
      */
    mSettings: ColumnSettings) = this()
    def this(/**
      * Optional ID for the new object; generated automatically if no non-empty ID is given
      */
    sId: String) = this()
    def this(
      /**
      * Optional ID for the new object; generated automatically if no non-empty ID is given
      */
    sId: String,
      /**
      * initial settings for the new control
      */
    mSettings: ColumnSettings
    ) = this()
    def this(
      /**
      * Optional ID for the new object; generated automatically if no non-empty ID is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: ColumnSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/mdc/table/Column", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.mdc.table.Column with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, Column]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Column],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.mdc.table.Column.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Column
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * @experimental - Do not use
      *
      * Destroys the creationTemplate in the aggregation {@link #getCreationTemplate creationTemplate}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyCreationTemplate(): this.type = js.native
    
    /**
      * @since 1.110
      *
      * Destroys the extendedSettings in the aggregation {@link #getExtendedSettings extendedSettings}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyExtendedSettings(): this.type = js.native
    
    /**
      * Destroys the template in the aggregation {@link #getTemplate template}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyTemplate(): this.type = js.native
    
    /**
      * @experimental - Do not use
      *
      * Gets content of aggregation {@link #getCreationTemplate creationTemplate}.
      *
      * `CreationRow` template.
      *
      * **Note:** Once the binding supports creating transient records, this aggregation will be removed.
      */
    def getCreationTemplate(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * @since 1.84
      * @deprecated (since 1.115) - Please use `propertyKey` instead.
      *
      * Gets current value of property {@link #getDataProperty dataProperty}.
      *
      * Defines data property related to the column.
      *
      * @returns Value of property `dataProperty`
      */
    def getDataProperty(): String = js.native
    
    /**
      * @since 1.110
      *
      * Gets content of aggregation {@link #getExtendedSettings extendedSettings}.
      *
      * Defines type-specific column settings based on the used {@link sap.ui.mdc.table.TableTypeBase}.
      *
      * **Note:** Once `sap.ui.mdc.table.ColumnSettings` are defined, all properties provided by the `ColumnSettings`
      * are automatically assigned to the column.
      */
    def getExtendedSettings(): typings.openui5.sapUiMdcTableColumnSettingsMod.default = js.native
    
    /**
      * @since 1.80
      *
      * Gets current value of property {@link #getHAlign hAlign}.
      *
      * Defines the horizontal alignment of the column content.
      *
      * Default value is `"Begin"`.
      *
      * @returns Value of property `hAlign`
      */
    def getHAlign(): HorizontalAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HorizontalAlign * / any */ String) = js.native
    
    /**
      * @since 1.80
      *
      * Gets current value of property {@link #getHeader header}.
      *
      * Defines the column header text.
      *
      * @returns Value of property `header`
      */
    def getHeader(): String = js.native
    
    /**
      * @since 1.80
      *
      * Gets current value of property {@link #getHeaderVisible headerVisible}.
      *
      * Defines whether the column header is visible.
      *
      * Default value is `true`.
      *
      * @returns Value of property `headerVisible`
      */
    def getHeaderVisible(): Boolean = js.native
    
    /**
      * @deprecated (since 1.110) - replaced with {@link sap.ui.mdc.table.ResponsiveColumnSettings#importance }
      *
      *  This property will be ignored whenever the {@link sap.ui.mdc.table.ResponsiveColumnSettings} are applied
      * to the column.
      *
      * Gets current value of property {@link #getImportance importance}.
      *
      * Defines the column importance.
      *
      * The column importance is taken into consideration for calculating the `minScreenWidth` property and for
      * setting the `demandPopin` property of the column. See {@link sap.m.Table#getAutoPopinMode} for more details,
      * which is automatically set to `true`.
      *
      * Default value is `"None"`.
      *
      * @returns Value of property `importance`
      */
    def getImportance(): Priority | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Priority * / any */ String) = js.native
    
    /**
      * @since 1.80
      *
      * Gets current value of property {@link #getMinWidth minWidth}.
      *
      * Defines the minimum width of the column.
      *
      * Default value is `8`.
      *
      * @returns Value of property `minWidth`
      */
    def getMinWidth(): float = js.native
    
    /**
      * @since 1.115
      *
      * Gets current value of property {@link #getPropertyKey propertyKey}.
      *
      * Defines data property related to the column.
      *
      * @returns Value of property `propertyKey`
      */
    def getPropertyKey(): String = js.native
    
    /**
      * Gets current value of property {@link #getRequired required}.
      *
      * Indicates whether the content of the column is required. **Note:** The table only takes care of announcing
      * the state of the column header as defined by the `required` property. The application needs to take care
      * of the screen reader announcement of the state of the table cells, for example, by setting the `required`
      * property to `true` for `sap.m.Input`.
      *
      * Default value is `false`.
      *
      * @returns Value of property `required`
      */
    def getRequired(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getTemplate template}.
      *
      * Template for the column.
      */
    def getTemplate(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * @since 1.80
      *
      * Gets current value of property {@link #getWidth width}.
      *
      * Defines the width of the column.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * @experimental - Do not use
      *
      * Sets the aggregated {@link #getCreationTemplate creationTemplate}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCreationTemplate(
      /**
      * The creationTemplate to set
      */
    oCreationTemplate: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * @since 1.84
      * @deprecated (since 1.115) - Please use `propertyKey` instead.
      *
      * Sets a new value for property {@link #getDataProperty dataProperty}.
      *
      * Defines data property related to the column.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDataProperty(/**
      * New value for property `dataProperty`
      */
    sDataProperty: String): this.type = js.native
    
    /**
      * @since 1.110
      *
      * Sets the aggregated {@link #getExtendedSettings extendedSettings}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setExtendedSettings(
      /**
      * The extendedSettings to set
      */
    oExtendedSettings: typings.openui5.sapUiMdcTableColumnSettingsMod.default
    ): this.type = js.native
    
    /**
      * @since 1.80
      *
      * Sets a new value for property {@link #getHAlign hAlign}.
      *
      * Defines the horizontal alignment of the column content.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"Begin"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHAlign(): this.type = js.native
    def setHAlign(
      /**
      * New value for property `hAlign`
      */
    sHAlign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HorizontalAlign * / any */ String
    ): this.type = js.native
    def setHAlign(/**
      * New value for property `hAlign`
      */
    sHAlign: HorizontalAlign): this.type = js.native
    
    /**
      * @since 1.80
      *
      * Sets a new value for property {@link #getHeader header}.
      *
      * Defines the column header text.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeader(/**
      * New value for property `header`
      */
    sHeader: String): this.type = js.native
    
    /**
      * @since 1.80
      *
      * Sets a new value for property {@link #getHeaderVisible headerVisible}.
      *
      * Defines whether the column header is visible.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeaderVisible(): this.type = js.native
    def setHeaderVisible(/**
      * New value for property `headerVisible`
      */
    bHeaderVisible: Boolean): this.type = js.native
    
    /**
      * @deprecated (since 1.110) - replaced with {@link sap.ui.mdc.table.ResponsiveColumnSettings#importance }
      *
      *  This property will be ignored whenever the {@link sap.ui.mdc.table.ResponsiveColumnSettings} are applied
      * to the column.
      *
      * Sets a new value for property {@link #getImportance importance}.
      *
      * Defines the column importance.
      *
      * The column importance is taken into consideration for calculating the `minScreenWidth` property and for
      * setting the `demandPopin` property of the column. See {@link sap.m.Table#getAutoPopinMode} for more details,
      * which is automatically set to `true`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"None"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setImportance(): this.type = js.native
    def setImportance(
      /**
      * New value for property `importance`
      */
    sImportance: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Priority * / any */ String
    ): this.type = js.native
    def setImportance(/**
      * New value for property `importance`
      */
    sImportance: Priority): this.type = js.native
    
    /**
      * @since 1.80
      *
      * Sets a new value for property {@link #getMinWidth minWidth}.
      *
      * Defines the minimum width of the column.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `8`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMinWidth(): this.type = js.native
    def setMinWidth(/**
      * New value for property `minWidth`
      */
    fMinWidth: float): this.type = js.native
    
    /**
      * @since 1.115
      *
      * Sets a new value for property {@link #getPropertyKey propertyKey}.
      *
      * Defines data property related to the column.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPropertyKey(/**
      * New value for property `propertyKey`
      */
    sPropertyKey: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getRequired required}.
      *
      * Indicates whether the content of the column is required. **Note:** The table only takes care of announcing
      * the state of the column header as defined by the `required` property. The application needs to take care
      * of the screen reader announcement of the state of the table cells, for example, by setting the `required`
      * property to `true` for `sap.m.Input`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setRequired(): this.type = js.native
    def setRequired(/**
      * New value for property `required`
      */
    bRequired: Boolean): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getTemplate template}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTemplate(/**
      * The template to set
      */
    oTemplate: typings.openui5.sapUiCoreControlMod.default): this.type = js.native
    
    /**
      * @since 1.80
      *
      * Sets a new value for property {@link #getWidth width}.
      *
      * Defines the width of the column.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(): this.type = js.native
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
  }
  
  trait ColumnSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @experimental - Do not use
      *
      * `CreationRow` template.
      *
      * **Note:** Once the binding supports creating transient records, this aggregation will be removed.
      */
    var creationTemplate: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * @since 1.84
      * @deprecated (since 1.115) - Please use `propertyKey` instead.
      *
      * Defines data property related to the column.
      */
    var dataProperty: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @since 1.110
      *
      * Defines type-specific column settings based on the used {@link sap.ui.mdc.table.TableTypeBase}.
      *
      * **Note:** Once `sap.ui.mdc.table.ColumnSettings` are defined, all properties provided by the `ColumnSettings`
      * are automatically assigned to the column.
      */
    var extendedSettings: js.UndefOr[typings.openui5.sapUiMdcTableColumnSettingsMod.default] = js.undefined
    
    /**
      * @since 1.80
      *
      * Defines the horizontal alignment of the column content.
      */
    var hAlign: js.UndefOr[
        HorizontalAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HorizontalAlign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @since 1.80
      *
      * Defines the column header text.
      */
    var header: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @since 1.80
      *
      * Defines whether the column header is visible.
      */
    var headerVisible: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @deprecated (since 1.110) - replaced with {@link sap.ui.mdc.table.ResponsiveColumnSettings#importance }
      *
      *  This property will be ignored whenever the {@link sap.ui.mdc.table.ResponsiveColumnSettings} are applied
      * to the column.
      *
      * Defines the column importance.
      *
      * The column importance is taken into consideration for calculating the `minScreenWidth` property and for
      * setting the `demandPopin` property of the column. See {@link sap.m.Table#getAutoPopinMode} for more details,
      * which is automatically set to `true`.
      */
    var importance: js.UndefOr[
        Priority | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Priority * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @since 1.80
      *
      * Defines the minimum width of the column.
      */
    var minWidth: js.UndefOr[
        float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.115
      *
      * Defines data property related to the column.
      */
    var propertyKey: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Indicates whether the content of the column is required. **Note:** The table only takes care of announcing
      * the state of the column header as defined by the `required` property. The application needs to take care
      * of the screen reader announcement of the state of the table cells, for example, by setting the `required`
      * property to `true` for `sap.m.Input`.
      */
    var required: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Template for the column.
      */
    var template: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * @since 1.80
      *
      * Defines the width of the column.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ColumnSettings {
    
    inline def apply(): ColumnSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColumnSettings] (val x: Self) extends AnyVal {
      
      inline def setCreationTemplate(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "creationTemplate", value.asInstanceOf[js.Any])
      
      inline def setCreationTemplateUndefined: Self = StObject.set(x, "creationTemplate", js.undefined)
      
      inline def setDataProperty(value: String | PropertyBindingInfo): Self = StObject.set(x, "dataProperty", value.asInstanceOf[js.Any])
      
      inline def setDataPropertyUndefined: Self = StObject.set(x, "dataProperty", js.undefined)
      
      inline def setExtendedSettings(value: typings.openui5.sapUiMdcTableColumnSettingsMod.default): Self = StObject.set(x, "extendedSettings", value.asInstanceOf[js.Any])
      
      inline def setExtendedSettingsUndefined: Self = StObject.set(x, "extendedSettings", js.undefined)
      
      inline def setHAlign(
        value: HorizontalAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HorizontalAlign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "hAlign", value.asInstanceOf[js.Any])
      
      inline def setHAlignUndefined: Self = StObject.set(x, "hAlign", js.undefined)
      
      inline def setHeader(value: String | PropertyBindingInfo): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setHeaderVisible(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "headerVisible", value.asInstanceOf[js.Any])
      
      inline def setHeaderVisibleUndefined: Self = StObject.set(x, "headerVisible", js.undefined)
      
      inline def setImportance(
        value: Priority | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Priority * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "importance", value.asInstanceOf[js.Any])
      
      inline def setImportanceUndefined: Self = StObject.set(x, "importance", js.undefined)
      
      inline def setMinWidth(value: float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setPropertyKey(value: String | PropertyBindingInfo): Self = StObject.set(x, "propertyKey", value.asInstanceOf[js.Any])
      
      inline def setPropertyKeyUndefined: Self = StObject.set(x, "propertyKey", js.undefined)
      
      inline def setRequired(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setTemplate(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
