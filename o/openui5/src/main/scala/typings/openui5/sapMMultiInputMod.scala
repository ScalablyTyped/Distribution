package typings.openui5

import typings.openui5.anon.AddedTokens
import typings.openui5.anon.RemovedTokens
import typings.openui5.anon.SuggestionObject
import typings.openui5.sap.ClassInfo
import typings.openui5.sapMInputMod.InputSettings
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreLibraryMod.ISemanticFormContent
import typings.std.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMMultiInputMod {
  
  @JSImport("sap/m/MultiInput", JSImport.Default)
  @js.native
  /**
    * Constructor for a new MultiInput.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/multiinput/ Multi-Input Field}
    */
  open class default () extends MultiInput {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: MultiInputSettings) = this()
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
    mSettings: MultiInputSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: MultiInputSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_core_ISemanticFormContent: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/MultiInput", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.MultiInput with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.Input.extend}.
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
    oClassInfo: ClassInfo[T, MultiInput]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, MultiInput],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.MultiInput.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait MultiInput
    extends typings.openui5.sapMInputMod.default
       with ISemanticFormContent {
    
    /**
      * Adds some token to the aggregation {@link #getTokens tokens}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addToken(
      /**
      * The token to add; if empty, nothing is inserted
      */
    oToken: typings.openui5.sapMTokenMod.default
    ): this.type = js.native
    
    /**
      * Function validates the given text and adds a new token if validation was successful.
      */
    def addValidateToken(
      /**
      * Parameter bag containing the following fields:
      */
    oParameters: SuggestionObject,
      /**
      * [optional] Array of all validators to be used
      */
    aValidators: js.Array[js.Function]
    ): Unit = js.native
    
    /**
      * Function adds a validation callback called before any new token gets added to the tokens aggregation.
      */
    def addValidator(/**
      * The validation function
      */
    fValidator: js.Function): Unit = js.native
    
    /**
      * @deprecated (since 1.46) - Please use the new event tokenUpdate.
      *
      * Attaches event handler `fnFunction` to the {@link #event:tokenChange tokenChange} event of this `sap.m.MultiInput`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.MultiInput` itself.
      *
      * Fired when the tokens aggregation changed (add / remove token)
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachTokenChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachTokenChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.MultiInput` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @deprecated (since 1.46) - Please use the new event tokenUpdate.
      *
      * Attaches event handler `fnFunction` to the {@link #event:tokenChange tokenChange} event of this `sap.m.MultiInput`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.MultiInput` itself.
      *
      * Fired when the tokens aggregation changed (add / remove token)
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachTokenChange(
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
    def attachTokenChange(
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
      * Context object to call the event handler with. Defaults to this `sap.m.MultiInput` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.46
      *
      * Attaches event handler `fnFunction` to the {@link #event:tokenUpdate tokenUpdate} event of this `sap.m.MultiInput`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.MultiInput` itself.
      *
      * Fired when the tokens aggregation changed due to a user interaction (add / remove token)
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachTokenUpdate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachTokenUpdate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.MultiInput` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.46
      *
      * Attaches event handler `fnFunction` to the {@link #event:tokenUpdate tokenUpdate} event of this `sap.m.MultiInput`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.MultiInput` itself.
      *
      * Fired when the tokens aggregation changed due to a user interaction (add / remove token)
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachTokenUpdate(
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
    def attachTokenUpdate(
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
      * Context object to call the event handler with. Defaults to this `sap.m.MultiInput` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.28
      * @deprecated (since 1.58)
      *
      * Close multi-line MultiInput in multi-line mode
      */
    def closeMultiLine(): Unit = js.native
    
    /**
      * Destroys all the tokens in the aggregation {@link #getTokens tokens}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyTokens(): this.type = js.native
    
    /**
      * @deprecated (since 1.46) - Please use the new event tokenUpdate.
      *
      * Detaches event handler `fnFunction` from the {@link #event:tokenChange tokenChange} event of this `sap.m.MultiInput`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachTokenChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachTokenChange(
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
      * @SINCE 1.46
      *
      * Detaches event handler `fnFunction` from the {@link #event:tokenUpdate tokenUpdate} event of this `sap.m.MultiInput`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachTokenUpdate(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachTokenUpdate(
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
      * @deprecated (since 1.46) - Please use the new event tokenUpdate.
      *
      * Fires event {@link #event:tokenChange tokenChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireTokenChange(): this.type = js.native
    def fireTokenChange(/**
      * Parameters to pass along with the event
      */
    mParameters: AddedTokens): this.type = js.native
    
    /**
      * @SINCE 1.46
      *
      * Fires event {@link #event:tokenUpdate tokenUpdate} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireTokenUpdate(): Boolean = js.native
    def fireTokenUpdate(/**
      * Parameters to pass along with the event
      */
    mParameters: RemovedTokens): Boolean = js.native
    
    /**
      * Gets the picker header title.
      *
      * @returns The title instance of the Picker
      */
    def getDialogTitle(): typings.openui5.sapMTitleMod.default | Null = js.native
    
    /**
      * @SINCE 1.28
      * @deprecated (since 1.58) - Replaced with N-more/N-items labels, which work in all cases.
      *
      * Gets current value of property {@link #getEnableMultiLineMode enableMultiLineMode}.
      *
      * If set to true, the MultiInput will be displayed in multi-line display mode. In multi-line display mode,
      * all tokens can be fully viewed and easily edited in the MultiInput. The default value is false. **Note:**
      * This property does not take effect on smartphones or when the editable property is set to false. **Caution:**
      * Do not enable multi-line mode in tables and forms.
      *
      * Default value is `false`.
      *
      * @returns Value of property `enableMultiLineMode`
      */
    def getEnableMultiLineMode(): Boolean = js.native
    
    /**
      * @SINCE 1.36
      *
      * Gets current value of property {@link #getMaxTokens maxTokens}.
      *
      * The max number of tokens that is allowed in MultiInput.
      *
      * @returns Value of property `maxTokens`
      */
    def getMaxTokens(): int = js.native
    
    /**
      * Function returns domref which acts as reference point for the opening suggestion menu
      *
      * @returns The domref at which to open the suggestion menu
      */
    def getPopupAnchorDomRef(): Element = js.native
    
    /**
      * Gets content of aggregation {@link #getTokens tokens}.
      *
      * The currently displayed tokens
      */
    def getTokens(): js.Array[typings.openui5.sapMTokenMod.default] = js.native
    
    /**
      * Function returns all validation callbacks.
      *
      * @returns An array of token validation callbacks
      */
    def getValidators(): js.Array[js.Function] = js.native
    
    /**
      * Checks for the provided `sap.m.Token` in the aggregation {@link #getTokens tokens}. and returns its index
      * if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfToken(/**
      * The token whose index is looked for
      */
    oToken: typings.openui5.sapMTokenMod.default): int = js.native
    
    /**
      * Inserts a token into the aggregation {@link #getTokens tokens}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertToken(
      /**
      * The token to insert; if empty, nothing is inserted
      */
    oToken: typings.openui5.sapMTokenMod.default,
      /**
      * The `0`-based index the token should be inserted at; for a negative value of `iIndex`, the token is inserted
      * at position 0; for a value greater than the current size of the aggregation, the token is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * @SINCE 1.28
      * @deprecated (since 1.58)
      *
      * Expand multi-line MultiInput in multi-line mode
      */
    def openMultiLine(): Unit = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getTokens tokens}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllTokens(): js.Array[typings.openui5.sapMTokenMod.default] = js.native
    
    /**
      * Function removes all validation callbacks.
      */
    def removeAllValidators(): Unit = js.native
    
    def removeToken(/**
      * The token to remove or its index or id
      */
    vToken: String): typings.openui5.sapMTokenMod.default | Null = js.native
    /**
      * Removes a token from the aggregation {@link #getTokens tokens}.
      *
      * @returns The removed token or `null`
      */
    def removeToken(/**
      * The token to remove or its index or id
      */
    vToken: int): typings.openui5.sapMTokenMod.default | Null = js.native
    def removeToken(/**
      * The token to remove or its index or id
      */
    vToken: typings.openui5.sapMTokenMod.default): typings.openui5.sapMTokenMod.default | Null = js.native
    
    /**
      * Function removes a validation callback.
      */
    def removeValidator(/**
      * The validation function
      */
    fValidator: js.Function): Unit = js.native
    
    /**
      * @SINCE 1.28
      * @deprecated (since 1.58) - Replaced with N-more/N-items labels, which work in all cases.
      *
      * Sets a new value for property {@link #getEnableMultiLineMode enableMultiLineMode}.
      *
      * If set to true, the MultiInput will be displayed in multi-line display mode. In multi-line display mode,
      * all tokens can be fully viewed and easily edited in the MultiInput. The default value is false. **Note:**
      * This property does not take effect on smartphones or when the editable property is set to false. **Caution:**
      * Do not enable multi-line mode in tables and forms.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnableMultiLineMode(): this.type = js.native
    def setEnableMultiLineMode(/**
      * New value for property `enableMultiLineMode`
      */
    bEnableMultiLineMode: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.36
      *
      * Sets a new value for property {@link #getMaxTokens maxTokens}.
      *
      * The max number of tokens that is allowed in MultiInput.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMaxTokens(/**
      * New value for property `maxTokens`
      */
    iMaxTokens: int): this.type = js.native
    
    /**
      * Function sets an array of tokens, existing tokens will get overridden
      *
      * @returns Pointer to the control instance for chaining
      */
    def setTokens(/**
      * The new token set
      */
    aTokens: js.Array[typings.openui5.sapMTokenMod.default]): this.type = js.native
  }
  
  trait MultiInputSettings
    extends StObject
       with InputSettings {
    
    /**
      * @SINCE 1.28
      * @deprecated (since 1.58) - Replaced with N-more/N-items labels, which work in all cases.
      *
      * If set to true, the MultiInput will be displayed in multi-line display mode. In multi-line display mode,
      * all tokens can be fully viewed and easily edited in the MultiInput. The default value is false. **Note:**
      * This property does not take effect on smartphones or when the editable property is set to false. **Caution:**
      * Do not enable multi-line mode in tables and forms.
      */
    var enableMultiLineMode: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.36
      *
      * The max number of tokens that is allowed in MultiInput.
      */
    var maxTokens: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @deprecated (since 1.46) - Please use the new event tokenUpdate.
      *
      * Fired when the tokens aggregation changed (add / remove token)
      */
    var tokenChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.46
      *
      * Fired when the tokens aggregation changed due to a user interaction (add / remove token)
      */
    var tokenUpdate: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * The currently displayed tokens
      */
    var tokens: js.UndefOr[
        js.Array[typings.openui5.sapMTokenMod.default] | typings.openui5.sapMTokenMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object MultiInputSettings {
    
    inline def apply(): MultiInputSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MultiInputSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultiInputSettings] (val x: Self) extends AnyVal {
      
      inline def setEnableMultiLineMode(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableMultiLineMode", value.asInstanceOf[js.Any])
      
      inline def setEnableMultiLineModeUndefined: Self = StObject.set(x, "enableMultiLineMode", js.undefined)
      
      inline def setMaxTokens(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "maxTokens", value.asInstanceOf[js.Any])
      
      inline def setMaxTokensUndefined: Self = StObject.set(x, "maxTokens", js.undefined)
      
      inline def setTokenChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "tokenChange", js.Any.fromFunction1(value))
      
      inline def setTokenChangeUndefined: Self = StObject.set(x, "tokenChange", js.undefined)
      
      inline def setTokenUpdate(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "tokenUpdate", js.Any.fromFunction1(value))
      
      inline def setTokenUpdateUndefined: Self = StObject.set(x, "tokenUpdate", js.undefined)
      
      inline def setTokens(
        value: js.Array[typings.openui5.sapMTokenMod.default] | typings.openui5.sapMTokenMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
      
      inline def setTokensVarargs(value: typings.openui5.sapMTokenMod.default*): Self = StObject.set(x, "tokens", js.Array(value*))
    }
  }
}
