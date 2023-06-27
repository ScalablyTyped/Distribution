package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCommonsCalloutBaseMod.CalloutBaseSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.openui5.sapUiUx3LibraryMod.FollowActionState
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUx3QuickViewMod {
  
  @JSImport("sap/ui/ux3/QuickView", JSImport.Default)
  @js.native
  /**
    * Constructor for a new QuickView.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends QuickView {
    def this(/**
      * initial settings for the new control
      */
    mSettings: QuickViewSettings) = this()
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
    mSettings: QuickViewSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: QuickViewSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/ux3/QuickView", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.ux3.QuickView with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.commons.CalloutBase.extend}.
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
    oClassInfo: ClassInfo[T, QuickView]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, QuickView],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.ux3.QuickView.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait QuickView
    extends typings.openui5.sapUiCommonsCalloutBaseMod.default {
    
    /**
      * Adds some action to the aggregation {@link #getActions actions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAction(
      /**
      * The action to add; if empty, nothing is inserted
      */
    oAction: typings.openui5.sapUiUx3ThingActionMod.default
    ): this.type = js.native
    
    /**
      * Adds some content to the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addContent(
      /**
      * The content to add; if empty, nothing is inserted
      */
    oContent: typings.openui5.sapUiCoreElementMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:actionSelected actionSelected} event of this
      * `sap.ui.ux3.QuickView`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.QuickView` itself.
      *
      * Action is selected in Action Bar
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachActionSelected(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewActionSelectedEvent, Unit]
    ): this.type = js.native
    def attachActionSelected(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewActionSelectedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.QuickView` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:actionSelected actionSelected} event of this
      * `sap.ui.ux3.QuickView`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.QuickView` itself.
      *
      * Action is selected in Action Bar
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachActionSelected(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewActionSelectedEvent, Unit]
    ): this.type = js.native
    def attachActionSelected(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewActionSelectedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.QuickView` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:feedSubmit feedSubmit} event of this `sap.ui.ux3.QuickView`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.QuickView` itself.
      *
      * Fired when a new feed entry is submitted.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachFeedSubmit(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewFeedSubmitEvent, Unit]
    ): this.type = js.native
    def attachFeedSubmit(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewFeedSubmitEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.QuickView` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:feedSubmit feedSubmit} event of this `sap.ui.ux3.QuickView`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.QuickView` itself.
      *
      * Fired when a new feed entry is submitted.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachFeedSubmit(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewFeedSubmitEvent, Unit]
    ): this.type = js.native
    def attachFeedSubmit(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewFeedSubmitEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.QuickView` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:navigate navigate} event of this `sap.ui.ux3.QuickView`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.QuickView` itself.
      *
      * Event is fired when a user clicks on the firstTitle link. Call the preventDefault method of the event
      * object to cancel browser navigation.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachNavigate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewNavigateEvent, Unit]
    ): this.type = js.native
    def attachNavigate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewNavigateEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.QuickView` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:navigate navigate} event of this `sap.ui.ux3.QuickView`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.QuickView` itself.
      *
      * Event is fired when a user clicks on the firstTitle link. Call the preventDefault method of the event
      * object to cancel browser navigation.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachNavigate(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewNavigateEvent, Unit]
    ): this.type = js.native
    def attachNavigate(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewNavigateEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.QuickView` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys the actionBar in the aggregation {@link #getActionBar actionBar}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyActionBar(): this.type = js.native
    
    /**
      * Destroys all the actions in the aggregation {@link #getActions actions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyActions(): this.type = js.native
    
    /**
      * Destroys all the content in the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContent(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:actionSelected actionSelected} event of this
      * `sap.ui.ux3.QuickView`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachActionSelected(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewActionSelectedEvent, Unit]
    ): this.type = js.native
    def detachActionSelected(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewActionSelectedEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:feedSubmit feedSubmit} event of this `sap.ui.ux3.QuickView`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachFeedSubmit(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewFeedSubmitEvent, Unit]
    ): this.type = js.native
    def detachFeedSubmit(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewFeedSubmitEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:navigate navigate} event of this `sap.ui.ux3.QuickView`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachNavigate(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewNavigateEvent, Unit]
    ): this.type = js.native
    def detachNavigate(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewNavigateEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:actionSelected actionSelected} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireActionSelected(): this.type = js.native
    def fireActionSelected(
      /**
      * Parameters to pass along with the event
      */
    mParameters: QuickView$ActionSelectedEventParameters
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:feedSubmit feedSubmit} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireFeedSubmit(): this.type = js.native
    def fireFeedSubmit(
      /**
      * Parameters to pass along with the event
      */
    mParameters: QuickView$FeedSubmitEventParameters
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:navigate navigate} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireNavigate(): Boolean = js.native
    def fireNavigate(
      /**
      * Parameters to pass along with the event
      */
    mParameters: QuickView$NavigateEventParameters
    ): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getActionBar actionBar}.
      *
      * ActionBar. If no actionBar is set a default ActionBar will be created. In any case, ActionBar is displayed
      * only when the showActionBar property is set to true.
      */
    def getActionBar(): typings.openui5.sapUiUx3ActionBarMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getActions actions}.
      *
      * Actions of a Thing
      */
    def getActions(): js.Array[typings.openui5.sapUiUx3ThingActionMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * Body content of the QuickView
      */
    def getContent(): js.Array[typings.openui5.sapUiCoreElementMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getFavoriteActionEnabled favoriteActionEnabled}.
      *
      * Favorite action enabled/disabled. If disabled the action will be invisible.
      *
      * Default value is `true`.
      *
      * @returns Value of property `favoriteActionEnabled`
      */
    def getFavoriteActionEnabled(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getFavoriteState favoriteState}.
      *
      * State Of favorite Action
      *
      * Default value is `false`.
      *
      * @returns Value of property `favoriteState`
      */
    def getFavoriteState(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getFirstTitle firstTitle}.
      *
      * Thing name shown in the header of the QuickView
      *
      * @returns Value of property `firstTitle`
      */
    def getFirstTitle(): String = js.native
    
    /**
      * Gets current value of property {@link #getFirstTitleHref firstTitleHref}.
      *
      * URI to Thing Inspector
      *
      * @returns Value of property `firstTitleHref`
      */
    def getFirstTitleHref(): String = js.native
    
    /**
      * Gets current value of property {@link #getFlagActionEnabled flagActionEnabled}.
      *
      * Flag action enabled/disabled. If disabled the action will be invisible.
      *
      * Default value is `true`.
      *
      * @returns Value of property `flagActionEnabled`
      */
    def getFlagActionEnabled(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getFlagState flagState}.
      *
      * State of Flag Action
      *
      * Default value is `false`.
      *
      * @returns Value of property `flagState`
      */
    def getFlagState(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getFollowActionEnabled followActionEnabled}.
      *
      * Follow action enabled/disabled. If disabled the action will be invisible.
      *
      * Default value is `true`.
      *
      * @returns Value of property `followActionEnabled`
      */
    def getFollowActionEnabled(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getFollowState followState}.
      *
      * Follow State of a Thing
      *
      * Default value is `Default`.
      *
      * @returns Value of property `followState`
      */
    def getFollowState(): FollowActionState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FollowActionState * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getIcon icon}.
      *
      * URI of the Thing icon image (mandatory). The image is scaled down to the maximal size of 32 pixel (vertical
      * or horizontal).
      *
      * @returns Value of property `icon`
      */
    def getIcon(): URI = js.native
    
    /**
      * Gets current value of property {@link #getOpenActionEnabled openActionEnabled}.
      *
      * Open Thing action enabled/disabled. If disabled the action will be invisible.
      *
      * Default value is `true`.
      *
      * @returns Value of property `openActionEnabled`
      */
    def getOpenActionEnabled(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getSecondTitle secondTitle}.
      *
      * Optional short text shown under the firstTitle
      *
      * @returns Value of property `secondTitle`
      */
    def getSecondTitle(): String = js.native
    
    /**
      * Gets current value of property {@link #getShowActionBar showActionBar}.
      *
      * Show Action Bar
      *
      * Default value is `true`.
      *
      * @returns Value of property `showActionBar`
      */
    def getShowActionBar(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getType type}.
      *
      * Thing type (mandatory) like Account, Material, Employee etc. is displayed in a header at the top part
      * of the QuickView.
      *
      * @returns Value of property `type`
      */
    def getType(): String = js.native
    
    /**
      * Gets current value of property {@link #getUpdateActionEnabled updateActionEnabled}.
      *
      * Update action enabled/disabled. If disabled the action will be invisible.
      *
      * Default value is `true`.
      *
      * @returns Value of property `updateActionEnabled`
      */
    def getUpdateActionEnabled(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Control width as common CSS-size (px or % as unit, for example).
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Checks for the provided `sap.ui.ux3.ThingAction` in the aggregation {@link #getActions actions}. and
      * returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfAction(
      /**
      * The action whose index is looked for
      */
    oAction: typings.openui5.sapUiUx3ThingActionMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Element` in the aggregation {@link #getContent content}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfContent(
      /**
      * The content whose index is looked for
      */
    oContent: typings.openui5.sapUiCoreElementMod.default
    ): int = js.native
    
    /**
      * Inserts a action into the aggregation {@link #getActions actions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertAction(
      /**
      * The action to insert; if empty, nothing is inserted
      */
    oAction: typings.openui5.sapUiUx3ThingActionMod.default,
      /**
      * The `0`-based index the action should be inserted at; for a negative value of `iIndex`, the action is
      * inserted at position 0; for a value greater than the current size of the aggregation, the action is inserted
      * at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a content into the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertContent(
      /**
      * The content to insert; if empty, nothing is inserted
      */
    oContent: typings.openui5.sapUiCoreElementMod.default,
      /**
      * The `0`-based index the content should be inserted at; for a negative value of `iIndex`, the content
      * is inserted at position 0; for a value greater than the current size of the aggregation, the content
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    def removeAction(/**
      * The action to remove or its index or id
      */
    vAction: String): typings.openui5.sapUiUx3ThingActionMod.default | Null = js.native
    /**
      * Removes a action from the aggregation {@link #getActions actions}.
      *
      * @returns The removed action or `null`
      */
    def removeAction(/**
      * The action to remove or its index or id
      */
    vAction: int): typings.openui5.sapUiUx3ThingActionMod.default | Null = js.native
    def removeAction(
      /**
      * The action to remove or its index or id
      */
    vAction: typings.openui5.sapUiUx3ThingActionMod.default
    ): typings.openui5.sapUiUx3ThingActionMod.default | Null = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getActions actions}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllActions(): js.Array[typings.openui5.sapUiUx3ThingActionMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getContent content}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllContent(): js.Array[typings.openui5.sapUiCoreElementMod.default] = js.native
    
    def removeContent(/**
      * The content to remove or its index or id
      */
    vContent: String): typings.openui5.sapUiCoreElementMod.default | Null = js.native
    /**
      * Removes a content from the aggregation {@link #getContent content}.
      *
      * @returns The removed content or `null`
      */
    def removeContent(/**
      * The content to remove or its index or id
      */
    vContent: int): typings.openui5.sapUiCoreElementMod.default | Null = js.native
    def removeContent(
      /**
      * The content to remove or its index or id
      */
    vContent: typings.openui5.sapUiCoreElementMod.default
    ): typings.openui5.sapUiCoreElementMod.default | Null = js.native
    
    /**
      * Sets the aggregated {@link #getActionBar actionBar}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setActionBar(/**
      * The actionBar to set
      */
    oActionBar: typings.openui5.sapUiUx3ActionBarMod.default): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFavoriteActionEnabled favoriteActionEnabled}.
      *
      * Favorite action enabled/disabled. If disabled the action will be invisible.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFavoriteActionEnabled(): this.type = js.native
    def setFavoriteActionEnabled(/**
      * New value for property `favoriteActionEnabled`
      */
    bFavoriteActionEnabled: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFavoriteState favoriteState}.
      *
      * State Of favorite Action
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFavoriteState(): this.type = js.native
    def setFavoriteState(/**
      * New value for property `favoriteState`
      */
    bFavoriteState: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFirstTitle firstTitle}.
      *
      * Thing name shown in the header of the QuickView
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFirstTitle(): this.type = js.native
    def setFirstTitle(/**
      * New value for property `firstTitle`
      */
    sFirstTitle: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFirstTitleHref firstTitleHref}.
      *
      * URI to Thing Inspector
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFirstTitleHref(): this.type = js.native
    def setFirstTitleHref(/**
      * New value for property `firstTitleHref`
      */
    sFirstTitleHref: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFlagActionEnabled flagActionEnabled}.
      *
      * Flag action enabled/disabled. If disabled the action will be invisible.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFlagActionEnabled(): this.type = js.native
    def setFlagActionEnabled(/**
      * New value for property `flagActionEnabled`
      */
    bFlagActionEnabled: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFlagState flagState}.
      *
      * State of Flag Action
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFlagState(): this.type = js.native
    def setFlagState(/**
      * New value for property `flagState`
      */
    bFlagState: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFollowActionEnabled followActionEnabled}.
      *
      * Follow action enabled/disabled. If disabled the action will be invisible.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFollowActionEnabled(): this.type = js.native
    def setFollowActionEnabled(/**
      * New value for property `followActionEnabled`
      */
    bFollowActionEnabled: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFollowState followState}.
      *
      * Follow State of a Thing
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Default`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFollowState(): this.type = js.native
    def setFollowState(
      /**
      * New value for property `followState`
      */
    sFollowState: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FollowActionState * / any */ String
    ): this.type = js.native
    def setFollowState(/**
      * New value for property `followState`
      */
    sFollowState: FollowActionState): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIcon icon}.
      *
      * URI of the Thing icon image (mandatory). The image is scaled down to the maximal size of 32 pixel (vertical
      * or horizontal).
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIcon(): this.type = js.native
    def setIcon(/**
      * New value for property `icon`
      */
    sIcon: URI): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getOpenActionEnabled openActionEnabled}.
      *
      * Open Thing action enabled/disabled. If disabled the action will be invisible.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setOpenActionEnabled(): this.type = js.native
    def setOpenActionEnabled(/**
      * New value for property `openActionEnabled`
      */
    bOpenActionEnabled: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSecondTitle secondTitle}.
      *
      * Optional short text shown under the firstTitle
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSecondTitle(): this.type = js.native
    def setSecondTitle(/**
      * New value for property `secondTitle`
      */
    sSecondTitle: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowActionBar showActionBar}.
      *
      * Show Action Bar
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowActionBar(): this.type = js.native
    def setShowActionBar(/**
      * New value for property `showActionBar`
      */
    bShowActionBar: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getType type}.
      *
      * Thing type (mandatory) like Account, Material, Employee etc. is displayed in a header at the top part
      * of the QuickView.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setType(): this.type = js.native
    def setType(/**
      * New value for property `type`
      */
    sType: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getUpdateActionEnabled updateActionEnabled}.
      *
      * Update action enabled/disabled. If disabled the action will be invisible.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setUpdateActionEnabled(): this.type = js.native
    def setUpdateActionEnabled(/**
      * New value for property `updateActionEnabled`
      */
    bUpdateActionEnabled: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Control width as common CSS-size (px or % as unit, for example).
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
  
  trait QuickView$ActionSelectedEventParameters extends StObject {
    
    /**
      * Selected ThingAction
      */
    var action: js.UndefOr[typings.openui5.sapUiUx3ThingActionMod.default] = js.undefined
    
    /**
      * Id of selected ThingAction
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * New State of the selected action. Only filled if the respective action maintains a state property, for
      * example 'FollowUp' or 'Favorite'
      */
    var newState: js.UndefOr[String] = js.undefined
  }
  object QuickView$ActionSelectedEventParameters {
    
    inline def apply(): QuickView$ActionSelectedEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuickView$ActionSelectedEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QuickView$ActionSelectedEventParameters] (val x: Self) extends AnyVal {
      
      inline def setAction(value: typings.openui5.sapUiUx3ThingActionMod.default): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setNewState(value: String): Self = StObject.set(x, "newState", value.asInstanceOf[js.Any])
      
      inline def setNewStateUndefined: Self = StObject.set(x, "newState", js.undefined)
    }
  }
  
  trait QuickView$FeedSubmitEventParameters extends StObject {
    
    /**
      * Feed text
      */
    var text: js.UndefOr[String] = js.undefined
  }
  object QuickView$FeedSubmitEventParameters {
    
    inline def apply(): QuickView$FeedSubmitEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuickView$FeedSubmitEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QuickView$FeedSubmitEventParameters] (val x: Self) extends AnyVal {
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait QuickView$NavigateEventParameters extends StObject {
    
    /**
      * URI of the Thing Inspector application.
      */
    var href: js.UndefOr[String] = js.undefined
  }
  object QuickView$NavigateEventParameters {
    
    inline def apply(): QuickView$NavigateEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuickView$NavigateEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QuickView$NavigateEventParameters] (val x: Self) extends AnyVal {
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    }
  }
  
  type QuickViewActionSelectedEvent = typings.openui5.sapUiBaseEventMod.default[QuickView$ActionSelectedEventParameters]
  
  type QuickViewActionSelectedEventParameters = QuickView$ActionSelectedEventParameters
  
  type QuickViewFeedSubmitEvent = typings.openui5.sapUiBaseEventMod.default[QuickView$FeedSubmitEventParameters]
  
  type QuickViewFeedSubmitEventParameters = QuickView$FeedSubmitEventParameters
  
  type QuickViewNavigateEvent = typings.openui5.sapUiBaseEventMod.default[QuickView$NavigateEventParameters]
  
  type QuickViewNavigateEventParameters = QuickView$NavigateEventParameters
  
  trait QuickViewSettings
    extends StObject
       with CalloutBaseSettings {
    
    /**
      * ActionBar. If no actionBar is set a default ActionBar will be created. In any case, ActionBar is displayed
      * only when the showActionBar property is set to true.
      */
    var actionBar: js.UndefOr[typings.openui5.sapUiUx3ActionBarMod.default] = js.undefined
    
    /**
      * Action is selected in Action Bar
      */
    var actionSelected: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[QuickView$ActionSelectedEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Actions of a Thing
      */
    var actions: js.UndefOr[
        js.Array[typings.openui5.sapUiUx3ThingActionMod.default] | typings.openui5.sapUiUx3ThingActionMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Body content of the QuickView
      */
    var content: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreElementMod.default] | typings.openui5.sapUiCoreElementMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Favorite action enabled/disabled. If disabled the action will be invisible.
      */
    var favoriteActionEnabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * State Of favorite Action
      */
    var favoriteState: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fired when a new feed entry is submitted.
      */
    var feedSubmit: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[QuickView$FeedSubmitEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Thing name shown in the header of the QuickView
      */
    var firstTitle: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * URI to Thing Inspector
      */
    var firstTitleHref: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Flag action enabled/disabled. If disabled the action will be invisible.
      */
    var flagActionEnabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * State of Flag Action
      */
    var flagState: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Follow action enabled/disabled. If disabled the action will be invisible.
      */
    var followActionEnabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Follow State of a Thing
      */
    var followState: js.UndefOr[
        FollowActionState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FollowActionState * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * URI of the Thing icon image (mandatory). The image is scaled down to the maximal size of 32 pixel (vertical
      * or horizontal).
      */
    var icon: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Event is fired when a user clicks on the firstTitle link. Call the preventDefault method of the event
      * object to cancel browser navigation.
      */
    var navigate: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[QuickView$NavigateEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Open Thing action enabled/disabled. If disabled the action will be invisible.
      */
    var openActionEnabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Optional short text shown under the firstTitle
      */
    var secondTitle: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Show Action Bar
      */
    var showActionBar: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Thing type (mandatory) like Account, Material, Employee etc. is displayed in a header at the top part
      * of the QuickView.
      */
    var `type`: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Update action enabled/disabled. If disabled the action will be invisible.
      */
    var updateActionEnabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Control width as common CSS-size (px or % as unit, for example).
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object QuickViewSettings {
    
    inline def apply(): QuickViewSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuickViewSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QuickViewSettings] (val x: Self) extends AnyVal {
      
      inline def setActionBar(value: typings.openui5.sapUiUx3ActionBarMod.default): Self = StObject.set(x, "actionBar", value.asInstanceOf[js.Any])
      
      inline def setActionBarUndefined: Self = StObject.set(x, "actionBar", js.undefined)
      
      inline def setActionSelected(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[QuickView$ActionSelectedEventParameters] => Unit
      ): Self = StObject.set(x, "actionSelected", js.Any.fromFunction1(value))
      
      inline def setActionSelectedUndefined: Self = StObject.set(x, "actionSelected", js.undefined)
      
      inline def setActions(
        value: js.Array[typings.openui5.sapUiUx3ThingActionMod.default] | typings.openui5.sapUiUx3ThingActionMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: typings.openui5.sapUiUx3ThingActionMod.default*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setContent(
        value: js.Array[typings.openui5.sapUiCoreElementMod.default] | typings.openui5.sapUiCoreElementMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: typings.openui5.sapUiCoreElementMod.default*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setFavoriteActionEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "favoriteActionEnabled", value.asInstanceOf[js.Any])
      
      inline def setFavoriteActionEnabledUndefined: Self = StObject.set(x, "favoriteActionEnabled", js.undefined)
      
      inline def setFavoriteState(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "favoriteState", value.asInstanceOf[js.Any])
      
      inline def setFavoriteStateUndefined: Self = StObject.set(x, "favoriteState", js.undefined)
      
      inline def setFeedSubmit(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[QuickView$FeedSubmitEventParameters] => Unit
      ): Self = StObject.set(x, "feedSubmit", js.Any.fromFunction1(value))
      
      inline def setFeedSubmitUndefined: Self = StObject.set(x, "feedSubmit", js.undefined)
      
      inline def setFirstTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "firstTitle", value.asInstanceOf[js.Any])
      
      inline def setFirstTitleHref(value: String | PropertyBindingInfo): Self = StObject.set(x, "firstTitleHref", value.asInstanceOf[js.Any])
      
      inline def setFirstTitleHrefUndefined: Self = StObject.set(x, "firstTitleHref", js.undefined)
      
      inline def setFirstTitleUndefined: Self = StObject.set(x, "firstTitle", js.undefined)
      
      inline def setFlagActionEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "flagActionEnabled", value.asInstanceOf[js.Any])
      
      inline def setFlagActionEnabledUndefined: Self = StObject.set(x, "flagActionEnabled", js.undefined)
      
      inline def setFlagState(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "flagState", value.asInstanceOf[js.Any])
      
      inline def setFlagStateUndefined: Self = StObject.set(x, "flagState", js.undefined)
      
      inline def setFollowActionEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "followActionEnabled", value.asInstanceOf[js.Any])
      
      inline def setFollowActionEnabledUndefined: Self = StObject.set(x, "followActionEnabled", js.undefined)
      
      inline def setFollowState(
        value: FollowActionState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FollowActionState * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "followState", value.asInstanceOf[js.Any])
      
      inline def setFollowStateUndefined: Self = StObject.set(x, "followState", js.undefined)
      
      inline def setIcon(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setNavigate(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[QuickView$NavigateEventParameters] => Unit
      ): Self = StObject.set(x, "navigate", js.Any.fromFunction1(value))
      
      inline def setNavigateUndefined: Self = StObject.set(x, "navigate", js.undefined)
      
      inline def setOpenActionEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "openActionEnabled", value.asInstanceOf[js.Any])
      
      inline def setOpenActionEnabledUndefined: Self = StObject.set(x, "openActionEnabled", js.undefined)
      
      inline def setSecondTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "secondTitle", value.asInstanceOf[js.Any])
      
      inline def setSecondTitleUndefined: Self = StObject.set(x, "secondTitle", js.undefined)
      
      inline def setShowActionBar(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showActionBar", value.asInstanceOf[js.Any])
      
      inline def setShowActionBarUndefined: Self = StObject.set(x, "showActionBar", js.undefined)
      
      inline def setType(value: String | PropertyBindingInfo): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUpdateActionEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "updateActionEnabled", value.asInstanceOf[js.Any])
      
      inline def setUpdateActionEnabledUndefined: Self = StObject.set(x, "updateActionEnabled", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
