package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.Collision
import typings.openui5.sapUiCoreLibraryMod.Dock
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreTooltipBaseMod {
  
  @JSImport("sap/ui/core/TooltipBase", JSImport.Default)
  @js.native
  /**
    * Constructor for a new TooltipBase.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends TooltipBase {
    def this(/**
      * initial settings for the new control
      */
    mSettings: TooltipBaseSettings) = this()
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
    mSettings: TooltipBaseSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: TooltipBaseSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/TooltipBase", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.core.TooltipBase with name `sClassName` and enriches it with the
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
    oClassInfo: ClassInfo[T, TooltipBase]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, TooltipBase],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.TooltipBase.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait TooltipBase
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * @SINCE 1.11.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:closed closed} event of this `sap.ui.core.TooltipBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.TooltipBase` itself.
      *
      * This event is fired when the Tooltip has been closed
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachClosed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachClosed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.core.TooltipBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.11.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:closed closed} event of this `sap.ui.core.TooltipBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.TooltipBase` itself.
      *
      * This event is fired when the Tooltip has been closed
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachClosed(
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
    def attachClosed(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.core.TooltipBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.11.0
      *
      * Detaches event handler `fnFunction` from the {@link #event:closed closed} event of this `sap.ui.core.TooltipBase`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachClosed(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachClosed(
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
      * @SINCE 1.11.0
      *
      * Fires event {@link #event:closed closed} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireClosed(): this.type = js.native
    def fireClosed(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Gets current value of property {@link #getAtPosition atPosition}.
      *
      * Optional. At position defines which position on the target control to align the positioned tooltip.
      *
      * Default value is `'begin bottom'`.
      *
      * @returns Value of property `atPosition`
      */
    def getAtPosition(): Dock = js.native
    
    /**
      * Gets current value of property {@link #getCloseDelay closeDelay}.
      *
      * Closing delay of the tooltip in milliseconds
      *
      * Default value is `100`.
      *
      * @returns Value of property `closeDelay`
      */
    def getCloseDelay(): int = js.native
    
    /**
      * Gets current value of property {@link #getCloseDuration closeDuration}.
      *
      * Optional. Close Duration in milliseconds.
      *
      * Default value is `200`.
      *
      * @returns Value of property `closeDuration`
      */
    def getCloseDuration(): int = js.native
    
    /**
      * Gets current value of property {@link #getCollision collision}.
      *
      * Optional. Collision - when the positioned element overflows the window in some direction, move it to
      * an alternative position.
      *
      * Default value is `'flip'`.
      *
      * @returns Value of property `collision`
      */
    def getCollision(): Collision = js.native
    
    /**
      * Gets current value of property {@link #getMyPosition myPosition}.
      *
      * Optional. My position defines which position on the extended tooltip being positioned to align with the
      * target control.
      *
      * Default value is `'begin top'`.
      *
      * @returns Value of property `myPosition`
      */
    def getMyPosition(): Dock = js.native
    
    /**
      * Gets current value of property {@link #getOffset offset}.
      *
      * Optional. Offset adds these left-top values to the calculated position. Example: "10 3".
      *
      * Default value is `'10 3'`.
      *
      * @returns Value of property `offset`
      */
    def getOffset(): String = js.native
    
    /**
      * Gets current value of property {@link #getOpenDelay openDelay}.
      *
      * Opening delay of the tooltip in milliseconds
      *
      * Default value is `500`.
      *
      * @returns Value of property `openDelay`
      */
    def getOpenDelay(): int = js.native
    
    /**
      * Gets current value of property {@link #getOpenDuration openDuration}.
      *
      * Optional. Open Duration in milliseconds.
      *
      * Default value is `200`.
      *
      * @returns Value of property `openDuration`
      */
    def getOpenDuration(): int = js.native
    
    /**
      * Gets current value of property {@link #getText text}.
      *
      * The text that is shown in the tooltip that extends the TooltipBase class, for example in RichTooltip.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `text`
      */
    def getText(): String = js.native
    
    /**
      * Sets a new value for property {@link #getAtPosition atPosition}.
      *
      * Optional. At position defines which position on the target control to align the positioned tooltip.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'begin bottom'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAtPosition(): this.type = js.native
    def setAtPosition(/**
      * New value for property `atPosition`
      */
    sAtPosition: Dock): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getCloseDelay closeDelay}.
      *
      * Closing delay of the tooltip in milliseconds
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `100`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCloseDelay(): this.type = js.native
    def setCloseDelay(/**
      * New value for property `closeDelay`
      */
    iCloseDelay: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getCloseDuration closeDuration}.
      *
      * Optional. Close Duration in milliseconds.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `200`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCloseDuration(): this.type = js.native
    def setCloseDuration(/**
      * New value for property `closeDuration`
      */
    iCloseDuration: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getCollision collision}.
      *
      * Optional. Collision - when the positioned element overflows the window in some direction, move it to
      * an alternative position.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'flip'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCollision(): this.type = js.native
    def setCollision(/**
      * New value for property `collision`
      */
    sCollision: Collision): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMyPosition myPosition}.
      *
      * Optional. My position defines which position on the extended tooltip being positioned to align with the
      * target control.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'begin top'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMyPosition(): this.type = js.native
    def setMyPosition(/**
      * New value for property `myPosition`
      */
    sMyPosition: Dock): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getOffset offset}.
      *
      * Optional. Offset adds these left-top values to the calculated position. Example: "10 3".
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'10 3'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setOffset(): this.type = js.native
    def setOffset(/**
      * New value for property `offset`
      */
    sOffset: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getOpenDelay openDelay}.
      *
      * Opening delay of the tooltip in milliseconds
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `500`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setOpenDelay(): this.type = js.native
    def setOpenDelay(/**
      * New value for property `openDelay`
      */
    iOpenDelay: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getOpenDuration openDuration}.
      *
      * Optional. Open Duration in milliseconds.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `200`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setOpenDuration(): this.type = js.native
    def setOpenDuration(/**
      * New value for property `openDuration`
      */
    iOpenDuration: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getText text}.
      *
      * The text that is shown in the tooltip that extends the TooltipBase class, for example in RichTooltip.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setText(): this.type = js.native
    def setText(/**
      * New value for property `text`
      */
    sText: String): this.type = js.native
  }
  
  trait TooltipBaseSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Optional. At position defines which position on the target control to align the positioned tooltip.
      */
    var atPosition: js.UndefOr[Dock | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Closing delay of the tooltip in milliseconds
      */
    var closeDelay: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Optional. Close Duration in milliseconds.
      */
    var closeDuration: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.11.0
      *
      * This event is fired when the Tooltip has been closed
      */
    var closed: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Optional. Collision - when the positioned element overflows the window in some direction, move it to
      * an alternative position.
      */
    var collision: js.UndefOr[
        Collision | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Optional. My position defines which position on the extended tooltip being positioned to align with the
      * target control.
      */
    var myPosition: js.UndefOr[Dock | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Optional. Offset adds these left-top values to the calculated position. Example: "10 3".
      */
    var offset: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Opening delay of the tooltip in milliseconds
      */
    var openDelay: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Optional. Open Duration in milliseconds.
      */
    var openDuration: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * The text that is shown in the tooltip that extends the TooltipBase class, for example in RichTooltip.
      */
    var text: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object TooltipBaseSettings {
    
    inline def apply(): TooltipBaseSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipBaseSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TooltipBaseSettings] (val x: Self) extends AnyVal {
      
      inline def setAtPosition(value: Dock | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "atPosition", value.asInstanceOf[js.Any])
      
      inline def setAtPositionUndefined: Self = StObject.set(x, "atPosition", js.undefined)
      
      inline def setCloseDelay(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "closeDelay", value.asInstanceOf[js.Any])
      
      inline def setCloseDelayUndefined: Self = StObject.set(x, "closeDelay", js.undefined)
      
      inline def setCloseDuration(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "closeDuration", value.asInstanceOf[js.Any])
      
      inline def setCloseDurationUndefined: Self = StObject.set(x, "closeDuration", js.undefined)
      
      inline def setClosed(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "closed", js.Any.fromFunction1(value))
      
      inline def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
      
      inline def setCollision(value: Collision | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "collision", value.asInstanceOf[js.Any])
      
      inline def setCollisionUndefined: Self = StObject.set(x, "collision", js.undefined)
      
      inline def setMyPosition(value: Dock | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "myPosition", value.asInstanceOf[js.Any])
      
      inline def setMyPositionUndefined: Self = StObject.set(x, "myPosition", js.undefined)
      
      inline def setOffset(value: String | PropertyBindingInfo): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOpenDelay(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "openDelay", value.asInstanceOf[js.Any])
      
      inline def setOpenDelayUndefined: Self = StObject.set(x, "openDelay", js.undefined)
      
      inline def setOpenDuration(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "openDuration", value.asInstanceOf[js.Any])
      
      inline def setOpenDurationUndefined: Self = StObject.set(x, "openDuration", js.undefined)
      
      inline def setText(value: String | PropertyBindingInfo): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
