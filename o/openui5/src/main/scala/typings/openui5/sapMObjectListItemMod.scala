package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMListItemBaseMod.ListItemBaseSettings
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreLibraryMod.TextDirection
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.openui5.sapUiCoreLibraryMod.ValueState
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMObjectListItemMod {
  
  @JSImport("sap/m/ObjectListItem", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ObjectListItem.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/object-list-item/ Object List Item}
    */
  open class default () extends ObjectListItem {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ObjectListItemSettings) = this()
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
    mSettings: ObjectListItemSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ObjectListItemSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/ObjectListItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.ObjectListItem with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.ListItemBase.extend}.
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
    oClassInfo: ClassInfo[T, ObjectListItem]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ObjectListItem],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.ObjectListItem.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ObjectListItem
    extends typings.openui5.sapMListItemBaseMod.default {
    
    /**
      * Adds some attribute to the aggregation {@link #getAttributes attributes}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAttribute(
      /**
      * The attribute to add; if empty, nothing is inserted
      */
    oAttribute: typings.openui5.sapMObjectAttributeMod.default
    ): this.type = js.native
    
    /**
      * Adds some marker to the aggregation {@link #getMarkers markers}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addMarker(
      /**
      * The marker to add; if empty, nothing is inserted
      */
    oMarker: typings.openui5.sapMObjectMarkerMod.default
    ): this.type = js.native
    
    /**
      * Destroys all the attributes in the aggregation {@link #getAttributes attributes}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyAttributes(): this.type = js.native
    
    /**
      * Destroys the firstStatus in the aggregation {@link #getFirstStatus firstStatus}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyFirstStatus(): this.type = js.native
    
    /**
      * Destroys all the markers in the aggregation {@link #getMarkers markers}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyMarkers(): this.type = js.native
    
    /**
      * Destroys the secondStatus in the aggregation {@link #getSecondStatus secondStatus}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySecondStatus(): this.type = js.native
    
    /**
      * Gets current value of property {@link #getActiveIcon activeIcon}.
      *
      * Icon displayed when the ObjectListItem is active.
      *
      * @returns Value of property `activeIcon`
      */
    def getActiveIcon(): URI = js.native
    
    /**
      * Gets content of aggregation {@link #getAttributes attributes}.
      *
      * List of attributes displayed below the title to the left of the status fields.
      */
    def getAttributes(): js.Array[typings.openui5.sapMObjectAttributeMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getFirstStatus firstStatus}.
      *
      * First status text field displayed on the right side of the attributes.
      */
    def getFirstStatus(): typings.openui5.sapMObjectStatusMod.default = js.native
    
    /**
      * Gets current value of property {@link #getIcon icon}.
      *
      * ObjectListItem icon displayed to the left of the title.
      *
      * @returns Value of property `icon`
      */
    def getIcon(): URI = js.native
    
    /**
      * Gets current value of property {@link #getIconDensityAware iconDensityAware}.
      *
      * By default, this is set to true but then one or more requests are sent trying to get the density perfect
      * version of image (in case this version of image doesn't exist on the server).
      *
      * If bandwidth is key for the application, set this value to false.
      *
      * Default value is `true`.
      *
      * @returns Value of property `iconDensityAware`
      */
    def getIconDensityAware(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getIntro intro}.
      *
      * Defines the introductory text for the ObjectListItem.
      *
      * @returns Value of property `intro`
      */
    def getIntro(): String = js.native
    
    /**
      * Gets current value of property {@link #getIntroTextDirection introTextDirection}.
      *
      * Determines the text direction of the item intro. Available options for the intro direction are LTR (left-to-right)
      * and RTL (right-to-left). By default the item intro inherits the text direction from its parent.
      *
      * Default value is `Inherit`.
      *
      * @returns Value of property `introTextDirection`
      */
    def getIntroTextDirection(): TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) = js.native
    
    /**
      * @SINCE 1.16.0
      * @deprecated (since 1.42.0) - replaced by `markers` aggregation. Add {@link sap.m.ObjectMarker} with type
      * `sap.m.ObjectMarkerType.Favorite`. You should use either this property or the `markers` aggregation,
      * using both may lead to unpredicted behavior.
      *
      * Gets current value of property {@link #getMarkFavorite markFavorite}.
      *
      * Sets the favorite state for the ObjectListItem.
      *
      *
      *
      * @returns Value of property `markFavorite`
      */
    def getMarkFavorite(): Boolean = js.native
    
    /**
      * @SINCE 1.16.0
      * @deprecated (since 1.42.0) - replaced by `markers` aggregation. Add {@link sap.m.ObjectMarker} with type
      * `sap.m.ObjectMarkerType.Flagged`. You should use either this property or the `markers` aggregation, using
      * both may lead to unpredicted behavior.
      *
      * Gets current value of property {@link #getMarkFlagged markFlagged}.
      *
      * Sets the flagged state for the ObjectListItem.
      *
      *
      *
      * @returns Value of property `markFlagged`
      */
    def getMarkFlagged(): Boolean = js.native
    
    /**
      * @SINCE 1.28
      * @deprecated (since 1.42.0) - replaced by `markers` aggregation. Add {@link sap.m.ObjectMarker} with type
      * `sap.m.ObjectMarkerType.Locked`. You should use either this property or the `markers` aggregation, using
      * both may lead to unpredicted behavior.
      *
      *
      *
      * Gets current value of property {@link #getMarkLocked markLocked}.
      *
      * Sets the locked state of the ObjectListItem.
      *
      *
      *
      * Default value is `false`.
      *
      * @returns Value of property `markLocked`
      */
    def getMarkLocked(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getMarkers markers}.
      *
      * List of markers (icon and/or text) that can be displayed for the `ObjectListItems`, such as favorite
      * and flagged.
      *
      *  **Note:** You should use either this aggregation or the already deprecated properties - `markFlagged`,
      * `markFavorite`, and `markLocked`. Using both can lead to unexpected results.
      */
    def getMarkers(): js.Array[typings.openui5.sapMObjectMarkerMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getNumber number}.
      *
      * Defines the ObjectListItem number.
      *
      * @returns Value of property `number`
      */
    def getNumber(): String = js.native
    
    /**
      * @SINCE 1.16.0
      *
      * Gets current value of property {@link #getNumberState numberState}.
      *
      * Defines the ObjectListItem number and numberUnit value state.
      *
      * Default value is `None`.
      *
      * @returns Value of property `numberState`
      */
    def getNumberState(): ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getNumberTextDirection numberTextDirection}.
      *
      * Determines the text direction of the item number. Available options for the number direction are LTR
      * (left-to-right) and RTL (right-to-left). By default the item number inherits the text direction from
      * its parent.
      *
      * Default value is `Inherit`.
      *
      * @returns Value of property `numberTextDirection`
      */
    def getNumberTextDirection(): TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getNumberUnit numberUnit}.
      *
      * Defines the number units qualifier of the ObjectListItem.
      *
      * @returns Value of property `numberUnit`
      */
    def getNumberUnit(): String = js.native
    
    /**
      * Gets content of aggregation {@link #getSecondStatus secondStatus}.
      *
      * Second status text field displayed on the right side of the attributes.
      */
    def getSecondStatus(): typings.openui5.sapMObjectStatusMod.default = js.native
    
    /**
      * @SINCE 1.16.0
      * @deprecated (since 1.42.0) - replaced by `markers` aggregation. This property is valid only if you are
      * using the already deprecated properties - `markFlagged`, `markFavorite`, and `markLocked`. If you are
      * using the `markers` aggregation, the visibility of the markers depends on what is set in the aggregation
      * itself.
      *
      * Gets current value of property {@link #getShowMarkers showMarkers}.
      *
      * If set to true, the ObjectListItem can be marked with icons such as favorite and flag.
      *
      *
      *
      * @returns Value of property `showMarkers`
      */
    def getShowMarkers(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * Defines the ObjectListItem title.
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
      * Gets current value of property {@link #getTitleTextDirection titleTextDirection}.
      *
      * Determines the text direction of the item title. Available options for the title direction are LTR (left-to-right)
      * and RTL (right-to-left). By default the item title inherits the text direction from its parent.
      *
      * Default value is `Inherit`.
      *
      * @returns Value of property `titleTextDirection`
      */
    def getTitleTextDirection(): TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) = js.native
    
    /**
      * Checks for the provided `sap.m.ObjectAttribute` in the aggregation {@link #getAttributes attributes}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfAttribute(
      /**
      * The attribute whose index is looked for
      */
    oAttribute: typings.openui5.sapMObjectAttributeMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.m.ObjectMarker` in the aggregation {@link #getMarkers markers}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfMarker(
      /**
      * The marker whose index is looked for
      */
    oMarker: typings.openui5.sapMObjectMarkerMod.default
    ): int = js.native
    
    /**
      * Inserts a attribute into the aggregation {@link #getAttributes attributes}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertAttribute(
      /**
      * The attribute to insert; if empty, nothing is inserted
      */
    oAttribute: typings.openui5.sapMObjectAttributeMod.default,
      /**
      * The `0`-based index the attribute should be inserted at; for a negative value of `iIndex`, the attribute
      * is inserted at position 0; for a value greater than the current size of the aggregation, the attribute
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a marker into the aggregation {@link #getMarkers markers}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertMarker(
      /**
      * The marker to insert; if empty, nothing is inserted
      */
    oMarker: typings.openui5.sapMObjectMarkerMod.default,
      /**
      * The `0`-based index the marker should be inserted at; for a negative value of `iIndex`, the marker is
      * inserted at position 0; for a value greater than the current size of the aggregation, the marker is inserted
      * at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getAttributes attributes}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAttributes(): js.Array[typings.openui5.sapMObjectAttributeMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getMarkers markers}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllMarkers(): js.Array[typings.openui5.sapMObjectMarkerMod.default] = js.native
    
    def removeAttribute(/**
      * The attribute to remove or its index or id
      */
    vAttribute: String): typings.openui5.sapMObjectAttributeMod.default | Null = js.native
    /**
      * Removes a attribute from the aggregation {@link #getAttributes attributes}.
      *
      * @returns The removed attribute or `null`
      */
    def removeAttribute(/**
      * The attribute to remove or its index or id
      */
    vAttribute: int): typings.openui5.sapMObjectAttributeMod.default | Null = js.native
    def removeAttribute(
      /**
      * The attribute to remove or its index or id
      */
    vAttribute: typings.openui5.sapMObjectAttributeMod.default
    ): typings.openui5.sapMObjectAttributeMod.default | Null = js.native
    
    def removeMarker(/**
      * The marker to remove or its index or id
      */
    vMarker: String): typings.openui5.sapMObjectMarkerMod.default | Null = js.native
    /**
      * Removes a marker from the aggregation {@link #getMarkers markers}.
      *
      * @returns The removed marker or `null`
      */
    def removeMarker(/**
      * The marker to remove or its index or id
      */
    vMarker: int): typings.openui5.sapMObjectMarkerMod.default | Null = js.native
    def removeMarker(
      /**
      * The marker to remove or its index or id
      */
    vMarker: typings.openui5.sapMObjectMarkerMod.default
    ): typings.openui5.sapMObjectMarkerMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getActiveIcon activeIcon}.
      *
      * Icon displayed when the ObjectListItem is active.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setActiveIcon(): this.type = js.native
    def setActiveIcon(/**
      * New value for property `activeIcon`
      */
    sActiveIcon: URI): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getFirstStatus firstStatus}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFirstStatus(/**
      * The firstStatus to set
      */
    oFirstStatus: typings.openui5.sapMObjectStatusMod.default): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIcon icon}.
      *
      * ObjectListItem icon displayed to the left of the title.
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
      * Sets a new value for property {@link #getIconDensityAware iconDensityAware}.
      *
      * By default, this is set to true but then one or more requests are sent trying to get the density perfect
      * version of image (in case this version of image doesn't exist on the server).
      *
      * If bandwidth is key for the application, set this value to false.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIconDensityAware(): this.type = js.native
    def setIconDensityAware(/**
      * New value for property `iconDensityAware`
      */
    bIconDensityAware: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIntro intro}.
      *
      * Defines the introductory text for the ObjectListItem.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIntro(): this.type = js.native
    def setIntro(/**
      * New value for property `intro`
      */
    sIntro: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIntroTextDirection introTextDirection}.
      *
      * Determines the text direction of the item intro. Available options for the intro direction are LTR (left-to-right)
      * and RTL (right-to-left). By default the item intro inherits the text direction from its parent.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Inherit`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIntroTextDirection(): this.type = js.native
    def setIntroTextDirection(
      /**
      * New value for property `introTextDirection`
      */
    sIntroTextDirection: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String
    ): this.type = js.native
    def setIntroTextDirection(/**
      * New value for property `introTextDirection`
      */
    sIntroTextDirection: TextDirection): this.type = js.native
    
    /**
      * Sets the visibility value of the Favorite marker.
      *
      * @returns this pointer for chaining
      */
    def setMarkFavorite(/**
      * the new value
      */
    bMarked: Boolean): this.type = js.native
    
    /**
      * Sets the visibility value of the Flagged marker.
      *
      * @returns this pointer for chaining
      */
    def setMarkFlagged(/**
      * the new value
      */
    bMarked: Boolean): this.type = js.native
    
    /**
      * Sets the visibility value of the Favorite marker.
      *
      * @returns this pointer for chaining
      */
    def setMarkLocked(/**
      * the new value
      */
    bMarked: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getNumber number}.
      *
      * Defines the ObjectListItem number.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setNumber(): this.type = js.native
    def setNumber(/**
      * New value for property `number`
      */
    sNumber: String): this.type = js.native
    
    /**
      * @SINCE 1.16.0
      *
      * Sets a new value for property {@link #getNumberState numberState}.
      *
      * Defines the ObjectListItem number and numberUnit value state.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `None`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setNumberState(): this.type = js.native
    def setNumberState(
      /**
      * New value for property `numberState`
      */
    sNumberState: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String
    ): this.type = js.native
    def setNumberState(/**
      * New value for property `numberState`
      */
    sNumberState: ValueState): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getNumberTextDirection numberTextDirection}.
      *
      * Determines the text direction of the item number. Available options for the number direction are LTR
      * (left-to-right) and RTL (right-to-left). By default the item number inherits the text direction from
      * its parent.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Inherit`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setNumberTextDirection(): this.type = js.native
    def setNumberTextDirection(
      /**
      * New value for property `numberTextDirection`
      */
    sNumberTextDirection: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String
    ): this.type = js.native
    def setNumberTextDirection(/**
      * New value for property `numberTextDirection`
      */
    sNumberTextDirection: TextDirection): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getNumberUnit numberUnit}.
      *
      * Defines the number units qualifier of the ObjectListItem.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setNumberUnit(): this.type = js.native
    def setNumberUnit(/**
      * New value for property `numberUnit`
      */
    sNumberUnit: String): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getSecondStatus secondStatus}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSecondStatus(/**
      * The secondStatus to set
      */
    oSecondStatus: typings.openui5.sapMObjectStatusMod.default): this.type = js.native
    
    /**
      * Sets the visibility value of the Flagged and Favorite markers.
      *
      * @returns this pointer for chaining
      */
    def setShowMarkers(/**
      * the new value
      */
    bMarked: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitle title}.
      *
      * Defines the ObjectListItem title.
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
      * Sets a new value for property {@link #getTitleTextDirection titleTextDirection}.
      *
      * Determines the text direction of the item title. Available options for the title direction are LTR (left-to-right)
      * and RTL (right-to-left). By default the item title inherits the text direction from its parent.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Inherit`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitleTextDirection(): this.type = js.native
    def setTitleTextDirection(
      /**
      * New value for property `titleTextDirection`
      */
    sTitleTextDirection: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String
    ): this.type = js.native
    def setTitleTextDirection(/**
      * New value for property `titleTextDirection`
      */
    sTitleTextDirection: TextDirection): this.type = js.native
  }
  
  trait ObjectListItemSettings
    extends StObject
       with ListItemBaseSettings {
    
    /**
      * Icon displayed when the ObjectListItem is active.
      */
    var activeIcon: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * List of attributes displayed below the title to the left of the status fields.
      */
    var attributes: js.UndefOr[
        js.Array[typings.openui5.sapMObjectAttributeMod.default] | typings.openui5.sapMObjectAttributeMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * First status text field displayed on the right side of the attributes.
      */
    var firstStatus: js.UndefOr[typings.openui5.sapMObjectStatusMod.default] = js.undefined
    
    /**
      * ObjectListItem icon displayed to the left of the title.
      */
    var icon: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * By default, this is set to true but then one or more requests are sent trying to get the density perfect
      * version of image (in case this version of image doesn't exist on the server).
      *
      * If bandwidth is key for the application, set this value to false.
      */
    var iconDensityAware: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the introductory text for the ObjectListItem.
      */
    var intro: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Determines the text direction of the item intro. Available options for the intro direction are LTR (left-to-right)
      * and RTL (right-to-left). By default the item intro inherits the text direction from its parent.
      */
    var introTextDirection: js.UndefOr[
        TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.16.0
      * @deprecated (since 1.42.0) - replaced by `markers` aggregation. Add {@link sap.m.ObjectMarker} with type
      * `sap.m.ObjectMarkerType.Favorite`. You should use either this property or the `markers` aggregation,
      * using both may lead to unpredicted behavior.
      *
      * Sets the favorite state for the ObjectListItem.
      */
    var markFavorite: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.16.0
      * @deprecated (since 1.42.0) - replaced by `markers` aggregation. Add {@link sap.m.ObjectMarker} with type
      * `sap.m.ObjectMarkerType.Flagged`. You should use either this property or the `markers` aggregation, using
      * both may lead to unpredicted behavior.
      *
      * Sets the flagged state for the ObjectListItem.
      */
    var markFlagged: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.28
      * @deprecated (since 1.42.0) - replaced by `markers` aggregation. Add {@link sap.m.ObjectMarker} with type
      * `sap.m.ObjectMarkerType.Locked`. You should use either this property or the `markers` aggregation, using
      * both may lead to unpredicted behavior.
      *
      *
      *
      * Sets the locked state of the ObjectListItem.
      */
    var markLocked: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * List of markers (icon and/or text) that can be displayed for the `ObjectListItems`, such as favorite
      * and flagged.
      *
      *  **Note:** You should use either this aggregation or the already deprecated properties - `markFlagged`,
      * `markFavorite`, and `markLocked`. Using both can lead to unexpected results.
      */
    var markers: js.UndefOr[
        js.Array[typings.openui5.sapMObjectMarkerMod.default] | typings.openui5.sapMObjectMarkerMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the ObjectListItem number.
      */
    var number: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.16.0
      *
      * Defines the ObjectListItem number and numberUnit value state.
      */
    var numberState: js.UndefOr[
        ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Determines the text direction of the item number. Available options for the number direction are LTR
      * (left-to-right) and RTL (right-to-left). By default the item number inherits the text direction from
      * its parent.
      */
    var numberTextDirection: js.UndefOr[
        TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the number units qualifier of the ObjectListItem.
      */
    var numberUnit: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Second status text field displayed on the right side of the attributes.
      */
    var secondStatus: js.UndefOr[typings.openui5.sapMObjectStatusMod.default] = js.undefined
    
    /**
      * @SINCE 1.16.0
      * @deprecated (since 1.42.0) - replaced by `markers` aggregation. This property is valid only if you are
      * using the already deprecated properties - `markFlagged`, `markFavorite`, and `markLocked`. If you are
      * using the `markers` aggregation, the visibility of the markers depends on what is set in the aggregation
      * itself.
      *
      * If set to true, the ObjectListItem can be marked with icons such as favorite and flag.
      */
    var showMarkers: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the ObjectListItem title.
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Determines the text direction of the item title. Available options for the title direction are LTR (left-to-right)
      * and RTL (right-to-left). By default the item title inherits the text direction from its parent.
      */
    var titleTextDirection: js.UndefOr[
        TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object ObjectListItemSettings {
    
    inline def apply(): ObjectListItemSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObjectListItemSettings]
    }
    
    extension [Self <: ObjectListItemSettings](x: Self) {
      
      inline def setActiveIcon(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "activeIcon", value.asInstanceOf[js.Any])
      
      inline def setActiveIconUndefined: Self = StObject.set(x, "activeIcon", js.undefined)
      
      inline def setAttributes(
        value: js.Array[typings.openui5.sapMObjectAttributeMod.default] | typings.openui5.sapMObjectAttributeMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setAttributesVarargs(value: typings.openui5.sapMObjectAttributeMod.default*): Self = StObject.set(x, "attributes", js.Array(value*))
      
      inline def setFirstStatus(value: typings.openui5.sapMObjectStatusMod.default): Self = StObject.set(x, "firstStatus", value.asInstanceOf[js.Any])
      
      inline def setFirstStatusUndefined: Self = StObject.set(x, "firstStatus", js.undefined)
      
      inline def setIcon(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconDensityAware(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "iconDensityAware", value.asInstanceOf[js.Any])
      
      inline def setIconDensityAwareUndefined: Self = StObject.set(x, "iconDensityAware", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIntro(value: String | PropertyBindingInfo): Self = StObject.set(x, "intro", value.asInstanceOf[js.Any])
      
      inline def setIntroTextDirection(
        value: TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "introTextDirection", value.asInstanceOf[js.Any])
      
      inline def setIntroTextDirectionUndefined: Self = StObject.set(x, "introTextDirection", js.undefined)
      
      inline def setIntroUndefined: Self = StObject.set(x, "intro", js.undefined)
      
      inline def setMarkFavorite(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "markFavorite", value.asInstanceOf[js.Any])
      
      inline def setMarkFavoriteUndefined: Self = StObject.set(x, "markFavorite", js.undefined)
      
      inline def setMarkFlagged(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "markFlagged", value.asInstanceOf[js.Any])
      
      inline def setMarkFlaggedUndefined: Self = StObject.set(x, "markFlagged", js.undefined)
      
      inline def setMarkLocked(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "markLocked", value.asInstanceOf[js.Any])
      
      inline def setMarkLockedUndefined: Self = StObject.set(x, "markLocked", js.undefined)
      
      inline def setMarkers(
        value: js.Array[typings.openui5.sapMObjectMarkerMod.default] | typings.openui5.sapMObjectMarkerMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
      
      inline def setMarkersUndefined: Self = StObject.set(x, "markers", js.undefined)
      
      inline def setMarkersVarargs(value: typings.openui5.sapMObjectMarkerMod.default*): Self = StObject.set(x, "markers", js.Array(value*))
      
      inline def setNumber(value: String | PropertyBindingInfo): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setNumberState(
        value: ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "numberState", value.asInstanceOf[js.Any])
      
      inline def setNumberStateUndefined: Self = StObject.set(x, "numberState", js.undefined)
      
      inline def setNumberTextDirection(
        value: TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "numberTextDirection", value.asInstanceOf[js.Any])
      
      inline def setNumberTextDirectionUndefined: Self = StObject.set(x, "numberTextDirection", js.undefined)
      
      inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      inline def setNumberUnit(value: String | PropertyBindingInfo): Self = StObject.set(x, "numberUnit", value.asInstanceOf[js.Any])
      
      inline def setNumberUnitUndefined: Self = StObject.set(x, "numberUnit", js.undefined)
      
      inline def setSecondStatus(value: typings.openui5.sapMObjectStatusMod.default): Self = StObject.set(x, "secondStatus", value.asInstanceOf[js.Any])
      
      inline def setSecondStatusUndefined: Self = StObject.set(x, "secondStatus", js.undefined)
      
      inline def setShowMarkers(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showMarkers", value.asInstanceOf[js.Any])
      
      inline def setShowMarkersUndefined: Self = StObject.set(x, "showMarkers", js.undefined)
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleTextDirection(
        value: TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "titleTextDirection", value.asInstanceOf[js.Any])
      
      inline def setTitleTextDirectionUndefined: Self = StObject.set(x, "titleTextDirection", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
