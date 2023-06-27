package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiWebcFioriLibraryMod.IShellBarItem
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcFioriShellBarItemMod {
  
  @JSImport("sap/ui/webc/fiori/ShellBarItem", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `ShellBarItem`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ShellBarItem {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ShellBarItemSettings) = this()
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
    mSettings: ShellBarItemSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ShellBarItemSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_webc_fiori_IShellBarItem: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/webc/fiori/ShellBarItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.fiori.ShellBarItem with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, ShellBarItem]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ShellBarItem],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.webc.fiori.ShellBarItem.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait ShellBarItem
    extends typings.openui5.sapUiWebcCommonWebComponentMod.default
       with IShellBarItem {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:click click} event of this `sap.ui.webc.fiori.ShellBarItem`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.ShellBarItem` itself.
      *
      * Fired, when the item is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachClick(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarItemClickEvent, Unit]
    ): this.type = js.native
    def attachClick(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarItemClickEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.ShellBarItem` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:click click} event of this `sap.ui.webc.fiori.ShellBarItem`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.ShellBarItem` itself.
      *
      * Fired, when the item is pressed.
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
    fnFunction: js.Function1[/* p1 */ ShellBarItemClickEvent, Unit]
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
    fnFunction: js.Function1[/* p1 */ ShellBarItemClickEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.ShellBarItem` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:click click} event of this `sap.ui.webc.fiori.ShellBarItem`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachClick(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarItemClickEvent, Unit]
    ): this.type = js.native
    def detachClick(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ShellBarItemClickEvent, Unit],
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
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireClick(): Boolean = js.native
    def fireClick(
      /**
      * Parameters to pass along with the event
      */
    mParameters: ShellBarItem$ClickEventParameters
    ): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getCount count}.
      *
      * Defines the count displayed in the top-right corner.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `count`
      */
    def getCount(): String = js.native
    
    /**
      * Gets current value of property {@link #getIcon icon}.
      *
      * Defines the name of the item's icon.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `icon`
      */
    def getIcon(): String = js.native
    
    /**
      * Gets current value of property {@link #getText text}.
      *
      * Defines the item text.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `text`
      */
    def getText(): String = js.native
    
    /**
      * Sets a new value for property {@link #getCount count}.
      *
      * Defines the count displayed in the top-right corner.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCount(): this.type = js.native
    def setCount(/**
      * New value for property `count`
      */
    sCount: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIcon icon}.
      *
      * Defines the name of the item's icon.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIcon(): this.type = js.native
    def setIcon(/**
      * New value for property `icon`
      */
    sIcon: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getText text}.
      *
      * Defines the item text.
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
  
  trait ShellBarItem$ClickEventParameters extends StObject {
    
    /**
      * DOM ref of the clicked element
      */
    var targetRef: js.UndefOr[HTMLElement] = js.undefined
  }
  object ShellBarItem$ClickEventParameters {
    
    inline def apply(): ShellBarItem$ClickEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShellBarItem$ClickEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShellBarItem$ClickEventParameters] (val x: Self) extends AnyVal {
      
      inline def setTargetRef(value: HTMLElement): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
      
      inline def setTargetRefUndefined: Self = StObject.set(x, "targetRef", js.undefined)
    }
  }
  
  type ShellBarItemClickEvent = typings.openui5.sapUiBaseEventMod.default[ShellBarItem$ClickEventParameters]
  
  type ShellBarItemClickEventParameters = ShellBarItem$ClickEventParameters
  
  trait ShellBarItemSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Fired, when the item is pressed.
      */
    var click: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ShellBarItem$ClickEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Defines the count displayed in the top-right corner.
      */
    var count: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the name of the item's icon.
      */
    var icon: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the item text.
      */
    var text: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object ShellBarItemSettings {
    
    inline def apply(): ShellBarItemSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShellBarItemSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShellBarItemSettings] (val x: Self) extends AnyVal {
      
      inline def setClick(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ShellBarItem$ClickEventParameters] => Unit
      ): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
      
      inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      inline def setCount(value: String | PropertyBindingInfo): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setIcon(value: String | PropertyBindingInfo): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setText(value: String | PropertyBindingInfo): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
