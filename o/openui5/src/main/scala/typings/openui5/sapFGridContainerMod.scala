package typings.openui5

import typings.openui5.anon.Column
import typings.openui5.anon.Columns
import typings.openui5.anon.Layout
import typings.openui5.sap.ClassInfo
import typings.openui5.sapFLibraryMod.NavigationDirection
import typings.openui5.sapFLibraryMod.dnd.IGridDroppable
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapFGridContainerMod {
  
  @JSImport("sap/f/GridContainer", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `sap.f.GridContainer`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link topic:cca5ee5d63ca44c89318f8496a58f9f2 Grid Container}
    * 	{@link topic:32d4b9c2b981425dbc374d3e9d5d0c2e Grid Controls}
    * 	{@link topic:5b46b03f024542ba802d99d67bc1a3f4 Cards}
    * 	{@link sap.f.dnd.GridDropInfo}
    */
  open class default () extends GridContainer {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: GridContainerSettings) = this()
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
    mSettings: GridContainerSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: GridContainerSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_f_dnd_IGridDroppable: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/f/GridContainer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.f.GridContainer with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, GridContainer]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, GridContainer],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.f.GridContainer.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait GridContainer
    extends typings.openui5.sapUiCoreControlMod.default
       with IGridDroppable {
    
    def addAriaDescribedBy(
      /**
      * The ariaDescribedBy to add; if empty, nothing is inserted
      */
    vAriaDescribedBy: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * Adds some ariaDescribedBy into the association {@link #getAriaDescribedBy ariaDescribedBy}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAriaDescribedBy(/**
      * The ariaDescribedBy to add; if empty, nothing is inserted
      */
    vAriaDescribedBy: ID): this.type = js.native
    
    def addAriaLabelledBy(
      /**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * Adds some ariaLabelledBy into the association {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAriaLabelledBy(/**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: ID): this.type = js.native
    
    /**
      * Adds some item to the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addItem(
      /**
      * The item to add; if empty, nothing is inserted
      */
    oItem: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:borderReached borderReached} event of this `sap.f.GridContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.GridContainer` itself.
      *
      * Fires if the border of the visualizations is reached so that an application can react on this.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBorderReached(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachBorderReached(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.f.GridContainer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:borderReached borderReached} event of this `sap.f.GridContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.GridContainer` itself.
      *
      * Fires if the border of the visualizations is reached so that an application can react on this.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBorderReached(
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
    def attachBorderReached(
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
      * Context object to call the event handler with. Defaults to this `sap.f.GridContainer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:columnsChange columnsChange} event of this `sap.f.GridContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.GridContainer` itself.
      *
      * Fired when the grid columns count is changed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachColumnsChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachColumnsChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.f.GridContainer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:columnsChange columnsChange} event of this `sap.f.GridContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.GridContainer` itself.
      *
      * Fired when the grid columns count is changed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachColumnsChange(
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
    def attachColumnsChange(
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
      * Context object to call the event handler with. Defaults to this `sap.f.GridContainer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:layoutChange layoutChange} event of this `sap.f.GridContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.GridContainer` itself.
      *
      * Fired when the currently active GridSettings change.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachLayoutChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachLayoutChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.f.GridContainer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:layoutChange layoutChange} event of this `sap.f.GridContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.GridContainer` itself.
      *
      * Fired when the currently active GridSettings change.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachLayoutChange(
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
    def attachLayoutChange(
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
      * Context object to call the event handler with. Defaults to this `sap.f.GridContainer` itself
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
      * Destroys the layout in the aggregation {@link #getLayout layout}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyLayout(): this.type = js.native
    
    /**
      * Destroys the layoutL in the aggregation {@link #getLayoutL layoutL}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyLayoutL(): this.type = js.native
    
    /**
      * Destroys the layoutM in the aggregation {@link #getLayoutM layoutM}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyLayoutM(): this.type = js.native
    
    /**
      * Destroys the layoutS in the aggregation {@link #getLayoutS layoutS}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyLayoutS(): this.type = js.native
    
    /**
      * Destroys the layoutXL in the aggregation {@link #getLayoutXL layoutXL}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyLayoutXL(): this.type = js.native
    
    /**
      * @EXPERIMENTAL (since 1.71)
      *
      * Destroys the layoutXS in the aggregation {@link #getLayoutXS layoutXS}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyLayoutXS(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:borderReached borderReached} event of this
      * `sap.f.GridContainer`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachBorderReached(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachBorderReached(
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
      * Detaches event handler `fnFunction` from the {@link #event:columnsChange columnsChange} event of this
      * `sap.f.GridContainer`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachColumnsChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachColumnsChange(
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
      * Detaches event handler `fnFunction` from the {@link #event:layoutChange layoutChange} event of this `sap.f.GridContainer`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachLayoutChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachLayoutChange(
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
      * Fires event {@link #event:borderReached borderReached} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireBorderReached(): this.type = js.native
    def fireBorderReached(/**
      * Parameters to pass along with the event
      */
    mParameters: Column): this.type = js.native
    
    /**
      * Fires event {@link #event:columnsChange columnsChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireColumnsChange(): this.type = js.native
    def fireColumnsChange(/**
      * Parameters to pass along with the event
      */
    mParameters: Columns): this.type = js.native
    
    /**
      * Fires event {@link #event:layoutChange layoutChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireLayoutChange(): this.type = js.native
    def fireLayoutChange(/**
      * Parameters to pass along with the event
      */
    mParameters: Layout): this.type = js.native
    
    /**
      * @EXPERIMENTAL (since 1.81)
      *
      * Focuses the item on the given index. Should be called after successful drop operation.
      *
      * **Note:**Should not be called before the `GridContainer` has been rendered.
      */
    def focusItem(/**
      * The index of the item, which will be focused.
      */
    iIndex: int): Unit = js.native
    
    def focusItemByDirection(
      /**
      * The navigation direction.
      */
    sDirection: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof NavigationDirection * / any */ String,
      /**
      * The row index of the starting position.
      */
    iRow: int,
      /**
      * The column index of the starting position.
      */
    iColumn: int
    ): Unit = js.native
    /**
      * @EXPERIMENTAL (since 1.85)
      *
      * Focuses an item in the given direction - up, down, left or right, from the starting position specified
      * by row and column.
      *
      * If the direction is up or down, the method focuses the nearest item in the same column, located in the
      * specified direction.
      *
      * If the direction is left or right, the method focuses the nearest item at the same row, in the specified
      * direction.
      *
      * **Note:**Should be called after the rendering of `GridContainer` is ready.
      */
    def focusItemByDirection(
      /**
      * The navigation direction.
      */
    sDirection: NavigationDirection,
      /**
      * The row index of the starting position.
      */
    iRow: int,
      /**
      * The column index of the starting position.
      */
    iColumn: int
    ): Unit = js.native
    
    /**
      * Gets the `GridContainerSettings` for the current layout breakpoint.
      *
      * @returns The settings for the current layout
      */
    def getActiveLayoutSettings(): typings.openui5.sapFGridContainerSettingsMod.default = js.native
    
    /**
      * @EXPERIMENTAL (since 1.66)
      *
      * Gets current value of property {@link #getAllowDenseFill allowDenseFill}.
      *
      * Increases the density when arranging the items. Smaller items will take up all of the available space,
      * ignoring their order.
      *
      * **Note:** The order of the items is ignored. An item which is normally at the bottom, can appear on top.
      *
      * Default value is `false`.
      *
      * @returns Value of property `allowDenseFill`
      */
    def getAllowDenseFill(): Boolean = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaDescribedBy
      * ariaDescribedBy}.
      */
    def getAriaDescribedBy(): js.Array[ID] = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy
      * ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Gets current value of property {@link #getContainerQuery containerQuery}.
      *
      * If set to `true` the current range (large, medium or small) is defined by the size of the container surrounding
      * the `GridContainer`, instead of the device screen size (media Query).
      *
      * Default value is `false`.
      *
      * @returns Value of property `containerQuery`
      */
    def getContainerQuery(): Boolean = js.native
    
    /**
      * @EXPERIMENTAL (since 1.66)
      *
      * Gets current value of property {@link #getInlineBlockLayout inlineBlockLayout}.
      *
      * Makes the grid items act like an inline-block elements. They will be arranged in rows with height equal
      * to the highest item in the row.
      *
      * **Note:** If set to `true` the properties `rowSize` for grid layout, and `minRows` and `rows` per item
      * will be ignored.
      *
      * Default value is `false`.
      *
      * @returns Value of property `inlineBlockLayout`
      */
    def getInlineBlockLayout(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getItems items}.
      *
      * The items contained by the control.
      */
    def getItems(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getLayout layout}.
      *
      * The sap.f.GridContainerSettings applied if no settings are provided for a specific size.
      *
      * If no layout is given, a default layout will be used. See the default values for `sap.f.GridContainerSettings`.
      *
      * **Note:** It is not possible to reuse the same instance of `GridContainerSettings` for several layouts.
      * New instance has to be created for each of them. This is caused by the fact that one object can exist
      * in only a single aggregation.
      */
    def getLayout(): typings.openui5.sapFGridContainerSettingsMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getLayoutL layoutL}.
      *
      * The sap.f.GridContainerSettings applied for size "L". Range: 1023px - 1439px.
      */
    def getLayoutL(): typings.openui5.sapFGridContainerSettingsMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getLayoutM layoutM}.
      *
      * The sap.f.GridContainerSettings applied for size "M". Range: 600px - 1023px.
      */
    def getLayoutM(): typings.openui5.sapFGridContainerSettingsMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getLayoutS layoutS}.
      *
      * The sap.f.GridContainerSettings applied for size "S". Range: 375px - 599px.
      */
    def getLayoutS(): typings.openui5.sapFGridContainerSettingsMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getLayoutXL layoutXL}.
      *
      * The sap.f.GridContainerSettings applied for size "XL". Range: from 1440px.
      */
    def getLayoutXL(): typings.openui5.sapFGridContainerSettingsMod.default = js.native
    
    /**
      * @EXPERIMENTAL (since 1.71)
      *
      * Gets content of aggregation {@link #getLayoutXS layoutXS}.
      *
      * The sap.f.GridContainerSettings applied for size "XS". Range: up to 374px.
      */
    def getLayoutXS(): typings.openui5.sapFGridContainerSettingsMod.default = js.native
    
    /**
      * @EXPERIMENTAL (since 1.81)
      *
      * Gets current value of property {@link #getMinHeight minHeight}.
      *
      * Defines the minimum height of the grid.
      *
      * Allows an empty grid to be available as a drop target.
      *
      * Default value is `"2rem"`.
      *
      * @returns Value of property `minHeight`
      */
    def getMinHeight(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getSnapToRow snapToRow}.
      *
      * Should the items stretch to fill the rows that they occupy, or not.
      *
      * If set to `true` the items will stretch.
      *
      * Default value is `false`.
      *
      * @returns Value of property `snapToRow`
      */
    def getSnapToRow(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Defines the width of the control.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getItems items}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfItem(/**
      * The item whose index is looked for
      */
    oItem: typings.openui5.sapUiCoreControlMod.default): int = js.native
    
    /**
      * Inserts an item into the aggregation named `items`.
      *
      * @returns `this` to allow method chaining.
      */
    def insertItem(
      /**
      * The item to be inserted; if empty, nothing is inserted.
      */
    oItem: typings.openui5.sapUiCoreItemMod.default,
      /**
      * The `0`-based index the item should be inserted at; for a negative value of `iIndex`, the item is inserted
      * at position 0; for a value greater than the current size of the aggregation, the item is inserted at
      * the last position.
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls in the association named {@link #getAriaDescribedBy ariaDescribedBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaDescribedBy(): js.Array[ID] = js.native
    
    /**
      * Removes all the controls in the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getItems items}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllItems(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Removes an ariaDescribedBy from the association named {@link #getAriaDescribedBy ariaDescribedBy}.
      *
      * @returns The removed ariaDescribedBy or `null`
      */
    def removeAriaDescribedBy(/**
      * The ariaDescribedBy to be removed or its index or ID
      */
    vAriaDescribedBy: int): ID | Null = js.native
    def removeAriaDescribedBy(
      /**
      * The ariaDescribedBy to be removed or its index or ID
      */
    vAriaDescribedBy: typings.openui5.sapUiCoreControlMod.default
    ): ID | Null = js.native
    def removeAriaDescribedBy(/**
      * The ariaDescribedBy to be removed or its index or ID
      */
    vAriaDescribedBy: ID): ID | Null = js.native
    
    /**
      * Removes an ariaLabelledBy from the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns The removed ariaLabelledBy or `null`
      */
    def removeAriaLabelledBy(/**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: int): ID | Null = js.native
    def removeAriaLabelledBy(
      /**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: typings.openui5.sapUiCoreControlMod.default
    ): ID | Null = js.native
    def removeAriaLabelledBy(/**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: ID): ID | Null = js.native
    
    def removeItem(/**
      * The item to remove or its index or ID.
      */
    vItem: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes an item from the aggregation named `items`.
      *
      * @returns The removed item or `null`.
      */
    def removeItem(/**
      * The item to remove or its index or ID.
      */
    vItem: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeItem(
      /**
      * The item to remove or its index or ID.
      */
    vItem: typings.openui5.sapUiCoreItemMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * @EXPERIMENTAL (since 1.66)
      *
      * Sets a new value for property {@link #getAllowDenseFill allowDenseFill}.
      *
      * Increases the density when arranging the items. Smaller items will take up all of the available space,
      * ignoring their order.
      *
      * **Note:** The order of the items is ignored. An item which is normally at the bottom, can appear on top.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAllowDenseFill(): this.type = js.native
    def setAllowDenseFill(/**
      * New value for property `allowDenseFill`
      */
    bAllowDenseFill: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getContainerQuery containerQuery}.
      *
      * If set to `true` the current range (large, medium or small) is defined by the size of the container surrounding
      * the `GridContainer`, instead of the device screen size (media Query).
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setContainerQuery(): this.type = js.native
    def setContainerQuery(/**
      * New value for property `containerQuery`
      */
    bContainerQuery: Boolean): this.type = js.native
    
    /**
      * @EXPERIMENTAL (since 1.66)
      *
      * Sets a new value for property {@link #getInlineBlockLayout inlineBlockLayout}.
      *
      * Makes the grid items act like an inline-block elements. They will be arranged in rows with height equal
      * to the highest item in the row.
      *
      * **Note:** If set to `true` the properties `rowSize` for grid layout, and `minRows` and `rows` per item
      * will be ignored.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setInlineBlockLayout(): this.type = js.native
    def setInlineBlockLayout(/**
      * New value for property `inlineBlockLayout`
      */
    bInlineBlockLayout: Boolean): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getLayout layout}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLayout(/**
      * The layout to set
      */
    oLayout: typings.openui5.sapFGridContainerSettingsMod.default): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getLayoutL layoutL}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLayoutL(/**
      * The layoutL to set
      */
    oLayoutL: typings.openui5.sapFGridContainerSettingsMod.default): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getLayoutM layoutM}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLayoutM(/**
      * The layoutM to set
      */
    oLayoutM: typings.openui5.sapFGridContainerSettingsMod.default): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getLayoutS layoutS}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLayoutS(/**
      * The layoutS to set
      */
    oLayoutS: typings.openui5.sapFGridContainerSettingsMod.default): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getLayoutXL layoutXL}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLayoutXL(/**
      * The layoutXL to set
      */
    oLayoutXL: typings.openui5.sapFGridContainerSettingsMod.default): this.type = js.native
    
    /**
      * @EXPERIMENTAL (since 1.71)
      *
      * Sets the aggregated {@link #getLayoutXS layoutXS}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLayoutXS(/**
      * The layoutXS to set
      */
    oLayoutXS: typings.openui5.sapFGridContainerSettingsMod.default): this.type = js.native
    
    /**
      * @EXPERIMENTAL (since 1.81)
      *
      * Sets a new value for property {@link #getMinHeight minHeight}.
      *
      * Defines the minimum height of the grid.
      *
      * Allows an empty grid to be available as a drop target.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"2rem"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMinHeight(): this.type = js.native
    def setMinHeight(/**
      * New value for property `minHeight`
      */
    sMinHeight: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSnapToRow snapToRow}.
      *
      * Should the items stretch to fill the rows that they occupy, or not.
      *
      * If set to `true` the items will stretch.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSnapToRow(): this.type = js.native
    def setSnapToRow(/**
      * New value for property `snapToRow`
      */
    bSnapToRow: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Defines the width of the control.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(): this.type = js.native
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
  }
  
  trait GridContainerSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @EXPERIMENTAL (since 1.66)
      *
      * Increases the density when arranging the items. Smaller items will take up all of the available space,
      * ignoring their order.
      *
      * **Note:** The order of the items is ignored. An item which is normally at the bottom, can appear on top.
      */
    var allowDenseFill: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Association to controls / IDs which describe this control (see WAI-ARIA attribute aria-describedby).
      */
    var ariaDescribedBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * Association to controls / IDs which label this control (see WAI-ARIA attribute aria-labelledby).
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * Fires if the border of the visualizations is reached so that an application can react on this.
      */
    var borderReached: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Fired when the grid columns count is changed.
      */
    var columnsChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * If set to `true` the current range (large, medium or small) is defined by the size of the container surrounding
      * the `GridContainer`, instead of the device screen size (media Query).
      */
    var containerQuery: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @EXPERIMENTAL (since 1.66)
      *
      * Makes the grid items act like an inline-block elements. They will be arranged in rows with height equal
      * to the highest item in the row.
      *
      * **Note:** If set to `true` the properties `rowSize` for grid layout, and `minRows` and `rows` per item
      * will be ignored.
      */
    var inlineBlockLayout: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The items contained by the control.
      */
    var items: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The sap.f.GridContainerSettings applied if no settings are provided for a specific size.
      *
      * If no layout is given, a default layout will be used. See the default values for `sap.f.GridContainerSettings`.
      *
      * **Note:** It is not possible to reuse the same instance of `GridContainerSettings` for several layouts.
      * New instance has to be created for each of them. This is caused by the fact that one object can exist
      * in only a single aggregation.
      */
    var layout: js.UndefOr[typings.openui5.sapFGridContainerSettingsMod.default] = js.undefined
    
    /**
      * Fired when the currently active GridSettings change.
      */
    var layoutChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * The sap.f.GridContainerSettings applied for size "L". Range: 1023px - 1439px.
      */
    var layoutL: js.UndefOr[typings.openui5.sapFGridContainerSettingsMod.default] = js.undefined
    
    /**
      * The sap.f.GridContainerSettings applied for size "M". Range: 600px - 1023px.
      */
    var layoutM: js.UndefOr[typings.openui5.sapFGridContainerSettingsMod.default] = js.undefined
    
    /**
      * The sap.f.GridContainerSettings applied for size "S". Range: 375px - 599px.
      */
    var layoutS: js.UndefOr[typings.openui5.sapFGridContainerSettingsMod.default] = js.undefined
    
    /**
      * The sap.f.GridContainerSettings applied for size "XL". Range: from 1440px.
      */
    var layoutXL: js.UndefOr[typings.openui5.sapFGridContainerSettingsMod.default] = js.undefined
    
    /**
      * @EXPERIMENTAL (since 1.71)
      *
      * The sap.f.GridContainerSettings applied for size "XS". Range: up to 374px.
      */
    var layoutXS: js.UndefOr[typings.openui5.sapFGridContainerSettingsMod.default] = js.undefined
    
    /**
      * @EXPERIMENTAL (since 1.81)
      *
      * Defines the minimum height of the grid.
      *
      * Allows an empty grid to be available as a drop target.
      */
    var minHeight: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Should the items stretch to fill the rows that they occupy, or not.
      *
      * If set to `true` the items will stretch.
      */
    var snapToRow: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the width of the control.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object GridContainerSettings {
    
    inline def apply(): GridContainerSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridContainerSettings]
    }
    
    extension [Self <: GridContainerSettings](x: Self) {
      
      inline def setAllowDenseFill(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "allowDenseFill", value.asInstanceOf[js.Any])
      
      inline def setAllowDenseFillUndefined: Self = StObject.set(x, "allowDenseFill", js.undefined)
      
      inline def setAriaDescribedBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAriaDescribedByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaDescribedBy", js.Array(value*))
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setBorderReached(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "borderReached", js.Any.fromFunction1(value))
      
      inline def setBorderReachedUndefined: Self = StObject.set(x, "borderReached", js.undefined)
      
      inline def setColumnsChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "columnsChange", js.Any.fromFunction1(value))
      
      inline def setColumnsChangeUndefined: Self = StObject.set(x, "columnsChange", js.undefined)
      
      inline def setContainerQuery(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "containerQuery", value.asInstanceOf[js.Any])
      
      inline def setContainerQueryUndefined: Self = StObject.set(x, "containerQuery", js.undefined)
      
      inline def setInlineBlockLayout(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "inlineBlockLayout", value.asInstanceOf[js.Any])
      
      inline def setInlineBlockLayoutUndefined: Self = StObject.set(x, "inlineBlockLayout", js.undefined)
      
      inline def setItems(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setLayout(value: typings.openui5.sapFGridContainerSettingsMod.default): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "layoutChange", js.Any.fromFunction1(value))
      
      inline def setLayoutChangeUndefined: Self = StObject.set(x, "layoutChange", js.undefined)
      
      inline def setLayoutL(value: typings.openui5.sapFGridContainerSettingsMod.default): Self = StObject.set(x, "layoutL", value.asInstanceOf[js.Any])
      
      inline def setLayoutLUndefined: Self = StObject.set(x, "layoutL", js.undefined)
      
      inline def setLayoutM(value: typings.openui5.sapFGridContainerSettingsMod.default): Self = StObject.set(x, "layoutM", value.asInstanceOf[js.Any])
      
      inline def setLayoutMUndefined: Self = StObject.set(x, "layoutM", js.undefined)
      
      inline def setLayoutS(value: typings.openui5.sapFGridContainerSettingsMod.default): Self = StObject.set(x, "layoutS", value.asInstanceOf[js.Any])
      
      inline def setLayoutSUndefined: Self = StObject.set(x, "layoutS", js.undefined)
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setLayoutXL(value: typings.openui5.sapFGridContainerSettingsMod.default): Self = StObject.set(x, "layoutXL", value.asInstanceOf[js.Any])
      
      inline def setLayoutXLUndefined: Self = StObject.set(x, "layoutXL", js.undefined)
      
      inline def setLayoutXS(value: typings.openui5.sapFGridContainerSettingsMod.default): Self = StObject.set(x, "layoutXS", value.asInstanceOf[js.Any])
      
      inline def setLayoutXSUndefined: Self = StObject.set(x, "layoutXS", js.undefined)
      
      inline def setMinHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setSnapToRow(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "snapToRow", value.asInstanceOf[js.Any])
      
      inline def setSnapToRowUndefined: Self = StObject.set(x, "snapToRow", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
