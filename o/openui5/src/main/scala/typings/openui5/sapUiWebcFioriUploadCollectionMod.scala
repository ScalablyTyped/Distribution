package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiWebcFioriLibraryMod.IUploadCollectionItem
import typings.openui5.sapUiWebcMainLibraryMod.ListMode
import typings.std.DataTransfer
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcFioriUploadCollectionMod {
  
  @JSImport("sap/ui/webc/fiori/UploadCollection", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `UploadCollection`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends UploadCollection {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: UploadCollectionSettings) = this()
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
      * Initial settings for the new control
      */
    mSettings: UploadCollectionSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: UploadCollectionSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/webc/fiori/UploadCollection", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.fiori.UploadCollection with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.webc.common.WebComponent.extend}.
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
    oClassInfo: ClassInfo[T, UploadCollection]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, UploadCollection],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.webc.fiori.UploadCollection.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait UploadCollection
    extends typings.openui5.sapUiWebcCommonWebComponentMod.default {
    
    /**
      * Adds some header to the aggregation {@link #getHeader header}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addHeader(
      /**
      * The header to add; if empty, nothing is inserted
      */
    oHeader: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Adds some item to the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addItem(/**
      * The item to add; if empty, nothing is inserted
      */
    oItem: IUploadCollectionItem): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:drop drop} event of this `sap.ui.webc.fiori.UploadCollection`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.UploadCollection` itself.
      *
      * Fired when an element is dropped inside the drag and drop overlay.
      *
      *  **Note:** The `drop` event is fired only when elements are dropped within the drag and drop overlay
      * and ignored for the other parts of the `sap.ui.webc.fiori.UploadCollection`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachDrop(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ UploadCollectionDropEvent, Unit]
    ): this.type = js.native
    def attachDrop(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ UploadCollectionDropEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.UploadCollection`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:drop drop} event of this `sap.ui.webc.fiori.UploadCollection`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.UploadCollection` itself.
      *
      * Fired when an element is dropped inside the drag and drop overlay.
      *
      *  **Note:** The `drop` event is fired only when elements are dropped within the drag and drop overlay
      * and ignored for the other parts of the `sap.ui.webc.fiori.UploadCollection`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachDrop(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ UploadCollectionDropEvent, Unit]
    ): this.type = js.native
    def attachDrop(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ UploadCollectionDropEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.UploadCollection`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:itemDelete itemDelete} event of this `sap.ui.webc.fiori.UploadCollection`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.UploadCollection` itself.
      *
      * Fired when the Delete button of any item is pressed.
      *
      *  **Note:** A Delete button is displayed on each item, when the `sap.ui.webc.fiori.UploadCollection` `mode`
      * property is set to `Delete`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachItemDelete(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ UploadCollectionItemDeleteEvent, Unit]
    ): this.type = js.native
    def attachItemDelete(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ UploadCollectionItemDeleteEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.UploadCollection`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:itemDelete itemDelete} event of this `sap.ui.webc.fiori.UploadCollection`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.UploadCollection` itself.
      *
      * Fired when the Delete button of any item is pressed.
      *
      *  **Note:** A Delete button is displayed on each item, when the `sap.ui.webc.fiori.UploadCollection` `mode`
      * property is set to `Delete`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachItemDelete(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ UploadCollectionItemDeleteEvent, Unit]
    ): this.type = js.native
    def attachItemDelete(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ UploadCollectionItemDeleteEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.UploadCollection`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:selectionChange selectionChange} event of this
      * `sap.ui.webc.fiori.UploadCollection`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.UploadCollection` itself.
      *
      * Fired when selection is changed by user interaction in `SingleSelect` and `MultiSelect` modes.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelectionChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ UploadCollectionSelectionChangeEvent, Unit]
    ): this.type = js.native
    def attachSelectionChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ UploadCollectionSelectionChangeEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.UploadCollection`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:selectionChange selectionChange} event of this
      * `sap.ui.webc.fiori.UploadCollection`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.UploadCollection` itself.
      *
      * Fired when selection is changed by user interaction in `SingleSelect` and `MultiSelect` modes.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelectionChange(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ UploadCollectionSelectionChangeEvent, Unit]
    ): this.type = js.native
    def attachSelectionChange(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ UploadCollectionSelectionChangeEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.UploadCollection`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the header in the aggregation {@link #getHeader header}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyHeader(): this.type = js.native
    
    /**
      * Destroys all the items in the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyItems(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:drop drop} event of this `sap.ui.webc.fiori.UploadCollection`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachDrop(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ UploadCollectionDropEvent, Unit]
    ): this.type = js.native
    def detachDrop(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ UploadCollectionDropEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:itemDelete itemDelete} event of this `sap.ui.webc.fiori.UploadCollection`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachItemDelete(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ UploadCollectionItemDeleteEvent, Unit]
    ): this.type = js.native
    def detachItemDelete(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ UploadCollectionItemDeleteEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:selectionChange selectionChange} event of
      * this `sap.ui.webc.fiori.UploadCollection`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSelectionChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ UploadCollectionSelectionChangeEvent, Unit]
    ): this.type = js.native
    def detachSelectionChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ UploadCollectionSelectionChangeEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:drop drop} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireDrop(): this.type = js.native
    def fireDrop(
      /**
      * Parameters to pass along with the event
      */
    mParameters: UploadCollection$DropEventParameters
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:itemDelete itemDelete} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireItemDelete(): this.type = js.native
    def fireItemDelete(
      /**
      * Parameters to pass along with the event
      */
    mParameters: UploadCollection$ItemDeleteEventParameters
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:selectionChange selectionChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSelectionChange(): this.type = js.native
    def fireSelectionChange(
      /**
      * Parameters to pass along with the event
      */
    mParameters: UploadCollection$SelectionChangeEventParameters
    ): this.type = js.native
    
    /**
      * Gets current value of property {@link #getAccessibleName accessibleName}.
      *
      * Defines the accessible aria name of the component.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `accessibleName`
      */
    def getAccessibleName(): String = js.native
    
    /**
      * Gets content of aggregation {@link #getHeader header}.
      *
      * Defines the `sap.ui.webc.fiori.UploadCollection` header.
      *
      *  **Note:** If `header` slot is provided, the labelling of the `UploadCollection` is a responsibility
      * of the application developer. `accessibleName` should be used.
      */
    def getHeader(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getHeight height}.
      *
      * Defines the height of the control
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getHideDragOverlay hideDragOverlay}.
      *
      * By default there will be drag and drop overlay shown over the `sap.ui.webc.fiori.UploadCollection` when
      * files are dragged. If you don't intend to use drag and drop, set this property.
      *
      *  **Note:** It is up to the application developer to add handler for `drop` event and handle it. `sap.ui.webc.fiori.UploadCollection`
      * only displays an overlay.
      *
      * Default value is `false`.
      *
      * @returns Value of property `hideDragOverlay`
      */
    def getHideDragOverlay(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getItems items}.
      *
      * Defines the items of the `sap.ui.webc.fiori.UploadCollection`.
      *  **Note:** Use `sap.ui.webc.fiori.UploadCollectionItem` for the intended design.
      */
    def getItems(): js.Array[IUploadCollectionItem] = js.native
    
    /**
      * Gets current value of property {@link #getMode mode}.
      *
      * Defines the mode of the `sap.ui.webc.fiori.UploadCollection`.
      *
      *
      *
      *  **Note:**
      * 	 - `None`
      * 	 - `SingleSelect`
      * 	 - `MultiSelect`
      * 	 - `Delete`
      *
      * Default value is `None`.
      *
      * @returns Value of property `mode`
      */
    def getMode(): ListMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListMode * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getNoDataDescription noDataDescription}.
      *
      * Allows you to set your own text for the 'No data' description.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `noDataDescription`
      */
    def getNoDataDescription(): String = js.native
    
    /**
      * Gets current value of property {@link #getNoDataText noDataText}.
      *
      * Allows you to set your own text for the 'No data' text.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `noDataText`
      */
    def getNoDataText(): String = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Defines the width of the control
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getHeader header}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfHeader(
      /**
      * The header whose index is looked for
      */
    oHeader: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.webc.fiori.IUploadCollectionItem` in the aggregation {@link #getItems items}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfItem(/**
      * The item whose index is looked for
      */
    oItem: IUploadCollectionItem): int = js.native
    
    /**
      * Inserts a header into the aggregation {@link #getHeader header}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertHeader(
      /**
      * The header to insert; if empty, nothing is inserted
      */
    oHeader: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the header should be inserted at; for a negative value of `iIndex`, the header is
      * inserted at position 0; for a value greater than the current size of the aggregation, the header is inserted
      * at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a item into the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertItem(
      /**
      * The item to insert; if empty, nothing is inserted
      */
    oItem: IUploadCollectionItem,
      /**
      * The `0`-based index the item should be inserted at; for a negative value of `iIndex`, the item is inserted
      * at position 0; for a value greater than the current size of the aggregation, the item is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getHeader header}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllHeader(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getItems items}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllItems(): js.Array[IUploadCollectionItem] = js.native
    
    def removeHeader(/**
      * The header to remove or its index or id
      */
    vHeader: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a header from the aggregation {@link #getHeader header}.
      *
      * @returns The removed header or `null`
      */
    def removeHeader(/**
      * The header to remove or its index or id
      */
    vHeader: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeHeader(
      /**
      * The header to remove or its index or id
      */
    vHeader: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: String): IUploadCollectionItem | Null = js.native
    /**
      * Removes a item from the aggregation {@link #getItems items}.
      *
      * @returns The removed item or `null`
      */
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: int): IUploadCollectionItem | Null = js.native
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: IUploadCollectionItem): IUploadCollectionItem | Null = js.native
    
    /**
      * Sets a new value for property {@link #getAccessibleName accessibleName}.
      *
      * Defines the accessible aria name of the component.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAccessibleName(): this.type = js.native
    def setAccessibleName(/**
      * New value for property `accessibleName`
      */
    sAccessibleName: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeight height}.
      *
      * Defines the height of the control
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeight(/**
      * New value for property `height`
      */
    sHeight: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHideDragOverlay hideDragOverlay}.
      *
      * By default there will be drag and drop overlay shown over the `sap.ui.webc.fiori.UploadCollection` when
      * files are dragged. If you don't intend to use drag and drop, set this property.
      *
      *  **Note:** It is up to the application developer to add handler for `drop` event and handle it. `sap.ui.webc.fiori.UploadCollection`
      * only displays an overlay.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHideDragOverlay(): this.type = js.native
    def setHideDragOverlay(/**
      * New value for property `hideDragOverlay`
      */
    bHideDragOverlay: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMode mode}.
      *
      * Defines the mode of the `sap.ui.webc.fiori.UploadCollection`.
      *
      *
      *
      *  **Note:**
      * 	 - `None`
      * 	 - `SingleSelect`
      * 	 - `MultiSelect`
      * 	 - `Delete`
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `None`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMode(): this.type = js.native
    def setMode(
      /**
      * New value for property `mode`
      */
    sMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListMode * / any */ String
    ): this.type = js.native
    def setMode(/**
      * New value for property `mode`
      */
    sMode: ListMode): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getNoDataDescription noDataDescription}.
      *
      * Allows you to set your own text for the 'No data' description.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setNoDataDescription(): this.type = js.native
    def setNoDataDescription(/**
      * New value for property `noDataDescription`
      */
    sNoDataDescription: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getNoDataText noDataText}.
      *
      * Allows you to set your own text for the 'No data' text.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setNoDataText(): this.type = js.native
    def setNoDataText(/**
      * New value for property `noDataText`
      */
    sNoDataText: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Defines the width of the control
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
  }
  
  trait UploadCollection$DropEventParameters extends StObject {
    
    /**
      * The `drop` event operation data.
      */
    var dataTransfer: js.UndefOr[DataTransfer] = js.undefined
  }
  object UploadCollection$DropEventParameters {
    
    inline def apply(): UploadCollection$DropEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadCollection$DropEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UploadCollection$DropEventParameters] (val x: Self) extends AnyVal {
      
      inline def setDataTransfer(value: DataTransfer): Self = StObject.set(x, "dataTransfer", value.asInstanceOf[js.Any])
      
      inline def setDataTransferUndefined: Self = StObject.set(x, "dataTransfer", js.undefined)
    }
  }
  
  trait UploadCollection$ItemDeleteEventParameters extends StObject {
    
    /**
      * The `sap.ui.webc.fiori.UploadCollectionItem` which was renamed.
      */
    var item: js.UndefOr[HTMLElement] = js.undefined
  }
  object UploadCollection$ItemDeleteEventParameters {
    
    inline def apply(): UploadCollection$ItemDeleteEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadCollection$ItemDeleteEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UploadCollection$ItemDeleteEventParameters] (val x: Self) extends AnyVal {
      
      inline def setItem(value: HTMLElement): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    }
  }
  
  trait UploadCollection$SelectionChangeEventParameters extends StObject {
    
    /**
      * An array of the selected items.
      */
    var selectedItems: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object UploadCollection$SelectionChangeEventParameters {
    
    inline def apply(): UploadCollection$SelectionChangeEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadCollection$SelectionChangeEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UploadCollection$SelectionChangeEventParameters] (val x: Self) extends AnyVal {
      
      inline def setSelectedItems(value: js.Array[Any]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
      
      inline def setSelectedItemsVarargs(value: Any*): Self = StObject.set(x, "selectedItems", js.Array(value*))
    }
  }
  
  type UploadCollectionDropEvent = typings.openui5.sapUiBaseEventMod.default[UploadCollection$DropEventParameters]
  
  type UploadCollectionDropEventParameters = UploadCollection$DropEventParameters
  
  type UploadCollectionItemDeleteEvent = typings.openui5.sapUiBaseEventMod.default[UploadCollection$ItemDeleteEventParameters]
  
  type UploadCollectionItemDeleteEventParameters = UploadCollection$ItemDeleteEventParameters
  
  type UploadCollectionSelectionChangeEvent = typings.openui5.sapUiBaseEventMod.default[UploadCollection$SelectionChangeEventParameters]
  
  type UploadCollectionSelectionChangeEventParameters = UploadCollection$SelectionChangeEventParameters
  
  trait UploadCollectionSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Defines the accessible aria name of the component.
      */
    var accessibleName: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Fired when an element is dropped inside the drag and drop overlay.
      *
      *  **Note:** The `drop` event is fired only when elements are dropped within the drag and drop overlay
      * and ignored for the other parts of the `sap.ui.webc.fiori.UploadCollection`.
      */
    var drop: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[UploadCollection$DropEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Defines the `sap.ui.webc.fiori.UploadCollection` header.
      *
      *  **Note:** If `header` slot is provided, the labelling of the `UploadCollection` is a responsibility
      * of the application developer. `accessibleName` should be used.
      */
    var header: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the height of the control
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * By default there will be drag and drop overlay shown over the `sap.ui.webc.fiori.UploadCollection` when
      * files are dragged. If you don't intend to use drag and drop, set this property.
      *
      *  **Note:** It is up to the application developer to add handler for `drop` event and handle it. `sap.ui.webc.fiori.UploadCollection`
      * only displays an overlay.
      */
    var hideDragOverlay: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fired when the Delete button of any item is pressed.
      *
      *  **Note:** A Delete button is displayed on each item, when the `sap.ui.webc.fiori.UploadCollection` `mode`
      * property is set to `Delete`.
      */
    var itemDelete: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[UploadCollection$ItemDeleteEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Defines the items of the `sap.ui.webc.fiori.UploadCollection`.
      *  **Note:** Use `sap.ui.webc.fiori.UploadCollectionItem` for the intended design.
      */
    var items: js.UndefOr[
        js.Array[IUploadCollectionItem] | IUploadCollectionItem | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the mode of the `sap.ui.webc.fiori.UploadCollection`.
      *
      *
      *
      *  **Note:**
      * 	 - `None`
      * 	 - `SingleSelect`
      * 	 - `MultiSelect`
      * 	 - `Delete`
      */
    var mode: js.UndefOr[
        ListMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Allows you to set your own text for the 'No data' description.
      */
    var noDataDescription: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Allows you to set your own text for the 'No data' text.
      */
    var noDataText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Fired when selection is changed by user interaction in `SingleSelect` and `MultiSelect` modes.
      */
    var selectionChange: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[UploadCollection$SelectionChangeEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Defines the width of the control
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object UploadCollectionSettings {
    
    inline def apply(): UploadCollectionSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadCollectionSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UploadCollectionSettings] (val x: Self) extends AnyVal {
      
      inline def setAccessibleName(value: String | PropertyBindingInfo): Self = StObject.set(x, "accessibleName", value.asInstanceOf[js.Any])
      
      inline def setAccessibleNameUndefined: Self = StObject.set(x, "accessibleName", js.undefined)
      
      inline def setDrop(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[UploadCollection$DropEventParameters] => Unit
      ): Self = StObject.set(x, "drop", js.Any.fromFunction1(value))
      
      inline def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
      
      inline def setHeader(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setHeaderVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "header", js.Array(value*))
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHideDragOverlay(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "hideDragOverlay", value.asInstanceOf[js.Any])
      
      inline def setHideDragOverlayUndefined: Self = StObject.set(x, "hideDragOverlay", js.undefined)
      
      inline def setItemDelete(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[UploadCollection$ItemDeleteEventParameters] => Unit
      ): Self = StObject.set(x, "itemDelete", js.Any.fromFunction1(value))
      
      inline def setItemDeleteUndefined: Self = StObject.set(x, "itemDelete", js.undefined)
      
      inline def setItems(
        value: js.Array[IUploadCollectionItem] | IUploadCollectionItem | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: IUploadCollectionItem*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setMode(
        value: ListMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setNoDataDescription(value: String | PropertyBindingInfo): Self = StObject.set(x, "noDataDescription", value.asInstanceOf[js.Any])
      
      inline def setNoDataDescriptionUndefined: Self = StObject.set(x, "noDataDescription", js.undefined)
      
      inline def setNoDataText(value: String | PropertyBindingInfo): Self = StObject.set(x, "noDataText", value.asInstanceOf[js.Any])
      
      inline def setNoDataTextUndefined: Self = StObject.set(x, "noDataText", js.undefined)
      
      inline def setSelectionChange(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[UploadCollection$SelectionChangeEventParameters] => Unit
      ): Self = StObject.set(x, "selectionChange", js.Any.fromFunction1(value))
      
      inline def setSelectionChangeUndefined: Self = StObject.set(x, "selectionChange", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
