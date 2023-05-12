package typings.openui5

import typings.openui5.anon.ItemTargetRef
import typings.openui5.anon.Token
import typings.openui5.anon.`13`
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.IFormContent
import typings.openui5.sapUiCoreLibraryMod.ISemanticFormContent
import typings.openui5.sapUiCoreLibraryMod.ValueState
import typings.openui5.sapUiWebcMainLibraryMod.IIcon
import typings.openui5.sapUiWebcMainLibraryMod.IInputSuggestionItem
import typings.openui5.sapUiWebcMainLibraryMod.IToken
import typings.openui5.sapUiWebcMainLibraryMod.InputType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcMainMultiInputMod {
  
  @JSImport("sap/ui/webc/main/MultiInput", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `MultiInput`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
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
    var __implements__sap_ui_core_IFormContent: Boolean = js.native
    
    /* CompleteClass */
    var __implements__sap_ui_core_ISemanticFormContent: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/webc/main/MultiInput", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.main.MultiInput with name `sClassName` and enriches it with
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
      * Returns a metadata object for class sap.ui.webc.main.MultiInput.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait MultiInput
    extends typings.openui5.sapUiWebcCommonWebComponentMod.default
       with IFormContent
       with ISemanticFormContent {
    
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
      * Adds some icon to the aggregation {@link #getIcon icon}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addIcon(/**
      * The icon to add; if empty, nothing is inserted
      */
    oIcon: IIcon): this.type = js.native
    
    /**
      * Adds some suggestionItem to the aggregation {@link #getSuggestionItems suggestionItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addSuggestionItem(
      /**
      * The suggestionItem to add; if empty, nothing is inserted
      */
    oSuggestionItem: IInputSuggestionItem
    ): this.type = js.native
    
    /**
      * Adds some token to the aggregation {@link #getTokens tokens}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addToken(/**
      * The token to add; if empty, nothing is inserted
      */
    oToken: IToken): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:change change} event of this `sap.ui.webc.main.MultiInput`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.MultiInput` itself.
      *
      * Fired when the input operation has finished by pressing Enter or on focusout.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.MultiInput` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:change change} event of this `sap.ui.webc.main.MultiInput`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.MultiInput` itself.
      *
      * Fired when the input operation has finished by pressing Enter or on focusout.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachChange(
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
    def attachChange(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.MultiInput` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:input input} event of this `sap.ui.webc.main.MultiInput`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.MultiInput` itself.
      *
      * Fired when the value of the component changes at each keystroke, and when a suggestion item has been
      * selected.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachInput(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachInput(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.MultiInput` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:input input} event of this `sap.ui.webc.main.MultiInput`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.MultiInput` itself.
      *
      * Fired when the value of the component changes at each keystroke, and when a suggestion item has been
      * selected.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachInput(
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
    def attachInput(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.MultiInput` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:suggestionItemPreview suggestionItemPreview}
      * event of this `sap.ui.webc.main.MultiInput`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.MultiInput` itself.
      *
      * Fired when the user navigates to a suggestion item via the ARROW keys, as a preview, before the final
      * selection.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSuggestionItemPreview(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachSuggestionItemPreview(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.MultiInput` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:suggestionItemPreview suggestionItemPreview}
      * event of this `sap.ui.webc.main.MultiInput`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.MultiInput` itself.
      *
      * Fired when the user navigates to a suggestion item via the ARROW keys, as a preview, before the final
      * selection.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSuggestionItemPreview(
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
    def attachSuggestionItemPreview(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.MultiInput` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:suggestionItemSelect suggestionItemSelect} event
      * of this `sap.ui.webc.main.MultiInput`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.MultiInput` itself.
      *
      * Fired when a suggestion item, that is displayed in the suggestion popup, is selected.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSuggestionItemSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachSuggestionItemSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.MultiInput` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:suggestionItemSelect suggestionItemSelect} event
      * of this `sap.ui.webc.main.MultiInput`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.MultiInput` itself.
      *
      * Fired when a suggestion item, that is displayed in the suggestion popup, is selected.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSuggestionItemSelect(
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
    def attachSuggestionItemSelect(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.MultiInput` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:tokenDelete tokenDelete} event of this `sap.ui.webc.main.MultiInput`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.MultiInput` itself.
      *
      * Fired when a token is about to be deleted.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachTokenDelete(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachTokenDelete(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.MultiInput` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:tokenDelete tokenDelete} event of this `sap.ui.webc.main.MultiInput`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.MultiInput` itself.
      *
      * Fired when a token is about to be deleted.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachTokenDelete(
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
    def attachTokenDelete(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.MultiInput` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:valueHelpTrigger valueHelpTrigger} event of
      * this `sap.ui.webc.main.MultiInput`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.MultiInput` itself.
      *
      * Fired when the value help icon is pressed and F4 or ALT/OPTION + ARROW_UP/ARROW_DOWN keyboard keys are
      * used.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachValueHelpTrigger(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachValueHelpTrigger(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.MultiInput` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:valueHelpTrigger valueHelpTrigger} event of
      * this `sap.ui.webc.main.MultiInput`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.MultiInput` itself.
      *
      * Fired when the value help icon is pressed and F4 or ALT/OPTION + ARROW_UP/ARROW_DOWN keyboard keys are
      * used.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachValueHelpTrigger(
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
    def attachValueHelpTrigger(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.MultiInput` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the icon in the aggregation {@link #getIcon icon}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyIcon(): this.type = js.native
    
    /**
      * Destroys all the suggestionItems in the aggregation {@link #getSuggestionItems suggestionItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySuggestionItems(): this.type = js.native
    
    /**
      * Destroys all the tokens in the aggregation {@link #getTokens tokens}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyTokens(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:change change} event of this `sap.ui.webc.main.MultiInput`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachChange(
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
      * Detaches event handler `fnFunction` from the {@link #event:input input} event of this `sap.ui.webc.main.MultiInput`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachInput(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachInput(
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
      * Detaches event handler `fnFunction` from the {@link #event:suggestionItemPreview suggestionItemPreview}
      * event of this `sap.ui.webc.main.MultiInput`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSuggestionItemPreview(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachSuggestionItemPreview(
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
      * Detaches event handler `fnFunction` from the {@link #event:suggestionItemSelect suggestionItemSelect}
      * event of this `sap.ui.webc.main.MultiInput`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSuggestionItemSelect(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachSuggestionItemSelect(
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
      * Detaches event handler `fnFunction` from the {@link #event:tokenDelete tokenDelete} event of this `sap.ui.webc.main.MultiInput`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachTokenDelete(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachTokenDelete(
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
      * Detaches event handler `fnFunction` from the {@link #event:valueHelpTrigger valueHelpTrigger} event of
      * this `sap.ui.webc.main.MultiInput`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachValueHelpTrigger(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachValueHelpTrigger(
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
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:change change} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireChange(): this.type = js.native
    def fireChange(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:input input} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireInput(): this.type = js.native
    def fireInput(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:suggestionItemPreview suggestionItemPreview} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSuggestionItemPreview(): this.type = js.native
    def fireSuggestionItemPreview(/**
      * Parameters to pass along with the event
      */
    mParameters: ItemTargetRef): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:suggestionItemSelect suggestionItemSelect} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSuggestionItemSelect(): this.type = js.native
    def fireSuggestionItemSelect(/**
      * Parameters to pass along with the event
      */
    mParameters: `13`): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:tokenDelete tokenDelete} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireTokenDelete(): this.type = js.native
    def fireTokenDelete(/**
      * Parameters to pass along with the event
      */
    mParameters: Token): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:valueHelpTrigger valueHelpTrigger} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireValueHelpTrigger(): this.type = js.native
    def fireValueHelpTrigger(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Gets current value of property {@link #getAccessibleName accessibleName}.
      *
      * Defines the accessible aria name of the component.
      *
      * @returns Value of property `accessibleName`
      */
    def getAccessibleName(): String = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy
      * ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Gets current value of property {@link #getEnabled enabled}.
      *
      * Defines whether the control is enabled. A disabled control can't be interacted with, and it is not in
      * the tab chain.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enabled`
      */
    def getEnabled(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getIcon icon}.
      *
      * Defines the icon to be displayed in the component.
      */
    def getIcon(): js.Array[IIcon] = js.native
    
    /**
      * Gets current value of property {@link #getMaxlength maxlength}.
      *
      * Sets the maximum number of characters available in the input field.
      *
      *  **Note:** This property is not compatible with the ui5-input type InputType.Number. If the ui5-input
      * type is set to Number, the maxlength value is ignored.
      *
      * @returns Value of property `maxlength`
      */
    def getMaxlength(): int = js.native
    
    /**
      * Gets current value of property {@link #getName name}.
      *
      * Determines the name with which the component will be submitted in an HTML form.
      *
      *
      *
      *  **Note:** When set, a native `input` HTML element will be created inside the component so that it can
      * be submitted as part of an HTML form. Do not use this property unless you need to submit a form.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `name`
      */
    def getName(): String = js.native
    
    /**
      * Gets current value of property {@link #getNoTypeahead noTypeahead}.
      *
      * Defines whether the value will be autcompleted to match an item
      *
      * Default value is `false`.
      *
      * @returns Value of property `noTypeahead`
      */
    def getNoTypeahead(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getPlaceholder placeholder}.
      *
      * Defines a short hint intended to aid the user with data entry when the component has no value.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `placeholder`
      */
    def getPlaceholder(): String = js.native
    
    /**
      * Returns the the suggestion item on preview.
      */
    def getPreviewItem(): Unit = js.native
    
    /**
      * Gets current value of property {@link #getReadonly readonly}.
      *
      * Defines whether the component is read-only.
      *
      *  **Note:** A read-only component is not editable, but still provides visual feedback upon user interaction.
      *
      * Default value is `false`.
      *
      * @returns Value of property `readonly`
      */
    def getReadonly(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getRequired required}.
      *
      * Defines whether the component is required.
      *
      * Default value is `false`.
      *
      * @returns Value of property `required`
      */
    def getRequired(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowClearIcon showClearIcon}.
      *
      * Defines whether the clear icon of the input will be shown.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showClearIcon`
      */
    def getShowClearIcon(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowSuggestions showSuggestions}.
      *
      * Defines whether the component should show suggestions, if such are present.
      *
      *  **Note:** You need to import the `InputSuggestions` module from `"@ui5/webcomponents/dist/features/InputSuggestions.js"`
      * to enable this functionality.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showSuggestions`
      */
    def getShowSuggestions(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowValueHelpIcon showValueHelpIcon}.
      *
      * Determines whether a value help icon will be visualized in the end of the input. Pressing the icon will
      * fire `value-help-trigger` event.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showValueHelpIcon`
      */
    def getShowValueHelpIcon(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getSuggestionItems suggestionItems}.
      */
    def getSuggestionItems(): js.Array[IInputSuggestionItem] = js.native
    
    /**
      * Gets content of aggregation {@link #getTokens tokens}.
      *
      * Defines the component tokens.
      */
    def getTokens(): js.Array[IToken] = js.native
    
    /**
      * Gets current value of property {@link #getType type}.
      *
      * Defines the HTML type of the component. Available options are: `Text`, `Email`, `Number`, `Password`,
      * `Tel`, and `URL`.
      *
      *  **Notes:**
      * 	 - The particular effect of this property differs depending on the browser and the current language
      * 			settings, especially for type `Number`.
      * 	 - The property is mostly intended to be used with touch devices that use different soft keyboard layouts
      * 			depending on the given input type.
      *
      * Default value is `Text`.
      *
      * @returns Value of property `type`
      */
    def getType(): InputType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof InputType * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getValue value}.
      *
      * Defines the value of the component.
      *
      *  **Note:** The property is updated upon typing.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `value`
      */
    def getValue(): String = js.native
    
    /**
      * Gets current value of property {@link #getValueState valueState}.
      *
      * Defines the value state of the component.
      *
      *  Available options are:
      * 	 - `None`
      * 	 - `Error`
      * 	 - `Warning`
      * 	 - `Success`
      * 	 - `Information`
      *
      * Default value is `None`.
      *
      * @returns Value of property `valueState`
      */
    def getValueState(): ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getValueStateMessage valueStateMessage}.
      *
      * Defines the value state message that will be displayed as pop up under the contorl.
      *
      *
      *
      * **Note:** If not specified, a default text (in the respective language) will be displayed.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `valueStateMessage`
      */
    def getValueStateMessage(): String = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Defines the width of the control
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Checks for the provided `sap.ui.webc.main.IIcon` in the aggregation {@link #getIcon icon}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfIcon(/**
      * The icon whose index is looked for
      */
    oIcon: IIcon): int = js.native
    
    /**
      * Checks for the provided `sap.ui.webc.main.IInputSuggestionItem` in the aggregation {@link #getSuggestionItems
      * suggestionItems}. and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfSuggestionItem(/**
      * The suggestionItem whose index is looked for
      */
    oSuggestionItem: IInputSuggestionItem): int = js.native
    
    /**
      * Checks for the provided `sap.ui.webc.main.IToken` in the aggregation {@link #getTokens tokens}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfToken(/**
      * The token whose index is looked for
      */
    oToken: IToken): int = js.native
    
    /**
      * Inserts a icon into the aggregation {@link #getIcon icon}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertIcon(
      /**
      * The icon to insert; if empty, nothing is inserted
      */
    oIcon: IIcon,
      /**
      * The `0`-based index the icon should be inserted at; for a negative value of `iIndex`, the icon is inserted
      * at position 0; for a value greater than the current size of the aggregation, the icon is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a suggestionItem into the aggregation {@link #getSuggestionItems suggestionItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertSuggestionItem(
      /**
      * The suggestionItem to insert; if empty, nothing is inserted
      */
    oSuggestionItem: IInputSuggestionItem,
      /**
      * The `0`-based index the suggestionItem should be inserted at; for a negative value of `iIndex`, the suggestionItem
      * is inserted at position 0; for a value greater than the current size of the aggregation, the suggestionItem
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a token into the aggregation {@link #getTokens tokens}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertToken(
      /**
      * The token to insert; if empty, nothing is inserted
      */
    oToken: IToken,
      /**
      * The `0`-based index the token should be inserted at; for a negative value of `iIndex`, the token is inserted
      * at position 0; for a value greater than the current size of the aggregation, the token is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Manually opens the suggestions popover, assuming suggestions are enabled. Items must be preloaded for
      * it to open.
      */
    def openPicker(): Unit = js.native
    
    /**
      * Removes all the controls in the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getIcon icon}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllIcon(): js.Array[IIcon] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getSuggestionItems suggestionItems}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllSuggestionItems(): js.Array[IInputSuggestionItem] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getTokens tokens}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllTokens(): js.Array[IToken] = js.native
    
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
    
    def removeIcon(/**
      * The icon to remove or its index or id
      */
    vIcon: String): IIcon | Null = js.native
    /**
      * Removes a icon from the aggregation {@link #getIcon icon}.
      *
      * @returns The removed icon or `null`
      */
    def removeIcon(/**
      * The icon to remove or its index or id
      */
    vIcon: int): IIcon | Null = js.native
    def removeIcon(/**
      * The icon to remove or its index or id
      */
    vIcon: IIcon): IIcon | Null = js.native
    
    def removeSuggestionItem(/**
      * The suggestionItem to remove or its index or id
      */
    vSuggestionItem: String): IInputSuggestionItem | Null = js.native
    /**
      * Removes a suggestionItem from the aggregation {@link #getSuggestionItems suggestionItems}.
      *
      * @returns The removed suggestionItem or `null`
      */
    def removeSuggestionItem(/**
      * The suggestionItem to remove or its index or id
      */
    vSuggestionItem: int): IInputSuggestionItem | Null = js.native
    def removeSuggestionItem(/**
      * The suggestionItem to remove or its index or id
      */
    vSuggestionItem: IInputSuggestionItem): IInputSuggestionItem | Null = js.native
    
    def removeToken(/**
      * The token to remove or its index or id
      */
    vToken: String): IToken | Null = js.native
    /**
      * Removes a token from the aggregation {@link #getTokens tokens}.
      *
      * @returns The removed token or `null`
      */
    def removeToken(/**
      * The token to remove or its index or id
      */
    vToken: int): IToken | Null = js.native
    def removeToken(/**
      * The token to remove or its index or id
      */
    vToken: IToken): IToken | Null = js.native
    
    /**
      * Sets a new value for property {@link #getAccessibleName accessibleName}.
      *
      * Defines the accessible aria name of the component.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAccessibleName(/**
      * New value for property `accessibleName`
      */
    sAccessibleName: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getEnabled enabled}.
      *
      * Defines whether the control is enabled. A disabled control can't be interacted with, and it is not in
      * the tab chain.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnabled(): this.type = js.native
    def setEnabled(/**
      * New value for property `enabled`
      */
    bEnabled: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMaxlength maxlength}.
      *
      * Sets the maximum number of characters available in the input field.
      *
      *  **Note:** This property is not compatible with the ui5-input type InputType.Number. If the ui5-input
      * type is set to Number, the maxlength value is ignored.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMaxlength(/**
      * New value for property `maxlength`
      */
    iMaxlength: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getName name}.
      *
      * Determines the name with which the component will be submitted in an HTML form.
      *
      *
      *
      *  **Note:** When set, a native `input` HTML element will be created inside the component so that it can
      * be submitted as part of an HTML form. Do not use this property unless you need to submit a form.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setName(): this.type = js.native
    def setName(/**
      * New value for property `name`
      */
    sName: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getNoTypeahead noTypeahead}.
      *
      * Defines whether the value will be autcompleted to match an item
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setNoTypeahead(): this.type = js.native
    def setNoTypeahead(/**
      * New value for property `noTypeahead`
      */
    bNoTypeahead: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getPlaceholder placeholder}.
      *
      * Defines a short hint intended to aid the user with data entry when the component has no value.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPlaceholder(): this.type = js.native
    def setPlaceholder(/**
      * New value for property `placeholder`
      */
    sPlaceholder: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getReadonly readonly}.
      *
      * Defines whether the component is read-only.
      *
      *  **Note:** A read-only component is not editable, but still provides visual feedback upon user interaction.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setReadonly(): this.type = js.native
    def setReadonly(/**
      * New value for property `readonly`
      */
    bReadonly: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getRequired required}.
      *
      * Defines whether the component is required.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setRequired(): this.type = js.native
    def setRequired(/**
      * New value for property `required`
      */
    bRequired: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowClearIcon showClearIcon}.
      *
      * Defines whether the clear icon of the input will be shown.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowClearIcon(): this.type = js.native
    def setShowClearIcon(/**
      * New value for property `showClearIcon`
      */
    bShowClearIcon: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowSuggestions showSuggestions}.
      *
      * Defines whether the component should show suggestions, if such are present.
      *
      *  **Note:** You need to import the `InputSuggestions` module from `"@ui5/webcomponents/dist/features/InputSuggestions.js"`
      * to enable this functionality.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowSuggestions(): this.type = js.native
    def setShowSuggestions(/**
      * New value for property `showSuggestions`
      */
    bShowSuggestions: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowValueHelpIcon showValueHelpIcon}.
      *
      * Determines whether a value help icon will be visualized in the end of the input. Pressing the icon will
      * fire `value-help-trigger` event.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowValueHelpIcon(): this.type = js.native
    def setShowValueHelpIcon(/**
      * New value for property `showValueHelpIcon`
      */
    bShowValueHelpIcon: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getType type}.
      *
      * Defines the HTML type of the component. Available options are: `Text`, `Email`, `Number`, `Password`,
      * `Tel`, and `URL`.
      *
      *  **Notes:**
      * 	 - The particular effect of this property differs depending on the browser and the current language
      * 			settings, especially for type `Number`.
      * 	 - The property is mostly intended to be used with touch devices that use different soft keyboard layouts
      * 			depending on the given input type.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Text`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setType(): this.type = js.native
    def setType(
      /**
      * New value for property `type`
      */
    sType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof InputType * / any */ String
    ): this.type = js.native
    def setType(/**
      * New value for property `type`
      */
    sType: InputType): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getValue value}.
      *
      * Defines the value of the component.
      *
      *  **Note:** The property is updated upon typing.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValue(): this.type = js.native
    def setValue(/**
      * New value for property `value`
      */
    sValue: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getValueState valueState}.
      *
      * Defines the value state of the component.
      *
      *  Available options are:
      * 	 - `None`
      * 	 - `Error`
      * 	 - `Warning`
      * 	 - `Success`
      * 	 - `Information`
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `None`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValueState(): this.type = js.native
    def setValueState(
      /**
      * New value for property `valueState`
      */
    sValueState: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String
    ): this.type = js.native
    def setValueState(/**
      * New value for property `valueState`
      */
    sValueState: ValueState): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getValueStateMessage valueStateMessage}.
      *
      * Defines the value state message that will be displayed as pop up under the contorl.
      *
      *
      *
      * **Note:** If not specified, a default text (in the respective language) will be displayed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValueStateMessage(): this.type = js.native
    def setValueStateMessage(/**
      * New value for property `valueStateMessage`
      */
    sValueStateMessage: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Defines the width of the control
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
  }
  
  trait MultiInputSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Defines the accessible aria name of the component.
      */
    var accessibleName: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Receives id(or many ids) of the controls that label this control.
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * Fired when the input operation has finished by pressing Enter or on focusout.
      */
    var change: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines whether the control is enabled. A disabled control can't be interacted with, and it is not in
      * the tab chain.
      */
    var enabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the icon to be displayed in the component.
      */
    var icon: js.UndefOr[
        js.Array[IIcon] | IIcon | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fired when the value of the component changes at each keystroke, and when a suggestion item has been
      * selected.
      */
    var input: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Sets the maximum number of characters available in the input field.
      *
      *  **Note:** This property is not compatible with the ui5-input type InputType.Number. If the ui5-input
      * type is set to Number, the maxlength value is ignored.
      */
    var maxlength: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Determines the name with which the component will be submitted in an HTML form.
      *
      *
      *
      *  **Note:** When set, a native `input` HTML element will be created inside the component so that it can
      * be submitted as part of an HTML form. Do not use this property unless you need to submit a form.
      */
    var name: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines whether the value will be autcompleted to match an item
      */
    var noTypeahead: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines a short hint intended to aid the user with data entry when the component has no value.
      */
    var placeholder: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines whether the component is read-only.
      *
      *  **Note:** A read-only component is not editable, but still provides visual feedback upon user interaction.
      */
    var readonly: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines whether the component is required.
      */
    var required: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines whether the clear icon of the input will be shown.
      */
    var showClearIcon: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines whether the component should show suggestions, if such are present.
      *
      *  **Note:** You need to import the `InputSuggestions` module from `"@ui5/webcomponents/dist/features/InputSuggestions.js"`
      * to enable this functionality.
      */
    var showSuggestions: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines whether a value help icon will be visualized in the end of the input. Pressing the icon will
      * fire `value-help-trigger` event.
      */
    var showValueHelpIcon: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fired when the user navigates to a suggestion item via the ARROW keys, as a preview, before the final
      * selection.
      */
    var suggestionItemPreview: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Fired when a suggestion item, that is displayed in the suggestion popup, is selected.
      */
    var suggestionItemSelect: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    var suggestionItems: js.UndefOr[
        js.Array[IInputSuggestionItem] | IInputSuggestionItem | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fired when a token is about to be deleted.
      */
    var tokenDelete: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines the component tokens.
      */
    var tokens: js.UndefOr[
        js.Array[IToken] | IToken | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the HTML type of the component. Available options are: `Text`, `Email`, `Number`, `Password`,
      * `Tel`, and `URL`.
      *
      *  **Notes:**
      * 	 - The particular effect of this property differs depending on the browser and the current language
      * 			settings, especially for type `Number`.
      * 	 - The property is mostly intended to be used with touch devices that use different soft keyboard layouts
      * 			depending on the given input type.
      */
    var `type`: js.UndefOr[
        InputType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof InputType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the value of the component.
      *
      *  **Note:** The property is updated upon typing.
      */
    var value: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Fired when the value help icon is pressed and F4 or ALT/OPTION + ARROW_UP/ARROW_DOWN keyboard keys are
      * used.
      */
    var valueHelpTrigger: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines the value state of the component.
      *
      *  Available options are:
      * 	 - `None`
      * 	 - `Error`
      * 	 - `Warning`
      * 	 - `Success`
      * 	 - `Information`
      */
    var valueState: js.UndefOr[
        ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the value state message that will be displayed as pop up under the contorl.
      *
      *
      *
      * **Note:** If not specified, a default text (in the respective language) will be displayed.
      */
    var valueStateMessage: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the width of the control
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object MultiInputSettings {
    
    inline def apply(): MultiInputSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MultiInputSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultiInputSettings] (val x: Self) extends AnyVal {
      
      inline def setAccessibleName(value: String | PropertyBindingInfo): Self = StObject.set(x, "accessibleName", value.asInstanceOf[js.Any])
      
      inline def setAccessibleNameUndefined: Self = StObject.set(x, "accessibleName", js.undefined)
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setIcon(
        value: js.Array[IIcon] | IIcon | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconVarargs(value: IIcon*): Self = StObject.set(x, "icon", js.Array(value*))
      
      inline def setInput(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "input", js.Any.fromFunction1(value))
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setMaxlength(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "maxlength", value.asInstanceOf[js.Any])
      
      inline def setMaxlengthUndefined: Self = StObject.set(x, "maxlength", js.undefined)
      
      inline def setName(value: String | PropertyBindingInfo): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNoTypeahead(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "noTypeahead", value.asInstanceOf[js.Any])
      
      inline def setNoTypeaheadUndefined: Self = StObject.set(x, "noTypeahead", js.undefined)
      
      inline def setPlaceholder(value: String | PropertyBindingInfo): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setReadonly(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
      
      inline def setRequired(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setShowClearIcon(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showClearIcon", value.asInstanceOf[js.Any])
      
      inline def setShowClearIconUndefined: Self = StObject.set(x, "showClearIcon", js.undefined)
      
      inline def setShowSuggestions(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showSuggestions", value.asInstanceOf[js.Any])
      
      inline def setShowSuggestionsUndefined: Self = StObject.set(x, "showSuggestions", js.undefined)
      
      inline def setShowValueHelpIcon(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showValueHelpIcon", value.asInstanceOf[js.Any])
      
      inline def setShowValueHelpIconUndefined: Self = StObject.set(x, "showValueHelpIcon", js.undefined)
      
      inline def setSuggestionItemPreview(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "suggestionItemPreview", js.Any.fromFunction1(value))
      
      inline def setSuggestionItemPreviewUndefined: Self = StObject.set(x, "suggestionItemPreview", js.undefined)
      
      inline def setSuggestionItemSelect(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "suggestionItemSelect", js.Any.fromFunction1(value))
      
      inline def setSuggestionItemSelectUndefined: Self = StObject.set(x, "suggestionItemSelect", js.undefined)
      
      inline def setSuggestionItems(
        value: js.Array[IInputSuggestionItem] | IInputSuggestionItem | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "suggestionItems", value.asInstanceOf[js.Any])
      
      inline def setSuggestionItemsUndefined: Self = StObject.set(x, "suggestionItems", js.undefined)
      
      inline def setSuggestionItemsVarargs(value: IInputSuggestionItem*): Self = StObject.set(x, "suggestionItems", js.Array(value*))
      
      inline def setTokenDelete(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "tokenDelete", js.Any.fromFunction1(value))
      
      inline def setTokenDeleteUndefined: Self = StObject.set(x, "tokenDelete", js.undefined)
      
      inline def setTokens(
        value: js.Array[IToken] | IToken | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
      
      inline def setTokensVarargs(value: IToken*): Self = StObject.set(x, "tokens", js.Array(value*))
      
      inline def setType(
        value: InputType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof InputType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String | PropertyBindingInfo): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueHelpTrigger(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "valueHelpTrigger", js.Any.fromFunction1(value))
      
      inline def setValueHelpTriggerUndefined: Self = StObject.set(x, "valueHelpTrigger", js.undefined)
      
      inline def setValueState(
        value: ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "valueState", value.asInstanceOf[js.Any])
      
      inline def setValueStateMessage(value: String | PropertyBindingInfo): Self = StObject.set(x, "valueStateMessage", value.asInstanceOf[js.Any])
      
      inline def setValueStateMessageUndefined: Self = StObject.set(x, "valueStateMessage", js.undefined)
      
      inline def setValueStateUndefined: Self = StObject.set(x, "valueState", js.undefined)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
