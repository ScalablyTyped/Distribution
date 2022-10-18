package typings.openui5

import typings.openui5.anon.Value
import typings.openui5.jQuery.Event
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCommonsComboBoxMod.ComboBoxSettings
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCommonsDropdownBoxMod {
  
  @JSImport("sap/ui/commons/DropdownBox", JSImport.Default)
  @js.native
  /**
    * Constructor for a new DropdownBox.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends DropdownBox {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: DropdownBoxSettings) = this()
    def this(/**
      * Id for the new control, generated automatically if no id is given
      */
    sId: String) = this()
    def this(
      /**
      * Id for the new control, generated automatically if no id is given
      */
    sId: String,
      /**
      * Initial settings for the new control
      */
    mSettings: DropdownBoxSettings
    ) = this()
    def this(
      /**
      * Id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: DropdownBoxSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/commons/DropdownBox", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.commons.DropdownBox with name `sClassName` and enriches it with
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
    oClassInfo: ClassInfo[T, DropdownBox]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, DropdownBox],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.commons.DropdownBox.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait DropdownBox
    extends typings.openui5.sapUiCommonsComboBoxMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:searchHelp searchHelp} event of this `sap.ui.commons.DropdownBox`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.DropdownBox` itself.
      *
      * Event fired whenever the configured searchHelpItem is clicked or the searchHelpItem is configured and
      * F4 key is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSearchHelp(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachSearchHelp(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.DropdownBox` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:searchHelp searchHelp} event of this `sap.ui.commons.DropdownBox`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.DropdownBox` itself.
      *
      * Event fired whenever the configured searchHelpItem is clicked or the searchHelpItem is configured and
      * F4 key is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSearchHelp(
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
    def attachSearchHelp(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.DropdownBox` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Using this method the history of the DropdownBox can be cleared. This might be necessary if the items
      * of the DropdownBox have changed. Otherwise invalid items may appear in the history.
      */
    def clearHistory(): Unit = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:searchHelp searchHelp} event of this `sap.ui.commons.DropdownBox`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSearchHelp(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachSearchHelp(
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
      * Fires event {@link #event:searchHelp searchHelp} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSearchHelp(): this.type = js.native
    def fireSearchHelp(/**
      * Parameters to pass along with the event
      */
    mParameters: Value): this.type = js.native
    
    /**
      * Gets current value of property {@link #getMaxHistoryItems maxHistoryItems}.
      *
      * Maximum number of history items in the list.
      *
      * If 0 no history is displayed or stored. The history is locally stored on the client. Therefore do not
      * activate this feature when this control handles confidential data.
      *
      * Default value is `0`.
      *
      * @returns Value of property `maxHistoryItems`
      */
    def getMaxHistoryItems(): int = js.native
    
    /**
      * Gets current value of property {@link #getSearchHelpAdditionalText searchHelpAdditionalText}.
      *
      * (optional) The additional Text to use for the search help entry.
      *
      * @returns Value of property `searchHelpAdditionalText`
      */
    def getSearchHelpAdditionalText(): String = js.native
    
    /**
      * Gets current value of property {@link #getSearchHelpEnabled searchHelpEnabled}.
      *
      * Whether the DropdownBox's search help should be enabled.
      *
      * Default value is `false`.
      *
      * @returns Value of property `searchHelpEnabled`
      */
    def getSearchHelpEnabled(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getSearchHelpIcon searchHelpIcon}.
      *
      * (optional) The URI of the icon to use for the search help entry.
      *
      * @returns Value of property `searchHelpIcon`
      */
    def getSearchHelpIcon(): URI = js.native
    
    /**
      * Gets current value of property {@link #getSearchHelpText searchHelpText}.
      *
      * (optional) The text to use for the search help entry.
      *
      * @returns Value of property `searchHelpText`
      */
    def getSearchHelpText(): String = js.native
    
    /**
      * Handle the click event happening in the DropdownBox
      */
    def onclick(/**
      * The event object.
      */
    oEvent: Event): Unit = js.native
    
    /**
      * Handle keydown event
      */
    def onkeydown(/**
      * the occuring event
      */
    oEvent: Event): Unit = js.native
    
    /**
      * Handle keypress event
      */
    def onkeypress(/**
      * the occuring event
      */
    oEvent: Event): Unit = js.native
    
    /**
      * Handle paste event
      */
    def onpaste(/**
      * the occuring event
      */
    oEvent: Event): Unit = js.native
    
    /**
      * Handle pseudo event onsapdelete. If triggered with open dropdown and current item provided by history
      * feature, removes the selected item from this instance's history.
      */
    def onsapdelete(/**
      * the occuring event
      */
    oEvent: Event): Unit = js.native
    
    /**
      * Handle pseudo event onsaphome
      */
    def onsaphome(/**
      * the occuring event
      */
    oEvent: Event): Unit = js.native
    
    /**
      * Move the cursor one step to the left (and adapt selection)
      */
    def onsapleft(/**
      * The event object.
      */
    oEvent: Event): Unit = js.native
    
    /**
      * Move the cursor one step to the right (and adapt selection)
      */
    def onsapright(/**
      * The event object.
      */
    oEvent: Event): Unit = js.native
    
    /**
      * Handle the select event happening in the DropdownBox
      */
    def onselect(/**
      * The event object.
      */
    oEvent: Event): Unit = js.native
    
    /**
      * Sets a new value for property {@link #getMaxHistoryItems maxHistoryItems}.
      *
      * Maximum number of history items in the list.
      *
      * If 0 no history is displayed or stored. The history is locally stored on the client. Therefore do not
      * activate this feature when this control handles confidential data.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `0`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMaxHistoryItems(): this.type = js.native
    def setMaxHistoryItems(/**
      * New value for property `maxHistoryItems`
      */
    iMaxHistoryItems: int): this.type = js.native
    
    /**
      * Overwrite of Setter for property `searchHelpAdditionalText`.
      *
      * Default value is empty/`undefined`
      *
      * @returns `this` to allow method chaining
      */
    def setSearchHelpAdditionalText(/**
      * new value for property `searchHelpAdditionalText`
      */
    sSearchHelpAdditionalText: String): this.type = js.native
    
    /**
      * Overwrite of Setter for property `searchHelpEnabled`. This method accepts additional parameter to be
      * compatiple with the previous functionality
      *
      * Default value is `false`
      *
      * @returns `this` to allow method chaining
      */
    def setSearchHelpEnabled(
      /**
      * new value for property `searchHelpEnabled`
      */
    bEnabled: Boolean,
      /**
      * new value for property `searchHelpText`
      */
    sText: String,
      /**
      * new value for property `searchHelpAdditionalText`
      */
    sAdditionalText: String,
      /**
      * new value for property `searchHelpIcon`
      */
    sIcon: String
    ): this.type = js.native
    
    /**
      * Overwrite of Setter for property `searchHelpIcon`.
      *
      * Default value is empty/`undefined`
      *
      * @returns `this` to allow method chaining
      */
    def setSearchHelpIcon(/**
      * new value for property `searchHelpIcon`
      */
    sSearchHelpIcon: URI): this.type = js.native
    
    /**
      * Overwrite of Setter for property `searchHelpText`.
      *
      * Default value is empty/`undefined`
      *
      * @returns `this` to allow method chaining
      */
    def setSearchHelpText(/**
      * new value for property `searchHelpText`
      */
    sSearchHelpText: String): this.type = js.native
  }
  
  trait DropdownBoxSettings
    extends StObject
       with ComboBoxSettings {
    
    /**
      * Maximum number of history items in the list.
      *
      * If 0 no history is displayed or stored. The history is locally stored on the client. Therefore do not
      * activate this feature when this control handles confidential data.
      */
    var maxHistoryItems: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Event fired whenever the configured searchHelpItem is clicked or the searchHelpItem is configured and
      * F4 key is pressed.
      */
    var searchHelp: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * (optional) The additional Text to use for the search help entry.
      */
    var searchHelpAdditionalText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Whether the DropdownBox's search help should be enabled.
      */
    var searchHelpEnabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * (optional) The URI of the icon to use for the search help entry.
      */
    var searchHelpIcon: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * (optional) The text to use for the search help entry.
      */
    var searchHelpText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object DropdownBoxSettings {
    
    inline def apply(): DropdownBoxSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropdownBoxSettings]
    }
    
    extension [Self <: DropdownBoxSettings](x: Self) {
      
      inline def setMaxHistoryItems(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "maxHistoryItems", value.asInstanceOf[js.Any])
      
      inline def setMaxHistoryItemsUndefined: Self = StObject.set(x, "maxHistoryItems", js.undefined)
      
      inline def setSearchHelp(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "searchHelp", js.Any.fromFunction1(value))
      
      inline def setSearchHelpAdditionalText(value: String | PropertyBindingInfo): Self = StObject.set(x, "searchHelpAdditionalText", value.asInstanceOf[js.Any])
      
      inline def setSearchHelpAdditionalTextUndefined: Self = StObject.set(x, "searchHelpAdditionalText", js.undefined)
      
      inline def setSearchHelpEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "searchHelpEnabled", value.asInstanceOf[js.Any])
      
      inline def setSearchHelpEnabledUndefined: Self = StObject.set(x, "searchHelpEnabled", js.undefined)
      
      inline def setSearchHelpIcon(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "searchHelpIcon", value.asInstanceOf[js.Any])
      
      inline def setSearchHelpIconUndefined: Self = StObject.set(x, "searchHelpIcon", js.undefined)
      
      inline def setSearchHelpText(value: String | PropertyBindingInfo): Self = StObject.set(x, "searchHelpText", value.asInstanceOf[js.Any])
      
      inline def setSearchHelpTextUndefined: Self = StObject.set(x, "searchHelpText", js.undefined)
      
      inline def setSearchHelpUndefined: Self = StObject.set(x, "searchHelp", js.undefined)
    }
  }
}
