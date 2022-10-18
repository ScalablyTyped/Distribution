package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiWebcMainLibraryMod.PanelAccessibleRole
import typings.openui5.sapUiWebcMainLibraryMod.TitleLevel
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcMainPanelMod {
  
  @JSImport("sap/ui/webc/main/Panel", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `Panel`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Panel {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: PanelSettings) = this()
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
    mSettings: PanelSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: PanelSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/webc/main/Panel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.main.Panel with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, Panel]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Panel],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.webc.main.Panel.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait Panel
    extends typings.openui5.sapUiWebcCommonWebComponentMod.default {
    
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
      * Adds some header to the aggregation {@link #getHeader header}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addHeader(
      /**
      * The header to add; if empty, nothing is inserted
      */
    oHeader: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:toggle toggle} event of this `sap.ui.webc.main.Panel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.Panel` itself.
      *
      * Fired when the component is expanded/collapsed by user interaction.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachToggle(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachToggle(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.Panel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:toggle toggle} event of this `sap.ui.webc.main.Panel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.Panel` itself.
      *
      * Fired when the component is expanded/collapsed by user interaction.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachToggle(
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
    def attachToggle(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.Panel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the content in the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContent(): this.type = js.native
    
    /**
      * Destroys all the header in the aggregation {@link #getHeader header}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyHeader(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:toggle toggle} event of this `sap.ui.webc.main.Panel`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachToggle(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachToggle(
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
      * Fires event {@link #event:toggle toggle} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireToggle(): this.type = js.native
    def fireToggle(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Gets current value of property {@link #getAccessibleName accessibleName}.
      *
      * Defines the accessible aria name of the component.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `accessibleName`
      */
    def getAccessibleName(): String = js.native
    
    /**
      * Gets current value of property {@link #getAccessibleRole accessibleRole}.
      *
      * Sets the accessible aria role of the component. Depending on the usage, you can change the role from
      * the default `Form` to `Region` or `Complementary`.
      *
      * Default value is `Form`.
      *
      * @returns Value of property `accessibleRole`
      */
    def getAccessibleRole(): PanelAccessibleRole | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PanelAccessibleRole * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getCollapsed collapsed}.
      *
      * Indicates whether the component is collapsed and only the header is displayed.
      *
      * Default value is `false`.
      *
      * @returns Value of property `collapsed`
      */
    def getCollapsed(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * Defines the content of the component. The content is visible only when the component is expanded.
      */
    def getContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getFixed fixed}.
      *
      * Determines whether the component is in a fixed state that is not expandable/collapsible by user interaction.
      *
      * Default value is `false`.
      *
      * @returns Value of property `fixed`
      */
    def getFixed(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getHeader header}.
      *
      * Defines the component header area.
      *
      *  **Note:** When a header is provided, the `headerText` property is ignored.
      */
    def getHeader(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getHeaderLevel headerLevel}.
      *
      * Defines the "aria-level" of component heading, set by the `headerText`.
      *
      *  Available options are: `"H6"` to `"H1"`.
      *
      * Default value is `H2`.
      *
      * @returns Value of property `headerLevel`
      */
    def getHeaderLevel(): TitleLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getHeaderText headerText}.
      *
      * This property is used to set the header text of the component. The text is visible in both expanded and
      * collapsed states.
      *
      *  **Note:** This property is overridden by the `header` slot.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `headerText`
      */
    def getHeaderText(): String = js.native
    
    /**
      * Gets current value of property {@link #getHeight height}.
      *
      * Defines the height of the control
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getNoAnimation noAnimation}.
      *
      * Indicates whether the transition between the expanded and the collapsed state of the component is animated.
      * By default the animation is enabled.
      *
      * Default value is `false`.
      *
      * @returns Value of property `noAnimation`
      */
    def getNoAnimation(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Defines the width of the control
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
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getHeader header}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfHeader(
      /**
      * The header whose index is looked for
      */
    oHeader: typings.openui5.sapUiCoreControlMod.default
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
      * Inserts a header into the aggregation {@link #getHeader header}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertHeader(
      /**
      * The header to insert; if empty, nothing is inserted
      */
    oHeader: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the header should be inserted at; for a negative value of `iIndex`, the header is
      * inserted at position 0; for a value greater than the current size of the aggregation, the header is inserted
      * at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getContent content}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getHeader header}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllHeader(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
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
    
    def removeHeader(/**
      * The header to remove or its index or id
      */
    vHeader: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a header from the aggregation {@link #getHeader header}.
      *
      * @returns The removed header or `null`
      */
    def removeHeader(/**
      * The header to remove or its index or id
      */
    vHeader: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeHeader(
      /**
      * The header to remove or its index or id
      */
    vHeader: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getAccessibleName accessibleName}.
      *
      * Defines the accessible aria name of the component.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAccessibleName(): this.type = js.native
    def setAccessibleName(/**
      * New value for property `accessibleName`
      */
    sAccessibleName: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getAccessibleRole accessibleRole}.
      *
      * Sets the accessible aria role of the component. Depending on the usage, you can change the role from
      * the default `Form` to `Region` or `Complementary`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Form`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAccessibleRole(): this.type = js.native
    def setAccessibleRole(
      /**
      * New value for property `accessibleRole`
      */
    sAccessibleRole: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PanelAccessibleRole * / any */ String
    ): this.type = js.native
    def setAccessibleRole(/**
      * New value for property `accessibleRole`
      */
    sAccessibleRole: PanelAccessibleRole): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getCollapsed collapsed}.
      *
      * Indicates whether the component is collapsed and only the header is displayed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCollapsed(): this.type = js.native
    def setCollapsed(/**
      * New value for property `collapsed`
      */
    bCollapsed: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFixed fixed}.
      *
      * Determines whether the component is in a fixed state that is not expandable/collapsible by user interaction.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFixed(): this.type = js.native
    def setFixed(/**
      * New value for property `fixed`
      */
    bFixed: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeaderLevel headerLevel}.
      *
      * Defines the "aria-level" of component heading, set by the `headerText`.
      *
      *  Available options are: `"H6"` to `"H1"`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `H2`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeaderLevel(): this.type = js.native
    def setHeaderLevel(
      /**
      * New value for property `headerLevel`
      */
    sHeaderLevel: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String
    ): this.type = js.native
    def setHeaderLevel(/**
      * New value for property `headerLevel`
      */
    sHeaderLevel: TitleLevel): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeaderText headerText}.
      *
      * This property is used to set the header text of the component. The text is visible in both expanded and
      * collapsed states.
      *
      *  **Note:** This property is overridden by the `header` slot.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeaderText(): this.type = js.native
    def setHeaderText(/**
      * New value for property `headerText`
      */
    sHeaderText: String): this.type = js.native
    
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
      * Sets a new value for property {@link #getNoAnimation noAnimation}.
      *
      * Indicates whether the transition between the expanded and the collapsed state of the component is animated.
      * By default the animation is enabled.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setNoAnimation(): this.type = js.native
    def setNoAnimation(/**
      * New value for property `noAnimation`
      */
    bNoAnimation: Boolean): this.type = js.native
    
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
  
  trait PanelSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Defines the accessible aria name of the component.
      */
    var accessibleName: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Sets the accessible aria role of the component. Depending on the usage, you can change the role from
      * the default `Form` to `Region` or `Complementary`.
      */
    var accessibleRole: js.UndefOr[
        PanelAccessibleRole | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PanelAccessibleRole * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Indicates whether the component is collapsed and only the header is displayed.
      */
    var collapsed: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the content of the component. The content is visible only when the component is expanded.
      */
    var content: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines whether the component is in a fixed state that is not expandable/collapsible by user interaction.
      */
    var fixed: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the component header area.
      *
      *  **Note:** When a header is provided, the `headerText` property is ignored.
      */
    var header: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the "aria-level" of component heading, set by the `headerText`.
      *
      *  Available options are: `"H6"` to `"H1"`.
      */
    var headerLevel: js.UndefOr[
        TitleLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * This property is used to set the header text of the component. The text is visible in both expanded and
      * collapsed states.
      *
      *  **Note:** This property is overridden by the `header` slot.
      */
    var headerText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the height of the control
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Indicates whether the transition between the expanded and the collapsed state of the component is animated.
      * By default the animation is enabled.
      */
    var noAnimation: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fired when the component is expanded/collapsed by user interaction.
      */
    var toggle: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines the width of the control
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object PanelSettings {
    
    inline def apply(): PanelSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanelSettings]
    }
    
    extension [Self <: PanelSettings](x: Self) {
      
      inline def setAccessibleName(value: String | PropertyBindingInfo): Self = StObject.set(x, "accessibleName", value.asInstanceOf[js.Any])
      
      inline def setAccessibleNameUndefined: Self = StObject.set(x, "accessibleName", js.undefined)
      
      inline def setAccessibleRole(
        value: PanelAccessibleRole | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PanelAccessibleRole * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "accessibleRole", value.asInstanceOf[js.Any])
      
      inline def setAccessibleRoleUndefined: Self = StObject.set(x, "accessibleRole", js.undefined)
      
      inline def setCollapsed(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      inline def setContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setFixed(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      inline def setHeader(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderLevel(
        value: TitleLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "headerLevel", value.asInstanceOf[js.Any])
      
      inline def setHeaderLevelUndefined: Self = StObject.set(x, "headerLevel", js.undefined)
      
      inline def setHeaderText(value: String | PropertyBindingInfo): Self = StObject.set(x, "headerText", value.asInstanceOf[js.Any])
      
      inline def setHeaderTextUndefined: Self = StObject.set(x, "headerText", js.undefined)
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setHeaderVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "header", js.Array(value*))
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setNoAnimation(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "noAnimation", value.asInstanceOf[js.Any])
      
      inline def setNoAnimationUndefined: Self = StObject.set(x, "noAnimation", js.undefined)
      
      inline def setToggle(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction1(value))
      
      inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
