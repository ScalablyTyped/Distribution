package typings.openui5

import typings.openui5.anon.`11`
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiWebcFioriLibraryMod.IMediaGalleryItem
import typings.openui5.sapUiWebcFioriLibraryMod.MediaGalleryLayout
import typings.openui5.sapUiWebcFioriLibraryMod.MediaGalleryMenuHorizontalAlign
import typings.openui5.sapUiWebcFioriLibraryMod.MediaGalleryMenuVerticalAlign
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcFioriMediaGalleryMod {
  
  @JSImport("sap/ui/webc/fiori/MediaGallery", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `MediaGallery`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends MediaGallery {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: MediaGallerySettings) = this()
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
    mSettings: MediaGallerySettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: MediaGallerySettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/webc/fiori/MediaGallery", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.fiori.MediaGallery with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, MediaGallery]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, MediaGallery],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.webc.fiori.MediaGallery.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait MediaGallery
    extends typings.openui5.sapUiWebcCommonWebComponentMod.default {
    
    /**
      * Adds some item to the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addItem(/**
      * The item to add; if empty, nothing is inserted
      */
    oItem: IMediaGalleryItem): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:displayAreaClick displayAreaClick} event of
      * this `sap.ui.webc.fiori.MediaGallery`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.MediaGallery` itself.
      *
      * Fired when the display area is clicked.
      *  The display area is the central area that contains the enlarged content of the currently selected item.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachDisplayAreaClick(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachDisplayAreaClick(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.MediaGallery` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:displayAreaClick displayAreaClick} event of
      * this `sap.ui.webc.fiori.MediaGallery`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.MediaGallery` itself.
      *
      * Fired when the display area is clicked.
      *  The display area is the central area that contains the enlarged content of the currently selected item.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachDisplayAreaClick(
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
    def attachDisplayAreaClick(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.MediaGallery` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:overflowClick overflowClick} event of this `sap.ui.webc.fiori.MediaGallery`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.MediaGallery` itself.
      *
      * Fired when the thumbnails overflow button is clicked.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachOverflowClick(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachOverflowClick(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.MediaGallery` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:overflowClick overflowClick} event of this `sap.ui.webc.fiori.MediaGallery`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.MediaGallery` itself.
      *
      * Fired when the thumbnails overflow button is clicked.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachOverflowClick(
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
    def attachOverflowClick(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.MediaGallery` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:selectionChange selectionChange} event of this
      * `sap.ui.webc.fiori.MediaGallery`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.MediaGallery` itself.
      *
      * Fired when selection is changed by user interaction.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelectionChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachSelectionChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.MediaGallery` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:selectionChange selectionChange} event of this
      * `sap.ui.webc.fiori.MediaGallery`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.MediaGallery` itself.
      *
      * Fired when selection is changed by user interaction.
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.MediaGallery` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the items in the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyItems(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:displayAreaClick displayAreaClick} event of
      * this `sap.ui.webc.fiori.MediaGallery`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachDisplayAreaClick(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachDisplayAreaClick(
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
      * Detaches event handler `fnFunction` from the {@link #event:overflowClick overflowClick} event of this
      * `sap.ui.webc.fiori.MediaGallery`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachOverflowClick(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachOverflowClick(
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
      * Detaches event handler `fnFunction` from the {@link #event:selectionChange selectionChange} event of
      * this `sap.ui.webc.fiori.MediaGallery`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSelectionChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachSelectionChange(
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
      * Fires event {@link #event:displayAreaClick displayAreaClick} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireDisplayAreaClick(): this.type = js.native
    def fireDisplayAreaClick(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Fires event {@link #event:overflowClick overflowClick} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireOverflowClick(): this.type = js.native
    def fireOverflowClick(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Fires event {@link #event:selectionChange selectionChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSelectionChange(): this.type = js.native
    def fireSelectionChange(/**
      * Parameters to pass along with the event
      */
    mParameters: `11`): this.type = js.native
    
    /**
      * Gets current value of property {@link #getInteractiveDisplayArea interactiveDisplayArea}.
      *
      * If enabled, a `display-area-click` event is fired when the user clicks or taps on the display area.
      *  The display area is the central area that contains the enlarged content of the currently selected item.
      *
      * Default value is `false`.
      *
      * @returns Value of property `interactiveDisplayArea`
      */
    def getInteractiveDisplayArea(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getItems items}.
      *
      * Defines the component items.
      *
      *
      *
      *  **Note:** Only one selected item is allowed.
      *
      *
      *
      *  **Note:** Use the `sap.ui.webc.fiori.MediaGalleryItem` component to define the desired items.
      */
    def getItems(): js.Array[IMediaGalleryItem] = js.native
    
    /**
      * Gets current value of property {@link #getLayout layout}.
      *
      * Determines the layout of the component.
      *
      *  Available options are:
      * 	 - `Auto`
      * 	 - `Vertical`
      * 	 - `Horizontal`
      *
      * Default value is `Auto`.
      *
      * @returns Value of property `layout`
      */
    def getLayout(): MediaGalleryLayout | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MediaGalleryLayout * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getMenuHorizontalAlign menuHorizontalAlign}.
      *
      * Determines the horizontal alignment of the thumbnails menu vs. the central display area.
      *
      *  Available options are:
      * 	 - `Left`
      * 	 - `Right`
      *
      * Default value is `Left`.
      *
      * @returns Value of property `menuHorizontalAlign`
      */
    def getMenuHorizontalAlign(): MediaGalleryMenuHorizontalAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MediaGalleryMenuHorizontalAlign * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getMenuVerticalAlign menuVerticalAlign}.
      *
      * Determines the vertical alignment of the thumbnails menu vs. the central display area.
      *
      *  Available options are:
      * 	 - `Top`
      * 	 - `Bottom`
      *
      * Default value is `Bottom`.
      *
      * @returns Value of property `menuVerticalAlign`
      */
    def getMenuVerticalAlign(): MediaGalleryMenuVerticalAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MediaGalleryMenuVerticalAlign * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getShowAllThumbnails showAllThumbnails}.
      *
      * If set to `true`, all thumbnails are rendered in a scrollable container. If `false`, only up to five
      * thumbnails are rendered, followed by an overflow button that shows the count of the remaining thumbnails.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showAllThumbnails`
      */
    def getShowAllThumbnails(): Boolean = js.native
    
    /**
      * Checks for the provided `sap.ui.webc.fiori.IMediaGalleryItem` in the aggregation {@link #getItems items}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfItem(/**
      * The item whose index is looked for
      */
    oItem: IMediaGalleryItem): int = js.native
    
    /**
      * Inserts a item into the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertItem(
      /**
      * The item to insert; if empty, nothing is inserted
      */
    oItem: IMediaGalleryItem,
      /**
      * The `0`-based index the item should be inserted at; for a negative value of `iIndex`, the item is inserted
      * at position 0; for a value greater than the current size of the aggregation, the item is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getItems items}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllItems(): js.Array[IMediaGalleryItem] = js.native
    
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: String): IMediaGalleryItem | Null = js.native
    /**
      * Removes a item from the aggregation {@link #getItems items}.
      *
      * @returns The removed item or `null`
      */
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: int): IMediaGalleryItem | Null = js.native
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: IMediaGalleryItem): IMediaGalleryItem | Null = js.native
    
    /**
      * Sets a new value for property {@link #getInteractiveDisplayArea interactiveDisplayArea}.
      *
      * If enabled, a `display-area-click` event is fired when the user clicks or taps on the display area.
      *  The display area is the central area that contains the enlarged content of the currently selected item.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setInteractiveDisplayArea(): this.type = js.native
    def setInteractiveDisplayArea(/**
      * New value for property `interactiveDisplayArea`
      */
    bInteractiveDisplayArea: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getLayout layout}.
      *
      * Determines the layout of the component.
      *
      *  Available options are:
      * 	 - `Auto`
      * 	 - `Vertical`
      * 	 - `Horizontal`
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Auto`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLayout(): this.type = js.native
    def setLayout(
      /**
      * New value for property `layout`
      */
    sLayout: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MediaGalleryLayout * / any */ String
    ): this.type = js.native
    def setLayout(/**
      * New value for property `layout`
      */
    sLayout: MediaGalleryLayout): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMenuHorizontalAlign menuHorizontalAlign}.
      *
      * Determines the horizontal alignment of the thumbnails menu vs. the central display area.
      *
      *  Available options are:
      * 	 - `Left`
      * 	 - `Right`
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Left`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMenuHorizontalAlign(): this.type = js.native
    def setMenuHorizontalAlign(
      /**
      * New value for property `menuHorizontalAlign`
      */
    sMenuHorizontalAlign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MediaGalleryMenuHorizontalAlign * / any */ String
    ): this.type = js.native
    def setMenuHorizontalAlign(
      /**
      * New value for property `menuHorizontalAlign`
      */
    sMenuHorizontalAlign: MediaGalleryMenuHorizontalAlign
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMenuVerticalAlign menuVerticalAlign}.
      *
      * Determines the vertical alignment of the thumbnails menu vs. the central display area.
      *
      *  Available options are:
      * 	 - `Top`
      * 	 - `Bottom`
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Bottom`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMenuVerticalAlign(): this.type = js.native
    def setMenuVerticalAlign(
      /**
      * New value for property `menuVerticalAlign`
      */
    sMenuVerticalAlign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MediaGalleryMenuVerticalAlign * / any */ String
    ): this.type = js.native
    def setMenuVerticalAlign(
      /**
      * New value for property `menuVerticalAlign`
      */
    sMenuVerticalAlign: MediaGalleryMenuVerticalAlign
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowAllThumbnails showAllThumbnails}.
      *
      * If set to `true`, all thumbnails are rendered in a scrollable container. If `false`, only up to five
      * thumbnails are rendered, followed by an overflow button that shows the count of the remaining thumbnails.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowAllThumbnails(): this.type = js.native
    def setShowAllThumbnails(/**
      * New value for property `showAllThumbnails`
      */
    bShowAllThumbnails: Boolean): this.type = js.native
  }
  
  trait MediaGallerySettings
    extends StObject
       with ControlSettings {
    
    /**
      * Fired when the display area is clicked.
      *  The display area is the central area that contains the enlarged content of the currently selected item.
      */
    var displayAreaClick: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * If enabled, a `display-area-click` event is fired when the user clicks or taps on the display area.
      *  The display area is the central area that contains the enlarged content of the currently selected item.
      */
    var interactiveDisplayArea: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the component items.
      *
      *
      *
      *  **Note:** Only one selected item is allowed.
      *
      *
      *
      *  **Note:** Use the `sap.ui.webc.fiori.MediaGalleryItem` component to define the desired items.
      */
    var items: js.UndefOr[
        js.Array[IMediaGalleryItem] | IMediaGalleryItem | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the layout of the component.
      *
      *  Available options are:
      * 	 - `Auto`
      * 	 - `Vertical`
      * 	 - `Horizontal`
      */
    var layout: js.UndefOr[
        MediaGalleryLayout | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MediaGalleryLayout * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Determines the horizontal alignment of the thumbnails menu vs. the central display area.
      *
      *  Available options are:
      * 	 - `Left`
      * 	 - `Right`
      */
    var menuHorizontalAlign: js.UndefOr[
        MediaGalleryMenuHorizontalAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MediaGalleryMenuHorizontalAlign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Determines the vertical alignment of the thumbnails menu vs. the central display area.
      *
      *  Available options are:
      * 	 - `Top`
      * 	 - `Bottom`
      */
    var menuVerticalAlign: js.UndefOr[
        MediaGalleryMenuVerticalAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MediaGalleryMenuVerticalAlign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Fired when the thumbnails overflow button is clicked.
      */
    var overflowClick: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Fired when selection is changed by user interaction.
      */
    var selectionChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * If set to `true`, all thumbnails are rendered in a scrollable container. If `false`, only up to five
      * thumbnails are rendered, followed by an overflow button that shows the count of the remaining thumbnails.
      */
    var showAllThumbnails: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object MediaGallerySettings {
    
    inline def apply(): MediaGallerySettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaGallerySettings]
    }
    
    extension [Self <: MediaGallerySettings](x: Self) {
      
      inline def setDisplayAreaClick(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "displayAreaClick", js.Any.fromFunction1(value))
      
      inline def setDisplayAreaClickUndefined: Self = StObject.set(x, "displayAreaClick", js.undefined)
      
      inline def setInteractiveDisplayArea(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "interactiveDisplayArea", value.asInstanceOf[js.Any])
      
      inline def setInteractiveDisplayAreaUndefined: Self = StObject.set(x, "interactiveDisplayArea", js.undefined)
      
      inline def setItems(
        value: js.Array[IMediaGalleryItem] | IMediaGalleryItem | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: IMediaGalleryItem*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setLayout(
        value: MediaGalleryLayout | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MediaGalleryLayout * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setMenuHorizontalAlign(
        value: MediaGalleryMenuHorizontalAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MediaGalleryMenuHorizontalAlign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "menuHorizontalAlign", value.asInstanceOf[js.Any])
      
      inline def setMenuHorizontalAlignUndefined: Self = StObject.set(x, "menuHorizontalAlign", js.undefined)
      
      inline def setMenuVerticalAlign(
        value: MediaGalleryMenuVerticalAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MediaGalleryMenuVerticalAlign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "menuVerticalAlign", value.asInstanceOf[js.Any])
      
      inline def setMenuVerticalAlignUndefined: Self = StObject.set(x, "menuVerticalAlign", js.undefined)
      
      inline def setOverflowClick(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "overflowClick", js.Any.fromFunction1(value))
      
      inline def setOverflowClickUndefined: Self = StObject.set(x, "overflowClick", js.undefined)
      
      inline def setSelectionChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "selectionChange", js.Any.fromFunction1(value))
      
      inline def setSelectionChangeUndefined: Self = StObject.set(x, "selectionChange", js.undefined)
      
      inline def setShowAllThumbnails(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showAllThumbnails", value.asInstanceOf[js.Any])
      
      inline def setShowAllThumbnailsUndefined: Self = StObject.set(x, "showAllThumbnails", js.undefined)
    }
  }
}
