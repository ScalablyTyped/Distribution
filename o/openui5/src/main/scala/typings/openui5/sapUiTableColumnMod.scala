package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.HorizontalAlign
import typings.openui5.sapUiCoreLibraryMod.IColumnHeaderMenu
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiTableLibraryMod.SortOrder
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiTableColumnMod {
  
  @JSImport("sap/ui/table/Column", JSImport.Default)
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
      * Initial settings for the new control
      */
    mSettings: ColumnSettings) = this()
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
    mSettings: ColumnSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ColumnSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/table/Column", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.table.Column with name `sClassName` and enriches it with the information
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
      * Returns a metadata object for class sap.ui.table.Column.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Column
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * @since 1.13.1
      *
      * Adds some multiLabel to the aggregation {@link #getMultiLabels multiLabels}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addMultiLabel(
      /**
      * The multiLabel to add; if empty, nothing is inserted
      */
    oMultiLabel: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * @since 1.33.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:columnMenuOpen columnMenuOpen} event of this
      * `sap.ui.table.Column`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.table.Column` itself.
      *
      * Fires before the column menu is opened.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachColumnMenuOpen(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ColumnColumnMenuOpenEvent, Unit]
    ): this.type = js.native
    def attachColumnMenuOpen(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ColumnColumnMenuOpenEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.table.Column` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @since 1.33.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:columnMenuOpen columnMenuOpen} event of this
      * `sap.ui.table.Column`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.table.Column` itself.
      *
      * Fires before the column menu is opened.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachColumnMenuOpen(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ColumnColumnMenuOpenEvent, Unit]
    ): this.type = js.native
    def attachColumnMenuOpen(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ColumnColumnMenuOpenEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.table.Column` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys the label in the aggregation {@link #getLabel label}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyLabel(): this.type = js.native
    
    /**
      * Destroys the menu in the aggregation {@link #getMenu menu}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyMenu(): this.type = js.native
    
    /**
      * @since 1.13.1
      *
      * Destroys all the multiLabels in the aggregation {@link #getMultiLabels multiLabels}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyMultiLabels(): this.type = js.native
    
    /**
      * Destroys the template in the aggregation {@link #getTemplate template}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyTemplate(): this.type = js.native
    
    /**
      * @since 1.33.0
      *
      * Detaches event handler `fnFunction` from the {@link #event:columnMenuOpen columnMenuOpen} event of this
      * `sap.ui.table.Column`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachColumnMenuOpen(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ColumnColumnMenuOpenEvent, Unit]
    ): this.type = js.native
    def detachColumnMenuOpen(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ColumnColumnMenuOpenEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.33.0
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:columnMenuOpen columnMenuOpen} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireColumnMenuOpen(): Boolean = js.native
    def fireColumnMenuOpen(
      /**
      * Parameters to pass along with the event
      */
    mParameters: Column$ColumnMenuOpenEventParameters
    ): Boolean = js.native
    
    /**
      * @since 1.21.1
      *
      * Gets current value of property {@link #getAutoResizable autoResizable}.
      *
      * Enables auto-resizing of the column on double clicking the resize bar. The width is determined on the
      * widest currently displayed content. It does not consider rows which are currently not scrolled into view.
      * Currently only implemented to work with the following controls: `sap.m.Text, sap.m.Label, sap.m.Link,
      * sap.m.Input, sap.ui.commons.TextView, sap.ui.commons.Label, sap.ui.commons.Link and sap.ui.commons.TextField,
      * sap.ui.commons.Checkbox, sap.m.CheckBox`
      *
      * Default value is `false`.
      *
      * @returns Value of property `autoResizable`
      */
    def getAutoResizable(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getDefaultFilterOperator defaultFilterOperator}.
      *
      * If this property is set, the default filter operator of the column is overridden. By default `Contains`
      * is used for string and `EQ` for other types. A valid `sap.ui.model.FilterOperator` needs to be passed.
      *
      * @returns Value of property `defaultFilterOperator`
      */
    def getDefaultFilterOperator(): String = js.native
    
    /**
      * Gets current value of property {@link #getFilterOperator filterOperator}.
      *
      * Filter operator to use when filtering this column.
      *
      * @returns Value of property `filterOperator`
      */
    def getFilterOperator(): String = js.native
    
    /**
      * Gets current value of property {@link #getFilterProperty filterProperty}.
      *
      * Specifies the binding property on which the column shall be filtered. Since the column template may have
      * composite bindings, it's not possible to figure out on which binding property the filter shall be applied.
      * Therefore the binding property for filtering must be specified. For example, if the first name and last
      * name are displayed in the same column, only one of the two can be defined as `filterProperty`.
      *
      * A column menu entry for filtering can only be generated if the `filterProperty` is set. The default menu
      * entry is a text input field.
      *
      * @returns Value of property `filterProperty`
      */
    def getFilterProperty(): String = js.native
    
    /**
      * @since 1.9.2
      *
      * Gets current value of property {@link #getFilterType filterType}.
      *
      * Type of filter. It is used to transform the search term into the specified type and should be the same
      * as defined in the binding for the column template. Default value is `sap.ui.model.type.String`. It can
      * be set to the class name of the type, e.g.: `sap.ui.model.type.Date`, or an expression similar to the
      * binding syntax, e.g.: `"\{type: 'sap.ui.model.type.Date', formatOptions: \{UTC: true\}, constraints:
      * \{\} \}"`. Here the escaping is mandatory to avoid handling by the binding parser. As an alternative,
      * a function can be passed that takes over the conversion. This cannot be done in the XMLView, use {@link #setFilterType }
      * instead.
      *
      * @returns Value of property `filterType`
      */
    def getFilterType(): Any = js.native
    
    /**
      * Gets current value of property {@link #getFilterValue filterValue}.
      *
      * Specifies the value of the filter as string (will be converted into the proper data type). It is possible
      * to provide a filterOperator as string, as shown here:
      * ```javascript
      *
      * > 50
      * < 100
      * >= 150
      * <= 200
      * = 250
      * != 300
      * something    ends with
      * something*    starts with
      * something*   contains
      * some..thing   between
      * 50..100       between
      * ```
      *
      *
      * @returns Value of property `filterValue`
      */
    def getFilterValue(): String = js.native
    
    /**
      * Gets current value of property {@link #getFiltered filtered}.
      *
      * Indicates if the column is filtered. This property only controls if a filter indicator is displayed in
      * the column header - it does not trigger the filter function. The column can be filtered using {@link sap.ui.table.Table#filter}.
      *
      * Default value is `false`.
      *
      * @returns Value of property `filtered`
      */
    def getFiltered(): Boolean = js.native
    
    /**
      * @deprecated (since 1.44) - this property has no effect. Use the property `minWidth` in combination with
      * the property `width="auto"` instead.
      *
      * Gets current value of property {@link #getFlexible flexible}.
      *
      * If the table is wider than the sum of widths of the visible columns, the columns will be resized proportionally
      * to their widths that were set originally. If set to false, the column will be displayed in the original
      * width. If all columns are set to not be flexible, an extra "dummy" column will be created at the end
      * of the table.
      *
      * Default value is `true`.
      *
      * @returns Value of property `flexible`
      */
    def getFlexible(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getGrouped grouped}.
      *
      * Indicates if the column is grouped.
      *
      * Default value is `false`.
      *
      * @returns Value of property `grouped`
      */
    def getGrouped(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getHAlign hAlign}.
      *
      * Horizontal alignment of the column content. Controls with a text align do not inherit the horizontal
      * alignment. You have to set the text align directly on the template.
      *
      * Default value is `Begin`.
      *
      * @returns Value of property `hAlign`
      */
    def getHAlign(): HorizontalAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HorizontalAlign * / any */ String) = js.native
    
    /**
      * @since 1.110
      *
      * ID of the element which is the current target of the association {@link #getHeaderMenu headerMenu}, or
      * `null`.
      */
    def getHeaderMenu(): ID = js.native
    
    /**
      * Gets current value of property {@link #getHeaderSpan headerSpan}.
      *
      * If this property is set, a span is applied for the header. When moving columns, all columns which are
      * part of the header will be moved. The `headerSpan` can be either an integer or an array of integers (if
      * you use the multi header feature of the table). If you only specify an integer, this span is applied
      * for all header rows, with multiple integers you can specify a separate span for each header row. **Note:**
      * Only columns with a span equal to 1 can have a column menu. When setting a column to fixed, all columns
      * which are part of the header with the greatest span will be set to fixed.
      *
      * Default value is `1`.
      *
      * @returns Value of property `headerSpan`
      */
    def getHeaderSpan(): Any = js.native
    
    /**
      * Gets content of aggregation {@link #getLabel label}.
      *
      * Label of the column which is displayed in the column header. This aggregation is for the standard behavior,
      * where you only want to display one single row header. If a string is supplied, a default label control
      * will be created. Which control this is depends on the loaded libraries.
      */
    def getLabel(): typings.openui5.sapUiCoreControlMod.default | String = js.native
    
    /**
      * Gets content of aggregation {@link #getMenu menu}.
      *
      * The menu used by the column. By default the {@link sap.ui.table.ColumnMenu} is used.
      *
      * **Note:** Applications must not use or change the default `sap.ui.table.ColumnMenu` of a column in any
      * way or create own instances of `sap.ui.table.ColumnMenu`. To add a custom menu to a column, use the aggregation
      * `menu` with a new instance of `sap.ui.unified.Menu`.
      */
    def getMenu(): typings.openui5.sapUiUnifiedMenuMod.default = js.native
    
    /**
      * @since 1.44.1
      *
      * Gets current value of property {@link #getMinWidth minWidth}.
      *
      * Defines the minimum width of a column in pixels. This property only has an effect if the given column
      * width is flexible, for example with width `auto`. This property only influences the automatic behavior.
      * If a user adjusts the column width manually, the column width can become smaller. Minimal column width
      * is device-dependent, for example on desktop devices the column will not be smaller than 48px.
      *
      * Default value is `0`.
      *
      * @returns Value of property `minWidth`
      */
    def getMinWidth(): int = js.native
    
    /**
      * @since 1.13.1
      *
      * Gets content of aggregation {@link #getMultiLabels multiLabels}.
      *
      * Labels of the column which are displayed in the column header. Define a control for each header row in
      * the table. Use this aggregation if you want to use multiple headers per column.
      */
    def getMultiLabels(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * @since 1.11.1
      *
      * Gets current value of property {@link #getName name}.
      *
      * The name of the column which is used for the text representation of this column, for example, in menus.
      * If not set, the text from the multiLabels aggregation or the label aggregation (in that order) is used
      * as a fallback option.
      *
      * @returns Value of property `name`
      */
    def getName(): String = js.native
    
    /**
      * Gets current value of property {@link #getResizable resizable}.
      *
      * If set to true, the column can be resized either using the resize bar (by mouse) or using the keyboard
      * (SHIFT + Left/Right Arrow keys)
      *
      * Default value is `true`.
      *
      * @returns Value of property `resizable`
      */
    def getResizable(): Boolean = js.native
    
    /**
      * @since 1.13.0
      *
      * Gets current value of property {@link #getShowFilterMenuEntry showFilterMenuEntry}.
      *
      * Defines if the filter menu entry is displayed
      *
      * Default value is `true`.
      *
      * @returns Value of property `showFilterMenuEntry`
      */
    def getShowFilterMenuEntry(): Boolean = js.native
    
    /**
      * @since 1.13.0
      *
      * Gets current value of property {@link #getShowSortMenuEntry showSortMenuEntry}.
      *
      * Defines if the sort menu entries are displayed
      *
      * Default value is `true`.
      *
      * @returns Value of property `showSortMenuEntry`
      */
    def getShowSortMenuEntry(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getSortOrder sortOrder}.
      *
      * This property indicates the sort direction (Ascending or Descending). The corresponding icon will be
      * rendered if the property `sorted` is `true`
      *
      * Default value is `Ascending`.
      *
      * @returns Value of property `sortOrder`
      */
    def getSortOrder(): SortOrder | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SortOrder * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getSortProperty sortProperty}.
      *
      * Specifies the binding property on which the column will sort. Since the column template may have composite
      * bindings, it's not possible to figure out on which binding property the sort shall be applied. Therefore
      * the binding property for sorting must be specified. For example, if the first name and last name are
      * displayed in the same column, only one of the two can be defined as `sortProperty`.
      *
      * A column menu entry for sorting can only be generated if the `sortProperty` is set.
      *
      * @returns Value of property `sortProperty`
      */
    def getSortProperty(): String = js.native
    
    /**
      * Gets current value of property {@link #getSorted sorted}.
      *
      * Indicates if the column is sorted. This property only controls if a sort indicator is displayed in the
      * column header - it does not trigger the sort function. The column can be sorted using {@link sap.ui.table.Table#sort}.
      *
      * Default value is `false`.
      *
      * @returns Value of property `sorted`
      */
    def getSorted(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getTemplate template}.
      *
      * Template (cell renderer) of this column. A template is decoupled from the column. Each time the template's
      * properties or aggregations have been changed, the template has to be applied again via `setTemplate`
      * for the changes to take effect. If a string is defined, a default text control will be created with its
      * text property bound to the value of the string. The default template depends on the libraries loaded.
      * If there is no template, the column will not be rendered in the table. The set of supported controls
      * is limited. See section "{@link https://ui5.sap.com/#/topic/148892ff9aea4a18b912829791e38f3e Tables: Which One Should I Choose?}"
      * in the documentation for more details. While it is technically possible to also use other controls, doing
      * so might lead to issues with regards to scrolling, alignment, condensed mode, screen reader support,
      * and keyboard support.
      */
    def getTemplate(): typings.openui5.sapUiCoreControlMod.default | String = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Returns a template clone. It either finds an unused clone or clones a new one from the template.
      *
      * @returns Clone of the template, or `null` if no template is defined
      */
    def getTemplateClone(/**
      * Index of the column in the columns aggregation of the table
      */
    iIndex: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * Gets current value of property {@link #getVisible visible}.
      *
      * Invisible controls are not rendered.
      *
      * Default value is `true`.
      *
      * @returns Value of property `visible`
      */
    def getVisible(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Width of the column in CSS units. Default value is `auto`, see
      * Minimal column width is device-dependent, for example on desktop devices the column will not be smaller
      * than 48px. This property can be changed by the user or by the application configuration/personalization.
      * If a user adjusts the column width manually, the resulting value is always set in pixels. In addition,
      * other columns with width `auto` get a fixed minimum width and do not shrink after the resizing.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * @since 1.13.1
      *
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getMultiLabels multiLabels}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfMultiLabel(
      /**
      * The multiLabel whose index is looked for
      */
    oMultiLabel: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * @since 1.13.1
      *
      * Inserts a multiLabel into the aggregation {@link #getMultiLabels multiLabels}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertMultiLabel(
      /**
      * The multiLabel to insert; if empty, nothing is inserted
      */
    oMultiLabel: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the multiLabel should be inserted at; for a negative value of `iIndex`, the multiLabel
      * is inserted at position 0; for a value greater than the current size of the aggregation, the multiLabel
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * @since 1.13.1
      *
      * Removes all the controls from the aggregation {@link #getMultiLabels multiLabels}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllMultiLabels(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    def removeMultiLabel(/**
      * The multiLabel to remove or its index or id
      */
    vMultiLabel: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * @since 1.13.1
      *
      * Removes a multiLabel from the aggregation {@link #getMultiLabels multiLabels}.
      *
      * @returns The removed multiLabel or `null`
      */
    def removeMultiLabel(/**
      * The multiLabel to remove or its index or id
      */
    vMultiLabel: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeMultiLabel(
      /**
      * The multiLabel to remove or its index or id
      */
    vMultiLabel: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * @since 1.21.1
      *
      * Sets a new value for property {@link #getAutoResizable autoResizable}.
      *
      * Enables auto-resizing of the column on double clicking the resize bar. The width is determined on the
      * widest currently displayed content. It does not consider rows which are currently not scrolled into view.
      * Currently only implemented to work with the following controls: `sap.m.Text, sap.m.Label, sap.m.Link,
      * sap.m.Input, sap.ui.commons.TextView, sap.ui.commons.Label, sap.ui.commons.Link and sap.ui.commons.TextField,
      * sap.ui.commons.Checkbox, sap.m.CheckBox`
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAutoResizable(): this.type = js.native
    def setAutoResizable(/**
      * New value for property `autoResizable`
      */
    bAutoResizable: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDefaultFilterOperator defaultFilterOperator}.
      *
      * If this property is set, the default filter operator of the column is overridden. By default `Contains`
      * is used for string and `EQ` for other types. A valid `sap.ui.model.FilterOperator` needs to be passed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDefaultFilterOperator(): this.type = js.native
    def setDefaultFilterOperator(/**
      * New value for property `defaultFilterOperator`
      */
    sDefaultFilterOperator: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFilterOperator filterOperator}.
      *
      * Filter operator to use when filtering this column.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFilterOperator(): this.type = js.native
    def setFilterOperator(/**
      * New value for property `filterOperator`
      */
    sFilterOperator: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFilterProperty filterProperty}.
      *
      * Specifies the binding property on which the column shall be filtered. Since the column template may have
      * composite bindings, it's not possible to figure out on which binding property the filter shall be applied.
      * Therefore the binding property for filtering must be specified. For example, if the first name and last
      * name are displayed in the same column, only one of the two can be defined as `filterProperty`.
      *
      * A column menu entry for filtering can only be generated if the `filterProperty` is set. The default menu
      * entry is a text input field.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFilterProperty(): this.type = js.native
    def setFilterProperty(/**
      * New value for property `filterProperty`
      */
    sFilterProperty: String): this.type = js.native
    
    /**
      * The filter type can be the class name of a type, an expression similar to the binding syntax, or a function.
      * A function receives the entered filter value as a parameter and should return the appropriate value for
      * the filter expression.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFilterType(/**
      * The filter type
      */
    vType: Any): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFilterValue filterValue}.
      *
      * Specifies the value of the filter as string (will be converted into the proper data type). It is possible
      * to provide a filterOperator as string, as shown here:
      * ```javascript
      *
      * > 50
      * < 100
      * >= 150
      * <= 200
      * = 250
      * != 300
      * something    ends with
      * something*    starts with
      * something*   contains
      * some..thing   between
      * 50..100       between
      * ```
      *
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFilterValue(): this.type = js.native
    def setFilterValue(/**
      * New value for property `filterValue`
      */
    sFilterValue: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFiltered filtered}.
      *
      * Indicates if the column is filtered. This property only controls if a filter indicator is displayed in
      * the column header - it does not trigger the filter function. The column can be filtered using {@link sap.ui.table.Table#filter}.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFiltered(): this.type = js.native
    def setFiltered(/**
      * New value for property `filtered`
      */
    bFiltered: Boolean): this.type = js.native
    
    /**
      * @deprecated (since 1.44) - this property has no effect. Use the property `minWidth` in combination with
      * the property `width="auto"` instead.
      *
      * Sets a new value for property {@link #getFlexible flexible}.
      *
      * If the table is wider than the sum of widths of the visible columns, the columns will be resized proportionally
      * to their widths that were set originally. If set to false, the column will be displayed in the original
      * width. If all columns are set to not be flexible, an extra "dummy" column will be created at the end
      * of the table.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFlexible(): this.type = js.native
    def setFlexible(/**
      * New value for property `flexible`
      */
    bFlexible: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getGrouped grouped}.
      *
      * Indicates if the column is grouped.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGrouped(): this.type = js.native
    def setGrouped(/**
      * New value for property `grouped`
      */
    bGrouped: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHAlign hAlign}.
      *
      * Horizontal alignment of the column content. Controls with a text align do not inherit the horizontal
      * alignment. You have to set the text align directly on the template.
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
    sHAlign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HorizontalAlign * / any */ String
    ): this.type = js.native
    def setHAlign(/**
      * New value for property `hAlign`
      */
    sHAlign: HorizontalAlign): this.type = js.native
    
    def setHeaderMenu(
      /**
      * ID of an element which becomes the new target of this headerMenu association; alternatively, an element
      * instance may be given
      */
    oHeaderMenu: IColumnHeaderMenu
    ): this.type = js.native
    /**
      * @since 1.110
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
      * Sets a new value for property {@link #getHeaderSpan headerSpan}.
      *
      * If this property is set, a span is applied for the header. When moving columns, all columns which are
      * part of the header will be moved. The `headerSpan` can be either an integer or an array of integers (if
      * you use the multi header feature of the table). If you only specify an integer, this span is applied
      * for all header rows, with multiple integers you can specify a separate span for each header row. **Note:**
      * Only columns with a span equal to 1 can have a column menu. When setting a column to fixed, all columns
      * which are part of the header with the greatest span will be set to fixed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `1`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeaderSpan(): this.type = js.native
    def setHeaderSpan(/**
      * New value for property `headerSpan`
      */
    oHeaderSpan: Any): this.type = js.native
    
    def setLabel(/**
      * The label to set
      */
    vLabel: String): this.type = js.native
    /**
      * Sets the aggregated {@link #getLabel label}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLabel(/**
      * The label to set
      */
    vLabel: typings.openui5.sapUiCoreControlMod.default): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getMenu menu}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMenu(/**
      * The menu to set
      */
    oMenu: typings.openui5.sapUiUnifiedMenuMod.default): this.type = js.native
    
    /**
      * @since 1.44.1
      *
      * Sets a new value for property {@link #getMinWidth minWidth}.
      *
      * Defines the minimum width of a column in pixels. This property only has an effect if the given column
      * width is flexible, for example with width `auto`. This property only influences the automatic behavior.
      * If a user adjusts the column width manually, the column width can become smaller. Minimal column width
      * is device-dependent, for example on desktop devices the column will not be smaller than 48px.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `0`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMinWidth(): this.type = js.native
    def setMinWidth(/**
      * New value for property `minWidth`
      */
    iMinWidth: int): this.type = js.native
    
    /**
      * @since 1.11.1
      *
      * Sets a new value for property {@link #getName name}.
      *
      * The name of the column which is used for the text representation of this column, for example, in menus.
      * If not set, the text from the multiLabels aggregation or the label aggregation (in that order) is used
      * as a fallback option.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setName(): this.type = js.native
    def setName(/**
      * New value for property `name`
      */
    sName: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getResizable resizable}.
      *
      * If set to true, the column can be resized either using the resize bar (by mouse) or using the keyboard
      * (SHIFT + Left/Right Arrow keys)
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setResizable(): this.type = js.native
    def setResizable(/**
      * New value for property `resizable`
      */
    bResizable: Boolean): this.type = js.native
    
    /**
      * @since 1.13.0
      *
      * Sets a new value for property {@link #getShowFilterMenuEntry showFilterMenuEntry}.
      *
      * Defines if the filter menu entry is displayed
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowFilterMenuEntry(): this.type = js.native
    def setShowFilterMenuEntry(/**
      * New value for property `showFilterMenuEntry`
      */
    bShowFilterMenuEntry: Boolean): this.type = js.native
    
    /**
      * @since 1.13.0
      *
      * Sets a new value for property {@link #getShowSortMenuEntry showSortMenuEntry}.
      *
      * Defines if the sort menu entries are displayed
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowSortMenuEntry(): this.type = js.native
    def setShowSortMenuEntry(/**
      * New value for property `showSortMenuEntry`
      */
    bShowSortMenuEntry: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSortOrder sortOrder}.
      *
      * This property indicates the sort direction (Ascending or Descending). The corresponding icon will be
      * rendered if the property `sorted` is `true`
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Ascending`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSortOrder(): this.type = js.native
    def setSortOrder(
      /**
      * New value for property `sortOrder`
      */
    sSortOrder: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SortOrder * / any */ String
    ): this.type = js.native
    def setSortOrder(/**
      * New value for property `sortOrder`
      */
    sSortOrder: SortOrder): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSortProperty sortProperty}.
      *
      * Specifies the binding property on which the column will sort. Since the column template may have composite
      * bindings, it's not possible to figure out on which binding property the sort shall be applied. Therefore
      * the binding property for sorting must be specified. For example, if the first name and last name are
      * displayed in the same column, only one of the two can be defined as `sortProperty`.
      *
      * A column menu entry for sorting can only be generated if the `sortProperty` is set.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSortProperty(): this.type = js.native
    def setSortProperty(/**
      * New value for property `sortProperty`
      */
    sSortProperty: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSorted sorted}.
      *
      * Indicates if the column is sorted. This property only controls if a sort indicator is displayed in the
      * column header - it does not trigger the sort function. The column can be sorted using {@link sap.ui.table.Table#sort}.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSorted(): this.type = js.native
    def setSorted(/**
      * New value for property `sorted`
      */
    bSorted: Boolean): this.type = js.native
    
    def setTemplate(/**
      * The template to set
      */
    vTemplate: String): this.type = js.native
    /**
      * Sets the aggregated {@link #getTemplate template}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTemplate(/**
      * The template to set
      */
    vTemplate: typings.openui5.sapUiCoreControlMod.default): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getVisible visible}.
      *
      * Invisible controls are not rendered.
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
      * Width of the column in CSS units. Default value is `auto`, see
      * Minimal column width is device-dependent, for example on desktop devices the column will not be smaller
      * than 48px. This property can be changed by the user or by the application configuration/personalization.
      * If a user adjusts the column width manually, the resulting value is always set in pixels. In addition,
      * other columns with width `auto` get a fixed minimum width and do not shrink after the resizing.
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
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Returns whether the column should be rendered.
      *
      * @returns Returns `true`, if the column should be rendered
      */
    def shouldRender(): Boolean = js.native
    
    /**
      * @deprecated (since 1.5.1) - Please use the function "sap.ui.Table.prototype.sort".
      *
      * Sorts the current column ascending or descending.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def sort(
      /**
      * Sort order of the column (if undefined the default will be ascending)
      */
    bDescending: Boolean
    ): this.type = js.native
    
    /**
      * @deprecated (since 1.5.1) - Please use the function "sap.ui.Table.prototype.sort".
      *
      * Toggles the sort order of the column.
      */
    def toggleSort(): Unit = js.native
  }
  
  trait Column$ColumnMenuOpenEventParameters extends StObject {
    
    /**
      * Refence to the selected `menu` instance to be opened.
      */
    var menu: js.UndefOr[typings.openui5.sapUiUnifiedMenuMod.default] = js.undefined
  }
  object Column$ColumnMenuOpenEventParameters {
    
    inline def apply(): Column$ColumnMenuOpenEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Column$ColumnMenuOpenEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Column$ColumnMenuOpenEventParameters] (val x: Self) extends AnyVal {
      
      inline def setMenu(value: typings.openui5.sapUiUnifiedMenuMod.default): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
    }
  }
  
  type ColumnColumnMenuOpenEvent = typings.openui5.sapUiBaseEventMod.default[Column$ColumnMenuOpenEventParameters]
  
  type ColumnColumnMenuOpenEventParameters = Column$ColumnMenuOpenEventParameters
  
  trait ColumnSettings
    extends StObject
       with ElementSettings {
    
    /**
      * @since 1.21.1
      *
      * Enables auto-resizing of the column on double clicking the resize bar. The width is determined on the
      * widest currently displayed content. It does not consider rows which are currently not scrolled into view.
      * Currently only implemented to work with the following controls: `sap.m.Text, sap.m.Label, sap.m.Link,
      * sap.m.Input, sap.ui.commons.TextView, sap.ui.commons.Label, sap.ui.commons.Link and sap.ui.commons.TextField,
      * sap.ui.commons.Checkbox, sap.m.CheckBox`
      */
    var autoResizable: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.33.0
      *
      * Fires before the column menu is opened.
      */
    var columnMenuOpen: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Column$ColumnMenuOpenEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * If this property is set, the default filter operator of the column is overridden. By default `Contains`
      * is used for string and `EQ` for other types. A valid `sap.ui.model.FilterOperator` needs to be passed.
      */
    var defaultFilterOperator: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Filter operator to use when filtering this column.
      */
    var filterOperator: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Specifies the binding property on which the column shall be filtered. Since the column template may have
      * composite bindings, it's not possible to figure out on which binding property the filter shall be applied.
      * Therefore the binding property for filtering must be specified. For example, if the first name and last
      * name are displayed in the same column, only one of the two can be defined as `filterProperty`.
      *
      * A column menu entry for filtering can only be generated if the `filterProperty` is set. The default menu
      * entry is a text input field.
      */
    var filterProperty: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @since 1.9.2
      *
      * Type of filter. It is used to transform the search term into the specified type and should be the same
      * as defined in the binding for the column template. Default value is `sap.ui.model.type.String`. It can
      * be set to the class name of the type, e.g.: `sap.ui.model.type.Date`, or an expression similar to the
      * binding syntax, e.g.: `"\{type: 'sap.ui.model.type.Date', formatOptions: \{UTC: true\}, constraints:
      * \{\} \}"`. Here the escaping is mandatory to avoid handling by the binding parser. As an alternative,
      * a function can be passed that takes over the conversion. This cannot be done in the XMLView, use {@link #setFilterType }
      * instead.
      */
    var filterType: js.UndefOr[Any | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Specifies the value of the filter as string (will be converted into the proper data type). It is possible
      * to provide a filterOperator as string, as shown here:
      * ```javascript
      *
      * > 50
      * < 100
      * >= 150
      * <= 200
      * = 250
      * != 300
      * *something    ends with
      * something*    starts with
      * *something*   contains
      * some..thing   between
      * 50..100       between
      * ```
      */
    var filterValue: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Indicates if the column is filtered. This property only controls if a filter indicator is displayed in
      * the column header - it does not trigger the filter function. The column can be filtered using {@link sap.ui.table.Table#filter}.
      */
    var filtered: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @deprecated (since 1.44) - this property has no effect. Use the property `minWidth` in combination with
      * the property `width="auto"` instead.
      *
      * If the table is wider than the sum of widths of the visible columns, the columns will be resized proportionally
      * to their widths that were set originally. If set to false, the column will be displayed in the original
      * width. If all columns are set to not be flexible, an extra "dummy" column will be created at the end
      * of the table.
      */
    var flexible: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Indicates if the column is grouped.
      */
    var grouped: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Horizontal alignment of the column content. Controls with a text align do not inherit the horizontal
      * alignment. You have to set the text align directly on the template.
      */
    var hAlign: js.UndefOr[
        HorizontalAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HorizontalAlign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @since 1.110
      *
      * The menu that can be opened by the header element of this column.
      */
    var headerMenu: js.UndefOr[IColumnHeaderMenu | String] = js.undefined
    
    /**
      * If this property is set, a span is applied for the header. When moving columns, all columns which are
      * part of the header will be moved. The `headerSpan` can be either an integer or an array of integers (if
      * you use the multi header feature of the table). If you only specify an integer, this span is applied
      * for all header rows, with multiple integers you can specify a separate span for each header row. **Note:**
      * Only columns with a span equal to 1 can have a column menu. When setting a column to fixed, all columns
      * which are part of the header with the greatest span will be set to fixed.
      */
    var headerSpan: js.UndefOr[Any | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Label of the column which is displayed in the column header. This aggregation is for the standard behavior,
      * where you only want to display one single row header. If a string is supplied, a default label control
      * will be created. Which control this is depends on the loaded libraries.
      */
    var label: js.UndefOr[String | typings.openui5.sapUiCoreControlMod.default | PropertyBindingInfo] = js.undefined
    
    /**
      * The menu used by the column. By default the {@link sap.ui.table.ColumnMenu} is used.
      *
      * **Note:** Applications must not use or change the default `sap.ui.table.ColumnMenu` of a column in any
      * way or create own instances of `sap.ui.table.ColumnMenu`. To add a custom menu to a column, use the aggregation
      * `menu` with a new instance of `sap.ui.unified.Menu`.
      */
    var menu: js.UndefOr[typings.openui5.sapUiUnifiedMenuMod.default] = js.undefined
    
    /**
      * @since 1.44.1
      *
      * Defines the minimum width of a column in pixels. This property only has an effect if the given column
      * width is flexible, for example with width `auto`. This property only influences the automatic behavior.
      * If a user adjusts the column width manually, the column width can become smaller. Minimal column width
      * is device-dependent, for example on desktop devices the column will not be smaller than 48px.
      */
    var minWidth: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @since 1.13.1
      *
      * Labels of the column which are displayed in the column header. Define a control for each header row in
      * the table. Use this aggregation if you want to use multiple headers per column.
      */
    var multiLabels: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.11.1
      *
      * The name of the column which is used for the text representation of this column, for example, in menus.
      * If not set, the text from the multiLabels aggregation or the label aggregation (in that order) is used
      * as a fallback option.
      */
    var name: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * If set to true, the column can be resized either using the resize bar (by mouse) or using the keyboard
      * (SHIFT + Left/Right Arrow keys)
      */
    var resizable: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.13.0
      *
      * Defines if the filter menu entry is displayed
      */
    var showFilterMenuEntry: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.13.0
      *
      * Defines if the sort menu entries are displayed
      */
    var showSortMenuEntry: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * This property indicates the sort direction (Ascending or Descending). The corresponding icon will be
      * rendered if the property `sorted` is `true`
      */
    var sortOrder: js.UndefOr[
        SortOrder | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SortOrder * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Specifies the binding property on which the column will sort. Since the column template may have composite
      * bindings, it's not possible to figure out on which binding property the sort shall be applied. Therefore
      * the binding property for sorting must be specified. For example, if the first name and last name are
      * displayed in the same column, only one of the two can be defined as `sortProperty`.
      *
      * A column menu entry for sorting can only be generated if the `sortProperty` is set.
      */
    var sortProperty: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Indicates if the column is sorted. This property only controls if a sort indicator is displayed in the
      * column header - it does not trigger the sort function. The column can be sorted using {@link sap.ui.table.Table#sort}.
      */
    var sorted: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Template (cell renderer) of this column. A template is decoupled from the column. Each time the template's
      * properties or aggregations have been changed, the template has to be applied again via `setTemplate`
      * for the changes to take effect. If a string is defined, a default text control will be created with its
      * text property bound to the value of the string. The default template depends on the libraries loaded.
      * If there is no template, the column will not be rendered in the table. The set of supported controls
      * is limited. See section "{@link https://ui5.sap.com/#/topic/148892ff9aea4a18b912829791e38f3e Tables: Which One Should I Choose?}"
      * in the documentation for more details. While it is technically possible to also use other controls, doing
      * so might lead to issues with regards to scrolling, alignment, condensed mode, screen reader support,
      * and keyboard support.
      */
    var template: js.UndefOr[String | typings.openui5.sapUiCoreControlMod.default | PropertyBindingInfo] = js.undefined
    
    /**
      * Invisible controls are not rendered.
      */
    var visible: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Width of the column in CSS units. Default value is `auto`, see
      * Minimal column width is device-dependent, for example on desktop devices the column will not be smaller
      * than 48px. This property can be changed by the user or by the application configuration/personalization.
      * If a user adjusts the column width manually, the resulting value is always set in pixels. In addition,
      * other columns with width `auto` get a fixed minimum width and do not shrink after the resizing.
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
      
      inline def setAutoResizable(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "autoResizable", value.asInstanceOf[js.Any])
      
      inline def setAutoResizableUndefined: Self = StObject.set(x, "autoResizable", js.undefined)
      
      inline def setColumnMenuOpen(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Column$ColumnMenuOpenEventParameters] => Unit
      ): Self = StObject.set(x, "columnMenuOpen", js.Any.fromFunction1(value))
      
      inline def setColumnMenuOpenUndefined: Self = StObject.set(x, "columnMenuOpen", js.undefined)
      
      inline def setDefaultFilterOperator(value: String | PropertyBindingInfo): Self = StObject.set(x, "defaultFilterOperator", value.asInstanceOf[js.Any])
      
      inline def setDefaultFilterOperatorUndefined: Self = StObject.set(x, "defaultFilterOperator", js.undefined)
      
      inline def setFilterOperator(value: String | PropertyBindingInfo): Self = StObject.set(x, "filterOperator", value.asInstanceOf[js.Any])
      
      inline def setFilterOperatorUndefined: Self = StObject.set(x, "filterOperator", js.undefined)
      
      inline def setFilterProperty(value: String | PropertyBindingInfo): Self = StObject.set(x, "filterProperty", value.asInstanceOf[js.Any])
      
      inline def setFilterPropertyUndefined: Self = StObject.set(x, "filterProperty", js.undefined)
      
      inline def setFilterType(value: Any | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
      
      inline def setFilterTypeUndefined: Self = StObject.set(x, "filterType", js.undefined)
      
      inline def setFilterValue(value: String | PropertyBindingInfo): Self = StObject.set(x, "filterValue", value.asInstanceOf[js.Any])
      
      inline def setFilterValueUndefined: Self = StObject.set(x, "filterValue", js.undefined)
      
      inline def setFiltered(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "filtered", value.asInstanceOf[js.Any])
      
      inline def setFilteredUndefined: Self = StObject.set(x, "filtered", js.undefined)
      
      inline def setFlexible(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "flexible", value.asInstanceOf[js.Any])
      
      inline def setFlexibleUndefined: Self = StObject.set(x, "flexible", js.undefined)
      
      inline def setGrouped(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "grouped", value.asInstanceOf[js.Any])
      
      inline def setGroupedUndefined: Self = StObject.set(x, "grouped", js.undefined)
      
      inline def setHAlign(
        value: HorizontalAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HorizontalAlign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "hAlign", value.asInstanceOf[js.Any])
      
      inline def setHAlignUndefined: Self = StObject.set(x, "hAlign", js.undefined)
      
      inline def setHeaderMenu(value: IColumnHeaderMenu | String): Self = StObject.set(x, "headerMenu", value.asInstanceOf[js.Any])
      
      inline def setHeaderMenuUndefined: Self = StObject.set(x, "headerMenu", js.undefined)
      
      inline def setHeaderSpan(value: Any | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "headerSpan", value.asInstanceOf[js.Any])
      
      inline def setHeaderSpanUndefined: Self = StObject.set(x, "headerSpan", js.undefined)
      
      inline def setLabel(value: String | typings.openui5.sapUiCoreControlMod.default | PropertyBindingInfo): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setMenu(value: typings.openui5.sapUiUnifiedMenuMod.default): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
      
      inline def setMinWidth(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setMultiLabels(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "multiLabels", value.asInstanceOf[js.Any])
      
      inline def setMultiLabelsUndefined: Self = StObject.set(x, "multiLabels", js.undefined)
      
      inline def setMultiLabelsVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "multiLabels", js.Array(value*))
      
      inline def setName(value: String | PropertyBindingInfo): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setResizable(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
      
      inline def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
      
      inline def setShowFilterMenuEntry(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showFilterMenuEntry", value.asInstanceOf[js.Any])
      
      inline def setShowFilterMenuEntryUndefined: Self = StObject.set(x, "showFilterMenuEntry", js.undefined)
      
      inline def setShowSortMenuEntry(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showSortMenuEntry", value.asInstanceOf[js.Any])
      
      inline def setShowSortMenuEntryUndefined: Self = StObject.set(x, "showSortMenuEntry", js.undefined)
      
      inline def setSortOrder(
        value: SortOrder | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SortOrder * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
      
      inline def setSortProperty(value: String | PropertyBindingInfo): Self = StObject.set(x, "sortProperty", value.asInstanceOf[js.Any])
      
      inline def setSortPropertyUndefined: Self = StObject.set(x, "sortProperty", js.undefined)
      
      inline def setSorted(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "sorted", value.asInstanceOf[js.Any])
      
      inline def setSortedUndefined: Self = StObject.set(x, "sorted", js.undefined)
      
      inline def setTemplate(value: String | typings.openui5.sapUiCoreControlMod.default | PropertyBindingInfo): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setVisible(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
