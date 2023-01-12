package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiLayoutFormFormLayoutMod.FormLayoutSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiLayoutFormResponsiveGridLayoutMod {
  
  @JSImport("sap/ui/layout/form/ResponsiveGridLayout", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `sap.ui.layout.form.ResponsiveGridLayout`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ResponsiveGridLayout {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ResponsiveGridLayoutSettings) = this()
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
    mSettings: ResponsiveGridLayoutSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ResponsiveGridLayoutSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/layout/form/ResponsiveGridLayout", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.layout.form.ResponsiveGridLayout with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.layout.form.FormLayout.extend}.
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
    oClassInfo: ClassInfo[T, ResponsiveGridLayout]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ResponsiveGridLayout],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.layout.form.ResponsiveGridLayout.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ResponsiveGridLayout
    extends typings.openui5.sapUiLayoutFormFormLayoutMod.default {
    
    /**
      * @SINCE 1.34.0
      *
      * Gets current value of property {@link #getAdjustLabelSpan adjustLabelSpan}.
      *
      * If set, the usage of `labelSpanL` and `labelSpanM` are dependent on the number of `FormContainers` in
      * one row. If only one `FormContainer` is displayed in one row, `labelSpanM` is used to define the size
      * of the label. This is the same for medium and large `Forms`. This is done to align the labels on forms
      * where full-size `FormContainers` and multiple-column rows are used in the same `Form` (because every
      * `FormContainer` has its own `Grid` inside).
      *
      * If not set, the usage of `labelSpanL` and `labelSpanM` are dependent on the `Form` size. The number of
      * `FormContainers` doesn't matter in this case.
      *
      * Default value is `true`.
      *
      * @returns Value of property `adjustLabelSpan`
      */
    def getAdjustLabelSpan(): Boolean = js.native
    
    /**
      * @SINCE 1.16.3
      *
      * Gets current value of property {@link #getBreakpointL breakpointL}.
      *
      * Breakpoint (in pixel) between Medium size and Large size.
      *
      * Default value is `1024`.
      *
      * @returns Value of property `breakpointL`
      */
    def getBreakpointL(): int = js.native
    
    /**
      * @SINCE 1.16.3
      *
      * Gets current value of property {@link #getBreakpointM breakpointM}.
      *
      * Breakpoint (in pixel) between Small size and Medium size.
      *
      * Default value is `600`.
      *
      * @returns Value of property `breakpointM`
      */
    def getBreakpointM(): int = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Gets current value of property {@link #getBreakpointXL breakpointXL}.
      *
      * Breakpoint (in pixel) between large size and extra large (XL) size.
      *
      * Default value is `1440`.
      *
      * @returns Value of property `breakpointXL`
      */
    def getBreakpointXL(): int = js.native
    
    /**
      * @SINCE 1.16.3
      *
      * Gets current value of property {@link #getColumnsL columnsL}.
      *
      * Number of columns for large size.
      *
      * The number of columns for large size must not be smaller than the number of columns for medium size.
      *
      * Default value is `2`.
      *
      * @returns Value of property `columnsL`
      */
    def getColumnsL(): int = js.native
    
    /**
      * @SINCE 1.16.3
      *
      * Gets current value of property {@link #getColumnsM columnsM}.
      *
      * Number of columns for medium size.
      *
      * Default value is `1`.
      *
      * @returns Value of property `columnsM`
      */
    def getColumnsM(): int = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Gets current value of property {@link #getColumnsXL columnsXL}.
      *
      * Number of columns for extra large size.
      *
      * The number of columns for extra large size must not be smaller than the number of columns for large size.
      * **Note:** If the default value -1 is not overwritten with the meaningful one then the `columnsL` value
      * is used (from the backward compatibility reasons).
      *
      * Default value is `-1`.
      *
      * @returns Value of property `columnsXL`
      */
    def getColumnsXL(): int = js.native
    
    /**
      * @SINCE 1.16.3
      *
      * Gets current value of property {@link #getEmptySpanL emptySpanL}.
      *
      * Number of grid cells that are empty at the end of each line on large size.
      *
      * Default value is `0`.
      *
      * @returns Value of property `emptySpanL`
      */
    def getEmptySpanL(): int = js.native
    
    /**
      * @SINCE 1.16.3
      *
      * Gets current value of property {@link #getEmptySpanM emptySpanM}.
      *
      * Number of grid cells that are empty at the end of each line on medium size.
      *
      * Default value is `0`.
      *
      * @returns Value of property `emptySpanM`
      */
    def getEmptySpanM(): int = js.native
    
    /**
      * @SINCE 1.16.3
      *
      * Gets current value of property {@link #getEmptySpanS emptySpanS}.
      *
      * Number of grid cells that are empty at the end of each line on small size.
      *
      * Default value is `0`.
      *
      * @returns Value of property `emptySpanS`
      */
    def getEmptySpanS(): int = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Gets current value of property {@link #getEmptySpanXL emptySpanXL}.
      *
      * Number of grid cells that are empty at the end of each line on extra large size.
      *
      * **Note:** If the default value -1 is not overwritten with the meaningful one then the `emptySpanL` value
      * is used.
      *
      * Default value is `-1`.
      *
      * @returns Value of property `emptySpanXL`
      */
    def getEmptySpanXL(): int = js.native
    
    /**
      * @SINCE 1.16.3
      *
      * Gets current value of property {@link #getLabelSpanL labelSpanL}.
      *
      * Default span for labels in large size.
      *
      * **Note:** If `adjustLabelSpan` is set, this property is only used if more than 1 `FormContainer` is in
      * one line. If only 1 `FormContainer` is in the line, then the `labelSpanM` value is used.
      *
      * Default value is `4`.
      *
      * @returns Value of property `labelSpanL`
      */
    def getLabelSpanL(): int = js.native
    
    /**
      * @SINCE 1.16.3
      *
      * Gets current value of property {@link #getLabelSpanM labelSpanM}.
      *
      * Default span for labels in medium size.
      *
      * **Note:** If `adjustLabelSpan` is set this property is used for full-size `FormContainers`. If more than
      * one `FormContainer` is in one line, `labelSpanL` is used.
      *
      * Default value is `2`.
      *
      * @returns Value of property `labelSpanM`
      */
    def getLabelSpanM(): int = js.native
    
    /**
      * @SINCE 1.16.3
      *
      * Gets current value of property {@link #getLabelSpanS labelSpanS}.
      *
      * Default span for labels in small size.
      *
      * Default value is `12`.
      *
      * @returns Value of property `labelSpanS`
      */
    def getLabelSpanS(): int = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Gets current value of property {@link #getLabelSpanXL labelSpanXL}.
      *
      * Default span for labels in extra large size.
      *
      * **Note:** If the default value -1 is not overwritten with the meaningful one then the `labelSpanL` value
      * is used.
      *
      * Default value is `-1`.
      *
      * @returns Value of property `labelSpanXL`
      */
    def getLabelSpanXL(): int = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Gets current value of property {@link #getSingleContainerFullSize singleContainerFullSize}.
      *
      * If the `Form` contains only one single `FormContainer` and this property is set, the `FormContainer`
      * is displayed using the full size of the `Form`. In this case the properties `columnsXL`, `columnsL` and
      * `columnsM` are ignored.
      *
      * In all other cases the `FormContainer` is displayed in the size of one column.
      *
      * Default value is `true`.
      *
      * @returns Value of property `singleContainerFullSize`
      */
    def getSingleContainerFullSize(): Boolean = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Sets a new value for property {@link #getAdjustLabelSpan adjustLabelSpan}.
      *
      * If set, the usage of `labelSpanL` and `labelSpanM` are dependent on the number of `FormContainers` in
      * one row. If only one `FormContainer` is displayed in one row, `labelSpanM` is used to define the size
      * of the label. This is the same for medium and large `Forms`. This is done to align the labels on forms
      * where full-size `FormContainers` and multiple-column rows are used in the same `Form` (because every
      * `FormContainer` has its own `Grid` inside).
      *
      * If not set, the usage of `labelSpanL` and `labelSpanM` are dependent on the `Form` size. The number of
      * `FormContainers` doesn't matter in this case.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAdjustLabelSpan(): this.type = js.native
    def setAdjustLabelSpan(/**
      * New value for property `adjustLabelSpan`
      */
    bAdjustLabelSpan: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.16.3
      *
      * Sets a new value for property {@link #getBreakpointL breakpointL}.
      *
      * Breakpoint (in pixel) between Medium size and Large size.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `1024`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBreakpointL(): this.type = js.native
    def setBreakpointL(/**
      * New value for property `breakpointL`
      */
    iBreakpointL: int): this.type = js.native
    
    /**
      * @SINCE 1.16.3
      *
      * Sets a new value for property {@link #getBreakpointM breakpointM}.
      *
      * Breakpoint (in pixel) between Small size and Medium size.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `600`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBreakpointM(): this.type = js.native
    def setBreakpointM(/**
      * New value for property `breakpointM`
      */
    iBreakpointM: int): this.type = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Sets a new value for property {@link #getBreakpointXL breakpointXL}.
      *
      * Breakpoint (in pixel) between large size and extra large (XL) size.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `1440`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBreakpointXL(): this.type = js.native
    def setBreakpointXL(/**
      * New value for property `breakpointXL`
      */
    iBreakpointXL: int): this.type = js.native
    
    /**
      * @SINCE 1.16.3
      *
      * Sets a new value for property {@link #getColumnsL columnsL}.
      *
      * Number of columns for large size.
      *
      * The number of columns for large size must not be smaller than the number of columns for medium size.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `2`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setColumnsL(): this.type = js.native
    def setColumnsL(/**
      * New value for property `columnsL`
      */
    iColumnsL: int): this.type = js.native
    
    /**
      * @SINCE 1.16.3
      *
      * Sets a new value for property {@link #getColumnsM columnsM}.
      *
      * Number of columns for medium size.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `1`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setColumnsM(): this.type = js.native
    def setColumnsM(/**
      * New value for property `columnsM`
      */
    iColumnsM: int): this.type = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Sets a new value for property {@link #getColumnsXL columnsXL}.
      *
      * Number of columns for extra large size.
      *
      * The number of columns for extra large size must not be smaller than the number of columns for large size.
      * **Note:** If the default value -1 is not overwritten with the meaningful one then the `columnsL` value
      * is used (from the backward compatibility reasons).
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `-1`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setColumnsXL(): this.type = js.native
    def setColumnsXL(/**
      * New value for property `columnsXL`
      */
    iColumnsXL: int): this.type = js.native
    
    /**
      * @SINCE 1.16.3
      *
      * Sets a new value for property {@link #getEmptySpanL emptySpanL}.
      *
      * Number of grid cells that are empty at the end of each line on large size.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `0`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEmptySpanL(): this.type = js.native
    def setEmptySpanL(/**
      * New value for property `emptySpanL`
      */
    iEmptySpanL: int): this.type = js.native
    
    /**
      * @SINCE 1.16.3
      *
      * Sets a new value for property {@link #getEmptySpanM emptySpanM}.
      *
      * Number of grid cells that are empty at the end of each line on medium size.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `0`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEmptySpanM(): this.type = js.native
    def setEmptySpanM(/**
      * New value for property `emptySpanM`
      */
    iEmptySpanM: int): this.type = js.native
    
    /**
      * @SINCE 1.16.3
      *
      * Sets a new value for property {@link #getEmptySpanS emptySpanS}.
      *
      * Number of grid cells that are empty at the end of each line on small size.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `0`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEmptySpanS(): this.type = js.native
    def setEmptySpanS(/**
      * New value for property `emptySpanS`
      */
    iEmptySpanS: int): this.type = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Sets a new value for property {@link #getEmptySpanXL emptySpanXL}.
      *
      * Number of grid cells that are empty at the end of each line on extra large size.
      *
      * **Note:** If the default value -1 is not overwritten with the meaningful one then the `emptySpanL` value
      * is used.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `-1`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEmptySpanXL(): this.type = js.native
    def setEmptySpanXL(/**
      * New value for property `emptySpanXL`
      */
    iEmptySpanXL: int): this.type = js.native
    
    /**
      * @SINCE 1.16.3
      *
      * Sets a new value for property {@link #getLabelSpanL labelSpanL}.
      *
      * Default span for labels in large size.
      *
      * **Note:** If `adjustLabelSpan` is set, this property is only used if more than 1 `FormContainer` is in
      * one line. If only 1 `FormContainer` is in the line, then the `labelSpanM` value is used.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `4`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLabelSpanL(): this.type = js.native
    def setLabelSpanL(/**
      * New value for property `labelSpanL`
      */
    iLabelSpanL: int): this.type = js.native
    
    /**
      * @SINCE 1.16.3
      *
      * Sets a new value for property {@link #getLabelSpanM labelSpanM}.
      *
      * Default span for labels in medium size.
      *
      * **Note:** If `adjustLabelSpan` is set this property is used for full-size `FormContainers`. If more than
      * one `FormContainer` is in one line, `labelSpanL` is used.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `2`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLabelSpanM(): this.type = js.native
    def setLabelSpanM(/**
      * New value for property `labelSpanM`
      */
    iLabelSpanM: int): this.type = js.native
    
    /**
      * @SINCE 1.16.3
      *
      * Sets a new value for property {@link #getLabelSpanS labelSpanS}.
      *
      * Default span for labels in small size.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `12`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLabelSpanS(): this.type = js.native
    def setLabelSpanS(/**
      * New value for property `labelSpanS`
      */
    iLabelSpanS: int): this.type = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Sets a new value for property {@link #getLabelSpanXL labelSpanXL}.
      *
      * Default span for labels in extra large size.
      *
      * **Note:** If the default value -1 is not overwritten with the meaningful one then the `labelSpanL` value
      * is used.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `-1`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLabelSpanXL(): this.type = js.native
    def setLabelSpanXL(/**
      * New value for property `labelSpanXL`
      */
    iLabelSpanXL: int): this.type = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Sets a new value for property {@link #getSingleContainerFullSize singleContainerFullSize}.
      *
      * If the `Form` contains only one single `FormContainer` and this property is set, the `FormContainer`
      * is displayed using the full size of the `Form`. In this case the properties `columnsXL`, `columnsL` and
      * `columnsM` are ignored.
      *
      * In all other cases the `FormContainer` is displayed in the size of one column.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSingleContainerFullSize(): this.type = js.native
    def setSingleContainerFullSize(/**
      * New value for property `singleContainerFullSize`
      */
    bSingleContainerFullSize: Boolean): this.type = js.native
  }
  
  trait ResponsiveGridLayoutSettings
    extends StObject
       with FormLayoutSettings {
    
    /**
      * @SINCE 1.34.0
      *
      * If set, the usage of `labelSpanL` and `labelSpanM` are dependent on the number of `FormContainers` in
      * one row. If only one `FormContainer` is displayed in one row, `labelSpanM` is used to define the size
      * of the label. This is the same for medium and large `Forms`. This is done to align the labels on forms
      * where full-size `FormContainers` and multiple-column rows are used in the same `Form` (because every
      * `FormContainer` has its own `Grid` inside).
      *
      * If not set, the usage of `labelSpanL` and `labelSpanM` are dependent on the `Form` size. The number of
      * `FormContainers` doesn't matter in this case.
      */
    var adjustLabelSpan: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.16.3
      *
      * Breakpoint (in pixel) between Medium size and Large size.
      */
    var breakpointL: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.16.3
      *
      * Breakpoint (in pixel) between Small size and Medium size.
      */
    var breakpointM: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.34.0
      *
      * Breakpoint (in pixel) between large size and extra large (XL) size.
      */
    var breakpointXL: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.16.3
      *
      * Number of columns for large size.
      *
      * The number of columns for large size must not be smaller than the number of columns for medium size.
      */
    var columnsL: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.16.3
      *
      * Number of columns for medium size.
      */
    var columnsM: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.34.0
      *
      * Number of columns for extra large size.
      *
      * The number of columns for extra large size must not be smaller than the number of columns for large size.
      * **Note:** If the default value -1 is not overwritten with the meaningful one then the `columnsL` value
      * is used (from the backward compatibility reasons).
      */
    var columnsXL: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.16.3
      *
      * Number of grid cells that are empty at the end of each line on large size.
      */
    var emptySpanL: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.16.3
      *
      * Number of grid cells that are empty at the end of each line on medium size.
      */
    var emptySpanM: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.16.3
      *
      * Number of grid cells that are empty at the end of each line on small size.
      */
    var emptySpanS: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.34.0
      *
      * Number of grid cells that are empty at the end of each line on extra large size.
      *
      * **Note:** If the default value -1 is not overwritten with the meaningful one then the `emptySpanL` value
      * is used.
      */
    var emptySpanXL: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.16.3
      *
      * Default span for labels in large size.
      *
      * **Note:** If `adjustLabelSpan` is set, this property is only used if more than 1 `FormContainer` is in
      * one line. If only 1 `FormContainer` is in the line, then the `labelSpanM` value is used.
      */
    var labelSpanL: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.16.3
      *
      * Default span for labels in medium size.
      *
      * **Note:** If `adjustLabelSpan` is set this property is used for full-size `FormContainers`. If more than
      * one `FormContainer` is in one line, `labelSpanL` is used.
      */
    var labelSpanM: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.16.3
      *
      * Default span for labels in small size.
      */
    var labelSpanS: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.34.0
      *
      * Default span for labels in extra large size.
      *
      * **Note:** If the default value -1 is not overwritten with the meaningful one then the `labelSpanL` value
      * is used.
      */
    var labelSpanXL: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.34.0
      *
      * If the `Form` contains only one single `FormContainer` and this property is set, the `FormContainer`
      * is displayed using the full size of the `Form`. In this case the properties `columnsXL`, `columnsL` and
      * `columnsM` are ignored.
      *
      * In all other cases the `FormContainer` is displayed in the size of one column.
      */
    var singleContainerFullSize: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ResponsiveGridLayoutSettings {
    
    inline def apply(): ResponsiveGridLayoutSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponsiveGridLayoutSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResponsiveGridLayoutSettings] (val x: Self) extends AnyVal {
      
      inline def setAdjustLabelSpan(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "adjustLabelSpan", value.asInstanceOf[js.Any])
      
      inline def setAdjustLabelSpanUndefined: Self = StObject.set(x, "adjustLabelSpan", js.undefined)
      
      inline def setBreakpointL(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "breakpointL", value.asInstanceOf[js.Any])
      
      inline def setBreakpointLUndefined: Self = StObject.set(x, "breakpointL", js.undefined)
      
      inline def setBreakpointM(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "breakpointM", value.asInstanceOf[js.Any])
      
      inline def setBreakpointMUndefined: Self = StObject.set(x, "breakpointM", js.undefined)
      
      inline def setBreakpointXL(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "breakpointXL", value.asInstanceOf[js.Any])
      
      inline def setBreakpointXLUndefined: Self = StObject.set(x, "breakpointXL", js.undefined)
      
      inline def setColumnsL(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "columnsL", value.asInstanceOf[js.Any])
      
      inline def setColumnsLUndefined: Self = StObject.set(x, "columnsL", js.undefined)
      
      inline def setColumnsM(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "columnsM", value.asInstanceOf[js.Any])
      
      inline def setColumnsMUndefined: Self = StObject.set(x, "columnsM", js.undefined)
      
      inline def setColumnsXL(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "columnsXL", value.asInstanceOf[js.Any])
      
      inline def setColumnsXLUndefined: Self = StObject.set(x, "columnsXL", js.undefined)
      
      inline def setEmptySpanL(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "emptySpanL", value.asInstanceOf[js.Any])
      
      inline def setEmptySpanLUndefined: Self = StObject.set(x, "emptySpanL", js.undefined)
      
      inline def setEmptySpanM(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "emptySpanM", value.asInstanceOf[js.Any])
      
      inline def setEmptySpanMUndefined: Self = StObject.set(x, "emptySpanM", js.undefined)
      
      inline def setEmptySpanS(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "emptySpanS", value.asInstanceOf[js.Any])
      
      inline def setEmptySpanSUndefined: Self = StObject.set(x, "emptySpanS", js.undefined)
      
      inline def setEmptySpanXL(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "emptySpanXL", value.asInstanceOf[js.Any])
      
      inline def setEmptySpanXLUndefined: Self = StObject.set(x, "emptySpanXL", js.undefined)
      
      inline def setLabelSpanL(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "labelSpanL", value.asInstanceOf[js.Any])
      
      inline def setLabelSpanLUndefined: Self = StObject.set(x, "labelSpanL", js.undefined)
      
      inline def setLabelSpanM(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "labelSpanM", value.asInstanceOf[js.Any])
      
      inline def setLabelSpanMUndefined: Self = StObject.set(x, "labelSpanM", js.undefined)
      
      inline def setLabelSpanS(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "labelSpanS", value.asInstanceOf[js.Any])
      
      inline def setLabelSpanSUndefined: Self = StObject.set(x, "labelSpanS", js.undefined)
      
      inline def setLabelSpanXL(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "labelSpanXL", value.asInstanceOf[js.Any])
      
      inline def setLabelSpanXLUndefined: Self = StObject.set(x, "labelSpanXL", js.undefined)
      
      inline def setSingleContainerFullSize(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "singleContainerFullSize", value.asInstanceOf[js.Any])
      
      inline def setSingleContainerFullSizeUndefined: Self = StObject.set(x, "singleContainerFullSize", js.undefined)
    }
  }
}
