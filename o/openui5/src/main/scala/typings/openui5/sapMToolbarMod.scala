package typings.openui5

import typings.openui5.anon.`23`
import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.IBar
import typings.openui5.sapMLibraryMod.ToolbarDesign
import typings.openui5.sapMLibraryMod.ToolbarStyle
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMToolbarMod {
  
  @JSImport("sap/m/Toolbar", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `Toolbar`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/toolbar-overview/ Toolbar}
    */
  open class default () extends Toolbar {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ToolbarSettings) = this()
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
    mSettings: ToolbarSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ToolbarSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_m_IBar: Boolean = js.native
    
    /* CompleteClass */
    var __implements__sap_ui_core_Toolbar: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/Toolbar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.Toolbar with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, Toolbar]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Toolbar],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.Toolbar.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Toolbar
    extends typings.openui5.sapUiCoreControlMod.default
       with typings.openui5.sapUiCoreLibraryMod.Toolbar
       with IBar {
    
    /**
      * Sets classes according to the context of the page. Possible contexts are header, footer and subheader.
      *
      * @returns `this` for chaining
      */
    def _applyContextClassFor(): IBar = js.native
    
    /**
      * Sets HTML tag according to the context of the page. Possible contexts are header, footer and subheader.
      *
      * @returns `this` for chaining
      */
    def _applyTag(): IBar = js.native
    
    def addAriaLabelledBy(
      /**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
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
      * Sets classes and HTML tag according to the context of the page. Possible contexts are header, footer,
      * subheader
      *
      * @returns `this` for chaining
      */
    def applyTagAndContextClassFor(): IBar = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:press press} event of this `sap.m.Toolbar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Toolbar` itself.
      *
      * Fired when the user clicks on the toolbar, if the Active property is set to "true".
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Toolbar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:press press} event of this `sap.m.Toolbar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Toolbar` itself.
      *
      * Fired when the user clicks on the toolbar, if the Active property is set to "true".
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPress(
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
    def attachPress(
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
      * Context object to call the event handler with. Defaults to this `sap.m.Toolbar` itself
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
      * Detaches event handler `fnFunction` from the {@link #event:press press} event of this `sap.m.Toolbar`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachPress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachPress(
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
      * Fires event {@link #event:press press} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def firePress(): this.type = js.native
    def firePress(/**
      * Parameters to pass along with the event
      */
    mParameters: `23`): this.type = js.native
    
    /**
      * Gets current value of property {@link #getActive active}.
      *
      * Indicates that the whole toolbar is clickable. The Press event is fired only if Active is set to true.
      * Note: This property should be used when there are no interactive controls inside the toolbar and the
      * toolbar itself is meant to be interactive.
      *
      * Default value is `false`.
      *
      * @returns Value of property `active`
      */
    def getActive(): Boolean = js.native
    
    /**
      * @SINCE 1.79.0
      *
      * Gets current value of property {@link #getAriaHasPopup ariaHasPopup}.
      *
      * Defines the aria-haspopup attribute of the `Toolbar`. if the active `design` is true.
      *
      * **Guidance for choosing appropriate value:**
      * 	 -  We recommend that you use the {@link sap.ui.core.aria.HasPopup} enumeration.
      * 	 -  If you use controls based on `sap.m.Popover` or `sap.m.Dialog`, then you must use `AriaHasPopup.Dialog`
      * 			(both `sap.m.Popover` and `sap.m.Dialog` have role "dialog" assigned internally).
      * 	 -  If you use other controls, or directly `sap.ui.core.Popup`, you need to check the container role/type
      * 			and map the value of `ariaHasPopup` accordingly.
      *
      * @returns Value of property `ariaHasPopup`
      */
    def getAriaHasPopup(): String = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy
      * ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * The content of the toolbar.
      */
    def getContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * @SINCE 1.16.8
      *
      * Gets current value of property {@link #getDesign design}.
      *
      * Defines the toolbar design.
      *
      * **Note:** Design settings are theme-dependent. They also determine the default height of the toolbar.
      *
      * Default value is `Auto`.
      *
      * @returns Value of property `design`
      */
    def getDesign(): ToolbarDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ToolbarDesign * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getEnabled enabled}.
      *
      * Sets the enabled property of all controls defined in the content aggregation. Note: This property does
      * not apply to the toolbar itself, but rather to its items.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enabled`
      */
    def getEnabled(): Boolean = js.native
    
    /**
      * Gets the HTML tag of the root domref
      *
      * @returns the HTML-tag
      */
    def getHTMLTag(): String = js.native
    
    /**
      * Gets current value of property {@link #getHeight height}.
      *
      * Defines the height of the control. By default, the `height` property depends on the used theme and the
      * `design` property.
      *
      * **Note:** It is not recommended to use this property if the `sapMTBHeader-CTX` class is used
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * @SINCE 1.54
      *
      * Gets current value of property {@link #getStyle style}.
      *
      * Defines the visual style of the `Toolbar`.
      *
      * **Note:** The visual styles are theme-dependent.
      *
      * Default value is `Standard`.
      *
      * @returns Value of property `style`
      */
    def getStyle(): ToolbarStyle | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ToolbarStyle * / any */ String) = js.native
    
    /**
      * @SINCE 1.44
      *
      * Returns the first sap.m.Title control instance inside the toolbar for the accessibility
      *
      * @returns The `sap.m.Title` instance or undefined
      */
    def getTitleControl(): js.UndefOr[typings.openui5.sapMTitleMod.default] = js.native
    
    /**
      * @SINCE 1.28
      *
      * Returns the first sap.m.Title control id inside the toolbar for the accessibility
      *
      * @returns The `sap.m.Title` ID
      */
    def getTitleId(): ID = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Defines the width of the control. By default, Toolbar is a block element. If the width is not explicitly
      * set, the control will assume its natural size.
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
      * Returns if the bar is sensitive to the container context. Implementation of the IBar interface
      *
      * @returns isContextSensitive
      */
    def isContextSensitive(): Boolean = js.native
    
    /**
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
      * Sets a new value for property {@link #getActive active}.
      *
      * Indicates that the whole toolbar is clickable. The Press event is fired only if Active is set to true.
      * Note: This property should be used when there are no interactive controls inside the toolbar and the
      * toolbar itself is meant to be interactive.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setActive(): this.type = js.native
    def setActive(/**
      * New value for property `active`
      */
    bActive: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.79.0
      *
      * Sets a new value for property {@link #getAriaHasPopup ariaHasPopup}.
      *
      * Defines the aria-haspopup attribute of the `Toolbar`. if the active `design` is true.
      *
      * **Guidance for choosing appropriate value:**
      * 	 -  We recommend that you use the {@link sap.ui.core.aria.HasPopup} enumeration.
      * 	 -  If you use controls based on `sap.m.Popover` or `sap.m.Dialog`, then you must use `AriaHasPopup.Dialog`
      * 			(both `sap.m.Popover` and `sap.m.Dialog` have role "dialog" assigned internally).
      * 	 -  If you use other controls, or directly `sap.ui.core.Popup`, you need to check the container role/type
      * 			and map the value of `ariaHasPopup` accordingly.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAriaHasPopup(): this.type = js.native
    def setAriaHasPopup(/**
      * New value for property `ariaHasPopup`
      */
    sAriaHasPopup: String): this.type = js.native
    
    /**
      * @SINCE 1.16.8
      *
      * Sets a new value for property {@link #getDesign design}.
      *
      * Defines the toolbar design.
      *
      * **Note:** Design settings are theme-dependent. They also determine the default height of the toolbar.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Auto`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDesign(): this.type = js.native
    def setDesign(
      /**
      * New value for property `design`
      */
    sDesign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ToolbarDesign * / any */ String
    ): this.type = js.native
    def setDesign(/**
      * New value for property `design`
      */
    sDesign: ToolbarDesign): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getEnabled enabled}.
      *
      * Sets the enabled property of all controls defined in the content aggregation. Note: This property does
      * not apply to the toolbar itself, but rather to its items.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnabled(): this.type = js.native
    def setEnabled(/**
      * New value for property `enabled`
      */
    bEnabled: Boolean): this.type = js.native
    
    /**
      * Sets the HTML tag of the root domref
      *
      * @returns this for chaining
      */
    def setHTMLTag(sTag: String): IBar = js.native
    
    /**
      * Sets a new value for property {@link #getHeight height}.
      *
      * Defines the height of the control. By default, the `height` property depends on the used theme and the
      * `design` property.
      *
      * **Note:** It is not recommended to use this property if the `sapMTBHeader-CTX` class is used
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeight(): this.type = js.native
    def setHeight(/**
      * New value for property `height`
      */
    sHeight: CSSSize): this.type = js.native
    
    /**
      * @SINCE 1.54
      *
      * Sets a new value for property {@link #getStyle style}.
      *
      * Defines the visual style of the `Toolbar`.
      *
      * **Note:** The visual styles are theme-dependent.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Standard`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setStyle(): this.type = js.native
    def setStyle(
      /**
      * New value for property `style`
      */
    sStyle: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ToolbarStyle * / any */ String
    ): this.type = js.native
    def setStyle(/**
      * New value for property `style`
      */
    sStyle: ToolbarStyle): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Defines the width of the control. By default, Toolbar is a block element. If the width is not explicitly
      * set, the control will assume its natural size.
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
  
  trait ToolbarSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Indicates that the whole toolbar is clickable. The Press event is fired only if Active is set to true.
      * Note: This property should be used when there are no interactive controls inside the toolbar and the
      * toolbar itself is meant to be interactive.
      */
    var active: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.79.0
      *
      * Defines the aria-haspopup attribute of the `Toolbar`. if the active `design` is true.
      *
      * **Guidance for choosing appropriate value:**
      * 	 -  We recommend that you use the {@link sap.ui.core.aria.HasPopup} enumeration.
      * 	 -  If you use controls based on `sap.m.Popover` or `sap.m.Dialog`, then you must use `AriaHasPopup.Dialog`
      * 			(both `sap.m.Popover` and `sap.m.Dialog` have role "dialog" assigned internally).
      * 	 -  If you use other controls, or directly `sap.ui.core.Popup`, you need to check the container role/type
      * 			and map the value of `ariaHasPopup` accordingly.
      */
    var ariaHasPopup: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Association to controls / ids which label this control (see WAI-ARIA attribute aria-labelledby).
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * The content of the toolbar.
      */
    var content: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.16.8
      *
      * Defines the toolbar design.
      *
      * **Note:** Design settings are theme-dependent. They also determine the default height of the toolbar.
      */
    var design: js.UndefOr[
        ToolbarDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ToolbarDesign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Sets the enabled property of all controls defined in the content aggregation. Note: This property does
      * not apply to the toolbar itself, but rather to its items.
      */
    var enabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the height of the control. By default, the `height` property depends on the used theme and the
      * `design` property.
      *
      * **Note:** It is not recommended to use this property if the `sapMTBHeader-CTX` class is used
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fired when the user clicks on the toolbar, if the Active property is set to "true".
      */
    var press: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.54
      *
      * Defines the visual style of the `Toolbar`.
      *
      * **Note:** The visual styles are theme-dependent.
      */
    var style: js.UndefOr[
        ToolbarStyle | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ToolbarStyle * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the width of the control. By default, Toolbar is a block element. If the width is not explicitly
      * set, the control will assume its natural size.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ToolbarSettings {
    
    inline def apply(): ToolbarSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToolbarSettings] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setAriaHasPopup(value: String | PropertyBindingInfo): Self = StObject.set(x, "ariaHasPopup", value.asInstanceOf[js.Any])
      
      inline def setAriaHasPopupUndefined: Self = StObject.set(x, "ariaHasPopup", js.undefined)
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setDesign(
        value: ToolbarDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ToolbarDesign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "design", value.asInstanceOf[js.Any])
      
      inline def setDesignUndefined: Self = StObject.set(x, "design", js.undefined)
      
      inline def setEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setPress(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "press", js.Any.fromFunction1(value))
      
      inline def setPressUndefined: Self = StObject.set(x, "press", js.undefined)
      
      inline def setStyle(
        value: ToolbarStyle | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ToolbarStyle * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
