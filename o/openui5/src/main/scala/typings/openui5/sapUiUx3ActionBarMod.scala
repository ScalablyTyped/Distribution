package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.openui5.sapUiUx3LibraryMod.FollowActionState
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUx3ActionBarMod {
  
  @JSImport("sap/ui/ux3/ActionBar", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ActionBar.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ActionBar {
    def this(/**
      * initial settings for the new control
      */
    mSettings: ActionBarSettings) = this()
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
    mSettings: ActionBarSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: ActionBarSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/ux3/ActionBar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.ux3.ActionBar with name `sClassName` and enriches it with the
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
    oClassInfo: ClassInfo[T, ActionBar]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ActionBar],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.ux3.ActionBar.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ActionBar
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:actionSelected actionSelected} event of this
      * `sap.ui.ux3.ActionBar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.ActionBar` itself.
      *
      * Fired when any of the social action’s toolbar buttons except ‘Update’ or any of the business action’s
      * menu items resp. buttons is pressed. The selected action can be identified by its id and newState (the
      * latter if applicable only) ‘Follow’ button + menu: id: follow, newState: Follow/Hold/Default ‘Mark for
      * follow up’ button: id: flag, newState: true/false ‘Favorite’ button: id: favorite, newState: true/false
      * ‘Open Thing Inspector’ button id: open Business Actions: id: the ThingAction id
      *
      * For ‘Update’, please refer to event ‘feedSubmit’
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachActionSelected(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ActionBarActionSelectedEvent, Unit]
    ): this.type = js.native
    def attachActionSelected(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ActionBarActionSelectedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.ActionBar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:actionSelected actionSelected} event of this
      * `sap.ui.ux3.ActionBar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.ActionBar` itself.
      *
      * Fired when any of the social action’s toolbar buttons except ‘Update’ or any of the business action’s
      * menu items resp. buttons is pressed. The selected action can be identified by its id and newState (the
      * latter if applicable only) ‘Follow’ button + menu: id: follow, newState: Follow/Hold/Default ‘Mark for
      * follow up’ button: id: flag, newState: true/false ‘Favorite’ button: id: favorite, newState: true/false
      * ‘Open Thing Inspector’ button id: open Business Actions: id: the ThingAction id
      *
      * For ‘Update’, please refer to event ‘feedSubmit’
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
    fnFunction: js.Function1[/* p1 */ ActionBarActionSelectedEvent, Unit]
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
    fnFunction: js.Function1[/* p1 */ ActionBarActionSelectedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.ActionBar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:feedSubmit feedSubmit} event of this `sap.ui.ux3.ActionBar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.ActionBar` itself.
      *
      * Fired when a new feed entry is submitted.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachFeedSubmit(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ActionBarFeedSubmitEvent, Unit]
    ): this.type = js.native
    def attachFeedSubmit(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ActionBarFeedSubmitEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.ActionBar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:feedSubmit feedSubmit} event of this `sap.ui.ux3.ActionBar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.ActionBar` itself.
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
    fnFunction: js.Function1[/* p1 */ ActionBarFeedSubmitEvent, Unit]
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
    fnFunction: js.Function1[/* p1 */ ActionBarFeedSubmitEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.ActionBar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Closes all popups which might be opened as ActionBar children These are the more- and follow menu and
      * the feeder popup
      */
    def closePopups(): Unit = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:actionSelected actionSelected} event of this
      * `sap.ui.ux3.ActionBar`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachActionSelected(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ActionBarActionSelectedEvent, Unit]
    ): this.type = js.native
    def detachActionSelected(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ActionBarActionSelectedEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:feedSubmit feedSubmit} event of this `sap.ui.ux3.ActionBar`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachFeedSubmit(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ActionBarFeedSubmitEvent, Unit]
    ): this.type = js.native
    def detachFeedSubmit(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ActionBarFeedSubmitEvent, Unit],
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
    mParameters: ActionBar$ActionSelectedEventParameters
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
    mParameters: ActionBar$FeedSubmitEventParameters
    ): this.type = js.native
    
    /**
      * Gets current value of property {@link #getAlwaysShowMoreMenu alwaysShowMoreMenu}.
      *
      * If true, business actions are rendered as menu items of the 'More' menu button. Otherwise, 'More' menu
      * button is only displayed for overflow and business actions are rendered as inidividual buttons.
      *
      * Default value is `true`.
      *
      * @returns Value of property `alwaysShowMoreMenu`
      */
    def getAlwaysShowMoreMenu(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getBusinessActions businessActions}.
      *
      * Displayed on the actionBar's right hand-side, either as menu item under 'More' or as individual buttons
      */
    def getBusinessActions(): js.Array[typings.openui5.sapUiUx3ThingActionMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getDividerWidth dividerWidth}.
      *
      * The minimum width of ActionBar's the social actions part: business action controls have to be rendered
      * outside this area
      *
      * @returns Value of property `dividerWidth`
      */
    def getDividerWidth(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getFavoriteState favoriteState}.
      *
      * Indicates whether “Favorite” is active
      *
      * @returns Value of property `favoriteState`
      */
    def getFavoriteState(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getFlagState flagState}.
      *
      * Indicates whether “Mark for Follow Up” is active
      *
      * @returns Value of property `flagState`
      */
    def getFlagState(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getFollowState followState}.
      *
      * Keeps track of the actionBars Follow/Unfollow button’s state. Its value is one of - FollowActionState.Default
      * - FollowActionState.Follow - FollowActionState.Hold
      *
      * Default value is `Default`.
      *
      * @returns Value of property `followState`
      */
    def getFollowState(): FollowActionState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FollowActionState * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getShowFavorite showFavorite}.
      *
      * Indicates whether social action “Favorite” is shown, default is ‘true’
      *
      * Default value is `true`.
      *
      * @returns Value of property `showFavorite`
      */
    def getShowFavorite(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowFlag showFlag}.
      *
      * Indicates whether social action “Mark for Follow Up” is shown, default is ‘true’
      *
      * Default value is `true`.
      *
      * @returns Value of property `showFlag`
      */
    def getShowFlag(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowFollow showFollow}.
      *
      * Indicates whether social action “Follow” is shown, default is ‘true’
      *
      * Default value is `true`.
      *
      * @returns Value of property `showFollow`
      */
    def getShowFollow(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowOpen showOpen}.
      *
      * Indicates whether social action “Open” is shown, default is ‘true’
      *
      * Default value is `true`.
      *
      * @returns Value of property `showOpen`
      */
    def getShowOpen(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowUpdate showUpdate}.
      *
      * Indicates whether social action “Update” is shown, default is ‘true’
      *
      * Default value is `true`.
      *
      * @returns Value of property `showUpdate`
      */
    def getShowUpdate(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getThingIconURI thingIconURI}.
      *
      * The thing icon uri. Icon will be displayed in Feeder
      *
      * @returns Value of property `thingIconURI`
      */
    def getThingIconURI(): URI = js.native
    
    /**
      * Gets current value of property {@link #getUpdateState updateState}.
      *
      * Indicates whether “Update” is active
      *
      * @returns Value of property `updateState`
      */
    def getUpdateState(): Boolean = js.native
    
    /**
      * Checks for the provided `sap.ui.ux3.ThingAction` in the aggregation {@link #getBusinessActions businessActions}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfBusinessAction(
      /**
      * The businessAction whose index is looked for
      */
    oBusinessAction: typings.openui5.sapUiUx3ThingActionMod.default
    ): int = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Checks whether the control is still valid (is in the DOM). ActionBar instance is rendered if and only
      * if 'isActive' returns 'true'. This check is called implicitely by the rendere, MUST not be removed.
      *
      * @returns True if the control is still in the active DOM
      */
    def isActive(): Boolean = js.native
    
    /**
      * Sets a new value for property {@link #getAlwaysShowMoreMenu alwaysShowMoreMenu}.
      *
      * If true, business actions are rendered as menu items of the 'More' menu button. Otherwise, 'More' menu
      * button is only displayed for overflow and business actions are rendered as inidividual buttons.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAlwaysShowMoreMenu(): this.type = js.native
    def setAlwaysShowMoreMenu(/**
      * New value for property `alwaysShowMoreMenu`
      */
    bAlwaysShowMoreMenu: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDividerWidth dividerWidth}.
      *
      * The minimum width of ActionBar's the social actions part: business action controls have to be rendered
      * outside this area
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDividerWidth(): this.type = js.native
    def setDividerWidth(/**
      * New value for property `dividerWidth`
      */
    sDividerWidth: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFavoriteState favoriteState}.
      *
      * Indicates whether “Favorite” is active
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFavoriteState(): this.type = js.native
    def setFavoriteState(/**
      * New value for property `favoriteState`
      */
    bFavoriteState: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFlagState flagState}.
      *
      * Indicates whether “Mark for Follow Up” is active
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFlagState(): this.type = js.native
    def setFlagState(/**
      * New value for property `flagState`
      */
    bFlagState: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFollowState followState}.
      *
      * Keeps track of the actionBars Follow/Unfollow button’s state. Its value is one of - FollowActionState.Default
      * - FollowActionState.Follow - FollowActionState.Hold
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
      * Sets a new value for property {@link #getShowFavorite showFavorite}.
      *
      * Indicates whether social action “Favorite” is shown, default is ‘true’
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowFavorite(): this.type = js.native
    def setShowFavorite(/**
      * New value for property `showFavorite`
      */
    bShowFavorite: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowFlag showFlag}.
      *
      * Indicates whether social action “Mark for Follow Up” is shown, default is ‘true’
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowFlag(): this.type = js.native
    def setShowFlag(/**
      * New value for property `showFlag`
      */
    bShowFlag: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowFollow showFollow}.
      *
      * Indicates whether social action “Follow” is shown, default is ‘true’
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowFollow(): this.type = js.native
    def setShowFollow(/**
      * New value for property `showFollow`
      */
    bShowFollow: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowOpen showOpen}.
      *
      * Indicates whether social action “Open” is shown, default is ‘true’
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowOpen(): this.type = js.native
    def setShowOpen(/**
      * New value for property `showOpen`
      */
    bShowOpen: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowUpdate showUpdate}.
      *
      * Indicates whether social action “Update” is shown, default is ‘true’
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowUpdate(): this.type = js.native
    def setShowUpdate(/**
      * New value for property `showUpdate`
      */
    bShowUpdate: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getThingIconURI thingIconURI}.
      *
      * The thing icon uri. Icon will be displayed in Feeder
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setThingIconURI(): this.type = js.native
    def setThingIconURI(/**
      * New value for property `thingIconURI`
      */
    sThingIconURI: URI): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getUpdateState updateState}.
      *
      * Indicates whether “Update” is active
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setUpdateState(): this.type = js.native
    def setUpdateState(/**
      * New value for property `updateState`
      */
    bUpdateState: Boolean): this.type = js.native
  }
  
  trait ActionBar$ActionSelectedEventParameters extends StObject {
    
    /**
      * Selected ThingAction
      */
    var action: js.UndefOr[typings.openui5.sapUiUx3ThingActionMod.default] = js.undefined
    
    /**
      * Id of selected ThingAction
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * New State of the selected action.Only filled if the respective action maintains a state property, for
      * example 'FollowUp' or 'Favorite'
      */
    var newState: js.UndefOr[String] = js.undefined
  }
  object ActionBar$ActionSelectedEventParameters {
    
    inline def apply(): ActionBar$ActionSelectedEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionBar$ActionSelectedEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActionBar$ActionSelectedEventParameters] (val x: Self) extends AnyVal {
      
      inline def setAction(value: typings.openui5.sapUiUx3ThingActionMod.default): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setNewState(value: String): Self = StObject.set(x, "newState", value.asInstanceOf[js.Any])
      
      inline def setNewStateUndefined: Self = StObject.set(x, "newState", js.undefined)
    }
  }
  
  trait ActionBar$FeedSubmitEventParameters extends StObject {
    
    /**
      * Feed text
      */
    var text: js.UndefOr[String] = js.undefined
  }
  object ActionBar$FeedSubmitEventParameters {
    
    inline def apply(): ActionBar$FeedSubmitEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionBar$FeedSubmitEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActionBar$FeedSubmitEventParameters] (val x: Self) extends AnyVal {
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  type ActionBarActionSelectedEvent = typings.openui5.sapUiBaseEventMod.default[ActionBar$ActionSelectedEventParameters]
  
  type ActionBarActionSelectedEventParameters = ActionBar$ActionSelectedEventParameters
  
  type ActionBarFeedSubmitEvent = typings.openui5.sapUiBaseEventMod.default[ActionBar$FeedSubmitEventParameters]
  
  type ActionBarFeedSubmitEventParameters = ActionBar$FeedSubmitEventParameters
  
  trait ActionBarSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Fired when any of the social action’s toolbar buttons except ‘Update’ or any of the business action’s
      * menu items resp. buttons is pressed. The selected action can be identified by its id and newState (the
      * latter if applicable only) ‘Follow’ button + menu: id: follow, newState: Follow/Hold/Default ‘Mark for
      * follow up’ button: id: flag, newState: true/false ‘Favorite’ button: id: favorite, newState: true/false
      * ‘Open Thing Inspector’ button id: open Business Actions: id: the ThingAction id
      *
      * For ‘Update’, please refer to event ‘feedSubmit’
      */
    var actionSelected: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ActionBar$ActionSelectedEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * If true, business actions are rendered as menu items of the 'More' menu button. Otherwise, 'More' menu
      * button is only displayed for overflow and business actions are rendered as inidividual buttons.
      */
    var alwaysShowMoreMenu: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Displayed on the actionBar's right hand-side, either as menu item under 'More' or as individual buttons
      */
    var businessActions: js.UndefOr[
        js.Array[typings.openui5.sapUiUx3ThingActionMod.default] | typings.openui5.sapUiUx3ThingActionMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The minimum width of ActionBar's the social actions part: business action controls have to be rendered
      * outside this area
      */
    var dividerWidth: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Indicates whether “Favorite” is active
      */
    var favoriteState: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fired when a new feed entry is submitted.
      */
    var feedSubmit: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ActionBar$FeedSubmitEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Indicates whether “Mark for Follow Up” is active
      */
    var flagState: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Keeps track of the actionBars Follow/Unfollow button’s state. Its value is one of - FollowActionState.Default
      * - FollowActionState.Follow - FollowActionState.Hold
      */
    var followState: js.UndefOr[
        FollowActionState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FollowActionState * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Indicates whether social action “Favorite” is shown, default is ‘true’
      */
    var showFavorite: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Indicates whether social action “Mark for Follow Up” is shown, default is ‘true’
      */
    var showFlag: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Indicates whether social action “Follow” is shown, default is ‘true’
      */
    var showFollow: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Indicates whether social action “Open” is shown, default is ‘true’
      */
    var showOpen: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Indicates whether social action “Update” is shown, default is ‘true’
      */
    var showUpdate: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The thing icon uri. Icon will be displayed in Feeder
      */
    var thingIconURI: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Indicates whether “Update” is active
      */
    var updateState: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ActionBarSettings {
    
    inline def apply(): ActionBarSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionBarSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActionBarSettings] (val x: Self) extends AnyVal {
      
      inline def setActionSelected(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ActionBar$ActionSelectedEventParameters] => Unit
      ): Self = StObject.set(x, "actionSelected", js.Any.fromFunction1(value))
      
      inline def setActionSelectedUndefined: Self = StObject.set(x, "actionSelected", js.undefined)
      
      inline def setAlwaysShowMoreMenu(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "alwaysShowMoreMenu", value.asInstanceOf[js.Any])
      
      inline def setAlwaysShowMoreMenuUndefined: Self = StObject.set(x, "alwaysShowMoreMenu", js.undefined)
      
      inline def setBusinessActions(
        value: js.Array[typings.openui5.sapUiUx3ThingActionMod.default] | typings.openui5.sapUiUx3ThingActionMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "businessActions", value.asInstanceOf[js.Any])
      
      inline def setBusinessActionsUndefined: Self = StObject.set(x, "businessActions", js.undefined)
      
      inline def setBusinessActionsVarargs(value: typings.openui5.sapUiUx3ThingActionMod.default*): Self = StObject.set(x, "businessActions", js.Array(value*))
      
      inline def setDividerWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "dividerWidth", value.asInstanceOf[js.Any])
      
      inline def setDividerWidthUndefined: Self = StObject.set(x, "dividerWidth", js.undefined)
      
      inline def setFavoriteState(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "favoriteState", value.asInstanceOf[js.Any])
      
      inline def setFavoriteStateUndefined: Self = StObject.set(x, "favoriteState", js.undefined)
      
      inline def setFeedSubmit(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ActionBar$FeedSubmitEventParameters] => Unit
      ): Self = StObject.set(x, "feedSubmit", js.Any.fromFunction1(value))
      
      inline def setFeedSubmitUndefined: Self = StObject.set(x, "feedSubmit", js.undefined)
      
      inline def setFlagState(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "flagState", value.asInstanceOf[js.Any])
      
      inline def setFlagStateUndefined: Self = StObject.set(x, "flagState", js.undefined)
      
      inline def setFollowState(
        value: FollowActionState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FollowActionState * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "followState", value.asInstanceOf[js.Any])
      
      inline def setFollowStateUndefined: Self = StObject.set(x, "followState", js.undefined)
      
      inline def setShowFavorite(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showFavorite", value.asInstanceOf[js.Any])
      
      inline def setShowFavoriteUndefined: Self = StObject.set(x, "showFavorite", js.undefined)
      
      inline def setShowFlag(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showFlag", value.asInstanceOf[js.Any])
      
      inline def setShowFlagUndefined: Self = StObject.set(x, "showFlag", js.undefined)
      
      inline def setShowFollow(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showFollow", value.asInstanceOf[js.Any])
      
      inline def setShowFollowUndefined: Self = StObject.set(x, "showFollow", js.undefined)
      
      inline def setShowOpen(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showOpen", value.asInstanceOf[js.Any])
      
      inline def setShowOpenUndefined: Self = StObject.set(x, "showOpen", js.undefined)
      
      inline def setShowUpdate(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showUpdate", value.asInstanceOf[js.Any])
      
      inline def setShowUpdateUndefined: Self = StObject.set(x, "showUpdate", js.undefined)
      
      inline def setThingIconURI(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "thingIconURI", value.asInstanceOf[js.Any])
      
      inline def setThingIconURIUndefined: Self = StObject.set(x, "thingIconURI", js.undefined)
      
      inline def setUpdateState(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "updateState", value.asInstanceOf[js.Any])
      
      inline def setUpdateStateUndefined: Self = StObject.set(x, "updateState", js.undefined)
    }
  }
}
