package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.Toolbar
import typings.openui5.sapUiLayoutLibraryMod.BackgroundDesign
import typings.openui5.sapUiLayoutLibraryMod.form.SimpleFormLayout
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiLayoutFormSimpleFormMod {
  
  @JSImport("sap/ui/layout/form/SimpleForm", JSImport.Default)
  @js.native
  /**
    * Constructor for a new sap.ui.layout.form.SimpleForm.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends SimpleForm {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: SimpleFormSettings) = this()
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
    mSettings: SimpleFormSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: SimpleFormSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/layout/form/SimpleForm", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.layout.form.SimpleForm with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, SimpleForm]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, SimpleForm],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.layout.form.SimpleForm.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait SimpleForm
    extends typings.openui5.sapUiCoreControlMod.default {
    
    def addAriaLabelledBy(
      /**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * @SINCE 1.32.0
      *
      * Adds some ariaLabelledBy into the association {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAriaLabelledBy(/**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: ID): this.type = js.native
    
    /**
      * Adds some content to the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addContent(
      /**
      * The content to add; if empty, nothing is inserted
      */
    oContent: typings.openui5.sapUiCoreElementMod.default
    ): this.type = js.native
    
    /**
      * Destroys all the content in the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContent(): this.type = js.native
    
    /**
      * @SINCE 1.16.3
      *
      * Destroys the title in the aggregation {@link #getTitle title}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyTitle(): this.type = js.native
    
    /**
      * @SINCE 1.36.0
      *
      * Destroys the toolbar in the aggregation {@link #getToolbar toolbar}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyToolbar(): this.type = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Gets current value of property {@link #getAdjustLabelSpan adjustLabelSpan}.
      *
      * If set, the usage of `labelSpanL` and `labelSpanM` are dependent on the number of `FormContainers` in
      * one row. If only one `FormContainer` is displayed in one row, `labelSpanM` is used to define the size
      * of the label. This is the same for medium and large `Forms`. This is done to align the labels on forms
      * where full-size `FormContainers` and multiple-column rows are used in the same `Form` (because every
      * `FormContainer` has its own grid inside).
      *
      * If not set, the usage of `labelSpanL` and `labelSpanM` are dependent on the `Form` size. The number of
      * `FormContainers` doesn't matter in this case.
      *
      * **Note:** This property is only used if a `ResponsiveGridLayout` is used as a layout.
      *
      * Default value is `true`.
      *
      * @returns Value of property `adjustLabelSpan`
      */
    def getAdjustLabelSpan(): Boolean = js.native
    
    /**
      * @SINCE 1.32.0
      *
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy
      * ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * @SINCE 1.36.0
      *
      * Gets current value of property {@link #getBackgroundDesign backgroundDesign}.
      *
      * Specifies the background color of the `SimpleForm` content.
      *
      * The visualization of the different options depends on the used theme.
      *
      * Default value is `Translucent`.
      *
      * @returns Value of property `backgroundDesign`
      */
    def getBackgroundDesign(): BackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String) = js.native
    
    /**
      * @SINCE 1.16.3
      *
      * Gets current value of property {@link #getBreakpointL breakpointL}.
      *
      * Breakpoint between Medium size and Large size.
      *
      * **Note:** This property is only used if a `ResponsiveGridLayout` is used as a layout.
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
      * Breakpoint between Small size and Medium size.
      *
      * **Note:** This property is only used if a `ResponsiveGridLayout` is used as a layout.
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
      * Breakpoint between Medium size and Large size.
      *
      * **Note:** This property is only used if a `ResponsiveGridLayout` is used as a layout.
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
      * Form columns for large size. The number of columns for large size must not be smaller than the number
      * of columns for medium size.
      *
      * **Note:** This property is only used if a `ResponsiveGridLayout` or a `ColumnLayout` is used as a layout.
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
      * Form columns for medium size.
      *
      * **Note:** This property is only used if a `ResponsiveGridLayout` or a `ColumnLayout` is used as a layout.
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
      * Form columns for extra large size. The number of columns for extra large size must not be smaller than
      * the number of columns for large size.
      *
      * **Note:** This property is only used if a `ResponsiveGridLayout` or a `ColumnLayout` is used as a layout.
      * If the default value -1 is not overwritten with the meaningful one then the `columnsL` value is used
      * (from the backward compatibility reasons).
      *
      * Default value is `-1`.
      *
      * @returns Value of property `columnsXL`
      */
    def getColumnsXL(): int = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * The content of the form is structured in the following way:
      * 	 - Add a `sap.ui.core.Title` element or `Toolbar` control to start a new group (`{@link sap.ui.layout.form.FormContainer
      * 			FormContainer}`).
      * 	 - Add a `Label` control to start a new row (`{@link sap.ui.layout.form.FormElement FormElement}`).
      *
      * 	 - Add controls as input fields, text fields or other as needed.
      * 	 - Use `LayoutData` to influence the layout for special cases in the single controls. For example, if
      * 			a `ColumnLayout` is used as a layout, the form content is weighted using 4 cells for the labels and 8
      * 			cells for the field part, for large size. If there is only little space, the labels are above the fields
      * 			and each field uses 12 cells. If your input controls should influence their width, you can add `sap.ui.layout.ColumnElementData`
      * 			to them via `setLayoutData` method. Ensure that the sum of the weights in the `ColumnElementData` is
      * 			not more than 12, as this is the total width of the input control part of each form row.  Example
      * 			for a row where the `Input` uses 6 cells and the second `Input` uses 2 cells (using `ColumnElementData`):
      *
      * ```javascript
      *
      * new sap.m.Label({text:"Label"});
      * new sap.m.Input({value:"6 cells", layoutData: new sap.ui.layout.ColumnElementData({cellsLarge: 6, cellsSmall: 8})}),
      * new sap.m.Input({value:"2 cells", layoutData: new sap.ui.layout.ColumnElementData({cellsLarge: 2, cellsSmall: 4})}),
      * ```
      *
      *
      * For example, if a `ResponsiveGridLayout` is used as a layout, there are 12 cells in one row. Depending
      * on the screen size the labels use the defined `labelSpan`. The remaining cells are used for the fields
      * (and `emptySpan` if defined). The available cells are distributed to all fields in the row. If one field
      * should use a fixed number of cells you can add `sap.ui.layout.GridData` to them via `setLayoutData` method.
      * If there are additional fields in the row they will get the remaining cells.  Example for a row
      * with two `Input` controls where one uses four cells on small screens, one cell on medium screens and
      * 2 cells on larger screens (using `ResponsiveGridLayout`):
      * ```javascript
      *
      * new sap.m.Label({text:"Label"});
      * new sap.m.Input({value:"auto size"}),
      * new sap.m.Input({value:"fix size", layoutData: new sap.ui.layout.GridData({span: "XL1 L1 M2 S4"})}),
      * ```
      *
      *
      * **Warning:** Do not put any layout or other container controls in here. This could damage the visual
      * layout, keyboard support and screen-reader support. Only labels, titles, toolbars and form controls are
      * allowed. Views are also not supported. Allowed form controls implement the interface `sap.ui.core.IFormContent`.
      *
      * If editable controls are used as content, the `editable` property must be set to `true`, otherwise to
      * `false`. If the `editable` property is set incorrectly, there will be visual issues like wrong label
      * alignment or wrong spacing between the controls.
      */
    def getContent(): js.Array[typings.openui5.sapUiCoreElementMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getEditable editable}.
      *
      * Applies a device-specific and theme-specific line height and label alignment to the form rows if the
      * form has editable content. If set, all (not only the editable) rows of the form will get the line height
      * of editable fields.
      *
      * The labels inside the form will be rendered by default in the according mode.
      *
      * **Note:** The setting of this property does not change the content of the form. For example, `Input`
      * controls in a form with `editable` set to false are still editable.
      *
      * **Warning:** If this property is wrongly set, this might lead to visual issues. The labels and fields
      * might be misaligned, the labels might be rendered in the wrong mode, and the spacing between the single
      * controls might be wrong. Also, controls that do not fit the mode might be rendered incorrectly.
      *
      * @returns Value of property `editable`
      */
    def getEditable(): Boolean = js.native
    
    /**
      * @SINCE 1.16.3
      *
      * Gets current value of property {@link #getEmptySpanL emptySpanL}.
      *
      * Number of grid cells that are empty at the end of each line on large size.
      *
      * **Note:** This property is only used if a `ResponsiveGridLayout` or a `ColumnLayout` is used as a layout.
      * If a `ColumnLayout` is used, this property defines the empty cells for large columns.
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
      * **Note:** This property is only used if a `ResponsiveGridLayout` is used as a layout.
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
      * **Note:** This property is only used if a `ResponsiveGridLayout` is used as a layout.
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
      * **Note:** This property is only used if a `ResponsiveGridLayout` is used as a layout. If the default
      * value -1 is not overwritten with the meaningful one then the `emptySpanL` value is used (from the backward
      * compatibility reasons).
      *
      * Default value is `-1`.
      *
      * @returns Value of property `emptySpanXL`
      */
    def getEmptySpanXL(): int = js.native
    
    /**
      * Gets current value of property {@link #getLabelMinWidth labelMinWidth}.
      *
      * Specifies the min-width in pixels of the label in all form rows.
      *
      * **Note:** This property is only used if a `ResponsiveLayout` is used as a layout.
      *
      * Default value is `192`.
      *
      * @returns Value of property `labelMinWidth`
      */
    def getLabelMinWidth(): int = js.native
    
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
      * **Note:** This property is only used if `ResponsiveGridLayout` or `ColumnLayout` is used as a layout.
      * If a `ColumnLayout` is used, this property defines the label size for large columns.
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
      * **Note:** If `adjustLabelSpan` is set, this property is used for full-size `FormContainers`. If more
      * than one `FormContainer` is in one line, `labelSpanL` is used.
      *
      * **Note:** This property is only used if a `ResponsiveGridLayout` is used as a layout.
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
      * **Note:** This property is only used if a `ResponsiveGridLayout` is used as a layout.
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
      * **Note:** This property is only used if a `ResponsiveGridLayout` is used as a layout. If the default
      * value -1 is not overwritten with the meaningful one then the `labelSpanL` value is used (from the backward
      * compatibility reasons).
      *
      * Default value is `-1`.
      *
      * @returns Value of property `labelSpanXL`
      */
    def getLabelSpanXL(): int = js.native
    
    /**
      * Gets current value of property {@link #getLayout layout}.
      *
      * The `FormLayout` that is used to render the `SimpleForm`.
      *
      * We recommend using the `ColumnLayout` for rendering a `SimpleForm`, as its responsiveness uses the space
      * available in the best way possible.
      *
      * **Note** If possible, set the `layout` before adding content to prevent calculations for the default
      * layout.
      *
      * **Note** The `ResponsiveLayout` has been deprecated and must no longer be used. For compatibility reasons
      * the default could not be changed.
      *
      * Default value is `ResponsiveLayout`.
      *
      * @returns Value of property `layout`
      */
    def getLayout(): SimpleFormLayout | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof form.SimpleFormLayout * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getMaxContainerCols maxContainerCols}.
      *
      * The maximum amount of groups (`{@link sap.ui.layout.form.FormContainer FormContainers}`) per row that
      * is used before a new row is started.
      *
      * **Note:** If `{@link sap.ui.layout.form.SimpleFormLayout.ResponsiveGridLayout}` is used as `layout`,
      * this property is not used. Please use the properties `ColumnsL` and `ColumnsM` in this case.
      *
      * Default value is `2`.
      *
      * @returns Value of property `maxContainerCols`
      */
    def getMaxContainerCols(): int = js.native
    
    /**
      * Gets current value of property {@link #getMinWidth minWidth}.
      *
      * The overall minimum width in pixels that is used for the `SimpleForm`.
      *
      * If the available width is below the given `minWidth` the `SimpleForm` will create a new row for the next
      * group (`{@link sap.ui.layout.form.FormContainer FormContainer}`). The default value is -1, meaning that
      * inner groups (`{@link sap.ui.layout.form.FormContainer FormContainers}`) will be stacked until `maxContainerCols`
      * is reached, irrespective of whether a `width` is reached or the available parents width is reached.
      *
      * **Note:** This property is only used if a `ResponsiveLayout` is used as a layout.
      *
      * Default value is `-1`.
      *
      * @returns Value of property `minWidth`
      */
    def getMinWidth(): int = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Gets current value of property {@link #getSingleContainerFullSize singleContainerFullSize}.
      *
      * If the `Form` contains only one single `FormContainer` and this property is set, the `FormContainer`
      * is displayed using the full size of the `Form`. In this case the properties `columnsL` and `columnsM`
      * are ignored.
      *
      * In all other cases the `FormContainer` is displayed in the size of one column.
      *
      * **Note:** This property is only used if a `ResponsiveGridLayout` is used as a layout.
      *
      * Default value is `true`.
      *
      * @returns Value of property `singleContainerFullSize`
      */
    def getSingleContainerFullSize(): Boolean = js.native
    
    /**
      * @SINCE 1.16.3
      *
      * Gets content of aggregation {@link #getTitle title}.
      *
      * Title element of the `SimpleForm`. Can either be a `Title` element, or a string.
      */
    def getTitle(): typings.openui5.sapUiCoreTitleMod.default | String = js.native
    
    /**
      * @SINCE 1.36.0
      *
      * Gets content of aggregation {@link #getToolbar toolbar}.
      *
      * Toolbar of the `SimpleForm`.
      *
      * **Note:** If a `Toolbar` is used, the `Title` is ignored. If a title is needed inside the `Toolbar` it
      * must be added at content to the `Toolbar`. In this case add the `Title` to the `ariaLabelledBy` association.
      */
    def getToolbar(): Toolbar = js.native
    
    /**
      * @SINCE 1.28.0
      *
      * Gets current value of property {@link #getWidth width}.
      *
      * Width of the form.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Element` in the aggregation {@link #getContent content}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfContent(
      /**
      * The content whose index is looked for
      */
    oContent: typings.openui5.sapUiCoreElementMod.default
    ): int = js.native
    
    /**
      * Inserts a content into the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertContent(
      /**
      * The content to insert; if empty, nothing is inserted
      */
    oContent: typings.openui5.sapUiCoreElementMod.default,
      /**
      * The `0`-based index the content should be inserted at; for a negative value of `iIndex`, the content
      * is inserted at position 0; for a value greater than the current size of the aggregation, the content
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * @SINCE 1.32.0
      *
      * Removes all the controls in the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getContent content}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllContent(): js.Array[typings.openui5.sapUiCoreElementMod.default] = js.native
    
    /**
      * @SINCE 1.32.0
      *
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
    
    def removeContent(/**
      * The content to remove or its index or id
      */
    vContent: String): typings.openui5.sapUiCoreElementMod.default | Null = js.native
    /**
      * Removes a content from the aggregation {@link #getContent content}.
      *
      * @returns The removed content or `null`
      */
    def removeContent(/**
      * The content to remove or its index or id
      */
    vContent: int): typings.openui5.sapUiCoreElementMod.default | Null = js.native
    def removeContent(
      /**
      * The content to remove or its index or id
      */
    vContent: typings.openui5.sapUiCoreElementMod.default
    ): typings.openui5.sapUiCoreElementMod.default | Null = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Sets a new value for property {@link #getAdjustLabelSpan adjustLabelSpan}.
      *
      * If set, the usage of `labelSpanL` and `labelSpanM` are dependent on the number of `FormContainers` in
      * one row. If only one `FormContainer` is displayed in one row, `labelSpanM` is used to define the size
      * of the label. This is the same for medium and large `Forms`. This is done to align the labels on forms
      * where full-size `FormContainers` and multiple-column rows are used in the same `Form` (because every
      * `FormContainer` has its own grid inside).
      *
      * If not set, the usage of `labelSpanL` and `labelSpanM` are dependent on the `Form` size. The number of
      * `FormContainers` doesn't matter in this case.
      *
      * **Note:** This property is only used if a `ResponsiveGridLayout` is used as a layout.
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
      * @SINCE 1.36.0
      *
      * Sets a new value for property {@link #getBackgroundDesign backgroundDesign}.
      *
      * Specifies the background color of the `SimpleForm` content.
      *
      * The visualization of the different options depends on the used theme.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Translucent`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBackgroundDesign(): this.type = js.native
    def setBackgroundDesign(
      /**
      * New value for property `backgroundDesign`
      */
    sBackgroundDesign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String
    ): this.type = js.native
    def setBackgroundDesign(/**
      * New value for property `backgroundDesign`
      */
    sBackgroundDesign: BackgroundDesign): this.type = js.native
    
    /**
      * @SINCE 1.16.3
      *
      * Sets a new value for property {@link #getBreakpointL breakpointL}.
      *
      * Breakpoint between Medium size and Large size.
      *
      * **Note:** This property is only used if a `ResponsiveGridLayout` is used as a layout.
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
      * Breakpoint between Small size and Medium size.
      *
      * **Note:** This property is only used if a `ResponsiveGridLayout` is used as a layout.
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
      * Breakpoint between Medium size and Large size.
      *
      * **Note:** This property is only used if a `ResponsiveGridLayout` is used as a layout.
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
      * Form columns for large size. The number of columns for large size must not be smaller than the number
      * of columns for medium size.
      *
      * **Note:** This property is only used if a `ResponsiveGridLayout` or a `ColumnLayout` is used as a layout.
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
      * Form columns for medium size.
      *
      * **Note:** This property is only used if a `ResponsiveGridLayout` or a `ColumnLayout` is used as a layout.
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
      * Form columns for extra large size. The number of columns for extra large size must not be smaller than
      * the number of columns for large size.
      *
      * **Note:** This property is only used if a `ResponsiveGridLayout` or a `ColumnLayout` is used as a layout.
      * If the default value -1 is not overwritten with the meaningful one then the `columnsL` value is used
      * (from the backward compatibility reasons).
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
      * Sets a new value for property {@link #getEditable editable}.
      *
      * Applies a device-specific and theme-specific line height and label alignment to the form rows if the
      * form has editable content. If set, all (not only the editable) rows of the form will get the line height
      * of editable fields.
      *
      * The labels inside the form will be rendered by default in the according mode.
      *
      * **Note:** The setting of this property does not change the content of the form. For example, `Input`
      * controls in a form with `editable` set to false are still editable.
      *
      * **Warning:** If this property is wrongly set, this might lead to visual issues. The labels and fields
      * might be misaligned, the labels might be rendered in the wrong mode, and the spacing between the single
      * controls might be wrong. Also, controls that do not fit the mode might be rendered incorrectly.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEditable(): this.type = js.native
    def setEditable(/**
      * New value for property `editable`
      */
    bEditable: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.16.3
      *
      * Sets a new value for property {@link #getEmptySpanL emptySpanL}.
      *
      * Number of grid cells that are empty at the end of each line on large size.
      *
      * **Note:** This property is only used if a `ResponsiveGridLayout` or a `ColumnLayout` is used as a layout.
      * If a `ColumnLayout` is used, this property defines the empty cells for large columns.
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
      * **Note:** This property is only used if a `ResponsiveGridLayout` is used as a layout.
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
      * **Note:** This property is only used if a `ResponsiveGridLayout` is used as a layout.
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
      * **Note:** This property is only used if a `ResponsiveGridLayout` is used as a layout. If the default
      * value -1 is not overwritten with the meaningful one then the `emptySpanL` value is used (from the backward
      * compatibility reasons).
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
      * Sets a new value for property {@link #getLabelMinWidth labelMinWidth}.
      *
      * Specifies the min-width in pixels of the label in all form rows.
      *
      * **Note:** This property is only used if a `ResponsiveLayout` is used as a layout.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `192`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLabelMinWidth(): this.type = js.native
    def setLabelMinWidth(/**
      * New value for property `labelMinWidth`
      */
    iLabelMinWidth: int): this.type = js.native
    
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
      * **Note:** This property is only used if `ResponsiveGridLayout` or `ColumnLayout` is used as a layout.
      * If a `ColumnLayout` is used, this property defines the label size for large columns.
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
      * **Note:** If `adjustLabelSpan` is set, this property is used for full-size `FormContainers`. If more
      * than one `FormContainer` is in one line, `labelSpanL` is used.
      *
      * **Note:** This property is only used if a `ResponsiveGridLayout` is used as a layout.
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
      * **Note:** This property is only used if a `ResponsiveGridLayout` is used as a layout.
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
      * **Note:** This property is only used if a `ResponsiveGridLayout` is used as a layout. If the default
      * value -1 is not overwritten with the meaningful one then the `labelSpanL` value is used (from the backward
      * compatibility reasons).
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
      * Sets a new value for property {@link #getLayout layout}.
      *
      * The `FormLayout` that is used to render the `SimpleForm`.
      *
      * We recommend using the `ColumnLayout` for rendering a `SimpleForm`, as its responsiveness uses the space
      * available in the best way possible.
      *
      * **Note** If possible, set the `layout` before adding content to prevent calculations for the default
      * layout.
      *
      * **Note** The `ResponsiveLayout` has been deprecated and must no longer be used. For compatibility reasons
      * the default could not be changed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `ResponsiveLayout`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLayout(): this.type = js.native
    def setLayout(
      /**
      * New value for property `layout`
      */
    sLayout: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof form.SimpleFormLayout * / any */ String
    ): this.type = js.native
    def setLayout(/**
      * New value for property `layout`
      */
    sLayout: SimpleFormLayout): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMaxContainerCols maxContainerCols}.
      *
      * The maximum amount of groups (`{@link sap.ui.layout.form.FormContainer FormContainers}`) per row that
      * is used before a new row is started.
      *
      * **Note:** If `{@link sap.ui.layout.form.SimpleFormLayout.ResponsiveGridLayout}` is used as `layout`,
      * this property is not used. Please use the properties `ColumnsL` and `ColumnsM` in this case.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `2`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMaxContainerCols(): this.type = js.native
    def setMaxContainerCols(/**
      * New value for property `maxContainerCols`
      */
    iMaxContainerCols: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMinWidth minWidth}.
      *
      * The overall minimum width in pixels that is used for the `SimpleForm`.
      *
      * If the available width is below the given `minWidth` the `SimpleForm` will create a new row for the next
      * group (`{@link sap.ui.layout.form.FormContainer FormContainer}`). The default value is -1, meaning that
      * inner groups (`{@link sap.ui.layout.form.FormContainer FormContainers}`) will be stacked until `maxContainerCols`
      * is reached, irrespective of whether a `width` is reached or the available parents width is reached.
      *
      * **Note:** This property is only used if a `ResponsiveLayout` is used as a layout.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `-1`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMinWidth(): this.type = js.native
    def setMinWidth(/**
      * New value for property `minWidth`
      */
    iMinWidth: int): this.type = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Sets a new value for property {@link #getSingleContainerFullSize singleContainerFullSize}.
      *
      * If the `Form` contains only one single `FormContainer` and this property is set, the `FormContainer`
      * is displayed using the full size of the `Form`. In this case the properties `columnsL` and `columnsM`
      * are ignored.
      *
      * In all other cases the `FormContainer` is displayed in the size of one column.
      *
      * **Note:** This property is only used if a `ResponsiveGridLayout` is used as a layout.
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
    
    def setTitle(/**
      * The title to set
      */
    vTitle: String): this.type = js.native
    /**
      * @SINCE 1.16.3
      *
      * Sets the aggregated {@link #getTitle title}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitle(/**
      * The title to set
      */
    vTitle: typings.openui5.sapUiCoreTitleMod.default): this.type = js.native
    
    /**
      * @SINCE 1.36.0
      *
      * Sets the aggregated {@link #getToolbar toolbar}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setToolbar(/**
      * The toolbar to set
      */
    oToolbar: Toolbar): this.type = js.native
    
    /**
      * @SINCE 1.28.0
      *
      * Sets a new value for property {@link #getWidth width}.
      *
      * Width of the form.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(): this.type = js.native
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
  }
  
  trait SimpleFormSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @SINCE 1.34.0
      *
      * If set, the usage of `labelSpanL` and `labelSpanM` are dependent on the number of `FormContainers` in
      * one row. If only one `FormContainer` is displayed in one row, `labelSpanM` is used to define the size
      * of the label. This is the same for medium and large `Forms`. This is done to align the labels on forms
      * where full-size `FormContainers` and multiple-column rows are used in the same `Form` (because every
      * `FormContainer` has its own grid inside).
      *
      * If not set, the usage of `labelSpanL` and `labelSpanM` are dependent on the `Form` size. The number of
      * `FormContainers` doesn't matter in this case.
      *
      * **Note:** This property is only used if a `ResponsiveGridLayout` is used as a layout.
      */
    var adjustLabelSpan: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.32.0
      *
      * Association to controls / IDs which label this control (see WAI-ARIA attribute `aria-labelledby`).
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * @SINCE 1.36.0
      *
      * Specifies the background color of the `SimpleForm` content.
      *
      * The visualization of the different options depends on the used theme.
      */
    var backgroundDesign: js.UndefOr[
        BackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.16.3
      *
      * Breakpoint between Medium size and Large size.
      *
      * **Note:** This property is only used if a `ResponsiveGridLayout` is used as a layout.
      */
    var breakpointL: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.16.3
      *
      * Breakpoint between Small size and Medium size.
      *
      * **Note:** This property is only used if a `ResponsiveGridLayout` is used as a layout.
      */
    var breakpointM: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.34.0
      *
      * Breakpoint between Medium size and Large size.
      *
      * **Note:** This property is only used if a `ResponsiveGridLayout` is used as a layout.
      */
    var breakpointXL: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.16.3
      *
      * Form columns for large size. The number of columns for large size must not be smaller than the number
      * of columns for medium size.
      *
      * **Note:** This property is only used if a `ResponsiveGridLayout` or a `ColumnLayout` is used as a layout.
      */
    var columnsL: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.16.3
      *
      * Form columns for medium size.
      *
      * **Note:** This property is only used if a `ResponsiveGridLayout` or a `ColumnLayout` is used as a layout.
      */
    var columnsM: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.34.0
      *
      * Form columns for extra large size. The number of columns for extra large size must not be smaller than
      * the number of columns for large size.
      *
      * **Note:** This property is only used if a `ResponsiveGridLayout` or a `ColumnLayout` is used as a layout.
      * If the default value -1 is not overwritten with the meaningful one then the `columnsL` value is used
      * (from the backward compatibility reasons).
      */
    var columnsXL: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * The content of the form is structured in the following way:
      * 	 - Add a `sap.ui.core.Title` element or `Toolbar` control to start a new group (`{@link sap.ui.layout.form.FormContainer
      * 			FormContainer}`).
      * 	 - Add a `Label` control to start a new row (`{@link sap.ui.layout.form.FormElement FormElement}`).
      *
      * 	 - Add controls as input fields, text fields or other as needed.
      * 	 - Use `LayoutData` to influence the layout for special cases in the single controls. For example, if
      * 			a `ColumnLayout` is used as a layout, the form content is weighted using 4 cells for the labels and 8
      * 			cells for the field part, for large size. If there is only little space, the labels are above the fields
      * 			and each field uses 12 cells. If your input controls should influence their width, you can add `sap.ui.layout.ColumnElementData`
      * 			to them via `setLayoutData` method. Ensure that the sum of the weights in the `ColumnElementData` is
      * 			not more than 12, as this is the total width of the input control part of each form row.  Example
      * 			for a row where the `Input` uses 6 cells and the second `Input` uses 2 cells (using `ColumnElementData`):
      *
      * ```javascript
      *
      * new sap.m.Label({text:"Label"});
      * new sap.m.Input({value:"6 cells", layoutData: new sap.ui.layout.ColumnElementData({cellsLarge: 6, cellsSmall: 8})}),
      * new sap.m.Input({value:"2 cells", layoutData: new sap.ui.layout.ColumnElementData({cellsLarge: 2, cellsSmall: 4})}),
      * ```
      *
      *
      * For example, if a `ResponsiveGridLayout` is used as a layout, there are 12 cells in one row. Depending
      * on the screen size the labels use the defined `labelSpan`. The remaining cells are used for the fields
      * (and `emptySpan` if defined). The available cells are distributed to all fields in the row. If one field
      * should use a fixed number of cells you can add `sap.ui.layout.GridData` to them via `setLayoutData` method.
      * If there are additional fields in the row they will get the remaining cells.  Example for a row
      * with two `Input` controls where one uses four cells on small screens, one cell on medium screens and
      * 2 cells on larger screens (using `ResponsiveGridLayout`):
      * ```javascript
      *
      * new sap.m.Label({text:"Label"});
      * new sap.m.Input({value:"auto size"}),
      * new sap.m.Input({value:"fix size", layoutData: new sap.ui.layout.GridData({span: "XL1 L1 M2 S4"})}),
      * ```
      *
      *
      * **Warning:** Do not put any layout or other container controls in here. This could damage the visual
      * layout, keyboard support and screen-reader support. Only labels, titles, toolbars and form controls are
      * allowed. Views are also not supported. Allowed form controls implement the interface `sap.ui.core.IFormContent`.
      *
      * If editable controls are used as content, the `editable` property must be set to `true`, otherwise to
      * `false`. If the `editable` property is set incorrectly, there will be visual issues like wrong label
      * alignment or wrong spacing between the controls.
      */
    var content: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreElementMod.default] | typings.openui5.sapUiCoreElementMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Applies a device-specific and theme-specific line height and label alignment to the form rows if the
      * form has editable content. If set, all (not only the editable) rows of the form will get the line height
      * of editable fields.
      *
      * The labels inside the form will be rendered by default in the according mode.
      *
      * **Note:** The setting of this property does not change the content of the form. For example, `Input`
      * controls in a form with `editable` set to false are still editable.
      *
      * **Warning:** If this property is wrongly set, this might lead to visual issues. The labels and fields
      * might be misaligned, the labels might be rendered in the wrong mode, and the spacing between the single
      * controls might be wrong. Also, controls that do not fit the mode might be rendered incorrectly.
      */
    var editable: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.16.3
      *
      * Number of grid cells that are empty at the end of each line on large size.
      *
      * **Note:** This property is only used if a `ResponsiveGridLayout` or a `ColumnLayout` is used as a layout.
      * If a `ColumnLayout` is used, this property defines the empty cells for large columns.
      */
    var emptySpanL: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.16.3
      *
      * Number of grid cells that are empty at the end of each line on medium size.
      *
      * **Note:** This property is only used if a `ResponsiveGridLayout` is used as a layout.
      */
    var emptySpanM: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.16.3
      *
      * Number of grid cells that are empty at the end of each line on small size.
      *
      * **Note:** This property is only used if a `ResponsiveGridLayout` is used as a layout.
      */
    var emptySpanS: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.34.0
      *
      * Number of grid cells that are empty at the end of each line on extra large size.
      *
      * **Note:** This property is only used if a `ResponsiveGridLayout` is used as a layout. If the default
      * value -1 is not overwritten with the meaningful one then the `emptySpanL` value is used (from the backward
      * compatibility reasons).
      */
    var emptySpanXL: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Specifies the min-width in pixels of the label in all form rows.
      *
      * **Note:** This property is only used if a `ResponsiveLayout` is used as a layout.
      */
    var labelMinWidth: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.16.3
      *
      * Default span for labels in large size.
      *
      * **Note:** If `adjustLabelSpan` is set, this property is only used if more than 1 `FormContainer` is in
      * one line. If only 1 `FormContainer` is in the line, then the `labelSpanM` value is used.
      *
      * **Note:** This property is only used if `ResponsiveGridLayout` or `ColumnLayout` is used as a layout.
      * If a `ColumnLayout` is used, this property defines the label size for large columns.
      */
    var labelSpanL: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.16.3
      *
      * Default span for labels in medium size.
      *
      * **Note:** If `adjustLabelSpan` is set, this property is used for full-size `FormContainers`. If more
      * than one `FormContainer` is in one line, `labelSpanL` is used.
      *
      * **Note:** This property is only used if a `ResponsiveGridLayout` is used as a layout.
      */
    var labelSpanM: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.16.3
      *
      * Default span for labels in small size.
      *
      * **Note:** This property is only used if a `ResponsiveGridLayout` is used as a layout.
      */
    var labelSpanS: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.34.0
      *
      * Default span for labels in extra large size.
      *
      * **Note:** This property is only used if a `ResponsiveGridLayout` is used as a layout. If the default
      * value -1 is not overwritten with the meaningful one then the `labelSpanL` value is used (from the backward
      * compatibility reasons).
      */
    var labelSpanXL: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * The `FormLayout` that is used to render the `SimpleForm`.
      *
      * We recommend using the `ColumnLayout` for rendering a `SimpleForm`, as its responsiveness uses the space
      * available in the best way possible.
      *
      * **Note** If possible, set the `layout` before adding content to prevent calculations for the default
      * layout.
      *
      * **Note** The `ResponsiveLayout` has been deprecated and must no longer be used. For compatibility reasons
      * the default could not be changed.
      */
    var layout: js.UndefOr[
        SimpleFormLayout | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof form.SimpleFormLayout * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * The maximum amount of groups (`{@link sap.ui.layout.form.FormContainer FormContainers}`) per row that
      * is used before a new row is started.
      *
      * **Note:** If `{@link sap.ui.layout.form.SimpleFormLayout.ResponsiveGridLayout}` is used as `layout`,
      * this property is not used. Please use the properties `ColumnsL` and `ColumnsM` in this case.
      */
    var maxContainerCols: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * The overall minimum width in pixels that is used for the `SimpleForm`.
      *
      * If the available width is below the given `minWidth` the `SimpleForm` will create a new row for the next
      * group (`{@link sap.ui.layout.form.FormContainer FormContainer}`). The default value is -1, meaning that
      * inner groups (`{@link sap.ui.layout.form.FormContainer FormContainers}`) will be stacked until `maxContainerCols`
      * is reached, irrespective of whether a `width` is reached or the available parents width is reached.
      *
      * **Note:** This property is only used if a `ResponsiveLayout` is used as a layout.
      */
    var minWidth: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.34.0
      *
      * If the `Form` contains only one single `FormContainer` and this property is set, the `FormContainer`
      * is displayed using the full size of the `Form`. In this case the properties `columnsL` and `columnsM`
      * are ignored.
      *
      * In all other cases the `FormContainer` is displayed in the size of one column.
      *
      * **Note:** This property is only used if a `ResponsiveGridLayout` is used as a layout.
      */
    var singleContainerFullSize: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.16.3
      *
      * Title element of the `SimpleForm`. Can either be a `Title` element, or a string.
      */
    var title: js.UndefOr[String | typings.openui5.sapUiCoreTitleMod.default | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.36.0
      *
      * Toolbar of the `SimpleForm`.
      *
      * **Note:** If a `Toolbar` is used, the `Title` is ignored. If a title is needed inside the `Toolbar` it
      * must be added at content to the `Toolbar`. In this case add the `Title` to the `ariaLabelledBy` association.
      */
    var toolbar: js.UndefOr[Toolbar] = js.undefined
    
    /**
      * @SINCE 1.28.0
      *
      * Width of the form.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object SimpleFormSettings {
    
    inline def apply(): SimpleFormSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SimpleFormSettings]
    }
    
    extension [Self <: SimpleFormSettings](x: Self) {
      
      inline def setAdjustLabelSpan(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "adjustLabelSpan", value.asInstanceOf[js.Any])
      
      inline def setAdjustLabelSpanUndefined: Self = StObject.set(x, "adjustLabelSpan", js.undefined)
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setBackgroundDesign(
        value: BackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "backgroundDesign", value.asInstanceOf[js.Any])
      
      inline def setBackgroundDesignUndefined: Self = StObject.set(x, "backgroundDesign", js.undefined)
      
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
      
      inline def setContent(
        value: js.Array[typings.openui5.sapUiCoreElementMod.default] | typings.openui5.sapUiCoreElementMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: typings.openui5.sapUiCoreElementMod.default*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setEditable(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      inline def setEmptySpanL(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "emptySpanL", value.asInstanceOf[js.Any])
      
      inline def setEmptySpanLUndefined: Self = StObject.set(x, "emptySpanL", js.undefined)
      
      inline def setEmptySpanM(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "emptySpanM", value.asInstanceOf[js.Any])
      
      inline def setEmptySpanMUndefined: Self = StObject.set(x, "emptySpanM", js.undefined)
      
      inline def setEmptySpanS(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "emptySpanS", value.asInstanceOf[js.Any])
      
      inline def setEmptySpanSUndefined: Self = StObject.set(x, "emptySpanS", js.undefined)
      
      inline def setEmptySpanXL(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "emptySpanXL", value.asInstanceOf[js.Any])
      
      inline def setEmptySpanXLUndefined: Self = StObject.set(x, "emptySpanXL", js.undefined)
      
      inline def setLabelMinWidth(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "labelMinWidth", value.asInstanceOf[js.Any])
      
      inline def setLabelMinWidthUndefined: Self = StObject.set(x, "labelMinWidth", js.undefined)
      
      inline def setLabelSpanL(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "labelSpanL", value.asInstanceOf[js.Any])
      
      inline def setLabelSpanLUndefined: Self = StObject.set(x, "labelSpanL", js.undefined)
      
      inline def setLabelSpanM(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "labelSpanM", value.asInstanceOf[js.Any])
      
      inline def setLabelSpanMUndefined: Self = StObject.set(x, "labelSpanM", js.undefined)
      
      inline def setLabelSpanS(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "labelSpanS", value.asInstanceOf[js.Any])
      
      inline def setLabelSpanSUndefined: Self = StObject.set(x, "labelSpanS", js.undefined)
      
      inline def setLabelSpanXL(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "labelSpanXL", value.asInstanceOf[js.Any])
      
      inline def setLabelSpanXLUndefined: Self = StObject.set(x, "labelSpanXL", js.undefined)
      
      inline def setLayout(
        value: SimpleFormLayout | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof form.SimpleFormLayout * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setMaxContainerCols(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "maxContainerCols", value.asInstanceOf[js.Any])
      
      inline def setMaxContainerColsUndefined: Self = StObject.set(x, "maxContainerCols", js.undefined)
      
      inline def setMinWidth(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setSingleContainerFullSize(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "singleContainerFullSize", value.asInstanceOf[js.Any])
      
      inline def setSingleContainerFullSizeUndefined: Self = StObject.set(x, "singleContainerFullSize", js.undefined)
      
      inline def setTitle(value: String | typings.openui5.sapUiCoreTitleMod.default | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setToolbar(value: Toolbar): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
      
      inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
