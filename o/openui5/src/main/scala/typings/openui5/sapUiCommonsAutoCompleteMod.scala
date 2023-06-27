package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCommonsComboBoxMod.ComboBoxSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCommonsAutoCompleteMod {
  
  @JSImport("sap/ui/commons/AutoComplete", JSImport.Default)
  @js.native
  /**
    * Constructor for a new AutoComplete.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends AutoComplete {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: AutoCompleteSettings) = this()
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
    mSettings: AutoCompleteSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: AutoCompleteSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/commons/AutoComplete", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.commons.AutoComplete with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.commons.ComboBox.extend}.
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
    oClassInfo: ClassInfo[T, AutoComplete]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, AutoComplete],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.commons.AutoComplete.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait AutoComplete
    extends typings.openui5.sapUiCommonsComboBoxMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:suggest suggest} event of this `sap.ui.commons.AutoComplete`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.AutoComplete` itself.
      *
      * Fired when the user has changed the value and a suggestion list update should occur.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSuggest(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ AutoCompleteSuggestEvent, Unit]
    ): this.type = js.native
    def attachSuggest(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ AutoCompleteSuggestEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.AutoComplete` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:suggest suggest} event of this `sap.ui.commons.AutoComplete`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.AutoComplete` itself.
      *
      * Fired when the user has changed the value and a suggestion list update should occur.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSuggest(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ AutoCompleteSuggestEvent, Unit]
    ): this.type = js.native
    def attachSuggest(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ AutoCompleteSuggestEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.AutoComplete` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:suggest suggest} event of this `sap.ui.commons.AutoComplete`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSuggest(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ AutoCompleteSuggestEvent, Unit]
    ): this.type = js.native
    def detachSuggest(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ AutoCompleteSuggestEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:suggest suggest} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSuggest(): this.type = js.native
    def fireSuggest(
      /**
      * Parameters to pass along with the event
      */
    mParameters: AutoComplete$SuggestEventParameters
    ): this.type = js.native
    
    /**
      * Gets current value of property {@link #getEnableScrolling enableScrolling}.
      *
      * Determines whether scrolling should be enabled when the number of items is higher than maxPopupItems.
      * If set to false only the first n items (n=maxPopupItems) are shown.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enableScrolling`
      */
    def getEnableScrolling(): Boolean = js.native
    
    /**
      * Sets a new value for property {@link #getEnableScrolling enableScrolling}.
      *
      * Determines whether scrolling should be enabled when the number of items is higher than maxPopupItems.
      * If set to false only the first n items (n=maxPopupItems) are shown.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnableScrolling(): this.type = js.native
    def setEnableScrolling(/**
      * New value for property `enableScrolling`
      */
    bEnableScrolling: Boolean): this.type = js.native
    
    /**
      * Sets a custom filter function for items. Default is to check whether the item text begins with the typed
      * value.
      *
      * Example: ` function(sValue, oItem){ return jQuery.sap.startsWithIgnoreCase(oItem.getText(), sValue);
      * } `
      */
    def setFilterFunction(): Unit = js.native
    def setFilterFunction(
      /**
      * The filter function. If not set the default filter function will be used.
      */
    fFilter: js.Function
    ): Unit = js.native
  }
  
  trait AutoComplete$SuggestEventParameters extends StObject {
    
    /**
      * The current value which was typed in.
      */
    var suggestValue: js.UndefOr[String] = js.undefined
  }
  object AutoComplete$SuggestEventParameters {
    
    inline def apply(): AutoComplete$SuggestEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoComplete$SuggestEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutoComplete$SuggestEventParameters] (val x: Self) extends AnyVal {
      
      inline def setSuggestValue(value: String): Self = StObject.set(x, "suggestValue", value.asInstanceOf[js.Any])
      
      inline def setSuggestValueUndefined: Self = StObject.set(x, "suggestValue", js.undefined)
    }
  }
  
  trait AutoCompleteSettings
    extends StObject
       with ComboBoxSettings {
    
    /**
      * Determines whether scrolling should be enabled when the number of items is higher than maxPopupItems.
      * If set to false only the first n items (n=maxPopupItems) are shown.
      */
    var enableScrolling: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fired when the user has changed the value and a suggestion list update should occur.
      */
    var suggest: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[AutoComplete$SuggestEventParameters], 
          Unit
        ]
      ] = js.undefined
  }
  object AutoCompleteSettings {
    
    inline def apply(): AutoCompleteSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoCompleteSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutoCompleteSettings] (val x: Self) extends AnyVal {
      
      inline def setEnableScrolling(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableScrolling", value.asInstanceOf[js.Any])
      
      inline def setEnableScrollingUndefined: Self = StObject.set(x, "enableScrolling", js.undefined)
      
      inline def setSuggest(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[AutoComplete$SuggestEventParameters] => Unit
      ): Self = StObject.set(x, "suggest", js.Any.fromFunction1(value))
      
      inline def setSuggestUndefined: Self = StObject.set(x, "suggest", js.undefined)
    }
  }
  
  type AutoCompleteSuggestEvent = typings.openui5.sapUiBaseEventMod.default[AutoComplete$SuggestEventParameters]
  
  type AutoCompleteSuggestEventParameters = AutoComplete$SuggestEventParameters
}
