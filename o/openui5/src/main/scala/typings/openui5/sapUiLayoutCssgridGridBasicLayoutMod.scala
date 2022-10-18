package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.ManagedObjectSettings
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiLayoutLibraryMod.cssgrid.CSSGridAutoFlow
import typings.openui5.sapUiLayoutLibraryMod.cssgrid.CSSGridGapShortHand
import typings.openui5.sapUiLayoutLibraryMod.cssgrid.CSSGridTrack
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiLayoutCssgridGridBasicLayoutMod {
  
  @JSImport("sap/ui/layout/cssgrid/GridBasicLayout", JSImport.Default)
  @js.native
  /**
    * Constructor for a new GridBasicLayout.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends GridBasicLayout {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: GridBasicLayoutSettings) = this()
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
    mSettings: GridBasicLayoutSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: GridBasicLayoutSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/layout/cssgrid/GridBasicLayout", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.layout.cssgrid.GridBasicLayout with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, GridBasicLayout]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, GridBasicLayout],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.layout.cssgrid.GridBasicLayout.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseManagedObjectMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseManagedObjectMetadataMod.default]
  }
  
  @js.native
  trait GridBasicLayout
    extends typings.openui5.sapUiLayoutCssgridGridLayoutBaseMod.default {
    
    /**
      * Gets current value of property {@link #getGridAutoColumns gridAutoColumns}.
      *
      * Sets the value for the CSS display:grid property {@link https://developer.mozilla.org/en-US/docs/Web/CSS/grid-auto-columns
      * MDN web docs: grid-auto-columns}
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `gridAutoColumns`
      */
    def getGridAutoColumns(): CSSGridTrack = js.native
    
    /**
      * Gets current value of property {@link #getGridAutoFlow gridAutoFlow}.
      *
      * Sets the value for the CSS display:grid property {@link https://developer.mozilla.org/en-US/docs/Web/CSS/grid-auto-flow
      * MDN web docs: grid-auto-flow}
      *
      * Default value is `"Row"`.
      *
      * @returns Value of property `gridAutoFlow`
      */
    def getGridAutoFlow(): CSSGridAutoFlow | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof cssgrid.CSSGridAutoFlow * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getGridAutoRows gridAutoRows}.
      *
      * Sets the value for the CSS display:grid property {@link https://developer.mozilla.org/en-US/docs/Web/CSS/grid-auto-rows
      * MDN web docs: grid-auto-rows}
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `gridAutoRows`
      */
    def getGridAutoRows(): CSSGridTrack = js.native
    
    /**
      * Gets current value of property {@link #getGridColumnGap gridColumnGap}.
      *
      * Sets the value for the CSS display:grid property {@link https://developer.mozilla.org/en-US/docs/Web/CSS/grid-column-gap
      * MDN web docs: grid-column-gap}
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `gridColumnGap`
      */
    def getGridColumnGap(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getGridGap gridGap}.
      *
      * Sets the value for the CSS display:grid property {@link https://developer.mozilla.org/en-US/docs/Web/CSS/grid-gap
      * MDN web docs: grid-gap}
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `gridGap`
      */
    def getGridGap(): CSSGridGapShortHand = js.native
    
    /**
      * Gets current value of property {@link #getGridRowGap gridRowGap}.
      *
      * Sets the value for the CSS display:grid property {@link https://developer.mozilla.org/en-US/docs/Web/CSS/grid-row-gap
      * MDN web docs: grid-row-gap}
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `gridRowGap`
      */
    def getGridRowGap(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getGridTemplateColumns gridTemplateColumns}.
      *
      * Sets the value for the CSS display:grid property {@link https://developer.mozilla.org/en-US/docs/Web/CSS/grid-template-columns
      * MDN web docs: grid-template-columns}
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `gridTemplateColumns`
      */
    def getGridTemplateColumns(): CSSGridTrack = js.native
    
    /**
      * Gets current value of property {@link #getGridTemplateRows gridTemplateRows}.
      *
      * Sets the value for the CSS display:grid property {@link https://developer.mozilla.org/en-US/docs/Web/CSS/grid-template-rows
      * MDN web docs: grid-template-rows}
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `gridTemplateRows`
      */
    def getGridTemplateRows(): CSSGridTrack = js.native
    
    /**
      * Sets a new value for property {@link #getGridAutoColumns gridAutoColumns}.
      *
      * Sets the value for the CSS display:grid property {@link https://developer.mozilla.org/en-US/docs/Web/CSS/grid-auto-columns
      * MDN web docs: grid-auto-columns}
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGridAutoColumns(): this.type = js.native
    def setGridAutoColumns(/**
      * New value for property `gridAutoColumns`
      */
    sGridAutoColumns: CSSGridTrack): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getGridAutoFlow gridAutoFlow}.
      *
      * Sets the value for the CSS display:grid property {@link https://developer.mozilla.org/en-US/docs/Web/CSS/grid-auto-flow
      * MDN web docs: grid-auto-flow}
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"Row"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGridAutoFlow(): this.type = js.native
    def setGridAutoFlow(
      /**
      * New value for property `gridAutoFlow`
      */
    sGridAutoFlow: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof cssgrid.CSSGridAutoFlow * / any */ String
    ): this.type = js.native
    def setGridAutoFlow(/**
      * New value for property `gridAutoFlow`
      */
    sGridAutoFlow: CSSGridAutoFlow): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getGridAutoRows gridAutoRows}.
      *
      * Sets the value for the CSS display:grid property {@link https://developer.mozilla.org/en-US/docs/Web/CSS/grid-auto-rows
      * MDN web docs: grid-auto-rows}
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGridAutoRows(): this.type = js.native
    def setGridAutoRows(/**
      * New value for property `gridAutoRows`
      */
    sGridAutoRows: CSSGridTrack): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getGridColumnGap gridColumnGap}.
      *
      * Sets the value for the CSS display:grid property {@link https://developer.mozilla.org/en-US/docs/Web/CSS/grid-column-gap
      * MDN web docs: grid-column-gap}
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGridColumnGap(): this.type = js.native
    def setGridColumnGap(/**
      * New value for property `gridColumnGap`
      */
    sGridColumnGap: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getGridGap gridGap}.
      *
      * Sets the value for the CSS display:grid property {@link https://developer.mozilla.org/en-US/docs/Web/CSS/grid-gap
      * MDN web docs: grid-gap}
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGridGap(): this.type = js.native
    def setGridGap(/**
      * New value for property `gridGap`
      */
    sGridGap: CSSGridGapShortHand): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getGridRowGap gridRowGap}.
      *
      * Sets the value for the CSS display:grid property {@link https://developer.mozilla.org/en-US/docs/Web/CSS/grid-row-gap
      * MDN web docs: grid-row-gap}
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGridRowGap(): this.type = js.native
    def setGridRowGap(/**
      * New value for property `gridRowGap`
      */
    sGridRowGap: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getGridTemplateColumns gridTemplateColumns}.
      *
      * Sets the value for the CSS display:grid property {@link https://developer.mozilla.org/en-US/docs/Web/CSS/grid-template-columns
      * MDN web docs: grid-template-columns}
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGridTemplateColumns(): this.type = js.native
    def setGridTemplateColumns(/**
      * New value for property `gridTemplateColumns`
      */
    sGridTemplateColumns: CSSGridTrack): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getGridTemplateRows gridTemplateRows}.
      *
      * Sets the value for the CSS display:grid property {@link https://developer.mozilla.org/en-US/docs/Web/CSS/grid-template-rows
      * MDN web docs: grid-template-rows}
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGridTemplateRows(): this.type = js.native
    def setGridTemplateRows(/**
      * New value for property `gridTemplateRows`
      */
    sGridTemplateRows: CSSGridTrack): this.type = js.native
  }
  
  trait GridBasicLayoutSettings
    extends StObject
       with ManagedObjectSettings {
    
    /**
      * Sets the value for the CSS display:grid property {@link https://developer.mozilla.org/en-US/docs/Web/CSS/grid-auto-columns
      * MDN web docs: grid-auto-columns}
      */
    var gridAutoColumns: js.UndefOr[
        CSSGridTrack | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Sets the value for the CSS display:grid property {@link https://developer.mozilla.org/en-US/docs/Web/CSS/grid-auto-flow
      * MDN web docs: grid-auto-flow}
      */
    var gridAutoFlow: js.UndefOr[
        CSSGridAutoFlow | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof cssgrid.CSSGridAutoFlow * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Sets the value for the CSS display:grid property {@link https://developer.mozilla.org/en-US/docs/Web/CSS/grid-auto-rows
      * MDN web docs: grid-auto-rows}
      */
    var gridAutoRows: js.UndefOr[
        CSSGridTrack | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Sets the value for the CSS display:grid property {@link https://developer.mozilla.org/en-US/docs/Web/CSS/grid-column-gap
      * MDN web docs: grid-column-gap}
      */
    var gridColumnGap: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Sets the value for the CSS display:grid property {@link https://developer.mozilla.org/en-US/docs/Web/CSS/grid-gap
      * MDN web docs: grid-gap}
      */
    var gridGap: js.UndefOr[
        CSSGridGapShortHand | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Sets the value for the CSS display:grid property {@link https://developer.mozilla.org/en-US/docs/Web/CSS/grid-row-gap
      * MDN web docs: grid-row-gap}
      */
    var gridRowGap: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Sets the value for the CSS display:grid property {@link https://developer.mozilla.org/en-US/docs/Web/CSS/grid-template-columns
      * MDN web docs: grid-template-columns}
      */
    var gridTemplateColumns: js.UndefOr[
        CSSGridTrack | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Sets the value for the CSS display:grid property {@link https://developer.mozilla.org/en-US/docs/Web/CSS/grid-template-rows
      * MDN web docs: grid-template-rows}
      */
    var gridTemplateRows: js.UndefOr[
        CSSGridTrack | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object GridBasicLayoutSettings {
    
    inline def apply(): GridBasicLayoutSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridBasicLayoutSettings]
    }
    
    extension [Self <: GridBasicLayoutSettings](x: Self) {
      
      inline def setGridAutoColumns(value: CSSGridTrack | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "gridAutoColumns", value.asInstanceOf[js.Any])
      
      inline def setGridAutoColumnsUndefined: Self = StObject.set(x, "gridAutoColumns", js.undefined)
      
      inline def setGridAutoFlow(
        value: CSSGridAutoFlow | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof cssgrid.CSSGridAutoFlow * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "gridAutoFlow", value.asInstanceOf[js.Any])
      
      inline def setGridAutoFlowUndefined: Self = StObject.set(x, "gridAutoFlow", js.undefined)
      
      inline def setGridAutoRows(value: CSSGridTrack | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "gridAutoRows", value.asInstanceOf[js.Any])
      
      inline def setGridAutoRowsUndefined: Self = StObject.set(x, "gridAutoRows", js.undefined)
      
      inline def setGridColumnGap(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "gridColumnGap", value.asInstanceOf[js.Any])
      
      inline def setGridColumnGapUndefined: Self = StObject.set(x, "gridColumnGap", js.undefined)
      
      inline def setGridGap(
        value: CSSGridGapShortHand | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "gridGap", value.asInstanceOf[js.Any])
      
      inline def setGridGapUndefined: Self = StObject.set(x, "gridGap", js.undefined)
      
      inline def setGridRowGap(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "gridRowGap", value.asInstanceOf[js.Any])
      
      inline def setGridRowGapUndefined: Self = StObject.set(x, "gridRowGap", js.undefined)
      
      inline def setGridTemplateColumns(value: CSSGridTrack | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "gridTemplateColumns", value.asInstanceOf[js.Any])
      
      inline def setGridTemplateColumnsUndefined: Self = StObject.set(x, "gridTemplateColumns", js.undefined)
      
      inline def setGridTemplateRows(value: CSSGridTrack | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "gridTemplateRows", value.asInstanceOf[js.Any])
      
      inline def setGridTemplateRowsUndefined: Self = StObject.set(x, "gridTemplateRows", js.undefined)
    }
  }
}
