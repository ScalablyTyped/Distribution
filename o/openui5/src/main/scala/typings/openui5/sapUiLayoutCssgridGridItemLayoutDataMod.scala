package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.openui5.sapUiLayoutLibraryMod.cssgrid.CSSGridLine
import typings.openui5.sapUiLayoutLibraryMod.cssgrid.IGridItemLayoutData
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiLayoutCssgridGridItemLayoutDataMod {
  
  @JSImport("sap/ui/layout/cssgrid/GridItemLayoutData", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `sap.ui.layout.cssgrid.GridItemLayoutData`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends GridItemLayoutData {
    def this(/**
      * Initial settings for the new element.
      */
    mSettings: GridItemLayoutDataSettings) = this()
    def this(/**
      * ID for the new element, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new element, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the new element.
      */
    mSettings: GridItemLayoutDataSettings
    ) = this()
    def this(
      /**
      * ID for the new element, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new element.
      */
    mSettings: GridItemLayoutDataSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_layout_cssgrid_IGridItemLayoutData: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/layout/cssgrid/GridItemLayoutData", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.layout.cssgrid.GridItemLayoutData with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.LayoutData.extend}.
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
    oClassInfo: ClassInfo[T, GridItemLayoutData]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, GridItemLayoutData],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.layout.cssgrid.GridItemLayoutData.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait GridItemLayoutData
    extends typings.openui5.sapUiCoreLayoutDataMod.default
       with IGridItemLayoutData {
    
    /**
      * Gets current value of property {@link #getGridColumn gridColumn}.
      *
      * Sets the value for the CSS display:grid item property grid-column {@link https://developer.mozilla.org/en-US/docs/Web/CSS/grid-column
      * MDN web docs: grid-column}
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `gridColumn`
      */
    def getGridColumn(): CSSGridLine = js.native
    
    /**
      * Gets current value of property {@link #getGridColumnEnd gridColumnEnd}.
      *
      * Sets the value for the CSS display:grid item property grid-column-end {@link https://developer.mozilla.org/en-US/docs/Web/CSS/grid-column-end
      * MDN web docs: grid-column-end}
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `gridColumnEnd`
      */
    def getGridColumnEnd(): CSSGridLine = js.native
    
    /**
      * Gets current value of property {@link #getGridColumnStart gridColumnStart}.
      *
      * Sets the value for the CSS display:grid item property grid-column-start {@link https://developer.mozilla.org/en-US/docs/Web/CSS/grid-column-start
      * MDN web docs: grid-column-start}
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `gridColumnStart`
      */
    def getGridColumnStart(): CSSGridLine = js.native
    
    /**
      * Gets current value of property {@link #getGridRow gridRow}.
      *
      * Sets the value for the CSS display:grid item property grid-row {@link https://developer.mozilla.org/en-US/docs/Web/CSS/grid-row
      * MDN web docs: grid-row}
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `gridRow`
      */
    def getGridRow(): CSSGridLine = js.native
    
    /**
      * Gets current value of property {@link #getGridRowEnd gridRowEnd}.
      *
      * Sets the value for the CSS display:grid item property grid-row-end {@link https://developer.mozilla.org/en-US/docs/Web/CSS/grid-row-end
      * MDN web docs: grid-row-end}
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `gridRowEnd`
      */
    def getGridRowEnd(): CSSGridLine = js.native
    
    /**
      * Gets current value of property {@link #getGridRowStart gridRowStart}.
      *
      * Sets the value for the CSS display:grid item property grid-row-start {@link https://developer.mozilla.org/en-US/docs/Web/CSS/grid-row-start
      * MDN web docs: grid-row-start}
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `gridRowStart`
      */
    def getGridRowStart(): CSSGridLine = js.native
    
    /**
      * Sets a new value for property {@link #getGridColumn gridColumn}.
      *
      * Sets the value for the CSS display:grid item property grid-column {@link https://developer.mozilla.org/en-US/docs/Web/CSS/grid-column
      * MDN web docs: grid-column}
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGridColumn(): this.type = js.native
    def setGridColumn(/**
      * New value for property `gridColumn`
      */
    sGridColumn: CSSGridLine): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getGridColumnEnd gridColumnEnd}.
      *
      * Sets the value for the CSS display:grid item property grid-column-end {@link https://developer.mozilla.org/en-US/docs/Web/CSS/grid-column-end
      * MDN web docs: grid-column-end}
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGridColumnEnd(): this.type = js.native
    def setGridColumnEnd(/**
      * New value for property `gridColumnEnd`
      */
    sGridColumnEnd: CSSGridLine): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getGridColumnStart gridColumnStart}.
      *
      * Sets the value for the CSS display:grid item property grid-column-start {@link https://developer.mozilla.org/en-US/docs/Web/CSS/grid-column-start
      * MDN web docs: grid-column-start}
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGridColumnStart(): this.type = js.native
    def setGridColumnStart(/**
      * New value for property `gridColumnStart`
      */
    sGridColumnStart: CSSGridLine): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getGridRow gridRow}.
      *
      * Sets the value for the CSS display:grid item property grid-row {@link https://developer.mozilla.org/en-US/docs/Web/CSS/grid-row
      * MDN web docs: grid-row}
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGridRow(): this.type = js.native
    def setGridRow(/**
      * New value for property `gridRow`
      */
    sGridRow: CSSGridLine): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getGridRowEnd gridRowEnd}.
      *
      * Sets the value for the CSS display:grid item property grid-row-end {@link https://developer.mozilla.org/en-US/docs/Web/CSS/grid-row-end
      * MDN web docs: grid-row-end}
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGridRowEnd(): this.type = js.native
    def setGridRowEnd(/**
      * New value for property `gridRowEnd`
      */
    sGridRowEnd: CSSGridLine): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getGridRowStart gridRowStart}.
      *
      * Sets the value for the CSS display:grid item property grid-row-start {@link https://developer.mozilla.org/en-US/docs/Web/CSS/grid-row-start
      * MDN web docs: grid-row-start}
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGridRowStart(): this.type = js.native
    def setGridRowStart(/**
      * New value for property `gridRowStart`
      */
    sGridRowStart: CSSGridLine): this.type = js.native
  }
  
  trait GridItemLayoutDataSettings
    extends StObject
       with ElementSettings {
    
    /**
      * Sets the value for the CSS display:grid item property grid-column {@link https://developer.mozilla.org/en-US/docs/Web/CSS/grid-column
      * MDN web docs: grid-column}
      */
    var gridColumn: js.UndefOr[
        CSSGridLine | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Sets the value for the CSS display:grid item property grid-column-end {@link https://developer.mozilla.org/en-US/docs/Web/CSS/grid-column-end
      * MDN web docs: grid-column-end}
      */
    var gridColumnEnd: js.UndefOr[
        CSSGridLine | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Sets the value for the CSS display:grid item property grid-column-start {@link https://developer.mozilla.org/en-US/docs/Web/CSS/grid-column-start
      * MDN web docs: grid-column-start}
      */
    var gridColumnStart: js.UndefOr[
        CSSGridLine | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Sets the value for the CSS display:grid item property grid-row {@link https://developer.mozilla.org/en-US/docs/Web/CSS/grid-row
      * MDN web docs: grid-row}
      */
    var gridRow: js.UndefOr[
        CSSGridLine | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Sets the value for the CSS display:grid item property grid-row-end {@link https://developer.mozilla.org/en-US/docs/Web/CSS/grid-row-end
      * MDN web docs: grid-row-end}
      */
    var gridRowEnd: js.UndefOr[
        CSSGridLine | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Sets the value for the CSS display:grid item property grid-row-start {@link https://developer.mozilla.org/en-US/docs/Web/CSS/grid-row-start
      * MDN web docs: grid-row-start}
      */
    var gridRowStart: js.UndefOr[
        CSSGridLine | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object GridItemLayoutDataSettings {
    
    inline def apply(): GridItemLayoutDataSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridItemLayoutDataSettings]
    }
    
    extension [Self <: GridItemLayoutDataSettings](x: Self) {
      
      inline def setGridColumn(value: CSSGridLine | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "gridColumn", value.asInstanceOf[js.Any])
      
      inline def setGridColumnEnd(value: CSSGridLine | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "gridColumnEnd", value.asInstanceOf[js.Any])
      
      inline def setGridColumnEndUndefined: Self = StObject.set(x, "gridColumnEnd", js.undefined)
      
      inline def setGridColumnStart(value: CSSGridLine | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "gridColumnStart", value.asInstanceOf[js.Any])
      
      inline def setGridColumnStartUndefined: Self = StObject.set(x, "gridColumnStart", js.undefined)
      
      inline def setGridColumnUndefined: Self = StObject.set(x, "gridColumn", js.undefined)
      
      inline def setGridRow(value: CSSGridLine | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "gridRow", value.asInstanceOf[js.Any])
      
      inline def setGridRowEnd(value: CSSGridLine | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "gridRowEnd", value.asInstanceOf[js.Any])
      
      inline def setGridRowEndUndefined: Self = StObject.set(x, "gridRowEnd", js.undefined)
      
      inline def setGridRowStart(value: CSSGridLine | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "gridRowStart", value.asInstanceOf[js.Any])
      
      inline def setGridRowStartUndefined: Self = StObject.set(x, "gridRowStart", js.undefined)
      
      inline def setGridRowUndefined: Self = StObject.set(x, "gridRow", js.undefined)
    }
  }
}
