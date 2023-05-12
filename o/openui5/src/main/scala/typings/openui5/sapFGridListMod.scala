package typings.openui5

import typings.openui5.anon.Column
import typings.openui5.sap.ClassInfo
import typings.openui5.sapFLibraryMod.NavigationDirection
import typings.openui5.sapFLibraryMod.dnd.IGridDroppable
import typings.openui5.sapMListBaseMod.ListBaseSettings
import typings.openui5.sapUiLayoutLibraryMod.cssgrid.IGridConfigurable
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapFGridListMod {
  
  @JSImport("sap/f/GridList", JSImport.Default)
  @js.native
  /**
    * Constructor for a new GridList.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link topic:32d4b9c2b981425dbc374d3e9d5d0c2e Grid Controls}
    * 	{@link https://developer.mozilla.org/en-US/docs/Web/CSS/CSS_Grid_Layout MDN web docs: CSS Grid Layout}
    */
  open class default () extends GridList {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: GridListSettings) = this()
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
    mSettings: GridListSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: GridListSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_f_dnd_IGridDroppable: Boolean = js.native
    
    /* CompleteClass */
    var __implements__sap_ui_layout_cssgrid_IGridConfigurable: Boolean = js.native
    
    /**
      * @SINCE 1.60.0
      *
      * The function is used by GridLayoutDelegate to determine on which HTML Elements the display:grid styles
      * should be applied
      *
      * @returns The controls or HTML elements on which display:grid styles should be applied
      */
    /* CompleteClass */
    override def getGridDomRefs(): js.Array[HTMLElement | typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * @SINCE 1.60.0
      *
      * The function is used by GridLayoutDelegate to get the grid layout (display:grid styles) to apply
      *
      * @returns The display:grid layout to apply
      */
    /* CompleteClass */
    override def getGridLayoutConfiguration(): typings.openui5.sapUiLayoutCssgridGridLayoutBaseMod.default = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/f/GridList", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.f.GridList with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.ListBase.extend}.
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
    oClassInfo: ClassInfo[T, GridList]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, GridList],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.f.GridList.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait GridList
    extends typings.openui5.sapMListBaseMod.default
       with IGridConfigurable
       with IGridDroppable {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:borderReached borderReached} event of this `sap.f.GridList`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.GridList` itself.
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
      * Context object to call the event handler with. Defaults to this `sap.f.GridList` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:borderReached borderReached} event of this `sap.f.GridList`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.GridList` itself.
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
      * Context object to call the event handler with. Defaults to this `sap.f.GridList` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys the customLayout in the aggregation {@link #getCustomLayout customLayout}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyCustomLayout(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:borderReached borderReached} event of this
      * `sap.f.GridList`.
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
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:borderReached borderReached} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireBorderReached(): this.type = js.native
    def fireBorderReached(/**
      * Parameters to pass along with the event
      */
    mParameters: Column): this.type = js.native
    
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
      * @EXPERIMENTAL (since 1.87) - Behavior might change.
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
      * **Note:**Should be called after the rendering of `GridList` is ready.
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
      * Gets content of aggregation {@link #getCustomLayout customLayout}.
      *
      * Defines a custom grid layout
      */
    def getCustomLayout(): typings.openui5.sapUiLayoutCssgridGridLayoutBaseMod.default = js.native
    
    /**
      * Sets the aggregated {@link #getCustomLayout customLayout}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCustomLayout(
      /**
      * The customLayout to set
      */
    oCustomLayout: typings.openui5.sapUiLayoutCssgridGridLayoutBaseMod.default
    ): this.type = js.native
  }
  
  trait GridListSettings
    extends StObject
       with ListBaseSettings {
    
    /**
      * Fires if the border of the visualizations is reached so that an application can react on this.
      */
    var borderReached: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines a custom grid layout
      */
    var customLayout: js.UndefOr[typings.openui5.sapUiLayoutCssgridGridLayoutBaseMod.default] = js.undefined
  }
  object GridListSettings {
    
    inline def apply(): GridListSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridListSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GridListSettings] (val x: Self) extends AnyVal {
      
      inline def setBorderReached(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "borderReached", js.Any.fromFunction1(value))
      
      inline def setBorderReachedUndefined: Self = StObject.set(x, "borderReached", js.undefined)
      
      inline def setCustomLayout(value: typings.openui5.sapUiLayoutCssgridGridLayoutBaseMod.default): Self = StObject.set(x, "customLayout", value.asInstanceOf[js.Any])
      
      inline def setCustomLayoutUndefined: Self = StObject.set(x, "customLayout", js.undefined)
    }
  }
}
