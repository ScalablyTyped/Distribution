package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapFLibraryMod.DynamicPageTitleArea
import typings.openui5.sapFLibraryMod.DynamicPageTitleShrinkRatio
import typings.openui5.sapMLibraryMod.IBreadcrumbs
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapFSemanticSemanticPageMod {
  
  @JSImport("sap/f/semantic/SemanticPage", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `SemanticPage`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link topic:47dc86847f7a426a8e557167cf523bda Semantic Page}
    * 	{@link topic:84f3d52f492648d5b594e4f45dca7727 Semantic Pages}
    * 	{@link topic:4a97a07ec8f5441d901994d82eaab1f5 Semantic Page (sap.m)}
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/semantic-page/ Semantic Page}
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
    
    @JSImport("sap/f/semantic/SemanticPage", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.f.semantic.SemanticPage with name `sClassName` and enriches it with
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
      * Returns a metadata object for class sap.f.semantic.SemanticPage.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait SemanticPage
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some customShareAction to the aggregation {@link #getCustomShareActions customShareActions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addCustomShareAction(
      /**
      * The customShareAction to add; if empty, nothing is inserted
      */
    oCustomShareAction: typings.openui5.sapMButtonMod.default
    ): this.type = js.native
    
    /**
      * Adds some footerCustomAction to the aggregation {@link #getFooterCustomActions footerCustomActions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addFooterCustomAction(
      /**
      * The footerCustomAction to add; if empty, nothing is inserted
      */
    oFooterCustomAction: typings.openui5.sapMButtonMod.default
    ): this.type = js.native
    
    /**
      * Adds some headerContent to the aggregation {@link #getHeaderContent headerContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addHeaderContent(
      /**
      * The headerContent to add; if empty, nothing is inserted
      */
    oHeaderContent: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * @SINCE 1.52
      *
      * Adds some titleContent to the aggregation {@link #getTitleContent titleContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addTitleContent(
      /**
      * The titleContent to add; if empty, nothing is inserted
      */
    oTitleContent: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Adds some titleCustomIconAction to the aggregation {@link #getTitleCustomIconActions titleCustomIconActions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addTitleCustomIconAction(
      /**
      * The titleCustomIconAction to add; if empty, nothing is inserted
      */
    oTitleCustomIconAction: typings.openui5.sapMOverflowToolbarButtonMod.default
    ): this.type = js.native
    
    /**
      * Adds some titleCustomTextAction to the aggregation {@link #getTitleCustomTextActions titleCustomTextActions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addTitleCustomTextAction(
      /**
      * The titleCustomTextAction to add; if empty, nothing is inserted
      */
    oTitleCustomTextAction: typings.openui5.sapMButtonMod.default
    ): this.type = js.native
    
    /**
      * Adds some titleExpandedContent to the aggregation {@link #getTitleExpandedContent titleExpandedContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addTitleExpandedContent(
      /**
      * The titleExpandedContent to add; if empty, nothing is inserted
      */
    oTitleExpandedContent: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Adds some titleSnappedContent to the aggregation {@link #getTitleSnappedContent titleSnappedContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addTitleSnappedContent(
      /**
      * The titleSnappedContent to add; if empty, nothing is inserted
      */
    oTitleSnappedContent: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Destroys the addAction in the aggregation {@link #getAddAction addAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyAddAction(): this.type = js.native
    
    /**
      * Destroys the closeAction in the aggregation {@link #getCloseAction closeAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyCloseAction(): this.type = js.native
    
    /**
      * Destroys the content in the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContent(): this.type = js.native
    
    /**
      * Destroys the copyAction in the aggregation {@link #getCopyAction copyAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyCopyAction(): this.type = js.native
    
    /**
      * Destroys all the customShareActions in the aggregation {@link #getCustomShareActions customShareActions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyCustomShareActions(): this.type = js.native
    
    /**
      * Destroys the deleteAction in the aggregation {@link #getDeleteAction deleteAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyDeleteAction(): this.type = js.native
    
    /**
      * Destroys the discussInJamAction in the aggregation {@link #getDiscussInJamAction discussInJamAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyDiscussInJamAction(): this.type = js.native
    
    /**
      * Destroys the draftIndicator in the aggregation {@link #getDraftIndicator draftIndicator}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyDraftIndicator(): this.type = js.native
    
    /**
      * @SINCE 1.50
      *
      * Destroys the editAction in the aggregation {@link #getEditAction editAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyEditAction(): this.type = js.native
    
    /**
      * Destroys the exitFullScreenAction in the aggregation {@link #getExitFullScreenAction exitFullScreenAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyExitFullScreenAction(): this.type = js.native
    
    /**
      * Destroys the favoriteAction in the aggregation {@link #getFavoriteAction favoriteAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyFavoriteAction(): this.type = js.native
    
    /**
      * Destroys the flagAction in the aggregation {@link #getFlagAction flagAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyFlagAction(): this.type = js.native
    
    /**
      * Destroys all the footerCustomActions in the aggregation {@link #getFooterCustomActions footerCustomActions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyFooterCustomActions(): this.type = js.native
    
    /**
      * Destroys the footerMainAction in the aggregation {@link #getFooterMainAction footerMainAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyFooterMainAction(): this.type = js.native
    
    /**
      * Destroys the fullScreenAction in the aggregation {@link #getFullScreenAction fullScreenAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyFullScreenAction(): this.type = js.native
    
    /**
      * Destroys all the headerContent in the aggregation {@link #getHeaderContent headerContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyHeaderContent(): this.type = js.native
    
    /**
      * @SINCE 1.61
      *
      * Destroys the landmarkInfo in the aggregation {@link #getLandmarkInfo landmarkInfo}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyLandmarkInfo(): this.type = js.native
    
    /**
      * Destroys the messagesIndicator in the aggregation {@link #getMessagesIndicator messagesIndicator}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyMessagesIndicator(): this.type = js.native
    
    /**
      * Destroys the negativeAction in the aggregation {@link #getNegativeAction negativeAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyNegativeAction(): this.type = js.native
    
    /**
      * Destroys the positiveAction in the aggregation {@link #getPositiveAction positiveAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyPositiveAction(): this.type = js.native
    
    /**
      * Destroys the printAction in the aggregation {@link #getPrintAction printAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyPrintAction(): this.type = js.native
    
    /**
      * Destroys the saveAsTileAction in the aggregation {@link #getSaveAsTileAction saveAsTileAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySaveAsTileAction(): this.type = js.native
    
    /**
      * Destroys the sendEmailAction in the aggregation {@link #getSendEmailAction sendEmailAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySendEmailAction(): this.type = js.native
    
    /**
      * Destroys the sendMessageAction in the aggregation {@link #getSendMessageAction sendMessageAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySendMessageAction(): this.type = js.native
    
    /**
      * Destroys the shareInJamAction in the aggregation {@link #getShareInJamAction shareInJamAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyShareInJamAction(): this.type = js.native
    
    /**
      * @SINCE 1.52
      *
      * Destroys the titleBreadcrumbs in the aggregation {@link #getTitleBreadcrumbs titleBreadcrumbs}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyTitleBreadcrumbs(): this.type = js.native
    
    /**
      * @SINCE 1.52
      *
      * Destroys all the titleContent in the aggregation {@link #getTitleContent titleContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyTitleContent(): this.type = js.native
    
    /**
      * Destroys all the titleCustomIconActions in the aggregation {@link #getTitleCustomIconActions titleCustomIconActions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyTitleCustomIconActions(): this.type = js.native
    
    /**
      * Destroys all the titleCustomTextActions in the aggregation {@link #getTitleCustomTextActions titleCustomTextActions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyTitleCustomTextActions(): this.type = js.native
    
    /**
      * Destroys all the titleExpandedContent in the aggregation {@link #getTitleExpandedContent titleExpandedContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyTitleExpandedContent(): this.type = js.native
    
    /**
      * @SINCE 1.58
      *
      * Destroys the titleExpandedHeading in the aggregation {@link #getTitleExpandedHeading titleExpandedHeading}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyTitleExpandedHeading(): this.type = js.native
    
    /**
      * Destroys the titleHeading in the aggregation {@link #getTitleHeading titleHeading}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyTitleHeading(): this.type = js.native
    
    /**
      * Destroys the titleMainAction in the aggregation {@link #getTitleMainAction titleMainAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyTitleMainAction(): this.type = js.native
    
    /**
      * Destroys all the titleSnappedContent in the aggregation {@link #getTitleSnappedContent titleSnappedContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyTitleSnappedContent(): this.type = js.native
    
    /**
      * @SINCE 1.58
      *
      * Destroys the titleSnappedHeading in the aggregation {@link #getTitleSnappedHeading titleSnappedHeading}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyTitleSnappedHeading(): this.type = js.native
    
    /**
      * @SINCE 1.63
      *
      * Destroys the titleSnappedOnMobile in the aggregation {@link #getTitleSnappedOnMobile titleSnappedOnMobile}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyTitleSnappedOnMobile(): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getAddAction addAction}.
      *
      * A semantic-specific button which is placed in the `TextActions` area of the `SemanticPage` title.
      *
      * **Note:** If the `titleSnappedOnMobile` aggregation is set, its content overrides this aggregation when
      * the control is viewed on a phone mobile device and the `SemanticPage` header is in its collapsed (snapped)
      * state.
      */
    def getAddAction(): typings.openui5.sapFSemanticAddActionMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getCloseAction closeAction}.
      *
      * A semantic-specific button which is placed in the `IconActions` area of the `SemanticPage` title.
      *
      * **Note:** If the `titleSnappedOnMobile` aggregation is set, its content overrides this aggregation when
      * the control is viewed on a phone mobile device and the `SemanticPage` header is in its collapsed (snapped)
      * state.
      */
    def getCloseAction(): typings.openui5.sapFSemanticCloseActionMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * The `SemanticPage` content.
      *
      * **Note:** The SAP Fiori Design guidelines require that the `SemanticPage`'s header content and the `SemanticPage`'s
      * content are aligned vertically. When using {@link sap.ui.layout.form.Form}, {@link sap.m.Panel}, {@link
      * sap.m.Table} and {@link sap.m.List} in the content area of `SemanticPage`, if the content is not already
      * aligned, you need to adjust their left text offset to achieve the vertical alignment. To do this, apply
      * the `sapFSemanticPageAlignContent` CSS class to them and set their `width` property to `auto` (if not
      * set by default).
      *
      * Example:
      *
      *
      * ```javascript
      *
      * ` <Panel class=“sapFSemanticPageAlignContent” width=“auto”></Panel> `
      * ```
      *
      *
      * Please keep in mind that the alignment is not possible when the controls are placed in a {@link sap.ui.layout.Grid}
      * or in other layout controls that use `overflow:hidden` CSS property.
      */
    def getContent(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getCopyAction copyAction}.
      *
      * A semantic-specific button which is placed in the `TextActions` area of the `SemanticPage` title.
      *
      * **Note:** If the `titleSnappedOnMobile` aggregation is set, its content overrides this aggregation when
      * the control is viewed on a phone mobile device and the `SemanticPage` header is in its collapsed (snapped)
      * state.
      */
    def getCopyAction(): typings.openui5.sapFSemanticCopyActionMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getCustomShareActions customShareActions}.
      *
      * The `customShareActions` are placed in the `ShareMenu` area of the `SemanticPage` title, right after
      * the semantic actions.
      *
      * The text and icon of the button inside the `customShareActions` aggregation, can be customized.
      *
      * **Note:** If the `titleSnappedOnMobile` aggregation is set, its content overrides this aggregation when
      * the control is viewed on a phone mobile device and the `SemanticPage` header is in its collapsed (snapped)
      * state.
      */
    def getCustomShareActions(): js.Array[typings.openui5.sapMButtonMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getDeleteAction deleteAction}.
      *
      * A semantic-specific button which is placed in the `TextActions` area of the `SemanticPage` title.
      *
      * **Note:** If the `titleSnappedOnMobile` aggregation is set, its content overrides this aggregation when
      * the control is viewed on a phone mobile device and the `SemanticPage` header is in its collapsed (snapped)
      * state.
      */
    def getDeleteAction(): typings.openui5.sapFSemanticDeleteActionMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getDiscussInJamAction discussInJamAction}.
      *
      * A semantic-specific button which is placed in the `ShareMenu` area of the `SemanticPage` title.
      *
      * **Note:** If the `titleSnappedOnMobile` aggregation is set, its content overrides this aggregation when
      * the control is viewed on a phone mobile device and the `SemanticPage` header is in its collapsed (snapped)
      * state.
      */
    def getDiscussInJamAction(): typings.openui5.sapFSemanticDiscussInJamActionMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getDraftIndicator draftIndicator}.
      *
      * A semantic-specific button which is placed in the `FooterLeft` area of the `SemanticPage` footer as a
      * second action.
      */
    def getDraftIndicator(): typings.openui5.sapMDraftIndicatorMod.default = js.native
    
    /**
      * @SINCE 1.50
      *
      * Gets content of aggregation {@link #getEditAction editAction}.
      *
      * A semantic-specific button which is placed in the `TextActions` area of the `SemanticPage` title.
      *
      * **Note:** If the `titleSnappedOnMobile` aggregation is set, its content overrides this aggregation when
      * the control is viewed on a phone mobile device and the `SemanticPage` header is in its collapsed (snapped)
      * state.
      */
    def getEditAction(): typings.openui5.sapFSemanticEditActionMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getExitFullScreenAction exitFullScreenAction}.
      *
      * A semantic-specific button which is placed in the `IconActions` area of the `SemanticPage` title.
      *
      * **Note:** If the `titleSnappedOnMobile` aggregation is set, its content overrides this aggregation when
      * the control is viewed on a phone mobile device and the `SemanticPage` header is in its collapsed (snapped)
      * state.
      */
    def getExitFullScreenAction(): typings.openui5.sapFSemanticExitFullScreenActionMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getFavoriteAction favoriteAction}.
      *
      * A semantic-specific button which is placed in the `IconActions` area of the `SemanticPage` title.
      *
      * **Note:** If the `titleSnappedOnMobile` aggregation is set, its content overrides this aggregation when
      * the control is viewed on a phone mobile device and the `SemanticPage` header is in its collapsed (snapped)
      * state.
      */
    def getFavoriteAction(): typings.openui5.sapFSemanticFavoriteActionMod.default = js.native
    
    /**
      * @SINCE 1.73
      *
      * Gets current value of property {@link #getFitContent fitContent}.
      *
      * Optimizes `SemanticPage` responsiveness on small screens and behavior when expanding/collapsing the `SemanticPageHeader`.
      *
      * **Note:** It is recommended to use this property when displaying content of adaptive controls that stretch
      * to fill the available space. Such controls may be {@link sap.ui.table.Table} and {@link sap.ui.table.AnalyticalTable}
      * depending on their settings.
      *
      * Default value is `false`.
      *
      * @returns Value of property `fitContent`
      */
    def getFitContent(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getFlagAction flagAction}.
      *
      * A semantic-specific button which is placed in the `IconActions` area of the `SemanticPage` title.
      *
      * **Note:** If the `titleSnappedOnMobile` aggregation is set, its content overrides this aggregation when
      * the control is viewed on a phone mobile device and the `SemanticPage` header is in its collapsed (snapped)
      * state.
      */
    def getFlagAction(): typings.openui5.sapFSemanticFlagActionMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getFooterCustomActions footerCustomActions}.
      *
      * The `footerCustomActions` are placed in the `FooterRight` area of the `SemanticPage` footer, right after
      * the semantic footer actions.
      *
      * **Note:** Buttons that are part of this aggregation will always have their `type` property set to `Transparent`
      * by design.
      */
    def getFooterCustomActions(): js.Array[typings.openui5.sapMButtonMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getFooterMainAction footerMainAction}.
      *
      * A semantic-specific button which is placed in the `FooterRight` area of the `SemanticPage` footer with
      * default text value set to `Save`.
      */
    def getFooterMainAction(): typings.openui5.sapFSemanticFooterMainActionMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getFullScreenAction fullScreenAction}.
      *
      * A semantic-specific button which is placed in the `IconActions` area of the `SemanticPage` title.
      *
      * **Note:** If the `titleSnappedOnMobile` aggregation is set, its content overrides this aggregation when
      * the control is viewed on a phone mobile device and the `SemanticPage` header is in its collapsed (snapped)
      * state.
      */
    def getFullScreenAction(): typings.openui5.sapFSemanticFullScreenActionMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getHeaderContent headerContent}.
      *
      * The header content.
      */
    def getHeaderContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getHeaderExpanded headerExpanded}.
      *
      * Determines whether the header is expanded.
      *
      * The header can be also expanded/collapsed by user interaction, which requires the property to be internally
      * mutated by the control to reflect the changed state.
      *
      * **Note:** Please be aware, that initially collapsed header state is not supported, so `headerExpanded`
      * should not be set to `false` when initializing the control.
      *
      * Default value is `true`.
      *
      * @returns Value of property `headerExpanded`
      */
    def getHeaderExpanded(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getHeaderPinnable headerPinnable}.
      *
      * Determines whether the header is pinnable.
      *
      * Default value is `true`.
      *
      * @returns Value of property `headerPinnable`
      */
    def getHeaderPinnable(): Boolean = js.native
    
    /**
      * @SINCE 1.61
      *
      * Gets content of aggregation {@link #getLandmarkInfo landmarkInfo}.
      *
      * Accessible landmark settings to be applied to the containers of the `sap.f.SemanticPage` control.
      *
      * If not set, no landmarks will be written.
      */
    def getLandmarkInfo(): typings.openui5.sapFDynamicPageAccessibleLandmarkInfoMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getMessagesIndicator messagesIndicator}.
      *
      * A semantic-specific button which is placed in the `FooterLeft` area of the `SemanticPage` footer as a
      * first action.
      */
    def getMessagesIndicator(): typings.openui5.sapFSemanticMessagesIndicatorMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getNegativeAction negativeAction}.
      *
      * A semantic-specific button which is placed in the `FooterRight` area of the `SemanticPage` footer with
      * default text value set to `Reject`.
      */
    def getNegativeAction(): typings.openui5.sapFSemanticNegativeActionMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getPositiveAction positiveAction}.
      *
      * A semantic-specific button which is placed in the `FooterRight` area of the `SemanticPage` footer with
      * default text value set to `Accept`.
      */
    def getPositiveAction(): typings.openui5.sapFSemanticPositiveActionMod.default = js.native
    
    /**
      * Gets current value of property {@link #getPreserveHeaderStateOnScroll preserveHeaderStateOnScroll}.
      *
      * Preserves the current header state when scrolling.
      *
      * For example, if the user expands the header by clicking on the title and then scrolls down the page,
      * the header will remain expanded.
      *
      * **Note:** Based on internal rules, the value of the property is not always taken into account - for example,
      * when the control is rendered on tablet or mobile and the title and the header are with height larger
      * than a given threshold.
      *
      * Default value is `false`.
      *
      * @returns Value of property `preserveHeaderStateOnScroll`
      */
    def getPreserveHeaderStateOnScroll(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getPrintAction printAction}.
      *
      * A semantic-specific button which is placed in the `ShareMenu` area of the `SemanticPage` title.
      *
      * **Note:** If the `titleSnappedOnMobile` aggregation is set, its content overrides this aggregation when
      * the control is viewed on a phone mobile device and the `SemanticPage` header is in its collapsed (snapped)
      * state.
      */
    def getPrintAction(): typings.openui5.sapFSemanticPrintActionMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getSaveAsTileAction saveAsTileAction}.
      *
      * A button which is placed in the `ShareMenu` area of the `SemanticPage` title.
      *
      * **Note:** If the `titleSnappedOnMobile` aggregation is set, its content overrides this aggregation when
      * the control is viewed on a phone mobile device and the `SemanticPage` header is in its collapsed (snapped)
      * state.
      */
    def getSaveAsTileAction(): typings.openui5.sapMButtonMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getSendEmailAction sendEmailAction}.
      *
      * A semantic-specific button which is placed in the `ShareMenu` area of the `SemanticPage` title.
      *
      * **Note:** If the `titleSnappedOnMobile` aggregation is set, its content overrides this aggregation when
      * the control is viewed on a phone mobile device and the `SemanticPage` header is in its collapsed (snapped)
      * state.
      */
    def getSendEmailAction(): typings.openui5.sapFSemanticSendEmailActionMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getSendMessageAction sendMessageAction}.
      *
      * A semantic-specific button which is placed in the `ShareMenu` area of the `SemanticPage` title.
      *
      * **Note:** If the `titleSnappedOnMobile` aggregation is set, its content overrides this aggregation when
      * the control is viewed on a phone mobile device and the `SemanticPage` header is in its collapsed (snapped)
      * state.
      */
    def getSendMessageAction(): typings.openui5.sapFSemanticSendMessageActionMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getShareInJamAction shareInJamAction}.
      *
      * A semantic-specific button which is placed in the `ShareMenu` area of the `SemanticPage` title.
      *
      * **Note:** If the `titleSnappedOnMobile` aggregation is set, its content overrides this aggregation when
      * the control is viewed on a phone mobile device and the `SemanticPage` header is in its collapsed (snapped)
      * state.
      */
    def getShareInJamAction(): typings.openui5.sapFSemanticShareInJamActionMod.default = js.native
    
    /**
      * Gets current value of property {@link #getShowFooter showFooter}.
      *
      * Determines whether the footer is visible.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showFooter`
      */
    def getShowFooter(): Boolean = js.native
    
    /**
      * @SINCE 1.58
      *
      * Gets current value of property {@link #getTitleAreaShrinkRatio titleAreaShrinkRatio}.
      *
      * Assigns shrinking ratio to the `SemanticPage` title areas (Heading, Content, Actions). The greater value
      * a section has the faster it shrinks when the screen size is being reduced.
      *
      * The value must be set in `Heading:Content:Actions` format where Title, Content and Actions are numbers
      * greater than or equal to 0. If set to 0, the respective area will not shrink.
      *
      * For example, if `2:7:1` is set, the Content area will shrink seven times faster than the Actions area.
      * So, when all three areas have width of 500px and the available space is reduced by 100px the Title area
      * will be reduced by 20px, the Content area - by 70px and the Actions area - by 10px.
      *
      * If all the areas have assigned values greater than 1, the numbers are scaled so that at least one of
      * them is equal to 1. For example, value of `2:4:8` is equal to `1:2:4`.
      *
      * Default value is `"1:1.6:1.6"`.
      *
      * @returns Value of property `titleAreaShrinkRatio`
      */
    def getTitleAreaShrinkRatio(): DynamicPageTitleShrinkRatio = js.native
    
    /**
      * @SINCE 1.52
      *
      * Gets content of aggregation {@link #getTitleBreadcrumbs titleBreadcrumbs}.
      *
      * The `SemanticPage` breadcrumbs.
      *
      * A typical usage is the `sap.m.Breadcrumbs` control or any other UI5 control, that implements the `sap.m.IBreadcrumbs`
      * interface.
      *
      * **Notes:**
      * 	 - The control will be placed in the title`s top-left area.
      * 	 - If the `titleSnappedOnMobile` aggregation is set, its content overrides this aggregation when the
      * 			control is viewed on a phone mobile device and the `SemanticPage` header is in its collapsed (snapped)
      * 			state.
      */
    def getTitleBreadcrumbs(): IBreadcrumbs = js.native
    
    /**
      * @SINCE 1.52
      *
      * Gets content of aggregation {@link #getTitleContent titleContent}.
      *
      * The content, displayed in the title.
      *
      * **Notes:**
      * 	 - The controls will be placed in the middle area.
      * 	 - If the `titleSnappedOnMobile` aggregation is set, its content overrides this aggregation when the
      * 			control is viewed on a phone mobile device and the `SemanticPage` header is in its collapsed (snapped)
      * 			state.
      */
    def getTitleContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getTitleCustomIconActions titleCustomIconActions}.
      *
      * The `titleCustomIconActions` are placed in the `IconActions` area of the `SemanticPage` title, right
      * before the semantic icon action.
      *
      * **Note:** If the `titleSnappedOnMobile` aggregation is set, its content overrides this aggregation when
      * the control is viewed on a phone mobile device and the `SemanticPage` header is in its collapsed (snapped)
      * state.
      */
    def getTitleCustomIconActions(): js.Array[typings.openui5.sapMOverflowToolbarButtonMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getTitleCustomTextActions titleCustomTextActions}.
      *
      * The `titleCustomTextActions` are placed in the `TextActions` area of the `SemanticPage` title, right
      * before the semantic text action.
      *
      * **Notes:**
      * 	 - If the `titleSnappedOnMobile` aggregation is set, its content overrides this aggregation when the
      * 			control is viewed on a phone mobile device and the `SemanticPage` header is in its collapsed (snapped)
      * 			state.
      * 	 - Buttons that are part of this aggregation will always have their `type` property set to `Transparent`
      * 			by design.
      */
    def getTitleCustomTextActions(): js.Array[typings.openui5.sapMButtonMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getTitleExpandedContent titleExpandedContent}.
      *
      * The content,displayed in the title, when the header is in expanded state.
      *
      * **Note:** The controls will be placed in the title`s left area, under the `titleHeading` aggregation.
      */
    def getTitleExpandedContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * @SINCE 1.58
      *
      * Gets content of aggregation {@link #getTitleExpandedHeading titleExpandedHeading}.
      *
      * The `titleExpandedHeading` is positioned in the `SemanticPage` title left area and is displayed when
      * the header is in expanded state only. Use this aggregation to display a title (or any other UI5 control
      * that serves as a heading) that has to be present in expanded state only.
      *
      * **Note:** In order for `titleExpandedHeading` to be taken into account, `titleHeading` has to be empty.
      * Combine `titleExpandedHeading` with `titleSnappedHeading` to switch content when the header switches
      * state.
      */
    def getTitleExpandedHeading(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getTitleHeading titleHeading}.
      *
      * The `SemanticPage` heading.
      *
      * A typical usage is the `sap.m.Title` or any other UI5 control, that serves as a heading for an object.
      *
      * **Notes:**
      * 	 - The control will be placed in the title`s leftmost area.
      * 	 - `titleHeading` is mutually exclusive with `titleSnappedHeading` and `titleExpandedHeading`. If `titleHeading`
      * 			is provided, both `titleSnappedHeading` and `titleExpandedHeading` are ignored. `titleHeading` is useful
      * 			when the content of `titleSnappedHeading` and `titleExpandedHeading` needs to be the same as it replaces
      * 			them both.
      * 	 - If the `titleSnappedOnMobile` aggregation is set, its content overrides this aggregation when the
      * 			control is viewed on a phone mobile device and the `SemanticPage` header is in its collapsed (snapped)
      * 			state.
      */
    def getTitleHeading(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getTitleMainAction titleMainAction}.
      *
      * A semantic-specific button which is placed in the `SemanticPage` title as first action.
      *
      * **Note:** If the `titleSnappedOnMobile` aggregation is set, its content overrides this aggregation when
      * the control is viewed on a phone mobile device and the `SemanticPage` header is in its collapsed (snapped)
      * state.
      */
    def getTitleMainAction(): typings.openui5.sapFSemanticTitleMainActionMod.default = js.native
    
    /**
      * @SINCE 1.52
      * @deprecated (since 1.58) - Please use the `titleAreaShrinkRatio` property instead. The value of `titleAreaShrinkRatio`
      * must be set in `Heading:Content:Actions` format where Heading, Content and Actions are numbers greater
      * than or equal to 0. The greater value a section has the faster it shrinks when the screen size is being
      * reduced.
      *
      * `titlePrimaryArea=Begin` can be achieved by setting a low number for the Heading area to `titleAreaShrinkRatio`,
      * for example `1:1.6:1.6`.
      *
      * `titlePrimaryArea=Middle` can be achieved by setting a low number for the Content area to `titleAreaShrinkRatio`,
      * for example `1.6:1:1.6`.
      *
      * Gets current value of property {@link #getTitlePrimaryArea titlePrimaryArea}.
      *
      * Determines which of the title areas (Begin, Middle) is primary.
      *
      * **Note:** The primary area is shrinking at a lower rate, remaining visible as long as it can.
      *
      * Default value is `Begin`.
      *
      * @returns Value of property `titlePrimaryArea`
      */
    def getTitlePrimaryArea(): DynamicPageTitleArea | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DynamicPageTitleArea * / any */ String) = js.native
    
    /**
      * Gets content of aggregation {@link #getTitleSnappedContent titleSnappedContent}.
      *
      * The content, displayed in the title, when the header is in collapsed state.
      *
      * **Notes:**
      * 	 - The controls will be placed in the title`s left area, under the `titleHeading` aggregation.
      * 	 - If the `titleSnappedOnMobile` aggregation is set, its content overrides this aggregation when the
      * 			control is viewed on a phone mobile device and the `SemanticPage` header is in its collapsed (snapped)
      * 			state.
      */
    def getTitleSnappedContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * @SINCE 1.58
      *
      * Gets content of aggregation {@link #getTitleSnappedHeading titleSnappedHeading}.
      *
      * The `titleSnappedHeading` is positioned in the `SemanticPage` title left area and is displayed when the
      * header is in collapsed (snapped) state only. Use this aggregation to display a title (or any other UI5
      * control that serves as a heading) that has to be present in collapsed state only.
      *
      * **Notes:**
      * 	 - In order for `titleSnappedHeading` to be taken into account, `titleHeading` has to be empty. Combine
      * 			`titleSnappedHeading` with `titleExpandedHeading` to switch content when the header switches state.
      * 	 - If the `titleSnappedOnMobile` aggregation is set, its content overrides this aggregation when the
      * 			control is viewed on a phone mobile device and the `SemanticPage` header is in its collapsed (snapped)
      * 			state.
      */
    def getTitleSnappedHeading(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * @SINCE 1.63
      *
      * Gets content of aggregation {@link #getTitleSnappedOnMobile titleSnappedOnMobile}.
      *
      * The only content that is displayed in the `SemanticPage` title when it is viewed on a phone mobile device
      * and the `SemanticPage` header is in collapsed (snapped) state.
      *
      * Using this aggregation enables you to provide a simple, single-line title that takes less space on the
      * smaller phone screens when the `SemanticPage` header is in its collapsed (snapped) state.
      *
      * **Note:** The content set in this aggregation overrides all the other `SemanticPage` aggregations displayed
      * in the title and is only visible on phone mobile devices in collapsed (snapped) state of the `SemanticPage`
      * header.
      */
    def getTitleSnappedOnMobile(): typings.openui5.sapMTitleMod.default = js.native
    
    /**
      * Gets current value of property {@link #getToggleHeaderOnTitleClick toggleHeaderOnTitleClick}.
      *
      * Determines whether the user can switch between the expanded/collapsed states of the header by clicking
      * on the title.
      *
      * If set to `false`, the title is not clickable and the application must provide other means for expanding/collapsing
      * the header, if necessary.
      *
      * Default value is `true`.
      *
      * @returns Value of property `toggleHeaderOnTitleClick`
      */
    def getToggleHeaderOnTitleClick(): Boolean = js.native
    
    /**
      * Checks for the provided `sap.m.Button` in the aggregation {@link #getCustomShareActions customShareActions}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfCustomShareAction(
      /**
      * The customShareAction whose index is looked for
      */
    oCustomShareAction: typings.openui5.sapMButtonMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.m.Button` in the aggregation {@link #getFooterCustomActions footerCustomActions}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfFooterCustomAction(
      /**
      * The footerCustomAction whose index is looked for
      */
    oFooterCustomAction: typings.openui5.sapMButtonMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getHeaderContent headerContent}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfHeaderContent(
      /**
      * The headerContent whose index is looked for
      */
    oHeaderContent: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * @SINCE 1.52
      *
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getTitleContent titleContent}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfTitleContent(
      /**
      * The titleContent whose index is looked for
      */
    oTitleContent: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.m.OverflowToolbarButton` in the aggregation {@link #getTitleCustomIconActions
      * titleCustomIconActions}. and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfTitleCustomIconAction(
      /**
      * The titleCustomIconAction whose index is looked for
      */
    oTitleCustomIconAction: typings.openui5.sapMOverflowToolbarButtonMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.m.Button` in the aggregation {@link #getTitleCustomTextActions titleCustomTextActions}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfTitleCustomTextAction(
      /**
      * The titleCustomTextAction whose index is looked for
      */
    oTitleCustomTextAction: typings.openui5.sapMButtonMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getTitleExpandedContent titleExpandedContent}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfTitleExpandedContent(
      /**
      * The titleExpandedContent whose index is looked for
      */
    oTitleExpandedContent: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getTitleSnappedContent titleSnappedContent}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfTitleSnappedContent(
      /**
      * The titleSnappedContent whose index is looked for
      */
    oTitleSnappedContent: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Inserts a customShareAction into the aggregation {@link #getCustomShareActions customShareActions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertCustomShareAction(
      /**
      * The customShareAction to insert; if empty, nothing is inserted
      */
    oCustomShareAction: typings.openui5.sapMButtonMod.default,
      /**
      * The `0`-based index the customShareAction should be inserted at; for a negative value of `iIndex`, the
      * customShareAction is inserted at position 0; for a value greater than the current size of the aggregation,
      * the customShareAction is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a footerCustomAction into the aggregation {@link #getFooterCustomActions footerCustomActions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertFooterCustomAction(
      /**
      * The footerCustomAction to insert; if empty, nothing is inserted
      */
    oFooterCustomAction: typings.openui5.sapMButtonMod.default,
      /**
      * The `0`-based index the footerCustomAction should be inserted at; for a negative value of `iIndex`, the
      * footerCustomAction is inserted at position 0; for a value greater than the current size of the aggregation,
      * the footerCustomAction is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a headerContent into the aggregation {@link #getHeaderContent headerContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertHeaderContent(
      /**
      * The headerContent to insert; if empty, nothing is inserted
      */
    oHeaderContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the headerContent should be inserted at; for a negative value of `iIndex`, the headerContent
      * is inserted at position 0; for a value greater than the current size of the aggregation, the headerContent
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * @SINCE 1.52
      *
      * Inserts a titleContent into the aggregation {@link #getTitleContent titleContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertTitleContent(
      /**
      * The titleContent to insert; if empty, nothing is inserted
      */
    oTitleContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the titleContent should be inserted at; for a negative value of `iIndex`, the titleContent
      * is inserted at position 0; for a value greater than the current size of the aggregation, the titleContent
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a titleCustomIconAction into the aggregation {@link #getTitleCustomIconActions titleCustomIconActions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertTitleCustomIconAction(
      /**
      * The titleCustomIconAction to insert; if empty, nothing is inserted
      */
    oTitleCustomIconAction: typings.openui5.sapMOverflowToolbarButtonMod.default,
      /**
      * The `0`-based index the titleCustomIconAction should be inserted at; for a negative value of `iIndex`,
      * the titleCustomIconAction is inserted at position 0; for a value greater than the current size of the
      * aggregation, the titleCustomIconAction is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a titleCustomTextAction into the aggregation {@link #getTitleCustomTextActions titleCustomTextActions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertTitleCustomTextAction(
      /**
      * The titleCustomTextAction to insert; if empty, nothing is inserted
      */
    oTitleCustomTextAction: typings.openui5.sapMButtonMod.default,
      /**
      * The `0`-based index the titleCustomTextAction should be inserted at; for a negative value of `iIndex`,
      * the titleCustomTextAction is inserted at position 0; for a value greater than the current size of the
      * aggregation, the titleCustomTextAction is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a titleExpandedContent into the aggregation {@link #getTitleExpandedContent titleExpandedContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertTitleExpandedContent(
      /**
      * The titleExpandedContent to insert; if empty, nothing is inserted
      */
    oTitleExpandedContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the titleExpandedContent should be inserted at; for a negative value of `iIndex`,
      * the titleExpandedContent is inserted at position 0; for a value greater than the current size of the
      * aggregation, the titleExpandedContent is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a titleSnappedContent into the aggregation {@link #getTitleSnappedContent titleSnappedContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertTitleSnappedContent(
      /**
      * The titleSnappedContent to insert; if empty, nothing is inserted
      */
    oTitleSnappedContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the titleSnappedContent should be inserted at; for a negative value of `iIndex`,
      * the titleSnappedContent is inserted at position 0; for a value greater than the current size of the aggregation,
      * the titleSnappedContent is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getCustomShareActions customShareActions}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllCustomShareActions(): js.Array[typings.openui5.sapMButtonMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getFooterCustomActions footerCustomActions}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllFooterCustomActions(): js.Array[typings.openui5.sapMButtonMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getHeaderContent headerContent}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllHeaderContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * @SINCE 1.52
      *
      * Removes all the controls from the aggregation {@link #getTitleContent titleContent}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllTitleContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getTitleCustomIconActions titleCustomIconActions}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllTitleCustomIconActions(): js.Array[typings.openui5.sapMOverflowToolbarButtonMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getTitleCustomTextActions titleCustomTextActions}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllTitleCustomTextActions(): js.Array[typings.openui5.sapMButtonMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getTitleExpandedContent titleExpandedContent}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllTitleExpandedContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getTitleSnappedContent titleSnappedContent}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllTitleSnappedContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    def removeCustomShareAction(/**
      * The customShareAction to remove or its index or id
      */
    vCustomShareAction: String): typings.openui5.sapMButtonMod.default | Null = js.native
    /**
      * Removes a customShareAction from the aggregation {@link #getCustomShareActions customShareActions}.
      *
      * @returns The removed customShareAction or `null`
      */
    def removeCustomShareAction(/**
      * The customShareAction to remove or its index or id
      */
    vCustomShareAction: int): typings.openui5.sapMButtonMod.default | Null = js.native
    def removeCustomShareAction(
      /**
      * The customShareAction to remove or its index or id
      */
    vCustomShareAction: typings.openui5.sapMButtonMod.default
    ): typings.openui5.sapMButtonMod.default | Null = js.native
    
    def removeFooterCustomAction(/**
      * The footerCustomAction to remove or its index or id
      */
    vFooterCustomAction: String): typings.openui5.sapMButtonMod.default | Null = js.native
    /**
      * Removes a footerCustomAction from the aggregation {@link #getFooterCustomActions footerCustomActions}.
      *
      * @returns The removed footerCustomAction or `null`
      */
    def removeFooterCustomAction(/**
      * The footerCustomAction to remove or its index or id
      */
    vFooterCustomAction: int): typings.openui5.sapMButtonMod.default | Null = js.native
    def removeFooterCustomAction(
      /**
      * The footerCustomAction to remove or its index or id
      */
    vFooterCustomAction: typings.openui5.sapMButtonMod.default
    ): typings.openui5.sapMButtonMod.default | Null = js.native
    
    def removeHeaderContent(/**
      * The headerContent to remove or its index or id
      */
    vHeaderContent: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a headerContent from the aggregation {@link #getHeaderContent headerContent}.
      *
      * @returns The removed headerContent or `null`
      */
    def removeHeaderContent(/**
      * The headerContent to remove or its index or id
      */
    vHeaderContent: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeHeaderContent(
      /**
      * The headerContent to remove or its index or id
      */
    vHeaderContent: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    def removeTitleContent(/**
      * The titleContent to remove or its index or id
      */
    vTitleContent: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * @SINCE 1.52
      *
      * Removes a titleContent from the aggregation {@link #getTitleContent titleContent}.
      *
      * @returns The removed titleContent or `null`
      */
    def removeTitleContent(/**
      * The titleContent to remove or its index or id
      */
    vTitleContent: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeTitleContent(
      /**
      * The titleContent to remove or its index or id
      */
    vTitleContent: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    def removeTitleCustomIconAction(/**
      * The titleCustomIconAction to remove or its index or id
      */
    vTitleCustomIconAction: String): typings.openui5.sapMOverflowToolbarButtonMod.default | Null = js.native
    /**
      * Removes a titleCustomIconAction from the aggregation {@link #getTitleCustomIconActions titleCustomIconActions}.
      *
      * @returns The removed titleCustomIconAction or `null`
      */
    def removeTitleCustomIconAction(/**
      * The titleCustomIconAction to remove or its index or id
      */
    vTitleCustomIconAction: int): typings.openui5.sapMOverflowToolbarButtonMod.default | Null = js.native
    def removeTitleCustomIconAction(
      /**
      * The titleCustomIconAction to remove or its index or id
      */
    vTitleCustomIconAction: typings.openui5.sapMOverflowToolbarButtonMod.default
    ): typings.openui5.sapMOverflowToolbarButtonMod.default | Null = js.native
    
    def removeTitleCustomTextAction(/**
      * The titleCustomTextAction to remove or its index or id
      */
    vTitleCustomTextAction: String): typings.openui5.sapMButtonMod.default | Null = js.native
    /**
      * Removes a titleCustomTextAction from the aggregation {@link #getTitleCustomTextActions titleCustomTextActions}.
      *
      * @returns The removed titleCustomTextAction or `null`
      */
    def removeTitleCustomTextAction(/**
      * The titleCustomTextAction to remove or its index or id
      */
    vTitleCustomTextAction: int): typings.openui5.sapMButtonMod.default | Null = js.native
    def removeTitleCustomTextAction(
      /**
      * The titleCustomTextAction to remove or its index or id
      */
    vTitleCustomTextAction: typings.openui5.sapMButtonMod.default
    ): typings.openui5.sapMButtonMod.default | Null = js.native
    
    def removeTitleExpandedContent(/**
      * The titleExpandedContent to remove or its index or id
      */
    vTitleExpandedContent: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a titleExpandedContent from the aggregation {@link #getTitleExpandedContent titleExpandedContent}.
      *
      * @returns The removed titleExpandedContent or `null`
      */
    def removeTitleExpandedContent(/**
      * The titleExpandedContent to remove or its index or id
      */
    vTitleExpandedContent: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeTitleExpandedContent(
      /**
      * The titleExpandedContent to remove or its index or id
      */
    vTitleExpandedContent: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    def removeTitleSnappedContent(/**
      * The titleSnappedContent to remove or its index or id
      */
    vTitleSnappedContent: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a titleSnappedContent from the aggregation {@link #getTitleSnappedContent titleSnappedContent}.
      *
      * @returns The removed titleSnappedContent or `null`
      */
    def removeTitleSnappedContent(/**
      * The titleSnappedContent to remove or its index or id
      */
    vTitleSnappedContent: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeTitleSnappedContent(
      /**
      * The titleSnappedContent to remove or its index or id
      */
    vTitleSnappedContent: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * Sets the aggregated {@link #getAddAction addAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAddAction(/**
      * The addAction to set
      */
    oAddAction: typings.openui5.sapFSemanticAddActionMod.default): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getCloseAction closeAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCloseAction(
      /**
      * The closeAction to set
      */
    oCloseAction: typings.openui5.sapFSemanticCloseActionMod.default
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setContent(/**
      * The content to set
      */
    oContent: typings.openui5.sapUiCoreControlMod.default): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getCopyAction copyAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCopyAction(/**
      * The copyAction to set
      */
    oCopyAction: typings.openui5.sapFSemanticCopyActionMod.default): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getDeleteAction deleteAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDeleteAction(
      /**
      * The deleteAction to set
      */
    oDeleteAction: typings.openui5.sapFSemanticDeleteActionMod.default
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getDiscussInJamAction discussInJamAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDiscussInJamAction(
      /**
      * The discussInJamAction to set
      */
    oDiscussInJamAction: typings.openui5.sapFSemanticDiscussInJamActionMod.default
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getDraftIndicator draftIndicator}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDraftIndicator(
      /**
      * The draftIndicator to set
      */
    oDraftIndicator: typings.openui5.sapMDraftIndicatorMod.default
    ): this.type = js.native
    
    /**
      * @SINCE 1.50
      *
      * Sets the aggregated {@link #getEditAction editAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEditAction(/**
      * The editAction to set
      */
    oEditAction: typings.openui5.sapFSemanticEditActionMod.default): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getExitFullScreenAction exitFullScreenAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setExitFullScreenAction(
      /**
      * The exitFullScreenAction to set
      */
    oExitFullScreenAction: typings.openui5.sapFSemanticExitFullScreenActionMod.default
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getFavoriteAction favoriteAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFavoriteAction(
      /**
      * The favoriteAction to set
      */
    oFavoriteAction: typings.openui5.sapFSemanticFavoriteActionMod.default
    ): this.type = js.native
    
    /**
      * @SINCE 1.73
      *
      * Sets a new value for property {@link #getFitContent fitContent}.
      *
      * Optimizes `SemanticPage` responsiveness on small screens and behavior when expanding/collapsing the `SemanticPageHeader`.
      *
      * **Note:** It is recommended to use this property when displaying content of adaptive controls that stretch
      * to fill the available space. Such controls may be {@link sap.ui.table.Table} and {@link sap.ui.table.AnalyticalTable}
      * depending on their settings.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFitContent(): this.type = js.native
    def setFitContent(/**
      * New value for property `fitContent`
      */
    bFitContent: Boolean): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getFlagAction flagAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFlagAction(/**
      * The flagAction to set
      */
    oFlagAction: typings.openui5.sapFSemanticFlagActionMod.default): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getFooterMainAction footerMainAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFooterMainAction(
      /**
      * The footerMainAction to set
      */
    oFooterMainAction: typings.openui5.sapFSemanticFooterMainActionMod.default
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getFullScreenAction fullScreenAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFullScreenAction(
      /**
      * The fullScreenAction to set
      */
    oFullScreenAction: typings.openui5.sapFSemanticFullScreenActionMod.default
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeaderExpanded headerExpanded}.
      *
      * Determines whether the header is expanded.
      *
      * The header can be also expanded/collapsed by user interaction, which requires the property to be internally
      * mutated by the control to reflect the changed state.
      *
      * **Note:** Please be aware, that initially collapsed header state is not supported, so `headerExpanded`
      * should not be set to `false` when initializing the control.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeaderExpanded(): this.type = js.native
    def setHeaderExpanded(/**
      * New value for property `headerExpanded`
      */
    bHeaderExpanded: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeaderPinnable headerPinnable}.
      *
      * Determines whether the header is pinnable.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeaderPinnable(): this.type = js.native
    def setHeaderPinnable(/**
      * New value for property `headerPinnable`
      */
    bHeaderPinnable: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.61
      *
      * Sets the aggregated {@link #getLandmarkInfo landmarkInfo}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLandmarkInfo(
      /**
      * The landmarkInfo to set
      */
    oLandmarkInfo: typings.openui5.sapFDynamicPageAccessibleLandmarkInfoMod.default
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getMessagesIndicator messagesIndicator}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMessagesIndicator(
      /**
      * The messagesIndicator to set
      */
    oMessagesIndicator: typings.openui5.sapFSemanticMessagesIndicatorMod.default
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getNegativeAction negativeAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setNegativeAction(
      /**
      * The negativeAction to set
      */
    oNegativeAction: typings.openui5.sapFSemanticNegativeActionMod.default
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getPositiveAction positiveAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPositiveAction(
      /**
      * The positiveAction to set
      */
    oPositiveAction: typings.openui5.sapFSemanticPositiveActionMod.default
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getPreserveHeaderStateOnScroll preserveHeaderStateOnScroll}.
      *
      * Preserves the current header state when scrolling.
      *
      * For example, if the user expands the header by clicking on the title and then scrolls down the page,
      * the header will remain expanded.
      *
      * **Note:** Based on internal rules, the value of the property is not always taken into account - for example,
      * when the control is rendered on tablet or mobile and the title and the header are with height larger
      * than a given threshold.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPreserveHeaderStateOnScroll(): this.type = js.native
    def setPreserveHeaderStateOnScroll(
      /**
      * New value for property `preserveHeaderStateOnScroll`
      */
    bPreserveHeaderStateOnScroll: Boolean
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getPrintAction printAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPrintAction(
      /**
      * The printAction to set
      */
    oPrintAction: typings.openui5.sapFSemanticPrintActionMod.default
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getSaveAsTileAction saveAsTileAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSaveAsTileAction(/**
      * The saveAsTileAction to set
      */
    oSaveAsTileAction: typings.openui5.sapMButtonMod.default): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getSendEmailAction sendEmailAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSendEmailAction(
      /**
      * The sendEmailAction to set
      */
    oSendEmailAction: typings.openui5.sapFSemanticSendEmailActionMod.default
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getSendMessageAction sendMessageAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSendMessageAction(
      /**
      * The sendMessageAction to set
      */
    oSendMessageAction: typings.openui5.sapFSemanticSendMessageActionMod.default
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getShareInJamAction shareInJamAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShareInJamAction(
      /**
      * The shareInJamAction to set
      */
    oShareInJamAction: typings.openui5.sapFSemanticShareInJamActionMod.default
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowFooter showFooter}.
      *
      * Determines whether the footer is visible.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowFooter(): this.type = js.native
    def setShowFooter(/**
      * New value for property `showFooter`
      */
    bShowFooter: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.58
      *
      * Sets a new value for property {@link #getTitleAreaShrinkRatio titleAreaShrinkRatio}.
      *
      * Assigns shrinking ratio to the `SemanticPage` title areas (Heading, Content, Actions). The greater value
      * a section has the faster it shrinks when the screen size is being reduced.
      *
      * The value must be set in `Heading:Content:Actions` format where Title, Content and Actions are numbers
      * greater than or equal to 0. If set to 0, the respective area will not shrink.
      *
      * For example, if `2:7:1` is set, the Content area will shrink seven times faster than the Actions area.
      * So, when all three areas have width of 500px and the available space is reduced by 100px the Title area
      * will be reduced by 20px, the Content area - by 70px and the Actions area - by 10px.
      *
      * If all the areas have assigned values greater than 1, the numbers are scaled so that at least one of
      * them is equal to 1. For example, value of `2:4:8` is equal to `1:2:4`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"1:1.6:1.6"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitleAreaShrinkRatio(): this.type = js.native
    def setTitleAreaShrinkRatio(
      /**
      * New value for property `titleAreaShrinkRatio`
      */
    sTitleAreaShrinkRatio: DynamicPageTitleShrinkRatio
    ): this.type = js.native
    
    /**
      * @SINCE 1.52
      *
      * Sets the aggregated {@link #getTitleBreadcrumbs titleBreadcrumbs}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitleBreadcrumbs(/**
      * The titleBreadcrumbs to set
      */
    oTitleBreadcrumbs: IBreadcrumbs): this.type = js.native
    
    /**
      * @SINCE 1.58
      *
      * Sets the aggregated {@link #getTitleExpandedHeading titleExpandedHeading}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitleExpandedHeading(
      /**
      * The titleExpandedHeading to set
      */
    oTitleExpandedHeading: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getTitleHeading titleHeading}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitleHeading(/**
      * The titleHeading to set
      */
    oTitleHeading: typings.openui5.sapUiCoreControlMod.default): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getTitleMainAction titleMainAction}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitleMainAction(
      /**
      * The titleMainAction to set
      */
    oTitleMainAction: typings.openui5.sapFSemanticTitleMainActionMod.default
    ): this.type = js.native
    
    /**
      * @SINCE 1.58
      *
      * Sets the aggregated {@link #getTitleSnappedHeading titleSnappedHeading}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitleSnappedHeading(
      /**
      * The titleSnappedHeading to set
      */
    oTitleSnappedHeading: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * @SINCE 1.63
      *
      * Sets the aggregated {@link #getTitleSnappedOnMobile titleSnappedOnMobile}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitleSnappedOnMobile(
      /**
      * The titleSnappedOnMobile to set
      */
    oTitleSnappedOnMobile: typings.openui5.sapMTitleMod.default
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getToggleHeaderOnTitleClick toggleHeaderOnTitleClick}.
      *
      * Determines whether the user can switch between the expanded/collapsed states of the header by clicking
      * on the title.
      *
      * If set to `false`, the title is not clickable and the application must provide other means for expanding/collapsing
      * the header, if necessary.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setToggleHeaderOnTitleClick(): this.type = js.native
    def setToggleHeaderOnTitleClick(/**
      * New value for property `toggleHeaderOnTitleClick`
      */
    bToggleHeaderOnTitleClick: Boolean): this.type = js.native
  }
  
  trait SemanticPageSettings
    extends StObject
       with ControlSettings {
    
    /**
      * A semantic-specific button which is placed in the `TextActions` area of the `SemanticPage` title.
      *
      * **Note:** If the `titleSnappedOnMobile` aggregation is set, its content overrides this aggregation when
      * the control is viewed on a phone mobile device and the `SemanticPage` header is in its collapsed (snapped)
      * state.
      */
    var addAction: js.UndefOr[typings.openui5.sapFSemanticAddActionMod.default] = js.undefined
    
    /**
      * A semantic-specific button which is placed in the `IconActions` area of the `SemanticPage` title.
      *
      * **Note:** If the `titleSnappedOnMobile` aggregation is set, its content overrides this aggregation when
      * the control is viewed on a phone mobile device and the `SemanticPage` header is in its collapsed (snapped)
      * state.
      */
    var closeAction: js.UndefOr[typings.openui5.sapFSemanticCloseActionMod.default] = js.undefined
    
    /**
      * The `SemanticPage` content.
      *
      * **Note:** The SAP Fiori Design guidelines require that the `SemanticPage`'s header content and the `SemanticPage`'s
      * content are aligned vertically. When using {@link sap.ui.layout.form.Form}, {@link sap.m.Panel}, {@link
      * sap.m.Table} and {@link sap.m.List} in the content area of `SemanticPage`, if the content is not already
      * aligned, you need to adjust their left text offset to achieve the vertical alignment. To do this, apply
      * the `sapFSemanticPageAlignContent` CSS class to them and set their `width` property to `auto` (if not
      * set by default).
      *
      * Example:
      *
      *
      * ```javascript
      *
      * ` <Panel class=“sapFSemanticPageAlignContent” width=“auto”></Panel> `
      * ```
      *
      *
      * Please keep in mind that the alignment is not possible when the controls are placed in a {@link sap.ui.layout.Grid}
      * or in other layout controls that use `overflow:hidden` CSS property.
      */
    var content: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * A semantic-specific button which is placed in the `TextActions` area of the `SemanticPage` title.
      *
      * **Note:** If the `titleSnappedOnMobile` aggregation is set, its content overrides this aggregation when
      * the control is viewed on a phone mobile device and the `SemanticPage` header is in its collapsed (snapped)
      * state.
      */
    var copyAction: js.UndefOr[typings.openui5.sapFSemanticCopyActionMod.default] = js.undefined
    
    /**
      * The `customShareActions` are placed in the `ShareMenu` area of the `SemanticPage` title, right after
      * the semantic actions.
      *
      * The text and icon of the button inside the `customShareActions` aggregation, can be customized.
      *
      * **Note:** If the `titleSnappedOnMobile` aggregation is set, its content overrides this aggregation when
      * the control is viewed on a phone mobile device and the `SemanticPage` header is in its collapsed (snapped)
      * state.
      */
    var customShareActions: js.UndefOr[
        js.Array[typings.openui5.sapMButtonMod.default] | typings.openui5.sapMButtonMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * A semantic-specific button which is placed in the `TextActions` area of the `SemanticPage` title.
      *
      * **Note:** If the `titleSnappedOnMobile` aggregation is set, its content overrides this aggregation when
      * the control is viewed on a phone mobile device and the `SemanticPage` header is in its collapsed (snapped)
      * state.
      */
    var deleteAction: js.UndefOr[typings.openui5.sapFSemanticDeleteActionMod.default] = js.undefined
    
    /**
      * A semantic-specific button which is placed in the `ShareMenu` area of the `SemanticPage` title.
      *
      * **Note:** If the `titleSnappedOnMobile` aggregation is set, its content overrides this aggregation when
      * the control is viewed on a phone mobile device and the `SemanticPage` header is in its collapsed (snapped)
      * state.
      */
    var discussInJamAction: js.UndefOr[typings.openui5.sapFSemanticDiscussInJamActionMod.default] = js.undefined
    
    /**
      * A semantic-specific button which is placed in the `FooterLeft` area of the `SemanticPage` footer as a
      * second action.
      */
    var draftIndicator: js.UndefOr[typings.openui5.sapMDraftIndicatorMod.default] = js.undefined
    
    /**
      * @SINCE 1.50
      *
      * A semantic-specific button which is placed in the `TextActions` area of the `SemanticPage` title.
      *
      * **Note:** If the `titleSnappedOnMobile` aggregation is set, its content overrides this aggregation when
      * the control is viewed on a phone mobile device and the `SemanticPage` header is in its collapsed (snapped)
      * state.
      */
    var editAction: js.UndefOr[typings.openui5.sapFSemanticEditActionMod.default] = js.undefined
    
    /**
      * A semantic-specific button which is placed in the `IconActions` area of the `SemanticPage` title.
      *
      * **Note:** If the `titleSnappedOnMobile` aggregation is set, its content overrides this aggregation when
      * the control is viewed on a phone mobile device and the `SemanticPage` header is in its collapsed (snapped)
      * state.
      */
    var exitFullScreenAction: js.UndefOr[typings.openui5.sapFSemanticExitFullScreenActionMod.default] = js.undefined
    
    /**
      * A semantic-specific button which is placed in the `IconActions` area of the `SemanticPage` title.
      *
      * **Note:** If the `titleSnappedOnMobile` aggregation is set, its content overrides this aggregation when
      * the control is viewed on a phone mobile device and the `SemanticPage` header is in its collapsed (snapped)
      * state.
      */
    var favoriteAction: js.UndefOr[typings.openui5.sapFSemanticFavoriteActionMod.default] = js.undefined
    
    /**
      * @SINCE 1.73
      *
      * Optimizes `SemanticPage` responsiveness on small screens and behavior when expanding/collapsing the `SemanticPageHeader`.
      *
      * **Note:** It is recommended to use this property when displaying content of adaptive controls that stretch
      * to fill the available space. Such controls may be {@link sap.ui.table.Table} and {@link sap.ui.table.AnalyticalTable}
      * depending on their settings.
      */
    var fitContent: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * A semantic-specific button which is placed in the `IconActions` area of the `SemanticPage` title.
      *
      * **Note:** If the `titleSnappedOnMobile` aggregation is set, its content overrides this aggregation when
      * the control is viewed on a phone mobile device and the `SemanticPage` header is in its collapsed (snapped)
      * state.
      */
    var flagAction: js.UndefOr[typings.openui5.sapFSemanticFlagActionMod.default] = js.undefined
    
    /**
      * The `footerCustomActions` are placed in the `FooterRight` area of the `SemanticPage` footer, right after
      * the semantic footer actions.
      *
      * **Note:** Buttons that are part of this aggregation will always have their `type` property set to `Transparent`
      * by design.
      */
    var footerCustomActions: js.UndefOr[
        js.Array[typings.openui5.sapMButtonMod.default] | typings.openui5.sapMButtonMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * A semantic-specific button which is placed in the `FooterRight` area of the `SemanticPage` footer with
      * default text value set to `Save`.
      */
    var footerMainAction: js.UndefOr[typings.openui5.sapFSemanticFooterMainActionMod.default] = js.undefined
    
    /**
      * A semantic-specific button which is placed in the `IconActions` area of the `SemanticPage` title.
      *
      * **Note:** If the `titleSnappedOnMobile` aggregation is set, its content overrides this aggregation when
      * the control is viewed on a phone mobile device and the `SemanticPage` header is in its collapsed (snapped)
      * state.
      */
    var fullScreenAction: js.UndefOr[typings.openui5.sapFSemanticFullScreenActionMod.default] = js.undefined
    
    /**
      * The header content.
      */
    var headerContent: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines whether the header is expanded.
      *
      * The header can be also expanded/collapsed by user interaction, which requires the property to be internally
      * mutated by the control to reflect the changed state.
      *
      * **Note:** Please be aware, that initially collapsed header state is not supported, so `headerExpanded`
      * should not be set to `false` when initializing the control.
      */
    var headerExpanded: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines whether the header is pinnable.
      */
    var headerPinnable: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.61
      *
      * Accessible landmark settings to be applied to the containers of the `sap.f.SemanticPage` control.
      *
      * If not set, no landmarks will be written.
      */
    var landmarkInfo: js.UndefOr[typings.openui5.sapFDynamicPageAccessibleLandmarkInfoMod.default] = js.undefined
    
    /**
      * A semantic-specific button which is placed in the `FooterLeft` area of the `SemanticPage` footer as a
      * first action.
      */
    var messagesIndicator: js.UndefOr[typings.openui5.sapFSemanticMessagesIndicatorMod.default] = js.undefined
    
    /**
      * A semantic-specific button which is placed in the `FooterRight` area of the `SemanticPage` footer with
      * default text value set to `Reject`.
      */
    var negativeAction: js.UndefOr[typings.openui5.sapFSemanticNegativeActionMod.default] = js.undefined
    
    /**
      * A semantic-specific button which is placed in the `FooterRight` area of the `SemanticPage` footer with
      * default text value set to `Accept`.
      */
    var positiveAction: js.UndefOr[typings.openui5.sapFSemanticPositiveActionMod.default] = js.undefined
    
    /**
      * Preserves the current header state when scrolling.
      *
      * For example, if the user expands the header by clicking on the title and then scrolls down the page,
      * the header will remain expanded.
      *
      * **Note:** Based on internal rules, the value of the property is not always taken into account - for example,
      * when the control is rendered on tablet or mobile and the title and the header are with height larger
      * than a given threshold.
      */
    var preserveHeaderStateOnScroll: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * A semantic-specific button which is placed in the `ShareMenu` area of the `SemanticPage` title.
      *
      * **Note:** If the `titleSnappedOnMobile` aggregation is set, its content overrides this aggregation when
      * the control is viewed on a phone mobile device and the `SemanticPage` header is in its collapsed (snapped)
      * state.
      */
    var printAction: js.UndefOr[typings.openui5.sapFSemanticPrintActionMod.default] = js.undefined
    
    /**
      * A button which is placed in the `ShareMenu` area of the `SemanticPage` title.
      *
      * **Note:** If the `titleSnappedOnMobile` aggregation is set, its content overrides this aggregation when
      * the control is viewed on a phone mobile device and the `SemanticPage` header is in its collapsed (snapped)
      * state.
      */
    var saveAsTileAction: js.UndefOr[typings.openui5.sapMButtonMod.default] = js.undefined
    
    /**
      * A semantic-specific button which is placed in the `ShareMenu` area of the `SemanticPage` title.
      *
      * **Note:** If the `titleSnappedOnMobile` aggregation is set, its content overrides this aggregation when
      * the control is viewed on a phone mobile device and the `SemanticPage` header is in its collapsed (snapped)
      * state.
      */
    var sendEmailAction: js.UndefOr[typings.openui5.sapFSemanticSendEmailActionMod.default] = js.undefined
    
    /**
      * A semantic-specific button which is placed in the `ShareMenu` area of the `SemanticPage` title.
      *
      * **Note:** If the `titleSnappedOnMobile` aggregation is set, its content overrides this aggregation when
      * the control is viewed on a phone mobile device and the `SemanticPage` header is in its collapsed (snapped)
      * state.
      */
    var sendMessageAction: js.UndefOr[typings.openui5.sapFSemanticSendMessageActionMod.default] = js.undefined
    
    /**
      * A semantic-specific button which is placed in the `ShareMenu` area of the `SemanticPage` title.
      *
      * **Note:** If the `titleSnappedOnMobile` aggregation is set, its content overrides this aggregation when
      * the control is viewed on a phone mobile device and the `SemanticPage` header is in its collapsed (snapped)
      * state.
      */
    var shareInJamAction: js.UndefOr[typings.openui5.sapFSemanticShareInJamActionMod.default] = js.undefined
    
    /**
      * Determines whether the footer is visible.
      */
    var showFooter: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.58
      *
      * Assigns shrinking ratio to the `SemanticPage` title areas (Heading, Content, Actions). The greater value
      * a section has the faster it shrinks when the screen size is being reduced.
      *
      * The value must be set in `Heading:Content:Actions` format where Title, Content and Actions are numbers
      * greater than or equal to 0. If set to 0, the respective area will not shrink.
      *
      * For example, if `2:7:1` is set, the Content area will shrink seven times faster than the Actions area.
      * So, when all three areas have width of 500px and the available space is reduced by 100px the Title area
      * will be reduced by 20px, the Content area - by 70px and the Actions area - by 10px.
      *
      * If all the areas have assigned values greater than 1, the numbers are scaled so that at least one of
      * them is equal to 1. For example, value of `2:4:8` is equal to `1:2:4`.
      */
    var titleAreaShrinkRatio: js.UndefOr[
        DynamicPageTitleShrinkRatio | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.52
      *
      * The `SemanticPage` breadcrumbs.
      *
      * A typical usage is the `sap.m.Breadcrumbs` control or any other UI5 control, that implements the `sap.m.IBreadcrumbs`
      * interface.
      *
      * **Notes:**
      * 	 - The control will be placed in the title`s top-left area.
      * 	 - If the `titleSnappedOnMobile` aggregation is set, its content overrides this aggregation when the
      * 			control is viewed on a phone mobile device and the `SemanticPage` header is in its collapsed (snapped)
      * 			state.
      */
    var titleBreadcrumbs: js.UndefOr[IBreadcrumbs] = js.undefined
    
    /**
      * @SINCE 1.52
      *
      * The content, displayed in the title.
      *
      * **Notes:**
      * 	 - The controls will be placed in the middle area.
      * 	 - If the `titleSnappedOnMobile` aggregation is set, its content overrides this aggregation when the
      * 			control is viewed on a phone mobile device and the `SemanticPage` header is in its collapsed (snapped)
      * 			state.
      */
    var titleContent: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The `titleCustomIconActions` are placed in the `IconActions` area of the `SemanticPage` title, right
      * before the semantic icon action.
      *
      * **Note:** If the `titleSnappedOnMobile` aggregation is set, its content overrides this aggregation when
      * the control is viewed on a phone mobile device and the `SemanticPage` header is in its collapsed (snapped)
      * state.
      */
    var titleCustomIconActions: js.UndefOr[
        js.Array[typings.openui5.sapMOverflowToolbarButtonMod.default] | typings.openui5.sapMOverflowToolbarButtonMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The `titleCustomTextActions` are placed in the `TextActions` area of the `SemanticPage` title, right
      * before the semantic text action.
      *
      * **Notes:**
      * 	 - If the `titleSnappedOnMobile` aggregation is set, its content overrides this aggregation when the
      * 			control is viewed on a phone mobile device and the `SemanticPage` header is in its collapsed (snapped)
      * 			state.
      * 	 - Buttons that are part of this aggregation will always have their `type` property set to `Transparent`
      * 			by design.
      */
    var titleCustomTextActions: js.UndefOr[
        js.Array[typings.openui5.sapMButtonMod.default] | typings.openui5.sapMButtonMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The content,displayed in the title, when the header is in expanded state.
      *
      * **Note:** The controls will be placed in the title`s left area, under the `titleHeading` aggregation.
      */
    var titleExpandedContent: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.58
      *
      * The `titleExpandedHeading` is positioned in the `SemanticPage` title left area and is displayed when
      * the header is in expanded state only. Use this aggregation to display a title (or any other UI5 control
      * that serves as a heading) that has to be present in expanded state only.
      *
      * **Note:** In order for `titleExpandedHeading` to be taken into account, `titleHeading` has to be empty.
      * Combine `titleExpandedHeading` with `titleSnappedHeading` to switch content when the header switches
      * state.
      */
    var titleExpandedHeading: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * The `SemanticPage` heading.
      *
      * A typical usage is the `sap.m.Title` or any other UI5 control, that serves as a heading for an object.
      *
      * **Notes:**
      * 	 - The control will be placed in the title`s leftmost area.
      * 	 - `titleHeading` is mutually exclusive with `titleSnappedHeading` and `titleExpandedHeading`. If `titleHeading`
      * 			is provided, both `titleSnappedHeading` and `titleExpandedHeading` are ignored. `titleHeading` is useful
      * 			when the content of `titleSnappedHeading` and `titleExpandedHeading` needs to be the same as it replaces
      * 			them both.
      * 	 - If the `titleSnappedOnMobile` aggregation is set, its content overrides this aggregation when the
      * 			control is viewed on a phone mobile device and the `SemanticPage` header is in its collapsed (snapped)
      * 			state.
      */
    var titleHeading: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * A semantic-specific button which is placed in the `SemanticPage` title as first action.
      *
      * **Note:** If the `titleSnappedOnMobile` aggregation is set, its content overrides this aggregation when
      * the control is viewed on a phone mobile device and the `SemanticPage` header is in its collapsed (snapped)
      * state.
      */
    var titleMainAction: js.UndefOr[typings.openui5.sapFSemanticTitleMainActionMod.default] = js.undefined
    
    /**
      * @SINCE 1.52
      * @deprecated (since 1.58) - Please use the `titleAreaShrinkRatio` property instead. The value of `titleAreaShrinkRatio`
      * must be set in `Heading:Content:Actions` format where Heading, Content and Actions are numbers greater
      * than or equal to 0. The greater value a section has the faster it shrinks when the screen size is being
      * reduced.
      *
      * `titlePrimaryArea=Begin` can be achieved by setting a low number for the Heading area to `titleAreaShrinkRatio`,
      * for example `1:1.6:1.6`.
      *
      * `titlePrimaryArea=Middle` can be achieved by setting a low number for the Content area to `titleAreaShrinkRatio`,
      * for example `1.6:1:1.6`.
      *
      * Determines which of the title areas (Begin, Middle) is primary.
      *
      * **Note:** The primary area is shrinking at a lower rate, remaining visible as long as it can.
      */
    var titlePrimaryArea: js.UndefOr[
        DynamicPageTitleArea | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DynamicPageTitleArea * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * The content, displayed in the title, when the header is in collapsed state.
      *
      * **Notes:**
      * 	 - The controls will be placed in the title`s left area, under the `titleHeading` aggregation.
      * 	 - If the `titleSnappedOnMobile` aggregation is set, its content overrides this aggregation when the
      * 			control is viewed on a phone mobile device and the `SemanticPage` header is in its collapsed (snapped)
      * 			state.
      */
    var titleSnappedContent: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.58
      *
      * The `titleSnappedHeading` is positioned in the `SemanticPage` title left area and is displayed when the
      * header is in collapsed (snapped) state only. Use this aggregation to display a title (or any other UI5
      * control that serves as a heading) that has to be present in collapsed state only.
      *
      * **Notes:**
      * 	 - In order for `titleSnappedHeading` to be taken into account, `titleHeading` has to be empty. Combine
      * 			`titleSnappedHeading` with `titleExpandedHeading` to switch content when the header switches state.
      * 	 - If the `titleSnappedOnMobile` aggregation is set, its content overrides this aggregation when the
      * 			control is viewed on a phone mobile device and the `SemanticPage` header is in its collapsed (snapped)
      * 			state.
      */
    var titleSnappedHeading: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * @SINCE 1.63
      *
      * The only content that is displayed in the `SemanticPage` title when it is viewed on a phone mobile device
      * and the `SemanticPage` header is in collapsed (snapped) state.
      *
      * Using this aggregation enables you to provide a simple, single-line title that takes less space on the
      * smaller phone screens when the `SemanticPage` header is in its collapsed (snapped) state.
      *
      * **Note:** The content set in this aggregation overrides all the other `SemanticPage` aggregations displayed
      * in the title and is only visible on phone mobile devices in collapsed (snapped) state of the `SemanticPage`
      * header.
      */
    var titleSnappedOnMobile: js.UndefOr[typings.openui5.sapMTitleMod.default] = js.undefined
    
    /**
      * Determines whether the user can switch between the expanded/collapsed states of the header by clicking
      * on the title.
      *
      * If set to `false`, the title is not clickable and the application must provide other means for expanding/collapsing
      * the header, if necessary.
      */
    var toggleHeaderOnTitleClick: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object SemanticPageSettings {
    
    inline def apply(): SemanticPageSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SemanticPageSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SemanticPageSettings] (val x: Self) extends AnyVal {
      
      inline def setAddAction(value: typings.openui5.sapFSemanticAddActionMod.default): Self = StObject.set(x, "addAction", value.asInstanceOf[js.Any])
      
      inline def setAddActionUndefined: Self = StObject.set(x, "addAction", js.undefined)
      
      inline def setCloseAction(value: typings.openui5.sapFSemanticCloseActionMod.default): Self = StObject.set(x, "closeAction", value.asInstanceOf[js.Any])
      
      inline def setCloseActionUndefined: Self = StObject.set(x, "closeAction", js.undefined)
      
      inline def setContent(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setCopyAction(value: typings.openui5.sapFSemanticCopyActionMod.default): Self = StObject.set(x, "copyAction", value.asInstanceOf[js.Any])
      
      inline def setCopyActionUndefined: Self = StObject.set(x, "copyAction", js.undefined)
      
      inline def setCustomShareActions(
        value: js.Array[typings.openui5.sapMButtonMod.default] | typings.openui5.sapMButtonMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "customShareActions", value.asInstanceOf[js.Any])
      
      inline def setCustomShareActionsUndefined: Self = StObject.set(x, "customShareActions", js.undefined)
      
      inline def setCustomShareActionsVarargs(value: typings.openui5.sapMButtonMod.default*): Self = StObject.set(x, "customShareActions", js.Array(value*))
      
      inline def setDeleteAction(value: typings.openui5.sapFSemanticDeleteActionMod.default): Self = StObject.set(x, "deleteAction", value.asInstanceOf[js.Any])
      
      inline def setDeleteActionUndefined: Self = StObject.set(x, "deleteAction", js.undefined)
      
      inline def setDiscussInJamAction(value: typings.openui5.sapFSemanticDiscussInJamActionMod.default): Self = StObject.set(x, "discussInJamAction", value.asInstanceOf[js.Any])
      
      inline def setDiscussInJamActionUndefined: Self = StObject.set(x, "discussInJamAction", js.undefined)
      
      inline def setDraftIndicator(value: typings.openui5.sapMDraftIndicatorMod.default): Self = StObject.set(x, "draftIndicator", value.asInstanceOf[js.Any])
      
      inline def setDraftIndicatorUndefined: Self = StObject.set(x, "draftIndicator", js.undefined)
      
      inline def setEditAction(value: typings.openui5.sapFSemanticEditActionMod.default): Self = StObject.set(x, "editAction", value.asInstanceOf[js.Any])
      
      inline def setEditActionUndefined: Self = StObject.set(x, "editAction", js.undefined)
      
      inline def setExitFullScreenAction(value: typings.openui5.sapFSemanticExitFullScreenActionMod.default): Self = StObject.set(x, "exitFullScreenAction", value.asInstanceOf[js.Any])
      
      inline def setExitFullScreenActionUndefined: Self = StObject.set(x, "exitFullScreenAction", js.undefined)
      
      inline def setFavoriteAction(value: typings.openui5.sapFSemanticFavoriteActionMod.default): Self = StObject.set(x, "favoriteAction", value.asInstanceOf[js.Any])
      
      inline def setFavoriteActionUndefined: Self = StObject.set(x, "favoriteAction", js.undefined)
      
      inline def setFitContent(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "fitContent", value.asInstanceOf[js.Any])
      
      inline def setFitContentUndefined: Self = StObject.set(x, "fitContent", js.undefined)
      
      inline def setFlagAction(value: typings.openui5.sapFSemanticFlagActionMod.default): Self = StObject.set(x, "flagAction", value.asInstanceOf[js.Any])
      
      inline def setFlagActionUndefined: Self = StObject.set(x, "flagAction", js.undefined)
      
      inline def setFooterCustomActions(
        value: js.Array[typings.openui5.sapMButtonMod.default] | typings.openui5.sapMButtonMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "footerCustomActions", value.asInstanceOf[js.Any])
      
      inline def setFooterCustomActionsUndefined: Self = StObject.set(x, "footerCustomActions", js.undefined)
      
      inline def setFooterCustomActionsVarargs(value: typings.openui5.sapMButtonMod.default*): Self = StObject.set(x, "footerCustomActions", js.Array(value*))
      
      inline def setFooterMainAction(value: typings.openui5.sapFSemanticFooterMainActionMod.default): Self = StObject.set(x, "footerMainAction", value.asInstanceOf[js.Any])
      
      inline def setFooterMainActionUndefined: Self = StObject.set(x, "footerMainAction", js.undefined)
      
      inline def setFullScreenAction(value: typings.openui5.sapFSemanticFullScreenActionMod.default): Self = StObject.set(x, "fullScreenAction", value.asInstanceOf[js.Any])
      
      inline def setFullScreenActionUndefined: Self = StObject.set(x, "fullScreenAction", js.undefined)
      
      inline def setHeaderContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "headerContent", value.asInstanceOf[js.Any])
      
      inline def setHeaderContentUndefined: Self = StObject.set(x, "headerContent", js.undefined)
      
      inline def setHeaderContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "headerContent", js.Array(value*))
      
      inline def setHeaderExpanded(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "headerExpanded", value.asInstanceOf[js.Any])
      
      inline def setHeaderExpandedUndefined: Self = StObject.set(x, "headerExpanded", js.undefined)
      
      inline def setHeaderPinnable(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "headerPinnable", value.asInstanceOf[js.Any])
      
      inline def setHeaderPinnableUndefined: Self = StObject.set(x, "headerPinnable", js.undefined)
      
      inline def setLandmarkInfo(value: typings.openui5.sapFDynamicPageAccessibleLandmarkInfoMod.default): Self = StObject.set(x, "landmarkInfo", value.asInstanceOf[js.Any])
      
      inline def setLandmarkInfoUndefined: Self = StObject.set(x, "landmarkInfo", js.undefined)
      
      inline def setMessagesIndicator(value: typings.openui5.sapFSemanticMessagesIndicatorMod.default): Self = StObject.set(x, "messagesIndicator", value.asInstanceOf[js.Any])
      
      inline def setMessagesIndicatorUndefined: Self = StObject.set(x, "messagesIndicator", js.undefined)
      
      inline def setNegativeAction(value: typings.openui5.sapFSemanticNegativeActionMod.default): Self = StObject.set(x, "negativeAction", value.asInstanceOf[js.Any])
      
      inline def setNegativeActionUndefined: Self = StObject.set(x, "negativeAction", js.undefined)
      
      inline def setPositiveAction(value: typings.openui5.sapFSemanticPositiveActionMod.default): Self = StObject.set(x, "positiveAction", value.asInstanceOf[js.Any])
      
      inline def setPositiveActionUndefined: Self = StObject.set(x, "positiveAction", js.undefined)
      
      inline def setPreserveHeaderStateOnScroll(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "preserveHeaderStateOnScroll", value.asInstanceOf[js.Any])
      
      inline def setPreserveHeaderStateOnScrollUndefined: Self = StObject.set(x, "preserveHeaderStateOnScroll", js.undefined)
      
      inline def setPrintAction(value: typings.openui5.sapFSemanticPrintActionMod.default): Self = StObject.set(x, "printAction", value.asInstanceOf[js.Any])
      
      inline def setPrintActionUndefined: Self = StObject.set(x, "printAction", js.undefined)
      
      inline def setSaveAsTileAction(value: typings.openui5.sapMButtonMod.default): Self = StObject.set(x, "saveAsTileAction", value.asInstanceOf[js.Any])
      
      inline def setSaveAsTileActionUndefined: Self = StObject.set(x, "saveAsTileAction", js.undefined)
      
      inline def setSendEmailAction(value: typings.openui5.sapFSemanticSendEmailActionMod.default): Self = StObject.set(x, "sendEmailAction", value.asInstanceOf[js.Any])
      
      inline def setSendEmailActionUndefined: Self = StObject.set(x, "sendEmailAction", js.undefined)
      
      inline def setSendMessageAction(value: typings.openui5.sapFSemanticSendMessageActionMod.default): Self = StObject.set(x, "sendMessageAction", value.asInstanceOf[js.Any])
      
      inline def setSendMessageActionUndefined: Self = StObject.set(x, "sendMessageAction", js.undefined)
      
      inline def setShareInJamAction(value: typings.openui5.sapFSemanticShareInJamActionMod.default): Self = StObject.set(x, "shareInJamAction", value.asInstanceOf[js.Any])
      
      inline def setShareInJamActionUndefined: Self = StObject.set(x, "shareInJamAction", js.undefined)
      
      inline def setShowFooter(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showFooter", value.asInstanceOf[js.Any])
      
      inline def setShowFooterUndefined: Self = StObject.set(x, "showFooter", js.undefined)
      
      inline def setTitleAreaShrinkRatio(
        value: DynamicPageTitleShrinkRatio | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "titleAreaShrinkRatio", value.asInstanceOf[js.Any])
      
      inline def setTitleAreaShrinkRatioUndefined: Self = StObject.set(x, "titleAreaShrinkRatio", js.undefined)
      
      inline def setTitleBreadcrumbs(value: IBreadcrumbs): Self = StObject.set(x, "titleBreadcrumbs", value.asInstanceOf[js.Any])
      
      inline def setTitleBreadcrumbsUndefined: Self = StObject.set(x, "titleBreadcrumbs", js.undefined)
      
      inline def setTitleContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "titleContent", value.asInstanceOf[js.Any])
      
      inline def setTitleContentUndefined: Self = StObject.set(x, "titleContent", js.undefined)
      
      inline def setTitleContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "titleContent", js.Array(value*))
      
      inline def setTitleCustomIconActions(
        value: js.Array[typings.openui5.sapMOverflowToolbarButtonMod.default] | typings.openui5.sapMOverflowToolbarButtonMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "titleCustomIconActions", value.asInstanceOf[js.Any])
      
      inline def setTitleCustomIconActionsUndefined: Self = StObject.set(x, "titleCustomIconActions", js.undefined)
      
      inline def setTitleCustomIconActionsVarargs(value: typings.openui5.sapMOverflowToolbarButtonMod.default*): Self = StObject.set(x, "titleCustomIconActions", js.Array(value*))
      
      inline def setTitleCustomTextActions(
        value: js.Array[typings.openui5.sapMButtonMod.default] | typings.openui5.sapMButtonMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "titleCustomTextActions", value.asInstanceOf[js.Any])
      
      inline def setTitleCustomTextActionsUndefined: Self = StObject.set(x, "titleCustomTextActions", js.undefined)
      
      inline def setTitleCustomTextActionsVarargs(value: typings.openui5.sapMButtonMod.default*): Self = StObject.set(x, "titleCustomTextActions", js.Array(value*))
      
      inline def setTitleExpandedContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "titleExpandedContent", value.asInstanceOf[js.Any])
      
      inline def setTitleExpandedContentUndefined: Self = StObject.set(x, "titleExpandedContent", js.undefined)
      
      inline def setTitleExpandedContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "titleExpandedContent", js.Array(value*))
      
      inline def setTitleExpandedHeading(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "titleExpandedHeading", value.asInstanceOf[js.Any])
      
      inline def setTitleExpandedHeadingUndefined: Self = StObject.set(x, "titleExpandedHeading", js.undefined)
      
      inline def setTitleHeading(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "titleHeading", value.asInstanceOf[js.Any])
      
      inline def setTitleHeadingUndefined: Self = StObject.set(x, "titleHeading", js.undefined)
      
      inline def setTitleMainAction(value: typings.openui5.sapFSemanticTitleMainActionMod.default): Self = StObject.set(x, "titleMainAction", value.asInstanceOf[js.Any])
      
      inline def setTitleMainActionUndefined: Self = StObject.set(x, "titleMainAction", js.undefined)
      
      inline def setTitlePrimaryArea(
        value: DynamicPageTitleArea | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DynamicPageTitleArea * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "titlePrimaryArea", value.asInstanceOf[js.Any])
      
      inline def setTitlePrimaryAreaUndefined: Self = StObject.set(x, "titlePrimaryArea", js.undefined)
      
      inline def setTitleSnappedContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "titleSnappedContent", value.asInstanceOf[js.Any])
      
      inline def setTitleSnappedContentUndefined: Self = StObject.set(x, "titleSnappedContent", js.undefined)
      
      inline def setTitleSnappedContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "titleSnappedContent", js.Array(value*))
      
      inline def setTitleSnappedHeading(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "titleSnappedHeading", value.asInstanceOf[js.Any])
      
      inline def setTitleSnappedHeadingUndefined: Self = StObject.set(x, "titleSnappedHeading", js.undefined)
      
      inline def setTitleSnappedOnMobile(value: typings.openui5.sapMTitleMod.default): Self = StObject.set(x, "titleSnappedOnMobile", value.asInstanceOf[js.Any])
      
      inline def setTitleSnappedOnMobileUndefined: Self = StObject.set(x, "titleSnappedOnMobile", js.undefined)
      
      inline def setToggleHeaderOnTitleClick(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "toggleHeaderOnTitleClick", value.asInstanceOf[js.Any])
      
      inline def setToggleHeaderOnTitleClickUndefined: Self = StObject.set(x, "toggleHeaderOnTitleClick", js.undefined)
    }
  }
}
