package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.BackgroundDesign
import typings.openui5.sapMLibraryMod.ObjectHeaderContainer
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.Orientation
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMHeaderContainerMod {
  
  @JSImport("sap/m/HeaderContainer", JSImport.Default)
  @js.native
  /**
    * Constructor for the new HeaderContainer control.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends HeaderContainer {
    def this(/**
      * initial settings for the new control
      */
    mSettings: HeaderContainerSettings) = this()
    def this(/**
      * ID for the new control, generated automatically if no id is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no id is given
      */
    sId: String,
      /**
      * initial settings for the new control
      */
    mSettings: HeaderContainerSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: HeaderContainerSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_m_ObjectHeaderContainer: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/HeaderContainer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.HeaderContainer with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, HeaderContainer]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, HeaderContainer],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.HeaderContainer.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait HeaderContainer
    extends typings.openui5.sapUiCoreControlMod.default
       with ObjectHeaderContainer {
    
    def addAriaLabelledBy(
      /**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * @SINCE 1.62.0
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
      * Attaches event handler `fnFunction` to the {@link #event:scroll scroll} event of this `sap.m.HeaderContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.HeaderContainer` itself.
      *
      * This event is triggered on pressing the scroll button.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachScroll(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachScroll(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.HeaderContainer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:scroll scroll} event of this `sap.m.HeaderContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.HeaderContainer` itself.
      *
      * This event is triggered on pressing the scroll button.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachScroll(
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
    def attachScroll(
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
      * Context object to call the event handler with. Defaults to this `sap.m.HeaderContainer` itself
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
      * Detaches event handler `fnFunction` from the {@link #event:scroll scroll} event of this `sap.m.HeaderContainer`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachScroll(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachScroll(
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
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:scroll scroll} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireScroll(): this.type = js.native
    def fireScroll(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @SINCE 1.62.0
      *
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy
      * ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Gets current value of property {@link #getBackgroundDesign backgroundDesign}.
      *
      * Specifies the background color of the content. The visualization of the different options depends on
      * the used theme.
      *
      * Default value is `Transparent`.
      *
      * @returns Value of property `backgroundDesign`
      */
    def getBackgroundDesign(): BackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String) = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * Content to add to HeaderContainer.
      */
    def getContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * @SINCE 1.99
      * @EXPERIMENTAL (since 1.99)
      *
      * Gets current value of property {@link #getGridLayout gridLayout}.
      *
      * Enables grid layout in mobile view.
      *
      * Default value is `false`.
      *
      * @returns Value of property `gridLayout`
      */
    def getGridLayout(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getHeight height}.
      *
      * The height of the whole HeaderContainer. If not specified, it is rendered as 'auto' in horizontal orientation
      * and as '100%' in vertical orientation.
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getOrientation orientation}.
      *
      * The orientation of the HeaderContainer. There are two orientation modes: horizontal and vertical. In
      * horizontal mode the content controls are displayed next to each other, in vertical mode the content controls
      * are displayed on top of each other.
      *
      * Default value is `Horizontal`.
      *
      * @returns Value of property `orientation`
      */
    def getOrientation(): Orientation | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Orientation * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getScrollStep scrollStep}.
      *
      * Number of pixels to scroll when the user chooses Next or Previous buttons. Relevant only for desktop.
      *
      * Default value is `300`.
      *
      * @returns Value of property `scrollStep`
      */
    def getScrollStep(): int = js.native
    
    /**
      * Gets current value of property {@link #getScrollStepByItem scrollStepByItem}.
      *
      * Number of items to scroll when the user chose Next or Previous buttons. Relevant only for desktop. Have
      * priority over 'ScrollStep'. Have to be positive number.
      *
      * Default value is `1`.
      *
      * @returns Value of property `scrollStepByItem`
      */
    def getScrollStepByItem(): int = js.native
    
    /**
      * Gets current value of property {@link #getScrollTime scrollTime}.
      *
      * Scroll animation time in milliseconds.
      *
      * Default value is `500`.
      *
      * @returns Value of property `scrollTime`
      */
    def getScrollTime(): int = js.native
    
    /**
      * Gets current value of property {@link #getShowDividers showDividers}.
      *
      * If set to true, it shows dividers between the different content controls.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showDividers`
      */
    def getShowDividers(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowOverflowItem showOverflowItem}.
      *
      * Indicates whether the incomplete item on the edge of visible area is displayed or hidden.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showOverflowItem`
      */
    def getShowOverflowItem(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * The width of the whole HeaderContainer. If not specified, it is rendered as '100%' in horizontal orientation
      * and as 'auto' in vertical orientation.
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
      * @SINCE 1.62.0
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
      * @SINCE 1.62.0
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
      * Sets a new value for property {@link #getBackgroundDesign backgroundDesign}.
      *
      * Specifies the background color of the content. The visualization of the different options depends on
      * the used theme.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Transparent`.
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
      * @SINCE 1.99
      * @EXPERIMENTAL (since 1.99)
      *
      * Sets a new value for property {@link #getGridLayout gridLayout}.
      *
      * Enables grid layout in mobile view.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGridLayout(): this.type = js.native
    def setGridLayout(/**
      * New value for property `gridLayout`
      */
    bGridLayout: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeight height}.
      *
      * The height of the whole HeaderContainer. If not specified, it is rendered as 'auto' in horizontal orientation
      * and as '100%' in vertical orientation.
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
      * Sets a new value for property {@link #getOrientation orientation}.
      *
      * The orientation of the HeaderContainer. There are two orientation modes: horizontal and vertical. In
      * horizontal mode the content controls are displayed next to each other, in vertical mode the content controls
      * are displayed on top of each other.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Horizontal`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setOrientation(): this.type = js.native
    def setOrientation(
      /**
      * New value for property `orientation`
      */
    sOrientation: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Orientation * / any */ String
    ): this.type = js.native
    def setOrientation(/**
      * New value for property `orientation`
      */
    sOrientation: Orientation): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getScrollStep scrollStep}.
      *
      * Number of pixels to scroll when the user chooses Next or Previous buttons. Relevant only for desktop.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `300`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setScrollStep(): this.type = js.native
    def setScrollStep(/**
      * New value for property `scrollStep`
      */
    iScrollStep: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getScrollStepByItem scrollStepByItem}.
      *
      * Number of items to scroll when the user chose Next or Previous buttons. Relevant only for desktop. Have
      * priority over 'ScrollStep'. Have to be positive number.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `1`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setScrollStepByItem(): this.type = js.native
    def setScrollStepByItem(/**
      * New value for property `scrollStepByItem`
      */
    iScrollStepByItem: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getScrollTime scrollTime}.
      *
      * Scroll animation time in milliseconds.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `500`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setScrollTime(): this.type = js.native
    def setScrollTime(/**
      * New value for property `scrollTime`
      */
    iScrollTime: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowDividers showDividers}.
      *
      * If set to true, it shows dividers between the different content controls.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowDividers(): this.type = js.native
    def setShowDividers(/**
      * New value for property `showDividers`
      */
    bShowDividers: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowOverflowItem showOverflowItem}.
      *
      * Indicates whether the incomplete item on the edge of visible area is displayed or hidden.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowOverflowItem(): this.type = js.native
    def setShowOverflowItem(/**
      * New value for property `showOverflowItem`
      */
    bShowOverflowItem: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * The width of the whole HeaderContainer. If not specified, it is rendered as '100%' in horizontal orientation
      * and as 'auto' in vertical orientation.
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
  
  trait HeaderContainerSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @SINCE 1.62.0
      *
      * Controls or IDs that label controls in the `content` aggregation. Each ariaLabelledBy item is assigned
      * to its appropriate counterpart in the `content` aggregation.
      * If you want to annotate all the controls in the `content` aggregation, add the same number of items to
      * the `ariaLabelledBy` annotation.
      * Can be used by screen reader software.
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * Specifies the background color of the content. The visualization of the different options depends on
      * the used theme.
      */
    var backgroundDesign: js.UndefOr[
        BackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Content to add to HeaderContainer.
      */
    var content: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.99
      * @EXPERIMENTAL (since 1.99)
      *
      * Enables grid layout in mobile view.
      */
    var gridLayout: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The height of the whole HeaderContainer. If not specified, it is rendered as 'auto' in horizontal orientation
      * and as '100%' in vertical orientation.
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The orientation of the HeaderContainer. There are two orientation modes: horizontal and vertical. In
      * horizontal mode the content controls are displayed next to each other, in vertical mode the content controls
      * are displayed on top of each other.
      */
    var orientation: js.UndefOr[
        Orientation | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Orientation * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * This event is triggered on pressing the scroll button.
      */
    var scroll: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Number of pixels to scroll when the user chooses Next or Previous buttons. Relevant only for desktop.
      */
    var scrollStep: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Number of items to scroll when the user chose Next or Previous buttons. Relevant only for desktop. Have
      * priority over 'ScrollStep'. Have to be positive number.
      */
    var scrollStepByItem: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Scroll animation time in milliseconds.
      */
    var scrollTime: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * If set to true, it shows dividers between the different content controls.
      */
    var showDividers: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Indicates whether the incomplete item on the edge of visible area is displayed or hidden.
      */
    var showOverflowItem: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The width of the whole HeaderContainer. If not specified, it is rendered as '100%' in horizontal orientation
      * and as 'auto' in vertical orientation.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object HeaderContainerSettings {
    
    inline def apply(): HeaderContainerSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeaderContainerSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HeaderContainerSettings] (val x: Self) extends AnyVal {
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setBackgroundDesign(
        value: BackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "backgroundDesign", value.asInstanceOf[js.Any])
      
      inline def setBackgroundDesignUndefined: Self = StObject.set(x, "backgroundDesign", js.undefined)
      
      inline def setContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setGridLayout(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "gridLayout", value.asInstanceOf[js.Any])
      
      inline def setGridLayoutUndefined: Self = StObject.set(x, "gridLayout", js.undefined)
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setOrientation(
        value: Orientation | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Orientation * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setScroll(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "scroll", js.Any.fromFunction1(value))
      
      inline def setScrollStep(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "scrollStep", value.asInstanceOf[js.Any])
      
      inline def setScrollStepByItem(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "scrollStepByItem", value.asInstanceOf[js.Any])
      
      inline def setScrollStepByItemUndefined: Self = StObject.set(x, "scrollStepByItem", js.undefined)
      
      inline def setScrollStepUndefined: Self = StObject.set(x, "scrollStep", js.undefined)
      
      inline def setScrollTime(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "scrollTime", value.asInstanceOf[js.Any])
      
      inline def setScrollTimeUndefined: Self = StObject.set(x, "scrollTime", js.undefined)
      
      inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
      
      inline def setShowDividers(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showDividers", value.asInstanceOf[js.Any])
      
      inline def setShowDividersUndefined: Self = StObject.set(x, "showDividers", js.undefined)
      
      inline def setShowOverflowItem(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showOverflowItem", value.asInstanceOf[js.Any])
      
      inline def setShowOverflowItemUndefined: Self = StObject.set(x, "showOverflowItem", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
