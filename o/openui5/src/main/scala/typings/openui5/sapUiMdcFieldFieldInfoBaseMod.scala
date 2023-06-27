package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiMdcElementMod.ElementSettings
import typings.openui5.sapUiMdcLinkMod.DirectLinkObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcFieldFieldInfoBaseMod {
  
  @JSImport("sap/ui/mdc/field/FieldInfoBase", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `FieldInfoBase`.
    *
    * This is the basis for link-features. If the link is pressed a popover might be opened.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends FieldInfoBase {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: FieldInfoBaseSettings) = this()
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
    mSettings: FieldInfoBaseSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: FieldInfoBaseSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/mdc/field/FieldInfoBase", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.mdc.field.FieldInfoBase with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.mdc.Element.extend}.
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
    oClassInfo: ClassInfo[T, FieldInfoBase]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, FieldInfoBase],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.mdc.field.FieldInfoBase.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait FieldInfoBase
    extends typings.openui5.sapUiMdcElementMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:dataUpdate dataUpdate} event of this `sap.ui.mdc.field.FieldInfoBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.field.FieldInfoBase` itself.
      *
      * This event is fired if the data was updated.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachDataUpdate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachDataUpdate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.field.FieldInfoBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:dataUpdate dataUpdate} event of this `sap.ui.mdc.field.FieldInfoBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.field.FieldInfoBase` itself.
      *
      * This event is fired if the data was updated.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachDataUpdate(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachDataUpdate(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.field.FieldInfoBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:popoverAfterOpen popoverAfterOpen} event of
      * this `sap.ui.mdc.field.FieldInfoBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.field.FieldInfoBase` itself.
      *
      * This event is fired after the popover is opened.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPopoverAfterOpen(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachPopoverAfterOpen(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.field.FieldInfoBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:popoverAfterOpen popoverAfterOpen} event of
      * this `sap.ui.mdc.field.FieldInfoBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.field.FieldInfoBase` itself.
      *
      * This event is fired after the popover is opened.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPopoverAfterOpen(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachPopoverAfterOpen(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.field.FieldInfoBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Checks if there is a direct navigation or if there is a popover to be opened.
      *
      * @returns Resolves a Boolean value
      */
    def checkDirectNavigation(): js.Promise[Boolean] = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:dataUpdate dataUpdate} event of this `sap.ui.mdc.field.FieldInfoBase`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachDataUpdate(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def detachDataUpdate(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:popoverAfterOpen popoverAfterOpen} event of
      * this `sap.ui.mdc.field.FieldInfoBase`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachPopoverAfterOpen(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def detachPopoverAfterOpen(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:dataUpdate dataUpdate} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireDataUpdate(): this.type = js.native
    def fireDataUpdate(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:popoverAfterOpen popoverAfterOpen} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def firePopoverAfterOpen(): this.type = js.native
    def firePopoverAfterOpen(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Returns the content of the popover.
      *
      * @returns `Promise` with a popover content of type sap.ui.Control as result
      */
    def getContent(): js.Promise[/* was: sap.ui.Control */ Any] = js.native
    def getContent(
      /**
      * Function returning the `Popover` control that is created in `createPopover`
      */
    fnGetAutoClosedControl: js.Function
    ): js.Promise[/* was: sap.ui.Control */ Any] = js.native
    
    /**
      * Returns a `Promise` resolving into an {@link sap.ui.mdc.link.DirectLinkObject} containing the `href`
      * and `target` of a direct navigation link. Returns a `Promise` resolving into null if there is no direct
      * link.
      *
      * @returns `Promise` resolving into `null` or a {@link sap.ui.mdc.link.DirectLinkObject}
      */
    def getDirectLinkHrefAndTarget(): js.Promise[DirectLinkObject | Null] = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Returns the parent control.
      *
      * @returns control instance reference
      */
    def getSourceControl(): String | js.Array[String] | Null = js.native
    
    /**
      * Returns href as a `Promise` that defines the target navigation of the `Link` control created by `Field`.
      * If direct navigation is used, href is returned. If the information panel contains more content than only
      * one link, `null` is returned.
      *
      * @returns Result of `Promise` is href with values {string | null}
      */
    def getTriggerHref(): js.Promise[String | Null] = js.native
    
    /**
      * Returns `true` as a `Promise` result if the control created by `Field` can be triggered.
      *
      * @returns `Promise` resolving into `true` if `FieldInfo` is clickable
      */
    def isTriggerable(): js.Promise[Boolean] = js.native
    
    /**
      * Opens the info panel in the control created by `Field`.
      *
      * @returns `Promise` that is resolved once the popover has been created
      */
    def open(
      /**
      * Optional control reference to which the popover is attached. By default the parent is used as reference.
      */
    oControl: typings.openui5.sapUiCoreControlMod.default
    ): js.Promise[Any] = js.native
  }
  
  trait FieldInfoBase$DataUpdateEventParameters extends StObject
  
  trait FieldInfoBase$PopoverAfterOpenEventParameters extends StObject
  
  type FieldInfoBaseDataUpdateEvent = typings.openui5.sapUiBaseEventMod.default[FieldInfoBase$DataUpdateEventParameters]
  
  type FieldInfoBaseDataUpdateEventParameters = FieldInfoBase$DataUpdateEventParameters
  
  type FieldInfoBasePopoverAfterOpenEvent = typings.openui5.sapUiBaseEventMod.default[FieldInfoBase$PopoverAfterOpenEventParameters]
  
  type FieldInfoBasePopoverAfterOpenEventParameters = FieldInfoBase$PopoverAfterOpenEventParameters
  
  trait FieldInfoBaseSettings
    extends StObject
       with ElementSettings {
    
    /**
      * This event is fired if the data was updated.
      */
    var dataUpdate: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
    
    /**
      * This event is fired after the popover is opened.
      */
    var popoverAfterOpen: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
  }
  object FieldInfoBaseSettings {
    
    inline def apply(): FieldInfoBaseSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldInfoBaseSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldInfoBaseSettings] (val x: Self) extends AnyVal {
      
      inline def setDataUpdate(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "dataUpdate", js.Any.fromFunction1(value))
      
      inline def setDataUpdateUndefined: Self = StObject.set(x, "dataUpdate", js.undefined)
      
      inline def setPopoverAfterOpen(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "popoverAfterOpen", js.Any.fromFunction1(value))
      
      inline def setPopoverAfterOpenUndefined: Self = StObject.set(x, "popoverAfterOpen", js.undefined)
    }
  }
}
