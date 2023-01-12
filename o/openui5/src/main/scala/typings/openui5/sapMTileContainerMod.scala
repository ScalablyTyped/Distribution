package typings.openui5

import typings.openui5.anon.NewIndex
import typings.openui5.anon.Tile
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMTileContainerMod {
  
  @JSImport("sap/m/TileContainer", JSImport.Default)
  @js.native
  /**
    * Constructor for a new TileContainer.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends TileContainer {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: TileContainerSettings) = this()
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
    mSettings: TileContainerSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: TileContainerSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/TileContainer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.TileContainer with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, TileContainer]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, TileContainer],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.TileContainer.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait TileContainer
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds a Tile to the end of the tiles collection.
      *
      * @returns this pointer for chaining
      */
    def addTile(/**
      * The tile to add
      */
    oTile: typings.openui5.sapMTileMod.default): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:tileAdd tileAdd} event of this `sap.m.TileContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.TileContainer` itself.
      *
      * Fires when a Tile is added.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachTileAdd(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachTileAdd(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.TileContainer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:tileAdd tileAdd} event of this `sap.m.TileContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.TileContainer` itself.
      *
      * Fires when a Tile is added.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachTileAdd(
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
    def attachTileAdd(
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
      * Context object to call the event handler with. Defaults to this `sap.m.TileContainer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:tileDelete tileDelete} event of this `sap.m.TileContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.TileContainer` itself.
      *
      * Fires if a Tile is deleted in Edit mode.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachTileDelete(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachTileDelete(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.TileContainer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:tileDelete tileDelete} event of this `sap.m.TileContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.TileContainer` itself.
      *
      * Fires if a Tile is deleted in Edit mode.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachTileDelete(
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
    def attachTileDelete(
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
      * Context object to call the event handler with. Defaults to this `sap.m.TileContainer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:tileMove tileMove} event of this `sap.m.TileContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.TileContainer` itself.
      *
      * Fires if a Tile is moved.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachTileMove(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachTileMove(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.TileContainer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:tileMove tileMove} event of this `sap.m.TileContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.TileContainer` itself.
      *
      * Fires if a Tile is moved.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachTileMove(
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
    def attachTileMove(
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
      * Context object to call the event handler with. Defaults to this `sap.m.TileContainer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Deletes a Tile.
      *
      * @returns this pointer for chaining
      */
    def deleteTile(/**
      * The tile to move
      */
    oTile: typings.openui5.sapMTileMod.default): this.type = js.native
    
    /**
      * Destroys all the tiles in the aggregation {@link #getTiles tiles}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyTiles(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:tileAdd tileAdd} event of this `sap.m.TileContainer`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachTileAdd(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachTileAdd(
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
      * Detaches event handler `fnFunction` from the {@link #event:tileDelete tileDelete} event of this `sap.m.TileContainer`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachTileDelete(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachTileDelete(
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
      * Detaches event handler `fnFunction` from the {@link #event:tileMove tileMove} event of this `sap.m.TileContainer`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachTileMove(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachTileMove(
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
      * Fires event {@link #event:tileAdd tileAdd} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireTileAdd(): this.type = js.native
    def fireTileAdd(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Fires event {@link #event:tileDelete tileDelete} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireTileDelete(): this.type = js.native
    def fireTileDelete(/**
      * Parameters to pass along with the event
      */
    mParameters: Tile): this.type = js.native
    
    /**
      * Fires event {@link #event:tileMove tileMove} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireTileMove(): this.type = js.native
    def fireTileMove(/**
      * Parameters to pass along with the event
      */
    mParameters: NewIndex): this.type = js.native
    
    /**
      * Gets current value of property {@link #getAllowAdd allowAdd}.
      *
      * Determines whether the user is allowed to add Tiles in Edit mode (editable = true).
      *
      * @returns Value of property `allowAdd`
      */
    def getAllowAdd(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getEditable editable}.
      *
      * Determines whether the TileContainer is editable so you can move, delete or add tiles.
      *
      * @returns Value of property `editable`
      */
    def getEditable(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getHeight height}.
      *
      * Defines the height of the TileContainer in px.
      *
      * Default value is `'100%'`.
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * Returns the index of the first Tile visible in the current page.
      *
      * @returns The index of the first Tile that is visible in the current page
      */
    def getPageFirstTileIndex(): int = js.native
    
    /**
      * Gets content of aggregation {@link #getTiles tiles}.
      *
      * The Tiles to be displayed by the TileContainer.
      */
    def getTiles(): js.Array[typings.openui5.sapMTileMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Defines the width of the TileContainer in px.
      *
      * Default value is `'100%'`.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Checks for the provided `sap.m.Tile` in the aggregation {@link #getTiles tiles}. and returns its index
      * if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfTile(/**
      * The tile whose index is looked for
      */
    oTile: typings.openui5.sapMTileMod.default): int = js.native
    
    /**
      * Inserts a Tile to the given index.
      *
      * @returns this pointer for chaining
      */
    def insertTile(
      /**
      * The Tile to insert
      */
    oTile: typings.openui5.sapMTileMod.default,
      /**
      * The new Tile position in the tiles aggregation
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Moves a given Tile to the given index.
      *
      * @returns this pointer for chaining
      */
    def moveTile(
      /**
      * The tile to move
      */
    vTile: typings.openui5.sapMTileMod.default,
      /**
      * The new Tile position in the tiles aggregation
      */
    iNewIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getTiles tiles}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllTiles(): js.Array[typings.openui5.sapMTileMod.default] = js.native
    
    def removeTile(/**
      * The tile to remove or its index or id
      */
    vTile: String): typings.openui5.sapMTileMod.default | Null = js.native
    /**
      * Removes a tile from the aggregation {@link #getTiles tiles}.
      *
      * @returns The removed tile or `null`
      */
    def removeTile(/**
      * The tile to remove or its index or id
      */
    vTile: int): typings.openui5.sapMTileMod.default | Null = js.native
    def removeTile(/**
      * The tile to remove or its index or id
      */
    vTile: typings.openui5.sapMTileMod.default): typings.openui5.sapMTileMod.default | Null = js.native
    
    def scrollIntoView(
      /**
      * The Tile or tile index to be scrolled into view
      */
    vTile: int,
      /**
      * Whether the scroll should be animated
      */
    bAnimated: Boolean
    ): Unit = js.native
    def scrollIntoView(
      /**
      * The Tile or tile index to be scrolled into view
      */
    vTile: int,
      /**
      * Whether the scroll should be animated
      */
    bAnimated: Boolean,
      /**
      * optional list of visible tiles in order to avoid filtering them again.
      */
    aVisibleTiles: js.Array[typings.openui5.sapMTileMod.default]
    ): Unit = js.native
    /**
      * Scrolls to the page where the given Tile or tile index is included. Optionally this can be done animated
      * or not. With IE9 the scroll is never animated.
      */
    def scrollIntoView(
      /**
      * The Tile or tile index to be scrolled into view
      */
    vTile: typings.openui5.sapMTileMod.default,
      /**
      * Whether the scroll should be animated
      */
    bAnimated: Boolean
    ): Unit = js.native
    def scrollIntoView(
      /**
      * The Tile or tile index to be scrolled into view
      */
    vTile: typings.openui5.sapMTileMod.default,
      /**
      * Whether the scroll should be animated
      */
    bAnimated: Boolean,
      /**
      * optional list of visible tiles in order to avoid filtering them again.
      */
    aVisibleTiles: js.Array[typings.openui5.sapMTileMod.default]
    ): Unit = js.native
    
    /**
      * Scrolls one page to the left.
      */
    def scrollLeft(): Unit = js.native
    
    /**
      * Scrolls one page to the right.
      */
    def scrollRight(): Unit = js.native
    
    /**
      * Sets a new value for property {@link #getAllowAdd allowAdd}.
      *
      * Determines whether the user is allowed to add Tiles in Edit mode (editable = true).
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAllowAdd(): this.type = js.native
    def setAllowAdd(/**
      * New value for property `allowAdd`
      */
    bAllowAdd: Boolean): this.type = js.native
    
    /**
      * Sets the editable property to the TileContainer, allowing to move icons. This is currently also set with
      * a long tap.
      *
      * @returns this pointer for chaining
      */
    def setEditable(/**
      * Whether the container is in edit mode or not
      */
    bValue: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeight height}.
      *
      * Defines the height of the TileContainer in px.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'100%'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeight(): this.type = js.native
    def setHeight(/**
      * New value for property `height`
      */
    sHeight: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Defines the width of the TileContainer in px.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'100%'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(): this.type = js.native
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
  }
  
  trait TileContainerSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Determines whether the user is allowed to add Tiles in Edit mode (editable = true).
      */
    var allowAdd: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines whether the TileContainer is editable so you can move, delete or add tiles.
      */
    var editable: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the height of the TileContainer in px.
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fires when a Tile is added.
      */
    var tileAdd: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Fires if a Tile is deleted in Edit mode.
      */
    var tileDelete: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Fires if a Tile is moved.
      */
    var tileMove: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * The Tiles to be displayed by the TileContainer.
      */
    var tiles: js.UndefOr[
        js.Array[typings.openui5.sapMTileMod.default] | typings.openui5.sapMTileMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the width of the TileContainer in px.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object TileContainerSettings {
    
    inline def apply(): TileContainerSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TileContainerSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TileContainerSettings] (val x: Self) extends AnyVal {
      
      inline def setAllowAdd(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "allowAdd", value.asInstanceOf[js.Any])
      
      inline def setAllowAddUndefined: Self = StObject.set(x, "allowAdd", js.undefined)
      
      inline def setEditable(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setTileAdd(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "tileAdd", js.Any.fromFunction1(value))
      
      inline def setTileAddUndefined: Self = StObject.set(x, "tileAdd", js.undefined)
      
      inline def setTileDelete(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "tileDelete", js.Any.fromFunction1(value))
      
      inline def setTileDeleteUndefined: Self = StObject.set(x, "tileDelete", js.undefined)
      
      inline def setTileMove(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "tileMove", js.Any.fromFunction1(value))
      
      inline def setTileMoveUndefined: Self = StObject.set(x, "tileMove", js.undefined)
      
      inline def setTiles(
        value: js.Array[typings.openui5.sapMTileMod.default] | typings.openui5.sapMTileMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "tiles", value.asInstanceOf[js.Any])
      
      inline def setTilesUndefined: Self = StObject.set(x, "tiles", js.undefined)
      
      inline def setTilesVarargs(value: typings.openui5.sapMTileMod.default*): Self = StObject.set(x, "tiles", js.Array(value*))
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
