package typings.pdfjsDist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFJSStatic extends js.Object {
  /**
    * Specifies if CMaps are binary packed.
    */
  var cMapPacked: Boolean = js.native
  /**
    * The url of where the predefined Adobe CMaps are located. Include trailing
    * slash.
    */
  var cMapUrl: String = js.native
  /**
    * Disable pre-fetching of PDF file data. When range requests are enabled PDF.js
    * will automatically keep fetching more data even if it isn't needed to display
    * the current page. This default behavior can be disabled.
    *
    * NOTE: It is also necessary to disable streaming, see above,
    *       in order for disabling of pre-fetching to work correctly.
    */
  var disableAutoFetch: Boolean = js.native
  /**
    * Disables URL.createObjectURL usage.
    */
  var disableCreateObjectURL: Boolean = js.native
  /**
    * By default fonts are converted to OpenType fonts and loaded via font face rules.  If disabled, the font will be rendered using a built in font renderer that constructs the glyphs with primitive path commands.
    **/
  var disableFontFace: Boolean = js.native
  /**
    * Disables fullscreen support, and by extension Presentation Mode,
    * in browsers which support the fullscreen API.
    */
  var disableFullscreen: Boolean = js.native
  /**
    * Disable range request loading of PDF files. When enabled and if the server
    * supports partial content requests then the PDF will be fetched in chunks.
    * Enabled (false) by default.
    */
  var disableRange: Boolean = js.native
  /**
    * Disable streaming of PDF file data. By default PDF.js attempts to load PDF
    * in chunks. This default behavior can be disabled.
    */
  var disableStream: Boolean = js.native
  /**
    * Disable the text layer of PDF when used PDF.js renders a canvas instead of div elements
    *
    */
  var disableTextLayer: Boolean = js.native
  /**
    * Disables WebGL usage.
    */
  var disableWebGL: Boolean = js.native
  /**
    * Disable the web worker and run all code on the main thread. This will happen
    * automatically if the browser doesn't support workers or sending typed arrays
    * to workers.
    */
  var disableWorker: Boolean = js.native
  /**
    * Path for image resources, mainly for annotation icons. Include trailing
    * slash.
    */
  var imageResourcesPath: String = js.native
  /**
    * Determines if we can eval strings as JS. Primarily used to improve
    * performance for font rendering.
    */
  var isEvalSupported: Boolean = js.native
  /**
    * The maximum supported canvas size in total pixels e.g. width * height.
    * The default value is 4096 * 4096. Use -1 for no limit.
    */
  var maxCanvasPixels: Double = js.native
  /**
    * The maximum allowed image size in total pixels e.g. width * height.  Images above this value will not be drawn.  Use -1 for no limit.
    **/
  var maxImageSize: Double = js.native
  /**
    * Opens external links in a new window if enabled. The default behavior opens
    * external links in the PDF.js window.
    */
  var openExternalLinksInNewWindow: Boolean = js.native
  /**
    * Enables special hooks for debugging PDF.js.
    */
  var pdfBug: Boolean = js.native
  /**
    * Enables transfer usage in postMessage for ArrayBuffers.
    */
  var postMessageTransfers: Boolean = js.native
  /**
    * Enables CSS only zooming.
    */
  var useOnlyCssZoom: Boolean = js.native
  /**
    * Controls the logging level.
    * The constants from PDFJS.VERBOSITY_LEVELS should be used:
    * - errors
    * - warnings [default]
    * - infos
    */
  var verbosity: Double = js.native
  /**
    * Path and filename of the worker file. Required when the worker is enabled in
    * development mode. If unspecified in the production build, the worker will be
    * loaded based on the location of the pdf.js file.
    */
  var workerSrc: String = js.native
  /**
    * yet another viewer, this will render only one page at the time, reducing rendering time
    * very important for mobile development
    * @params {PDFViewerParams}
    */
  def PDFSinglePageViewer(params: PDFViewerParams): Unit = js.native
  def PDFViewer(params: PDFViewerParams): Unit = js.native
}

object PDFJSStatic {
  @scala.inline
  def apply(
    PDFSinglePageViewer: PDFViewerParams => Unit,
    PDFViewer: PDFViewerParams => Unit,
    cMapPacked: Boolean,
    cMapUrl: String,
    disableAutoFetch: Boolean,
    disableCreateObjectURL: Boolean,
    disableFontFace: Boolean,
    disableFullscreen: Boolean,
    disableRange: Boolean,
    disableStream: Boolean,
    disableTextLayer: Boolean,
    disableWebGL: Boolean,
    disableWorker: Boolean,
    imageResourcesPath: String,
    isEvalSupported: Boolean,
    maxCanvasPixels: Double,
    maxImageSize: Double,
    openExternalLinksInNewWindow: Boolean,
    pdfBug: Boolean,
    postMessageTransfers: Boolean,
    useOnlyCssZoom: Boolean,
    verbosity: Double,
    workerSrc: String
  ): PDFJSStatic = {
    val __obj = js.Dynamic.literal(PDFSinglePageViewer = js.Any.fromFunction1(PDFSinglePageViewer), PDFViewer = js.Any.fromFunction1(PDFViewer), cMapPacked = cMapPacked.asInstanceOf[js.Any], cMapUrl = cMapUrl.asInstanceOf[js.Any], disableAutoFetch = disableAutoFetch.asInstanceOf[js.Any], disableCreateObjectURL = disableCreateObjectURL.asInstanceOf[js.Any], disableFontFace = disableFontFace.asInstanceOf[js.Any], disableFullscreen = disableFullscreen.asInstanceOf[js.Any], disableRange = disableRange.asInstanceOf[js.Any], disableStream = disableStream.asInstanceOf[js.Any], disableTextLayer = disableTextLayer.asInstanceOf[js.Any], disableWebGL = disableWebGL.asInstanceOf[js.Any], disableWorker = disableWorker.asInstanceOf[js.Any], imageResourcesPath = imageResourcesPath.asInstanceOf[js.Any], isEvalSupported = isEvalSupported.asInstanceOf[js.Any], maxCanvasPixels = maxCanvasPixels.asInstanceOf[js.Any], maxImageSize = maxImageSize.asInstanceOf[js.Any], openExternalLinksInNewWindow = openExternalLinksInNewWindow.asInstanceOf[js.Any], pdfBug = pdfBug.asInstanceOf[js.Any], postMessageTransfers = postMessageTransfers.asInstanceOf[js.Any], useOnlyCssZoom = useOnlyCssZoom.asInstanceOf[js.Any], verbosity = verbosity.asInstanceOf[js.Any], workerSrc = workerSrc.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFJSStatic]
  }
  @scala.inline
  implicit class PDFJSStaticOps[Self <: PDFJSStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPDFSinglePageViewer(value: PDFViewerParams => Unit): Self = this.set("PDFSinglePageViewer", js.Any.fromFunction1(value))
    @scala.inline
    def setPDFViewer(value: PDFViewerParams => Unit): Self = this.set("PDFViewer", js.Any.fromFunction1(value))
    @scala.inline
    def setCMapPacked(value: Boolean): Self = this.set("cMapPacked", value.asInstanceOf[js.Any])
    @scala.inline
    def setCMapUrl(value: String): Self = this.set("cMapUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableAutoFetch(value: Boolean): Self = this.set("disableAutoFetch", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableCreateObjectURL(value: Boolean): Self = this.set("disableCreateObjectURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableFontFace(value: Boolean): Self = this.set("disableFontFace", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableFullscreen(value: Boolean): Self = this.set("disableFullscreen", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableRange(value: Boolean): Self = this.set("disableRange", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableStream(value: Boolean): Self = this.set("disableStream", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableTextLayer(value: Boolean): Self = this.set("disableTextLayer", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableWebGL(value: Boolean): Self = this.set("disableWebGL", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableWorker(value: Boolean): Self = this.set("disableWorker", value.asInstanceOf[js.Any])
    @scala.inline
    def setImageResourcesPath(value: String): Self = this.set("imageResourcesPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsEvalSupported(value: Boolean): Self = this.set("isEvalSupported", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxCanvasPixels(value: Double): Self = this.set("maxCanvasPixels", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxImageSize(value: Double): Self = this.set("maxImageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpenExternalLinksInNewWindow(value: Boolean): Self = this.set("openExternalLinksInNewWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def setPdfBug(value: Boolean): Self = this.set("pdfBug", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostMessageTransfers(value: Boolean): Self = this.set("postMessageTransfers", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseOnlyCssZoom(value: Boolean): Self = this.set("useOnlyCssZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerbosity(value: Double): Self = this.set("verbosity", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkerSrc(value: String): Self = this.set("workerSrc", value.asInstanceOf[js.Any])
  }
  
}

