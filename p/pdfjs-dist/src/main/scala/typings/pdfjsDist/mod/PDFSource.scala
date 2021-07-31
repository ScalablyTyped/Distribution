package typings.pdfjsDist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.pdfjsDist.pdfjsDistStrings.decode
import typings.pdfjsDist.pdfjsDistStrings.display
import typings.pdfjsDist.pdfjsDistStrings.none
import typings.std.BufferSource
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PDFSource extends StObject {
  
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
  def apply(): PDFSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFSource]
  }
  
  @scala.inline
  implicit class PDFSourceMutableBuilder[Self <: PDFSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCMapPacked(value: Boolean): Self = StObject.set(x, "cMapPacked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCMapPackedUndefined: Self = StObject.set(x, "cMapPacked", js.undefined)
    
    @scala.inline
    def setCMapReaderFactory(value: js.Any): Self = StObject.set(x, "CMapReaderFactory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCMapReaderFactoryUndefined: Self = StObject.set(x, "CMapReaderFactory", js.undefined)
    
    @scala.inline
    def setCMapUrl(value: String): Self = StObject.set(x, "cMapUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCMapUrlUndefined: Self = StObject.set(x, "cMapUrl", js.undefined)
    
    @scala.inline
    def setData(value: Uint8Array | BufferSource | String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDisableAutoFetch(value: Boolean): Self = StObject.set(x, "disableAutoFetch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableAutoFetchUndefined: Self = StObject.set(x, "disableAutoFetch", js.undefined)
    
    @scala.inline
    def setDisableCreateObjectURL(value: Boolean): Self = StObject.set(x, "disableCreateObjectURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableCreateObjectURLUndefined: Self = StObject.set(x, "disableCreateObjectURL", js.undefined)
    
    @scala.inline
    def setDisableFontFace(value: Boolean): Self = StObject.set(x, "disableFontFace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableFontFaceUndefined: Self = StObject.set(x, "disableFontFace", js.undefined)
    
    @scala.inline
    def setDisableRange(value: Boolean): Self = StObject.set(x, "disableRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableRangeUndefined: Self = StObject.set(x, "disableRange", js.undefined)
    
    @scala.inline
    def setDisableStream(value: Boolean): Self = StObject.set(x, "disableStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableStreamUndefined: Self = StObject.set(x, "disableStream", js.undefined)
    
    @scala.inline
    def setDocBaseUrl(value: String): Self = StObject.set(x, "docBaseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocBaseUrlUndefined: Self = StObject.set(x, "docBaseUrl", js.undefined)
    
    @scala.inline
    def setHttpHeaders(value: StringDictionary[String]): Self = StObject.set(x, "httpHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpHeadersUndefined: Self = StObject.set(x, "httpHeaders", js.undefined)
    
    @scala.inline
    def setInitialData(value: Uint8Array | BufferSource): Self = StObject.set(x, "initialData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialDataUndefined: Self = StObject.set(x, "initialData", js.undefined)
    
    @scala.inline
    def setIsEvalSupported(value: Boolean): Self = StObject.set(x, "isEvalSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEvalSupportedUndefined: Self = StObject.set(x, "isEvalSupported", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setMaxImageSize(value: Double): Self = StObject.set(x, "maxImageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxImageSizeUndefined: Self = StObject.set(x, "maxImageSize", js.undefined)
    
    @scala.inline
    def setNativeImageDecoderSupport(value: decode | display | none): Self = StObject.set(x, "nativeImageDecoderSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeImageDecoderSupportUndefined: Self = StObject.set(x, "nativeImageDecoderSupport", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setPdfBug(value: Boolean): Self = StObject.set(x, "pdfBug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPdfBugUndefined: Self = StObject.set(x, "pdfBug", js.undefined)
    
    @scala.inline
    def setRange(value: PDFDataRangeTransport): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeChunkSize(value: Double): Self = StObject.set(x, "rangeChunkSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeChunkSizeUndefined: Self = StObject.set(x, "rangeChunkSize", js.undefined)
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setStopAtErrors(value: Boolean): Self = StObject.set(x, "stopAtErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopAtErrorsUndefined: Self = StObject.set(x, "stopAtErrors", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setVerbosity(value: Double): Self = StObject.set(x, "verbosity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerbosityUndefined: Self = StObject.set(x, "verbosity", js.undefined)
    
    @scala.inline
    def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    
    @scala.inline
    def setWorker(value: PDFWorker): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerUndefined: Self = StObject.set(x, "worker", js.undefined)
  }
}
