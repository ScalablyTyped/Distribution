package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.PlacementType
import typings.openui5.sapMQuickViewBaseMod.QuickViewBaseSettings
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMQuickViewMod {
  
  @JSImport("sap/m/QuickView", JSImport.Default)
  @js.native
  /**
    * Constructor for a new QuickView.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/quickview/ Quick View}
    */
  open class default () extends QuickView {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: QuickViewSettings) = this()
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
    mSettings: QuickViewSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: QuickViewSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/QuickView", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.QuickView with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.QuickViewBase.extend}.
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
      * Returns a metadata object for class sap.m.QuickView.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait QuickView
    extends typings.openui5.sapMQuickViewBaseMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:afterClose afterClose} event of this `sap.m.QuickView`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.QuickView` itself.
      *
      * This event fires after the QuickView is closed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAfterClose(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewAfterCloseEvent, Unit]
    ): this.type = js.native
    def attachAfterClose(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewAfterCloseEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.QuickView` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:afterClose afterClose} event of this `sap.m.QuickView`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.QuickView` itself.
      *
      * This event fires after the QuickView is closed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAfterClose(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewAfterCloseEvent, Unit]
    ): this.type = js.native
    def attachAfterClose(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewAfterCloseEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.QuickView` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:afterOpen afterOpen} event of this `sap.m.QuickView`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.QuickView` itself.
      *
      * This event fires after the QuickView is opened.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAfterOpen(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewAfterOpenEvent, Unit]
    ): this.type = js.native
    def attachAfterOpen(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewAfterOpenEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.QuickView` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:afterOpen afterOpen} event of this `sap.m.QuickView`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.QuickView` itself.
      *
      * This event fires after the QuickView is opened.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAfterOpen(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewAfterOpenEvent, Unit]
    ): this.type = js.native
    def attachAfterOpen(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewAfterOpenEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.QuickView` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeClose beforeClose} event of this `sap.m.QuickView`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.QuickView` itself.
      *
      * This event fires before the QuickView is closed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeClose(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewBeforeCloseEvent, Unit]
    ): this.type = js.native
    def attachBeforeClose(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewBeforeCloseEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.QuickView` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeClose beforeClose} event of this `sap.m.QuickView`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.QuickView` itself.
      *
      * This event fires before the QuickView is closed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeClose(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewBeforeCloseEvent, Unit]
    ): this.type = js.native
    def attachBeforeClose(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewBeforeCloseEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.QuickView` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeOpen beforeOpen} event of this `sap.m.QuickView`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.QuickView` itself.
      *
      * This event fires before the QuickView is opened.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeOpen(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewBeforeOpenEvent, Unit]
    ): this.type = js.native
    def attachBeforeOpen(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewBeforeOpenEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.QuickView` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeOpen beforeOpen} event of this `sap.m.QuickView`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.QuickView` itself.
      *
      * This event fires before the QuickView is opened.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeOpen(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewBeforeOpenEvent, Unit]
    ): this.type = js.native
    def attachBeforeOpen(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewBeforeOpenEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.QuickView` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Closes the QuickView.
      *
      * @returns Pointer to the control instance for chaining
      */
    def close(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:afterClose afterClose} event of this `sap.m.QuickView`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachAfterClose(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewAfterCloseEvent, Unit]
    ): this.type = js.native
    def detachAfterClose(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewAfterCloseEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:afterOpen afterOpen} event of this `sap.m.QuickView`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachAfterOpen(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewAfterOpenEvent, Unit]
    ): this.type = js.native
    def detachAfterOpen(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewAfterOpenEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:beforeClose beforeClose} event of this `sap.m.QuickView`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachBeforeClose(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewBeforeCloseEvent, Unit]
    ): this.type = js.native
    def detachBeforeClose(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewBeforeCloseEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:beforeOpen beforeOpen} event of this `sap.m.QuickView`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachBeforeOpen(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewBeforeOpenEvent, Unit]
    ): this.type = js.native
    def detachBeforeOpen(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickViewBeforeOpenEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:afterClose afterClose} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireAfterClose(): this.type = js.native
    def fireAfterClose(
      /**
      * Parameters to pass along with the event
      */
    mParameters: QuickView$AfterCloseEventParameters
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:afterOpen afterOpen} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireAfterOpen(): this.type = js.native
    def fireAfterOpen(
      /**
      * Parameters to pass along with the event
      */
    mParameters: QuickView$AfterOpenEventParameters
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:beforeClose beforeClose} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireBeforeClose(): this.type = js.native
    def fireBeforeClose(
      /**
      * Parameters to pass along with the event
      */
    mParameters: QuickView$BeforeCloseEventParameters
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:beforeOpen beforeOpen} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireBeforeOpen(): this.type = js.native
    def fireBeforeOpen(
      /**
      * Parameters to pass along with the event
      */
    mParameters: QuickView$BeforeOpenEventParameters
    ): this.type = js.native
    
    /**
      * Gets current value of property {@link #getPlacement placement}.
      *
      * This property is reused from sap.m.Popover and only takes effect when running on desktop or tablet. Please
      * refer the documentation of the placement property of sap.m.Popover.
      *
      * Default value is `Right`.
      *
      * @returns Value of property `placement`
      */
    def getPlacement(): PlacementType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementType * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * The width of the QuickView. The property takes effect only when running on desktop or tablet.
      *
      * Default value is `'320px'`.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Opens the QuickView.
      *
      * @returns Pointer to the control instance for chaining
      */
    def openBy(
      /**
      * The control which opens the QuickView.
      */
    oControl: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    def setPlacement(
      /**
      * The side from which the QuickView appears relative to the control that opens it.
      */
    sPlacement: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementType * / any */ String
    ): this.type = js.native
    /**
      * The method sets placement position of the QuickView.
      *
      * @returns Pointer to the control instance for chaining.
      */
    def setPlacement(
      /**
      * The side from which the QuickView appears relative to the control that opens it.
      */
    sPlacement: PlacementType
    ): this.type = js.native
    
    /**
      * The method sets the width of the QuickView. Works only on desktop or tablet.
      *
      * @returns Pointer to the control instance for chaining
      */
    def setWidth(/**
      * The new width of the QuickView.
      */
    sWidth: CSSSize): this.type = js.native
  }
  
  trait QuickView$AfterCloseEventParameters extends StObject {
    
    /**
      * This parameter refers to the control, which opens the QuickView.
      */
    var openBy: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * This parameter contains the control, which triggers the close of the QuickView. It is undefined when
      * running on desktop or tablet.
      */
    var origin: js.UndefOr[typings.openui5.sapMButtonMod.default] = js.undefined
  }
  object QuickView$AfterCloseEventParameters {
    
    inline def apply(): QuickView$AfterCloseEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuickView$AfterCloseEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QuickView$AfterCloseEventParameters] (val x: Self) extends AnyVal {
      
      inline def setOpenBy(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "openBy", value.asInstanceOf[js.Any])
      
      inline def setOpenByUndefined: Self = StObject.set(x, "openBy", js.undefined)
      
      inline def setOrigin(value: typings.openui5.sapMButtonMod.default): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    }
  }
  
  trait QuickView$AfterOpenEventParameters extends StObject {
    
    /**
      * This parameter refers to the control, which opens the QuickView.
      */
    var openBy: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
  }
  object QuickView$AfterOpenEventParameters {
    
    inline def apply(): QuickView$AfterOpenEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuickView$AfterOpenEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QuickView$AfterOpenEventParameters] (val x: Self) extends AnyVal {
      
      inline def setOpenBy(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "openBy", value.asInstanceOf[js.Any])
      
      inline def setOpenByUndefined: Self = StObject.set(x, "openBy", js.undefined)
    }
  }
  
  trait QuickView$BeforeCloseEventParameters extends StObject {
    
    /**
      * This parameter refers to the control, which opens the QuickView.
      */
    var openBy: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * This parameter contains the control, which triggers the close of the QuickView. It is undefined when
      * running on desktop or tablet.
      */
    var origin: js.UndefOr[typings.openui5.sapMButtonMod.default] = js.undefined
  }
  object QuickView$BeforeCloseEventParameters {
    
    inline def apply(): QuickView$BeforeCloseEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuickView$BeforeCloseEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QuickView$BeforeCloseEventParameters] (val x: Self) extends AnyVal {
      
      inline def setOpenBy(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "openBy", value.asInstanceOf[js.Any])
      
      inline def setOpenByUndefined: Self = StObject.set(x, "openBy", js.undefined)
      
      inline def setOrigin(value: typings.openui5.sapMButtonMod.default): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    }
  }
  
  trait QuickView$BeforeOpenEventParameters extends StObject {
    
    /**
      * This parameter refers to the control, which opens the QuickView.
      */
    var openBy: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
  }
  object QuickView$BeforeOpenEventParameters {
    
    inline def apply(): QuickView$BeforeOpenEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuickView$BeforeOpenEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QuickView$BeforeOpenEventParameters] (val x: Self) extends AnyVal {
      
      inline def setOpenBy(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "openBy", value.asInstanceOf[js.Any])
      
      inline def setOpenByUndefined: Self = StObject.set(x, "openBy", js.undefined)
    }
  }
  
  type QuickViewAfterCloseEvent = typings.openui5.sapUiBaseEventMod.default[QuickView$AfterCloseEventParameters]
  
  type QuickViewAfterCloseEventParameters = QuickView$AfterCloseEventParameters
  
  type QuickViewAfterOpenEvent = typings.openui5.sapUiBaseEventMod.default[QuickView$AfterOpenEventParameters]
  
  type QuickViewAfterOpenEventParameters = QuickView$AfterOpenEventParameters
  
  type QuickViewBeforeCloseEvent = typings.openui5.sapUiBaseEventMod.default[QuickView$BeforeCloseEventParameters]
  
  type QuickViewBeforeCloseEventParameters = QuickView$BeforeCloseEventParameters
  
  type QuickViewBeforeOpenEvent = typings.openui5.sapUiBaseEventMod.default[QuickView$BeforeOpenEventParameters]
  
  type QuickViewBeforeOpenEventParameters = QuickView$BeforeOpenEventParameters
  
  trait QuickViewSettings
    extends StObject
       with QuickViewBaseSettings {
    
    /**
      * This event fires after the QuickView is closed.
      */
    var afterClose: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[QuickView$AfterCloseEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * This event fires after the QuickView is opened.
      */
    var afterOpen: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[QuickView$AfterOpenEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * This event fires before the QuickView is closed.
      */
    var beforeClose: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[QuickView$BeforeCloseEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * This event fires before the QuickView is opened.
      */
    var beforeOpen: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[QuickView$BeforeOpenEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * This property is reused from sap.m.Popover and only takes effect when running on desktop or tablet. Please
      * refer the documentation of the placement property of sap.m.Popover.
      */
    var placement: js.UndefOr[
        PlacementType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * The width of the QuickView. The property takes effect only when running on desktop or tablet.
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
      
      inline def setAfterClose(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[QuickView$AfterCloseEventParameters] => Unit
      ): Self = StObject.set(x, "afterClose", js.Any.fromFunction1(value))
      
      inline def setAfterCloseUndefined: Self = StObject.set(x, "afterClose", js.undefined)
      
      inline def setAfterOpen(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[QuickView$AfterOpenEventParameters] => Unit
      ): Self = StObject.set(x, "afterOpen", js.Any.fromFunction1(value))
      
      inline def setAfterOpenUndefined: Self = StObject.set(x, "afterOpen", js.undefined)
      
      inline def setBeforeClose(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[QuickView$BeforeCloseEventParameters] => Unit
      ): Self = StObject.set(x, "beforeClose", js.Any.fromFunction1(value))
      
      inline def setBeforeCloseUndefined: Self = StObject.set(x, "beforeClose", js.undefined)
      
      inline def setBeforeOpen(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[QuickView$BeforeOpenEventParameters] => Unit
      ): Self = StObject.set(x, "beforeOpen", js.Any.fromFunction1(value))
      
      inline def setBeforeOpenUndefined: Self = StObject.set(x, "beforeOpen", js.undefined)
      
      inline def setPlacement(
        value: PlacementType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlacementType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
