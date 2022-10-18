package typings.openui5

import typings.openui5.anon.Chunk
import typings.openui5.anon.ItemId
import typings.openui5.anon.Live
import typings.openui5.anon.NewValue
import typings.openui5.anon.Query
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUx3FeedMod {
  
  @JSImport("sap/ui/ux3/Feed", JSImport.Default)
  @js.native
  /**
    * Constructor for a new Feed.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Feed {
    def this(/**
      * initial settings for the new control
      */
    mSettings: FeedSettings) = this()
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
    mSettings: FeedSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: FeedSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/ux3/Feed", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.ux3.Feed with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, Feed]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Feed],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.ux3.Feed.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Feed
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some chunk to the aggregation {@link #getChunks chunks}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addChunk(
      /**
      * The chunk to add; if empty, nothing is inserted
      */
    oChunk: typings.openui5.sapUiUx3FeedChunkMod.default
    ): this.type = js.native
    
    /**
      * Adds some filterItem to the aggregation {@link #getFilterItems filterItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addFilterItem(
      /**
      * The filterItem to add; if empty, nothing is inserted
      */
    oFilterItem: typings.openui5.sapUiCoreListItemMod.default
    ): this.type = js.native
    
    /**
      * Adds some toolsMenuItem to the aggregation {@link #getToolsMenuItems toolsMenuItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addToolsMenuItem(
      /**
      * The toolsMenuItem to add; if empty, nothing is inserted
      */
    oToolsMenuItem: typings.openui5.sapUiCommonsMenuItemMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:chunkAdded chunkAdded} event of this `sap.ui.ux3.Feed`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.Feed` itself.
      *
      * Event is fired when a new chunk is added
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachChunkAdded(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachChunkAdded(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.Feed` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:chunkAdded chunkAdded} event of this `sap.ui.ux3.Feed`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.Feed` itself.
      *
      * Event is fired when a new chunk is added
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachChunkAdded(
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
    def attachChunkAdded(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.Feed` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:filterChange filterChange} event of this `sap.ui.ux3.Feed`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.Feed` itself.
      *
      * Event is fired when the filter is changed
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachFilterChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachFilterChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.Feed` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:filterChange filterChange} event of this `sap.ui.ux3.Feed`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.Feed` itself.
      *
      * Event is fired when the filter is changed
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachFilterChange(
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
    def attachFilterChange(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.Feed` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:search search} event of this `sap.ui.ux3.Feed`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.Feed` itself.
      *
      * Event is fired when the search function on SearchField is triggered
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSearch(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachSearch(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.Feed` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:search search} event of this `sap.ui.ux3.Feed`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.Feed` itself.
      *
      * Event is fired when the search function on SearchField is triggered
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSearch(
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
    def attachSearch(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.Feed` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:toggleLive toggleLive} event of this `sap.ui.ux3.Feed`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.Feed` itself.
      *
      * Event is fired when the live mode has changed
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachToggleLive(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachToggleLive(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.Feed` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:toggleLive toggleLive} event of this `sap.ui.ux3.Feed`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.Feed` itself.
      *
      * Event is fired when the live mode has changed
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachToggleLive(
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
    def attachToggleLive(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.Feed` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:toolsItemSelected toolsItemSelected} event of
      * this `sap.ui.ux3.Feed`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.Feed` itself.
      *
      * Event is fired when an item from the tools MenuButton was selected
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachToolsItemSelected(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachToolsItemSelected(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.Feed` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:toolsItemSelected toolsItemSelected} event of
      * this `sap.ui.ux3.Feed`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.Feed` itself.
      *
      * Event is fired when an item from the tools MenuButton was selected
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachToolsItemSelected(
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
    def attachToolsItemSelected(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.Feed` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Binds aggregation {@link #getChunks chunks} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
      * of the possible properties of `oBindingInfo`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindChunks(/**
      * The binding information
      */
    oBindingInfo: AggregationBindingInfo): this.type = js.native
    
    /**
      * Binds aggregation {@link #getFilterItems filterItems} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
      * of the possible properties of `oBindingInfo`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindFilterItems(/**
      * The binding information
      */
    oBindingInfo: AggregationBindingInfo): this.type = js.native
    
    /**
      * Binds aggregation {@link #getToolsMenuItems toolsMenuItems} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
      * of the possible properties of `oBindingInfo`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindToolsMenuItems(/**
      * The binding information
      */
    oBindingInfo: AggregationBindingInfo): this.type = js.native
    
    /**
      * Destroys all the chunks in the aggregation {@link #getChunks chunks}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyChunks(): this.type = js.native
    
    /**
      * Destroys all the filterItems in the aggregation {@link #getFilterItems filterItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyFilterItems(): this.type = js.native
    
    /**
      * Destroys all the toolsMenuItems in the aggregation {@link #getToolsMenuItems toolsMenuItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyToolsMenuItems(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:chunkAdded chunkAdded} event of this `sap.ui.ux3.Feed`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachChunkAdded(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachChunkAdded(
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
      * Detaches event handler `fnFunction` from the {@link #event:filterChange filterChange} event of this `sap.ui.ux3.Feed`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachFilterChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachFilterChange(
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
      * Detaches event handler `fnFunction` from the {@link #event:search search} event of this `sap.ui.ux3.Feed`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSearch(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachSearch(
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
      * Detaches event handler `fnFunction` from the {@link #event:toggleLive toggleLive} event of this `sap.ui.ux3.Feed`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachToggleLive(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachToggleLive(
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
      * Detaches event handler `fnFunction` from the {@link #event:toolsItemSelected toolsItemSelected} event
      * of this `sap.ui.ux3.Feed`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachToolsItemSelected(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachToolsItemSelected(
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
      * Fires event {@link #event:chunkAdded chunkAdded} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireChunkAdded(): this.type = js.native
    def fireChunkAdded(/**
      * Parameters to pass along with the event
      */
    mParameters: Chunk): this.type = js.native
    
    /**
      * Fires event {@link #event:filterChange filterChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireFilterChange(): this.type = js.native
    def fireFilterChange(/**
      * Parameters to pass along with the event
      */
    mParameters: NewValue): this.type = js.native
    
    /**
      * Fires event {@link #event:search search} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSearch(): this.type = js.native
    def fireSearch(/**
      * Parameters to pass along with the event
      */
    mParameters: Query): this.type = js.native
    
    /**
      * Fires event {@link #event:toggleLive toggleLive} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireToggleLive(): this.type = js.native
    def fireToggleLive(/**
      * Parameters to pass along with the event
      */
    mParameters: Live): this.type = js.native
    
    /**
      * Fires event {@link #event:toolsItemSelected toolsItemSelected} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireToolsItemSelected(): this.type = js.native
    def fireToolsItemSelected(/**
      * Parameters to pass along with the event
      */
    mParameters: ItemId): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getChunks chunks}.
      *
      * The chunks
      */
    def getChunks(): js.Array[typings.openui5.sapUiUx3FeedChunkMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getFeederSender feederSender}.
      *
      * The sender of the feeder
      *
      * @returns Value of property `feederSender`
      */
    def getFeederSender(): String = js.native
    
    /**
      * Gets current value of property {@link #getFeederThumbnailSrc feederThumbnailSrc}.
      *
      * The path to the thumbnail image used for the feeder
      *
      * @returns Value of property `feederThumbnailSrc`
      */
    def getFeederThumbnailSrc(): URI = js.native
    
    /**
      * Gets content of aggregation {@link #getFilterItems filterItems}.
      *
      * Items of the filter
      */
    def getFilterItems(): js.Array[typings.openui5.sapUiCoreListItemMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getLive live}.
      *
      * Specifies whether the feed shall be in live mode
      *
      * Default value is `true`.
      *
      * @returns Value of property `live`
      */
    def getLive(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * Title text of the Feed. If no text is entered "FEED" is displayed.
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
      * Gets content of aggregation {@link #getToolsMenuItems toolsMenuItems}.
      *
      * MenuItems to open when the tool button is clicked by the user
      */
    def getToolsMenuItems(): js.Array[typings.openui5.sapUiCommonsMenuItemMod.default] = js.native
    
    /**
      * Checks for the provided `sap.ui.ux3.FeedChunk` in the aggregation {@link #getChunks chunks}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfChunk(
      /**
      * The chunk whose index is looked for
      */
    oChunk: typings.openui5.sapUiUx3FeedChunkMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.core.ListItem` in the aggregation {@link #getFilterItems filterItems}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfFilterItem(
      /**
      * The filterItem whose index is looked for
      */
    oFilterItem: typings.openui5.sapUiCoreListItemMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.commons.MenuItem` in the aggregation {@link #getToolsMenuItems toolsMenuItems}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfToolsMenuItem(
      /**
      * The toolsMenuItem whose index is looked for
      */
    oToolsMenuItem: typings.openui5.sapUiCommonsMenuItemMod.default
    ): int = js.native
    
    /**
      * Inserts a chunk into the aggregation {@link #getChunks chunks}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertChunk(
      /**
      * The chunk to insert; if empty, nothing is inserted
      */
    oChunk: typings.openui5.sapUiUx3FeedChunkMod.default,
      /**
      * The `0`-based index the chunk should be inserted at; for a negative value of `iIndex`, the chunk is inserted
      * at position 0; for a value greater than the current size of the aggregation, the chunk is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a filterItem into the aggregation {@link #getFilterItems filterItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertFilterItem(
      /**
      * The filterItem to insert; if empty, nothing is inserted
      */
    oFilterItem: typings.openui5.sapUiCoreListItemMod.default,
      /**
      * The `0`-based index the filterItem should be inserted at; for a negative value of `iIndex`, the filterItem
      * is inserted at position 0; for a value greater than the current size of the aggregation, the filterItem
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a toolsMenuItem into the aggregation {@link #getToolsMenuItems toolsMenuItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertToolsMenuItem(
      /**
      * The toolsMenuItem to insert; if empty, nothing is inserted
      */
    oToolsMenuItem: typings.openui5.sapUiCommonsMenuItemMod.default,
      /**
      * The `0`-based index the toolsMenuItem should be inserted at; for a negative value of `iIndex`, the toolsMenuItem
      * is inserted at position 0; for a value greater than the current size of the aggregation, the toolsMenuItem
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getChunks chunks}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllChunks(): js.Array[typings.openui5.sapUiUx3FeedChunkMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getFilterItems filterItems}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllFilterItems(): js.Array[typings.openui5.sapUiCoreListItemMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getToolsMenuItems toolsMenuItems}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllToolsMenuItems(): js.Array[typings.openui5.sapUiCommonsMenuItemMod.default] = js.native
    
    def removeChunk(/**
      * The chunk to remove or its index or id
      */
    vChunk: String): typings.openui5.sapUiUx3FeedChunkMod.default | Null = js.native
    /**
      * Removes a chunk from the aggregation {@link #getChunks chunks}.
      *
      * @returns The removed chunk or `null`
      */
    def removeChunk(/**
      * The chunk to remove or its index or id
      */
    vChunk: int): typings.openui5.sapUiUx3FeedChunkMod.default | Null = js.native
    def removeChunk(
      /**
      * The chunk to remove or its index or id
      */
    vChunk: typings.openui5.sapUiUx3FeedChunkMod.default
    ): typings.openui5.sapUiUx3FeedChunkMod.default | Null = js.native
    
    def removeFilterItem(/**
      * The filterItem to remove or its index or id
      */
    vFilterItem: String): typings.openui5.sapUiCoreListItemMod.default | Null = js.native
    /**
      * Removes a filterItem from the aggregation {@link #getFilterItems filterItems}.
      *
      * @returns The removed filterItem or `null`
      */
    def removeFilterItem(/**
      * The filterItem to remove or its index or id
      */
    vFilterItem: int): typings.openui5.sapUiCoreListItemMod.default | Null = js.native
    def removeFilterItem(
      /**
      * The filterItem to remove or its index or id
      */
    vFilterItem: typings.openui5.sapUiCoreListItemMod.default
    ): typings.openui5.sapUiCoreListItemMod.default | Null = js.native
    
    def removeToolsMenuItem(/**
      * The toolsMenuItem to remove or its index or id
      */
    vToolsMenuItem: String): typings.openui5.sapUiCommonsMenuItemMod.default | Null = js.native
    /**
      * Removes a toolsMenuItem from the aggregation {@link #getToolsMenuItems toolsMenuItems}.
      *
      * @returns The removed toolsMenuItem or `null`
      */
    def removeToolsMenuItem(/**
      * The toolsMenuItem to remove or its index or id
      */
    vToolsMenuItem: int): typings.openui5.sapUiCommonsMenuItemMod.default | Null = js.native
    def removeToolsMenuItem(
      /**
      * The toolsMenuItem to remove or its index or id
      */
    vToolsMenuItem: typings.openui5.sapUiCommonsMenuItemMod.default
    ): typings.openui5.sapUiCommonsMenuItemMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getFeederSender feederSender}.
      *
      * The sender of the feeder
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFeederSender(): this.type = js.native
    def setFeederSender(/**
      * New value for property `feederSender`
      */
    sFeederSender: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFeederThumbnailSrc feederThumbnailSrc}.
      *
      * The path to the thumbnail image used for the feeder
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFeederThumbnailSrc(): this.type = js.native
    def setFeederThumbnailSrc(/**
      * New value for property `feederThumbnailSrc`
      */
    sFeederThumbnailSrc: URI): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getLive live}.
      *
      * Specifies whether the feed shall be in live mode
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLive(): this.type = js.native
    def setLive(/**
      * New value for property `live`
      */
    bLive: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitle title}.
      *
      * Title text of the Feed. If no text is entered "FEED" is displayed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitle(): this.type = js.native
    def setTitle(/**
      * New value for property `title`
      */
    sTitle: String): this.type = js.native
    
    /**
      * Unbinds aggregation {@link #getChunks chunks} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindChunks(): this.type = js.native
    
    /**
      * Unbinds aggregation {@link #getFilterItems filterItems} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindFilterItems(): this.type = js.native
    
    /**
      * Unbinds aggregation {@link #getToolsMenuItems toolsMenuItems} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindToolsMenuItems(): this.type = js.native
  }
  
  trait FeedSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Event is fired when a new chunk is added
      */
    var chunkAdded: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * The chunks
      */
    var chunks: js.UndefOr[
        js.Array[typings.openui5.sapUiUx3FeedChunkMod.default] | typings.openui5.sapUiUx3FeedChunkMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The sender of the feeder
      */
    var feederSender: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The path to the thumbnail image used for the feeder
      */
    var feederThumbnailSrc: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Event is fired when the filter is changed
      */
    var filterChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Items of the filter
      */
    var filterItems: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreListItemMod.default] | typings.openui5.sapUiCoreListItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Specifies whether the feed shall be in live mode
      */
    var live: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Event is fired when the search function on SearchField is triggered
      */
    var search: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Title text of the Feed. If no text is entered "FEED" is displayed.
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Event is fired when the live mode has changed
      */
    var toggleLive: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Event is fired when an item from the tools MenuButton was selected
      */
    var toolsItemSelected: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * MenuItems to open when the tool button is clicked by the user
      */
    var toolsMenuItems: js.UndefOr[
        js.Array[typings.openui5.sapUiCommonsMenuItemMod.default] | typings.openui5.sapUiCommonsMenuItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object FeedSettings {
    
    inline def apply(): FeedSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeedSettings]
    }
    
    extension [Self <: FeedSettings](x: Self) {
      
      inline def setChunkAdded(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "chunkAdded", js.Any.fromFunction1(value))
      
      inline def setChunkAddedUndefined: Self = StObject.set(x, "chunkAdded", js.undefined)
      
      inline def setChunks(
        value: js.Array[typings.openui5.sapUiUx3FeedChunkMod.default] | typings.openui5.sapUiUx3FeedChunkMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
      
      inline def setChunksUndefined: Self = StObject.set(x, "chunks", js.undefined)
      
      inline def setChunksVarargs(value: typings.openui5.sapUiUx3FeedChunkMod.default*): Self = StObject.set(x, "chunks", js.Array(value*))
      
      inline def setFeederSender(value: String | PropertyBindingInfo): Self = StObject.set(x, "feederSender", value.asInstanceOf[js.Any])
      
      inline def setFeederSenderUndefined: Self = StObject.set(x, "feederSender", js.undefined)
      
      inline def setFeederThumbnailSrc(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "feederThumbnailSrc", value.asInstanceOf[js.Any])
      
      inline def setFeederThumbnailSrcUndefined: Self = StObject.set(x, "feederThumbnailSrc", js.undefined)
      
      inline def setFilterChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "filterChange", js.Any.fromFunction1(value))
      
      inline def setFilterChangeUndefined: Self = StObject.set(x, "filterChange", js.undefined)
      
      inline def setFilterItems(
        value: js.Array[typings.openui5.sapUiCoreListItemMod.default] | typings.openui5.sapUiCoreListItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "filterItems", value.asInstanceOf[js.Any])
      
      inline def setFilterItemsUndefined: Self = StObject.set(x, "filterItems", js.undefined)
      
      inline def setFilterItemsVarargs(value: typings.openui5.sapUiCoreListItemMod.default*): Self = StObject.set(x, "filterItems", js.Array(value*))
      
      inline def setLive(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "live", value.asInstanceOf[js.Any])
      
      inline def setLiveUndefined: Self = StObject.set(x, "live", js.undefined)
      
      inline def setSearch(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "search", js.Any.fromFunction1(value))
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setToggleLive(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "toggleLive", js.Any.fromFunction1(value))
      
      inline def setToggleLiveUndefined: Self = StObject.set(x, "toggleLive", js.undefined)
      
      inline def setToolsItemSelected(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "toolsItemSelected", js.Any.fromFunction1(value))
      
      inline def setToolsItemSelectedUndefined: Self = StObject.set(x, "toolsItemSelected", js.undefined)
      
      inline def setToolsMenuItems(
        value: js.Array[typings.openui5.sapUiCommonsMenuItemMod.default] | typings.openui5.sapUiCommonsMenuItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "toolsMenuItems", value.asInstanceOf[js.Any])
      
      inline def setToolsMenuItemsUndefined: Self = StObject.set(x, "toolsMenuItems", js.undefined)
      
      inline def setToolsMenuItemsVarargs(value: typings.openui5.sapUiCommonsMenuItemMod.default*): Self = StObject.set(x, "toolsMenuItems", js.Array(value*))
    }
  }
}
