package typings.openui5

import typings.openui5.anon.IsPreservedDOM
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.std.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreHtmlMod {
  
  @JSImport("sap/ui/core/HTML", JSImport.Default)
  @js.native
  /**
    * Constructor for a new HTML.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends HTML {
    def this(/**
      * initial settings for the new control
      */
    mSettings: HTMLSettings) = this()
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
    mSettings: HTMLSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: HTMLSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/HTML", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.core.HTML with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, HTML]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, HTML],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.HTML.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait HTML
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:afterRendering afterRendering} event of this
      * `sap.ui.core.HTML`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.HTML` itself.
      *
      * Fired after the HTML control has been rendered. Allows to manipulate the resulting DOM.
      *
      * When the control doesn't have string content and no preserved DOM existed for this control, then this
      * event will fire, but there won't be a DOM node for this control.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAfterRendering(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachAfterRendering(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.core.HTML` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:afterRendering afterRendering} event of this
      * `sap.ui.core.HTML`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.HTML` itself.
      *
      * Fired after the HTML control has been rendered. Allows to manipulate the resulting DOM.
      *
      * When the control doesn't have string content and no preserved DOM existed for this control, then this
      * event will fire, but there won't be a DOM node for this control.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAfterRendering(
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
    def attachAfterRendering(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.core.HTML` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:afterRendering afterRendering} event of this
      * `sap.ui.core.HTML`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachAfterRendering(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachAfterRendering(
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
      * Fires event {@link #event:afterRendering afterRendering} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireAfterRendering(): this.type = js.native
    def fireAfterRendering(/**
      * Parameters to pass along with the event
      */
    mParameters: IsPreservedDOM): this.type = js.native
    
    /**
      * Gets current value of property {@link #getContent content}.
      *
      * HTML content to be displayed, defined as a string.
      *
      * The content is converted to DOM nodes with a call to `new jQuery(content)`, so any restrictions for the
      * jQuery constructor apply to the content of the HTML control as well.
      *
      * Some of these restrictions (there might be others!) are:
      * 	 - the content must be enclosed in tags, pure text is not supported.
      * 	 - if the content contains script tags, they will be executed but they will not appear in the resulting
      * 			DOM tree. When the contained code tries to find the corresponding script tag, it will fail.
      *
      * Please consider to consult the jQuery documentation as well.
      *
      * The HTML control currently doesn't prevent the usage of multiple root nodes in its DOM content (e.g.
      * `setContent("<div></div><div></div>")`), but this is not a guaranteed feature. The accepted
      * content might be restricted to single root nodes in future versions. To notify applications about this
      * fact, a warning is written in the log when multiple root nodes are used.
      *
      * When changing the content dynamically, ensure that the ID of the root node remains the same as the HTML
      * control's ID. Otherwise it cannot be guaranteed that certain lifecycle events take place.
      *
      * @returns Value of property `content`
      */
    def getContent(): String = js.native
    
    /**
      * Gets current value of property {@link #getPreferDOM preferDOM}.
      *
      * Whether existing DOM content is preferred over the given content string.
      *
      * There are two scenarios where this flag is relevant (when set to true):
      * 	 - for the initial rendering: when an HTML control is added to a UIArea for the first time and if the
      * 			root node of that UIArea contained DOM content with the same id as the HTML control, then that content
      * 			will be used for rendering instead of any specified string content
      * 	 - any follow-up rendering: when an HTML control is rendered for the second or any later time and the
      * 			preferDOM flag is set, then the DOM from the first rendering is preserved and not replaced by the string
      * 			content
      *
      * As preserving the existing DOM is the most common use case of the HTML control, the default value is
      * true.
      *
      * Default value is `true`.
      *
      * @returns Value of property `preferDOM`
      */
    def getPreferDOM(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getSanitizeContent sanitizeContent}.
      *
      * Whether to run the HTML sanitizer once the content (HTML markup) is applied or not.
      *
      * To configure the set of allowed URLs, you can use the {@link module:sap/base/security/URLListValidator.add
      * URLListValidator API}.
      *
      * Default value is `false`.
      *
      * @returns Value of property `sanitizeContent`
      */
    def getSanitizeContent(): Boolean = js.native
    
    /**
      * Sets a new value for property {@link #getContent content}.
      *
      * HTML content to be displayed, defined as a string.
      *
      * The content is converted to DOM nodes with a call to `new jQuery(content)`, so any restrictions for the
      * jQuery constructor apply to the content of the HTML control as well.
      *
      * Some of these restrictions (there might be others!) are:
      * 	 - the content must be enclosed in tags, pure text is not supported.
      * 	 - if the content contains script tags, they will be executed but they will not appear in the resulting
      * 			DOM tree. When the contained code tries to find the corresponding script tag, it will fail.
      *
      * Please consider to consult the jQuery documentation as well.
      *
      * The HTML control currently doesn't prevent the usage of multiple root nodes in its DOM content (e.g.
      * `setContent("<div></div><div></div>")`), but this is not a guaranteed feature. The accepted
      * content might be restricted to single root nodes in future versions. To notify applications about this
      * fact, a warning is written in the log when multiple root nodes are used.
      *
      * When changing the content dynamically, ensure that the ID of the root node remains the same as the HTML
      * control's ID. Otherwise it cannot be guaranteed that certain lifecycle events take place.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setContent(): this.type = js.native
    def setContent(/**
      * New value for property `content`
      */
    sContent: String): this.type = js.native
    
    /**
      * Sets some new DOM content for this HTML control. The content will replace the existing content after
      * the next rendering. Properties are not modified, but preferDOM should be set to true.
      *
      * @returns `this` to facilitate method chaining
      */
    def setDOMContent(/**
      * the new DOM content
      */
    oDom: Element): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getPreferDOM preferDOM}.
      *
      * Whether existing DOM content is preferred over the given content string.
      *
      * There are two scenarios where this flag is relevant (when set to true):
      * 	 - for the initial rendering: when an HTML control is added to a UIArea for the first time and if the
      * 			root node of that UIArea contained DOM content with the same id as the HTML control, then that content
      * 			will be used for rendering instead of any specified string content
      * 	 - any follow-up rendering: when an HTML control is rendered for the second or any later time and the
      * 			preferDOM flag is set, then the DOM from the first rendering is preserved and not replaced by the string
      * 			content
      *
      * As preserving the existing DOM is the most common use case of the HTML control, the default value is
      * true.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPreferDOM(): this.type = js.native
    def setPreferDOM(/**
      * New value for property `preferDOM`
      */
    bPreferDOM: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSanitizeContent sanitizeContent}.
      *
      * Whether to run the HTML sanitizer once the content (HTML markup) is applied or not.
      *
      * To configure the set of allowed URLs, you can use the {@link module:sap/base/security/URLListValidator.add
      * URLListValidator API}.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSanitizeContent(): this.type = js.native
    def setSanitizeContent(/**
      * New value for property `sanitizeContent`
      */
    bSanitizeContent: Boolean): this.type = js.native
  }
  
  trait HTMLSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Fired after the HTML control has been rendered. Allows to manipulate the resulting DOM.
      *
      * When the control doesn't have string content and no preserved DOM existed for this control, then this
      * event will fire, but there won't be a DOM node for this control.
      */
    var afterRendering: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * HTML content to be displayed, defined as a string.
      *
      * The content is converted to DOM nodes with a call to `new jQuery(content)`, so any restrictions for the
      * jQuery constructor apply to the content of the HTML control as well.
      *
      * Some of these restrictions (there might be others!) are:
      * 	 - the content must be enclosed in tags, pure text is not supported.
      * 	 - if the content contains script tags, they will be executed but they will not appear in the resulting
      * 			DOM tree. When the contained code tries to find the corresponding script tag, it will fail.
      *
      * Please consider to consult the jQuery documentation as well.
      *
      * The HTML control currently doesn't prevent the usage of multiple root nodes in its DOM content (e.g.
      * `setContent("<div></div><div></div>")`), but this is not a guaranteed feature. The accepted
      * content might be restricted to single root nodes in future versions. To notify applications about this
      * fact, a warning is written in the log when multiple root nodes are used.
      *
      * When changing the content dynamically, ensure that the ID of the root node remains the same as the HTML
      * control's ID. Otherwise it cannot be guaranteed that certain lifecycle events take place.
      */
    var content: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Whether existing DOM content is preferred over the given content string.
      *
      * There are two scenarios where this flag is relevant (when set to true):
      * 	 - for the initial rendering: when an HTML control is added to a UIArea for the first time and if the
      * 			root node of that UIArea contained DOM content with the same id as the HTML control, then that content
      * 			will be used for rendering instead of any specified string content
      * 	 - any follow-up rendering: when an HTML control is rendered for the second or any later time and the
      * 			preferDOM flag is set, then the DOM from the first rendering is preserved and not replaced by the string
      * 			content
      *
      * As preserving the existing DOM is the most common use case of the HTML control, the default value is
      * true.
      */
    var preferDOM: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Whether to run the HTML sanitizer once the content (HTML markup) is applied or not.
      *
      * To configure the set of allowed URLs, you can use the {@link module:sap/base/security/URLListValidator.add
      * URLListValidator API}.
      */
    var sanitizeContent: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object HTMLSettings {
    
    inline def apply(): HTMLSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HTMLSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HTMLSettings] (val x: Self) extends AnyVal {
      
      inline def setAfterRendering(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "afterRendering", js.Any.fromFunction1(value))
      
      inline def setAfterRenderingUndefined: Self = StObject.set(x, "afterRendering", js.undefined)
      
      inline def setContent(value: String | PropertyBindingInfo): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setPreferDOM(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "preferDOM", value.asInstanceOf[js.Any])
      
      inline def setPreferDOMUndefined: Self = StObject.set(x, "preferDOM", js.undefined)
      
      inline def setSanitizeContent(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "sanitizeContent", value.asInstanceOf[js.Any])
      
      inline def setSanitizeContentUndefined: Self = StObject.set(x, "sanitizeContent", js.undefined)
    }
  }
}
