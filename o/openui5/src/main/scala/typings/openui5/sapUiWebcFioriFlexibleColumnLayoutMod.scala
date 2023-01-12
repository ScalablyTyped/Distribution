package typings.openui5

import typings.openui5.anon.ArrowsUsed
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiWebcFioriLibraryMod.FCLLayout
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcFioriFlexibleColumnLayoutMod {
  
  @JSImport("sap/ui/webc/fiori/FlexibleColumnLayout", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `FlexibleColumnLayout`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends FlexibleColumnLayout {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: FlexibleColumnLayoutSettings) = this()
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
    mSettings: FlexibleColumnLayoutSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: FlexibleColumnLayoutSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/webc/fiori/FlexibleColumnLayout", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.fiori.FlexibleColumnLayout with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.webc.common.WebComponent.extend}.
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
    oClassInfo: ClassInfo[T, FlexibleColumnLayout]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, FlexibleColumnLayout],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.webc.fiori.FlexibleColumnLayout.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait FlexibleColumnLayout
    extends typings.openui5.sapUiWebcCommonWebComponentMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:layoutChange layoutChange} event of this `sap.ui.webc.fiori.FlexibleColumnLayout`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.FlexibleColumnLayout` itself.
      *
      * Fired when the layout changes via user interaction by clicking the arrows or by changing the component
      * size due to resizing.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.FlexibleColumnLayout`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:layoutChange layoutChange} event of this `sap.ui.webc.fiori.FlexibleColumnLayout`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.FlexibleColumnLayout` itself.
      *
      * Fired when the layout changes via user interaction by clicking the arrows or by changing the component
      * size due to resizing.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.FlexibleColumnLayout`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys the endColumn in the aggregation {@link #getEndColumn endColumn}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyEndColumn(): this.type = js.native
    
    /**
      * Destroys the midColumn in the aggregation {@link #getMidColumn midColumn}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyMidColumn(): this.type = js.native
    
    /**
      * Destroys the startColumn in the aggregation {@link #getStartColumn startColumn}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyStartColumn(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:layoutChange layoutChange} event of this `sap.ui.webc.fiori.FlexibleColumnLayout`.
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
    mParameters: ArrowsUsed): this.type = js.native
    
    /**
      * Gets current value of property {@link #getAccessibilityRoles accessibilityRoles}.
      *
      * An object of strings that defines additional accessibility roles for further customization.
      *
      * It supports the following fields: - `startColumnRole`: the accessibility role for the `startColumn` -
      * `startArrowContainerRole`: the accessibility role for the first arrow container (between the `begin`
      * and `mid` columns) - `midColumnRole`: the accessibility role for the `midColumn` - `endArrowContainerRole`:
      * the accessibility role for the second arrow container (between the `mid` and `end` columns) - `endColumnRole`:
      * the accessibility role for the `endColumn`
      *
      * Default value is `{}`.
      *
      * @returns Value of property `accessibilityRoles`
      */
    def getAccessibilityRoles(): js.Object = js.native
    
    /**
      * Gets current value of property {@link #getAccessibilityTexts accessibilityTexts}.
      *
      * An object of strings that defines several additional accessibility texts for even further customization.
      *
      * It supports the following fields: - `startColumnAccessibleName`: the accessibility name for the `startColumn`
      * region - `midColumnAccessibleName`: the accessibility name for the `midColumn` region - `endColumnAccessibleName`:
      * the accessibility name for the `endColumn` region - `startArrowLeftText`: the text that the first arrow
      * (between the `begin` and `mid` columns) will have when pointing to the left - `startArrowRightText`:
      * the text that the first arrow (between the `begin` and `mid` columns) will have when pointing to the
      * right - `endArrowLeftText`: the text that the second arrow (between the `mid` and `end` columns) will
      * have when pointing to the left - `endArrowRightText`: the text that the second arrow (between the `mid`
      * and `end` columns) will have when pointing to the right - `startArrowContainerAccessibleName`: the text
      * that the first arrow container (between the `begin` and `mid` columns) will have as `aria-label` - `endArrowContainerAccessibleName`:
      * the text that the second arrow container (between the `mid` and `end` columns) will have as `aria-label`
      *
      * Default value is `{}`.
      *
      * @returns Value of property `accessibilityTexts`
      */
    def getAccessibilityTexts(): js.Object = js.native
    
    /**
      * Returns the current column layout, based on both the `layout` property and the screen size.
      *
      *  **For example:** ["67%", "33%", 0], ["100%", 0, 0], ["25%", "50%", "25%"], etc, where the numbers represents
      * the width of the start, middle and end columns.
      */
    def getColumnLayout(): Unit = js.native
    
    /**
      * Gets content of aggregation {@link #getEndColumn endColumn}.
      *
      * Defines the content in the end column.
      */
    def getEndColumn(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Returns if the `end` column is visible.
      */
    def getEndColumnVisible(): Unit = js.native
    
    /**
      * Gets current value of property {@link #getHeight height}.
      *
      * Defines the height of the control
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getHideArrows hideArrows}.
      *
      * Defines the visibility of the arrows, used for expanding and shrinking the columns.
      *
      * Default value is `false`.
      *
      * @returns Value of property `hideArrows`
      */
    def getHideArrows(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getLayout layout}.
      *
      * Defines the columns layout and their proportion.
      *
      *  **Note:** The layout also depends on the screen size - one column for screens smaller than 599px, two
      * columns between 599px and 1023px and three columns for sizes bigger than 1023px.
      *
      *  Available options are:
      * 	 - `OneColumn`
      * 	 - `TwoColumnsStartExpanded`
      * 	 - `TwoColumnsMidExpanded`
      * 	 - `ThreeColumnsMidExpanded`
      * 	 - `ThreeColumnsEndExpanded`
      * 	 - `ThreeColumnsStartExpandedEndHidden`
      * 	 - `ThreeColumnsMidExpandedEndHidden`
      * 	 - `MidColumnFullScreen`
      * 	 - `EndColumnFullScreen`
      *
      *  **For example:** layout=`TwoColumnsStartExpanded` means the layout will display up to two columns in
      * 67%/33% proportion.
      *
      * Default value is `OneColumn`.
      *
      * @returns Value of property `layout`
      */
    def getLayout(): FCLLayout | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FCLLayout * / any */ String) = js.native
    
    /**
      * Gets content of aggregation {@link #getMidColumn midColumn}.
      *
      * Defines the content in the middle column.
      */
    def getMidColumn(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Returns if the `middle` column is visible.
      */
    def getMidColumnVisible(): Unit = js.native
    
    /**
      * Gets content of aggregation {@link #getStartColumn startColumn}.
      *
      * Defines the content in the start column.
      */
    def getStartColumn(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Returns if the `start` column is visible.
      */
    def getStartColumnVisible(): Unit = js.native
    
    /**
      * Returns the number of currently visible columns.
      */
    def getVisibleColumns(): Unit = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Defines the width of the control
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Sets a new value for property {@link #getAccessibilityRoles accessibilityRoles}.
      *
      * An object of strings that defines additional accessibility roles for further customization.
      *
      * It supports the following fields: - `startColumnRole`: the accessibility role for the `startColumn` -
      * `startArrowContainerRole`: the accessibility role for the first arrow container (between the `begin`
      * and `mid` columns) - `midColumnRole`: the accessibility role for the `midColumn` - `endArrowContainerRole`:
      * the accessibility role for the second arrow container (between the `mid` and `end` columns) - `endColumnRole`:
      * the accessibility role for the `endColumn`
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `{}`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAccessibilityRoles(): this.type = js.native
    def setAccessibilityRoles(/**
      * New value for property `accessibilityRoles`
      */
    oAccessibilityRoles: js.Object): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getAccessibilityTexts accessibilityTexts}.
      *
      * An object of strings that defines several additional accessibility texts for even further customization.
      *
      * It supports the following fields: - `startColumnAccessibleName`: the accessibility name for the `startColumn`
      * region - `midColumnAccessibleName`: the accessibility name for the `midColumn` region - `endColumnAccessibleName`:
      * the accessibility name for the `endColumn` region - `startArrowLeftText`: the text that the first arrow
      * (between the `begin` and `mid` columns) will have when pointing to the left - `startArrowRightText`:
      * the text that the first arrow (between the `begin` and `mid` columns) will have when pointing to the
      * right - `endArrowLeftText`: the text that the second arrow (between the `mid` and `end` columns) will
      * have when pointing to the left - `endArrowRightText`: the text that the second arrow (between the `mid`
      * and `end` columns) will have when pointing to the right - `startArrowContainerAccessibleName`: the text
      * that the first arrow container (between the `begin` and `mid` columns) will have as `aria-label` - `endArrowContainerAccessibleName`:
      * the text that the second arrow container (between the `mid` and `end` columns) will have as `aria-label`
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `{}`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAccessibilityTexts(): this.type = js.native
    def setAccessibilityTexts(/**
      * New value for property `accessibilityTexts`
      */
    oAccessibilityTexts: js.Object): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getEndColumn endColumn}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEndColumn(/**
      * The endColumn to set
      */
    oEndColumn: typings.openui5.sapUiCoreControlMod.default): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeight height}.
      *
      * Defines the height of the control
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeight(/**
      * New value for property `height`
      */
    sHeight: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHideArrows hideArrows}.
      *
      * Defines the visibility of the arrows, used for expanding and shrinking the columns.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHideArrows(): this.type = js.native
    def setHideArrows(/**
      * New value for property `hideArrows`
      */
    bHideArrows: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getLayout layout}.
      *
      * Defines the columns layout and their proportion.
      *
      *  **Note:** The layout also depends on the screen size - one column for screens smaller than 599px, two
      * columns between 599px and 1023px and three columns for sizes bigger than 1023px.
      *
      *  Available options are:
      * 	 - `OneColumn`
      * 	 - `TwoColumnsStartExpanded`
      * 	 - `TwoColumnsMidExpanded`
      * 	 - `ThreeColumnsMidExpanded`
      * 	 - `ThreeColumnsEndExpanded`
      * 	 - `ThreeColumnsStartExpandedEndHidden`
      * 	 - `ThreeColumnsMidExpandedEndHidden`
      * 	 - `MidColumnFullScreen`
      * 	 - `EndColumnFullScreen`
      *
      *  **For example:** layout=`TwoColumnsStartExpanded` means the layout will display up to two columns in
      * 67%/33% proportion.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `OneColumn`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLayout(): this.type = js.native
    def setLayout(
      /**
      * New value for property `layout`
      */
    sLayout: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FCLLayout * / any */ String
    ): this.type = js.native
    def setLayout(/**
      * New value for property `layout`
      */
    sLayout: FCLLayout): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getMidColumn midColumn}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMidColumn(/**
      * The midColumn to set
      */
    oMidColumn: typings.openui5.sapUiCoreControlMod.default): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getStartColumn startColumn}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setStartColumn(/**
      * The startColumn to set
      */
    oStartColumn: typings.openui5.sapUiCoreControlMod.default): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Defines the width of the control
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
  }
  
  trait FlexibleColumnLayoutSettings
    extends StObject
       with ControlSettings {
    
    /**
      * An object of strings that defines additional accessibility roles for further customization.
      *
      * It supports the following fields: - `startColumnRole`: the accessibility role for the `startColumn` -
      * `startArrowContainerRole`: the accessibility role for the first arrow container (between the `begin`
      * and `mid` columns) - `midColumnRole`: the accessibility role for the `midColumn` - `endArrowContainerRole`:
      * the accessibility role for the second arrow container (between the `mid` and `end` columns) - `endColumnRole`:
      * the accessibility role for the `endColumn`
      */
    var accessibilityRoles: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * An object of strings that defines several additional accessibility texts for even further customization.
      *
      * It supports the following fields: - `startColumnAccessibleName`: the accessibility name for the `startColumn`
      * region - `midColumnAccessibleName`: the accessibility name for the `midColumn` region - `endColumnAccessibleName`:
      * the accessibility name for the `endColumn` region - `startArrowLeftText`: the text that the first arrow
      * (between the `begin` and `mid` columns) will have when pointing to the left - `startArrowRightText`:
      * the text that the first arrow (between the `begin` and `mid` columns) will have when pointing to the
      * right - `endArrowLeftText`: the text that the second arrow (between the `mid` and `end` columns) will
      * have when pointing to the left - `endArrowRightText`: the text that the second arrow (between the `mid`
      * and `end` columns) will have when pointing to the right - `startArrowContainerAccessibleName`: the text
      * that the first arrow container (between the `begin` and `mid` columns) will have as `aria-label` - `endArrowContainerAccessibleName`:
      * the text that the second arrow container (between the `mid` and `end` columns) will have as `aria-label`
      */
    var accessibilityTexts: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the content in the end column.
      */
    var endColumn: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * Defines the height of the control
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the visibility of the arrows, used for expanding and shrinking the columns.
      */
    var hideArrows: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the columns layout and their proportion.
      *
      *  **Note:** The layout also depends on the screen size - one column for screens smaller than 599px, two
      * columns between 599px and 1023px and three columns for sizes bigger than 1023px.
      *
      *  Available options are:
      * 	 - `OneColumn`
      * 	 - `TwoColumnsStartExpanded`
      * 	 - `TwoColumnsMidExpanded`
      * 	 - `ThreeColumnsMidExpanded`
      * 	 - `ThreeColumnsEndExpanded`
      * 	 - `ThreeColumnsStartExpandedEndHidden`
      * 	 - `ThreeColumnsMidExpandedEndHidden`
      * 	 - `MidColumnFullScreen`
      * 	 - `EndColumnFullScreen`
      *
      *  **For example:** layout=`TwoColumnsStartExpanded` means the layout will display up to two columns in
      * 67%/33% proportion.
      */
    var layout: js.UndefOr[
        FCLLayout | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FCLLayout * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Fired when the layout changes via user interaction by clicking the arrows or by changing the component
      * size due to resizing.
      */
    var layoutChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines the content in the middle column.
      */
    var midColumn: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * Defines the content in the start column.
      */
    var startColumn: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * Defines the width of the control
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object FlexibleColumnLayoutSettings {
    
    inline def apply(): FlexibleColumnLayoutSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlexibleColumnLayoutSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FlexibleColumnLayoutSettings] (val x: Self) extends AnyVal {
      
      inline def setAccessibilityRoles(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "accessibilityRoles", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityRolesUndefined: Self = StObject.set(x, "accessibilityRoles", js.undefined)
      
      inline def setAccessibilityTexts(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "accessibilityTexts", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityTextsUndefined: Self = StObject.set(x, "accessibilityTexts", js.undefined)
      
      inline def setEndColumn(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "endColumn", value.asInstanceOf[js.Any])
      
      inline def setEndColumnUndefined: Self = StObject.set(x, "endColumn", js.undefined)
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHideArrows(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "hideArrows", value.asInstanceOf[js.Any])
      
      inline def setHideArrowsUndefined: Self = StObject.set(x, "hideArrows", js.undefined)
      
      inline def setLayout(
        value: FCLLayout | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FCLLayout * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "layoutChange", js.Any.fromFunction1(value))
      
      inline def setLayoutChangeUndefined: Self = StObject.set(x, "layoutChange", js.undefined)
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setMidColumn(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "midColumn", value.asInstanceOf[js.Any])
      
      inline def setMidColumnUndefined: Self = StObject.set(x, "midColumn", js.undefined)
      
      inline def setStartColumn(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "startColumn", value.asInstanceOf[js.Any])
      
      inline def setStartColumnUndefined: Self = StObject.set(x, "startColumn", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
