package typings.pdfjsDist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.pdfjsDist.pdfjsDistStrings.decode
import typings.pdfjsDist.pdfjsDistStrings.display
import typings.pdfjsDist.pdfjsDistStrings.none
import typings.std.BufferSource
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFSource extends js.Object {
  /**
    * The factory that will be
    * used when reading built-in CMap files. Providing a custom factory is useful
    * for environments without `XMLHttpRequest` support, such as e.g. Node.js.
    * The default value is {DOMCMapReaderFactory}.
    */
  var CMapReaderFactory: js.UndefOr[js.Any] = js.native
  /**
    * Specifies if the Adobe CMaps are
    * binary packed. */
  var cMapPacked: js.UndefOr[Boolean] = js.native
  /**
    * The URL where the predefined
    * Adobe CMaps are located. Include trailing slash. */
  var cMapUrl: js.UndefOr[String] = js.native
  /**
    * Binary PDF data. Use typed arrays
    * (Uint8Array) to improve the memory usage. If PDF data is BASE64-encoded,
    * use atob() to convert it to a binary string first.
    */
  var data: js.UndefOr[Uint8Array | BufferSource | String] = js.native
  /**
    * Disable pre-fetching of PDF
    *   file data. When range requests are enabled PDF.js will automatically keep
    *   fetching more data even if it isn't needed to display the current page.
    *   The default value is `false`.
    *   NOTE: It is also necessary to disable streaming, see above,
    *         in order for disabling of pre-fetching to work correctly.
    */
  var disableAutoFetch: js.UndefOr[Boolean] = js.native
  /**
    * Disable the use of
    *   `URL.createObjectURL`, for compatibility with older browsers.
    *   The default value is `false`.
    */
  var disableCreateObjectURL: js.UndefOr[Boolean] = js.native
  /**
    * By default fonts are
    *   converted to OpenType fonts and loaded via font face rules. If disabled,
    *   fonts will be rendered using a built-in font renderer that constructs the
    *   glyphs with primitive path commands. The default value is `false`.
    */
  var disableFontFace: js.UndefOr[Boolean] = js.native
  /**
    * Disable range request loading
    *   of PDF files. When enabled, and if the server supports partial content
    *   requests, then the PDF will be fetched in chunks.
    *   The default value is `false`.
    */
  var disableRange: js.UndefOr[Boolean] = js.native
  /**
    * Disable streaming of PDF file
    *   data. By default PDF.js attempts to load PDFs in chunks.
    *   The default value is `false`.
    */
  var disableStream: js.UndefOr[Boolean] = js.native
  /**
    * The base URL of the document,
    * used when attempting to recover valid absolute URLs for annotations, and
    * outline items, that (incorrectly) only specify relative URLs.
    */
  var docBaseUrl: js.UndefOr[String] = js.native
  /**
    * Basic authentication headers.
    */
  var httpHeaders: js.UndefOr[StringDictionary[String]] = js.native
  /*
    * A typed array with the first portion or
    * all of the pdf data. Used by the extension since some data is already
    * loaded before the switch to range requests.  */
  var initialData: js.UndefOr[Uint8Array | BufferSource] = js.native
  /**
    * Determines if we can eval
    * strings as JS. Primarily used to improve performance of font rendering,
    * and when parsing PDF functions. The default value is `true`.
    */
  var isEvalSupported: js.UndefOr[Boolean] = js.native
  /*
    * The PDF file length. It's used for progress
    * reports and range requests operations.
    */
  var length: js.UndefOr[Double] = js.native
  /**
    * The maximum allowed image size
    * in total pixels, i.e. width * height. Images above this value will not be
    * rendered. Use -1 for no limit, which is also the default value.
    */
  var maxImageSize: js.UndefOr[Double] = js.native
  /**
    * Strategy for
    * decoding certain (simple) JPEG images in the browser. This is useful for
    * environments without DOM image and canvas support, such as e.g. Node.js.
    * Valid values are 'decode', 'display' or 'none'; where 'decode' is intended
    * for browsers with full image/canvas support, 'display' for environments
    * with limited image support through stubs (useful for SVG conversion),
    * and 'none' where JPEG images will be decoded entirely by PDF.js.
    * The default value is 'decode'.
    */
  var nativeImageDecoderSupport: js.UndefOr[decode | display | none] = js.native
  /**
    * For decrypting password-protected PDFs.
    */
  var password: js.UndefOr[String] = js.native
  /**
    * Enables special hooks for debugging
    * PDF.js (see `web/debugger.js`). The default value is `false`.
    */
  var pdfBug: js.UndefOr[Boolean] = js.native
  /** range */
  var range: js.UndefOr[PDFDataRangeTransport] = js.native
  /**
    * Optional parameter to specify
    * maximum number of bytes fetched per range request. The default value is
    * 2^16 = 65536. */
  var rangeChunkSize: js.UndefOr[Double] = js.native
  /**
    * Reject certain promises, e.g.
    * `getOperatorList`, `getTextContent`, and `RenderTask`, when the associated
    * PDF data cannot be successfully parsed, instead of attempting to recover
    * whatever possible of the data. The default value is `false`.
    */
  var stopAtErrors: js.UndefOr[Boolean] = js.native
  /** The URL of the PDF. */
  var url: js.UndefOr[String] = js.native
  /**
    * Controls the logging level; the
    * constants from {VerbosityLevel} should be used.
    */
  var verbosity: js.UndefOr[Double] = js.native
  /**
    * Indicates whether or not cross-site
    * Access-Control requests should be made using credentials such as cookies
    * or authorization headers. The default is false.
    */
  var withCredentials: js.UndefOr[Boolean] = js.native
  /**
    * The worker that will be used for
    * the loading and parsing of the PDF data.
    */
  var worker: js.UndefOr[PDFWorker] = js.native
}

object PDFSource {
  @scala.inline
  def apply(): PDFSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFSource]
  }
  @scala.inline
  implicit class PDFSourceOps[Self <: PDFSource] (val x: Self) extends AnyVal {
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
    def setCMapReaderFactory(value: js.Any): Self = this.set("CMapReaderFactory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCMapReaderFactory: Self = this.set("CMapReaderFactory", js.undefined)
    @scala.inline
    def setCMapPacked(value: Boolean): Self = this.set("cMapPacked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCMapPacked: Self = this.set("cMapPacked", js.undefined)
    @scala.inline
    def setCMapUrl(value: String): Self = this.set("cMapUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCMapUrl: Self = this.set("cMapUrl", js.undefined)
    @scala.inline
    def setData(value: Uint8Array | BufferSource | String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDisableAutoFetch(value: Boolean): Self = this.set("disableAutoFetch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableAutoFetch: Self = this.set("disableAutoFetch", js.undefined)
    @scala.inline
    def setDisableCreateObjectURL(value: Boolean): Self = this.set("disableCreateObjectURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableCreateObjectURL: Self = this.set("disableCreateObjectURL", js.undefined)
    @scala.inline
    def setDisableFontFace(value: Boolean): Self = this.set("disableFontFace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableFontFace: Self = this.set("disableFontFace", js.undefined)
    @scala.inline
    def setDisableRange(value: Boolean): Self = this.set("disableRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableRange: Self = this.set("disableRange", js.undefined)
    @scala.inline
    def setDisableStream(value: Boolean): Self = this.set("disableStream", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableStream: Self = this.set("disableStream", js.undefined)
    @scala.inline
    def setDocBaseUrl(value: String): Self = this.set("docBaseUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocBaseUrl: Self = this.set("docBaseUrl", js.undefined)
    @scala.inline
    def setHttpHeaders(value: StringDictionary[String]): Self = this.set("httpHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpHeaders: Self = this.set("httpHeaders", js.undefined)
    @scala.inline
    def setInitialData(value: Uint8Array | BufferSource): Self = this.set("initialData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialData: Self = this.set("initialData", js.undefined)
    @scala.inline
    def setIsEvalSupported(value: Boolean): Self = this.set("isEvalSupported", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsEvalSupported: Self = this.set("isEvalSupported", js.undefined)
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setMaxImageSize(value: Double): Self = this.set("maxImageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxImageSize: Self = this.set("maxImageSize", js.undefined)
    @scala.inline
    def setNativeImageDecoderSupport(value: decode | display | none): Self = this.set("nativeImageDecoderSupport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNativeImageDecoderSupport: Self = this.set("nativeImageDecoderSupport", js.undefined)
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setPdfBug(value: Boolean): Self = this.set("pdfBug", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePdfBug: Self = this.set("pdfBug", js.undefined)
    @scala.inline
    def setRange(value: PDFDataRangeTransport): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    @scala.inline
    def setRangeChunkSize(value: Double): Self = this.set("rangeChunkSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeChunkSize: Self = this.set("rangeChunkSize", js.undefined)
    @scala.inline
    def setStopAtErrors(value: Boolean): Self = this.set("stopAtErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopAtErrors: Self = this.set("stopAtErrors", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setVerbosity(value: Double): Self = this.set("verbosity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbosity: Self = this.set("verbosity", js.undefined)
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithCredentials: Self = this.set("withCredentials", js.undefined)
    @scala.inline
    def setWorker(value: PDFWorker): Self = this.set("worker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorker: Self = this.set("worker", js.undefined)
  }
  
}

