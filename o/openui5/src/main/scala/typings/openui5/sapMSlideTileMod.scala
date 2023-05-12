package typings.openui5

import typings.openui5.anon.Scope
import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.GenericTileScope
import typings.openui5.sapMLibraryMod.TileSizeBehavior
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMSlideTileMod {
  
  @JSImport("sap/m/SlideTile", JSImport.Default)
  @js.native
  /**
    * Constructor for a new sap.m.SlideTile control.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends SlideTile {
    def this(/**
      * initial settings for the new control
      */
    mSettings: SlideTileSettings) = this()
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
    mSettings: SlideTileSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: SlideTileSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/SlideTile", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.SlideTile with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, SlideTile]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, SlideTile],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.SlideTile.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait SlideTile
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some tile to the aggregation {@link #getTiles tiles}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addTile(
      /**
      * The tile to add; if empty, nothing is inserted
      */
    oTile: typings.openui5.sapMGenericTileMod.default
    ): this.type = js.native
    
    /**
      * @SINCE 1.46.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:press press} event of this `sap.m.SlideTile`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SlideTile` itself.
      *
      * The event is fired when the user chooses the tile. The event is available only in Actions scope.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.SlideTile` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.46.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:press press} event of this `sap.m.SlideTile`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SlideTile` itself.
      *
      * The event is fired when the user chooses the tile. The event is available only in Actions scope.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPress(
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
    def attachPress(
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
      * Context object to call the event handler with. Defaults to this `sap.m.SlideTile` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Binds aggregation {@link #getTiles tiles} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
      * of the possible properties of `oBindingInfo`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindTiles(/**
      * The binding information
      */
    oBindingInfo: AggregationBindingInfo): this.type = js.native
    
    /**
      * Destroys all the tiles in the aggregation {@link #getTiles tiles}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyTiles(): this.type = js.native
    
    /**
      * @SINCE 1.46.0
      *
      * Detaches event handler `fnFunction` from the {@link #event:press press} event of this `sap.m.SlideTile`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachPress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachPress(
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
      * @SINCE 1.46.0
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:press press} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def firePress(): this.type = js.native
    def firePress(/**
      * Parameters to pass along with the event
      */
    mParameters: Scope): this.type = js.native
    
    /**
      * Gets current value of property {@link #getDisplayTime displayTime}.
      *
      * The time of the slide display in milliseconds.
      *
      * Default value is `5000`.
      *
      * @returns Value of property `displayTime`
      */
    def getDisplayTime(): int = js.native
    
    /**
      * @SINCE 1.96
      * @EXPERIMENTAL
      *
      * Gets current value of property {@link #getHeight height}.
      *
      * Height of the control.
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * @SINCE 1.46.0
      *
      * Gets current value of property {@link #getScope scope}.
      *
      * Changes the visualization in order to enable additional actions with the SlideTile control.
      *
      * Default value is `"Display"`.
      *
      * @returns Value of property `scope`
      */
    def getScope(): GenericTileScope | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GenericTileScope * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getSizeBehavior sizeBehavior}.
      *
      * If set to `TileSizeBehavior.Small`, the tile size is the same as it would be on a small-screened phone
      * (374px wide and lower), regardless of the screen size of the actual device being used. If set to `TileSizeBehavior.Responsive`,
      * the tile size adapts to the size of the screen. This property has to be set consistently for the `SlideTile`
      * along with all its inner `GenericTile` elements, so that they match one another visually.
      *
      * Default value is `Responsive`.
      *
      * @returns Value of property `sizeBehavior`
      */
    def getSizeBehavior(): TileSizeBehavior | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TileSizeBehavior * / any */ String) = js.native
    
    /**
      * Gets content of aggregation {@link #getTiles tiles}.
      *
      * The set of Generic Tiles to be shown in the control.
      */
    def getTiles(): js.Array[typings.openui5.sapMGenericTileMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getTransitionTime transitionTime}.
      *
      * The time of the slide changing in milliseconds.
      *
      * Default value is `500`.
      *
      * @returns Value of property `transitionTime`
      */
    def getTransitionTime(): int = js.native
    
    /**
      * @SINCE 1.72
      *
      * Gets current value of property {@link #getWidth width}.
      *
      * Width of the control.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Checks for the provided `sap.m.GenericTile` in the aggregation {@link #getTiles tiles}. and returns its
      * index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfTile(/**
      * The tile whose index is looked for
      */
    oTile: typings.openui5.sapMGenericTileMod.default): int = js.native
    
    /**
      * Inserts a tile into the aggregation {@link #getTiles tiles}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertTile(
      /**
      * The tile to insert; if empty, nothing is inserted
      */
    oTile: typings.openui5.sapMGenericTileMod.default,
      /**
      * The `0`-based index the tile should be inserted at; for a negative value of `iIndex`, the tile is inserted
      * at position 0; for a value greater than the current size of the aggregation, the tile is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getTiles tiles}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllTiles(): js.Array[typings.openui5.sapMGenericTileMod.default] = js.native
    
    def removeTile(/**
      * The tile to remove or its index or id
      */
    vTile: String): typings.openui5.sapMGenericTileMod.default | Null = js.native
    /**
      * Removes a tile from the aggregation {@link #getTiles tiles}.
      *
      * @returns The removed tile or `null`
      */
    def removeTile(/**
      * The tile to remove or its index or id
      */
    vTile: int): typings.openui5.sapMGenericTileMod.default | Null = js.native
    def removeTile(
      /**
      * The tile to remove or its index or id
      */
    vTile: typings.openui5.sapMGenericTileMod.default
    ): typings.openui5.sapMGenericTileMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getDisplayTime displayTime}.
      *
      * The time of the slide display in milliseconds.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `5000`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDisplayTime(): this.type = js.native
    def setDisplayTime(/**
      * New value for property `displayTime`
      */
    iDisplayTime: int): this.type = js.native
    
    /**
      * @SINCE 1.96
      * @EXPERIMENTAL
      *
      * Sets a new value for property {@link #getHeight height}.
      *
      * Height of the control.
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
      * @SINCE 1.46.0
      *
      * Sets a new value for property {@link #getScope scope}.
      *
      * Changes the visualization in order to enable additional actions with the SlideTile control.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"Display"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setScope(): this.type = js.native
    def setScope(
      /**
      * New value for property `scope`
      */
    sScope: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GenericTileScope * / any */ String
    ): this.type = js.native
    def setScope(/**
      * New value for property `scope`
      */
    sScope: GenericTileScope): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSizeBehavior sizeBehavior}.
      *
      * If set to `TileSizeBehavior.Small`, the tile size is the same as it would be on a small-screened phone
      * (374px wide and lower), regardless of the screen size of the actual device being used. If set to `TileSizeBehavior.Responsive`,
      * the tile size adapts to the size of the screen. This property has to be set consistently for the `SlideTile`
      * along with all its inner `GenericTile` elements, so that they match one another visually.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Responsive`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSizeBehavior(): this.type = js.native
    def setSizeBehavior(
      /**
      * New value for property `sizeBehavior`
      */
    sSizeBehavior: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TileSizeBehavior * / any */ String
    ): this.type = js.native
    def setSizeBehavior(/**
      * New value for property `sizeBehavior`
      */
    sSizeBehavior: TileSizeBehavior): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTransitionTime transitionTime}.
      *
      * The time of the slide changing in milliseconds.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `500`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTransitionTime(): this.type = js.native
    def setTransitionTime(/**
      * New value for property `transitionTime`
      */
    iTransitionTime: int): this.type = js.native
    
    /**
      * @SINCE 1.72
      *
      * Sets a new value for property {@link #getWidth width}.
      *
      * Width of the control.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
    
    /**
      * Unbinds aggregation {@link #getTiles tiles} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindTiles(): this.type = js.native
  }
  
  trait SlideTileSettings
    extends StObject
       with ControlSettings {
    
    /**
      * The time of the slide display in milliseconds.
      */
    var displayTime: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.96
      * @EXPERIMENTAL
      *
      * Height of the control.
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.46.0
      *
      * The event is fired when the user chooses the tile. The event is available only in Actions scope.
      */
    var press: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.46.0
      *
      * Changes the visualization in order to enable additional actions with the SlideTile control.
      */
    var scope: js.UndefOr[
        GenericTileScope | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GenericTileScope * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * If set to `TileSizeBehavior.Small`, the tile size is the same as it would be on a small-screened phone
      * (374px wide and lower), regardless of the screen size of the actual device being used. If set to `TileSizeBehavior.Responsive`,
      * the tile size adapts to the size of the screen. This property has to be set consistently for the `SlideTile`
      * along with all its inner `GenericTile` elements, so that they match one another visually.
      */
    var sizeBehavior: js.UndefOr[
        TileSizeBehavior | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TileSizeBehavior * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * The set of Generic Tiles to be shown in the control.
      */
    var tiles: js.UndefOr[
        js.Array[typings.openui5.sapMGenericTileMod.default] | typings.openui5.sapMGenericTileMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The time of the slide changing in milliseconds.
      */
    var transitionTime: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.72
      *
      * Width of the control.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object SlideTileSettings {
    
    inline def apply(): SlideTileSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SlideTileSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SlideTileSettings] (val x: Self) extends AnyVal {
      
      inline def setDisplayTime(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "displayTime", value.asInstanceOf[js.Any])
      
      inline def setDisplayTimeUndefined: Self = StObject.set(x, "displayTime", js.undefined)
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setPress(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "press", js.Any.fromFunction1(value))
      
      inline def setPressUndefined: Self = StObject.set(x, "press", js.undefined)
      
      inline def setScope(
        value: GenericTileScope | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GenericTileScope * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setSizeBehavior(
        value: TileSizeBehavior | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TileSizeBehavior * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "sizeBehavior", value.asInstanceOf[js.Any])
      
      inline def setSizeBehaviorUndefined: Self = StObject.set(x, "sizeBehavior", js.undefined)
      
      inline def setTiles(
        value: js.Array[typings.openui5.sapMGenericTileMod.default] | typings.openui5.sapMGenericTileMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "tiles", value.asInstanceOf[js.Any])
      
      inline def setTilesUndefined: Self = StObject.set(x, "tiles", js.undefined)
      
      inline def setTilesVarargs(value: typings.openui5.sapMGenericTileMod.default*): Self = StObject.set(x, "tiles", js.Array(value*))
      
      inline def setTransitionTime(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "transitionTime", value.asInstanceOf[js.Any])
      
      inline def setTransitionTimeUndefined: Self = StObject.set(x, "transitionTime", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
