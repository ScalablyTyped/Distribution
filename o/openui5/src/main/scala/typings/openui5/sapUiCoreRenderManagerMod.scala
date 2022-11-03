package typings.openui5

import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreRenderManagerMod {
  
  @JSImport("sap/ui/core/RenderManager", JSImport.Default)
  @js.native
  /**
    * Creates an instance of the RenderManager.
    *
    * Applications or controls must not call the `RenderManager` constructor on their own but should use the
    * {@link sap.ui.core.Core#createRenderManager sap.ui.getCore().createRenderManager()} method to create
    * an instance for their exclusive use.
    * See:
    * 	sap.ui.core.Core
    * 	sap.ui.getCore
    */
  open class default ()
    extends StObject
       with RenderManager {
    
    /** The initial value of Object.prototype.constructor is the standard built-in Object constructor. */
    /* standard es5 */
    /* CompleteClass */
    var constructor: js.Function = js.native
    
    /**
      * Determines whether an object has a property with the specified name.
      * @param v A property name.
      */
    /* standard es5 */
    /* CompleteClass */
    override def hasOwnProperty(v: PropertyKey): Boolean = js.native
    
    /**
      * Determines whether a specified property is enumerable.
      * @param v A property name.
      */
    /* standard es5 */
    /* CompleteClass */
    override def propertyIsEnumerable(v: PropertyKey): Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/RenderManager", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates the ID to be used for the invisible Placeholder DOM element. This method can be used to get direct
      * access to the placeholder DOM element. Also statically available as RenderManager.createInvisiblePlaceholderId()
      *
      * @returns The ID used for the invisible Placeholder of this element
      */
    inline def createInvisiblePlaceholderId(
      /**
      * The Element instance for which to create the placeholder ID
      */
    oElement: typings.openui5.sapUiCoreElementMod.default
    ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createInvisiblePlaceholderId")(oElement.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Searches "to-be-preserved" nodes for the given control id.
      *
      * @returns a jQuery collection representing the found content
      */
    inline def findPreservedContent(/**
      * control id to search content for.
      */
    sId: String): jQuery[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("findPreservedContent")(sId.asInstanceOf[js.Any]).asInstanceOf[jQuery[HTMLElement]]
    
    /**
      * Returns the hidden area reference belonging to the current window instance.
      *
      * @returns The hidden area reference belonging to the current window instance.
      */
    inline def getPreserveAreaRef(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("getPreserveAreaRef")().asInstanceOf[Element]
    
    /**
      * Returns the renderer class for a given control instance
      *
      * @returns the renderer class for a given control instance
      */
    inline def getRenderer(
      /**
      * the control that should be rendered
      */
    oControl: typings.openui5.sapUiCoreControlMod.default
    ): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getRenderer")(oControl.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    /**
      * Collects descendants of the given root node that need to be preserved before the root node is wiped out.
      * The "to-be-preserved" nodes are moved to a special, hidden 'preserve' area.
      *
      * A node is declared "to-be-preserved" when it has the `data-sap-ui-preserve` attribute set. When the optional
      * parameter `bPreserveNodesWithId` is set to true, then nodes with an id are preserved as well and their
      * `data-sap-ui-preserve` attribute is set automatically. This option is used by UIAreas when they render
      * for the first time and simplifies the handling of predefined HTML content in a web page.
      *
      * The "to-be-preserved" nodes are searched with a depth first search and moved to the 'preserve' area in
      * the order that they are found. So for direct siblings the order should be stable.
      */
    inline def preserveContent(/**
      * to search for "to-be-preserved" nodes
      */
    oRootNode: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("preserveContent")(oRootNode.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def preserveContent(
      /**
      * to search for "to-be-preserved" nodes
      */
    oRootNode: Element,
      /**
      * whether to preserve the root itself
      */
    bPreserveRoot: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("preserveContent")(oRootNode.asInstanceOf[js.Any], bPreserveRoot.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def preserveContent(
      /**
      * to search for "to-be-preserved" nodes
      */
    oRootNode: Element,
      /**
      * whether to preserve the root itself
      */
    bPreserveRoot: Boolean,
      /**
      * whether to preserve nodes with an id as well
      */
    bPreserveNodesWithId: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("preserveContent")(oRootNode.asInstanceOf[js.Any], bPreserveRoot.asInstanceOf[js.Any], bPreserveNodesWithId.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def preserveContent(
      /**
      * to search for "to-be-preserved" nodes
      */
    oRootNode: Element,
      /**
      * whether to preserve the root itself
      */
    bPreserveRoot: Unit,
      /**
      * whether to preserve nodes with an id as well
      */
    bPreserveNodesWithId: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("preserveContent")(oRootNode.asInstanceOf[js.Any], bPreserveRoot.asInstanceOf[js.Any], bPreserveNodesWithId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @js.native
  trait RenderManager
    extends StObject
       with Object {
    
    /**
      * Collects accessibility related attributes for an `Element` and renders them as part of the currently
      * rendered DOM element.
      *
      * See the WAI-ARIA specification for a general description of the accessibility related attributes. Attributes
      * are only rendered when the accessibility feature is activated in the UI5 runtime configuration.
      *
      * The values for the attributes are collected from the following sources (last one wins):
      * 	 - from the properties and associations of the given `oElement`, using a heuristic mapping (described
      * 			below)
      * 	 - from the `mProps` parameter, as provided by the caller
      * 	 - from the parent of the given `oElement`, if it has a parent and if the parent implements the method
      * 			{@link sap.ui.core.Element#enhanceAccessibilityState enhanceAccessibilityState}  If no `oElement`
      * 			is given, only `mProps` will be taken into account.
      *
      * Heuristic Mapping: The following mapping from properties/values to ARIA attributes is used (if the element
      * does have such properties):
      * 	 - `editable===false` => `aria-readonly="true"`
      * 	 - `enabled===false` => `aria-disabled="true"`
      * 	 - `visible===false` => `aria-hidden="true"`
      * 	 - `required===true` => `aria-required="true"`
      * 	 - `selected===true` => `aria-selected="true"`
      * 	 - `checked===true` => `aria-checked="true"`
      *
      * In case of the `required` property, all label controls which reference the given element in their `labelFor`
      * relation are additionally taken into account when determining the value for the `aria-required` attribute.
      *
      * Additionally, the associations `ariaDescribedBy` and `ariaLabelledBy` are used to determine the lists
      * of IDs for the ARIA attributes `aria-describedby` and `aria-labelledby`.
      *
      * Label controls that reference the given element in their `labelFor` relation are automatically added
      * to the `aria-labelledby` attribute.
      *
      * Note: This function is only a heuristic of a control property to ARIA attribute mapping. Control developers
      * have to check whether it fulfills their requirements. In case of problems (for example the `RadioButton`
      * has a `selected` property but must provide an `aria-checked` attribute) the auto-generated result of
      * this function can be influenced via the parameter `mProps` as described below.
      *
      * The parameter `mProps` can be used to either provide additional attributes which should be rendered and/or
      * to avoid the automatic generation of single ARIA attributes. The 'aria-' prefix will be prepended automatically
      * to the keys (Exception: Attribute `role` does not get the prefix 'aria-').
      *
      * Examples:
      *  `{hidden : true}` results in `aria-hidden="true"` independent of the presence or absence of the visibility
      * property.
      *  `{hidden : null}` ensures that no `aria-hidden` attribute is written independent of the presence or
      * absence of the visibility property.
      *
      *
      * The function behaves in the same way for the associations `ariaDescribedBy` and `ariaLabelledBy`. To
      * append additional values to the auto-generated `aria-describedby` and `aria-labelledby` attributes, the
      * following format can be used:
      * ```javascript
      *
      *   {describedby : {value: "id1 id2", append: true}} =>  aria-describedby = "ida idb id1 id2"
      * ```
      *  (assuming that "ida idb" is the auto-generated part based on the association `ariaDescribedBy`).
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def accessibilityState(): this.type = js.native
    def accessibilityState(
      /**
      * The `Element` whose accessibility state should be rendered
      */
    oElement: Unit,
      /**
      * A map of additional properties that should be added or changed.
      */
    mProps: js.Object
    ): this.type = js.native
    def accessibilityState(
      /**
      * The `Element` whose accessibility state should be rendered
      */
    oElement: typings.openui5.sapUiCoreElementMod.default
    ): this.type = js.native
    def accessibilityState(
      /**
      * The `Element` whose accessibility state should be rendered
      */
    oElement: typings.openui5.sapUiCoreElementMod.default,
      /**
      * A map of additional properties that should be added or changed.
      */
    mProps: js.Object
    ): this.type = js.native
    
    /**
      * @deprecated (since 1.92) - Instead use {@link sap.ui.core.RenderManager#class} of the {@link sap.ui.core.RenderManager
      * Semantic Rendering API}.
      *
      * Adds a class to the class collection if the name is not empty or null. The class collection is flushed
      * if it is written to the buffer using {@link #writeClasses}
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addClass(/**
      * name of the class to be added; null values are ignored
      */
    sName: String): this.type = js.native
    
    def addStyle(
      /**
      * Name of the CSS property to write
      */
    sName: String,
      /**
      * Value to write
      */
    vValue: float | int
    ): this.type = js.native
    /**
      * @deprecated (since 1.92) - Instead use {@link sap.ui.core.RenderManager#style} of the {@link sap.ui.core.RenderManager
      * Semantic Rendering API}.
      *
      * Adds a style property to the style collection if the value is not empty or null The style collection
      * is flushed if it is written to the buffer using {@link #writeStyle}
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addStyle(
      /**
      * Name of the CSS property to write
      */
    sName: String,
      /**
      * Value to write
      */
    vValue: String
    ): this.type = js.native
    
    /**
      * @SINCE 1.67
      *
      * Adds an attribute name-value pair to the last open HTML element.
      *
      * This is only valid when called between `openStart/voidStart` and `openEnd/voidEnd`. The attribute name
      * must not be equal to `style` or `class`. Styles and classes must be set via dedicated `class` or `style`
      * methods. To update the DOM correctly, all attribute names have to be used in their canonical form. For
      * HTML elements, {@link https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes attribute names} must
      * all be set in lowercase. For foreign elements, such as SVG, {@link https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute
      * attribute names} can be set in upper camel case (e.g. viewBox).
      *
      * HTML entities are not supported by this method, use unicode escaping or the unicode character to implement
      * HTML entities. For further information see {@link https://html.spec.whatwg.org/multipage/named-characters.html#named-character-references}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attr(/**
      * Name of the attribute
      */
    sName: String, /**
      * Value of the attribute
      */
    vValue: Any): this.type = js.native
    
    /**
      * @SINCE 1.67
      *
      * Adds a class name to the class collection of the last open HTML element.
      *
      * This is only valid when called between `openStart/voidStart` and `openEnd/voidEnd`. Class name must not
      * contain any whitespace.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def `class`(/**
      * Class name to be written
      */
    sClass: String): this.type = js.native
    
    /**
      * @SINCE 1.22.9
      *
      * Cleans up the rendering state of the given control without rendering it.
      *
      * A control is responsible for the rendering of all its child controls. But in some cases it makes sense
      * that a control only renders a subset of its children based on some criterion. For example, a typical
      * carousel control might, for performance reasons, only render the currently visible children (and maybe
      * some child before and after the visible area to facilitate slide-in / slide-out animations), but not
      * all children. This leads to situations where a child had been rendered before, but shouldn't be rendered
      * anymore after an update of the carousel's position. The DOM related state of that child then must be
      * cleaned up correctly, e.g. by de-registering resize handlers or native event handlers. `cleanupControlWithoutRendering`
      * helps with that task by triggering the same activities that the normal rendering triggers before the
      * rendering of a control (e.g. it fires the `BeforeRendering` event). It just doesn't call the renderer
      * and the control will not receive an `AfterRendering` event.
      *
      * The following example shows how `renderControl` and `cleanupControlWithoutRendering` should be used:
      *
      *
      * ```javascript
      *
      *   CarouselRenderer.render = function(rm, oCarousel){
      *
      *     ...
      *
      *     oCarousel.getPages().forEach( function( oPage ) {
      *        if ( oCarousel.isPageToBeRendered( oPage ) ) {
      *           rm.renderControl( oPage ); // onBeforeRendering, render, later onAfterRendering
      *        } else {
      *           rm.cleanupControlWithoutRendering( oPage ); // onBeforeRendering
      *        }
      *     });
      *
      *     ...
      *
      *   };
      * ```
      *
      *
      * DOM Removal: The method does not remove the DOM of the given control. The caller of this method has to
      * take care to remove it at some later point in time. It should indeed be later, not before
      * as the `onBeforeRendering` hook of the control might need access to the old DOM for a proper cleanup.
      *
      * For parents which are rendered with the normal mechanism as shown in the example above, the removal of
      * the old child DOM is guaranteed. The whole DOM of the parent control (including the DOM of the no longer
      * rendered child) will be replaced with new DOM (no longer containing the child) when the rendering cycle
      * finishes.
      *
      * **Note:**: the functionality of this method is different from the default handling for invisible controls
      * (controls with `visible == false`). The standard rendering for invisible controls still renders a placeholder
      * DOM. This allows re-rendering of the invisible control once it becomes visible again without a need to
      * render its parent, too. Children that are cleaned up with this method here, are supposed to have no more
      * DOM at all. Rendering them later on therefore requires an involvement (typically: a rendering) of their
      * parent.
      */
    def cleanupControlWithoutRendering(
      /**
      * Control that should be cleaned up
      */
    oControl: typings.openui5.sapUiCoreControlMod.default
    ): Unit = js.native
    
    /**
      * @SINCE 1.67
      *
      * Closes an open tag started with `openStart` and ended with `openEnd`.
      *
      * This indicates that there are no more children to append to the open tag.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def close(/**
      * Tag name of the HTML element
      */
    sTagName: String): this.type = js.native
    
    /**
      * Cleans up the resources associated with this instance.
      *
      * After the instance has been destroyed, it must not be used anymore. Applications should call this function
      * if they don't need the instance any longer.
      */
    def destroy(): Unit = js.native
    
    /**
      * Renders the content of the rendering buffer into the provided DOM node.
      *
      * This function must not be called within control renderers.
      *
      * Usage:
      * ```javascript
      *
      *
      *   // Create a new instance of the RenderManager
      *   var rm = sap.ui.getCore().createRenderManager();
      *
      *   // Use the writer API to fill the buffers
      *   rm.write(...);
      *   rm.renderControl(oControl);
      *   rm.write(...);
      *   ...
      *
      *   // Finally flush the buffer into the provided DOM node (The current content is removed)
      *   rm.flush(oDomNode);
      *
      *   // If the instance is not needed anymore, destroy it
      *   rm.destroy();
      *
      * ```
      */
    def flush(
      /**
      * Node in the DOM where the buffer should be flushed into
      */
    oTargetDomNode: Element,
      /**
      * Determines whether the content is preserved (`false`) or not (`true`)
      */
    bDoNotPreserve: Boolean,
      /**
      * Determines whether the buffer of the target DOM node is expanded (`true`) or replaced (`false`), or the
      * new entry is inserted at a specific position (value of type `int`)
      */
    vInsert: Boolean
    ): Unit = js.native
    def flush(
      /**
      * Node in the DOM where the buffer should be flushed into
      */
    oTargetDomNode: Element,
      /**
      * Determines whether the content is preserved (`false`) or not (`true`)
      */
    bDoNotPreserve: Boolean,
      /**
      * Determines whether the buffer of the target DOM node is expanded (`true`) or replaced (`false`), or the
      * new entry is inserted at a specific position (value of type `int`)
      */
    vInsert: int
    ): Unit = js.native
    
    /**
      * @deprecated (since 1.92) - Instead, use the {@link sap.ui.core.Core#getConfiguration} API.
      *
      * Returns the configuration object Shortcut for `sap.ui.getCore().getConfiguration()`
      *
      * @returns the configuration object
      */
    def getConfiguration(): typings.openui5.sapUiCoreConfigurationMod.default = js.native
    
    /**
      * @deprecated (since 0.15.0) - Use `flush()` instead render content outside the rendering phase.
      *
      * Renders the given {@link sap.ui.core.Control} and finally returns the content of the rendering buffer.
      * Ensures the buffer is restored to the state before calling this method.
      *
      * @returns the resulting HTML of the provided control
      */
    def getHTML(
      /**
      * the Control whose HTML should be returned.
      */
    oControl: typings.openui5.sapUiCoreControlMod.default
    ): String = js.native
    
    /**
      * Returns the renderer class for a given control instance
      *
      * @returns the renderer class for a given control instance
      */
    def getRenderer(
      /**
      * the control that should be rendered
      */
    oControl: typings.openui5.sapUiCoreControlMod.default
    ): js.Object = js.native
    
    /**
      * Writes either an <img> tag for normal URI or a <span> tag with needed properties for an icon
      * URI.
      *
      * Additional classes and attributes can be added to the tag with the second and third parameter. All of
      * the given attributes are escaped when necessary for security consideration.
      *
      * When an <img> tag is rendered, the following two attributes are added by default and can be overwritten
      * with corresponding values in the `mAttributes` parameter:
      * 	 - `role: "presentation"` `alt: ""`
      *
      * **Note:** This function requires the {@link sap.ui.core.IconPool} module. Ensure that the module is loaded
      * before this function is called to avoid syncXHRs.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def icon(/**
      * URI of an image or of an icon registered in {@link sap.ui.core.IconPool}
      */
    sURI: URI): this.type = js.native
    def icon(
      /**
      * URI of an image or of an icon registered in {@link sap.ui.core.IconPool}
      */
    sURI: URI,
      /**
      * Additional classes that are added to the rendered tag
      */
    aClasses: String
    ): this.type = js.native
    def icon(
      /**
      * URI of an image or of an icon registered in {@link sap.ui.core.IconPool}
      */
    sURI: URI,
      /**
      * Additional classes that are added to the rendered tag
      */
    aClasses: String,
      /**
      * Additional attributes that will be added to the rendered tag. Currently the attributes `class` and `style`
      * are not allowed
      */
    mAttributes: js.Object
    ): this.type = js.native
    def icon(
      /**
      * URI of an image or of an icon registered in {@link sap.ui.core.IconPool}
      */
    sURI: URI,
      /**
      * Additional classes that are added to the rendered tag
      */
    aClasses: js.Array[Any]
    ): this.type = js.native
    def icon(
      /**
      * URI of an image or of an icon registered in {@link sap.ui.core.IconPool}
      */
    sURI: URI,
      /**
      * Additional classes that are added to the rendered tag
      */
    aClasses: js.Array[Any],
      /**
      * Additional attributes that will be added to the rendered tag. Currently the attributes `class` and `style`
      * are not allowed
      */
    mAttributes: js.Object
    ): this.type = js.native
    def icon(
      /**
      * URI of an image or of an icon registered in {@link sap.ui.core.IconPool}
      */
    sURI: URI,
      /**
      * Additional classes that are added to the rendered tag
      */
    aClasses: Unit,
      /**
      * Additional attributes that will be added to the rendered tag. Currently the attributes `class` and `style`
      * are not allowed
      */
    mAttributes: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.67
      *
      * Ends an open tag started with `openStart`.
      *
      * This indicates that there are no more attributes to set to the open tag.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def openEnd(): this.type = js.native
    
    /**
      * @SINCE 1.67
      *
      * Opens the start tag of an HTML element.
      *
      * This must be followed by `openEnd` and concluded with `close`. To allow a more efficient DOM update,
      * all tag names have to be used in their canonical form. For HTML elements, {@link https://developer.mozilla.org/en-US/docs/Web/HTML/Element
      * tag names} must all be set in lowercase. For foreign elements, such as SVG, {@link https://developer.mozilla.org/en-US/docs/Web/SVG/Element
      * tag names} can be set in upper camel case (e.g. linearGradient).
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def openStart(/**
      * Tag name of the HTML element
      */
    sTagName: String): this.type = js.native
    def openStart(
      /**
      * Tag name of the HTML element
      */
    sTagName: String,
      /**
      * Control instance or ID to identify the element
      */
    vControlOrId: typings.openui5.sapUiCoreElementMod.default
    ): this.type = js.native
    def openStart(
      /**
      * Tag name of the HTML element
      */
    sTagName: String,
      /**
      * Control instance or ID to identify the element
      */
    vControlOrId: ID
    ): this.type = js.native
    
    /**
      * Renders the given control to the provided DOMNode.
      *
      * If the control is already rendered in the provided DOMNode the DOM of the control is replaced. If the
      * control is already rendered somewhere else the current DOM of the control is removed and the new DOM
      * is appended to the provided DOMNode.
      *
      * This function must not be called within control renderers.
      */
    def render(
      /**
      * the Control that should be rendered.
      */
    oControl: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The node in the DOM where the result of the rendering should be inserted.
      */
    oTargetDomNode: Element
    ): Unit = js.native
    
    /**
      * Turns the given control into its HTML representation and appends it to the rendering buffer.
      *
      * If the given control is undefined or null, then nothing is rendered.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def renderControl(
      /**
      * the control that should be rendered
      */
    oControl: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * @SINCE 1.67
      *
      * Adds a style name-value pair to the style collection of the last open HTML element.
      *
      * This is only valid when called between `openStart/voidStart` and `openEnd/voidEnd`. To allow a more efficient
      * DOM update, the CSS property names and values have to be used in their canonical form. In general, CSS
      * properties are lower-cased in their canonical form, except for parts that are not under the control of
      * CSS. For more information, see {@link https://www.w3.org/TR/CSS/#indices}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def style(
      /**
      * Name of the style property
      */
    sName: String,
      /**
      * Value of the style property
      */
    sValue: String
    ): this.type = js.native
    
    /**
      * @SINCE 1.67
      *
      * Sets the text content with the given text.
      *
      * Line breaks are not supported by this method, use CSS {@link https://www.w3.org/TR/CSS2/text.html#white-space-prop
      * white-space: pre-line} option to implement line breaks.
      *
      * HTML entities are not supported by this method, use unicode escaping or the unicode character to implement
      * HTML entities. For further information see {@link https://html.spec.whatwg.org/multipage/named-characters.html#named-character-references}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def text(/**
      * The text to be written
      */
    sText: String): this.type = js.native
    
    /**
      * @deprecated (since 1.1) - never has been implemented - DO NOT USE
      */
    def translate(/**
      * the key
      */
    sKey: String): Unit = js.native
    
    /**
      * @SINCE 1.67
      *
      * Sets the given HTML markup without any encoding or sanitizing.
      *
      * This must not be used for plain texts; use the `text` method instead.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unsafeHtml(/**
      * Well-formed, valid HTML markup
      */
    sHtml: String): this.type = js.native
    
    /**
      * @SINCE 1.67
      *
      * Ends an open self-closing tag started with `voidStart`.
      *
      * This indicates that there are no more attributes to set to the open tag. For self-closing tags `close`
      * must not be called.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def voidEnd(): this.type = js.native
    
    /**
      * @SINCE 1.67
      *
      * Starts a self-closing tag, such as `img` or `input`.
      *
      * This must be followed by `voidEnd`. For self-closing tags, the `close` method must not be called. To
      * allow a more efficient DOM update, void tag names have to be set in lowercase. This API is specific for
      * void elements and must not be used for foreign elements. For more information, see {@link https://www.w3.org/TR/html5/syntax.html#void-elements}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def voidStart(/**
      * Tag name of the HTML element
      */
    sTagName: String): this.type = js.native
    def voidStart(
      /**
      * Tag name of the HTML element
      */
    sTagName: String,
      /**
      * Control instance or ID to identify the element
      */
    vControlOrId: typings.openui5.sapUiCoreElementMod.default
    ): this.type = js.native
    def voidStart(
      /**
      * Tag name of the HTML element
      */
    sTagName: String,
      /**
      * Control instance or ID to identify the element
      */
    vControlOrId: ID
    ): this.type = js.native
    
    /**
      * @deprecated (since 1.92) - Instead, use the {@link sap.ui.core.RenderManager Semantic Rendering API}.
      * There is no 1:1 replacement for `write`. Typically, `write` is used to create a longer sequence of HTML
      * markup (e.g. an element with attributes and children) in a single call. Such a markup sequence has to
      * be split into the individual calls of the Semantic Rendering API.
      *
      *
      *
      * Example:
      *  oRm.write("<span id=\"" + oCtrl.getId() + "-outer\" class=\"myCtrlOuter\">" + "&nbsp;" + oResourceBundle.getText("TEXT_KEY")
      * + "&nbsp;</span>");
      *
      *  has to be transformed to
      *
      *  oRm.openStart("span", oCtrl.getId() + "-outer").class("myCtrlOuter").openEnd().text("\\u00a0" + oResourceBundle.getText("TEXT_KEY")
      * + "\\u00a0").close("span");
      *
      *  Note that "&nbsp;" was replaced with "\\u00a0" (no-break-space). In general, HTML entities have to
      * be replaced by the corresponding Unicode character escapes. A mapping table can be found at {@link https://html.spec.whatwg.org/multipage/named-characters.html#named-character-references}.
      *
      * Write the given texts to the buffer.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def write(/**
      * (can be a number too)
      */
    sText: String): this.type = js.native
    def write(/**
      * (can be a number too)
      */
    sText: Double): this.type = js.native
    
    /**
      * @deprecated (since 1.1) - never has been implemented - DO NOT USE
      *
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def writeAcceleratorKey(): this.type = js.native
    
    /**
      * @deprecated (since 1.92) - Instead use {@link sap.ui.core.RenderManager#accessibilityState} of the {@link
      * sap.ui.core.RenderManager Semantic Rendering API}.
      *
      * Collects accessibility related attributes for an `Element` and renders them as part of the currently
      * rendered DOM element.
      *
      * See the WAI-ARIA specification for a general description of the accessibility related attributes. Attributes
      * are only rendered when the accessibility feature is activated in the UI5 runtime configuration.
      *
      * The values for the attributes are collected from the following sources (last one wins):
      * 	 - from the properties and associations of the given `oElement`, using a heuristic mapping (described
      * 			below)
      * 	 - from the `mProps` parameter, as provided by the caller
      * 	 - from the parent of the given `oElement`, if it has a parent and if the parent implements the method
      * 			{@link sap.ui.core.Element#enhanceAccessibilityState enhanceAccessibilityState}  If no `oElement`
      * 			is given, only `mProps` will be taken into account.
      *
      * Heuristic Mapping: The following mapping from properties/values to ARIA attributes is used (if the element
      * does have such properties):
      * 	 - `editable===false` => `aria-readonly="true"`
      * 	 - `enabled===false` => `aria-disabled="true"`
      * 	 - `visible===false` => `aria-hidden="true"`
      * 	 - `required===true` => `aria-required="true"`
      * 	 - `selected===true` => `aria-selected="true"`
      * 	 - `checked===true` => `aria-checked="true"`
      *
      * In case of the `required` property, all label controls which reference the given element in their `labelFor`
      * relation are additionally taken into account when determining the value for the `aria-required` attribute.
      *
      * Additionally, the associations `ariaDescribedBy` and `ariaLabelledBy` are used to determine the lists
      * of IDs for the ARIA attributes `aria-describedby` and `aria-labelledby`.
      *
      * Label controls that reference the given element in their `labelFor` relation are automatically added
      * to the `aria-labelledby` attribute.
      *
      * Note: This function is only a heuristic of a control property to ARIA attribute mapping. Control developers
      * have to check whether it fulfills their requirements. In case of problems (for example the `RadioButton`
      * has a `selected` property but must provide an `aria-checked` attribute) the auto-generated result of
      * this function can be influenced via the parameter `mProps` as described below.
      *
      * The parameter `mProps` can be used to either provide additional attributes which should be rendered and/or
      * to avoid the automatic generation of single ARIA attributes. The 'aria-' prefix will be prepended automatically
      * to the keys (Exception: Attribute `role` does not get the prefix 'aria-').
      *
      * Examples:
      *  `{hidden : true}` results in `aria-hidden="true"` independent of the presence or absence of the visibility
      * property.
      *  `{hidden : null}` ensures that no `aria-hidden` attribute is written independent of the presence or
      * absence of the visibility property.
      *
      *
      * The function behaves in the same way for the associations `ariaDescribedBy` and `ariaLabelledBy`. To
      * append additional values to the auto-generated `aria-describedby` and `aria-labelledby` attributes, the
      * following format can be used:
      * ```javascript
      *
      *   {describedby : {value: "id1 id2", append: true}} =>  aria-describedby = "ida idb id1 id2"
      * ```
      *  (assuming that "ida idb" is the auto-generated part based on the association `ariaDescribedBy`).
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def writeAccessibilityState(): this.type = js.native
    def writeAccessibilityState(
      /**
      * The `Element` whose accessibility state should be rendered
      */
    oElement: Unit,
      /**
      * A map of additional properties that should be added or changed.
      */
    mProps: js.Object
    ): this.type = js.native
    def writeAccessibilityState(
      /**
      * The `Element` whose accessibility state should be rendered
      */
    oElement: typings.openui5.sapUiCoreElementMod.default
    ): this.type = js.native
    def writeAccessibilityState(
      /**
      * The `Element` whose accessibility state should be rendered
      */
    oElement: typings.openui5.sapUiCoreElementMod.default,
      /**
      * A map of additional properties that should be added or changed.
      */
    mProps: js.Object
    ): this.type = js.native
    
    /**
      * @deprecated (since 1.92) - Instead use {@link sap.ui.core.RenderManager#attr} of the {@link sap.ui.core.RenderManager
      * Semantic Rendering API}.
      *
      * Writes the attribute and its value into the HTML.
      *
      * For details about the escaping refer to {@link sap/base/security/encodeXML}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def writeAttribute(
      /**
      * Name of the attribute
      */
    sName: String,
      /**
      * Value of the attribute
      */
    vValue: String
    ): this.type = js.native
    def writeAttribute(
      /**
      * Name of the attribute
      */
    sName: String,
      /**
      * Value of the attribute
      */
    vValue: Boolean
    ): this.type = js.native
    def writeAttribute(
      /**
      * Name of the attribute
      */
    sName: String,
      /**
      * Value of the attribute
      */
    vValue: Double
    ): this.type = js.native
    
    /**
      * @deprecated (since 1.92) - Instead use {@link sap.ui.core.RenderManager#attr} of the {@link sap.ui.core.RenderManager
      * Semantic Rendering API}.
      *
      * Writes the attribute and a value into the HTML, the value will be encoded.
      *
      * The value is properly encoded to avoid XSS attacks.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def writeAttributeEscaped(/**
      * Name of the attribute
      */
    sName: String, /**
      * Value of the attribute
      */
    vValue: Any): this.type = js.native
    
    /**
      * @deprecated (since 1.92) - Not longer needed, when using the {@link sap.ui.core.RenderManager Semantic
      * Rendering API} the actual writing of classes happens when {@link sap.ui.core.RenderManager#openEnd} or
      * {@link sap.ui.core.RenderManager#voidEnd} are used.
      *
      * Writes and flushes the class collection (all CSS classes added by "addClass()" since the last flush).
      * Also writes the custom style classes added by the application with "addStyleClass(...)". Custom classes
      * are added by default from the currently rendered control. If an oElement is given, this Element's custom
      * style classes are added instead. If oElement === false, no custom style classes are added.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def writeClasses(): this.type = js.native
    def writeClasses(
      /**
      * an Element from which to add custom style classes (instead of adding from the control itself)
      */
    oElement: Boolean
    ): this.type = js.native
    def writeClasses(
      /**
      * an Element from which to add custom style classes (instead of adding from the control itself)
      */
    oElement: typings.openui5.sapUiCoreElementMod.default
    ): this.type = js.native
    
    /**
      * @deprecated (since 1.92) - Instead use {@link sap.ui.core.RenderManager#openStart} or {@link sap.ui.core.RenderManager#voidStart}
      * of the {@link sap.ui.core.RenderManager Semantic Rendering API} and pass the desired control data as
      * the second parameter to the new API.
      *
      * Writes the controls data into the HTML. Control Data consists at least of the id of a control
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def writeControlData(
      /**
      * the control whose identifying information should be written to the buffer
      */
    oControl: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * @deprecated (since 1.92) - Instead use {@link sap.ui.core.RenderManager#openStart} or {@link sap.ui.core.RenderManager#voidStart}
      * of the {@link sap.ui.core.RenderManager Semantic Rendering API} and pass the desired element data as
      * the second parameter to the new API.
      *
      * Writes the elements data into the HTML. Element Data consists at least of the id of an element
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def writeElementData(
      /**
      * the element whose identifying information should be written to the buffer
      */
    oElement: typings.openui5.sapUiCoreElementMod.default
    ): this.type = js.native
    
    /**
      * @deprecated (since 1.92) - Instead use {@link sap.ui.core.RenderManager#text} of the {@link sap.ui.core.RenderManager
      * Semantic Rendering API}.
      *
      * Escape text for HTML and write it to the buffer.
      *
      * For details about the escaping refer to {@link sap/base/security/encodeXML}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def writeEscaped(/**
      * the text to escape
      */
    sText: Any): this.type = js.native
    def writeEscaped(
      /**
      * the text to escape
      */
    sText: Any,
      /**
      * Whether to convert line breaks into
      *  tags
      */
    bLineBreaks: Boolean
    ): this.type = js.native
    
    /**
      * @deprecated (since 1.92) - Instead use {@link sap.ui.core.RenderManager#icon} of the {@link sap.ui.core.RenderManager
      * Semantic Rendering API}.
      *
      * Writes either an <img> tag for normal URI or a <span> tag with needed properties for an icon
      * URI.
      *
      * Additional classes and attributes can be added to the tag with the second and third parameter. All of
      * the given attributes are escaped for security consideration.
      *
      * When an <img> tag is rendered, the following two attributes are added by default and can be overwritten
      * with corresponding values in the `mAttributes` parameter:
      * 	 - `role: "presentation"` `alt: ""`
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def writeIcon(/**
      * URI of an image or of an icon registered in {@link sap.ui.core.IconPool}
      */
    sURI: URI): this.type = js.native
    def writeIcon(
      /**
      * URI of an image or of an icon registered in {@link sap.ui.core.IconPool}
      */
    sURI: URI,
      /**
      * Additional classes that are added to the rendered tag
      */
    aClasses: String
    ): this.type = js.native
    def writeIcon(
      /**
      * URI of an image or of an icon registered in {@link sap.ui.core.IconPool}
      */
    sURI: URI,
      /**
      * Additional classes that are added to the rendered tag
      */
    aClasses: String,
      /**
      * Additional attributes that will be added to the rendered tag
      */
    mAttributes: js.Object
    ): this.type = js.native
    def writeIcon(
      /**
      * URI of an image or of an icon registered in {@link sap.ui.core.IconPool}
      */
    sURI: URI,
      /**
      * Additional classes that are added to the rendered tag
      */
    aClasses: js.Array[Any]
    ): this.type = js.native
    def writeIcon(
      /**
      * URI of an image or of an icon registered in {@link sap.ui.core.IconPool}
      */
    sURI: URI,
      /**
      * Additional classes that are added to the rendered tag
      */
    aClasses: js.Array[Any],
      /**
      * Additional attributes that will be added to the rendered tag
      */
    mAttributes: js.Object
    ): this.type = js.native
    def writeIcon(
      /**
      * URI of an image or of an icon registered in {@link sap.ui.core.IconPool}
      */
    sURI: URI,
      /**
      * Additional classes that are added to the rendered tag
      */
    aClasses: Unit,
      /**
      * Additional attributes that will be added to the rendered tag
      */
    mAttributes: js.Object
    ): this.type = js.native
    
    /**
      * @deprecated (since 1.92) - Not longer needed, when using the {@link sap.ui.core.RenderManager Semantic
      * Rendering API} the actual writing of styles happens when {@link sap.ui.core.RenderManager#openEnd} or
      * {@link sap.ui.core.RenderManager#voidEnd} are used.
      *
      * Writes and flushes the style collection
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def writeStyles(): this.type = js.native
  }
}
