package typings
package pdfjsDashDistLib.pdfjsDashDistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFJSStatic extends js.Object {
  /**
    * Specifies if CMaps are binary packed.
    */
  var cMapPacked: scala.Boolean
  /**
    * The url of where the predefined Adobe CMaps are located. Include trailing
    * slash.
    */
  var cMapUrl: java.lang.String
  /**
    * Disable pre-fetching of PDF file data. When range requests are enabled PDF.js
    * will automatically keep fetching more data even if it isn't needed to display
    * the current page. This default behavior can be disabled.
    *
    * NOTE: It is also necessary to disable streaming, see above,
    *       in order for disabling of pre-fetching to work correctly.
    */
  var disableAutoFetch: scala.Boolean
  /**
    * Disables URL.createObjectURL usage.
    */
  var disableCreateObjectURL: scala.Boolean
  /**
    * By default fonts are converted to OpenType fonts and loaded via font face rules.  If disabled, the font will be rendered using a built in font renderer that constructs the glyphs with primitive path commands.
    **/
  var disableFontFace: scala.Boolean
  /**
    * Disables fullscreen support, and by extension Presentation Mode,
    * in browsers which support the fullscreen API.
    */
  var disableFullscreen: scala.Boolean
  /**
    * Disable range request loading of PDF files. When enabled and if the server
    * supports partial content requests then the PDF will be fetched in chunks.
    * Enabled (false) by default.
    */
  var disableRange: scala.Boolean
  /**
    * Disable streaming of PDF file data. By default PDF.js attempts to load PDF
    * in chunks. This default behavior can be disabled.
    */
  var disableStream: scala.Boolean
  /**
    * Disable the text layer of PDF when used PDF.js renders a canvas instead of div elements
    *
    */
  var disableTextLayer: scala.Boolean
  /**
    * Disables WebGL usage.
    */
  var disableWebGL: scala.Boolean
  /**
    * Disable the web worker and run all code on the main thread. This will happen
    * automatically if the browser doesn't support workers or sending typed arrays
    * to workers.
    */
  var disableWorker: scala.Boolean
  /**
    * Path for image resources, mainly for annotation icons. Include trailing
    * slash.
    */
  var imageResourcesPath: java.lang.String
  /**
    * Determines if we can eval strings as JS. Primarily used to improve
    * performance for font rendering.
    */
  var isEvalSupported: scala.Boolean
  /**
    * The maximum supported canvas size in total pixels e.g. width * height.
    * The default value is 4096 * 4096. Use -1 for no limit.
    */
  var maxCanvasPixels: scala.Double
  /**
    * The maximum allowed image size in total pixels e.g. width * height.  Images above this value will not be drawn.  Use -1 for no limit.
    **/
  var maxImageSize: scala.Double
  /**
    * Opens external links in a new window if enabled. The default behavior opens
    * external links in the PDF.js window.
    */
  var openExternalLinksInNewWindow: scala.Boolean
  /**
    * Enables special hooks for debugging PDF.js.
    */
  var pdfBug: scala.Boolean
  /**
    * Enables transfer usage in postMessage for ArrayBuffers.
    */
  var postMessageTransfers: scala.Boolean
  /**
    * Enables CSS only zooming.
    */
  var useOnlyCssZoom: scala.Boolean
  /**
    * Controls the logging level.
    * The constants from PDFJS.VERBOSITY_LEVELS should be used:
    * - errors
    * - warnings [default]
    * - infos
    */
  var verbosity: scala.Double
  /**
    * Path and filename of the worker file. Required when the worker is enabled in
    * development mode. If unspecified in the production build, the worker will be
    * loaded based on the location of the pdf.js file.
    */
  var workerSrc: java.lang.String
  /**
    * yet another viewer, this will render only one page at the time, reducing rendering time
    * very important for mobile development
    * @params {PDFViewerParams}
    */
  def PDFSinglePageViewer(params: PDFViewerParams): scala.Unit
  def PDFViewer(params: PDFViewerParams): scala.Unit
}

object PDFJSStatic {
  @scala.inline
  def apply(
    PDFSinglePageViewer: PDFViewerParams => scala.Unit,
    PDFViewer: PDFViewerParams => scala.Unit,
    cMapPacked: scala.Boolean,
    cMapUrl: java.lang.String,
    disableAutoFetch: scala.Boolean,
    disableCreateObjectURL: scala.Boolean,
    disableFontFace: scala.Boolean,
    disableFullscreen: scala.Boolean,
    disableRange: scala.Boolean,
    disableStream: scala.Boolean,
    disableTextLayer: scala.Boolean,
    disableWebGL: scala.Boolean,
    disableWorker: scala.Boolean,
    imageResourcesPath: java.lang.String,
    isEvalSupported: scala.Boolean,
    maxCanvasPixels: scala.Double,
    maxImageSize: scala.Double,
    openExternalLinksInNewWindow: scala.Boolean,
    pdfBug: scala.Boolean,
    postMessageTransfers: scala.Boolean,
    useOnlyCssZoom: scala.Boolean,
    verbosity: scala.Double,
    workerSrc: java.lang.String
  ): PDFJSStatic = {
    val __obj = js.Dynamic.literal(PDFSinglePageViewer = js.Any.fromFunction1(PDFSinglePageViewer), PDFViewer = js.Any.fromFunction1(PDFViewer), cMapPacked = cMapPacked, cMapUrl = cMapUrl, disableAutoFetch = disableAutoFetch, disableCreateObjectURL = disableCreateObjectURL, disableFontFace = disableFontFace, disableFullscreen = disableFullscreen, disableRange = disableRange, disableStream = disableStream, disableTextLayer = disableTextLayer, disableWebGL = disableWebGL, disableWorker = disableWorker, imageResourcesPath = imageResourcesPath, isEvalSupported = isEvalSupported, maxCanvasPixels = maxCanvasPixels, maxImageSize = maxImageSize, openExternalLinksInNewWindow = openExternalLinksInNewWindow, pdfBug = pdfBug, postMessageTransfers = postMessageTransfers, useOnlyCssZoom = useOnlyCssZoom, verbosity = verbosity, workerSrc = workerSrc)
  
    __obj.asInstanceOf[PDFJSStatic]
  }
}

