package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.ImageMode
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.IFormContent
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.openui5.sapUiCoreLibraryMod.aria.HasPopup
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMImageMod {
  
  @JSImport("sap/m/Image", JSImport.Default)
  @js.native
  /**
    * Constructor for a new Image.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link topic:f86dbe9d7f7d48dea5286003b1322165 Image}
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/image/ Image}
    */
  open class default () extends Image {
    def this(/**
      * initial settings for the new control
      */
    mSettings: ImageSettings) = this()
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
    mSettings: ImageSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: ImageSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_core_IFormContent: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/Image", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.Image with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, Image]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Image],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.Image.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Image
    extends typings.openui5.sapUiCoreControlMod.default
       with IFormContent {
    
    /**
      * Checks if the given value is valid for the `background-position` CSS property
      *
      * @returns the check result
      */
    def _isValidBackgroundPositionValue(/**
      * the value to check
      */
    sValue: String): Boolean = js.native
    
    /**
      * Checks if the given value is valid for the `background-size` CSS property
      *
      * @returns the check result
      */
    def _isValidBackgroundSizeValue(/**
      * the value to check
      */
    sValue: String): Boolean = js.native
    
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
    
    def addAriaDetails(
      /**
      * The ariaDetails to add; if empty, nothing is inserted
      */
    vAriaDetails: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * @SINCE 1.79
      *
      * Adds some ariaDetails into the association {@link #getAriaDetails ariaDetails}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAriaDetails(/**
      * The ariaDetails to add; if empty, nothing is inserted
      */
    vAriaDetails: ID): this.type = js.native
    
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
      * @SINCE 1.36.2
      *
      * Attaches event handler `fnFunction` to the {@link #event:error error} event of this `sap.m.Image`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Image` itself.
      *
      * Event is fired when the image resource can't be loaded. If densityAware is set to true, the event is
      * fired when none of the fallback resources can be loaded.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachError(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachError(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Image` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.36.2
      *
      * Attaches event handler `fnFunction` to the {@link #event:error error} event of this `sap.m.Image`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Image` itself.
      *
      * Event is fired when the image resource can't be loaded. If densityAware is set to true, the event is
      * fired when none of the fallback resources can be loaded.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachError(
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
    def attachError(
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
      * Context object to call the event handler with. Defaults to this `sap.m.Image` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.36.2
      *
      * Attaches event handler `fnFunction` to the {@link #event:load load} event of this `sap.m.Image`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Image` itself.
      *
      * Event is fired when the image resource is loaded.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachLoad(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachLoad(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Image` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.36.2
      *
      * Attaches event handler `fnFunction` to the {@link #event:load load} event of this `sap.m.Image`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Image` itself.
      *
      * Event is fired when the image resource is loaded.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachLoad(
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
    def attachLoad(
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
      * Context object to call the event handler with. Defaults to this `sap.m.Image` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:press press} event of this `sap.m.Image`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Image` itself.
      *
      * Event is fired when the user clicks on the control.
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
      * Context object to call the event handler with. Defaults to this `sap.m.Image` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:press press} event of this `sap.m.Image`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Image` itself.
      *
      * Event is fired when the user clicks on the control.
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
      * Context object to call the event handler with. Defaults to this `sap.m.Image` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:tap tap} event of this `sap.m.Image`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Image` itself.
      *
      * Event is fired when the user clicks on the control. (This event is deprecated, use the press event instead)
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachTap(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachTap(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Image` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:tap tap} event of this `sap.m.Image`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Image` itself.
      *
      * Event is fired when the user clicks on the control. (This event is deprecated, use the press event instead)
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachTap(
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
    def attachTap(
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
      * Context object to call the event handler with. Defaults to this `sap.m.Image` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Binds aggregation {@link #getDetailBox detailBox} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
      * of the possible properties of `oBindingInfo`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindDetailBox(/**
      * The binding information
      */
    oBindingInfo: AggregationBindingInfo): this.type = js.native
    
    /**
      * Destroys the detailBox in the aggregation {@link #getDetailBox detailBox}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyDetailBox(): this.type = js.native
    
    /**
      * @SINCE 1.36.2
      *
      * Detaches event handler `fnFunction` from the {@link #event:error error} event of this `sap.m.Image`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachError(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachError(
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
      * @SINCE 1.36.2
      *
      * Detaches event handler `fnFunction` from the {@link #event:load load} event of this `sap.m.Image`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachLoad(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachLoad(
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
      * Detaches event handler `fnFunction` from the {@link #event:press press} event of this `sap.m.Image`.
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
      * Detaches event handler `fnFunction` from the {@link #event:tap tap} event of this `sap.m.Image`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachTap(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachTap(
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
      * @SINCE 1.36.2
      *
      * Fires event {@link #event:error error} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireError(): this.type = js.native
    def fireError(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @SINCE 1.36.2
      *
      * Fires event {@link #event:load load} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireLoad(): this.type = js.native
    def fireLoad(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Fires event {@link #event:press press} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def firePress(): this.type = js.native
    def firePress(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Fires event {@link #event:tap tap} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireTap(): this.type = js.native
    def fireTap(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Gets current value of property {@link #getActiveSrc activeSrc}.
      *
      * The source property which is used when the image is pressed.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `activeSrc`
      */
    def getActiveSrc(): URI = js.native
    
    /**
      * Gets current value of property {@link #getAlt alt}.
      *
      * The alternative text that is displayed in case the image is not available, or cannot be displayed.
      *
      * If the image is set to decorative, this property is ignored.
      *
      * @returns Value of property `alt`
      */
    def getAlt(): String = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaDescribedBy
      * ariaDescribedBy}.
      */
    def getAriaDescribedBy(): js.Array[ID] = js.native
    
    /**
      * @SINCE 1.79
      *
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaDetails
      * ariaDetails}.
      */
    def getAriaDetails(): js.Array[ID] = js.native
    
    /**
      * @SINCE 1.87.0
      *
      * Gets current value of property {@link #getAriaHasPopup ariaHasPopup}.
      *
      * Defines the aria-haspopup attribute of the `Image`.
      *
      * **Guidance for choosing appropriate value:**
      * 	 -  We recommend you to use the property only when press handler is set.
      * 	 -  If you use controls based on `sap.m.Popover` or `sap.m.Dialog`, then you must use `AriaHasPopup.Dialog`
      * 			(both `sap.m.Popover` and `sap.m.Dialog` have role "dialog" assigned internally).
      * 	 -  If you use other controls, or directly `sap.ui.core.Popup`, you need to check the container role/type
      * 			and map the value of `ariaHasPopup` accordingly.
      *
      * Default value is `None`.
      *
      * @returns Value of property `ariaHasPopup`
      */
    def getAriaHasPopup(): HasPopup | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof aria.HasPopup * / any */ String) = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy
      * ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * @SINCE 1.30.0
      *
      * Gets current value of property {@link #getBackgroundPosition backgroundPosition}.
      *
      * Defines the position of the image in `sap.m.ImageMode.Background` mode.
      *
      * This property is set on the output DOM element using the CSS style `background-position`. It takes effect
      * only when the `mode` property is set to `sap.m.ImageMode.Background`.
      *
      * Default value is `"initial"`.
      *
      * @returns Value of property `backgroundPosition`
      */
    def getBackgroundPosition(): String = js.native
    
    /**
      * @SINCE 1.30.0
      *
      * Gets current value of property {@link #getBackgroundRepeat backgroundRepeat}.
      *
      * Defines whether the source image is repeated when the output DOM element is bigger than the source.
      *
      * This property is set on the output DOM element using the CSS style `background-repeat`. It takes effect
      * only when the `mode` property is set to `sap.m.ImageMode.Background`.
      *
      * Default value is `"no-repeat"`.
      *
      * @returns Value of property `backgroundRepeat`
      */
    def getBackgroundRepeat(): String = js.native
    
    /**
      * @SINCE 1.30.0
      *
      * Gets current value of property {@link #getBackgroundSize backgroundSize}.
      *
      * Defines the size of the image in `sap.m.ImageMode.Background` mode.
      *
      * This property is set on the output DOM element using the CSS style `background-size`. It takes effect
      * only when the `mode` property is set to `sap.m.ImageMode.Background`.
      *
      * Default value is `"cover"`.
      *
      * @returns Value of property `backgroundSize`
      */
    def getBackgroundSize(): String = js.native
    
    /**
      * Gets current value of property {@link #getDecorative decorative}.
      *
      * A decorative image is included for design reasons; accessibility tools will ignore decorative images.
      *
      * Note: If the image has an image map (`useMap` is set), this property will be overridden (the image will
      * not be rendered as decorative). A decorative image has no `ALT` attribute, so the `alt` property is ignored
      * if the image is decorative.
      *
      * Default value is `true`.
      *
      * @returns Value of property `decorative`
      */
    def getDecorative(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getDensityAware densityAware}.
      *
      * If this is set to `true`, one or more network requests will be made that try to obtain the density perfect
      * version of the image.
      *
      * By default, this is set to `false`, so the `src` image is loaded directly without attempting to fetch
      * the density perfect image for high-density devices.
      *
      * **Note:** Before 1.60, the default value was set to `true`, which brought redundant network requests
      * for apps that used the default but did not provide density perfect image versions on server-side. You
      * should set this property to `true` only if you also provide the corresponding image versions for high-density
      * devices.
      *
      * Default value is `false`.
      *
      * @returns Value of property `densityAware`
      */
    def getDensityAware(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getDetailBox detailBox}.
      *
      * A `sap.m.LightBox` instance that will be opened automatically when the user interacts with the `Image`
      * control.
      *
      * The `tap` event will still be fired.
      */
    def getDetailBox(): typings.openui5.sapMLightBoxMod.default = js.native
    
    /**
      * Gets current value of property {@link #getHeight height}.
      *
      * When the empty value is kept, the original size is not changed.
      *
      * It is also possible to make settings for width or height only, in which case the original ratio between
      * width/height is maintained. When the `mode` property is set to `sap.m.ImageMode.Background`, this property
      * always needs to be set. Otherwise the output DOM element has a 0 size.
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * @SINCE 1.87
      *
      * Gets current value of property {@link #getLazyLoading lazyLoading}.
      *
      * Enables lazy loading for images that are offscreen. If set to `true`, the property ensures that offscreen
      * images are loaded early enough so that they have finished loading once the user scrolls near them.
      *
      * **Note:** Keep in mind that the property uses the loading attribute of HTML `<img>` element which
      * is not supported for Internet Explorer.
      *
      * Default value is `false`.
      *
      * @returns Value of property `lazyLoading`
      */
    def getLazyLoading(): Boolean = js.native
    
    /**
      * @SINCE 1.30.0
      *
      * Gets current value of property {@link #getMode mode}.
      *
      * Defines how the `src` and the `activeSrc` is output to the DOM Element.
      *
      * When set to `sap.m.ImageMode.Image`, which is the default value, the `src` (`activeSrc`) is set to the
      * `src` attribute of the <img> tag. When set to `sap.m.ImageMode.Background`, the `src` (`activeSrc`)
      * is set to the CSS style `background-image` and the root DOM element is rendered as a <span> tag
      * instead of an <img> tag.
      *
      * Default value is `"Image"`.
      *
      * @returns Value of property `mode`
      */
    def getMode(): ImageMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ImageMode * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getSrc src}.
      *
      * Relative or absolute path to URL where the image file is stored.
      *
      * The path will be adapted to the density-aware format according to the density of the device following
      * the naming convention [imageName]@[densityValue].[extension].
      *
      * @returns Value of property `src`
      */
    def getSrc(): URI = js.native
    
    /**
      * Gets current value of property {@link #getUseMap useMap}.
      *
      * The name of the image map that defines the clickable areas.
      *
      * @returns Value of property `useMap`
      */
    def getUseMap(): String = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * When the empty value is kept, the original size is not changed.
      *
      * It is also possible to make settings for width or height only, in which case the original ratio between
      * width/height is maintained. When the `mode` property is set to `sap.m.ImageMode.Background`, this property
      * always needs to be set. Otherwise the output DOM element has a 0 size.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Removes all the controls in the association named {@link #getAriaDescribedBy ariaDescribedBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaDescribedBy(): js.Array[ID] = js.native
    
    /**
      * @SINCE 1.79
      *
      * Removes all the controls in the association named {@link #getAriaDetails ariaDetails}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaDetails(): js.Array[ID] = js.native
    
    /**
      * Removes all the controls in the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaLabelledBy(): js.Array[ID] = js.native
    
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
      * @SINCE 1.79
      *
      * Removes an ariaDetails from the association named {@link #getAriaDetails ariaDetails}.
      *
      * @returns The removed ariaDetails or `null`
      */
    def removeAriaDetails(/**
      * The ariaDetails to be removed or its index or ID
      */
    vAriaDetails: int): ID | Null = js.native
    def removeAriaDetails(
      /**
      * The ariaDetails to be removed or its index or ID
      */
    vAriaDetails: typings.openui5.sapUiCoreControlMod.default
    ): ID | Null = js.native
    def removeAriaDetails(/**
      * The ariaDetails to be removed or its index or ID
      */
    vAriaDetails: ID): ID | Null = js.native
    
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
    
    /**
      * Sets a new value for property {@link #getActiveSrc activeSrc}.
      *
      * The source property which is used when the image is pressed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setActiveSrc(): this.type = js.native
    def setActiveSrc(/**
      * New value for property `activeSrc`
      */
    sActiveSrc: URI): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getAlt alt}.
      *
      * The alternative text that is displayed in case the image is not available, or cannot be displayed.
      *
      * If the image is set to decorative, this property is ignored.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAlt(): this.type = js.native
    def setAlt(/**
      * New value for property `alt`
      */
    sAlt: String): this.type = js.native
    
    /**
      * @SINCE 1.87.0
      *
      * Sets a new value for property {@link #getAriaHasPopup ariaHasPopup}.
      *
      * Defines the aria-haspopup attribute of the `Image`.
      *
      * **Guidance for choosing appropriate value:**
      * 	 -  We recommend you to use the property only when press handler is set.
      * 	 -  If you use controls based on `sap.m.Popover` or `sap.m.Dialog`, then you must use `AriaHasPopup.Dialog`
      * 			(both `sap.m.Popover` and `sap.m.Dialog` have role "dialog" assigned internally).
      * 	 -  If you use other controls, or directly `sap.ui.core.Popup`, you need to check the container role/type
      * 			and map the value of `ariaHasPopup` accordingly.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `None`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAriaHasPopup(): this.type = js.native
    def setAriaHasPopup(
      /**
      * New value for property `ariaHasPopup`
      */
    sAriaHasPopup: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof aria.HasPopup * / any */ String
    ): this.type = js.native
    def setAriaHasPopup(/**
      * New value for property `ariaHasPopup`
      */
    sAriaHasPopup: HasPopup): this.type = js.native
    
    /**
      * @SINCE 1.30.0
      *
      * Sets a new value for property {@link #getBackgroundPosition backgroundPosition}.
      *
      * Defines the position of the image in `sap.m.ImageMode.Background` mode.
      *
      * This property is set on the output DOM element using the CSS style `background-position`. It takes effect
      * only when the `mode` property is set to `sap.m.ImageMode.Background`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"initial"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBackgroundPosition(): this.type = js.native
    def setBackgroundPosition(/**
      * New value for property `backgroundPosition`
      */
    sBackgroundPosition: String): this.type = js.native
    
    /**
      * @SINCE 1.30.0
      *
      * Sets a new value for property {@link #getBackgroundRepeat backgroundRepeat}.
      *
      * Defines whether the source image is repeated when the output DOM element is bigger than the source.
      *
      * This property is set on the output DOM element using the CSS style `background-repeat`. It takes effect
      * only when the `mode` property is set to `sap.m.ImageMode.Background`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"no-repeat"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBackgroundRepeat(): this.type = js.native
    def setBackgroundRepeat(/**
      * New value for property `backgroundRepeat`
      */
    sBackgroundRepeat: String): this.type = js.native
    
    /**
      * @SINCE 1.30.0
      *
      * Sets a new value for property {@link #getBackgroundSize backgroundSize}.
      *
      * Defines the size of the image in `sap.m.ImageMode.Background` mode.
      *
      * This property is set on the output DOM element using the CSS style `background-size`. It takes effect
      * only when the `mode` property is set to `sap.m.ImageMode.Background`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"cover"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBackgroundSize(): this.type = js.native
    def setBackgroundSize(/**
      * New value for property `backgroundSize`
      */
    sBackgroundSize: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDecorative decorative}.
      *
      * A decorative image is included for design reasons; accessibility tools will ignore decorative images.
      *
      * Note: If the image has an image map (`useMap` is set), this property will be overridden (the image will
      * not be rendered as decorative). A decorative image has no `ALT` attribute, so the `alt` property is ignored
      * if the image is decorative.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDecorative(): this.type = js.native
    def setDecorative(/**
      * New value for property `decorative`
      */
    bDecorative: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDensityAware densityAware}.
      *
      * If this is set to `true`, one or more network requests will be made that try to obtain the density perfect
      * version of the image.
      *
      * By default, this is set to `false`, so the `src` image is loaded directly without attempting to fetch
      * the density perfect image for high-density devices.
      *
      * **Note:** Before 1.60, the default value was set to `true`, which brought redundant network requests
      * for apps that used the default but did not provide density perfect image versions on server-side. You
      * should set this property to `true` only if you also provide the corresponding image versions for high-density
      * devices.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDensityAware(): this.type = js.native
    def setDensityAware(/**
      * New value for property `densityAware`
      */
    bDensityAware: Boolean): this.type = js.native
    
    /**
      * Sets the `detailBox` aggregation.
      *
      * @returns `this` for chaining
      */
    def setDetailBox(): this.type = js.native
    def setDetailBox(
      /**
      * Instance of the `LightBox` control or undefined
      */
    oLightBox: typings.openui5.sapMLightBoxMod.default
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeight height}.
      *
      * When the empty value is kept, the original size is not changed.
      *
      * It is also possible to make settings for width or height only, in which case the original ratio between
      * width/height is maintained. When the `mode` property is set to `sap.m.ImageMode.Background`, this property
      * always needs to be set. Otherwise the output DOM element has a 0 size.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeight(): this.type = js.native
    def setHeight(/**
      * New value for property `height`
      */
    sHeight: CSSSize): this.type = js.native
    
    /**
      * @SINCE 1.87
      *
      * Sets a new value for property {@link #getLazyLoading lazyLoading}.
      *
      * Enables lazy loading for images that are offscreen. If set to `true`, the property ensures that offscreen
      * images are loaded early enough so that they have finished loading once the user scrolls near them.
      *
      * **Note:** Keep in mind that the property uses the loading attribute of HTML `<img>` element which
      * is not supported for Internet Explorer.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLazyLoading(): this.type = js.native
    def setLazyLoading(/**
      * New value for property `lazyLoading`
      */
    bLazyLoading: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.30.0
      *
      * Sets a new value for property {@link #getMode mode}.
      *
      * Defines how the `src` and the `activeSrc` is output to the DOM Element.
      *
      * When set to `sap.m.ImageMode.Image`, which is the default value, the `src` (`activeSrc`) is set to the
      * `src` attribute of the <img> tag. When set to `sap.m.ImageMode.Background`, the `src` (`activeSrc`)
      * is set to the CSS style `background-image` and the root DOM element is rendered as a <span> tag
      * instead of an <img> tag.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"Image"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMode(): this.type = js.native
    def setMode(
      /**
      * New value for property `mode`
      */
    sMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ImageMode * / any */ String
    ): this.type = js.native
    def setMode(/**
      * New value for property `mode`
      */
    sMode: ImageMode): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSrc src}.
      *
      * Relative or absolute path to URL where the image file is stored.
      *
      * The path will be adapted to the density-aware format according to the density of the device following
      * the naming convention [imageName]@[densityValue].[extension].
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSrc(): this.type = js.native
    def setSrc(/**
      * New value for property `src`
      */
    sSrc: URI): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getUseMap useMap}.
      *
      * The name of the image map that defines the clickable areas.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setUseMap(): this.type = js.native
    def setUseMap(/**
      * New value for property `useMap`
      */
    sUseMap: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * When the empty value is kept, the original size is not changed.
      *
      * It is also possible to make settings for width or height only, in which case the original ratio between
      * width/height is maintained. When the `mode` property is set to `sap.m.ImageMode.Background`, this property
      * always needs to be set. Otherwise the output DOM element has a 0 size.
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
    
    /**
      * Unbinds aggregation {@link #getDetailBox detailBox} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindDetailBox(): this.type = js.native
  }
  
  trait ImageSettings
    extends StObject
       with ControlSettings {
    
    /**
      * The source property which is used when the image is pressed.
      */
    var activeSrc: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * The alternative text that is displayed in case the image is not available, or cannot be displayed.
      *
      * If the image is set to decorative, this property is ignored.
      */
    var alt: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Association to controls / ids which describe this control (see WAI-ARIA attribute aria-describedby).
      */
    var ariaDescribedBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * @SINCE 1.79
      *
      * Association to controls / IDs which are details to this control (see WAI-ARIA attribute aria-details).
      */
    var ariaDetails: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * @SINCE 1.87.0
      *
      * Defines the aria-haspopup attribute of the `Image`.
      *
      * **Guidance for choosing appropriate value:**
      * 	 -  We recommend you to use the property only when press handler is set.
      * 	 -  If you use controls based on `sap.m.Popover` or `sap.m.Dialog`, then you must use `AriaHasPopup.Dialog`
      * 			(both `sap.m.Popover` and `sap.m.Dialog` have role "dialog" assigned internally).
      * 	 -  If you use other controls, or directly `sap.ui.core.Popup`, you need to check the container role/type
      * 			and map the value of `ariaHasPopup` accordingly.
      */
    var ariaHasPopup: js.UndefOr[
        HasPopup | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof aria.HasPopup * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Association to controls / ids which label this control (see WAI-ARIA attribute aria-labelledBy).
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * @SINCE 1.30.0
      *
      * Defines the position of the image in `sap.m.ImageMode.Background` mode.
      *
      * This property is set on the output DOM element using the CSS style `background-position`. It takes effect
      * only when the `mode` property is set to `sap.m.ImageMode.Background`.
      */
    var backgroundPosition: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.30.0
      *
      * Defines whether the source image is repeated when the output DOM element is bigger than the source.
      *
      * This property is set on the output DOM element using the CSS style `background-repeat`. It takes effect
      * only when the `mode` property is set to `sap.m.ImageMode.Background`.
      */
    var backgroundRepeat: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.30.0
      *
      * Defines the size of the image in `sap.m.ImageMode.Background` mode.
      *
      * This property is set on the output DOM element using the CSS style `background-size`. It takes effect
      * only when the `mode` property is set to `sap.m.ImageMode.Background`.
      */
    var backgroundSize: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * A decorative image is included for design reasons; accessibility tools will ignore decorative images.
      *
      * Note: If the image has an image map (`useMap` is set), this property will be overridden (the image will
      * not be rendered as decorative). A decorative image has no `ALT` attribute, so the `alt` property is ignored
      * if the image is decorative.
      */
    var decorative: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * If this is set to `true`, one or more network requests will be made that try to obtain the density perfect
      * version of the image.
      *
      * By default, this is set to `false`, so the `src` image is loaded directly without attempting to fetch
      * the density perfect image for high-density devices.
      *
      * **Note:** Before 1.60, the default value was set to `true`, which brought redundant network requests
      * for apps that used the default but did not provide density perfect image versions on server-side. You
      * should set this property to `true` only if you also provide the corresponding image versions for high-density
      * devices.
      */
    var densityAware: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * A `sap.m.LightBox` instance that will be opened automatically when the user interacts with the `Image`
      * control.
      *
      * The `tap` event will still be fired.
      */
    var detailBox: js.UndefOr[typings.openui5.sapMLightBoxMod.default] = js.undefined
    
    /**
      * @SINCE 1.36.2
      *
      * Event is fired when the image resource can't be loaded. If densityAware is set to true, the event is
      * fired when none of the fallback resources can be loaded.
      */
    var error: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * When the empty value is kept, the original size is not changed.
      *
      * It is also possible to make settings for width or height only, in which case the original ratio between
      * width/height is maintained. When the `mode` property is set to `sap.m.ImageMode.Background`, this property
      * always needs to be set. Otherwise the output DOM element has a 0 size.
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.87
      *
      * Enables lazy loading for images that are offscreen. If set to `true`, the property ensures that offscreen
      * images are loaded early enough so that they have finished loading once the user scrolls near them.
      *
      * **Note:** Keep in mind that the property uses the loading attribute of HTML `<img>` element which
      * is not supported for Internet Explorer.
      */
    var lazyLoading: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.36.2
      *
      * Event is fired when the image resource is loaded.
      */
    var load: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.30.0
      *
      * Defines how the `src` and the `activeSrc` is output to the DOM Element.
      *
      * When set to `sap.m.ImageMode.Image`, which is the default value, the `src` (`activeSrc`) is set to the
      * `src` attribute of the <img> tag. When set to `sap.m.ImageMode.Background`, the `src` (`activeSrc`)
      * is set to the CSS style `background-image` and the root DOM element is rendered as a <span> tag
      * instead of an <img> tag.
      */
    var mode: js.UndefOr[
        ImageMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ImageMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Event is fired when the user clicks on the control.
      */
    var press: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Relative or absolute path to URL where the image file is stored.
      *
      * The path will be adapted to the density-aware format according to the density of the device following
      * the naming convention [imageName]@[densityValue].[extension].
      */
    var src: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Event is fired when the user clicks on the control. (This event is deprecated, use the press event instead)
      */
    var tap: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * The name of the image map that defines the clickable areas.
      */
    var useMap: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * When the empty value is kept, the original size is not changed.
      *
      * It is also possible to make settings for width or height only, in which case the original ratio between
      * width/height is maintained. When the `mode` property is set to `sap.m.ImageMode.Background`, this property
      * always needs to be set. Otherwise the output DOM element has a 0 size.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ImageSettings {
    
    inline def apply(): ImageSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageSettings]
    }
    
    extension [Self <: ImageSettings](x: Self) {
      
      inline def setActiveSrc(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "activeSrc", value.asInstanceOf[js.Any])
      
      inline def setActiveSrcUndefined: Self = StObject.set(x, "activeSrc", js.undefined)
      
      inline def setAlt(value: String | PropertyBindingInfo): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setAriaDescribedBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAriaDescribedByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaDescribedBy", js.Array(value*))
      
      inline def setAriaDetails(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaDetails", value.asInstanceOf[js.Any])
      
      inline def setAriaDetailsUndefined: Self = StObject.set(x, "ariaDetails", js.undefined)
      
      inline def setAriaDetailsVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaDetails", js.Array(value*))
      
      inline def setAriaHasPopup(
        value: HasPopup | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof aria.HasPopup * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "ariaHasPopup", value.asInstanceOf[js.Any])
      
      inline def setAriaHasPopupUndefined: Self = StObject.set(x, "ariaHasPopup", js.undefined)
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setBackgroundPosition(value: String | PropertyBindingInfo): Self = StObject.set(x, "backgroundPosition", value.asInstanceOf[js.Any])
      
      inline def setBackgroundPositionUndefined: Self = StObject.set(x, "backgroundPosition", js.undefined)
      
      inline def setBackgroundRepeat(value: String | PropertyBindingInfo): Self = StObject.set(x, "backgroundRepeat", value.asInstanceOf[js.Any])
      
      inline def setBackgroundRepeatUndefined: Self = StObject.set(x, "backgroundRepeat", js.undefined)
      
      inline def setBackgroundSize(value: String | PropertyBindingInfo): Self = StObject.set(x, "backgroundSize", value.asInstanceOf[js.Any])
      
      inline def setBackgroundSizeUndefined: Self = StObject.set(x, "backgroundSize", js.undefined)
      
      inline def setDecorative(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "decorative", value.asInstanceOf[js.Any])
      
      inline def setDecorativeUndefined: Self = StObject.set(x, "decorative", js.undefined)
      
      inline def setDensityAware(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "densityAware", value.asInstanceOf[js.Any])
      
      inline def setDensityAwareUndefined: Self = StObject.set(x, "densityAware", js.undefined)
      
      inline def setDetailBox(value: typings.openui5.sapMLightBoxMod.default): Self = StObject.set(x, "detailBox", value.asInstanceOf[js.Any])
      
      inline def setDetailBoxUndefined: Self = StObject.set(x, "detailBox", js.undefined)
      
      inline def setError(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLazyLoading(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "lazyLoading", value.asInstanceOf[js.Any])
      
      inline def setLazyLoadingUndefined: Self = StObject.set(x, "lazyLoading", js.undefined)
      
      inline def setLoad(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      inline def setMode(
        value: ImageMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ImageMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setPress(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "press", js.Any.fromFunction1(value))
      
      inline def setPressUndefined: Self = StObject.set(x, "press", js.undefined)
      
      inline def setSrc(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setTap(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "tap", js.Any.fromFunction1(value))
      
      inline def setTapUndefined: Self = StObject.set(x, "tap", js.undefined)
      
      inline def setUseMap(value: String | PropertyBindingInfo): Self = StObject.set(x, "useMap", value.asInstanceOf[js.Any])
      
      inline def setUseMapUndefined: Self = StObject.set(x, "useMap", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
