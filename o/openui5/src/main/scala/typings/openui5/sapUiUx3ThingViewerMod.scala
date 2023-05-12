package typings.openui5

import typings.openui5.anon.ItemKey
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.openui5.sapUiUx3LibraryMod.ThingViewerHeaderType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUx3ThingViewerMod {
  
  @JSImport("sap/ui/ux3/ThingViewer", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ThingViewer.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ThingViewer {
    def this(/**
      * initial settings for the new control
      */
    mSettings: ThingViewerSettings) = this()
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
    mSettings: ThingViewerSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: ThingViewerSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/ux3/ThingViewer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.ux3.ThingViewer with name `sClassName` and enriches it with the
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
    oClassInfo: ClassInfo[T, ThingViewer]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ThingViewer],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.ux3.ThingViewer.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ThingViewer
    extends typings.openui5.sapUiCoreControlMod.default {
    
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
      * Attaches event handler `fnFunction` to the {@link #event:facetSelected facetSelected} event of this `sap.ui.ux3.ThingViewer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.ThingViewer` itself.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.ThingViewer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:facetSelected facetSelected} event of this `sap.ui.ux3.ThingViewer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.ThingViewer` itself.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.ThingViewer` itself
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
      * Detaches event handler `fnFunction` from the {@link #event:facetSelected facetSelected} event of this
      * `sap.ui.ux3.ThingViewer`.
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
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
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
      * Gets content of aggregation {@link #getActionBar actionBar}.
      *
      * An ActionBar can be given
      */
    def getActionBar(): typings.openui5.sapUiUx3ActionBarMod.default = js.native
    
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
      * Gets current value of property {@link #getHeight height}.
      *
      * Height of the ThingViewer
      *
      * Default value is `'100%'`.
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getIcon icon}.
      *
      * Thing Icon Url
      *
      * @returns Value of property `icon`
      */
    def getIcon(): URI = js.native
    
    /**
      * ID of the element which is the current target of the association {@link #getSelectedFacet selectedFacet},
      * or `null`.
      */
    def getSelectedFacet(): ID = js.native
    
    /**
      * Gets current value of property {@link #getSubtitle subtitle}.
      *
      * Subtitle of the Thing Inspector
      *
      * @returns Value of property `subtitle`
      */
    def getSubtitle(): String = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * Title of the Thing Inspector
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
      * Gets current value of property {@link #getType type}.
      *
      * Thing type
      *
      * @returns Value of property `type`
      */
    def getType(): String = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Width of the ThingViewer
      *
      * Default value is `'100%'`.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
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
      * Sets a new value for property {@link #getHeight height}.
      *
      * Height of the ThingViewer
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'100%'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeight(): this.type = js.native
    def setHeight(/**
      * New value for property `height`
      */
    sHeight: CSSSize): this.type = js.native
    
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
      * Sets a new value for property {@link #getSubtitle subtitle}.
      *
      * Subtitle of the Thing Inspector
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSubtitle(): this.type = js.native
    def setSubtitle(/**
      * New value for property `subtitle`
      */
    sSubtitle: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitle title}.
      *
      * Title of the Thing Inspector
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
      * Sets a new value for property {@link #getWidth width}.
      *
      * Width of the ThingViewer
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'100%'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(): this.type = js.native
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
  }
  
  trait ThingViewerSettings
    extends StObject
       with ControlSettings {
    
    /**
      * An ActionBar can be given
      */
    var actionBar: js.UndefOr[typings.openui5.sapUiUx3ActionBarMod.default] = js.undefined
    
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
      * Height of the ThingViewer
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Thing Icon Url
      */
    var icon: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * The Facet that is currently selected.
      */
    var selectedFacet: js.UndefOr[typings.openui5.sapUiUx3NavigationItemMod.default | String] = js.undefined
    
    /**
      * Subtitle of the Thing Inspector
      */
    var subtitle: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Title of the Thing Inspector
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Thing type
      */
    var `type`: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Width of the ThingViewer
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ThingViewerSettings {
    
    inline def apply(): ThingViewerSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThingViewerSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ThingViewerSettings] (val x: Self) extends AnyVal {
      
      inline def setActionBar(value: typings.openui5.sapUiUx3ActionBarMod.default): Self = StObject.set(x, "actionBar", value.asInstanceOf[js.Any])
      
      inline def setActionBarUndefined: Self = StObject.set(x, "actionBar", js.undefined)
      
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
      
      inline def setHeaderContent(
        value: js.Array[typings.openui5.sapUiUx3ThingGroupMod.default] | typings.openui5.sapUiUx3ThingGroupMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "headerContent", value.asInstanceOf[js.Any])
      
      inline def setHeaderContentUndefined: Self = StObject.set(x, "headerContent", js.undefined)
      
      inline def setHeaderContentVarargs(value: typings.openui5.sapUiUx3ThingGroupMod.default*): Self = StObject.set(x, "headerContent", js.Array(value*))
      
      inline def setHeaderType(
        value: ThingViewerHeaderType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ThingViewerHeaderType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "headerType", value.asInstanceOf[js.Any])
      
      inline def setHeaderTypeUndefined: Self = StObject.set(x, "headerType", js.undefined)
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIcon(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setSelectedFacet(value: typings.openui5.sapUiUx3NavigationItemMod.default | String): Self = StObject.set(x, "selectedFacet", value.asInstanceOf[js.Any])
      
      inline def setSelectedFacetUndefined: Self = StObject.set(x, "selectedFacet", js.undefined)
      
      inline def setSubtitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: String | PropertyBindingInfo): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
