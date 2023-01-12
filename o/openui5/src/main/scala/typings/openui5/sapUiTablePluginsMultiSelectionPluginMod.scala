package typings.openui5

import typings.openui5.anon.CustomPayload
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiTableLibraryMod.SelectionMode
import typings.openui5.sapUiTablePluginsSelectionPluginMod.SelectionPluginSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiTablePluginsMultiSelectionPluginMod {
  
  @JSImport("sap/ui/table/plugins/MultiSelectionPlugin", JSImport.Default)
  @js.native
  /**
    * Constructs an instance of sap.ui.table.plugins.MultiSelectionPlugin
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends MultiSelectionPlugin
  /* static members */
  object default {
    
    @JSImport("sap/ui/table/plugins/MultiSelectionPlugin", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.table.plugins.MultiSelectionPlugin with name `sClassName` and
      * enriches it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.table.plugins.SelectionPlugin.extend}.
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
    oClassInfo: ClassInfo[T, MultiSelectionPlugin]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, MultiSelectionPlugin],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.table.plugins.MultiSelectionPlugin.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait MultiSelectionPlugin
    extends typings.openui5.sapUiTablePluginsSelectionPluginMod.default {
    
    /**
      * Adds the given selection interval to the selection and requests the corresponding binding contexts. In
      * single-selection mode it requests the context and sets the selected index to `iIndexTo`.
      *
      * If the number of indices in the range is greater than the value of the `limit` property, only n=limit
      * indices, starting from `iIndexFrom`, are selected. The table is scrolled to display the index last selected.
      *
      * @returns A Promise that resolves after the selection has been completed or is rejected with an error
      */
    def addSelectionInterval(
      /**
      * Index from which the selection starts
      */
    iIndexFrom: int,
      /**
      * Index up to which to select
      */
    iIndexTo: int
    ): js.Promise[Any] = js.native
    def addSelectionInterval(
      /**
      * Index from which the selection starts
      */
    iIndexFrom: int,
      /**
      * Index up to which to select
      */
    iIndexTo: int,
      /**
      * If the function call triggers a {@link #event:selectionChange selectionChange} event, this object is
      * transferred to the event in the `customPayload` parameter
      */
    oEventPayload: js.Object
    ): js.Promise[Any] = js.native
    
    /**
      * Removes the complete selection.
      */
    def clearSelection(): Unit = js.native
    def clearSelection(
      /**
      * If the function call triggers a {@link #event:selectionChange selectionChange} event, this object is
      * transferred to the event in the `customPayload` parameter
      */
    oEventPayload: js.Object
    ): Unit = js.native
    
    def fireSelectionChange(/**
      * Parameters to pass along with the event
      */
    mParameters: CustomPayload): this.type = js.native
    
    /**
      * @SINCE 1.71
      *
      * Gets current value of property {@link #getEnableNotification enableNotification}.
      *
      * Enables notifications that are displayed once a selection has been limited.
      *
      * Default value is `false`.
      *
      * @returns Value of property `enableNotification`
      */
    def getEnableNotification(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getLimit limit}.
      *
      * Number of indices which can be selected in a range. Accepts positive integer values. If set to 0, the
      * limit is disabled, and the Select All checkbox appears instead of the Deselect All button. **Note:**
      * To avoid severe performance problems, the limit should only be set to 0 in the following cases:
      *
      * 	 - With client-side models
      * 	 - With server-side models if they are used in client mode
      * 	 - If the entity set is small  In other cases, we recommend to set the limit to at least double
      * 			the value of the {@link sap.ui.table.Table#getThreshold threshold} property of the related `sap.ui.table.Table`
      * 			control.
      *
      * Default value is `200`.
      *
      * @returns Value of property `limit`
      */
    def getLimit(): int = js.native
    
    /**
      * Zero-based indices of selected indices, wrapped in an array. An empty array means nothing has been selected.
      *
      * @returns An array containing all selected indices
      */
    def getSelectedIndices(): js.Array[int] = js.native
    
    /**
      * Gets current value of property {@link #getSelectionMode selectionMode}.
      *
      * Selection mode of the plugin. This property controls whether single or multiple rows can be selected.
      * It also influences the visual appearance. When the selection mode is changed, the current selection is
      * removed.
      *
      * Default value is `MultiToggle`.
      *
      * @returns Value of property `selectionMode`
      */
    def getSelectionMode(): SelectionMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectionMode * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getShowHeaderSelector showHeaderSelector}.
      *
      * Show header selector
      *
      * Default value is `true`.
      *
      * @returns Value of property `showHeaderSelector`
      */
    def getShowHeaderSelector(): Boolean = js.native
    
    /**
      * Returns the information whether the given index is selected.
      *
      * @returns `true` if the index is selected
      */
    def isIndexSelected(/**
      * The index for which the selection state is retrieved
      */
    iIndex: int): Boolean = js.native
    
    /**
      * Removes the given selection interval from the selection. In case of single selection, only `iIndexTo`
      * is removed from the selection.
      */
    def removeSelectionInterval(
      /**
      * Index from which the deselection starts
      */
    iIndexFrom: int,
      /**
      * Index up to which to deselect
      */
    iIndexTo: int
    ): Unit = js.native
    def removeSelectionInterval(
      /**
      * Index from which the deselection starts
      */
    iIndexFrom: int,
      /**
      * Index up to which to deselect
      */
    iIndexTo: int,
      /**
      * If the function call triggers a {@link #event:selectionChange selectionChange} event, this object is
      * transferred to the event in the `customPayload` parameter
      */
    oEventPayload: js.Object
    ): Unit = js.native
    
    /**
      * Requests the binding contexts and adds all indices to the selection if the limit is disabled or the binding
      * length is smaller then the limit.
      *
      * @returns A Promise that resolves after the selection has been completed or is rejected with an error
      */
    def selectAll(): js.Promise[Any] = js.native
    def selectAll(
      /**
      * If the function call triggers a {@link #event:selectionChange selectionChange} event, this object is
      * transferred to the event in the `customPayload` parameter
      */
    oEventPayload: js.Object
    ): js.Promise[Any] = js.native
    
    /**
      * @SINCE 1.71
      *
      * Sets a new value for property {@link #getEnableNotification enableNotification}.
      *
      * Enables notifications that are displayed once a selection has been limited.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnableNotification(): this.type = js.native
    def setEnableNotification(/**
      * New value for property `enableNotification`
      */
    bEnableNotification: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getLimit limit}.
      *
      * Number of indices which can be selected in a range. Accepts positive integer values. If set to 0, the
      * limit is disabled, and the Select All checkbox appears instead of the Deselect All button. **Note:**
      * To avoid severe performance problems, the limit should only be set to 0 in the following cases:
      *
      * 	 - With client-side models
      * 	 - With server-side models if they are used in client mode
      * 	 - If the entity set is small  In other cases, we recommend to set the limit to at least double
      * 			the value of the {@link sap.ui.table.Table#getThreshold threshold} property of the related `sap.ui.table.Table`
      * 			control.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `200`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLimit(): this.type = js.native
    def setLimit(/**
      * New value for property `limit`
      */
    iLimit: int): this.type = js.native
    
    /**
      * Requests the context and sets the selected index to `iIndex`.
      *
      * @returns A Promise that resolves after the selection has been completed or is rejected with an error
      */
    def setSelectedIndex(/**
      * The index to select
      */
    iIndex: int): js.Promise[Any] = js.native
    def setSelectedIndex(
      /**
      * The index to select
      */
    iIndex: int,
      /**
      * If the function call triggers a {@link #event:selectionChange selectionChange} event, this object is
      * transferred to the event in the `customPayload` parameter
      */
    oEventPayload: js.Object
    ): js.Promise[Any] = js.native
    
    /**
      * Sets the given selection interval as the selection and requests the corresponding binding contexts. In
      * single-selection mode it requests the context and sets the selected index to `iIndexTo`.
      *
      * If the number of indices in the range is greater than the value of the `limit` property, only n=limit
      * indices, starting from `iIndexFrom`, are selected. The table is scrolled to display the index last selected.
      *
      * @returns A Promise that resolves after the selection has been completed or is rejected with an error
      */
    def setSelectionInterval(
      /**
      * Index from which the selection starts
      */
    iIndexFrom: int,
      /**
      * Index up to which to select
      */
    iIndexTo: int
    ): js.Promise[Any] = js.native
    def setSelectionInterval(
      /**
      * Index from which the selection starts
      */
    iIndexFrom: int,
      /**
      * Index up to which to select
      */
    iIndexTo: int,
      /**
      * If the function call triggers a {@link #event:selectionChange selectionChange} event, this object is
      * transferred to the event in the `customPayload` parameter
      */
    oEventPayload: js.Object
    ): js.Promise[Any] = js.native
    
    /**
      * Sets a new value for property {@link #getSelectionMode selectionMode}.
      *
      * Selection mode of the plugin. This property controls whether single or multiple rows can be selected.
      * It also influences the visual appearance. When the selection mode is changed, the current selection is
      * removed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `MultiToggle`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSelectionMode(): this.type = js.native
    def setSelectionMode(
      /**
      * New value for property `selectionMode`
      */
    sSelectionMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectionMode * / any */ String
    ): this.type = js.native
    def setSelectionMode(/**
      * New value for property `selectionMode`
      */
    sSelectionMode: SelectionMode): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowHeaderSelector showHeaderSelector}.
      *
      * Show header selector
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowHeaderSelector(): this.type = js.native
    def setShowHeaderSelector(/**
      * New value for property `showHeaderSelector`
      */
    bShowHeaderSelector: Boolean): this.type = js.native
  }
  
  trait MultiSelectionPluginSettings
    extends StObject
       with SelectionPluginSettings {
    
    /**
      * @SINCE 1.71
      *
      * Enables notifications that are displayed once a selection has been limited.
      */
    var enableNotification: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Number of indices which can be selected in a range. Accepts positive integer values. If set to 0, the
      * limit is disabled, and the Select All checkbox appears instead of the Deselect All button. **Note:**
      * To avoid severe performance problems, the limit should only be set to 0 in the following cases:
      *
      * 	 - With client-side models
      * 	 - With server-side models if they are used in client mode
      * 	 - If the entity set is small  In other cases, we recommend to set the limit to at least double
      * 			the value of the {@link sap.ui.table.Table#getThreshold threshold} property of the related `sap.ui.table.Table`
      * 			control.
      */
    var limit: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Selection mode of the plugin. This property controls whether single or multiple rows can be selected.
      * It also influences the visual appearance. When the selection mode is changed, the current selection is
      * removed.
      */
    var selectionMode: js.UndefOr[
        SelectionMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectionMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Show header selector
      */
    var showHeaderSelector: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object MultiSelectionPluginSettings {
    
    inline def apply(): MultiSelectionPluginSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MultiSelectionPluginSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultiSelectionPluginSettings] (val x: Self) extends AnyVal {
      
      inline def setEnableNotification(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableNotification", value.asInstanceOf[js.Any])
      
      inline def setEnableNotificationUndefined: Self = StObject.set(x, "enableNotification", js.undefined)
      
      inline def setLimit(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setSelectionMode(
        value: SelectionMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectionMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
      
      inline def setShowHeaderSelector(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showHeaderSelector", value.asInstanceOf[js.Any])
      
      inline def setShowHeaderSelectorUndefined: Self = StObject.set(x, "showHeaderSelector", js.undefined)
    }
  }
}
