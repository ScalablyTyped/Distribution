package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.IBar
import typings.openui5.sapMLibraryMod.PageBackgroundDesign
import typings.openui5.sapMLibraryMod.semantic.SemanticRuleSetType
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.TitleLevel
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMSemanticSemanticPageMod {
  
  @JSImport("sap/m/semantic/SemanticPage", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `SemanticPage`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link topic:4a97a07ec8f5441d901994d82eaab1f5 Semantic Page}
    * 	{@link topic:84f3d52f492648d5b594e4f45dca7727 Semantic Pages}
    */
  open class default () extends SemanticPage {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: SemanticPageSettings) = this()
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
    mSettings: SemanticPageSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: SemanticPageSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/semantic/SemanticPage", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.semantic.SemanticPage with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, SemanticPage]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, SemanticPage],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.semantic.SemanticPage.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait SemanticPage
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
      * Adds some customFooterContent to the aggregation {@link #getCustomFooterContent customFooterContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addCustomFooterContent(
      /**
      * The customFooterContent to add; if empty, nothing is inserted
      */
    oCustomFooterContent: typings.openui5.sapMButtonMod.default
    ): this.type = js.native
    
    /**
      * Adds some customHeaderContent to the aggregation {@link #getCustomHeaderContent customHeaderContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addCustomHeaderContent(
      /**
      * The customHeaderContent to add; if empty, nothing is inserted
      */
    oCustomHeaderContent: typings.openui5.sapMButtonMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:navButtonPress navButtonPress} event of this
      * `sap.m.semantic.SemanticPage`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.semantic.SemanticPage` itself.
      *
      * See {@link sap.m.Page#navButtonPress}
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachNavButtonPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachNavButtonPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.semantic.SemanticPage` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:navButtonPress navButtonPress} event of this
      * `sap.m.semantic.SemanticPage`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.semantic.SemanticPage` itself.
      *
      * See {@link sap.m.Page#navButtonPress}
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachNavButtonPress(
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
    def attachNavButtonPress(
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
      * Context object to call the event handler with. Defaults to this `sap.m.semantic.SemanticPage` itself
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
      * Destroys all the customFooterContent in the aggregation {@link #getCustomFooterContent customFooterContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyCustomFooterContent(): this.type = js.native
    
    /**
      * Destroys all the customHeaderContent in the aggregation {@link #getCustomHeaderContent customHeaderContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyCustomHeaderContent(): this.type = js.native
    
    /**
      * Destroys the landmarkInfo in the aggregation {@link #getLandmarkInfo landmarkInfo}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyLandmarkInfo(): this.type = js.native
    
    /**
      * Destroys the subHeader in the aggregation {@link #getSubHeader subHeader}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySubHeader(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:navButtonPress navButtonPress} event of this
      * `sap.m.semantic.SemanticPage`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachNavButtonPress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachNavButtonPress(
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
      * Fires event {@link #event:navButtonPress navButtonPress} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireNavButtonPress(): this.type = js.native
    def fireNavButtonPress(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @SINCE 1.52
      *
      * Gets current value of property {@link #getBackgroundDesign backgroundDesign}.
      *
      * Determines the backgound color of the page. For more information, see {@link sap.m.Page#backgroundDesign}.
      *
      * Default value is `Standard`.
      *
      * @returns Value of property `backgroundDesign`
      */
    def getBackgroundDesign(): PageBackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageBackgroundDesign * / any */ String) = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * See {@link sap.m.Page#content}
      */
    def getContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getCustomFooterContent customFooterContent}.
      *
      * Custom footer buttons
      */
    def getCustomFooterContent(): js.Array[typings.openui5.sapMButtonMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getCustomHeaderContent customHeaderContent}.
      *
      * Custom header buttons
      */
    def getCustomHeaderContent(): js.Array[typings.openui5.sapMButtonMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getEnableScrolling enableScrolling}.
      *
      * See {@link sap.m.Page#enableScrolling}
      *
      * Default value is `true`.
      *
      * @returns Value of property `enableScrolling`
      */
    def getEnableScrolling(): Boolean = js.native
    
    /**
      * @SINCE 1.40.1
      *
      * Gets current value of property {@link #getFloatingFooter floatingFooter}.
      *
      * Determines whether the floating footer behavior is enabled. If set to `true`, the content is visible
      * when it's underneath the footer.
      *
      * Default value is `false`.
      *
      * @returns Value of property `floatingFooter`
      */
    def getFloatingFooter(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getLandmarkInfo landmarkInfo}.
      *
      * Accessible landmark settings to be applied to the containers of the `sap.m.Page` control.
      *
      * If not set, no landmarks will be written.
      */
    def getLandmarkInfo(): typings.openui5.sapMPageAccessibleLandmarkInfoMod.default = js.native
    
    /**
      * @SINCE 1.44
      *
      * Gets current value of property {@link #getSemanticRuleSet semanticRuleSet}.
      *
      * Declares the type of semantic ruleset that will govern the styling and positioning of semantic content.
      *
      * Default value is `Classic`.
      *
      * @returns Value of property `semanticRuleSet`
      */
    def getSemanticRuleSet(): SemanticRuleSetType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof semantic.SemanticRuleSetType * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getShowFooter showFooter}.
      *
      * Hides or shows the page footer
      *
      * Default value is `true`.
      *
      * @returns Value of property `showFooter`
      */
    def getShowFooter(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowNavButton showNavButton}.
      *
      * See {@link sap.m.Page#showNavButton}
      *
      * Default value is `false`.
      *
      * @returns Value of property `showNavButton`
      */
    def getShowNavButton(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowSubHeader showSubHeader}.
      *
      * See {@link sap.m.Page#showSubHeader}
      *
      * Default value is `true`.
      *
      * @returns Value of property `showSubHeader`
      */
    def getShowSubHeader(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getSubHeader subHeader}.
      *
      * See {@link sap.m.Page#subHeader}
      */
    def getSubHeader(): IBar = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * See {@link sap.m.Page#title}
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
      * Gets current value of property {@link #getTitleLevel titleLevel}.
      *
      * See {@link sap.m.Page#titleLevel}
      *
      * Default value is `Auto`.
      *
      * @returns Value of property `titleLevel`
      */
    def getTitleLevel(): TitleLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String) = js.native
    
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
      * Checks for the provided `sap.m.Button` in the aggregation {@link #getCustomFooterContent customFooterContent}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfCustomFooterContent(
      /**
      * The customFooterContent whose index is looked for
      */
    oCustomFooterContent: typings.openui5.sapMButtonMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.m.Button` in the aggregation {@link #getCustomHeaderContent customHeaderContent}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfCustomHeaderContent(
      /**
      * The customHeaderContent whose index is looked for
      */
    oCustomHeaderContent: typings.openui5.sapMButtonMod.default
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
      * Inserts a customFooterContent into the aggregation {@link #getCustomFooterContent customFooterContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertCustomFooterContent(
      /**
      * The customFooterContent to insert; if empty, nothing is inserted
      */
    oCustomFooterContent: typings.openui5.sapMButtonMod.default,
      /**
      * The `0`-based index the customFooterContent should be inserted at; for a negative value of `iIndex`,
      * the customFooterContent is inserted at position 0; for a value greater than the current size of the aggregation,
      * the customFooterContent is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a customHeaderContent into the aggregation {@link #getCustomHeaderContent customHeaderContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertCustomHeaderContent(
      /**
      * The customHeaderContent to insert; if empty, nothing is inserted
      */
    oCustomHeaderContent: typings.openui5.sapMButtonMod.default,
      /**
      * The `0`-based index the customHeaderContent should be inserted at; for a negative value of `iIndex`,
      * the customHeaderContent is inserted at position 0; for a value greater than the current size of the aggregation,
      * the customHeaderContent is inserted at the last position
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
      * Removes all the controls from the aggregation {@link #getCustomFooterContent customFooterContent}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllCustomFooterContent(): js.Array[typings.openui5.sapMButtonMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getCustomHeaderContent customHeaderContent}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllCustomHeaderContent(): js.Array[typings.openui5.sapMButtonMod.default] = js.native
    
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
    
    def removeCustomFooterContent(/**
      * The customFooterContent to remove or its index or id
      */
    vCustomFooterContent: String): typings.openui5.sapMButtonMod.default | Null = js.native
    /**
      * Removes a customFooterContent from the aggregation {@link #getCustomFooterContent customFooterContent}.
      *
      * @returns The removed customFooterContent or `null`
      */
    def removeCustomFooterContent(/**
      * The customFooterContent to remove or its index or id
      */
    vCustomFooterContent: int): typings.openui5.sapMButtonMod.default | Null = js.native
    def removeCustomFooterContent(
      /**
      * The customFooterContent to remove or its index or id
      */
    vCustomFooterContent: typings.openui5.sapMButtonMod.default
    ): typings.openui5.sapMButtonMod.default | Null = js.native
    
    def removeCustomHeaderContent(/**
      * The customHeaderContent to remove or its index or id
      */
    vCustomHeaderContent: String): typings.openui5.sapMButtonMod.default | Null = js.native
    /**
      * Removes a customHeaderContent from the aggregation {@link #getCustomHeaderContent customHeaderContent}.
      *
      * @returns The removed customHeaderContent or `null`
      */
    def removeCustomHeaderContent(/**
      * The customHeaderContent to remove or its index or id
      */
    vCustomHeaderContent: int): typings.openui5.sapMButtonMod.default | Null = js.native
    def removeCustomHeaderContent(
      /**
      * The customHeaderContent to remove or its index or id
      */
    vCustomHeaderContent: typings.openui5.sapMButtonMod.default
    ): typings.openui5.sapMButtonMod.default | Null = js.native
    
    /**
      * @SINCE 1.52
      *
      * Sets a new value for property {@link #getBackgroundDesign backgroundDesign}.
      *
      * Determines the backgound color of the page. For more information, see {@link sap.m.Page#backgroundDesign}.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Standard`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBackgroundDesign(): this.type = js.native
    def setBackgroundDesign(
      /**
      * New value for property `backgroundDesign`
      */
    sBackgroundDesign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageBackgroundDesign * / any */ String
    ): this.type = js.native
    def setBackgroundDesign(/**
      * New value for property `backgroundDesign`
      */
    sBackgroundDesign: PageBackgroundDesign): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getEnableScrolling enableScrolling}.
      *
      * See {@link sap.m.Page#enableScrolling}
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnableScrolling(): this.type = js.native
    def setEnableScrolling(/**
      * New value for property `enableScrolling`
      */
    bEnableScrolling: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.40.1
      *
      * Sets a new value for property {@link #getFloatingFooter floatingFooter}.
      *
      * Determines whether the floating footer behavior is enabled. If set to `true`, the content is visible
      * when it's underneath the footer.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFloatingFooter(): this.type = js.native
    def setFloatingFooter(/**
      * New value for property `floatingFooter`
      */
    bFloatingFooter: Boolean): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getLandmarkInfo landmarkInfo}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLandmarkInfo(
      /**
      * The landmarkInfo to set
      */
    oLandmarkInfo: typings.openui5.sapMPageAccessibleLandmarkInfoMod.default
    ): this.type = js.native
    
    /**
      * @SINCE 1.44
      *
      * Sets a new value for property {@link #getSemanticRuleSet semanticRuleSet}.
      *
      * Declares the type of semantic ruleset that will govern the styling and positioning of semantic content.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Classic`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSemanticRuleSet(): this.type = js.native
    def setSemanticRuleSet(
      /**
      * New value for property `semanticRuleSet`
      */
    sSemanticRuleSet: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof semantic.SemanticRuleSetType * / any */ String
    ): this.type = js.native
    def setSemanticRuleSet(/**
      * New value for property `semanticRuleSet`
      */
    sSemanticRuleSet: SemanticRuleSetType): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowFooter showFooter}.
      *
      * Hides or shows the page footer
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowFooter(): this.type = js.native
    def setShowFooter(/**
      * New value for property `showFooter`
      */
    bShowFooter: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowNavButton showNavButton}.
      *
      * See {@link sap.m.Page#showNavButton}
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowNavButton(): this.type = js.native
    def setShowNavButton(/**
      * New value for property `showNavButton`
      */
    bShowNavButton: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowSubHeader showSubHeader}.
      *
      * See {@link sap.m.Page#showSubHeader}
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowSubHeader(): this.type = js.native
    def setShowSubHeader(/**
      * New value for property `showSubHeader`
      */
    bShowSubHeader: Boolean): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getSubHeader subHeader}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSubHeader(/**
      * The subHeader to set
      */
    oSubHeader: IBar): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitle title}.
      *
      * See {@link sap.m.Page#title}
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitle(): this.type = js.native
    def setTitle(/**
      * New value for property `title`
      */
    sTitle: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitleLevel titleLevel}.
      *
      * See {@link sap.m.Page#titleLevel}
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Auto`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitleLevel(): this.type = js.native
    def setTitleLevel(
      /**
      * New value for property `titleLevel`
      */
    sTitleLevel: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String
    ): this.type = js.native
    def setTitleLevel(/**
      * New value for property `titleLevel`
      */
    sTitleLevel: TitleLevel): this.type = js.native
  }
  
  trait SemanticPageSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @SINCE 1.52
      *
      * Determines the backgound color of the page. For more information, see {@link sap.m.Page#backgroundDesign}.
      */
    var backgroundDesign: js.UndefOr[
        PageBackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageBackgroundDesign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * See {@link sap.m.Page#content}
      */
    var content: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Custom footer buttons
      */
    var customFooterContent: js.UndefOr[
        js.Array[typings.openui5.sapMButtonMod.default] | typings.openui5.sapMButtonMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Custom header buttons
      */
    var customHeaderContent: js.UndefOr[
        js.Array[typings.openui5.sapMButtonMod.default] | typings.openui5.sapMButtonMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * See {@link sap.m.Page#enableScrolling}
      */
    var enableScrolling: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.40.1
      *
      * Determines whether the floating footer behavior is enabled. If set to `true`, the content is visible
      * when it's underneath the footer.
      */
    var floatingFooter: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Accessible landmark settings to be applied to the containers of the `sap.m.Page` control.
      *
      * If not set, no landmarks will be written.
      */
    var landmarkInfo: js.UndefOr[typings.openui5.sapMPageAccessibleLandmarkInfoMod.default] = js.undefined
    
    /**
      * See {@link sap.m.Page#navButtonPress}
      */
    var navButtonPress: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.44
      *
      * Declares the type of semantic ruleset that will govern the styling and positioning of semantic content.
      */
    var semanticRuleSet: js.UndefOr[
        SemanticRuleSetType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof semantic.SemanticRuleSetType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Hides or shows the page footer
      */
    var showFooter: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * See {@link sap.m.Page#showNavButton}
      */
    var showNavButton: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * See {@link sap.m.Page#showSubHeader}
      */
    var showSubHeader: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * See {@link sap.m.Page#subHeader}
      */
    var subHeader: js.UndefOr[IBar] = js.undefined
    
    /**
      * See {@link sap.m.Page#title}
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * See {@link sap.m.Page#titleLevel}
      */
    var titleLevel: js.UndefOr[
        TitleLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object SemanticPageSettings {
    
    inline def apply(): SemanticPageSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SemanticPageSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SemanticPageSettings] (val x: Self) extends AnyVal {
      
      inline def setBackgroundDesign(
        value: PageBackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageBackgroundDesign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "backgroundDesign", value.asInstanceOf[js.Any])
      
      inline def setBackgroundDesignUndefined: Self = StObject.set(x, "backgroundDesign", js.undefined)
      
      inline def setContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setCustomFooterContent(
        value: js.Array[typings.openui5.sapMButtonMod.default] | typings.openui5.sapMButtonMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "customFooterContent", value.asInstanceOf[js.Any])
      
      inline def setCustomFooterContentUndefined: Self = StObject.set(x, "customFooterContent", js.undefined)
      
      inline def setCustomFooterContentVarargs(value: typings.openui5.sapMButtonMod.default*): Self = StObject.set(x, "customFooterContent", js.Array(value*))
      
      inline def setCustomHeaderContent(
        value: js.Array[typings.openui5.sapMButtonMod.default] | typings.openui5.sapMButtonMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "customHeaderContent", value.asInstanceOf[js.Any])
      
      inline def setCustomHeaderContentUndefined: Self = StObject.set(x, "customHeaderContent", js.undefined)
      
      inline def setCustomHeaderContentVarargs(value: typings.openui5.sapMButtonMod.default*): Self = StObject.set(x, "customHeaderContent", js.Array(value*))
      
      inline def setEnableScrolling(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableScrolling", value.asInstanceOf[js.Any])
      
      inline def setEnableScrollingUndefined: Self = StObject.set(x, "enableScrolling", js.undefined)
      
      inline def setFloatingFooter(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "floatingFooter", value.asInstanceOf[js.Any])
      
      inline def setFloatingFooterUndefined: Self = StObject.set(x, "floatingFooter", js.undefined)
      
      inline def setLandmarkInfo(value: typings.openui5.sapMPageAccessibleLandmarkInfoMod.default): Self = StObject.set(x, "landmarkInfo", value.asInstanceOf[js.Any])
      
      inline def setLandmarkInfoUndefined: Self = StObject.set(x, "landmarkInfo", js.undefined)
      
      inline def setNavButtonPress(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "navButtonPress", js.Any.fromFunction1(value))
      
      inline def setNavButtonPressUndefined: Self = StObject.set(x, "navButtonPress", js.undefined)
      
      inline def setSemanticRuleSet(
        value: SemanticRuleSetType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof semantic.SemanticRuleSetType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "semanticRuleSet", value.asInstanceOf[js.Any])
      
      inline def setSemanticRuleSetUndefined: Self = StObject.set(x, "semanticRuleSet", js.undefined)
      
      inline def setShowFooter(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showFooter", value.asInstanceOf[js.Any])
      
      inline def setShowFooterUndefined: Self = StObject.set(x, "showFooter", js.undefined)
      
      inline def setShowNavButton(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showNavButton", value.asInstanceOf[js.Any])
      
      inline def setShowNavButtonUndefined: Self = StObject.set(x, "showNavButton", js.undefined)
      
      inline def setShowSubHeader(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showSubHeader", value.asInstanceOf[js.Any])
      
      inline def setShowSubHeaderUndefined: Self = StObject.set(x, "showSubHeader", js.undefined)
      
      inline def setSubHeader(value: IBar): Self = StObject.set(x, "subHeader", value.asInstanceOf[js.Any])
      
      inline def setSubHeaderUndefined: Self = StObject.set(x, "subHeader", js.undefined)
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleLevel(
        value: TitleLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "titleLevel", value.asInstanceOf[js.Any])
      
      inline def setTitleLevelUndefined: Self = StObject.set(x, "titleLevel", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
