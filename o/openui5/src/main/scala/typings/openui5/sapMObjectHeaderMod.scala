package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.BackgroundDesign
import typings.openui5.sapMLibraryMod.ObjectHeaderContainer
import typings.openui5.sapMLibraryMod.ObjectHeaderPictureShape
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.TextDirection
import typings.openui5.sapUiCoreLibraryMod.TitleLevel
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.openui5.sapUiCoreLibraryMod.ValueState
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMObjectHeaderMod {
  
  @JSImport("sap/m/ObjectHeader", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ObjectHeader.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ObjectHeader {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ObjectHeaderSettings) = this()
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
    mSettings: ObjectHeaderSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ObjectHeaderSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/ObjectHeader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.ObjectHeader with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, ObjectHeader]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ObjectHeader],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.ObjectHeader.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ObjectHeader
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * @since 1.38.0
      *
      * Adds some additionalNumber to the aggregation {@link #getAdditionalNumbers additionalNumbers}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAdditionalNumber(
      /**
      * The additionalNumber to add; if empty, nothing is inserted
      */
    oAdditionalNumber: typings.openui5.sapMObjectNumberMod.default
    ): this.type = js.native
    
    def addAriaDescribedBy(
      /**
      * The ariaDescribedBy to add; if empty, nothing is inserted
      */
    vAriaDescribedBy: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * Adds some ariaDescribedBy into the association {@link #getAriaDescribedBy ariaDescribedBy}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAriaDescribedBy(/**
      * The ariaDescribedBy to add; if empty, nothing is inserted
      */
    vAriaDescribedBy: ID): this.type = js.native
    
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
      * @since 1.16.0
      *
      * Adds some status to the aggregation {@link #getStatuses statuses}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addStatus(
      /**
      * The status to add; if empty, nothing is inserted
      */
    oStatus: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:iconPress iconPress} event of this `sap.m.ObjectHeader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ObjectHeader` itself.
      *
      * Event is fired when the title icon is active and the user taps/clicks on it
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachIconPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ObjectHeaderIconPressEvent, Unit]
    ): this.type = js.native
    def attachIconPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ObjectHeaderIconPressEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.ObjectHeader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:iconPress iconPress} event of this `sap.m.ObjectHeader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ObjectHeader` itself.
      *
      * Event is fired when the title icon is active and the user taps/clicks on it
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachIconPress(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ObjectHeaderIconPressEvent, Unit]
    ): this.type = js.native
    def attachIconPress(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ObjectHeaderIconPressEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.ObjectHeader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:introPress introPress} event of this `sap.m.ObjectHeader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ObjectHeader` itself.
      *
      * Event is fired when the intro is active and the user taps/clicks on it
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachIntroPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ObjectHeaderIntroPressEvent, Unit]
    ): this.type = js.native
    def attachIntroPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ObjectHeaderIntroPressEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.ObjectHeader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:introPress introPress} event of this `sap.m.ObjectHeader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ObjectHeader` itself.
      *
      * Event is fired when the intro is active and the user taps/clicks on it
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachIntroPress(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ObjectHeaderIntroPressEvent, Unit]
    ): this.type = js.native
    def attachIntroPress(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ObjectHeaderIntroPressEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.ObjectHeader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:titlePress titlePress} event of this `sap.m.ObjectHeader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ObjectHeader` itself.
      *
      * Event is fired when the title is active and the user taps/clicks on it
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachTitlePress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ObjectHeaderTitlePressEvent, Unit]
    ): this.type = js.native
    def attachTitlePress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ObjectHeaderTitlePressEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.ObjectHeader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:titlePress titlePress} event of this `sap.m.ObjectHeader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ObjectHeader` itself.
      *
      * Event is fired when the title is active and the user taps/clicks on it
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachTitlePress(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ObjectHeaderTitlePressEvent, Unit]
    ): this.type = js.native
    def attachTitlePress(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ObjectHeaderTitlePressEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.ObjectHeader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.16.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:titleSelectorPress titleSelectorPress} event
      * of this `sap.m.ObjectHeader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ObjectHeader` itself.
      *
      * Event is fired when the object header title selector (down-arrow) is pressed
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachTitleSelectorPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ObjectHeaderTitleSelectorPressEvent, Unit]
    ): this.type = js.native
    def attachTitleSelectorPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ObjectHeaderTitleSelectorPressEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.ObjectHeader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @since 1.16.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:titleSelectorPress titleSelectorPress} event
      * of this `sap.m.ObjectHeader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ObjectHeader` itself.
      *
      * Event is fired when the object header title selector (down-arrow) is pressed
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachTitleSelectorPress(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ObjectHeaderTitleSelectorPressEvent, Unit]
    ): this.type = js.native
    def attachTitleSelectorPress(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ObjectHeaderTitleSelectorPressEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.ObjectHeader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.38.0
      *
      * Destroys all the additionalNumbers in the aggregation {@link #getAdditionalNumbers additionalNumbers}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyAdditionalNumbers(): this.type = js.native
    
    /**
      * Destroys all the attributes in the aggregation {@link #getAttributes attributes}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyAttributes(): this.type = js.native
    
    /**
      * @deprecated (since 1.16.0) - replaced by `statuses` aggregation
      *
      * Destroys the firstStatus in the aggregation {@link #getFirstStatus firstStatus}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyFirstStatus(): this.type = js.native
    
    /**
      * @since 1.21.1
      *
      * Destroys the headerContainer in the aggregation {@link #getHeaderContainer headerContainer}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyHeaderContainer(): this.type = js.native
    
    /**
      * Destroys all the markers in the aggregation {@link #getMarkers markers}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyMarkers(): this.type = js.native
    
    /**
      * @deprecated (since 1.16.0) - replaced by `statuses` aggregation
      *
      * Destroys the secondStatus in the aggregation {@link #getSecondStatus secondStatus}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySecondStatus(): this.type = js.native
    
    /**
      * @since 1.16.0
      *
      * Destroys all the statuses in the aggregation {@link #getStatuses statuses}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyStatuses(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:iconPress iconPress} event of this `sap.m.ObjectHeader`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachIconPress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ObjectHeaderIconPressEvent, Unit]
    ): this.type = js.native
    def detachIconPress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ObjectHeaderIconPressEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:introPress introPress} event of this `sap.m.ObjectHeader`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachIntroPress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ObjectHeaderIntroPressEvent, Unit]
    ): this.type = js.native
    def detachIntroPress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ObjectHeaderIntroPressEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:titlePress titlePress} event of this `sap.m.ObjectHeader`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachTitlePress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ObjectHeaderTitlePressEvent, Unit]
    ): this.type = js.native
    def detachTitlePress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ObjectHeaderTitlePressEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.16.0
      *
      * Detaches event handler `fnFunction` from the {@link #event:titleSelectorPress titleSelectorPress} event
      * of this `sap.m.ObjectHeader`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachTitleSelectorPress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ObjectHeaderTitleSelectorPressEvent, Unit]
    ): this.type = js.native
    def detachTitleSelectorPress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ObjectHeaderTitleSelectorPressEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:iconPress iconPress} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireIconPress(): this.type = js.native
    def fireIconPress(
      /**
      * Parameters to pass along with the event
      */
    mParameters: ObjectHeader$IconPressEventParameters
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:introPress introPress} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireIntroPress(): this.type = js.native
    def fireIntroPress(
      /**
      * Parameters to pass along with the event
      */
    mParameters: ObjectHeader$IntroPressEventParameters
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:titlePress titlePress} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireTitlePress(): this.type = js.native
    def fireTitlePress(
      /**
      * Parameters to pass along with the event
      */
    mParameters: ObjectHeader$TitlePressEventParameters
    ): this.type = js.native
    
    /**
      * @since 1.16.0
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:titleSelectorPress titleSelectorPress} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireTitleSelectorPress(): this.type = js.native
    def fireTitleSelectorPress(
      /**
      * Parameters to pass along with the event
      */
    mParameters: ObjectHeader$TitleSelectorPressEventParameters
    ): this.type = js.native
    
    /**
      * @since 1.38.0
      *
      * Gets content of aggregation {@link #getAdditionalNumbers additionalNumbers}.
      *
      * NOTE: Only applied if you set "responsive=false". Additional object numbers and units are managed in
      * this aggregation. The numbers are hidden on tablet and phone size screens. When only one number is provided,
      * it is rendered with additional separator from the main ObjectHeader number.
      */
    def getAdditionalNumbers(): js.Array[typings.openui5.sapMObjectNumberMod.default] = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaDescribedBy ariaDescribedBy}.
      */
    def getAriaDescribedBy(): js.Array[ID] = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Gets content of aggregation {@link #getAttributes attributes}.
      *
      * The list of Object Attributes
      */
    def getAttributes(): js.Array[typings.openui5.sapMObjectAttributeMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getBackgroundDesign backgroundDesign}.
      *
      * Determines the background color of the `ObjectHeader`.
      *
      * **Note:** The different types of `ObjectHeader` come with different default background:
      * 	 - non responsive - Transparent
      * 	 - responsive - Translucent
      * 	 - condensed - Solid
      *
      * @returns Value of property `backgroundDesign`
      */
    def getBackgroundDesign(): BackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getCondensed condensed}.
      *
      * `ObjectHeader` with title, one attribute, number, and number unit.
      *
      * **Note:** Only applied if the `responsive` property is set to `false`.
      *
      * Default value is `false`.
      *
      * @returns Value of property `condensed`
      */
    def getCondensed(): Boolean = js.native
    
    /**
      * @deprecated (since 1.16.0) - replaced by `statuses` aggregation
      *
      * Gets content of aggregation {@link #getFirstStatus firstStatus}.
      *
      * First status shown on the right side of the attributes above the second status. If it is not set the
      * first attribute will expand to take the entire row.
      */
    def getFirstStatus(): typings.openui5.sapMObjectStatusMod.default = js.native
    
    /**
      * @since 1.28
      *
      * Gets current value of property {@link #getFullScreenOptimized fullScreenOptimized}.
      *
      * Optimizes the display of the elements of the `ObjectHeader`.
      *
      * Set this property to `true` if your app uses a fullscreen layout (as opposed to a master-detail or other
      * split-screen layout).
      *
      * **Note**: Only applied if the `responsive` property is also set to `true`.
      *
      * If set to `true`, the following situations apply:
      * 	 - On desktop, 1-3 attributes/statuses - positioned as a third block on the right side of the Title/Number
      *     group
      * 	 - On desktop, 4+ attributes/statuses - 4 columns below the Title/Number
      * 	 - On tablet (portrait mode), always in 2 columns below the Title/Number
      * 	 - On tablet (landscape mode), 1-2 attributes/statuses - 2 columns below the Title/Number
      * 	 - On tablet (landscape mode), 3+ attributes/statuses - 3 columns below the Title/Number  On phone,
      *     the attributes and statuses are always positioned in 1 column below the Title/Number of the `ObjectHeader`.
      *
      * If set to `false`, the attributes and statuses are being positioned below the Title/Number of the `ObjectHeader`
      * in 2 or 3 columns depending on their number:
      * 	 - On desktop, 1-4 attributes/statuses - 2 columns
      * 	 - On desktop, 5+ attributes/statuses - 3 columns
      * 	 - On tablet, always in 2 columns
      *
      * Default value is `false`.
      *
      * @returns Value of property `fullScreenOptimized`
      */
    def getFullScreenOptimized(): Boolean = js.native
    
    /**
      * @since 1.21.1
      *
      * Gets content of aggregation {@link #getHeaderContainer headerContainer}.
      *
      * This aggregation takes only effect when you set "responsive" to true. It can either be filled with an
      * sap.m.IconTabBar or an sap.suite.ui.commons.HeaderContainer control. Overflow handling must be taken
      * care of by the inner control. If used with an IconTabBar control, only the header will be displayed inside
      * the object header, the content will be displayed below the ObjectHeader.
      */
    def getHeaderContainer(): ObjectHeaderContainer = js.native
    
    /**
      * Gets current value of property {@link #getIcon icon}.
      *
      * Defines the icon of the `ObjectHeader`.
      *
      * **Note:** Recursive resolution of binding expressions is not supported by the framework. It works only
      * in ObjectHeader, since it is a composite control and creates an Image control internally.
      *
      * @returns Value of property `icon`
      */
    def getIcon(): URI = js.native
    
    /**
      * Gets current value of property {@link #getIconActive iconActive}.
      *
      * Determines whether the `ObjectHeader` icon is clickable.
      *
      * @returns Value of property `iconActive`
      */
    def getIconActive(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getIconAlt iconAlt}.
      *
      * Determines the alternative text of the `ObjectHeader` icon. The text is displayed if the image for the
      * icon is not available, or cannot be displayed.
      *
      * **Note:** Provide an empty string value for the `iconAlt` property in case you want to use the icon for
      * decoration only.
      *
      * @returns Value of property `iconAlt`
      */
    def getIconAlt(): String = js.native
    
    /**
      * Gets current value of property {@link #getIconDensityAware iconDensityAware}.
      *
      * By default, this is set to `true` but then one or more requests are sent trying to get the density perfect
      * version of image if this version of image doesn't exist on the server.
      *
      * If bandwidth is the key for the application, set this value to `false`.
      *
      * Default value is `true`.
      *
      * @returns Value of property `iconDensityAware`
      */
    def getIconDensityAware(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getIconTooltip iconTooltip}.
      *
      * Determines the tooltip text of the `ObjectHeader` icon.
      *
      * @returns Value of property `iconTooltip`
      */
    def getIconTooltip(): String = js.native
    
    /**
      * @since 1.61
      *
      * Gets current value of property {@link #getImageShape imageShape}.
      *
      * Determines whether the picture should be displayed in a square or with a circle-shaped mask just like
      * in {@link sap.uxap.ObjectPageHeader}.
      *
      * **Note:** This property takes effect only on Images and it is ignored for Icons.
      *
      * Default value is `Square`.
      *
      * @returns Value of property `imageShape`
      */
    def getImageShape(): ObjectHeaderPictureShape | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ObjectHeaderPictureShape * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getIntro intro}.
      *
      * Determines the introductory text for the `ObjectHeader`.
      *
      * @returns Value of property `intro`
      */
    def getIntro(): String = js.native
    
    /**
      * Gets current value of property {@link #getIntroActive introActive}.
      *
      * Determines whether the introductory text of the `ObjectHeader` is clickable.
      *
      * @returns Value of property `introActive`
      */
    def getIntroActive(): Boolean = js.native
    
    /**
      * @since 1.28
      *
      * Gets current value of property {@link #getIntroHref introHref}.
      *
      * Determines the intro link target URI. Supports standard hyperlink behavior. If an action should be triggered,
      * this should not be set, but instead an event handler for the `introPress` event should be registered.
      *
      * @returns Value of property `introHref`
      */
    def getIntroHref(): URI = js.native
    
    /**
      * @since 1.28
      *
      * Gets current value of property {@link #getIntroTarget introTarget}.
      *
      * Determines the `target` attribute for the intro link. Options are `_self`, `_top`, `_blank`, `_parent`,
      * `_search`. Alternatively, a frame name can be entered.
      *
      * @returns Value of property `introTarget`
      */
    def getIntroTarget(): String = js.native
    
    /**
      * @since 1.28.0
      *
      * Gets current value of property {@link #getIntroTextDirection introTextDirection}.
      *
      * Specifies the intro text directionality with enumerated options. By default, the control inherits text
      * direction from the DOM.
      *
      * Default value is `Inherit`.
      *
      * @returns Value of property `introTextDirection`
      */
    def getIntroTextDirection(): TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) = js.native
    
    /**
      * @since 1.16.0
      * @deprecated (since 1.42.0) - replaced by `markers` aggregation. Add {@link sap.m.ObjectMarker} with type
      * `sap.m.ObjectMarkerType.Favorite`. You should use either this property or the `markers` aggregation,
      * using both may lead to unpredicted behavior.
      *
      * Gets current value of property {@link #getMarkFavorite markFavorite}.
      *
      * Sets the favorite state for the `ObjectHeader`. The `showMarkers` property must be set to `true` for
      * this property to take effect.
      *
      * Default value is `false`.
      *
      * @returns Value of property `markFavorite`
      */
    def getMarkFavorite(): Boolean = js.native
    
    /**
      * @since 1.16.0
      * @deprecated (since 1.42.0) - replaced by `markers` aggregation. Add {@link sap.m.ObjectMarker} with type
      * `sap.m.ObjectMarkerType.Flagged`. You should use either this property or the `markers` aggregation, using
      * both may lead to unpredicted behavior.
      *
      * Gets current value of property {@link #getMarkFlagged markFlagged}.
      *
      * Sets the flagged state for the `ObjectHeader`. The `showMarkers` property must be set to `true` for this
      * property to take effect.
      *
      * Default value is `false`.
      *
      * @returns Value of property `markFlagged`
      */
    def getMarkFlagged(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getMarkers markers}.
      *
      * List of markers (icon and/or text) that can be displayed for the `ObjectHeader`, such as favorite and
      * flagged.
      *
      *  **Note:** You should use either this aggregation or the already deprecated properties - `markFlagged`
      * and `markFavorite`. Using both can lead to unexpected results.
      */
    def getMarkers(): js.Array[typings.openui5.sapMObjectMarkerMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getNumber number}.
      *
      * Determines the displayed number of the `ObjectHeader` number field.
      *
      * @returns Value of property `number`
      */
    def getNumber(): String = js.native
    
    /**
      * @since 1.16.0
      *
      * Gets current value of property {@link #getNumberState numberState}.
      *
      * Determines the value state of the `number` and `numberUnit` properties.
      *
      * Default value is `None`.
      *
      * @returns Value of property `numberState`
      */
    def getNumberState(): ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) = js.native
    
    /**
      * @since 1.28.0
      *
      * Gets current value of property {@link #getNumberTextDirection numberTextDirection}.
      *
      * Specifies the number and unit text directionality with enumerated options. By default, the control inherits
      * text direction from the DOM.
      *
      * Default value is `Inherit`.
      *
      * @returns Value of property `numberTextDirection`
      */
    def getNumberTextDirection(): TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getNumberUnit numberUnit}.
      *
      * Determines the units qualifier of the `ObjectHeader` number.
      *
      * **Note:** The value of the `numberUnit` is not displayed if the number property is set to `null`.
      *
      * @returns Value of property `numberUnit`
      */
    def getNumberUnit(): String = js.native
    
    /**
      * @since 1.21.1
      *
      * Gets current value of property {@link #getResponsive responsive}.
      *
      * Determines whether the `ObjectHeader` is rendered with a different design that reacts responsively to
      * the screen sizes.
      *
      * When the `responsive` property is set to `true`, the following behavior specifics for the control exist:
      *
      * 	 - If an image (or an icon font) is set to the `icon` property, it is hidden in portrait mode on phone.
      *
      * 	 - The title is truncated to 80 characters if longer. For portrait mode on phone, the title is truncated
      *     to 50 characters.
      *
      * Default value is `false`.
      *
      * @returns Value of property `responsive`
      */
    def getResponsive(): Boolean = js.native
    
    /**
      * @deprecated (since 1.16.0) - replaced by `statuses` aggregation
      *
      * Gets content of aggregation {@link #getSecondStatus secondStatus}.
      *
      * Second status shown on the right side of the attributes below the first status. If it is not set the
      * second attribute will expand to take the entire row.
      */
    def getSecondStatus(): typings.openui5.sapMObjectStatusMod.default = js.native
    
    /**
      * @since 1.16.0
      * @deprecated (since 1.42.0) - replaced by `markers` aggregationv. This property is valid only if you are
      * using the already deprecated properties - `markFlagged` and `markFavorite`. If you are using `markers`,
      * the visibility of the markers depends on what is set in the aggregation itself.
      *
      * Gets current value of property {@link #getShowMarkers showMarkers}.
      *
      * If set to `true`, the `ObjectHeader` can be marked with icons such as favorite and flag.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showMarkers`
      */
    def getShowMarkers(): Boolean = js.native
    
    /**
      * @since 1.16.0
      *
      * Gets current value of property {@link #getShowTitleSelector showTitleSelector}.
      *
      * Determines whether the selector arrow icon/image is displayed and can be pressed.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showTitleSelector`
      */
    def getShowTitleSelector(): Boolean = js.native
    
    /**
      * @since 1.16.0
      *
      * Gets content of aggregation {@link #getStatuses statuses}.
      *
      * The list of Object sap.ui.core.Control. It will only allow sap.m.ObjectStatus and sap.m.ProgressIndicator
      * controls.
      */
    def getStatuses(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * Determines the title of the `ObjectHeader`.
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
      * Gets current value of property {@link #getTitleActive titleActive}.
      *
      * Determines whether the title of the `ObjectHeader` is clickable and is set only if a title is provided.
      *
      * @returns Value of property `titleActive`
      */
    def getTitleActive(): Boolean = js.native
    
    /**
      * @since 1.28
      *
      * Gets current value of property {@link #getTitleHref titleHref}.
      *
      * Defines the title link target URI. Supports standard hyperlink behavior.
      *
      * **Note:** If an action should be triggered, this property should not be set, but instead an event handler
      * for the `titlePress` event should be registered.
      *
      * @returns Value of property `titleHref`
      */
    def getTitleHref(): URI = js.native
    
    /**
      * Gets current value of property {@link #getTitleLevel titleLevel}.
      *
      * Defines the semantic level of the title.
      *
      * This information is used by assistive technologies, such as screen readers to create a hierarchical site
      * map for faster navigation. Depending on this setting an HTML h1-h6 element is used.
      *
      * Default value is `H1`.
      *
      * @returns Value of property `titleLevel`
      */
    def getTitleLevel(): TitleLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String) = js.native
    
    /**
      * @since 1.30.0
      *
      * Gets current value of property {@link #getTitleSelectorTooltip titleSelectorTooltip}.
      *
      * Determines a custom text for the tooltip of the select title arrow. If not set, a default text of the
      * tooltip will be displayed.
      *
      * Default value is `"Options"`.
      *
      * @returns Value of property `titleSelectorTooltip`
      */
    def getTitleSelectorTooltip(): String = js.native
    
    /**
      * @since 1.28
      *
      * Gets current value of property {@link #getTitleTarget titleTarget}.
      *
      * Determines the `target` attribute for the title link. Options are `_self`, `_top`, `_blank`, `_parent`,
      * `_search`. Alternatively, a frame name can be entered.
      *
      * @returns Value of property `titleTarget`
      */
    def getTitleTarget(): String = js.native
    
    /**
      * @since 1.28.0
      *
      * Gets current value of property {@link #getTitleTextDirection titleTextDirection}.
      *
      * Specifies the title text directionality with enumerated options. By default, the control inherits text
      * direction from the DOM.
      *
      * Default value is `Inherit`.
      *
      * @returns Value of property `titleTextDirection`
      */
    def getTitleTextDirection(): TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) = js.native
    
    /**
      * @since 1.38.0
      *
      * Checks for the provided `sap.m.ObjectNumber` in the aggregation {@link #getAdditionalNumbers additionalNumbers}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfAdditionalNumber(
      /**
      * The additionalNumber whose index is looked for
      */
    oAdditionalNumber: typings.openui5.sapMObjectNumberMod.default
    ): int = js.native
    
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
      * @since 1.16.0
      *
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getStatuses statuses}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfStatus(
      /**
      * The status whose index is looked for
      */
    oStatus: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * @since 1.38.0
      *
      * Inserts a additionalNumber into the aggregation {@link #getAdditionalNumbers additionalNumbers}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertAdditionalNumber(
      /**
      * The additionalNumber to insert; if empty, nothing is inserted
      */
    oAdditionalNumber: typings.openui5.sapMObjectNumberMod.default,
      /**
      * The `0`-based index the additionalNumber should be inserted at; for a negative value of `iIndex`, the
      * additionalNumber is inserted at position 0; for a value greater than the current size of the aggregation,
      * the additionalNumber is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
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
      * @since 1.16.0
      *
      * Inserts a status into the aggregation {@link #getStatuses statuses}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertStatus(
      /**
      * The status to insert; if empty, nothing is inserted
      */
    oStatus: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the status should be inserted at; for a negative value of `iIndex`, the status is
      * inserted at position 0; for a value greater than the current size of the aggregation, the status is inserted
      * at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    def removeAdditionalNumber(/**
      * The additionalNumber to remove or its index or id
      */
    vAdditionalNumber: String): typings.openui5.sapMObjectNumberMod.default | Null = js.native
    /**
      * @since 1.38.0
      *
      * Removes a additionalNumber from the aggregation {@link #getAdditionalNumbers additionalNumbers}.
      *
      * @returns The removed additionalNumber or `null`
      */
    def removeAdditionalNumber(/**
      * The additionalNumber to remove or its index or id
      */
    vAdditionalNumber: int): typings.openui5.sapMObjectNumberMod.default | Null = js.native
    def removeAdditionalNumber(
      /**
      * The additionalNumber to remove or its index or id
      */
    vAdditionalNumber: typings.openui5.sapMObjectNumberMod.default
    ): typings.openui5.sapMObjectNumberMod.default | Null = js.native
    
    /**
      * @since 1.38.0
      *
      * Removes all the controls from the aggregation {@link #getAdditionalNumbers additionalNumbers}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAdditionalNumbers(): js.Array[typings.openui5.sapMObjectNumberMod.default] = js.native
    
    /**
      * Removes all the controls in the association named {@link #getAriaDescribedBy ariaDescribedBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaDescribedBy(): js.Array[ID] = js.native
    
    /**
      * Removes all the controls in the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaLabelledBy(): js.Array[ID] = js.native
    
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
    
    /**
      * @since 1.16.0
      *
      * Removes all the controls from the aggregation {@link #getStatuses statuses}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllStatuses(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Removes an ariaDescribedBy from the association named {@link #getAriaDescribedBy ariaDescribedBy}.
      *
      * @returns The removed ariaDescribedBy or `null`
      */
    def removeAriaDescribedBy(/**
      * The ariaDescribedBy to be removed or its index or ID
      */
    vAriaDescribedBy: int): ID | Null = js.native
    def removeAriaDescribedBy(
      /**
      * The ariaDescribedBy to be removed or its index or ID
      */
    vAriaDescribedBy: typings.openui5.sapUiCoreControlMod.default
    ): ID | Null = js.native
    def removeAriaDescribedBy(/**
      * The ariaDescribedBy to be removed or its index or ID
      */
    vAriaDescribedBy: ID): ID | Null = js.native
    
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
    
    def removeStatus(/**
      * The status to remove or its index or id
      */
    vStatus: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * @since 1.16.0
      *
      * Removes a status from the aggregation {@link #getStatuses statuses}.
      *
      * @returns The removed status or `null`
      */
    def removeStatus(/**
      * The status to remove or its index or id
      */
    vStatus: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeStatus(
      /**
      * The status to remove or its index or id
      */
    vStatus: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    def setBackgroundDesign(
      /**
      * New value for property `backgroundDesign`
      */
    sBackgroundDesign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String
    ): this.type = js.native
    /**
      * Sets a new value for property {@link #getBackgroundDesign backgroundDesign}.
      *
      * Determines the background color of the `ObjectHeader`.
      *
      * **Note:** The different types of `ObjectHeader` come with different default background:
      * 	 - non responsive - Transparent
      * 	 - responsive - Translucent
      * 	 - condensed - Solid
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBackgroundDesign(/**
      * New value for property `backgroundDesign`
      */
    sBackgroundDesign: BackgroundDesign): this.type = js.native
    
    /**
      * Set the condensed flag
      *
      * @returns this pointer for chaining
      */
    def setCondensed(/**
      * the new value
      */
    bCondensed: Boolean): this.type = js.native
    
    /**
      * @deprecated (since 1.16.0) - replaced by `statuses` aggregation
      *
      * Sets the aggregated {@link #getFirstStatus firstStatus}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFirstStatus(/**
      * The firstStatus to set
      */
    oFirstStatus: typings.openui5.sapMObjectStatusMod.default): this.type = js.native
    
    /**
      * @since 1.28
      *
      * Sets a new value for property {@link #getFullScreenOptimized fullScreenOptimized}.
      *
      * Optimizes the display of the elements of the `ObjectHeader`.
      *
      * Set this property to `true` if your app uses a fullscreen layout (as opposed to a master-detail or other
      * split-screen layout).
      *
      * **Note**: Only applied if the `responsive` property is also set to `true`.
      *
      * If set to `true`, the following situations apply:
      * 	 - On desktop, 1-3 attributes/statuses - positioned as a third block on the right side of the Title/Number
      *     group
      * 	 - On desktop, 4+ attributes/statuses - 4 columns below the Title/Number
      * 	 - On tablet (portrait mode), always in 2 columns below the Title/Number
      * 	 - On tablet (landscape mode), 1-2 attributes/statuses - 2 columns below the Title/Number
      * 	 - On tablet (landscape mode), 3+ attributes/statuses - 3 columns below the Title/Number  On phone,
      *     the attributes and statuses are always positioned in 1 column below the Title/Number of the `ObjectHeader`.
      *
      * If set to `false`, the attributes and statuses are being positioned below the Title/Number of the `ObjectHeader`
      * in 2 or 3 columns depending on their number:
      * 	 - On desktop, 1-4 attributes/statuses - 2 columns
      * 	 - On desktop, 5+ attributes/statuses - 3 columns
      * 	 - On tablet, always in 2 columns
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFullScreenOptimized(): this.type = js.native
    def setFullScreenOptimized(/**
      * New value for property `fullScreenOptimized`
      */
    bFullScreenOptimized: Boolean): this.type = js.native
    
    /**
      * @since 1.21.1
      *
      * Sets the aggregated {@link #getHeaderContainer headerContainer}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeaderContainer(/**
      * The headerContainer to set
      */
    oHeaderContainer: ObjectHeaderContainer): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIcon icon}.
      *
      * Defines the icon of the `ObjectHeader`.
      *
      * **Note:** Recursive resolution of binding expressions is not supported by the framework. It works only
      * in ObjectHeader, since it is a composite control and creates an Image control internally.
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
      * Sets a new value for property {@link #getIconActive iconActive}.
      *
      * Determines whether the `ObjectHeader` icon is clickable.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIconActive(): this.type = js.native
    def setIconActive(/**
      * New value for property `iconActive`
      */
    bIconActive: Boolean): this.type = js.native
    
    /**
      * Sets the alternative text of the `ObjectHeader` icon.
      *
      * @returns this pointer for chaining
      */
    def setIconAlt(/**
      * the alternative icon text
      */
    sIconAlt: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIconDensityAware iconDensityAware}.
      *
      * By default, this is set to `true` but then one or more requests are sent trying to get the density perfect
      * version of image if this version of image doesn't exist on the server.
      *
      * If bandwidth is the key for the application, set this value to `false`.
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
      * Sets a new value for property {@link #getIconTooltip iconTooltip}.
      *
      * Determines the tooltip text of the `ObjectHeader` icon.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIconTooltip(): this.type = js.native
    def setIconTooltip(/**
      * New value for property `iconTooltip`
      */
    sIconTooltip: String): this.type = js.native
    
    /**
      * @since 1.61
      *
      * Sets a new value for property {@link #getImageShape imageShape}.
      *
      * Determines whether the picture should be displayed in a square or with a circle-shaped mask just like
      * in {@link sap.uxap.ObjectPageHeader}.
      *
      * **Note:** This property takes effect only on Images and it is ignored for Icons.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Square`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setImageShape(): this.type = js.native
    def setImageShape(
      /**
      * New value for property `imageShape`
      */
    sImageShape: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ObjectHeaderPictureShape * / any */ String
    ): this.type = js.native
    def setImageShape(/**
      * New value for property `imageShape`
      */
    sImageShape: ObjectHeaderPictureShape): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIntro intro}.
      *
      * Determines the introductory text for the `ObjectHeader`.
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
      * Sets a new value for property {@link #getIntroActive introActive}.
      *
      * Determines whether the introductory text of the `ObjectHeader` is clickable.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIntroActive(): this.type = js.native
    def setIntroActive(/**
      * New value for property `introActive`
      */
    bIntroActive: Boolean): this.type = js.native
    
    /**
      * @since 1.28
      *
      * Sets a new value for property {@link #getIntroHref introHref}.
      *
      * Determines the intro link target URI. Supports standard hyperlink behavior. If an action should be triggered,
      * this should not be set, but instead an event handler for the `introPress` event should be registered.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIntroHref(): this.type = js.native
    def setIntroHref(/**
      * New value for property `introHref`
      */
    sIntroHref: URI): this.type = js.native
    
    /**
      * @since 1.28
      *
      * Sets a new value for property {@link #getIntroTarget introTarget}.
      *
      * Determines the `target` attribute for the intro link. Options are `_self`, `_top`, `_blank`, `_parent`,
      * `_search`. Alternatively, a frame name can be entered.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIntroTarget(): this.type = js.native
    def setIntroTarget(/**
      * New value for property `introTarget`
      */
    sIntroTarget: String): this.type = js.native
    
    /**
      * @since 1.28.0
      *
      * Sets a new value for property {@link #getIntroTextDirection introTextDirection}.
      *
      * Specifies the intro text directionality with enumerated options. By default, the control inherits text
      * direction from the DOM.
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
      * visibility of the marker
      */
    bMarked: Boolean): this.type = js.native
    
    /**
      * Sets the visibility value of the Flagged marker.
      *
      * @returns this pointer for chaining
      */
    def setMarkFlagged(/**
      * visibility of the marker
      */
    bMarked: Boolean): this.type = js.native
    
    /**
      * Set the number value to the internal aggregation
      *
      * @returns this pointer for chaining
      */
    def setNumber(/**
      * the new value
      */
    sNumber: String): this.type = js.native
    
    def setNumberState(
      /**
      * the new value
      */
    sState: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String
    ): this.type = js.native
    /**
      * Set the number state to the internal aggregation
      *
      * @returns this pointer for chaining
      */
    def setNumberState(/**
      * the new value
      */
    sState: ValueState): this.type = js.native
    
    /**
      * @since 1.28.0
      *
      * Sets a new value for property {@link #getNumberTextDirection numberTextDirection}.
      *
      * Specifies the number and unit text directionality with enumerated options. By default, the control inherits
      * text direction from the DOM.
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
      * Set the number unit to the internal aggregation
      *
      * @returns this pointer for chaining
      */
    def setNumberUnit(/**
      * the new value
      */
    sUnit: String): this.type = js.native
    
    /**
      * @since 1.21.1
      *
      * Sets a new value for property {@link #getResponsive responsive}.
      *
      * Determines whether the `ObjectHeader` is rendered with a different design that reacts responsively to
      * the screen sizes.
      *
      * When the `responsive` property is set to `true`, the following behavior specifics for the control exist:
      *
      * 	 - If an image (or an icon font) is set to the `icon` property, it is hidden in portrait mode on phone.
      *
      * 	 - The title is truncated to 80 characters if longer. For portrait mode on phone, the title is truncated
      *     to 50 characters.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setResponsive(): this.type = js.native
    def setResponsive(/**
      * New value for property `responsive`
      */
    bResponsive: Boolean): this.type = js.native
    
    /**
      * @deprecated (since 1.16.0) - replaced by `statuses` aggregation
      *
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
      * visibility of all markers
      */
    bMarked: Boolean): this.type = js.native
    
    /**
      * @since 1.16.0
      *
      * Sets a new value for property {@link #getShowTitleSelector showTitleSelector}.
      *
      * Determines whether the selector arrow icon/image is displayed and can be pressed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowTitleSelector(): this.type = js.native
    def setShowTitleSelector(/**
      * New value for property `showTitleSelector`
      */
    bShowTitleSelector: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitle title}.
      *
      * Determines the title of the `ObjectHeader`.
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
      * Sets a new value for property {@link #getTitleActive titleActive}.
      *
      * Determines whether the title of the `ObjectHeader` is clickable and is set only if a title is provided.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitleActive(): this.type = js.native
    def setTitleActive(/**
      * New value for property `titleActive`
      */
    bTitleActive: Boolean): this.type = js.native
    
    /**
      * @since 1.28
      *
      * Sets a new value for property {@link #getTitleHref titleHref}.
      *
      * Defines the title link target URI. Supports standard hyperlink behavior.
      *
      * **Note:** If an action should be triggered, this property should not be set, but instead an event handler
      * for the `titlePress` event should be registered.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitleHref(): this.type = js.native
    def setTitleHref(/**
      * New value for property `titleHref`
      */
    sTitleHref: URI): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitleLevel titleLevel}.
      *
      * Defines the semantic level of the title.
      *
      * This information is used by assistive technologies, such as screen readers to create a hierarchical site
      * map for faster navigation. Depending on this setting an HTML h1-h6 element is used.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `H1`.
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
    
    /**
      * Sets the new text for the tooltip of the select title arrow to the internal aggregation
      *
      * @returns this pointer for chaining
      */
    def setTitleSelectorTooltip(/**
      * the tooltip of the title selector
      */
    sTooltip: String): this.type = js.native
    
    /**
      * @since 1.28
      *
      * Sets a new value for property {@link #getTitleTarget titleTarget}.
      *
      * Determines the `target` attribute for the title link. Options are `_self`, `_top`, `_blank`, `_parent`,
      * `_search`. Alternatively, a frame name can be entered.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitleTarget(): this.type = js.native
    def setTitleTarget(/**
      * New value for property `titleTarget`
      */
    sTitleTarget: String): this.type = js.native
    
    /**
      * @since 1.28.0
      *
      * Sets a new value for property {@link #getTitleTextDirection titleTextDirection}.
      *
      * Specifies the title text directionality with enumerated options. By default, the control inherits text
      * direction from the DOM.
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
  
  trait ObjectHeader$IconPressEventParameters extends StObject {
    
    /**
      * Dom reference of the object header' icon to be used for positioning.
      */
    var domRef: js.UndefOr[js.Object] = js.undefined
  }
  object ObjectHeader$IconPressEventParameters {
    
    inline def apply(): ObjectHeader$IconPressEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObjectHeader$IconPressEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ObjectHeader$IconPressEventParameters] (val x: Self) extends AnyVal {
      
      inline def setDomRef(value: js.Object): Self = StObject.set(x, "domRef", value.asInstanceOf[js.Any])
      
      inline def setDomRefUndefined: Self = StObject.set(x, "domRef", js.undefined)
    }
  }
  
  trait ObjectHeader$IntroPressEventParameters extends StObject {
    
    /**
      * Dom reference of the object header' intro to be used for positioning.
      */
    var domRef: js.UndefOr[js.Object] = js.undefined
  }
  object ObjectHeader$IntroPressEventParameters {
    
    inline def apply(): ObjectHeader$IntroPressEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObjectHeader$IntroPressEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ObjectHeader$IntroPressEventParameters] (val x: Self) extends AnyVal {
      
      inline def setDomRef(value: js.Object): Self = StObject.set(x, "domRef", value.asInstanceOf[js.Any])
      
      inline def setDomRefUndefined: Self = StObject.set(x, "domRef", js.undefined)
    }
  }
  
  trait ObjectHeader$TitlePressEventParameters extends StObject {
    
    /**
      * Dom reference of the object header' title to be used for positioning.
      */
    var domRef: js.UndefOr[js.Object] = js.undefined
  }
  object ObjectHeader$TitlePressEventParameters {
    
    inline def apply(): ObjectHeader$TitlePressEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObjectHeader$TitlePressEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ObjectHeader$TitlePressEventParameters] (val x: Self) extends AnyVal {
      
      inline def setDomRef(value: js.Object): Self = StObject.set(x, "domRef", value.asInstanceOf[js.Any])
      
      inline def setDomRefUndefined: Self = StObject.set(x, "domRef", js.undefined)
    }
  }
  
  trait ObjectHeader$TitleSelectorPressEventParameters extends StObject {
    
    /**
      * Dom reference of the object header' titleArrow to be used for positioning.
      */
    var domRef: js.UndefOr[js.Object] = js.undefined
  }
  object ObjectHeader$TitleSelectorPressEventParameters {
    
    inline def apply(): ObjectHeader$TitleSelectorPressEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObjectHeader$TitleSelectorPressEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ObjectHeader$TitleSelectorPressEventParameters] (val x: Self) extends AnyVal {
      
      inline def setDomRef(value: js.Object): Self = StObject.set(x, "domRef", value.asInstanceOf[js.Any])
      
      inline def setDomRefUndefined: Self = StObject.set(x, "domRef", js.undefined)
    }
  }
  
  type ObjectHeaderIconPressEvent = typings.openui5.sapUiBaseEventMod.default[ObjectHeader$IconPressEventParameters]
  
  type ObjectHeaderIconPressEventParameters = ObjectHeader$IconPressEventParameters
  
  type ObjectHeaderIntroPressEvent = typings.openui5.sapUiBaseEventMod.default[ObjectHeader$IntroPressEventParameters]
  
  type ObjectHeaderIntroPressEventParameters = ObjectHeader$IntroPressEventParameters
  
  trait ObjectHeaderSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @since 1.38.0
      *
      * NOTE: Only applied if you set "responsive=false". Additional object numbers and units are managed in
      * this aggregation. The numbers are hidden on tablet and phone size screens. When only one number is provided,
      * it is rendered with additional separator from the main ObjectHeader number.
      */
    var additionalNumbers: js.UndefOr[
        js.Array[typings.openui5.sapMObjectNumberMod.default] | typings.openui5.sapMObjectNumberMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Association to controls / ids which describe this control (see WAI-ARIA attribute aria-describedby).
      */
    var ariaDescribedBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * Association to controls / ids which label this control (see WAI-ARIA attribute aria-labelledby).
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * The list of Object Attributes
      */
    var attributes: js.UndefOr[
        js.Array[typings.openui5.sapMObjectAttributeMod.default] | typings.openui5.sapMObjectAttributeMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the background color of the `ObjectHeader`.
      *
      * **Note:** The different types of `ObjectHeader` come with different default background:
      * 	 - non responsive - Transparent
      * 	 - responsive - Translucent
      * 	 - condensed - Solid
      */
    var backgroundDesign: js.UndefOr[
        BackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * `ObjectHeader` with title, one attribute, number, and number unit.
      *
      * **Note:** Only applied if the `responsive` property is set to `false`.
      */
    var condensed: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @deprecated (since 1.16.0) - replaced by `statuses` aggregation
      *
      * First status shown on the right side of the attributes above the second status. If it is not set the
      * first attribute will expand to take the entire row.
      */
    var firstStatus: js.UndefOr[typings.openui5.sapMObjectStatusMod.default] = js.undefined
    
    /**
      * @since 1.28
      *
      * Optimizes the display of the elements of the `ObjectHeader`.
      *
      * Set this property to `true` if your app uses a fullscreen layout (as opposed to a master-detail or other
      * split-screen layout).
      *
      * **Note**: Only applied if the `responsive` property is also set to `true`.
      *
      * If set to `true`, the following situations apply:
      * 	 - On desktop, 1-3 attributes/statuses - positioned as a third block on the right side of the Title/Number
      *     group
      * 	 - On desktop, 4+ attributes/statuses - 4 columns below the Title/Number
      * 	 - On tablet (portrait mode), always in 2 columns below the Title/Number
      * 	 - On tablet (landscape mode), 1-2 attributes/statuses - 2 columns below the Title/Number
      * 	 - On tablet (landscape mode), 3+ attributes/statuses - 3 columns below the Title/Number  On phone,
      *     the attributes and statuses are always positioned in 1 column below the Title/Number of the `ObjectHeader`.
      *
      * If set to `false`, the attributes and statuses are being positioned below the Title/Number of the `ObjectHeader`
      * in 2 or 3 columns depending on their number:
      * 	 - On desktop, 1-4 attributes/statuses - 2 columns
      * 	 - On desktop, 5+ attributes/statuses - 3 columns
      * 	 - On tablet, always in 2 columns
      */
    var fullScreenOptimized: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.21.1
      *
      * This aggregation takes only effect when you set "responsive" to true. It can either be filled with an
      * sap.m.IconTabBar or an sap.suite.ui.commons.HeaderContainer control. Overflow handling must be taken
      * care of by the inner control. If used with an IconTabBar control, only the header will be displayed inside
      * the object header, the content will be displayed below the ObjectHeader.
      */
    var headerContainer: js.UndefOr[ObjectHeaderContainer] = js.undefined
    
    /**
      * Defines the icon of the `ObjectHeader`.
      *
      * **Note:** Recursive resolution of binding expressions is not supported by the framework. It works only
      * in ObjectHeader, since it is a composite control and creates an Image control internally.
      */
    var icon: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Determines whether the `ObjectHeader` icon is clickable.
      */
    var iconActive: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the alternative text of the `ObjectHeader` icon. The text is displayed if the image for the
      * icon is not available, or cannot be displayed.
      *
      * **Note:** Provide an empty string value for the `iconAlt` property in case you want to use the icon for
      * decoration only.
      */
    var iconAlt: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * By default, this is set to `true` but then one or more requests are sent trying to get the density perfect
      * version of image if this version of image doesn't exist on the server.
      *
      * If bandwidth is the key for the application, set this value to `false`.
      */
    var iconDensityAware: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Event is fired when the title icon is active and the user taps/clicks on it
      */
    var iconPress: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ObjectHeader$IconPressEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Determines the tooltip text of the `ObjectHeader` icon.
      */
    var iconTooltip: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @since 1.61
      *
      * Determines whether the picture should be displayed in a square or with a circle-shaped mask just like
      * in {@link sap.uxap.ObjectPageHeader}.
      *
      * **Note:** This property takes effect only on Images and it is ignored for Icons.
      */
    var imageShape: js.UndefOr[
        ObjectHeaderPictureShape | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ObjectHeaderPictureShape * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Determines the introductory text for the `ObjectHeader`.
      */
    var intro: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Determines whether the introductory text of the `ObjectHeader` is clickable.
      */
    var introActive: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.28
      *
      * Determines the intro link target URI. Supports standard hyperlink behavior. If an action should be triggered,
      * this should not be set, but instead an event handler for the `introPress` event should be registered.
      */
    var introHref: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Event is fired when the intro is active and the user taps/clicks on it
      */
    var introPress: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ObjectHeader$IntroPressEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * @since 1.28
      *
      * Determines the `target` attribute for the intro link. Options are `_self`, `_top`, `_blank`, `_parent`,
      * `_search`. Alternatively, a frame name can be entered.
      */
    var introTarget: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @since 1.28.0
      *
      * Specifies the intro text directionality with enumerated options. By default, the control inherits text
      * direction from the DOM.
      */
    var introTextDirection: js.UndefOr[
        TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @since 1.16.0
      * @deprecated (since 1.42.0) - replaced by `markers` aggregation. Add {@link sap.m.ObjectMarker} with type
      * `sap.m.ObjectMarkerType.Favorite`. You should use either this property or the `markers` aggregation,
      * using both may lead to unpredicted behavior.
      *
      * Sets the favorite state for the `ObjectHeader`. The `showMarkers` property must be set to `true` for
      * this property to take effect.
      */
    var markFavorite: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.16.0
      * @deprecated (since 1.42.0) - replaced by `markers` aggregation. Add {@link sap.m.ObjectMarker} with type
      * `sap.m.ObjectMarkerType.Flagged`. You should use either this property or the `markers` aggregation, using
      * both may lead to unpredicted behavior.
      *
      * Sets the flagged state for the `ObjectHeader`. The `showMarkers` property must be set to `true` for this
      * property to take effect.
      */
    var markFlagged: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * List of markers (icon and/or text) that can be displayed for the `ObjectHeader`, such as favorite and
      * flagged.
      *
      *  **Note:** You should use either this aggregation or the already deprecated properties - `markFlagged`
      * and `markFavorite`. Using both can lead to unexpected results.
      */
    var markers: js.UndefOr[
        js.Array[typings.openui5.sapMObjectMarkerMod.default] | typings.openui5.sapMObjectMarkerMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the displayed number of the `ObjectHeader` number field.
      */
    var number: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @since 1.16.0
      *
      * Determines the value state of the `number` and `numberUnit` properties.
      */
    var numberState: js.UndefOr[
        ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @since 1.28.0
      *
      * Specifies the number and unit text directionality with enumerated options. By default, the control inherits
      * text direction from the DOM.
      */
    var numberTextDirection: js.UndefOr[
        TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Determines the units qualifier of the `ObjectHeader` number.
      *
      * **Note:** The value of the `numberUnit` is not displayed if the number property is set to `null`.
      */
    var numberUnit: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @since 1.21.1
      *
      * Determines whether the `ObjectHeader` is rendered with a different design that reacts responsively to
      * the screen sizes.
      *
      * When the `responsive` property is set to `true`, the following behavior specifics for the control exist:
      *
      * 	 - If an image (or an icon font) is set to the `icon` property, it is hidden in portrait mode on phone.
      *
      * 	 - The title is truncated to 80 characters if longer. For portrait mode on phone, the title is truncated
      *     to 50 characters.
      */
    var responsive: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @deprecated (since 1.16.0) - replaced by `statuses` aggregation
      *
      * Second status shown on the right side of the attributes below the first status. If it is not set the
      * second attribute will expand to take the entire row.
      */
    var secondStatus: js.UndefOr[typings.openui5.sapMObjectStatusMod.default] = js.undefined
    
    /**
      * @since 1.16.0
      * @deprecated (since 1.42.0) - replaced by `markers` aggregationv. This property is valid only if you are
      * using the already deprecated properties - `markFlagged` and `markFavorite`. If you are using `markers`,
      * the visibility of the markers depends on what is set in the aggregation itself.
      *
      * If set to `true`, the `ObjectHeader` can be marked with icons such as favorite and flag.
      */
    var showMarkers: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.16.0
      *
      * Determines whether the selector arrow icon/image is displayed and can be pressed.
      */
    var showTitleSelector: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.16.0
      *
      * The list of Object sap.ui.core.Control. It will only allow sap.m.ObjectStatus and sap.m.ProgressIndicator
      * controls.
      */
    var statuses: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the title of the `ObjectHeader`.
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Determines whether the title of the `ObjectHeader` is clickable and is set only if a title is provided.
      */
    var titleActive: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.28
      *
      * Defines the title link target URI. Supports standard hyperlink behavior.
      *
      * **Note:** If an action should be triggered, this property should not be set, but instead an event handler
      * for the `titlePress` event should be registered.
      */
    var titleHref: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Defines the semantic level of the title.
      *
      * This information is used by assistive technologies, such as screen readers to create a hierarchical site
      * map for faster navigation. Depending on this setting an HTML h1-h6 element is used.
      */
    var titleLevel: js.UndefOr[
        TitleLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Event is fired when the title is active and the user taps/clicks on it
      */
    var titlePress: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ObjectHeader$TitlePressEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * @since 1.16.0
      *
      * Event is fired when the object header title selector (down-arrow) is pressed
      */
    var titleSelectorPress: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ObjectHeader$TitleSelectorPressEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * @since 1.30.0
      *
      * Determines a custom text for the tooltip of the select title arrow. If not set, a default text of the
      * tooltip will be displayed.
      */
    var titleSelectorTooltip: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @since 1.28
      *
      * Determines the `target` attribute for the title link. Options are `_self`, `_top`, `_blank`, `_parent`,
      * `_search`. Alternatively, a frame name can be entered.
      */
    var titleTarget: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @since 1.28.0
      *
      * Specifies the title text directionality with enumerated options. By default, the control inherits text
      * direction from the DOM.
      */
    var titleTextDirection: js.UndefOr[
        TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object ObjectHeaderSettings {
    
    inline def apply(): ObjectHeaderSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObjectHeaderSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ObjectHeaderSettings] (val x: Self) extends AnyVal {
      
      inline def setAdditionalNumbers(
        value: js.Array[typings.openui5.sapMObjectNumberMod.default] | typings.openui5.sapMObjectNumberMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "additionalNumbers", value.asInstanceOf[js.Any])
      
      inline def setAdditionalNumbersUndefined: Self = StObject.set(x, "additionalNumbers", js.undefined)
      
      inline def setAdditionalNumbersVarargs(value: typings.openui5.sapMObjectNumberMod.default*): Self = StObject.set(x, "additionalNumbers", js.Array(value*))
      
      inline def setAriaDescribedBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAriaDescribedByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaDescribedBy", js.Array(value*))
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setAttributes(
        value: js.Array[typings.openui5.sapMObjectAttributeMod.default] | typings.openui5.sapMObjectAttributeMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setAttributesVarargs(value: typings.openui5.sapMObjectAttributeMod.default*): Self = StObject.set(x, "attributes", js.Array(value*))
      
      inline def setBackgroundDesign(
        value: BackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "backgroundDesign", value.asInstanceOf[js.Any])
      
      inline def setBackgroundDesignUndefined: Self = StObject.set(x, "backgroundDesign", js.undefined)
      
      inline def setCondensed(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "condensed", value.asInstanceOf[js.Any])
      
      inline def setCondensedUndefined: Self = StObject.set(x, "condensed", js.undefined)
      
      inline def setFirstStatus(value: typings.openui5.sapMObjectStatusMod.default): Self = StObject.set(x, "firstStatus", value.asInstanceOf[js.Any])
      
      inline def setFirstStatusUndefined: Self = StObject.set(x, "firstStatus", js.undefined)
      
      inline def setFullScreenOptimized(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "fullScreenOptimized", value.asInstanceOf[js.Any])
      
      inline def setFullScreenOptimizedUndefined: Self = StObject.set(x, "fullScreenOptimized", js.undefined)
      
      inline def setHeaderContainer(value: ObjectHeaderContainer): Self = StObject.set(x, "headerContainer", value.asInstanceOf[js.Any])
      
      inline def setHeaderContainerUndefined: Self = StObject.set(x, "headerContainer", js.undefined)
      
      inline def setIcon(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconActive(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "iconActive", value.asInstanceOf[js.Any])
      
      inline def setIconActiveUndefined: Self = StObject.set(x, "iconActive", js.undefined)
      
      inline def setIconAlt(value: String | PropertyBindingInfo): Self = StObject.set(x, "iconAlt", value.asInstanceOf[js.Any])
      
      inline def setIconAltUndefined: Self = StObject.set(x, "iconAlt", js.undefined)
      
      inline def setIconDensityAware(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "iconDensityAware", value.asInstanceOf[js.Any])
      
      inline def setIconDensityAwareUndefined: Self = StObject.set(x, "iconDensityAware", js.undefined)
      
      inline def setIconPress(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ObjectHeader$IconPressEventParameters] => Unit
      ): Self = StObject.set(x, "iconPress", js.Any.fromFunction1(value))
      
      inline def setIconPressUndefined: Self = StObject.set(x, "iconPress", js.undefined)
      
      inline def setIconTooltip(value: String | PropertyBindingInfo): Self = StObject.set(x, "iconTooltip", value.asInstanceOf[js.Any])
      
      inline def setIconTooltipUndefined: Self = StObject.set(x, "iconTooltip", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setImageShape(
        value: ObjectHeaderPictureShape | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ObjectHeaderPictureShape * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "imageShape", value.asInstanceOf[js.Any])
      
      inline def setImageShapeUndefined: Self = StObject.set(x, "imageShape", js.undefined)
      
      inline def setIntro(value: String | PropertyBindingInfo): Self = StObject.set(x, "intro", value.asInstanceOf[js.Any])
      
      inline def setIntroActive(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "introActive", value.asInstanceOf[js.Any])
      
      inline def setIntroActiveUndefined: Self = StObject.set(x, "introActive", js.undefined)
      
      inline def setIntroHref(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "introHref", value.asInstanceOf[js.Any])
      
      inline def setIntroHrefUndefined: Self = StObject.set(x, "introHref", js.undefined)
      
      inline def setIntroPress(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ObjectHeader$IntroPressEventParameters] => Unit
      ): Self = StObject.set(x, "introPress", js.Any.fromFunction1(value))
      
      inline def setIntroPressUndefined: Self = StObject.set(x, "introPress", js.undefined)
      
      inline def setIntroTarget(value: String | PropertyBindingInfo): Self = StObject.set(x, "introTarget", value.asInstanceOf[js.Any])
      
      inline def setIntroTargetUndefined: Self = StObject.set(x, "introTarget", js.undefined)
      
      inline def setIntroTextDirection(
        value: TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "introTextDirection", value.asInstanceOf[js.Any])
      
      inline def setIntroTextDirectionUndefined: Self = StObject.set(x, "introTextDirection", js.undefined)
      
      inline def setIntroUndefined: Self = StObject.set(x, "intro", js.undefined)
      
      inline def setMarkFavorite(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "markFavorite", value.asInstanceOf[js.Any])
      
      inline def setMarkFavoriteUndefined: Self = StObject.set(x, "markFavorite", js.undefined)
      
      inline def setMarkFlagged(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "markFlagged", value.asInstanceOf[js.Any])
      
      inline def setMarkFlaggedUndefined: Self = StObject.set(x, "markFlagged", js.undefined)
      
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
      
      inline def setResponsive(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      inline def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      inline def setSecondStatus(value: typings.openui5.sapMObjectStatusMod.default): Self = StObject.set(x, "secondStatus", value.asInstanceOf[js.Any])
      
      inline def setSecondStatusUndefined: Self = StObject.set(x, "secondStatus", js.undefined)
      
      inline def setShowMarkers(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showMarkers", value.asInstanceOf[js.Any])
      
      inline def setShowMarkersUndefined: Self = StObject.set(x, "showMarkers", js.undefined)
      
      inline def setShowTitleSelector(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showTitleSelector", value.asInstanceOf[js.Any])
      
      inline def setShowTitleSelectorUndefined: Self = StObject.set(x, "showTitleSelector", js.undefined)
      
      inline def setStatuses(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "statuses", value.asInstanceOf[js.Any])
      
      inline def setStatusesUndefined: Self = StObject.set(x, "statuses", js.undefined)
      
      inline def setStatusesVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "statuses", js.Array(value*))
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleActive(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "titleActive", value.asInstanceOf[js.Any])
      
      inline def setTitleActiveUndefined: Self = StObject.set(x, "titleActive", js.undefined)
      
      inline def setTitleHref(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "titleHref", value.asInstanceOf[js.Any])
      
      inline def setTitleHrefUndefined: Self = StObject.set(x, "titleHref", js.undefined)
      
      inline def setTitleLevel(
        value: TitleLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "titleLevel", value.asInstanceOf[js.Any])
      
      inline def setTitleLevelUndefined: Self = StObject.set(x, "titleLevel", js.undefined)
      
      inline def setTitlePress(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ObjectHeader$TitlePressEventParameters] => Unit
      ): Self = StObject.set(x, "titlePress", js.Any.fromFunction1(value))
      
      inline def setTitlePressUndefined: Self = StObject.set(x, "titlePress", js.undefined)
      
      inline def setTitleSelectorPress(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ObjectHeader$TitleSelectorPressEventParameters] => Unit
      ): Self = StObject.set(x, "titleSelectorPress", js.Any.fromFunction1(value))
      
      inline def setTitleSelectorPressUndefined: Self = StObject.set(x, "titleSelectorPress", js.undefined)
      
      inline def setTitleSelectorTooltip(value: String | PropertyBindingInfo): Self = StObject.set(x, "titleSelectorTooltip", value.asInstanceOf[js.Any])
      
      inline def setTitleSelectorTooltipUndefined: Self = StObject.set(x, "titleSelectorTooltip", js.undefined)
      
      inline def setTitleTarget(value: String | PropertyBindingInfo): Self = StObject.set(x, "titleTarget", value.asInstanceOf[js.Any])
      
      inline def setTitleTargetUndefined: Self = StObject.set(x, "titleTarget", js.undefined)
      
      inline def setTitleTextDirection(
        value: TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "titleTextDirection", value.asInstanceOf[js.Any])
      
      inline def setTitleTextDirectionUndefined: Self = StObject.set(x, "titleTextDirection", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type ObjectHeaderTitlePressEvent = typings.openui5.sapUiBaseEventMod.default[ObjectHeader$TitlePressEventParameters]
  
  type ObjectHeaderTitlePressEventParameters = ObjectHeader$TitlePressEventParameters
  
  type ObjectHeaderTitleSelectorPressEvent = typings.openui5.sapUiBaseEventMod.default[ObjectHeader$TitleSelectorPressEventParameters]
  
  type ObjectHeaderTitleSelectorPressEventParameters = ObjectHeader$TitleSelectorPressEventParameters
}
