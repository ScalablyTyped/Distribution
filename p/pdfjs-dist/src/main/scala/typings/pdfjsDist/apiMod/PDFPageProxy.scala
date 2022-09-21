package typings.pdfjsDist.apiMod

import typings.pdfjsDist.displayUtilsMod.PageViewport
import typings.pdfjsDist.displayUtilsMod.StatTimer
import typings.std.Map
import typings.std.ReadableStream
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pdfjs-dist/types/src/display/api", "PDFPageProxy")
@js.native
open class PDFPageProxy protected () extends StObject {
  def this(pageIndex: Any, pageInfo: Any, transport: Any, ownerDocument: Any) = this()
  def this(pageIndex: Any, pageInfo: Any, transport: Any, ownerDocument: Any, pdfBug: Boolean) = this()
  
  /**
    * @private
    */
  /* private */ var _abortOperatorList: Any = js.native
  
  var _annotationPromises: Map[Any, Any] = js.native
  
  var _bitmaps: Set[Any] = js.native
  
  /**
    * Destroys the page object.
    * @private
    */
  /* private */ var _destroy: Any = js.native
  
  var _intentStates: Map[Any, Any] = js.native
  
  var _jsActionsPromise: Any = js.native
  
  var _ownerDocument: Any = js.native
  
  var _pageIndex: Any = js.native
  
  var _pageInfo: Any = js.native
  
  var _pdfBug: Boolean = js.native
  
  /**
    * @private
    */
  /* private */ var _pumpOperatorList: Any = js.native
  
  /**
    * @private
    */
  /* private */ var _renderPageChunk: Any = js.native
  
  /**
    * @private
    */
  /* private */ var _startRenderPage: Any = js.native
  
  var _stats: StatTimer | Null = js.native
  
  var _structTreePromise: Any = js.native
  
  var _transport: Any = js.native
  
  /**
    * Attempts to clean up if rendering is in a state where that's possible.
    * @private
    */
  /* private */ var _tryCleanup: Any = js.native
  
  /**
    * Cleans up resources allocated by the page.
    *
    * @param {boolean} [resetStats] - Reset page stats, if enabled.
    *   The default value is `false`.
    * @returns {boolean} Indicates if clean-up was successfully run.
    */
  def cleanup(): Boolean = js.native
  def cleanup(resetStats: Boolean): Boolean = js.native
  
  var cleanupAfterRender: Boolean = js.native
  
  /** @type {PDFObjects} */
  var commonObjs: PDFObjects = js.native
  
  var destroyed: Boolean = js.native
  
  /**
    * @param {GetAnnotationsParameters} params - Annotation parameters.
    * @returns {Promise<Array<any>>} A promise that is resolved with an
    *   {Array} of the annotation objects.
    */
  def getAnnotations(): js.Promise[js.Array[Any]] = js.native
  def getAnnotations(hasIntent: GetAnnotationsParameters): js.Promise[js.Array[Any]] = js.native
  
  /**
    * @returns {Promise<Object>} A promise that is resolved with an
    *   {Object} with JS actions.
    */
  def getJSActions(): js.Promise[js.Object] = js.native
  
  /**
    * @param {GetOperatorListParameters} params - Page getOperatorList
    *   parameters.
    * @returns {Promise<PDFOperatorList>} A promise resolved with an
    *   {@link PDFOperatorList} object that represents the page's operator list.
    */
  def getOperatorList(): js.Promise[PDFOperatorList] = js.native
  def getOperatorList(hasIntentAnnotationModePrintAnnotationStorage: GetOperatorListParameters): js.Promise[PDFOperatorList] = js.native
  
  /**
    * @returns {Promise<StructTreeNode>} A promise that is resolved with a
    *   {@link StructTreeNode} object that represents the page's structure tree,
    *   or `null` when no structure tree is present for the current page.
    */
  def getStructTree(): js.Promise[StructTreeNode] = js.native
  
  /**
    * NOTE: All occurrences of whitespace will be replaced by
    * standard spaces (0x20).
    *
    * @param {getTextContentParameters} params - getTextContent parameters.
    * @returns {Promise<TextContent>} A promise that is resolved with a
    *   {@link TextContent} object that represents the page's text content.
    */
  def getTextContent(): js.Promise[TextContent] = js.native
  def getTextContent(params: getTextContentParameters): js.Promise[TextContent] = js.native
  
  /**
    * @param {GetViewportParameters} params - Viewport parameters.
    * @returns {PageViewport} Contains 'width' and 'height' properties
    *   along with transforms required for rendering.
    */
  def getViewport(): PageViewport = js.native
  def getViewport(hasScaleRotationOffsetXOffsetYDontFlip: GetViewportParameters): PageViewport = js.native
  
  /**
    * @returns {Promise<Object | null>} A promise that is resolved with
    *   an {Object} with a fake DOM object (a tree structure where elements
    *   are {Object} with a name, attributes (class, style, ...), value and
    *   children, very similar to a HTML DOM tree), or `null` if no XFA exists.
    */
  def getXfa(): js.Promise[js.Object | Null] = js.native
  
  var objs: PDFObjects = js.native
  
  /**
    * @type {number} Page number of the page. First page is 1.
    */
  def pageNumber: Double = js.native
  
  var pendingCleanup: Boolean = js.native
  
  /**
    * @type {RefProxy | null} The reference that points to this page.
    */
  def ref: RefProxy | Null = js.native
  
  /**
    * Begins the process of rendering a page to the desired context.
    *
    * @param {RenderParameters} params - Page render parameters.
    * @returns {RenderTask} An object that contains a promise that is
    *   resolved when the page finishes rendering.
    */
  def render(
    hasCanvasContextViewportIntentAnnotationModeTransformImageLayerCanvasFactoryBackgroundOptionalContentConfigPromiseAnnotationCanvasMapPageColorsPrintAnnotationStorage: RenderParameters,
    args: Any*
  ): RenderTask = js.native
  
  /**
    * @type {number} The number of degrees the page is rotated clockwise.
    */
  def rotate: Double = js.native
  
  /**
    * @type {Object} Returns page stats, if enabled; returns `null` otherwise.
    */
  def stats: js.Object = js.native
  
  /**
    * NOTE: All occurrences of whitespace will be replaced by
    * standard spaces (0x20).
    *
    * @param {getTextContentParameters} params - getTextContent parameters.
    * @returns {ReadableStream} Stream for reading text content chunks.
    */
  def streamTextContent(): ReadableStream[Any] = js.native
  def streamTextContent(hasDisableCombineTextItemsIncludeMarkedContent: getTextContentParameters): ReadableStream[Any] = js.native
  
  /**
    * @type {number} The default size of units in 1/72nds of an inch.
    */
  def userUnit: Double = js.native
  
  /**
    * @type {Array<number>} An array of the visible portion of the PDF page in
    *   user space units [x1, y1, x2, y2].
    */
  def view: js.Array[Double] = js.native
}
