package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.PopinLayout
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.openui5.sapUiCoreLibraryMod.Priority
import typings.openui5.sapUiMdcEnumsTableGrowingModeMod.TableGrowingMode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcTableResponsiveTableTypeMod {
  
  @JSImport("sap/ui/mdc/table/ResponsiveTableType", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `ResponsiveTableType`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ResponsiveTableType {
    def this(/**
      * Initial settings for the new object
      */
    mSettings: ResponsiveTableTypeSettings) = this()
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
      * Initial settings for the new object
      */
    mSettings: ResponsiveTableTypeSettings
    ) = this()
    def this(
      /**
      * Optional ID for the new object; generated automatically if no non-empty ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new object
      */
    mSettings: ResponsiveTableTypeSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/mdc/table/ResponsiveTableType", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.mdc.table.ResponsiveTableType with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.mdc.table.TableTypeBase.extend}.
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
    oClassInfo: ClassInfo[T, ResponsiveTableType]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ResponsiveTableType],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.mdc.table.ResponsiveTableType.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ResponsiveTableType
    extends typings.openui5.sapUiMdcTableTableTypeBaseMod.default {
    
    /**
      * @since 1.86
      *
      * Gets current value of property {@link #getDetailsButtonSetting detailsButtonSetting}.
      *
      * Defines which columns are hidden instead of moved into the pop-in area depending on their importance.
      * See {@link sap.m.Column#getImportance} and {@link sap.m.Table#getHiddenInPopin} for more details.
      *
      * **Note:** To hide columns based on their importance, it's mandatory to set `showDetailsButton="true"`.
      *  If no priority is given, the default configuration of {@link sap.ui.mdc.table.ResponsiveTableType#getShowDetailsButton }
      * is used.
      *  If this property is changed after the `Table` has been initialized, the new changes take effect only
      * when the Show / Hide Details button is pressed a second time.
      *
      * @returns Value of property `detailsButtonSetting`
      */
    def getDetailsButtonSetting(): js.Array[
        Priority | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Priority * / any */ String)
      ] = js.native
    
    /**
      * Gets current value of property {@link #getGrowingMode growingMode}.
      *
      * Specifies the growing mode.
      *
      * Default value is `Basic`.
      *
      * @returns Value of property `growingMode`
      */
    def getGrowingMode(): TableGrowingMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TableGrowingMode * / any */ String) = js.native
    
    /**
      * @since 1.96
      *
      * Gets current value of property {@link #getPopinLayout popinLayout}.
      *
      * Defines the layout in which the table pop-in rows are rendered.
      *
      * Default value is `"Block"`.
      *
      * @returns Value of property `popinLayout`
      */
    def getPopinLayout(): PopinLayout | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PopinLayout * / any */ String) = js.native
    
    /**
      * @since 1.79
      *
      * Gets current value of property {@link #getShowDetailsButton showDetailsButton}.
      *
      * Specifies whether the Show / Hide Details button for the `ResponsiveTable` scenario is shown.
      *
      * If the available screen space gets too narrow, the columns configured with `High` and `Medium` importance
      * move to the pop-in area, while the columns with `Low` importance are hidden.
      *  On mobile phones, the columns with `Medium` importance are also hidden.
      *  As soon as the first column is hidden, this button appears in the table toolbar and gives the user the
      * possibility to toggle the visibility of the hidden columns in the pop-in area.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showDetailsButton`
      */
    def getShowDetailsButton(): Boolean = js.native
    
    /**
      * @since 1.86
      *
      * Sets a new value for property {@link #getDetailsButtonSetting detailsButtonSetting}.
      *
      * Defines which columns are hidden instead of moved into the pop-in area depending on their importance.
      * See {@link sap.m.Column#getImportance} and {@link sap.m.Table#getHiddenInPopin} for more details.
      *
      * **Note:** To hide columns based on their importance, it's mandatory to set `showDetailsButton="true"`.
      *  If no priority is given, the default configuration of {@link sap.ui.mdc.table.ResponsiveTableType#getShowDetailsButton }
      * is used.
      *  If this property is changed after the `Table` has been initialized, the new changes take effect only
      * when the Show / Hide Details button is pressed a second time.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDetailsButtonSetting(
      /**
      * New value for property `detailsButtonSetting`
      */
    sDetailsButtonSetting: js.Array[
          Priority | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Priority * / any */ String)
        ]
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getGrowingMode growingMode}.
      *
      * Specifies the growing mode.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Basic`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGrowingMode(): this.type = js.native
    def setGrowingMode(
      /**
      * New value for property `growingMode`
      */
    sGrowingMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TableGrowingMode * / any */ String
    ): this.type = js.native
    def setGrowingMode(/**
      * New value for property `growingMode`
      */
    sGrowingMode: TableGrowingMode): this.type = js.native
    
    /**
      * @since 1.96
      *
      * Sets a new value for property {@link #getPopinLayout popinLayout}.
      *
      * Defines the layout in which the table pop-in rows are rendered.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"Block"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPopinLayout(): this.type = js.native
    def setPopinLayout(
      /**
      * New value for property `popinLayout`
      */
    sPopinLayout: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PopinLayout * / any */ String
    ): this.type = js.native
    def setPopinLayout(/**
      * New value for property `popinLayout`
      */
    sPopinLayout: PopinLayout): this.type = js.native
    
    /**
      * @since 1.79
      *
      * Sets a new value for property {@link #getShowDetailsButton showDetailsButton}.
      *
      * Specifies whether the Show / Hide Details button for the `ResponsiveTable` scenario is shown.
      *
      * If the available screen space gets too narrow, the columns configured with `High` and `Medium` importance
      * move to the pop-in area, while the columns with `Low` importance are hidden.
      *  On mobile phones, the columns with `Medium` importance are also hidden.
      *  As soon as the first column is hidden, this button appears in the table toolbar and gives the user the
      * possibility to toggle the visibility of the hidden columns in the pop-in area.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowDetailsButton(): this.type = js.native
    def setShowDetailsButton(/**
      * New value for property `showDetailsButton`
      */
    bShowDetailsButton: Boolean): this.type = js.native
  }
  
  trait ResponsiveTableTypeSettings
    extends StObject
       with ElementSettings {
    
    /**
      * @since 1.86
      *
      * Defines which columns are hidden instead of moved into the pop-in area depending on their importance.
      * See {@link sap.m.Column#getImportance} and {@link sap.m.Table#getHiddenInPopin} for more details.
      *
      * **Note:** To hide columns based on their importance, it's mandatory to set `showDetailsButton="true"`.
      *  If no priority is given, the default configuration of {@link sap.ui.mdc.table.ResponsiveTableType#getShowDetailsButton }
      * is used.
      *  If this property is changed after the `Table` has been initialized, the new changes take effect only
      * when the Show / Hide Details button is pressed a second time.
      */
    var detailsButtonSetting: js.UndefOr[
        (js.Array[
          Priority | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Priority * / any */ String)
        ]) | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Specifies the growing mode.
      */
    var growingMode: js.UndefOr[
        TableGrowingMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TableGrowingMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @since 1.96
      *
      * Defines the layout in which the table pop-in rows are rendered.
      */
    var popinLayout: js.UndefOr[
        PopinLayout | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PopinLayout * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @since 1.79
      *
      * Specifies whether the Show / Hide Details button for the `ResponsiveTable` scenario is shown.
      *
      * If the available screen space gets too narrow, the columns configured with `High` and `Medium` importance
      * move to the pop-in area, while the columns with `Low` importance are hidden.
      *  On mobile phones, the columns with `Medium` importance are also hidden.
      *  As soon as the first column is hidden, this button appears in the table toolbar and gives the user the
      * possibility to toggle the visibility of the hidden columns in the pop-in area.
      */
    var showDetailsButton: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ResponsiveTableTypeSettings {
    
    inline def apply(): ResponsiveTableTypeSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponsiveTableTypeSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResponsiveTableTypeSettings] (val x: Self) extends AnyVal {
      
      inline def setDetailsButtonSetting(
        value: (js.Array[
              Priority | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Priority * / any */ String)
            ]) | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "detailsButtonSetting", value.asInstanceOf[js.Any])
      
      inline def setDetailsButtonSettingUndefined: Self = StObject.set(x, "detailsButtonSetting", js.undefined)
      
      inline def setDetailsButtonSettingVarargs(
        value: (Priority | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Priority * / any */ String))*
      ): Self = StObject.set(x, "detailsButtonSetting", js.Array(value*))
      
      inline def setGrowingMode(
        value: TableGrowingMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TableGrowingMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "growingMode", value.asInstanceOf[js.Any])
      
      inline def setGrowingModeUndefined: Self = StObject.set(x, "growingMode", js.undefined)
      
      inline def setPopinLayout(
        value: PopinLayout | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PopinLayout * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "popinLayout", value.asInstanceOf[js.Any])
      
      inline def setPopinLayoutUndefined: Self = StObject.set(x, "popinLayout", js.undefined)
      
      inline def setShowDetailsButton(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showDetailsButton", value.asInstanceOf[js.Any])
      
      inline def setShowDetailsButtonUndefined: Self = StObject.set(x, "showDetailsButton", js.undefined)
    }
  }
}
