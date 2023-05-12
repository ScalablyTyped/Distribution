package typings.openui5

import typings.openui5.anon.`24`
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMPluginsCopyProviderMod {
  
  @JSImport("sap/m/plugins/CopyProvider", JSImport.Default)
  @js.native
  /**
    * Constructor for a new CopyProvider plugin that can be used to copy table rows to the clipboard.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends CopyProvider {
    def this(/**
      * Initial settings for the `CopyProvider`
      */
    mSettings: CopyProviderSettings) = this()
    def this(/**
      * ID for the new `CopyProvider`, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new `CopyProvider`, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the `CopyProvider`
      */
    mSettings: CopyProviderSettings
    ) = this()
    def this(
      /**
      * ID for the new `CopyProvider`, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the `CopyProvider`
      */
    mSettings: CopyProviderSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/plugins/CopyProvider", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.plugins.CopyProvider with name `sClassName` and enriches it with
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
    oClassInfo: ClassInfo[T, CopyProvider]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, CopyProvider],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.plugins.CopyProvider.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait CopyProvider
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:copy copy} event of this `sap.m.plugins.CopyProvider`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.plugins.CopyProvider` itself.
      *
      * This event is fired if there is a selection, and the user triggers the copy action.
      *
      * This can be done with the standard paste keyboard shortcut when the focus is on a selected row or cell.
      * Also the {@link #copySelectionData} API can be called, for example, from the press handler of a copy
      * button in a table toolbar to start the copy action synthetically, which might cause this event to be
      * fired. To avoid writing the selection to the clipboard, call `preventDefault` on the event instance.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachCopy(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachCopy(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.plugins.CopyProvider` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:copy copy} event of this `sap.m.plugins.CopyProvider`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.plugins.CopyProvider` itself.
      *
      * This event is fired if there is a selection, and the user triggers the copy action.
      *
      * This can be done with the standard paste keyboard shortcut when the focus is on a selected row or cell.
      * Also the {@link #copySelectionData} API can be called, for example, from the press handler of a copy
      * button in a table toolbar to start the copy action synthetically, which might cause this event to be
      * fired. To avoid writing the selection to the clipboard, call `preventDefault` on the event instance.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachCopy(
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
    def attachCopy(
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
      * Context object to call the event handler with. Defaults to this `sap.m.plugins.CopyProvider` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Writes the selection data to the system clipboard and returns a `Promise` which resolves once the clipboard's
      * content has been updated.
      *
      * **Note: ** The user has to interact with the page or a UI element when this API gets called.
      *
      * @returns A `Promise` that is resolved after the selection data has been written to the clipboard
      */
    def copySelectionData(): js.Promise[Any] = js.native
    def copySelectionData(/**
      * Whether the `copy` event should be triggered or not
      */
    bFireCopyEvent: Boolean): js.Promise[Any] = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:copy copy} event of this `sap.m.plugins.CopyProvider`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachCopy(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachCopy(
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
      * Fires event {@link #event:copy copy} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireCopy(): Boolean = js.native
    def fireCopy(/**
      * Parameters to pass along with the event
      */
    mParameters: `24`): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getCopySparse copySparse}.
      *
      * Determines whether unselected rows that are located between the selected rows are copied to the clipboard
      * as an empty row.
      *
      * This can be useful for maintaining the original structure of the data when it is pasted into a new location
      * (e.g. spreadsheets).
      *
      * Default value is `false`.
      *
      * @returns Value of property `copySparse`
      */
    def getCopySparse(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getExcludeContext excludeContext}.
      *
      * Defines a {@link sap.m.plugins.CopyProvider.excludeContextHandler callback function} which gets called
      * to exclude certain contexts from being copied to the clipboard.
      *
      * This callback function gets called with the binding context or the row instance if there is no binding.
      * Return `true` to exclude the context, `false` otherwise.
      *
      * @returns Value of property `excludeContext`
      */
    def getExcludeContext(): js.Function = js.native
    
    /**
      * Gets current value of property {@link #getExtractData extractData}.
      *
      * Defines a {@link sap.m.plugins.CopyProvider.extractDataHandler callback function} that gets called for
      * each selected cell to extract the cell data that is copied to the clipboard.
      *
      * The callback function gets called with the binding context of the selected row and the column instance
      * parameters.
      *  For the `sap.ui.table.Table` control, the row context parameter can also be the context of an unselectable
      * row in case of a range selection, for example the context of grouping or sub-total row.
      *  For the `sap.m.Table` control, if the `items` aggregation of the table is not bound then the callback
      * function gets called with the row instance instead of the binding context.
      *  The callback function must return the cell data that is then stringified and copied to the clipboard.
      *  If an array is returned from the callback function, then each array values will be copied as a separate
      * cell into the clipboard.
      *  If a column should not be copied to the clipboard, then the callback function must return `undefined`
      * or `null` for each cell of the same column.
      *
      *  **Note:** This property is mandatory to make the `CopyProvider` plugin work, and it must be set in the
      * constructor.
      *
      * @returns Value of property `extractData`
      */
    def getExtractData(): js.Function = js.native
    
    /**
      * Returns the extracted selection data as a two-dimensional array. This includes individual cell selections
      * if the {@link sap.m.plugins.CellSelector CellSelector} plugin is also enabled for the table. **Note:
      * ** The returned array might be a sparse array if the {@link #getCopySparse copySparse} property is `true`.
      *
      * @returns Two-dimensional extracted data from the selection.
      */
    def getSelectionData(): js.Array[js.Array[Any]] = js.native
    
    /**
      * Sets a new value for property {@link #getCopySparse copySparse}.
      *
      * Determines whether unselected rows that are located between the selected rows are copied to the clipboard
      * as an empty row.
      *
      * This can be useful for maintaining the original structure of the data when it is pasted into a new location
      * (e.g. spreadsheets).
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCopySparse(): this.type = js.native
    def setCopySparse(/**
      * New value for property `copySparse`
      */
    bCopySparse: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getExcludeContext excludeContext}.
      *
      * Defines a {@link sap.m.plugins.CopyProvider.excludeContextHandler callback function} which gets called
      * to exclude certain contexts from being copied to the clipboard.
      *
      * This callback function gets called with the binding context or the row instance if there is no binding.
      * Return `true` to exclude the context, `false` otherwise.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setExcludeContext(/**
      * New value for property `excludeContext`
      */
    fnExcludeContext: js.Function): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getExtractData extractData}.
      *
      * Defines a {@link sap.m.plugins.CopyProvider.extractDataHandler callback function} that gets called for
      * each selected cell to extract the cell data that is copied to the clipboard.
      *
      * The callback function gets called with the binding context of the selected row and the column instance
      * parameters.
      *  For the `sap.ui.table.Table` control, the row context parameter can also be the context of an unselectable
      * row in case of a range selection, for example the context of grouping or sub-total row.
      *  For the `sap.m.Table` control, if the `items` aggregation of the table is not bound then the callback
      * function gets called with the row instance instead of the binding context.
      *  The callback function must return the cell data that is then stringified and copied to the clipboard.
      *  If an array is returned from the callback function, then each array values will be copied as a separate
      * cell into the clipboard.
      *  If a column should not be copied to the clipboard, then the callback function must return `undefined`
      * or `null` for each cell of the same column.
      *
      *  **Note:** This property is mandatory to make the `CopyProvider` plugin work, and it must be set in the
      * constructor.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setExtractData(/**
      * New value for property `extractData`
      */
    fnExtractData: js.Function): this.type = js.native
  }
  
  trait CopyProviderSettings
    extends StObject
       with ElementSettings {
    
    /**
      * This event is fired if there is a selection, and the user triggers the copy action.
      *
      * This can be done with the standard paste keyboard shortcut when the focus is on a selected row or cell.
      * Also the {@link #copySelectionData} API can be called, for example, from the press handler of a copy
      * button in a table toolbar to start the copy action synthetically, which might cause this event to be
      * fired. To avoid writing the selection to the clipboard, call `preventDefault` on the event instance.
      */
    var copy: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Determines whether unselected rows that are located between the selected rows are copied to the clipboard
      * as an empty row.
      *
      * This can be useful for maintaining the original structure of the data when it is pasted into a new location
      * (e.g. spreadsheets).
      */
    var copySparse: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines a {@link sap.m.plugins.CopyProvider.excludeContextHandler callback function} which gets called
      * to exclude certain contexts from being copied to the clipboard.
      *
      * This callback function gets called with the binding context or the row instance if there is no binding.
      * Return `true` to exclude the context, `false` otherwise.
      */
    var excludeContext: js.UndefOr[
        js.Function | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines a {@link sap.m.plugins.CopyProvider.extractDataHandler callback function} that gets called for
      * each selected cell to extract the cell data that is copied to the clipboard.
      *
      * The callback function gets called with the binding context of the selected row and the column instance
      * parameters.
      *  For the `sap.ui.table.Table` control, the row context parameter can also be the context of an unselectable
      * row in case of a range selection, for example the context of grouping or sub-total row.
      *  For the `sap.m.Table` control, if the `items` aggregation of the table is not bound then the callback
      * function gets called with the row instance instead of the binding context.
      *  The callback function must return the cell data that is then stringified and copied to the clipboard.
      *  If an array is returned from the callback function, then each array values will be copied as a separate
      * cell into the clipboard.
      *  If a column should not be copied to the clipboard, then the callback function must return `undefined`
      * or `null` for each cell of the same column.
      *
      *  **Note:** This property is mandatory to make the `CopyProvider` plugin work, and it must be set in the
      * constructor.
      */
    var extractData: js.UndefOr[
        js.Function | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object CopyProviderSettings {
    
    inline def apply(): CopyProviderSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CopyProviderSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CopyProviderSettings] (val x: Self) extends AnyVal {
      
      inline def setCopy(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "copy", js.Any.fromFunction1(value))
      
      inline def setCopySparse(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "copySparse", value.asInstanceOf[js.Any])
      
      inline def setCopySparseUndefined: Self = StObject.set(x, "copySparse", js.undefined)
      
      inline def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
      
      inline def setExcludeContext(value: js.Function | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "excludeContext", value.asInstanceOf[js.Any])
      
      inline def setExcludeContextUndefined: Self = StObject.set(x, "excludeContext", js.undefined)
      
      inline def setExtractData(value: js.Function | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "extractData", value.asInstanceOf[js.Any])
      
      inline def setExtractDataUndefined: Self = StObject.set(x, "extractData", js.undefined)
    }
  }
  
  type excludeContextHandler = js.Function1[
    /* oContextOrRow */ typings.openui5.sapUiModelContextMod.default | typings.openui5.sapMColumnListItemMod.default, 
    Boolean
  ]
  
  type extractDataHandler = js.Function2[
    /* oContextOrRow */ typings.openui5.sapUiModelContextMod.default | typings.openui5.sapMColumnListItemMod.default, 
    /* oColumn */ typings.openui5.sapMColumnMod.default | (/* was: sap.ui.table.Column */ Any), 
    js.UndefOr[Any | js.Array[Any] | Null]
  ]
}
