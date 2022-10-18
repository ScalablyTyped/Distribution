package typings.openui5

import typings.openui5.anon.Expand
import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.BackgroundDesign
import typings.openui5.sapMLibraryMod.PanelAccessibleRole
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMPanelMod {
  
  @JSImport("sap/m/Panel", JSImport.Default)
  @js.native
  /**
    * Constructor for a new Panel.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/panel/ Panel}
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
    
    @JSImport("sap/m/Panel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.Panel with name `sClassName` and enriches it with the information
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
      * Returns a metadata object for class sap.m.Panel.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Panel
    extends typings.openui5.sapUiCoreControlMod.default {
    
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
      * @SINCE 1.22
      *
      * Attaches event handler `fnFunction` to the {@link #event:expand expand} event of this `sap.m.Panel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Panel` itself.
      *
      * Indicates that the panel will expand or collapse.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachExpand(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachExpand(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Panel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.22
      *
      * Attaches event handler `fnFunction` to the {@link #event:expand expand} event of this `sap.m.Panel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Panel` itself.
      *
      * Indicates that the panel will expand or collapse.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachExpand(
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
    def attachExpand(
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
      * Context object to call the event handler with. Defaults to this `sap.m.Panel` itself
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
      * @SINCE 1.16
      *
      * Destroys the headerToolbar in the aggregation {@link #getHeaderToolbar headerToolbar}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyHeaderToolbar(): this.type = js.native
    
    /**
      * @SINCE 1.16
      *
      * Destroys the infoToolbar in the aggregation {@link #getInfoToolbar infoToolbar}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyInfoToolbar(): this.type = js.native
    
    /**
      * @SINCE 1.22
      *
      * Detaches event handler `fnFunction` from the {@link #event:expand expand} event of this `sap.m.Panel`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachExpand(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachExpand(
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
      * @SINCE 1.22
      *
      * Fires event {@link #event:expand expand} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireExpand(): this.type = js.native
    def fireExpand(/**
      * Parameters to pass along with the event
      */
    mParameters: Expand): this.type = js.native
    
    /**
      * @SINCE 1.46
      *
      * Gets current value of property {@link #getAccessibleRole accessibleRole}.
      *
      * This property is used to set the accessible aria role of the Panel. Depending on the usage you can change
      * the role from the default `Form` to `Region` or `Complementary`.
      *
      * Default value is `Form`.
      *
      * @returns Value of property `accessibleRole`
      */
    def getAccessibleRole(): PanelAccessibleRole | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PanelAccessibleRole * / any */ String) = js.native
    
    /**
      * @SINCE 1.30
      *
      * Gets current value of property {@link #getBackgroundDesign backgroundDesign}.
      *
      * This property is used to set the background color of the Panel. Depending on the theme you can change
      * the state of the background from "Solid" over "Translucent" to "Transparent".
      *
      * Default value is `Translucent`.
      *
      * @returns Value of property `backgroundDesign`
      */
    def getBackgroundDesign(): BackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String) = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * Determines the content of the Panel. The content will be visible only when the Panel is expanded.
      */
    def getContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * @SINCE 1.26
      *
      * Gets current value of property {@link #getExpandAnimation expandAnimation}.
      *
      * Indicates whether the transition between the expanded and the collapsed state of the control is animated.
      * By default the animation is enabled.
      *
      * Default value is `true`.
      *
      * @returns Value of property `expandAnimation`
      */
    def getExpandAnimation(): Boolean = js.native
    
    /**
      * @SINCE 1.22
      *
      * Gets current value of property {@link #getExpandable expandable}.
      *
      * Specifies whether the control is expandable. This allows for collapsing or expanding the infoToolbar
      * (if available) and content of the Panel. Note: If expandable is set to false, the Panel will always be
      * rendered expanded.
      *
      * Default value is `false`.
      *
      * @returns Value of property `expandable`
      */
    def getExpandable(): Boolean = js.native
    
    /**
      * @SINCE 1.22
      *
      * Gets current value of property {@link #getExpanded expanded}.
      *
      * Indicates whether the Panel is expanded or not. If expanded is set to true, then both the infoToolbar
      * (if available) and the content are rendered. If expanded is set to false, then only the headerText or
      * headerToolbar is rendered.
      *
      * Default value is `false`.
      *
      * @returns Value of property `expanded`
      */
    def getExpanded(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getHeaderText headerText}.
      *
      * This property is used to set the header text of the Panel. The "headerText" is visible in both expanded
      * and collapsed state. Note: This property is overwritten by the "headerToolbar" aggregation.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `headerText`
      */
    def getHeaderText(): String = js.native
    
    /**
      * @SINCE 1.16
      *
      * Gets content of aggregation {@link #getHeaderToolbar headerToolbar}.
      *
      * This aggregation allows the use of a custom Toolbar as header for the Panel. The "headerToolbar" is visible
      * in both expanded and collapsed state. Use it when you want to add extra controls for user interactions
      * in the header. Note: This aggregation overwrites "headerText" property.
      */
    def getHeaderToolbar(): typings.openui5.sapMToolbarMod.default = js.native
    
    /**
      * Gets current value of property {@link #getHeight height}.
      *
      * Determines the Panel height.
      *
      * Default value is `"auto"`.
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * @SINCE 1.16
      *
      * Gets content of aggregation {@link #getInfoToolbar infoToolbar}.
      *
      * This aggregation allows the use of a custom Toolbar as information bar for the Panel. The "infoToolbar"
      * is placed below the header and is visible only in expanded state. Use it when you want to show extra
      * information to the user.
      */
    def getInfoToolbar(): typings.openui5.sapMToolbarMod.default = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Determines the Panel width.
      *
      * Default value is `"100%"`.
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
      * Removes all the controls from the aggregation {@link #getContent content}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
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
      * @SINCE 1.46
      *
      * Sets a new value for property {@link #getAccessibleRole accessibleRole}.
      *
      * This property is used to set the accessible aria role of the Panel. Depending on the usage you can change
      * the role from the default `Form` to `Region` or `Complementary`.
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
      * @SINCE 1.30
      *
      * Sets a new value for property {@link #getBackgroundDesign backgroundDesign}.
      *
      * This property is used to set the background color of the Panel. Depending on the theme you can change
      * the state of the background from "Solid" over "Translucent" to "Transparent".
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
      * @SINCE 1.26
      *
      * Sets a new value for property {@link #getExpandAnimation expandAnimation}.
      *
      * Indicates whether the transition between the expanded and the collapsed state of the control is animated.
      * By default the animation is enabled.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setExpandAnimation(): this.type = js.native
    def setExpandAnimation(/**
      * New value for property `expandAnimation`
      */
    bExpandAnimation: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.22
      *
      * Sets a new value for property {@link #getExpandable expandable}.
      *
      * Specifies whether the control is expandable. This allows for collapsing or expanding the infoToolbar
      * (if available) and content of the Panel. Note: If expandable is set to false, the Panel will always be
      * rendered expanded.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setExpandable(): this.type = js.native
    def setExpandable(/**
      * New value for property `expandable`
      */
    bExpandable: Boolean): this.type = js.native
    
    /**
      * Sets the expanded property of the control.
      *
      * @returns Pointer to the control instance to allow method chaining.
      */
    def setExpanded(/**
      * Defines whether control is expanded or not.
      */
    bExpanded: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeaderText headerText}.
      *
      * This property is used to set the header text of the Panel. The "headerText" is visible in both expanded
      * and collapsed state. Note: This property is overwritten by the "headerToolbar" aggregation.
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
      * @SINCE 1.16
      *
      * Sets the aggregated {@link #getHeaderToolbar headerToolbar}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeaderToolbar(/**
      * The headerToolbar to set
      */
    oHeaderToolbar: typings.openui5.sapMToolbarMod.default): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeight height}.
      *
      * Determines the Panel height.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"auto"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeight(): this.type = js.native
    def setHeight(/**
      * New value for property `height`
      */
    sHeight: CSSSize): this.type = js.native
    
    /**
      * @SINCE 1.16
      *
      * Sets the aggregated {@link #getInfoToolbar infoToolbar}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setInfoToolbar(/**
      * The infoToolbar to set
      */
    oInfoToolbar: typings.openui5.sapMToolbarMod.default): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Determines the Panel width.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"100%"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(): this.type = js.native
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
  }
  
  trait PanelSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @SINCE 1.46
      *
      * This property is used to set the accessible aria role of the Panel. Depending on the usage you can change
      * the role from the default `Form` to `Region` or `Complementary`.
      */
    var accessibleRole: js.UndefOr[
        PanelAccessibleRole | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PanelAccessibleRole * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.30
      *
      * This property is used to set the background color of the Panel. Depending on the theme you can change
      * the state of the background from "Solid" over "Translucent" to "Transparent".
      */
    var backgroundDesign: js.UndefOr[
        BackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Determines the content of the Panel. The content will be visible only when the Panel is expanded.
      */
    var content: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.22
      *
      * Indicates that the panel will expand or collapse.
      */
    var expand: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.26
      *
      * Indicates whether the transition between the expanded and the collapsed state of the control is animated.
      * By default the animation is enabled.
      */
    var expandAnimation: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.22
      *
      * Specifies whether the control is expandable. This allows for collapsing or expanding the infoToolbar
      * (if available) and content of the Panel. Note: If expandable is set to false, the Panel will always be
      * rendered expanded.
      */
    var expandable: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.22
      *
      * Indicates whether the Panel is expanded or not. If expanded is set to true, then both the infoToolbar
      * (if available) and the content are rendered. If expanded is set to false, then only the headerText or
      * headerToolbar is rendered.
      */
    var expanded: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * This property is used to set the header text of the Panel. The "headerText" is visible in both expanded
      * and collapsed state. Note: This property is overwritten by the "headerToolbar" aggregation.
      */
    var headerText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.16
      *
      * This aggregation allows the use of a custom Toolbar as header for the Panel. The "headerToolbar" is visible
      * in both expanded and collapsed state. Use it when you want to add extra controls for user interactions
      * in the header. Note: This aggregation overwrites "headerText" property.
      */
    var headerToolbar: js.UndefOr[typings.openui5.sapMToolbarMod.default] = js.undefined
    
    /**
      * Determines the Panel height.
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.16
      *
      * This aggregation allows the use of a custom Toolbar as information bar for the Panel. The "infoToolbar"
      * is placed below the header and is visible only in expanded state. Use it when you want to show extra
      * information to the user.
      */
    var infoToolbar: js.UndefOr[typings.openui5.sapMToolbarMod.default] = js.undefined
    
    /**
      * Determines the Panel width.
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
      
      inline def setAccessibleRole(
        value: PanelAccessibleRole | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PanelAccessibleRole * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "accessibleRole", value.asInstanceOf[js.Any])
      
      inline def setAccessibleRoleUndefined: Self = StObject.set(x, "accessibleRole", js.undefined)
      
      inline def setBackgroundDesign(
        value: BackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "backgroundDesign", value.asInstanceOf[js.Any])
      
      inline def setBackgroundDesignUndefined: Self = StObject.set(x, "backgroundDesign", js.undefined)
      
      inline def setContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setExpand(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "expand", js.Any.fromFunction1(value))
      
      inline def setExpandAnimation(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "expandAnimation", value.asInstanceOf[js.Any])
      
      inline def setExpandAnimationUndefined: Self = StObject.set(x, "expandAnimation", js.undefined)
      
      inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
      
      inline def setExpandable(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
      
      inline def setExpandableUndefined: Self = StObject.set(x, "expandable", js.undefined)
      
      inline def setExpanded(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      inline def setHeaderText(value: String | PropertyBindingInfo): Self = StObject.set(x, "headerText", value.asInstanceOf[js.Any])
      
      inline def setHeaderTextUndefined: Self = StObject.set(x, "headerText", js.undefined)
      
      inline def setHeaderToolbar(value: typings.openui5.sapMToolbarMod.default): Self = StObject.set(x, "headerToolbar", value.asInstanceOf[js.Any])
      
      inline def setHeaderToolbarUndefined: Self = StObject.set(x, "headerToolbar", js.undefined)
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setInfoToolbar(value: typings.openui5.sapMToolbarMod.default): Self = StObject.set(x, "infoToolbar", value.asInstanceOf[js.Any])
      
      inline def setInfoToolbarUndefined: Self = StObject.set(x, "infoToolbar", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
