package typings.openui5

import typings.openui5.anon.ItemKey
import typings.openui5.anon.Text
import typings.openui5.anon.`9`
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.openui5.sapUiUx3LibraryMod.FollowActionState
import typings.openui5.sapUiUx3LibraryMod.ThingViewerHeaderType
import typings.openui5.sapUiUx3OverlayMod.OverlaySettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUx3ThingInspectorMod {
  
  @JSImport("sap/ui/ux3/ThingInspector", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ThingInspector.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ThingInspector {
    def this(/**
      * initial settings for the new control
      */
    mSettings: ThingInspectorSettings) = this()
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
    mSettings: ThingInspectorSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: ThingInspectorSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/ux3/ThingInspector", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.ux3.ThingInspector with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.ux3.Overlay.extend}.
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
    oClassInfo: ClassInfo[T, ThingInspector]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ThingInspector],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.ux3.ThingInspector.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ThingInspector
    extends typings.openui5.sapUiUx3OverlayMod.default {
    
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
      * Adds some facet to the aggregation {@link #getFacets facets}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addFacet(
      /**
      * The facet to add; if empty, nothing is inserted
      */
    oFacet: typings.openui5.sapUiUx3NavigationItemMod.default
    ): this.type = js.native
    
    /**
      * Adds some facetContent to the aggregation {@link #getFacetContent facetContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addFacetContent(
      /**
      * The facetContent to add; if empty, nothing is inserted
      */
    oFacetContent: typings.openui5.sapUiUx3ThingGroupMod.default
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
    oHeaderContent: typings.openui5.sapUiUx3ThingGroupMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:actionSelected actionSelected} event of this
      * `sap.ui.ux3.ThingInspector`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.ThingInspector` itself.
      *
      * Further thing related Action selected
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachActionSelected(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachActionSelected(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.ThingInspector` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:actionSelected actionSelected} event of this
      * `sap.ui.ux3.ThingInspector`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.ThingInspector` itself.
      *
      * Further thing related Action selected
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.ThingInspector` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:facetSelected facetSelected} event of this `sap.ui.ux3.ThingInspector`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.ThingInspector` itself.
      *
      * Event for facet selection. The application is responsible for displaying the correct content for the
      * selected one. The ThingInspector will currently always mark the first facet as selected.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachFacetSelected(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachFacetSelected(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.ThingInspector` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:facetSelected facetSelected} event of this `sap.ui.ux3.ThingInspector`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.ThingInspector` itself.
      *
      * Event for facet selection. The application is responsible for displaying the correct content for the
      * selected one. The ThingInspector will currently always mark the first facet as selected.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachFacetSelected(
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
    def attachFacetSelected(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.ThingInspector` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:feedSubmit feedSubmit} event of this `sap.ui.ux3.ThingInspector`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.ThingInspector` itself.
      *
      * Fired when a new feed entry is submitted.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachFeedSubmit(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachFeedSubmit(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.ThingInspector` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:feedSubmit feedSubmit} event of this `sap.ui.ux3.ThingInspector`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.ThingInspector` itself.
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.ThingInspector` itself
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
      * Destroys all the facetContent in the aggregation {@link #getFacetContent facetContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyFacetContent(): this.type = js.native
    
    /**
      * Destroys all the facets in the aggregation {@link #getFacets facets}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyFacets(): this.type = js.native
    
    /**
      * Destroys all the headerContent in the aggregation {@link #getHeaderContent headerContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyHeaderContent(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:actionSelected actionSelected} event of this
      * `sap.ui.ux3.ThingInspector`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachActionSelected(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachActionSelected(
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
      * Detaches event handler `fnFunction` from the {@link #event:facetSelected facetSelected} event of this
      * `sap.ui.ux3.ThingInspector`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachFacetSelected(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachFacetSelected(
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
      * Detaches event handler `fnFunction` from the {@link #event:feedSubmit feedSubmit} event of this `sap.ui.ux3.ThingInspector`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachFeedSubmit(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachFeedSubmit(
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
      * Fires event {@link #event:actionSelected actionSelected} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireActionSelected(): this.type = js.native
    def fireActionSelected(/**
      * Parameters to pass along with the event
      */
    mParameters: `9`): this.type = js.native
    
    /**
      * Fires event {@link #event:facetSelected facetSelected} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireFacetSelected(): Boolean = js.native
    def fireFacetSelected(/**
      * Parameters to pass along with the event
      */
    mParameters: ItemKey): Boolean = js.native
    
    /**
      * Fires event {@link #event:feedSubmit feedSubmit} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireFeedSubmit(): this.type = js.native
    def fireFeedSubmit(/**
      * Parameters to pass along with the event
      */
    mParameters: Text): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getActionBar actionBar}.
      *
      * ActionBar. If no actionBar is set a default ActionBar will be created.
      */
    def getActionBar(): typings.openui5.sapUiUx3ActionBarMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getActions actions}.
      *
      * Actions of a Thing
      */
    def getActions(): js.Array[typings.openui5.sapUiUx3ThingActionMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getFacetContent facetContent}.
      *
      * ThingGroups for content of the selected facet
      */
    def getFacetContent(): js.Array[typings.openui5.sapUiUx3ThingGroupMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getFacets facets}.
      *
      * Thing Inspector facets
      */
    def getFacets(): js.Array[typings.openui5.sapUiUx3NavigationItemMod.default] = js.native
    
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
      * First Line of the Thing Inspector Title
      *
      * @returns Value of property `firstTitle`
      */
    def getFirstTitle(): String = js.native
    
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
      * Gets content of aggregation {@link #getHeaderContent headerContent}.
      *
      * ThingGroups for the header content
      */
    def getHeaderContent(): js.Array[typings.openui5.sapUiUx3ThingGroupMod.default] = js.native
    
    /**
      * @SINCE 1.16.3
      *
      * Gets current value of property {@link #getHeaderType headerType}.
      *
      * Defines which header type should be used.
      *
      * Default value is `Standard`.
      *
      * @returns Value of property `headerType`
      */
    def getHeaderType(): ThingViewerHeaderType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ThingViewerHeaderType * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getIcon icon}.
      *
      * Thing Icon Url
      *
      * @returns Value of property `icon`
      */
    def getIcon(): URI = js.native
    
    /**
      * Gets current value of property {@link #getSecondTitle secondTitle}.
      *
      * Second Line of the Thing Inspector Title
      *
      * @returns Value of property `secondTitle`
      */
    def getSecondTitle(): String = js.native
    
    /**
      * ID of the element which is the current target of the association {@link #getSelectedFacet selectedFacet},
      * or `null`.
      */
    def getSelectedFacet(): ID = js.native
    
    /**
      * Gets current value of property {@link #getType type}.
      *
      * Thing type
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
      * Checks for the provided `sap.ui.ux3.NavigationItem` in the aggregation {@link #getFacets facets}. and
      * returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfFacet(
      /**
      * The facet whose index is looked for
      */
    oFacet: typings.openui5.sapUiUx3NavigationItemMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.ux3.ThingGroup` in the aggregation {@link #getFacetContent facetContent}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfFacetContent(
      /**
      * The facetContent whose index is looked for
      */
    oFacetContent: typings.openui5.sapUiUx3ThingGroupMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.ux3.ThingGroup` in the aggregation {@link #getHeaderContent headerContent}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfHeaderContent(
      /**
      * The headerContent whose index is looked for
      */
    oHeaderContent: typings.openui5.sapUiUx3ThingGroupMod.default
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
      * Inserts a facet into the aggregation {@link #getFacets facets}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertFacet(
      /**
      * The facet to insert; if empty, nothing is inserted
      */
    oFacet: typings.openui5.sapUiUx3NavigationItemMod.default,
      /**
      * The `0`-based index the facet should be inserted at; for a negative value of `iIndex`, the facet is inserted
      * at position 0; for a value greater than the current size of the aggregation, the facet is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a facetContent into the aggregation {@link #getFacetContent facetContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertFacetContent(
      /**
      * The facetContent to insert; if empty, nothing is inserted
      */
    oFacetContent: typings.openui5.sapUiUx3ThingGroupMod.default,
      /**
      * The `0`-based index the facetContent should be inserted at; for a negative value of `iIndex`, the facetContent
      * is inserted at position 0; for a value greater than the current size of the aggregation, the facetContent
      * is inserted at the last position
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
    oHeaderContent: typings.openui5.sapUiUx3ThingGroupMod.default,
      /**
      * The `0`-based index the headerContent should be inserted at; for a negative value of `iIndex`, the headerContent
      * is inserted at position 0; for a value greater than the current size of the aggregation, the headerContent
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Opens this instance of ThingIspector
      */
    def open(): Unit = js.native
    
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
      * Removes all the controls from the aggregation {@link #getFacetContent facetContent}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllFacetContent(): js.Array[typings.openui5.sapUiUx3ThingGroupMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getFacets facets}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllFacets(): js.Array[typings.openui5.sapUiUx3NavigationItemMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getHeaderContent headerContent}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllHeaderContent(): js.Array[typings.openui5.sapUiUx3ThingGroupMod.default] = js.native
    
    def removeFacet(/**
      * The facet to remove or its index or id
      */
    vFacet: String): typings.openui5.sapUiUx3NavigationItemMod.default | Null = js.native
    /**
      * Removes a facet from the aggregation {@link #getFacets facets}.
      *
      * @returns The removed facet or `null`
      */
    def removeFacet(/**
      * The facet to remove or its index or id
      */
    vFacet: int): typings.openui5.sapUiUx3NavigationItemMod.default | Null = js.native
    def removeFacet(
      /**
      * The facet to remove or its index or id
      */
    vFacet: typings.openui5.sapUiUx3NavigationItemMod.default
    ): typings.openui5.sapUiUx3NavigationItemMod.default | Null = js.native
    
    def removeFacetContent(/**
      * The facetContent to remove or its index or id
      */
    vFacetContent: String): typings.openui5.sapUiUx3ThingGroupMod.default | Null = js.native
    /**
      * Removes a facetContent from the aggregation {@link #getFacetContent facetContent}.
      *
      * @returns The removed facetContent or `null`
      */
    def removeFacetContent(/**
      * The facetContent to remove or its index or id
      */
    vFacetContent: int): typings.openui5.sapUiUx3ThingGroupMod.default | Null = js.native
    def removeFacetContent(
      /**
      * The facetContent to remove or its index or id
      */
    vFacetContent: typings.openui5.sapUiUx3ThingGroupMod.default
    ): typings.openui5.sapUiUx3ThingGroupMod.default | Null = js.native
    
    def removeHeaderContent(/**
      * The headerContent to remove or its index or id
      */
    vHeaderContent: String): typings.openui5.sapUiUx3ThingGroupMod.default | Null = js.native
    /**
      * Removes a headerContent from the aggregation {@link #getHeaderContent headerContent}.
      *
      * @returns The removed headerContent or `null`
      */
    def removeHeaderContent(/**
      * The headerContent to remove or its index or id
      */
    vHeaderContent: int): typings.openui5.sapUiUx3ThingGroupMod.default | Null = js.native
    def removeHeaderContent(
      /**
      * The headerContent to remove or its index or id
      */
    vHeaderContent: typings.openui5.sapUiUx3ThingGroupMod.default
    ): typings.openui5.sapUiUx3ThingGroupMod.default | Null = js.native
    
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
      * First Line of the Thing Inspector Title
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
      * @SINCE 1.16.3
      *
      * Sets a new value for property {@link #getHeaderType headerType}.
      *
      * Defines which header type should be used.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Standard`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeaderType(): this.type = js.native
    def setHeaderType(
      /**
      * New value for property `headerType`
      */
    sHeaderType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ThingViewerHeaderType * / any */ String
    ): this.type = js.native
    def setHeaderType(/**
      * New value for property `headerType`
      */
    sHeaderType: ThingViewerHeaderType): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIcon icon}.
      *
      * Thing Icon Url
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
      * Sets a new value for property {@link #getSecondTitle secondTitle}.
      *
      * Second Line of the Thing Inspector Title
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
      * Sets the associated {@link #getSelectedFacet selectedFacet}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSelectedFacet(
      /**
      * ID of an element which becomes the new target of this selectedFacet association; alternatively, an element
      * instance may be given
      */
    oSelectedFacet: ID
    ): this.type = js.native
    def setSelectedFacet(
      /**
      * ID of an element which becomes the new target of this selectedFacet association; alternatively, an element
      * instance may be given
      */
    oSelectedFacet: typings.openui5.sapUiUx3NavigationItemMod.default
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getType type}.
      *
      * Thing type
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
  }
  
  trait ThingInspectorSettings
    extends StObject
       with OverlaySettings {
    
    /**
      * ActionBar. If no actionBar is set a default ActionBar will be created.
      */
    var actionBar: js.UndefOr[typings.openui5.sapUiUx3ActionBarMod.default] = js.undefined
    
    /**
      * Further thing related Action selected
      */
    var actionSelected: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Actions of a Thing
      */
    var actions: js.UndefOr[
        js.Array[typings.openui5.sapUiUx3ThingActionMod.default] | typings.openui5.sapUiUx3ThingActionMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * ThingGroups for content of the selected facet
      */
    var facetContent: js.UndefOr[
        js.Array[typings.openui5.sapUiUx3ThingGroupMod.default] | typings.openui5.sapUiUx3ThingGroupMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Event for facet selection. The application is responsible for displaying the correct content for the
      * selected one. The ThingInspector will currently always mark the first facet as selected.
      */
    var facetSelected: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Thing Inspector facets
      */
    var facets: js.UndefOr[
        js.Array[typings.openui5.sapUiUx3NavigationItemMod.default] | typings.openui5.sapUiUx3NavigationItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
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
    var feedSubmit: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * First Line of the Thing Inspector Title
      */
    var firstTitle: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
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
      * ThingGroups for the header content
      */
    var headerContent: js.UndefOr[
        js.Array[typings.openui5.sapUiUx3ThingGroupMod.default] | typings.openui5.sapUiUx3ThingGroupMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.16.3
      *
      * Defines which header type should be used.
      */
    var headerType: js.UndefOr[
        ThingViewerHeaderType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ThingViewerHeaderType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Thing Icon Url
      */
    var icon: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Second Line of the Thing Inspector Title
      */
    var secondTitle: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The Facet that is currently selected.
      */
    var selectedFacet: js.UndefOr[typings.openui5.sapUiUx3NavigationItemMod.default | String] = js.undefined
    
    /**
      * Thing type
      */
    var `type`: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Update action enabled/disabled. If disabled the action will be invisible.
      */
    var updateActionEnabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ThingInspectorSettings {
    
    inline def apply(): ThingInspectorSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThingInspectorSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ThingInspectorSettings] (val x: Self) extends AnyVal {
      
      inline def setActionBar(value: typings.openui5.sapUiUx3ActionBarMod.default): Self = StObject.set(x, "actionBar", value.asInstanceOf[js.Any])
      
      inline def setActionBarUndefined: Self = StObject.set(x, "actionBar", js.undefined)
      
      inline def setActionSelected(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "actionSelected", js.Any.fromFunction1(value))
      
      inline def setActionSelectedUndefined: Self = StObject.set(x, "actionSelected", js.undefined)
      
      inline def setActions(
        value: js.Array[typings.openui5.sapUiUx3ThingActionMod.default] | typings.openui5.sapUiUx3ThingActionMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: typings.openui5.sapUiUx3ThingActionMod.default*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setFacetContent(
        value: js.Array[typings.openui5.sapUiUx3ThingGroupMod.default] | typings.openui5.sapUiUx3ThingGroupMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "facetContent", value.asInstanceOf[js.Any])
      
      inline def setFacetContentUndefined: Self = StObject.set(x, "facetContent", js.undefined)
      
      inline def setFacetContentVarargs(value: typings.openui5.sapUiUx3ThingGroupMod.default*): Self = StObject.set(x, "facetContent", js.Array(value*))
      
      inline def setFacetSelected(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "facetSelected", js.Any.fromFunction1(value))
      
      inline def setFacetSelectedUndefined: Self = StObject.set(x, "facetSelected", js.undefined)
      
      inline def setFacets(
        value: js.Array[typings.openui5.sapUiUx3NavigationItemMod.default] | typings.openui5.sapUiUx3NavigationItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "facets", value.asInstanceOf[js.Any])
      
      inline def setFacetsUndefined: Self = StObject.set(x, "facets", js.undefined)
      
      inline def setFacetsVarargs(value: typings.openui5.sapUiUx3NavigationItemMod.default*): Self = StObject.set(x, "facets", js.Array(value*))
      
      inline def setFavoriteActionEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "favoriteActionEnabled", value.asInstanceOf[js.Any])
      
      inline def setFavoriteActionEnabledUndefined: Self = StObject.set(x, "favoriteActionEnabled", js.undefined)
      
      inline def setFavoriteState(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "favoriteState", value.asInstanceOf[js.Any])
      
      inline def setFavoriteStateUndefined: Self = StObject.set(x, "favoriteState", js.undefined)
      
      inline def setFeedSubmit(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "feedSubmit", js.Any.fromFunction1(value))
      
      inline def setFeedSubmitUndefined: Self = StObject.set(x, "feedSubmit", js.undefined)
      
      inline def setFirstTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "firstTitle", value.asInstanceOf[js.Any])
      
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
      
      inline def setHeaderContent(
        value: js.Array[typings.openui5.sapUiUx3ThingGroupMod.default] | typings.openui5.sapUiUx3ThingGroupMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "headerContent", value.asInstanceOf[js.Any])
      
      inline def setHeaderContentUndefined: Self = StObject.set(x, "headerContent", js.undefined)
      
      inline def setHeaderContentVarargs(value: typings.openui5.sapUiUx3ThingGroupMod.default*): Self = StObject.set(x, "headerContent", js.Array(value*))
      
      inline def setHeaderType(
        value: ThingViewerHeaderType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ThingViewerHeaderType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "headerType", value.asInstanceOf[js.Any])
      
      inline def setHeaderTypeUndefined: Self = StObject.set(x, "headerType", js.undefined)
      
      inline def setIcon(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setSecondTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "secondTitle", value.asInstanceOf[js.Any])
      
      inline def setSecondTitleUndefined: Self = StObject.set(x, "secondTitle", js.undefined)
      
      inline def setSelectedFacet(value: typings.openui5.sapUiUx3NavigationItemMod.default | String): Self = StObject.set(x, "selectedFacet", value.asInstanceOf[js.Any])
      
      inline def setSelectedFacetUndefined: Self = StObject.set(x, "selectedFacet", js.undefined)
      
      inline def setType(value: String | PropertyBindingInfo): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUpdateActionEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "updateActionEnabled", value.asInstanceOf[js.Any])
      
      inline def setUpdateActionEnabledUndefined: Self = StObject.set(x, "updateActionEnabled", js.undefined)
    }
  }
}
