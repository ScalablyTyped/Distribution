package typings.openui5.sap.ui.core

import typings.jquery.JQueryStatic
import typings.openui5.sap.ui.base.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderManager extends Object {
  
  /**
    * Adds a class to the class collection if the name is not empty or null.The class collection is
    * flushed if it is written to the buffer using {@link #writeClasses}
    * @param sName name of the class to be added; null values are ignored
    * @returns this render manager instance to allow chaining
    */
  def addClass(sName: String): RenderManager = js.native
  
  /**
    * Adds a style property to the style collection if the value is not empty or nullThe style collection
    * is flushed if it is written to the buffer using {@link #writeStyle}
    * @param sName name of the CSS property to write
    * @param value value to write
    * @returns this render manager instance to allow chaining
    */
  def addStyle(sName: String, value: String): RenderManager = js.native
  def addStyle(sName: String, value: Double): RenderManager = js.native
  
  /**
    * Cleans up the rendering state of the given control with rendering it.A control is responsible for
    * the rendering of all its child controls.But in some cases it makes sense that a control does not
    * render all itschildren based on a filter condition. For example a Carousel control only rendersthe
    * current visible parts (and maybe some parts before and after the visible area)for performance
    * reasons.If a child was rendered but should not be rendered anymore because the filter conditiondoes
    * not apply anymore this child must be cleaned up correctly (e.g deregistering eventhandlers, ...).The
    * following example shows how renderControl and cleanupControlWithoutRendering shouldbe used:render =
    * function(rm, ctrl){  //...  var aAggregatedControls = //...  for(var i=0;
    * i<aAgrregatedControls.length; i++){      if(//... some filter expression){       
    * rm.renderControl(aAggregatedControls[i]);     }else{       
    * rm.cleanupControlWithoutRendering(aAggregatedControls[i]);     }  }  //...}Note:The method does not
    * remove DOM of the given control. The callee of this method has to take over theresponsibility to
    * cleanup the DOM of the control afterwards.For parents which are rendered with the normal mechanism
    * as shown in the example above this requirementis fulfilled, because the control is not added to the
    * rendering buffer (renderControl is not called) andthe DOM is replaced when the rendering cycle is
    * finalized.
    * @since 1.22.9
    * @param oControl the control that should be cleaned up
    */
  def cleanupControlWithoutRendering(oControl: Control): Unit = js.native
  
  /**
    * Creates the ID to be used for the invisible Placeholder DOM element.This method can be used to get
    * direct access to the placeholder DOM element.Also statically available as
    * RenderManager.createInvisiblePlaceholderId()
    * @param oElement The Element instance for which to create the placeholder ID
    * @returns The ID used for the invisible Placeholder of this element
    */
  def createInvisiblePlaceholderId(oElement: Element): String = js.native
  
  /**
    * Searches "to-be-preserved" nodes for the given control id.
    * @param sId control id to search content for.
    * @returns a jQuery collection representing the found content
    */
  def findPreservedContent(sId: String): JQueryStatic = js.native
  
  /**
    * Renders the content of the rendering buffer into the provided DOMNode.This function must not be
    * called within control renderers.Usage:<pre>// Create a new instance of the RenderManagervar rm =
    * sap.ui.getCore().createRenderManager();// Use the writer API to fill the
    * buffersrm.write(...);rm.renderControl(oControl);rm.write(...);...// Finally flush the buffer into
    * the provided DOM node (The current content is removed)rm.flush(oDomNode);// If the instance is not
    * needed anymore, destroy itrm.destroy();</pre>
    * @param oTargetDomNode The node in the dom where the buffer should be flushed into.
    * @param bDoNotPreserve flag, whether to not preserve (true) the content or to preserve it (false).
    * @param vInsert flag, whether to append (true) or replace (false) the buffer of the target dom node
    * or to insert at a certain position (int)
    */
  def flush(oTargetDomNode: Element, bDoNotPreserve: Boolean, vInsert: Boolean): Unit = js.native
  def flush(oTargetDomNode: Element, bDoNotPreserve: Boolean, vInsert: Double): Unit = js.native
  
  /**
    * Returns the configuration objectShortcut for <code>sap.ui.getCore().getConfiguration()</code>
    * @returns the configuration object
    */
  def getConfiguration(): Configuration = js.native
  
  /**
    * Renders the given {@link sap.ui.core.Control} and finally returnsthe content of the rendering
    * buffer.Ensures the buffer is restored to the state before calling this method.
    * @param oControl the Control whose HTML should be returned.
    * @returns the resulting HTML of the provided control
    */
  def getHTML(oControl: Control): String = js.native
  
  /**
    * Returns the hidden area reference belonging to this window instance.
    * @returns the hidden area reference belonging to this core instance.
    */
  def getPreserveAreaRef(): Element = js.native
  
  /**
    * Returns the renderer class for a given control instance
    * @param oControl the control that should be rendered
    * @returns the renderer class for a given control instance
    */
  def getRenderer(oControl: Control): js.Any = js.native
  /**
    * Returns the renderer class for a given control instance
    * @param oControl the control that should be rendered
    */
  @JSName("getRenderer")
  def getRenderer_Unit(oControl: Control): Unit = js.native
  
  /**
    * Collects descendants of the given root node that need to be preserved before the root nodeis wiped
    * out. The "to-be-preserved" nodes are moved to a special, hidden 'preserve' area.A node is declared
    * "to-be-preserved" when it has the <code>data-sap-ui-preserve</code>attribute set. When the optional
    * parameter <code>bPreserveNodesWithId</code> is set to true,then nodes with an id are preserved as
    * well and their <code>data-sap-ui-preserve</code> attributeis set automatically. This option is used
    * by UIAreas when they render for the first time andsimplifies the handling of predefined HTML content
    * in a web page.The "to-be-preserved" nodes are searched with a depth first search and moved to the
    * 'preserve'area in the order that they are found. So for direct siblings the order should be stable.
    * @param oRootNode to search for "to-be-preserved" nodes
    * @param bPreserveRoot whether to preserve the root itself
    * @param bPreserveNodesWithId whether to preserve nodes with an id as well
    */
  def preserveContent(oRootNode: Element): Unit = js.native
  def preserveContent(oRootNode: Element, bPreserveRoot: js.UndefOr[scala.Nothing], bPreserveNodesWithId: Boolean): Unit = js.native
  def preserveContent(oRootNode: Element, bPreserveRoot: Boolean): Unit = js.native
  def preserveContent(oRootNode: Element, bPreserveRoot: Boolean, bPreserveNodesWithId: Boolean): Unit = js.native
  
  /**
    * Renders the given control to the provided DOMNode.If the control is already rendered in the provided
    * DOMNode the DOM of the control is replaced. If the controlis already rendered somewhere else the
    * current DOM of the control is removed and the new DOM is appendedto the provided DOMNode.This
    * function must not be called within control renderers.
    * @param oControl the Control that should be rendered.
    * @param oTargetDomNode The node in the DOM where the result of the rendering should be inserted.
    */
  def render(oControl: Control, oTargetDomNode: Element): Unit = js.native
  
  /**
    * Turns the given control into its HTML representation and appends it to therendering buffer.If the
    * given control is undefined or null, then nothing is rendered.
    * @param oControl the control that should be rendered
    * @returns this render manager instance to allow chaining
    */
  def renderControl(oControl: Control): RenderManager = js.native
  
  /**
    * @param sKey undefined
    */
  def translate(sKey: String): Unit = js.native
  
  /**
    * Write the given texts to the buffer
    * @param sText (can be a number too)
    * @returns this render manager instance to allow chaining
    */
  def write(sText: String): RenderManager = js.native
  def write(sText: Double): RenderManager = js.native
  
  /**
    * @returns this render manager instance to allow chaining
    */
  def writeAcceleratorKey(): RenderManager = js.native
  
  /**
    * Writes the accessibility state (see WAI-ARIA specification) of the provided element into the
    * HTMLbased on the element's properties and associations.The ARIA properties are only written when the
    * accessibility feature is activated in the UI5 configuration.The following properties/values to ARIA
    * attribute mappings are done (if the element does have such properties):<code>editable===false</code>
    * => <code>aria-readonly="true"</code><code>enabled===false</code> =>
    * <code>aria-disabled="true"</code><code>visible===false</code> =>
    * <code>aria-hidden="true"</code><code>required===true</code> =>
    * <code>aria-required="true"</code><code>selected===true</code> =>
    * <code>aria-selected="true"</code><code>checked===true</code> => <code>aria-checked="true"</code>In
    * case of the required attribute also the Label controls which referencing the given element in their
    * 'for' relationare taken into account to compute the <code>aria-required</code>
    * attribute.Additionally the association <code>ariaDescribedBy</code> and <code>ariaLabelledBy</code>
    * are used to writethe id lists of the ARIA attributes <code>aria-describedby</code> and
    * <code>aria-labelledby</code>.Label controls which referencing the given element in their 'for'
    * relation are automatically added to the<code>aria-labelledby</code> attributes.Note: This function
    * is only a heuristic of a control property to ARIA attribute mapping. Control developershave to check
    * whether it fullfills their requirements. In case of problems (for example the RadioButton has
    * a<code>selected</code> property but must provide an <code>aria-checked</code> attribute) the
    * auto-generatedresult of this function can be influenced via the parameter <code>mProps</code> as
    * described below.The parameter <code>mProps</code> can be used to either provide additional
    * attributes which should be added and/orto avoid the automatic generation of single ARIA attributes.
    * The 'aria-' prefix will be prepended automatically to the keys(Exception: Attribute 'role' does not
    * get the prefix 'aria-').Examples:<code>{hidden : true}</code> results in
    * <code>aria-hidden="true"</code> independent of the precense or absence ofthe visibility
    * property.<code>{hidden : null}</code> ensures that no <code>aria-hidden</code> attribute is written
    * independent of the precenseor absence of the visibility property.The function behaves in the same
    * way for the associations <code>ariaDescribedBy</code> and <code>ariaLabelledBy</code>.To append
    * additional values to the auto-generated <code>aria-describedby</code> and
    * <code>aria-labelledby</code> attributesthe following format can be used:<code>{describedby : {value:
    * "id1 id2", append: true}}</code> => <code>aria-describedby="ida idb id1 id2"</code> (assuming that
    * "ida idb"is the auto-generated part based on the association <code>ariaDescribedBy</code>).
    * @param oElement the element whose accessibility state should be rendered
    * @param mProps a map of properties that should be added additionally or changed.
    * @returns this render manager instance to allow chaining
    */
  def writeAccessibilityState(oElement: Element): RenderManager = js.native
  def writeAccessibilityState(oElement: Element, mProps: js.Any): RenderManager = js.native
  
  /**
    * Writes the attribute and its value into the HTML
    * @param sName the name of the attribute
    * @param value the value of the attribute
    * @returns this render manager instance to allow chaining
    */
  def writeAttribute(sName: String, value: String): RenderManager = js.native
  def writeAttribute(sName: String, value: Boolean): RenderManager = js.native
  def writeAttribute(sName: String, value: Double): RenderManager = js.native
  
  /**
    * Writes the attribute and its value into the HTMLThe value is properly escaped to avoid XSS attacks.
    * @param sName the name of the attribute
    * @param vValue the value of the attribute
    * @returns this render manager instance to allow chaining
    */
  def writeAttributeEscaped(sName: String, vValue: js.Any): RenderManager = js.native
  
  def writeClasses(oElement: Boolean): RenderManager = js.native
  /**
    * Writes and flushes the class collection (all CSS classes added by "addClass()" since the last
    * flush).Also writes the custom style classes added by the application with "addStyleClass(...)".
    * Custom classes areadded by default from the currently rendered control. If an oElement is given,
    * this Element's custom styleclasses are added instead. If oElement === false, no custom style classes
    * are added.
    * @param oElement an Element from which to add custom style classes (instead of adding from the
    * control itself)
    * @returns this render manager instance to allow chaining
    */
  def writeClasses(oElement: Element): RenderManager = js.native
  
  /**
    * Writes the controls data into the HTML.Control Data consists at least of the id of a control
    * @param oControl the control whose identifying information should be written to the buffer
    * @returns this render manager instance to allow chaining
    */
  def writeControlData(oControl: Control): RenderManager = js.native
  
  /**
    * Writes the elements data into the HTML.Element Data consists at least of the id of a element
    * @param oElement the element whose identifying information should be written to the buffer
    * @returns this render manager instance to allow chaining
    */
  def writeElementData(oElement: Element): RenderManager = js.native
  
  /**
    * Escape text for HTML and write it to the buffer
    * @param sText undefined
    * @param bLineBreaks Whether to convert linebreaks into <br> tags
    * @returns this render manager instance to allow chaining
    */
  def writeEscaped(sText: String, bLineBreaks: Boolean): RenderManager = js.native
  
  /**
    * Writes necessary invisible control/element placeholder data into the HTML.Controls should only use
    * this method if they can't live with the standard 'visible=false' implementation of the RenderManager
    * whichrenders dummy HTMLSpanElement for better re-rendering performance. Even though HTML5 error
    * tolerance accepts this for most of the cases andthese dummy elements are not in the render tree of
    * the Browser, controls may need to generate a valid and semantic HTML output when therendered
    * HTMLSpanElement is not an allowed element(e.g. &lt;span&gt; element within the &lt;tr&gt; or
    * &lt;li&gt; group).The caller needs to start an opening HTML tag, then call this method, then
    * complete the opening and closing
    * @param oElement an instance of sap.ui.core.Element
    * @returns this render manager instance to allow chaining
    */
  def writeInvisiblePlaceholderData(oElement: Element): RenderManager = js.native
  
  /**
    * Writes and flushes the style collection
    * @returns this render manager instance to allow chaining
    */
  def writeStyles(): RenderManager = js.native
}
