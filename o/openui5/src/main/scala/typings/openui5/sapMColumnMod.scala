package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.PopinDisplay
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.IColumnHeaderMenu
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.Priority
import typings.openui5.sapUiCoreLibraryMod.SortOrder
import typings.openui5.sapUiCoreLibraryMod.TextAlign
import typings.openui5.sapUiCoreLibraryMod.VerticalAlign
import typings.std.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMColumnMod {
  
  @JSImport("sap/m/Column", JSImport.Default)
  @js.native
  /**
    * Constructor for a new Column.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Column {
    def this(/**
      * initial settings for the new control
      */
    mSettings: ColumnSettings) = this()
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
    mSettings: ColumnSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: ColumnSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/Column", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.Column with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Element.extend}.
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
    oClassInfo: ClassInfo[T, Column]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Column],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.Column.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Column
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * @SINCE 1.20.4
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Clears the last value of the column if mergeDuplicates property is true
      */
    def clearLastValue(): this.type = js.native
    
    /**
      * Destroys the footer in the aggregation {@link #getFooter footer}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyFooter(): this.type = js.native
    
    /**
      * Destroys the header in the aggregation {@link #getHeader header}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyHeader(): this.type = js.native
    
    /**
      * @SINCE 1.76
      *
      * Gets current value of property {@link #getAutoPopinWidth autoPopinWidth}.
      *
      * Defines the auto pop-in width for the column.
      *
      * If the `sap.m.Table` control is configured with `autoPopinMode=true`, then the `autoPopinWidth` property
      * is used to calculate the `minScreenWidth` property of the column in case a fixed width is not set for
      * the column. See {@link sap.m.Column#getWidth} and {@link sap.m.Table#getAutoPopinMode}. **Note:** A float
      * value is set for the `autoPopinWidth` property which is internally treated as a rem value.
      *
      * Default value is `8`.
      *
      * @returns Value of property `autoPopinWidth`
      */
    def getAutoPopinWidth(): float = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Returns CSS alignment according to column hAlign setting or given parameter for Begin/End values checks
      * the locale settings
      *
      * @returns left|center|right
      */
    def getCssAlign(): String = js.native
    def getCssAlign(/**
      * TextAlign enumeration
      */
    sAlign: String): String = js.native
    
    /**
      * Gets current value of property {@link #getDemandPopin demandPopin}.
      *
      * According to your minScreenWidth settings, the column can be hidden in different screen sizes. Setting
      * this property to true, shows this column as pop-in instead of hiding it. **Note:** This property gets
      * overwritten if the `sap.m.Table` control is configured with `autoPopinMode=true`. See {@link sap.m.Table#getAutoPopinMode}
      *
      * Default value is `false`.
      *
      * @returns Value of property `demandPopin`
      */
    def getDemandPopin(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getFooter footer}.
      *
      * Control to be displayed in the column footer.
      */
    def getFooter(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Gets current value of property {@link #getHAlign hAlign}.
      *
      * Defines the horizontal alignment of the column content.
      *
      * **Note:** Text controls with a `textAlign` property inherits the horizontal alignment.
      *
      * Default value is `Begin`.
      *
      * @returns Value of property `hAlign`
      */
    def getHAlign(): TextAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String) = js.native
    
    /**
      * Gets content of aggregation {@link #getHeader header}.
      *
      * Control to be displayed in the column header.
      */
    def getHeader(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * @SINCE 1.98.0
      *
      * ID of the element which is the current target of the association {@link #getHeaderMenu headerMenu}, or
      * `null`.
      */
    def getHeaderMenu(): ID = js.native
    
    /**
      * @SINCE 1.76
      *
      * Gets current value of property {@link #getImportance importance}.
      *
      * Defines the column importance.
      *
      * If the `sap.m.Table` control is configured with `autoPopinMode=true`, then the column importance is taken
      * into consideration for calculating the `minScreenWidth` property and for setting the `demandPopin` property
      * of the column. See {@link sap.m.Table#getAutoPopinMode}
      *
      * Default value is `"None"`.
      *
      * @returns Value of property `importance`
      */
    def getImportance(): Priority | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Priority * / any */ String) = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Gets the rendering index of the column
      */
    def getIndex(): Unit = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Gets the initial order of the column
      *
      * @returns initial order of the column
      */
    def getInitialOrder(): int = js.native
    
    /**
      * @SINCE 1.16
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Gets the last value of the column
      */
    def getLastValue(): Unit = js.native
    
    /**
      * @SINCE 1.16
      *
      * Gets current value of property {@link #getMergeDuplicates mergeDuplicates}.
      *
      * Set `true` to merge repeating/duplicate cells into one cell block. See `mergeFunctionName` property to
      * customize.
      *
      * **Note:** Merging only happens when rendering the `sap.m.Table` control, subsequent changes on the cell
      * or item do not have any effect on the merged state of the cells, therefore this feature should not be
      * used together with two-way binding. This property is ignored if any column is configured to be shown
      * as a pop-in. Don't set this property for cells for which the content provides a user interaction, such
      * as `sap.m.Link`.
      *
      * Default value is `false`.
      *
      * @returns Value of property `mergeDuplicates`
      */
    def getMergeDuplicates(): Boolean = js.native
    
    /**
      * @SINCE 1.16
      *
      * Gets current value of property {@link #getMergeFunctionName mergeFunctionName}.
      *
      * Defines the control serialization function if `mergeDuplicates` property is set to `true`. The control
      * itself uses this function to compare values of two repeating cells. Default value "getText" is suitable
      * for `sap.m.Label` and `sap.m.Text` controls but for the `sap.ui.core.Icon` control "getSrc" function
      * should be used to merge icons. **Note:** You can pass one string parameter to given function after "#"
      * sign. e.g. "data#myparameter"
      *
      * Default value is `'getText'`.
      *
      * @returns Value of property `mergeFunctionName`
      */
    def getMergeFunctionName(): String = js.native
    
    /**
      * Gets current value of property {@link #getMinScreenWidth minScreenWidth}.
      *
      * Defines the minimum screen width to show or hide this column. By default column is always shown. The
      * responsive behavior of the `sap.m.Table` is determined by this property. As an example by setting `minScreenWidth`
      * property to "40em" (or "640px" or "Tablet") shows this column on tablet (and desktop) but hides on mobile.
      * As you can give specific CSS sizes (e.g: "480px" or "40em"), you can also use the {@link sap.m.ScreenSize}
      * enumeration (e.g: "Phone", "Tablet", "Desktop", "Small", "Medium", "Large", ....). Please also see `demandPopin`
      * property for further responsive design options. **Note:** This property gets overwritten if the `sap.m.Table`
      * control is configured with `autoPopinMode=true`. See {@link sap.m.Table#getAutoPopinMode}
      *
      * @returns Value of property `minScreenWidth`
      */
    def getMinScreenWidth(): String = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Gets the order of the column
      *
      * @returns nOrder order of the column
      */
    def getOrder(): int = js.native
    
    /**
      * @SINCE 1.13.2
      *
      * Gets current value of property {@link #getPopinDisplay popinDisplay}.
      *
      * Defines enumerated display options for the pop-in.
      *
      * Default value is `Block`.
      *
      * @returns Value of property `popinDisplay`
      */
    def getPopinDisplay(): PopinDisplay | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PopinDisplay * / any */ String) = js.native
    
    /**
      * @deprecated (since 1.14) - Use popinDisplay property instead.
      *
      * Gets current value of property {@link #getPopinHAlign popinHAlign}.
      *
      * Horizontal alignment of the pop-in content. Available alignment settings are "Begin", "Center", "End",
      * "Left", and "Right".
      *
      * **Note:** Controls with a text align do not inherit the horizontal alignment.
      *
      * Default value is `Begin`.
      *
      * @returns Value of property `popinHAlign`
      */
    def getPopinHAlign(): TextAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String) = js.native
    
    /**
      * @SINCE 1.61
      *
      * Gets current value of property {@link #getSortIndicator sortIndicator}.
      *
      * Defines if a column is sorted by setting the sort indicator for this column.
      *
      * **Note:** Defining this property does not trigger the sorting.
      *
      * Default value is `None`.
      *
      * @returns Value of property `sortIndicator`
      */
    def getSortIndicator(): SortOrder | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SortOrder * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getStyleClass styleClass}.
      *
      * CSS class name for column contents(header, cells and footer of column). This property can be used for
      * different column styling. If column is shown as pop-in then this class name is applied to related pop-in
      * row.
      *
      * @returns Value of property `styleClass`
      */
    def getStyleClass(): String = js.native
    
    /**
      * Gets current value of property {@link #getVAlign vAlign}.
      *
      * Defines the vertical alignment of the cells in a column. This property does not affect the vertical alignment
      * of header and footer.
      *
      * Default value is `Inherit`.
      *
      * @returns Value of property `vAlign`
      */
    def getVAlign(): VerticalAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VerticalAlign * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getVisible visible}.
      *
      * Specifies whether or not the column is visible. Invisible columns are not rendered.
      *
      * Default value is `true`.
      *
      * @returns Value of property `visible`
      */
    def getVisible(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Defines the width of the column. If you leave it empty then this column covers the remaining space. **Note:**
      * When setting `autoPopinMode=true` on the table, the columns with a fixed width must either be in px,
      * rem, or em as the table internally calculates the `minScreenWidth` property for the column. If a column
      * has a fixed width, then this width is used to calculate the `minScreenWidth` for the `autoPopinMode`.
      * If a column has a flexible width, such as % or auto, the `autoPopinWidth` property is used to calculate
      * the `minScreenWidth`.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Determines whether the column will be hidden via media queries or not
      */
    def isHidden(): Unit = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Determines whether the column will be shown as pop-in or not
      */
    def isPopin(): Unit = js.native
    
    /**
      * @SINCE 1.16
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Gets called from the Table when the all items are removed
      */
    def onItemsRemoved(): Unit = js.native
    
    /**
      * @SINCE 1.76
      *
      * Sets a new value for property {@link #getAutoPopinWidth autoPopinWidth}.
      *
      * Defines the auto pop-in width for the column.
      *
      * If the `sap.m.Table` control is configured with `autoPopinMode=true`, then the `autoPopinWidth` property
      * is used to calculate the `minScreenWidth` property of the column in case a fixed width is not set for
      * the column. See {@link sap.m.Column#getWidth} and {@link sap.m.Table#getAutoPopinMode}. **Note:** A float
      * value is set for the `autoPopinWidth` property which is internally treated as a rem value.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `8`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAutoPopinWidth(): this.type = js.native
    def setAutoPopinWidth(/**
      * New value for property `autoPopinWidth`
      */
    fAutoPopinWidth: float): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDemandPopin demandPopin}.
      *
      * According to your minScreenWidth settings, the column can be hidden in different screen sizes. Setting
      * this property to true, shows this column as pop-in instead of hiding it. **Note:** This property gets
      * overwritten if the `sap.m.Table` control is configured with `autoPopinMode=true`. See {@link sap.m.Table#getAutoPopinMode}
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDemandPopin(): this.type = js.native
    def setDemandPopin(/**
      * New value for property `demandPopin`
      */
    bDemandPopin: Boolean): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Display or hide the column from given table This does not set the visibility property of the column
      */
    def setDisplay(/**
      * Table DOM reference
      */
    oTableDomRef: Element): Unit = js.native
    def setDisplay(
      /**
      * Table DOM reference
      */
    oTableDomRef: Element,
      /**
      * whether visible or not
      */
    bDisplay: Boolean
    ): Unit = js.native
    
    /**
      * Sets the aggregated {@link #getFooter footer}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFooter(/**
      * The footer to set
      */
    oFooter: typings.openui5.sapUiCoreControlMod.default): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHAlign hAlign}.
      *
      * Defines the horizontal alignment of the column content.
      *
      * **Note:** Text controls with a `textAlign` property inherits the horizontal alignment.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Begin`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHAlign(): this.type = js.native
    def setHAlign(
      /**
      * New value for property `hAlign`
      */
    sHAlign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String
    ): this.type = js.native
    def setHAlign(/**
      * New value for property `hAlign`
      */
    sHAlign: TextAlign): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getHeader header}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeader(/**
      * The header to set
      */
    oHeader: typings.openui5.sapUiCoreControlMod.default): this.type = js.native
    
    def setHeaderMenu(
      /**
      * ID of an element which becomes the new target of this headerMenu association; alternatively, an element
      * instance may be given
      */
    oHeaderMenu: IColumnHeaderMenu
    ): this.type = js.native
    /**
      * @SINCE 1.98.0
      *
      * Sets the associated {@link #getHeaderMenu headerMenu}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeaderMenu(
      /**
      * ID of an element which becomes the new target of this headerMenu association; alternatively, an element
      * instance may be given
      */
    oHeaderMenu: ID
    ): this.type = js.native
    
    /**
      * @SINCE 1.76
      *
      * Sets a new value for property {@link #getImportance importance}.
      *
      * Defines the column importance.
      *
      * If the `sap.m.Table` control is configured with `autoPopinMode=true`, then the column importance is taken
      * into consideration for calculating the `minScreenWidth` property and for setting the `demandPopin` property
      * of the column. See {@link sap.m.Table#getAutoPopinMode}
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"None"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setImportance(): this.type = js.native
    def setImportance(
      /**
      * New value for property `importance`
      */
    sImportance: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Priority * / any */ String
    ): this.type = js.native
    def setImportance(/**
      * New value for property `importance`
      */
    sImportance: Priority): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Sets the visible column index Negative index values can be used to clear
      */
    def setIndex(/**
      * index of the visible column
      */
    nIndex: int): Unit = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Sets the initial order of the column
      */
    def setInitialOrder(/**
      * initial order of the column
      */
    nOrder: int): Unit = js.native
    
    /**
      * @SINCE 1.16
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Sets the last value of the column if mergeDuplicates property is true
      */
    def setLastValue(/**
      * Any Value
      */
    value: Any): this.type = js.native
    
    /**
      * @SINCE 1.16
      *
      * Sets a new value for property {@link #getMergeDuplicates mergeDuplicates}.
      *
      * Set `true` to merge repeating/duplicate cells into one cell block. See `mergeFunctionName` property to
      * customize.
      *
      * **Note:** Merging only happens when rendering the `sap.m.Table` control, subsequent changes on the cell
      * or item do not have any effect on the merged state of the cells, therefore this feature should not be
      * used together with two-way binding. This property is ignored if any column is configured to be shown
      * as a pop-in. Don't set this property for cells for which the content provides a user interaction, such
      * as `sap.m.Link`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMergeDuplicates(): this.type = js.native
    def setMergeDuplicates(/**
      * New value for property `mergeDuplicates`
      */
    bMergeDuplicates: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.16
      *
      * Sets a new value for property {@link #getMergeFunctionName mergeFunctionName}.
      *
      * Defines the control serialization function if `mergeDuplicates` property is set to `true`. The control
      * itself uses this function to compare values of two repeating cells. Default value "getText" is suitable
      * for `sap.m.Label` and `sap.m.Text` controls but for the `sap.ui.core.Icon` control "getSrc" function
      * should be used to merge icons. **Note:** You can pass one string parameter to given function after "#"
      * sign. e.g. "data#myparameter"
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'getText'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMergeFunctionName(): this.type = js.native
    def setMergeFunctionName(/**
      * New value for property `mergeFunctionName`
      */
    sMergeFunctionName: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMinScreenWidth minScreenWidth}.
      *
      * Defines the minimum screen width to show or hide this column. By default column is always shown. The
      * responsive behavior of the `sap.m.Table` is determined by this property. As an example by setting `minScreenWidth`
      * property to "40em" (or "640px" or "Tablet") shows this column on tablet (and desktop) but hides on mobile.
      * As you can give specific CSS sizes (e.g: "480px" or "40em"), you can also use the {@link sap.m.ScreenSize}
      * enumeration (e.g: "Phone", "Tablet", "Desktop", "Small", "Medium", "Large", ....). Please also see `demandPopin`
      * property for further responsive design options. **Note:** This property gets overwritten if the `sap.m.Table`
      * control is configured with `autoPopinMode=true`. See {@link sap.m.Table#getAutoPopinMode}
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMinScreenWidth(): this.type = js.native
    def setMinScreenWidth(/**
      * New value for property `minScreenWidth`
      */
    sMinScreenWidth: String): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Sets the order of the column Does not do the visual effect Table should be invalidate to re-render
      */
    def setOrder(/**
      * order of the column
      */
    nOrder: int): Unit = js.native
    
    /**
      * @SINCE 1.13.2
      *
      * Sets a new value for property {@link #getPopinDisplay popinDisplay}.
      *
      * Defines enumerated display options for the pop-in.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Block`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPopinDisplay(): this.type = js.native
    def setPopinDisplay(
      /**
      * New value for property `popinDisplay`
      */
    sPopinDisplay: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PopinDisplay * / any */ String
    ): this.type = js.native
    def setPopinDisplay(/**
      * New value for property `popinDisplay`
      */
    sPopinDisplay: PopinDisplay): this.type = js.native
    
    /**
      * @deprecated (since 1.14) - Use popinDisplay property instead.
      *
      * Sets a new value for property {@link #getPopinHAlign popinHAlign}.
      *
      * Horizontal alignment of the pop-in content. Available alignment settings are "Begin", "Center", "End",
      * "Left", and "Right".
      *
      * **Note:** Controls with a text align do not inherit the horizontal alignment.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Begin`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPopinHAlign(): this.type = js.native
    def setPopinHAlign(
      /**
      * New value for property `popinHAlign`
      */
    sPopinHAlign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String
    ): this.type = js.native
    def setPopinHAlign(/**
      * New value for property `popinHAlign`
      */
    sPopinHAlign: TextAlign): this.type = js.native
    
    /**
      * @SINCE 1.61
      *
      * Sets a new value for property {@link #getSortIndicator sortIndicator}.
      *
      * Defines if a column is sorted by setting the sort indicator for this column.
      *
      * **Note:** Defining this property does not trigger the sorting.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `None`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSortIndicator(): this.type = js.native
    def setSortIndicator(
      /**
      * New value for property `sortIndicator`
      */
    sSortIndicator: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SortOrder * / any */ String
    ): this.type = js.native
    def setSortIndicator(/**
      * New value for property `sortIndicator`
      */
    sSortIndicator: SortOrder): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getStyleClass styleClass}.
      *
      * CSS class name for column contents(header, cells and footer of column). This property can be used for
      * different column styling. If column is shown as pop-in then this class name is applied to related pop-in
      * row.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setStyleClass(): this.type = js.native
    def setStyleClass(/**
      * New value for property `styleClass`
      */
    sStyleClass: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getVAlign vAlign}.
      *
      * Defines the vertical alignment of the cells in a column. This property does not affect the vertical alignment
      * of header and footer.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Inherit`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVAlign(): this.type = js.native
    def setVAlign(
      /**
      * New value for property `vAlign`
      */
    sVAlign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VerticalAlign * / any */ String
    ): this.type = js.native
    def setVAlign(/**
      * New value for property `vAlign`
      */
    sVAlign: VerticalAlign): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getVisible visible}.
      *
      * Specifies whether or not the column is visible. Invisible columns are not rendered.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVisible(): this.type = js.native
    def setVisible(/**
      * New value for property `visible`
      */
    bVisible: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Defines the width of the column. If you leave it empty then this column covers the remaining space. **Note:**
      * When setting `autoPopinMode=true` on the table, the columns with a fixed width must either be in px,
      * rem, or em as the table internally calculates the `minScreenWidth` property for the column. If a column
      * has a fixed width, then this width is used to calculate the `minScreenWidth` for the `autoPopinMode`.
      * If a column has a flexible width, such as % or auto, the `autoPopinWidth` property is used to calculate
      * the `minScreenWidth`.
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
  
  trait ColumnSettings
    extends StObject
       with ElementSettings {
    
    /**
      * @SINCE 1.76
      *
      * Defines the auto pop-in width for the column.
      *
      * If the `sap.m.Table` control is configured with `autoPopinMode=true`, then the `autoPopinWidth` property
      * is used to calculate the `minScreenWidth` property of the column in case a fixed width is not set for
      * the column. See {@link sap.m.Column#getWidth} and {@link sap.m.Table#getAutoPopinMode}. **Note:** A float
      * value is set for the `autoPopinWidth` property which is internally treated as a rem value.
      */
    var autoPopinWidth: js.UndefOr[
        float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * According to your minScreenWidth settings, the column can be hidden in different screen sizes. Setting
      * this property to true, shows this column as pop-in instead of hiding it. **Note:** This property gets
      * overwritten if the `sap.m.Table` control is configured with `autoPopinMode=true`. See {@link sap.m.Table#getAutoPopinMode}
      */
    var demandPopin: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Control to be displayed in the column footer.
      */
    var footer: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * Defines the horizontal alignment of the column content.
      *
      * **Note:** Text controls with a `textAlign` property inherits the horizontal alignment.
      */
    var hAlign: js.UndefOr[
        TextAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Control to be displayed in the column header.
      */
    var header: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * @SINCE 1.98.0
      *
      * Provides a menu that is used by the column. The given menu has to follow the same pattern as the `sap.ui.core.IColumnHeaderMenu`
      * interface.
      */
    var headerMenu: js.UndefOr[IColumnHeaderMenu | String] = js.undefined
    
    /**
      * @SINCE 1.76
      *
      * Defines the column importance.
      *
      * If the `sap.m.Table` control is configured with `autoPopinMode=true`, then the column importance is taken
      * into consideration for calculating the `minScreenWidth` property and for setting the `demandPopin` property
      * of the column. See {@link sap.m.Table#getAutoPopinMode}
      */
    var importance: js.UndefOr[
        Priority | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Priority * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.16
      *
      * Set `true` to merge repeating/duplicate cells into one cell block. See `mergeFunctionName` property to
      * customize.
      *
      * **Note:** Merging only happens when rendering the `sap.m.Table` control, subsequent changes on the cell
      * or item do not have any effect on the merged state of the cells, therefore this feature should not be
      * used together with two-way binding. This property is ignored if any column is configured to be shown
      * as a pop-in. Don't set this property for cells for which the content provides a user interaction, such
      * as `sap.m.Link`.
      */
    var mergeDuplicates: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.16
      *
      * Defines the control serialization function if `mergeDuplicates` property is set to `true`. The control
      * itself uses this function to compare values of two repeating cells. Default value "getText" is suitable
      * for `sap.m.Label` and `sap.m.Text` controls but for the `sap.ui.core.Icon` control "getSrc" function
      * should be used to merge icons. **Note:** You can pass one string parameter to given function after "#"
      * sign. e.g. "data#myparameter"
      */
    var mergeFunctionName: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the minimum screen width to show or hide this column. By default column is always shown. The
      * responsive behavior of the `sap.m.Table` is determined by this property. As an example by setting `minScreenWidth`
      * property to "40em" (or "640px" or "Tablet") shows this column on tablet (and desktop) but hides on mobile.
      * As you can give specific CSS sizes (e.g: "480px" or "40em"), you can also use the {@link sap.m.ScreenSize}
      * enumeration (e.g: "Phone", "Tablet", "Desktop", "Small", "Medium", "Large", ....). Please also see `demandPopin`
      * property for further responsive design options. **Note:** This property gets overwritten if the `sap.m.Table`
      * control is configured with `autoPopinMode=true`. See {@link sap.m.Table#getAutoPopinMode}
      */
    var minScreenWidth: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.13.2
      *
      * Defines enumerated display options for the pop-in.
      */
    var popinDisplay: js.UndefOr[
        PopinDisplay | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PopinDisplay * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @deprecated (since 1.14) - Use popinDisplay property instead.
      *
      * Horizontal alignment of the pop-in content. Available alignment settings are "Begin", "Center", "End",
      * "Left", and "Right".
      *
      * **Note:** Controls with a text align do not inherit the horizontal alignment.
      */
    var popinHAlign: js.UndefOr[
        TextAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.61
      *
      * Defines if a column is sorted by setting the sort indicator for this column.
      *
      * **Note:** Defining this property does not trigger the sorting.
      */
    var sortIndicator: js.UndefOr[
        SortOrder | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SortOrder * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * CSS class name for column contents(header, cells and footer of column). This property can be used for
      * different column styling. If column is shown as pop-in then this class name is applied to related pop-in
      * row.
      */
    var styleClass: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the vertical alignment of the cells in a column. This property does not affect the vertical alignment
      * of header and footer.
      */
    var vAlign: js.UndefOr[
        VerticalAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VerticalAlign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Specifies whether or not the column is visible. Invisible columns are not rendered.
      */
    var visible: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the width of the column. If you leave it empty then this column covers the remaining space. **Note:**
      * When setting `autoPopinMode=true` on the table, the columns with a fixed width must either be in px,
      * rem, or em as the table internally calculates the `minScreenWidth` property for the column. If a column
      * has a fixed width, then this width is used to calculate the `minScreenWidth` for the `autoPopinMode`.
      * If a column has a flexible width, such as % or auto, the `autoPopinWidth` property is used to calculate
      * the `minScreenWidth`.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ColumnSettings {
    
    inline def apply(): ColumnSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColumnSettings] (val x: Self) extends AnyVal {
      
      inline def setAutoPopinWidth(value: float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "autoPopinWidth", value.asInstanceOf[js.Any])
      
      inline def setAutoPopinWidthUndefined: Self = StObject.set(x, "autoPopinWidth", js.undefined)
      
      inline def setDemandPopin(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "demandPopin", value.asInstanceOf[js.Any])
      
      inline def setDemandPopinUndefined: Self = StObject.set(x, "demandPopin", js.undefined)
      
      inline def setFooter(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setHAlign(
        value: TextAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "hAlign", value.asInstanceOf[js.Any])
      
      inline def setHAlignUndefined: Self = StObject.set(x, "hAlign", js.undefined)
      
      inline def setHeader(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderMenu(value: IColumnHeaderMenu | String): Self = StObject.set(x, "headerMenu", value.asInstanceOf[js.Any])
      
      inline def setHeaderMenuUndefined: Self = StObject.set(x, "headerMenu", js.undefined)
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setImportance(
        value: Priority | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Priority * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "importance", value.asInstanceOf[js.Any])
      
      inline def setImportanceUndefined: Self = StObject.set(x, "importance", js.undefined)
      
      inline def setMergeDuplicates(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "mergeDuplicates", value.asInstanceOf[js.Any])
      
      inline def setMergeDuplicatesUndefined: Self = StObject.set(x, "mergeDuplicates", js.undefined)
      
      inline def setMergeFunctionName(value: String | PropertyBindingInfo): Self = StObject.set(x, "mergeFunctionName", value.asInstanceOf[js.Any])
      
      inline def setMergeFunctionNameUndefined: Self = StObject.set(x, "mergeFunctionName", js.undefined)
      
      inline def setMinScreenWidth(value: String | PropertyBindingInfo): Self = StObject.set(x, "minScreenWidth", value.asInstanceOf[js.Any])
      
      inline def setMinScreenWidthUndefined: Self = StObject.set(x, "minScreenWidth", js.undefined)
      
      inline def setPopinDisplay(
        value: PopinDisplay | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PopinDisplay * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "popinDisplay", value.asInstanceOf[js.Any])
      
      inline def setPopinDisplayUndefined: Self = StObject.set(x, "popinDisplay", js.undefined)
      
      inline def setPopinHAlign(
        value: TextAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "popinHAlign", value.asInstanceOf[js.Any])
      
      inline def setPopinHAlignUndefined: Self = StObject.set(x, "popinHAlign", js.undefined)
      
      inline def setSortIndicator(
        value: SortOrder | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SortOrder * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "sortIndicator", value.asInstanceOf[js.Any])
      
      inline def setSortIndicatorUndefined: Self = StObject.set(x, "sortIndicator", js.undefined)
      
      inline def setStyleClass(value: String | PropertyBindingInfo): Self = StObject.set(x, "styleClass", value.asInstanceOf[js.Any])
      
      inline def setStyleClassUndefined: Self = StObject.set(x, "styleClass", js.undefined)
      
      inline def setVAlign(
        value: VerticalAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VerticalAlign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "vAlign", value.asInstanceOf[js.Any])
      
      inline def setVAlignUndefined: Self = StObject.set(x, "vAlign", js.undefined)
      
      inline def setVisible(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
