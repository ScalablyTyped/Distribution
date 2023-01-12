package typings.openui5

import typings.openui5.anon.Layout
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.ManagedObjectSettings
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiLayoutCssgridGridResponsiveLayoutMod {
  
  @JSImport("sap/ui/layout/cssgrid/GridResponsiveLayout", JSImport.Default)
  @js.native
  /**
    * Constructor for a new GridResponsiveLayout.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends GridResponsiveLayout {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: GridResponsiveLayoutSettings) = this()
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
    mSettings: GridResponsiveLayoutSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: GridResponsiveLayoutSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/layout/cssgrid/GridResponsiveLayout", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.layout.cssgrid.GridResponsiveLayout with name `sClassName` and
      * enriches it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.layout.cssgrid.GridLayoutBase.extend}.
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
    oClassInfo: ClassInfo[T, GridResponsiveLayout]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, GridResponsiveLayout],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.layout.cssgrid.GridResponsiveLayout.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseManagedObjectMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseManagedObjectMetadataMod.default]
  }
  
  @js.native
  trait GridResponsiveLayout
    extends typings.openui5.sapUiLayoutCssgridGridLayoutBaseMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:layoutChange layoutChange} event of this `sap.ui.layout.cssgrid.GridResponsiveLayout`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.layout.cssgrid.GridResponsiveLayout` itself.
      *
      * Fired when the currently active GridSettings changes
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
      * Context object to call the event handler with. Defaults to this `sap.ui.layout.cssgrid.GridResponsiveLayout`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:layoutChange layoutChange} event of this `sap.ui.layout.cssgrid.GridResponsiveLayout`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.layout.cssgrid.GridResponsiveLayout` itself.
      *
      * Fired when the currently active GridSettings changes
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
      * Context object to call the event handler with. Defaults to this `sap.ui.layout.cssgrid.GridResponsiveLayout`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    
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
      * Detaches event handler `fnFunction` from the {@link #event:layoutChange layoutChange} event of this `sap.ui.layout.cssgrid.GridResponsiveLayout`.
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
      * Gets current value of property {@link #getContainerQuery containerQuery}.
      *
      * If set to `true`, the current range (large, medium or small) is defined by the size of the container
      * surrounding the `CSSGrid` instead of the device screen size (media Query).
      *
      * Default value is `false`.
      *
      * @returns Value of property `containerQuery`
      */
    def getContainerQuery(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getLayout layout}.
      *
      * The sap.ui.layout.cssgrid.GridSettings applied if no settings are provided for a specific size
      */
    def getLayout(): typings.openui5.sapUiLayoutCssgridGridSettingsMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getLayoutL layoutL}.
      *
      * The sap.ui.layout.cssgrid.GridSettings applied for size "L"
      */
    def getLayoutL(): typings.openui5.sapUiLayoutCssgridGridSettingsMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getLayoutM layoutM}.
      *
      * The sap.ui.layout.cssgrid.GridSettings applied for size "M"
      */
    def getLayoutM(): typings.openui5.sapUiLayoutCssgridGridSettingsMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getLayoutS layoutS}.
      *
      * The sap.ui.layout.cssgrid.GridSettings applied for size "S"
      */
    def getLayoutS(): typings.openui5.sapUiLayoutCssgridGridSettingsMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getLayoutXL layoutXL}.
      *
      * The sap.ui.layout.cssgrid.GridSettings applied for size "XL"
      */
    def getLayoutXL(): typings.openui5.sapUiLayoutCssgridGridSettingsMod.default = js.native
    
    /**
      * Sets a new value for property {@link #getContainerQuery containerQuery}.
      *
      * If set to `true`, the current range (large, medium or small) is defined by the size of the container
      * surrounding the `CSSGrid` instead of the device screen size (media Query).
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
      * Sets the aggregated {@link #getLayout layout}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLayout(/**
      * The layout to set
      */
    oLayout: typings.openui5.sapUiLayoutCssgridGridSettingsMod.default): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getLayoutL layoutL}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLayoutL(
      /**
      * The layoutL to set
      */
    oLayoutL: typings.openui5.sapUiLayoutCssgridGridSettingsMod.default
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getLayoutM layoutM}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLayoutM(
      /**
      * The layoutM to set
      */
    oLayoutM: typings.openui5.sapUiLayoutCssgridGridSettingsMod.default
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getLayoutS layoutS}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLayoutS(
      /**
      * The layoutS to set
      */
    oLayoutS: typings.openui5.sapUiLayoutCssgridGridSettingsMod.default
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getLayoutXL layoutXL}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLayoutXL(
      /**
      * The layoutXL to set
      */
    oLayoutXL: typings.openui5.sapUiLayoutCssgridGridSettingsMod.default
    ): this.type = js.native
  }
  
  trait GridResponsiveLayoutSettings
    extends StObject
       with ManagedObjectSettings {
    
    /**
      * If set to `true`, the current range (large, medium or small) is defined by the size of the container
      * surrounding the `CSSGrid` instead of the device screen size (media Query).
      */
    var containerQuery: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The sap.ui.layout.cssgrid.GridSettings applied if no settings are provided for a specific size
      */
    var layout: js.UndefOr[typings.openui5.sapUiLayoutCssgridGridSettingsMod.default] = js.undefined
    
    /**
      * Fired when the currently active GridSettings changes
      */
    var layoutChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * The sap.ui.layout.cssgrid.GridSettings applied for size "L"
      */
    var layoutL: js.UndefOr[typings.openui5.sapUiLayoutCssgridGridSettingsMod.default] = js.undefined
    
    /**
      * The sap.ui.layout.cssgrid.GridSettings applied for size "M"
      */
    var layoutM: js.UndefOr[typings.openui5.sapUiLayoutCssgridGridSettingsMod.default] = js.undefined
    
    /**
      * The sap.ui.layout.cssgrid.GridSettings applied for size "S"
      */
    var layoutS: js.UndefOr[typings.openui5.sapUiLayoutCssgridGridSettingsMod.default] = js.undefined
    
    /**
      * The sap.ui.layout.cssgrid.GridSettings applied for size "XL"
      */
    var layoutXL: js.UndefOr[typings.openui5.sapUiLayoutCssgridGridSettingsMod.default] = js.undefined
  }
  object GridResponsiveLayoutSettings {
    
    inline def apply(): GridResponsiveLayoutSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridResponsiveLayoutSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GridResponsiveLayoutSettings] (val x: Self) extends AnyVal {
      
      inline def setContainerQuery(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "containerQuery", value.asInstanceOf[js.Any])
      
      inline def setContainerQueryUndefined: Self = StObject.set(x, "containerQuery", js.undefined)
      
      inline def setLayout(value: typings.openui5.sapUiLayoutCssgridGridSettingsMod.default): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "layoutChange", js.Any.fromFunction1(value))
      
      inline def setLayoutChangeUndefined: Self = StObject.set(x, "layoutChange", js.undefined)
      
      inline def setLayoutL(value: typings.openui5.sapUiLayoutCssgridGridSettingsMod.default): Self = StObject.set(x, "layoutL", value.asInstanceOf[js.Any])
      
      inline def setLayoutLUndefined: Self = StObject.set(x, "layoutL", js.undefined)
      
      inline def setLayoutM(value: typings.openui5.sapUiLayoutCssgridGridSettingsMod.default): Self = StObject.set(x, "layoutM", value.asInstanceOf[js.Any])
      
      inline def setLayoutMUndefined: Self = StObject.set(x, "layoutM", js.undefined)
      
      inline def setLayoutS(value: typings.openui5.sapUiLayoutCssgridGridSettingsMod.default): Self = StObject.set(x, "layoutS", value.asInstanceOf[js.Any])
      
      inline def setLayoutSUndefined: Self = StObject.set(x, "layoutS", js.undefined)
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setLayoutXL(value: typings.openui5.sapUiLayoutCssgridGridSettingsMod.default): Self = StObject.set(x, "layoutXL", value.asInstanceOf[js.Any])
      
      inline def setLayoutXLUndefined: Self = StObject.set(x, "layoutXL", js.undefined)
    }
  }
}
