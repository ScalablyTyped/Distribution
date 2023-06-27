package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiLayoutLibraryMod.GridIndent
import typings.openui5.sapUiLayoutLibraryMod.GridPosition
import typings.openui5.sapUiLayoutLibraryMod.GridSpan
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiLayoutGridMod {
  
  @JSImport("sap/ui/layout/Grid", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `Grid`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/grid-layout/#responsive-grid Grid}
    * 	{@link https://ui5.sap.com/#/topic/43ae317cf39640a88bc8be979d2671df Grid}
    * 	{@link https://ui5.sap.com/#/topic/32d4b9c2b981425dbc374d3e9d5d0c2e Grid Controls}
    */
  open class default () extends Grid {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: GridSettings) = this()
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
    mSettings: GridSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: GridSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/layout/Grid", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.layout.Grid with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, Grid]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Grid],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.layout.Grid.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Grid
    extends typings.openui5.sapUiCoreControlMod.default {
    
    def addAriaLabelledBy(
      /**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * @since 1.48.7
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
    oContent: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Destroys all the content in the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContent(): this.type = js.native
    
    /**
      * @since 1.48.7
      *
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Gets current value of property {@link #getContainerQuery containerQuery}.
      *
      * If set to `true`, the current range (large, medium or small) is defined by the size of the container
      * surrounding the `Grid` instead of the device screen size (media Query).
      *
      * Default value is `false`.
      *
      * @returns Value of property `containerQuery`
      */
    def getContainerQuery(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * Controls that are placed into Grid layout.
      */
    def getContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getDefaultIndent defaultIndent}.
      *
      * Optional. Defines default for the whole Grid numbers of empty columns before the current span begins.
      * It can be defined for large, medium and small screens. Allowed values are separated by space Letters
      * L, M or S followed by number of columns from 0 to 11 that the container has to take, for example, `L2
      * M4 S6`, `M11`, `s10` or `l4 m4`.
      *
      * **Note:** The parameters must be provided in the order .
      *
      * Default value is `"XL0 L0 M0 S0"`.
      *
      * @returns Value of property `defaultIndent`
      */
    def getDefaultIndent(): GridIndent = js.native
    
    /**
      * Gets current value of property {@link #getDefaultSpan defaultSpan}.
      *
      * Optional. A string type that represents the span values of the `Grid` for large, medium and small screens.
      * Allowed values are separated by space Letters L, M or S followed by number of columns from 1 to 12 that
      * the container has to take, for example, `L2 M4 S6`, `M12`, `s10` or `l4 m4`.
      *
      * **Note:** The parameters must be provided in the order .
      *
      * Default value is `"XL3 L3 M6 S12"`.
      *
      * @returns Value of property `defaultSpan`
      */
    def getDefaultSpan(): GridSpan = js.native
    
    /**
      * Gets current value of property {@link #getHSpacing hSpacing}.
      *
      * Optional. Defines the horizontal spacing between the content in the `Grid`. In rem, allowed values are
      * 0, 0.5 , 1 or 2.
      *
      * Default value is `1`.
      *
      * @returns Value of property `hSpacing`
      */
    def getHSpacing(): float = js.native
    
    /**
      * Gets current value of property {@link #getPosition position}.
      *
      * Optional. Defines the position of the `Grid` in the window or surrounding container.
      *
      * Default value is `"Left"`.
      *
      * @returns Value of property `position`
      */
    def getPosition(): GridPosition | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GridPosition * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getVSpacing vSpacing}.
      *
      * Optional. Defines the vertical spacing between the rows in the `Grid`. In rem, allowed values are 0,
      * 0.5, 1 and 2.
      *
      * Default value is `1`.
      *
      * @returns Value of property `vSpacing`
      */
    def getVSpacing(): float = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Optional. Defines the width of the `Grid`. If not specified, then 100%.
      *
      * Default value is `'100%'`.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getContent content}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfContent(
      /**
      * The content whose index is looked for
      */
    oContent: typings.openui5.sapUiCoreControlMod.default
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
    oContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the content should be inserted at; for a negative value of `iIndex`, the content
      * is inserted at position 0; for a value greater than the current size of the aggregation, the content
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * @since 1.48.7
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
    def removeAllContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * @since 1.48.7
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
    vContent: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a content from the aggregation {@link #getContent content}.
      *
      * @returns The removed content or `null`
      */
    def removeContent(/**
      * The content to remove or its index or id
      */
    vContent: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeContent(
      /**
      * The content to remove or its index or id
      */
    vContent: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getContainerQuery containerQuery}.
      *
      * If set to `true`, the current range (large, medium or small) is defined by the size of the container
      * surrounding the `Grid` instead of the device screen size (media Query).
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
      * Sets a new value for property {@link #getDefaultIndent defaultIndent}.
      *
      * Optional. Defines default for the whole Grid numbers of empty columns before the current span begins.
      * It can be defined for large, medium and small screens. Allowed values are separated by space Letters
      * L, M or S followed by number of columns from 0 to 11 that the container has to take, for example, `L2
      * M4 S6`, `M11`, `s10` or `l4 m4`.
      *
      * **Note:** The parameters must be provided in the order .
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"XL0 L0 M0 S0"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDefaultIndent(): this.type = js.native
    def setDefaultIndent(/**
      * New value for property `defaultIndent`
      */
    sDefaultIndent: GridIndent): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDefaultSpan defaultSpan}.
      *
      * Optional. A string type that represents the span values of the `Grid` for large, medium and small screens.
      * Allowed values are separated by space Letters L, M or S followed by number of columns from 1 to 12 that
      * the container has to take, for example, `L2 M4 S6`, `M12`, `s10` or `l4 m4`.
      *
      * **Note:** The parameters must be provided in the order .
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"XL3 L3 M6 S12"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDefaultSpan(): this.type = js.native
    def setDefaultSpan(/**
      * New value for property `defaultSpan`
      */
    sDefaultSpan: GridSpan): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHSpacing hSpacing}.
      *
      * Optional. Defines the horizontal spacing between the content in the `Grid`. In rem, allowed values are
      * 0, 0.5 , 1 or 2.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `1`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHSpacing(): this.type = js.native
    def setHSpacing(/**
      * New value for property `hSpacing`
      */
    fHSpacing: float): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getPosition position}.
      *
      * Optional. Defines the position of the `Grid` in the window or surrounding container.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"Left"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPosition(): this.type = js.native
    def setPosition(
      /**
      * New value for property `position`
      */
    sPosition: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GridPosition * / any */ String
    ): this.type = js.native
    def setPosition(/**
      * New value for property `position`
      */
    sPosition: GridPosition): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getVSpacing vSpacing}.
      *
      * Optional. Defines the vertical spacing between the rows in the `Grid`. In rem, allowed values are 0,
      * 0.5, 1 and 2.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `1`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVSpacing(): this.type = js.native
    def setVSpacing(/**
      * New value for property `vSpacing`
      */
    fVSpacing: float): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Optional. Defines the width of the `Grid`. If not specified, then 100%.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'100%'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(): this.type = js.native
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
  }
  
  trait GridSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @since 1.48.7
      *
      * Association to controls / IDs that label this control (see WAI-ARIA attribute `aria-labelledby`).
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * If set to `true`, the current range (large, medium or small) is defined by the size of the container
      * surrounding the `Grid` instead of the device screen size (media Query).
      */
    var containerQuery: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Controls that are placed into Grid layout.
      */
    var content: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Optional. Defines default for the whole Grid numbers of empty columns before the current span begins.
      * It can be defined for large, medium and small screens. Allowed values are separated by space Letters
      * L, M or S followed by number of columns from 0 to 11 that the container has to take, for example, `L2
      * M4 S6`, `M11`, `s10` or `l4 m4`.
      *
      * **Note:** The parameters must be provided in the order .
      */
    var defaultIndent: js.UndefOr[
        GridIndent | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Optional. A string type that represents the span values of the `Grid` for large, medium and small screens.
      * Allowed values are separated by space Letters L, M or S followed by number of columns from 1 to 12 that
      * the container has to take, for example, `L2 M4 S6`, `M12`, `s10` or `l4 m4`.
      *
      * **Note:** The parameters must be provided in the order .
      */
    var defaultSpan: js.UndefOr[
        GridSpan | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Optional. Defines the horizontal spacing between the content in the `Grid`. In rem, allowed values are
      * 0, 0.5 , 1 or 2.
      */
    var hSpacing: js.UndefOr[
        float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Optional. Defines the position of the `Grid` in the window or surrounding container.
      */
    var position: js.UndefOr[
        GridPosition | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GridPosition * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Optional. Defines the vertical spacing between the rows in the `Grid`. In rem, allowed values are 0,
      * 0.5, 1 and 2.
      */
    var vSpacing: js.UndefOr[
        float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Optional. Defines the width of the `Grid`. If not specified, then 100%.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object GridSettings {
    
    inline def apply(): GridSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GridSettings] (val x: Self) extends AnyVal {
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setContainerQuery(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "containerQuery", value.asInstanceOf[js.Any])
      
      inline def setContainerQueryUndefined: Self = StObject.set(x, "containerQuery", js.undefined)
      
      inline def setContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setDefaultIndent(value: GridIndent | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "defaultIndent", value.asInstanceOf[js.Any])
      
      inline def setDefaultIndentUndefined: Self = StObject.set(x, "defaultIndent", js.undefined)
      
      inline def setDefaultSpan(value: GridSpan | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "defaultSpan", value.asInstanceOf[js.Any])
      
      inline def setDefaultSpanUndefined: Self = StObject.set(x, "defaultSpan", js.undefined)
      
      inline def setHSpacing(value: float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "hSpacing", value.asInstanceOf[js.Any])
      
      inline def setHSpacingUndefined: Self = StObject.set(x, "hSpacing", js.undefined)
      
      inline def setPosition(
        value: GridPosition | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GridPosition * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setVSpacing(value: float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "vSpacing", value.asInstanceOf[js.Any])
      
      inline def setVSpacingUndefined: Self = StObject.set(x, "vSpacing", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
