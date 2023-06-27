package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcMainCardHeaderMod {
  
  @JSImport("sap/ui/webc/main/CardHeader", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `CardHeader`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends CardHeader {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: CardHeaderSettings) = this()
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
    mSettings: CardHeaderSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: CardHeaderSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/webc/main/CardHeader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.main.CardHeader with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.webc.common.WebComponent.extend}.
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
    oClassInfo: ClassInfo[T, CardHeader]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, CardHeader],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.webc.main.CardHeader.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait CardHeader
    extends typings.openui5.sapUiWebcCommonWebComponentMod.default {
    
    /**
      * Adds some action to the aggregation {@link #getAction action}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAction(
      /**
      * The action to add; if empty, nothing is inserted
      */
    oAction: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Adds some avatar to the aggregation {@link #getAvatar avatar}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAvatar(
      /**
      * The avatar to add; if empty, nothing is inserted
      */
    oAvatar: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:click click} event of this `sap.ui.webc.main.CardHeader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.CardHeader` itself.
      *
      * Fired when the component is activated by mouse/tap or by using the Enter or Space key.
      *
      *  **Note:** The event would be fired only if the `interactive` property is set to true.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachClick(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachClick(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.CardHeader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:click click} event of this `sap.ui.webc.main.CardHeader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.CardHeader` itself.
      *
      * Fired when the component is activated by mouse/tap or by using the Enter or Space key.
      *
      *  **Note:** The event would be fired only if the `interactive` property is set to true.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachClick(
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
    def attachClick(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.CardHeader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the action in the aggregation {@link #getAction action}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyAction(): this.type = js.native
    
    /**
      * Destroys all the avatar in the aggregation {@link #getAvatar avatar}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyAvatar(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:click click} event of this `sap.ui.webc.main.CardHeader`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachClick(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def detachClick(
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
      * Fires event {@link #event:click click} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireClick(): this.type = js.native
    def fireClick(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getAction action}.
      *
      * Defines an action, displayed in the right most part of the header.
      */
    def getAction(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getAvatar avatar}.
      *
      * Defines an avatar image, displayed in the left most part of the header.
      */
    def getAvatar(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getInteractive interactive}.
      *
      * Defines if the component would be interactive, e.g gets hover effect, gets focus outline and `click`
      * event is fired, when pressed.
      *
      * Default value is `false`.
      *
      * @returns Value of property `interactive`
      */
    def getInteractive(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getStatus status}.
      *
      * Defines the status text.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `status`
      */
    def getStatus(): String = js.native
    
    /**
      * Gets current value of property {@link #getSubtitleText subtitleText}.
      *
      * Defines the subtitle text.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `subtitleText`
      */
    def getSubtitleText(): String = js.native
    
    /**
      * Gets current value of property {@link #getTitleText titleText}.
      *
      * Defines the title text.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `titleText`
      */
    def getTitleText(): String = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getAction action}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfAction(
      /**
      * The action whose index is looked for
      */
    oAction: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getAvatar avatar}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfAvatar(
      /**
      * The avatar whose index is looked for
      */
    oAvatar: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Inserts a action into the aggregation {@link #getAction action}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertAction(
      /**
      * The action to insert; if empty, nothing is inserted
      */
    oAction: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the action should be inserted at; for a negative value of `iIndex`, the action is
      * inserted at position 0; for a value greater than the current size of the aggregation, the action is inserted
      * at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a avatar into the aggregation {@link #getAvatar avatar}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertAvatar(
      /**
      * The avatar to insert; if empty, nothing is inserted
      */
    oAvatar: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the avatar should be inserted at; for a negative value of `iIndex`, the avatar is
      * inserted at position 0; for a value greater than the current size of the aggregation, the avatar is inserted
      * at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    def removeAction(/**
      * The action to remove or its index or id
      */
    vAction: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a action from the aggregation {@link #getAction action}.
      *
      * @returns The removed action or `null`
      */
    def removeAction(/**
      * The action to remove or its index or id
      */
    vAction: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeAction(
      /**
      * The action to remove or its index or id
      */
    vAction: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getAction action}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAction(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getAvatar avatar}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAvatar(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    def removeAvatar(/**
      * The avatar to remove or its index or id
      */
    vAvatar: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a avatar from the aggregation {@link #getAvatar avatar}.
      *
      * @returns The removed avatar or `null`
      */
    def removeAvatar(/**
      * The avatar to remove or its index or id
      */
    vAvatar: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeAvatar(
      /**
      * The avatar to remove or its index or id
      */
    vAvatar: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getInteractive interactive}.
      *
      * Defines if the component would be interactive, e.g gets hover effect, gets focus outline and `click`
      * event is fired, when pressed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setInteractive(): this.type = js.native
    def setInteractive(/**
      * New value for property `interactive`
      */
    bInteractive: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getStatus status}.
      *
      * Defines the status text.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setStatus(): this.type = js.native
    def setStatus(/**
      * New value for property `status`
      */
    sStatus: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSubtitleText subtitleText}.
      *
      * Defines the subtitle text.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSubtitleText(): this.type = js.native
    def setSubtitleText(/**
      * New value for property `subtitleText`
      */
    sSubtitleText: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitleText titleText}.
      *
      * Defines the title text.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitleText(): this.type = js.native
    def setTitleText(/**
      * New value for property `titleText`
      */
    sTitleText: String): this.type = js.native
  }
  
  trait CardHeader$ClickEventParameters extends StObject
  
  type CardHeaderClickEvent = typings.openui5.sapUiBaseEventMod.default[CardHeader$ClickEventParameters]
  
  type CardHeaderClickEventParameters = CardHeader$ClickEventParameters
  
  trait CardHeaderSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Defines an action, displayed in the right most part of the header.
      */
    var action: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines an avatar image, displayed in the left most part of the header.
      */
    var avatar: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fired when the component is activated by mouse/tap or by using the Enter or Space key.
      *
      *  **Note:** The event would be fired only if the `interactive` property is set to true.
      */
    var click: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
    
    /**
      * Defines if the component would be interactive, e.g gets hover effect, gets focus outline and `click`
      * event is fired, when pressed.
      */
    var interactive: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the status text.
      */
    var status: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the subtitle text.
      */
    var subtitleText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the title text.
      */
    var titleText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object CardHeaderSettings {
    
    inline def apply(): CardHeaderSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardHeaderSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CardHeaderSettings] (val x: Self) extends AnyVal {
      
      inline def setAction(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setActionVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "action", js.Array(value*))
      
      inline def setAvatar(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      inline def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
      
      inline def setAvatarVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "avatar", js.Array(value*))
      
      inline def setClick(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
      
      inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      inline def setInteractive(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
      
      inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
      
      inline def setStatus(value: String | PropertyBindingInfo): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setSubtitleText(value: String | PropertyBindingInfo): Self = StObject.set(x, "subtitleText", value.asInstanceOf[js.Any])
      
      inline def setSubtitleTextUndefined: Self = StObject.set(x, "subtitleText", js.undefined)
      
      inline def setTitleText(value: String | PropertyBindingInfo): Self = StObject.set(x, "titleText", value.asInstanceOf[js.Any])
      
      inline def setTitleTextUndefined: Self = StObject.set(x, "titleText", js.undefined)
    }
  }
}
