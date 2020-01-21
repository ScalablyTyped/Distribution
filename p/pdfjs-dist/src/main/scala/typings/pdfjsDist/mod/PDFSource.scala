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

trait PDFSource extends js.Object {
  /**
    * The factory that will be
    * used when reading built-in CMap files. Providing a custom factory is useful
    * for environments without `XMLHttpRequest` support, such as e.g. Node.js.
    * The default value is {DOMCMapReaderFactory}.
    */
  var CMapReaderFactory: js.UndefOr[js.Any] = js.undefined
  /**
    * Specifies if the Adobe CMaps are
    * binary packed. */
  var cMapPacked: js.UndefOr[Boolean] = js.undefined
  /**
    * The URL where the predefined
    * Adobe CMaps are located. Include trailing slash. */
  var cMapUrl: js.UndefOr[String] = js.undefined
  /**
    * Binary PDF data. Use typed arrays
    * (Uint8Array) to improve the memory usage. If PDF data is BASE64-encoded,
    * use atob() to convert it to a binary string first.
    */
  var data: js.UndefOr[Uint8Array | BufferSource | String] = js.undefined
  /**
    * Disable pre-fetching of PDF
    *   file data. When range requests are enabled PDF.js will automatically keep
    *   fetching more data even if it isn't needed to display the current page.
    *   The default value is `false`.
    *   NOTE: It is also necessary to disable streaming, see above,
    *         in order for disabling of pre-fetching to work correctly.
    */
  var disableAutoFetch: js.UndefOr[Boolean] = js.undefined
  /**
    * Disable the use of
    *   `URL.createObjectURL`, for compatibility with older browsers.
    *   The default value is `false`.
    */
  var disableCreateObjectURL: js.UndefOr[Boolean] = js.undefined
  /**
    * By default fonts are
    *   converted to OpenType fonts and loaded via font face rules. If disabled,
    *   fonts will be rendered using a built-in font renderer that constructs the
    *   glyphs with primitive path commands. The default value is `false`.
    */
  var disableFontFace: js.UndefOr[Boolean] = js.undefined
  /**
    * Disable range request loading
    *   of PDF files. When enabled, and if the server supports partial content
    *   requests, then the PDF will be fetched in chunks.
    *   The default value is `false`.
    */
  var disableRange: js.UndefOr[Boolean] = js.undefined
  /**
    * Disable streaming of PDF file
    *   data. By default PDF.js attempts to load PDFs in chunks.
    *   The default value is `false`.
    */
  var disableStream: js.UndefOr[Boolean] = js.undefined
  /**
    * The base URL of the document,
    * used when attempting to recover valid absolute URLs for annotations, and
    * outline items, that (incorrectly) only specify relative URLs.
    */
  var docBaseUrl: js.UndefOr[String] = js.undefined
  /**
    * Basic authentication headers.
    */
  var httpHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
  /*
    * A typed array with the first portion or
    * all of the pdf data. Used by the extension since some data is already
    * loaded before the switch to range requests.  */
  var initialData: js.UndefOr[Uint8Array | BufferSource] = js.undefined
  /**
    * Determines if we can eval
    * strings as JS. Primarily used to improve performance of font rendering,
    * and when parsing PDF functions. The default value is `true`.
    */
  var isEvalSupported: js.UndefOr[Boolean] = js.undefined
  /*
    * The PDF file length. It's used for progress
    * reports and range requests operations.
    */
  var length: js.UndefOr[Double] = js.undefined
  /**
    * The maximum allowed image size
    * in total pixels, i.e. width * height. Images above this value will not be
    * rendered. Use -1 for no limit, which is also the default value.
    */
  var maxImageSize: js.UndefOr[Double] = js.undefined
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
  var nativeImageDecoderSupport: js.UndefOr[decode | display | none] = js.undefined
  /**
    * For decrypting password-protected PDFs.
    */
  var password: js.UndefOr[String] = js.undefined
  /**
    * Enables special hooks for debugging
    * PDF.js (see `web/debugger.js`). The default value is `false`.
    */
  var pdfBug: js.UndefOr[Boolean] = js.undefined
  /** range */
  var range: js.UndefOr[PDFDataRangeTransport] = js.undefined
  /**
    * Optional parameter to specify
    * maximum number of bytes fetched per range request. The default value is
    * 2^16 = 65536. */
  var rangeChunkSize: js.UndefOr[Double] = js.undefined
  /**
    * Reject certain promises, e.g.
    * `getOperatorList`, `getTextContent`, and `RenderTask`, when the associated
    * PDF data cannot be successfully parsed, instead of attempting to recover
    * whatever possible of the data. The default value is `false`.
    */
  var stopAtErrors: js.UndefOr[Boolean] = js.undefined
  /** The URL of the PDF. */
  var url: js.UndefOr[String] = js.undefined
  /**
    * Controls the logging level; the
    * constants from {VerbosityLevel} should be used.
    */
  var verbosity: js.UndefOr[Double] = js.undefined
  /**
    * Indicates whether or not cross-site
    * Access-Control requests should be made using credentials such as cookies
    * or authorization headers. The default is false.
    */
  var withCredentials: js.UndefOr[Boolean] = js.undefined
  /**
    * The worker that will be used for
    * the loading and parsing of the PDF data.
    */
  var worker: js.UndefOr[PDFWorker] = js.undefined
}

object PDFSource {
  @scala.inline
  def apply(
    CMapReaderFactory: js.Any = null,
    cMapPacked: js.UndefOr[Boolean] = js.undefined,
    cMapUrl: String = null,
    data: Uint8Array | BufferSource | String = null,
    disableAutoFetch: js.UndefOr[Boolean] = js.undefined,
    disableCreateObjectURL: js.UndefOr[Boolean] = js.undefined,
    disableFontFace: js.UndefOr[Boolean] = js.undefined,
    disableRange: js.UndefOr[Boolean] = js.undefined,
    disableStream: js.UndefOr[Boolean] = js.undefined,
    docBaseUrl: String = null,
    httpHeaders: StringDictionary[String] = null,
    initialData: Uint8Array | BufferSource = null,
    isEvalSupported: js.UndefOr[Boolean] = js.undefined,
    length: Int | Double = null,
    maxImageSize: Int | Double = null,
    nativeImageDecoderSupport: decode | display | none = null,
    password: String = null,
    pdfBug: js.UndefOr[Boolean] = js.undefined,
    range: PDFDataRangeTransport = null,
    rangeChunkSize: Int | Double = null,
    stopAtErrors: js.UndefOr[Boolean] = js.undefined,
    url: String = null,
    verbosity: Int | Double = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined,
    worker: PDFWorker = null
  ): PDFSource = {
    val __obj = js.Dynamic.literal()
    if (CMapReaderFactory != null) __obj.updateDynamic("CMapReaderFactory")(CMapReaderFactory.asInstanceOf[js.Any])
    if (!js.isUndefined(cMapPacked)) __obj.updateDynamic("cMapPacked")(cMapPacked.asInstanceOf[js.Any])
    if (cMapUrl != null) __obj.updateDynamic("cMapUrl")(cMapUrl.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAutoFetch)) __obj.updateDynamic("disableAutoFetch")(disableAutoFetch.asInstanceOf[js.Any])
    if (!js.isUndefined(disableCreateObjectURL)) __obj.updateDynamic("disableCreateObjectURL")(disableCreateObjectURL.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFontFace)) __obj.updateDynamic("disableFontFace")(disableFontFace.asInstanceOf[js.Any])
    if (!js.isUndefined(disableRange)) __obj.updateDynamic("disableRange")(disableRange.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStream)) __obj.updateDynamic("disableStream")(disableStream.asInstanceOf[js.Any])
    if (docBaseUrl != null) __obj.updateDynamic("docBaseUrl")(docBaseUrl.asInstanceOf[js.Any])
    if (httpHeaders != null) __obj.updateDynamic("httpHeaders")(httpHeaders.asInstanceOf[js.Any])
    if (initialData != null) __obj.updateDynamic("initialData")(initialData.asInstanceOf[js.Any])
    if (!js.isUndefined(isEvalSupported)) __obj.updateDynamic("isEvalSupported")(isEvalSupported.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (maxImageSize != null) __obj.updateDynamic("maxImageSize")(maxImageSize.asInstanceOf[js.Any])
    if (nativeImageDecoderSupport != null) __obj.updateDynamic("nativeImageDecoderSupport")(nativeImageDecoderSupport.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(pdfBug)) __obj.updateDynamic("pdfBug")(pdfBug.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (rangeChunkSize != null) __obj.updateDynamic("rangeChunkSize")(rangeChunkSize.asInstanceOf[js.Any])
    if (!js.isUndefined(stopAtErrors)) __obj.updateDynamic("stopAtErrors")(stopAtErrors.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (verbosity != null) __obj.updateDynamic("verbosity")(verbosity.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    if (worker != null) __obj.updateDynamic("worker")(worker.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFSource]
  }
}

