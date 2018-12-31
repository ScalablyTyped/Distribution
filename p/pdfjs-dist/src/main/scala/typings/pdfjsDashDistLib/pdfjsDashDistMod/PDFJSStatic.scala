package typings
package pdfjsDashDistLib.pdfjsDashDistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFJSStatic extends js.Object {
  var Util: PDFJSUtilStatic = js.native
  /**
    * Specifies if CMaps are binary packed.
    */
  var cMapPacked: scala.Boolean = js.native
  /**
    * The url of where the predefined Adobe CMaps are located. Include trailing
    * slash.
    */
  var cMapUrl: java.lang.String = js.native
  /**
    * Disable pre-fetching of PDF file data. When range requests are enabled PDF.js
    * will automatically keep fetching more data even if it isn't needed to display
    * the current page. This default behavior can be disabled.
    *
    * NOTE: It is also necessary to disable streaming, see above,
    *       in order for disabling of pre-fetching to work correctly.
    */
  var disableAutoFetch: scala.Boolean = js.native
  /**
    * Disables URL.createObjectURL usage.
    */
  var disableCreateObjectURL: scala.Boolean = js.native
  /**
    * By default fonts are converted to OpenType fonts and loaded via font face rules.  If disabled, the font will be rendered using a built in font renderer that constructs the glyphs with primitive path commands.
    **/
  var disableFontFace: scala.Boolean = js.native
  /**
    * Disables fullscreen support, and by extension Presentation Mode,
    * in browsers which support the fullscreen API.
    */
  var disableFullscreen: scala.Boolean = js.native
  /**
    * Disable range request loading of PDF files. When enabled and if the server
    * supports partial content requests then the PDF will be fetched in chunks.
    * Enabled (false) by default.
    */
  var disableRange: scala.Boolean = js.native
  /**
    * Disable streaming of PDF file data. By default PDF.js attempts to load PDF
    * in chunks. This default behavior can be disabled.
    */
  var disableStream: scala.Boolean = js.native
  /**
    * Disable the text layer of PDF when used PDF.js renders a canvas instead of div elements
    *
    */
  var disableTextLayer: scala.Boolean = js.native
  /**
    * Disables WebGL usage.
    */
  var disableWebGL: scala.Boolean = js.native
  /**
    * Disable the web worker and run all code on the main thread. This will happen
    * automatically if the browser doesn't support workers or sending typed arrays
    * to workers.
    */
  var disableWorker: scala.Boolean = js.native
  /**
    * Path for image resources, mainly for annotation icons. Include trailing
    * slash.
    */
  var imageResourcesPath: java.lang.String = js.native
  /**
    * Determines if we can eval strings as JS. Primarily used to improve
    * performance for font rendering.
    */
  var isEvalSupported: scala.Boolean = js.native
  /**
    * The maximum supported canvas size in total pixels e.g. width * height.
    * The default value is 4096 * 4096. Use -1 for no limit.
    */
  var maxCanvasPixels: scala.Double = js.native
  /**
    * The maximum allowed image size in total pixels e.g. width * height.  Images above this value will not be drawn.  Use -1 for no limit.
    **/
  var maxImageSize: scala.Double = js.native
  /**
    * Opens external links in a new window if enabled. The default behavior opens
    * external links in the PDF.js window.
    */
  var openExternalLinksInNewWindow: scala.Boolean = js.native
  /**
    * Enables special hooks for debugging PDF.js.
    */
  var pdfBug: scala.Boolean = js.native
  /**
    * Enables transfer usage in postMessage for ArrayBuffers.
    */
  var postMessageTransfers: scala.Boolean = js.native
  /**
    * Enables CSS only zooming.
    */
  var useOnlyCssZoom: scala.Boolean = js.native
  /**
    * Controls the logging level.
    * The constants from PDFJS.VERBOSITY_LEVELS should be used:
    * - errors
    * - warnings [default]
    * - infos
    */
  var verbosity: scala.Double = js.native
  /**
    * Path and filename of the worker file. Required when the worker is enabled in
    * development mode. If unspecified in the production build, the worker will be
    * loaded based on the location of the pdf.js file.
    */
  var workerSrc: java.lang.String = js.native
  /**
    * yet another viewer, this will render only one page at the time, reducing rendering time
    * very important for mobile development
    * @params {PDFViewerParams}
    */
  def PDFSinglePageViewer(params: PDFViewerParams): scala.Unit = js.native
  def PDFViewer(params: PDFViewerParams): scala.Unit = js.native
  /**
    * This is the main entry point for loading a PDF and interacting with it.
    * NOTE: If a URL is used to fetch the PDF data a standard XMLHttpRequest(XHR)
    * is used, which means it must follow the same origin rules that any XHR does
    * e.g. No corss domain requests without CORS.
    * @param source
    * @param pdfDataRangeTransport Used if you want to manually server range requests for data in the PDF.  @ee viewer.js for an example of pdfDataRangeTransport's interface.
    * @param passwordCallback Used to request a password if wrong or no password was provided.  The callback receives two parameters: function that needs to be called with new password and the reason.
    * @param progressCallback Progress callback.
    * @return A promise that is resolved with PDFDocumentProxy object.
    **/
  def getDocument(source: java.lang.String): PDFPromise[PDFDocumentProxy] = js.native
  def getDocument(source: java.lang.String, pdfDataRangeTransport: js.Any): PDFPromise[PDFDocumentProxy] = js.native
  def getDocument(
    source: java.lang.String,
    pdfDataRangeTransport: js.Any,
    passwordCallback: js.Function2[
      /* fn */ js.Function1[/* password */ java.lang.String, scala.Unit], 
      /* reason */ java.lang.String, 
      java.lang.String
    ]
  ): PDFPromise[PDFDocumentProxy] = js.native
  def getDocument(
    source: java.lang.String,
    pdfDataRangeTransport: js.Any,
    passwordCallback: js.Function2[
      /* fn */ js.Function1[/* password */ java.lang.String, scala.Unit], 
      /* reason */ java.lang.String, 
      java.lang.String
    ],
    progressCallback: js.Function1[/* progressData */ PDFProgressData, scala.Unit]
  ): PDFPromise[PDFDocumentProxy] = js.native
  def getDocument(source: PDFSource): PDFPromise[PDFDocumentProxy] = js.native
  def getDocument(source: PDFSource, pdfDataRangeTransport: js.Any): PDFPromise[PDFDocumentProxy] = js.native
  def getDocument(
    source: PDFSource,
    pdfDataRangeTransport: js.Any,
    passwordCallback: js.Function2[
      /* fn */ js.Function1[/* password */ java.lang.String, scala.Unit], 
      /* reason */ java.lang.String, 
      java.lang.String
    ]
  ): PDFPromise[PDFDocumentProxy] = js.native
  def getDocument(
    source: PDFSource,
    pdfDataRangeTransport: js.Any,
    passwordCallback: js.Function2[
      /* fn */ js.Function1[/* password */ java.lang.String, scala.Unit], 
      /* reason */ java.lang.String, 
      java.lang.String
    ],
    progressCallback: js.Function1[/* progressData */ PDFProgressData, scala.Unit]
  ): PDFPromise[PDFDocumentProxy] = js.native
  def getDocument(source: stdLib.Uint8Array): PDFPromise[PDFDocumentProxy] = js.native
  def getDocument(source: stdLib.Uint8Array, pdfDataRangeTransport: js.Any): PDFPromise[PDFDocumentProxy] = js.native
  def getDocument(
    source: stdLib.Uint8Array,
    pdfDataRangeTransport: js.Any,
    passwordCallback: js.Function2[
      /* fn */ js.Function1[/* password */ java.lang.String, scala.Unit], 
      /* reason */ java.lang.String, 
      java.lang.String
    ]
  ): PDFPromise[PDFDocumentProxy] = js.native
  def getDocument(
    source: stdLib.Uint8Array,
    pdfDataRangeTransport: js.Any,
    passwordCallback: js.Function2[
      /* fn */ js.Function1[/* password */ java.lang.String, scala.Unit], 
      /* reason */ java.lang.String, 
      java.lang.String
    ],
    progressCallback: js.Function1[/* progressData */ PDFProgressData, scala.Unit]
  ): PDFPromise[PDFDocumentProxy] = js.native
}

