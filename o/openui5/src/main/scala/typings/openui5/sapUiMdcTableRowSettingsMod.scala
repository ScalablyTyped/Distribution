package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcTableRowSettingsMod {
  
  @JSImport("sap/ui/mdc/table/RowSettings", JSImport.Default)
  @js.native
  /**
    * Constructor for new RowSettings.
    *
    * Caution: Only use bindings which are bound against the rows, as working functionalities cannot be ensured
    * for other binding types.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends RowSettings {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: RowSettingsSettings) = this()
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
      * Initial settings for the new control
      */
    mSettings: RowSettingsSettings
    ) = this()
    def this(
      /**
      * Optional ID for the new object; generated automatically if no non-empty ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: RowSettingsSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/mdc/table/RowSettings", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.mdc.table.RowSettings with name `sClassName` and enriches it with
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
    oClassInfo: ClassInfo[T, RowSettings]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, RowSettings],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.mdc.table.RowSettings.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait RowSettings
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * Adds some rowAction to the aggregation {@link #getRowActions rowActions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addRowAction(
      /**
      * The rowAction to add; if empty, nothing is inserted
      */
    oRowAction: typings.openui5.sapUiMdcTableRowActionItemMod.default
    ): this.type = js.native
    
    /**
      * Destroys all the rowActions in the aggregation {@link #getRowActions rowActions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyRowActions(): this.type = js.native
    
    /**
      * Gets current value of property {@link #getHighlight highlight}.
      *
      * The highlight state of the rows.
      *
      * If the highlight is set to {@link sap.ui.core.MessageType sap.ui.core.MessageType.None} (default), no
      * highlights are visible. Valid values for the `highlight` property are values of the enumerations {@link sap.ui.core.MessageType }
      * or {@link sap.ui.core.IndicationColor}.
      *
      * Accessibility support is provided through the associated {@link sap.ui.mdc.table.RowSettings#setHighlightText highlightText }
      * property. If the `highlight` property is set to a value of {@link sap.ui.core.MessageType}, the `highlightText`
      * property does not need to be set because a default text is used. However, the default text can be overridden
      * by setting the `highlightText` property. In all other cases the `highlightText` property must be set.
      *
      * Default value is `"None"`.
      *
      * @returns Value of property `highlight`
      */
    def getHighlight(): String = js.native
    
    /**
      * Gets current value of property {@link #getHighlightText highlightText}.
      *
      * Defines the semantics of the {@link sap.ui.mdc.table.RowSettings#setHighlight highlight} property for
      * accessibility purposes.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `highlightText`
      */
    def getHighlightText(): String = js.native
    
    /**
      * Gets current value of property {@link #getNavigated navigated}.
      *
      * The navigated state of a row.
      *
      * If set to `true`, a navigation indicator is displayed at the end of the row.
      *
      * Default value is `false`.
      *
      * @returns Value of property `navigated`
      */
    def getNavigated(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getRowActions rowActions}.
      *
      * The available actions for a row.
      *
      * rowActions cannot be bound with a factory. Additionally, {@link sap.m.Table} only works with row actions
      * of type navigation.
      */
    def getRowActions(): js.Array[typings.openui5.sapUiMdcTableRowActionItemMod.default] = js.native
    
    /**
      * Checks for the provided `sap.ui.mdc.table.RowActionItem` in the aggregation {@link #getRowActions rowActions}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfRowAction(
      /**
      * The rowAction whose index is looked for
      */
    oRowAction: typings.openui5.sapUiMdcTableRowActionItemMod.default
    ): int = js.native
    
    /**
      * Inserts a rowAction into the aggregation {@link #getRowActions rowActions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertRowAction(
      /**
      * The rowAction to insert; if empty, nothing is inserted
      */
    oRowAction: typings.openui5.sapUiMdcTableRowActionItemMod.default,
      /**
      * The `0`-based index the rowAction should be inserted at; for a negative value of `iIndex`, the rowAction
      * is inserted at position 0; for a value greater than the current size of the aggregation, the rowAction
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getRowActions rowActions}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllRowActions(): js.Array[typings.openui5.sapUiMdcTableRowActionItemMod.default] = js.native
    
    def removeRowAction(/**
      * The rowAction to remove or its index or id
      */
    vRowAction: String): typings.openui5.sapUiMdcTableRowActionItemMod.default | Null = js.native
    /**
      * Removes a rowAction from the aggregation {@link #getRowActions rowActions}.
      *
      * @returns The removed rowAction or `null`
      */
    def removeRowAction(/**
      * The rowAction to remove or its index or id
      */
    vRowAction: int): typings.openui5.sapUiMdcTableRowActionItemMod.default | Null = js.native
    def removeRowAction(
      /**
      * The rowAction to remove or its index or id
      */
    vRowAction: typings.openui5.sapUiMdcTableRowActionItemMod.default
    ): typings.openui5.sapUiMdcTableRowActionItemMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getHighlight highlight}.
      *
      * The highlight state of the rows.
      *
      * If the highlight is set to {@link sap.ui.core.MessageType sap.ui.core.MessageType.None} (default), no
      * highlights are visible. Valid values for the `highlight` property are values of the enumerations {@link sap.ui.core.MessageType }
      * or {@link sap.ui.core.IndicationColor}.
      *
      * Accessibility support is provided through the associated {@link sap.ui.mdc.table.RowSettings#setHighlightText highlightText }
      * property. If the `highlight` property is set to a value of {@link sap.ui.core.MessageType}, the `highlightText`
      * property does not need to be set because a default text is used. However, the default text can be overridden
      * by setting the `highlightText` property. In all other cases the `highlightText` property must be set.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"None"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHighlight(): this.type = js.native
    def setHighlight(/**
      * New value for property `highlight`
      */
    sHighlight: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHighlightText highlightText}.
      *
      * Defines the semantics of the {@link sap.ui.mdc.table.RowSettings#setHighlight highlight} property for
      * accessibility purposes.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHighlightText(): this.type = js.native
    def setHighlightText(/**
      * New value for property `highlightText`
      */
    sHighlightText: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getNavigated navigated}.
      *
      * The navigated state of a row.
      *
      * If set to `true`, a navigation indicator is displayed at the end of the row.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setNavigated(): this.type = js.native
    def setNavigated(/**
      * New value for property `navigated`
      */
    bNavigated: Boolean): this.type = js.native
  }
  
  trait RowSettingsSettings
    extends StObject
       with ElementSettings {
    
    /**
      * The highlight state of the rows.
      *
      * If the highlight is set to {@link sap.ui.core.MessageType sap.ui.core.MessageType.None} (default), no
      * highlights are visible. Valid values for the `highlight` property are values of the enumerations {@link sap.ui.core.MessageType }
      * or {@link sap.ui.core.IndicationColor}.
      *
      * Accessibility support is provided through the associated {@link sap.ui.mdc.table.RowSettings#setHighlightText highlightText }
      * property. If the `highlight` property is set to a value of {@link sap.ui.core.MessageType}, the `highlightText`
      * property does not need to be set because a default text is used. However, the default text can be overridden
      * by setting the `highlightText` property. In all other cases the `highlightText` property must be set.
      */
    var highlight: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the semantics of the {@link sap.ui.mdc.table.RowSettings#setHighlight highlight} property for
      * accessibility purposes.
      */
    var highlightText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The navigated state of a row.
      *
      * If set to `true`, a navigation indicator is displayed at the end of the row.
      */
    var navigated: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The available actions for a row.
      *
      * rowActions cannot be bound with a factory. Additionally, {@link sap.m.Table} only works with row actions
      * of type navigation.
      */
    var rowActions: js.UndefOr[
        js.Array[typings.openui5.sapUiMdcTableRowActionItemMod.default] | typings.openui5.sapUiMdcTableRowActionItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object RowSettingsSettings {
    
    inline def apply(): RowSettingsSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowSettingsSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RowSettingsSettings] (val x: Self) extends AnyVal {
      
      inline def setHighlight(value: String | PropertyBindingInfo): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
      
      inline def setHighlightText(value: String | PropertyBindingInfo): Self = StObject.set(x, "highlightText", value.asInstanceOf[js.Any])
      
      inline def setHighlightTextUndefined: Self = StObject.set(x, "highlightText", js.undefined)
      
      inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
      
      inline def setNavigated(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "navigated", value.asInstanceOf[js.Any])
      
      inline def setNavigatedUndefined: Self = StObject.set(x, "navigated", js.undefined)
      
      inline def setRowActions(
        value: js.Array[typings.openui5.sapUiMdcTableRowActionItemMod.default] | typings.openui5.sapUiMdcTableRowActionItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "rowActions", value.asInstanceOf[js.Any])
      
      inline def setRowActionsUndefined: Self = StObject.set(x, "rowActions", js.undefined)
      
      inline def setRowActionsVarargs(value: typings.openui5.sapUiMdcTableRowActionItemMod.default*): Self = StObject.set(x, "rowActions", js.Array(value*))
    }
  }
}
