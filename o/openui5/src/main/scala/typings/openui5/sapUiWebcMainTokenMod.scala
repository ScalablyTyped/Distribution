package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiWebcMainLibraryMod.IIcon
import typings.openui5.sapUiWebcMainLibraryMod.IToken
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcMainTokenMod {
  
  @JSImport("sap/ui/webc/main/Token", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `Token`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Token {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: TokenSettings) = this()
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
    mSettings: TokenSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: TokenSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_webc_main_IToken: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/webc/main/Token", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.main.Token with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, Token]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Token],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.webc.main.Token.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait Token
    extends typings.openui5.sapUiWebcCommonWebComponentMod.default
       with IToken {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:select select} event of this `sap.ui.webc.main.Token`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.Token` itself.
      *
      * Fired when the the component is selected by user interaction with mouse or by clicking space.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.Token` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:select select} event of this `sap.ui.webc.main.Token`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.Token` itself.
      *
      * Fired when the the component is selected by user interaction with mouse or by clicking space.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelect(
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
    def attachSelect(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.Token` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys the closeIcon in the aggregation {@link #getCloseIcon closeIcon}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyCloseIcon(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:select select} event of this `sap.ui.webc.main.Token`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSelect(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def detachSelect(
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
      * Fires event {@link #event:select select} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSelect(): this.type = js.native
    def fireSelect(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getCloseIcon closeIcon}.
      *
      * Defines the close icon for the token. If nothing is provided to this slot, the default close icon will
      * be used. Accepts `sap.ui.webc.main.Icon`.
      */
    def getCloseIcon(): IIcon = js.native
    
    /**
      * Gets current value of property {@link #getReadonly readonly}.
      *
      * Defines whether the component is read-only.
      *
      *  **Note:** A read-only component can not be deleted or selected, but still provides visual feedback upon
      * user interaction.
      *
      * @returns Value of property `readonly`
      */
    def getReadonly(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getSelected selected}.
      *
      * Defines whether the component is selected or not.
      *
      * @returns Value of property `selected`
      */
    def getSelected(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getText text}.
      *
      * Defines the text of the token.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `text`
      */
    def getText(): String = js.native
    
    /**
      * Sets the aggregated {@link #getCloseIcon closeIcon}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCloseIcon(/**
      * The closeIcon to set
      */
    oCloseIcon: IIcon): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getReadonly readonly}.
      *
      * Defines whether the component is read-only.
      *
      *  **Note:** A read-only component can not be deleted or selected, but still provides visual feedback upon
      * user interaction.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setReadonly(/**
      * New value for property `readonly`
      */
    bReadonly: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSelected selected}.
      *
      * Defines whether the component is selected or not.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSelected(/**
      * New value for property `selected`
      */
    bSelected: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getText text}.
      *
      * Defines the text of the token.
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
  
  trait Token$SelectEventParameters extends StObject
  
  type TokenSelectEvent = typings.openui5.sapUiBaseEventMod.default[Token$SelectEventParameters]
  
  type TokenSelectEventParameters = Token$SelectEventParameters
  
  trait TokenSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Defines the close icon for the token. If nothing is provided to this slot, the default close icon will
      * be used. Accepts `sap.ui.webc.main.Icon`.
      */
    var closeIcon: js.UndefOr[IIcon] = js.undefined
    
    /**
      * Defines whether the component is read-only.
      *
      *  **Note:** A read-only component can not be deleted or selected, but still provides visual feedback upon
      * user interaction.
      */
    var readonly: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fired when the the component is selected by user interaction with mouse or by clicking space.
      */
    var select: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
    
    /**
      * Defines whether the component is selected or not.
      */
    var selected: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the text of the token.
      */
    var text: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object TokenSettings {
    
    inline def apply(): TokenSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TokenSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TokenSettings] (val x: Self) extends AnyVal {
      
      inline def setCloseIcon(value: IIcon): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      inline def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      inline def setReadonly(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
      
      inline def setSelect(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setSelected(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setText(value: String | PropertyBindingInfo): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
