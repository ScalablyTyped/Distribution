package typings.pdfjsDist.typesSrcDisplayApiMod

import typings.std.HTMLDocument
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentInitParameters
  extends StObject
     with _GetDocumentParameters {
  
  /**
    * - The factory that will be used when
    * reading built-in CMap files. Providing a custom factory is useful for
    * environments without Fetch API or `XMLHttpRequest` support, such as
    * Node.js. The default value is {DOMCMapReaderFactory}.
    */
  var CMapReaderFactory: js.UndefOr[js.Object] = js.undefined
  
  /**
    * - The factory that will be used
    * when reading the standard font files. Providing a custom factory is useful
    * for environments without Fetch API or `XMLHttpRequest` support, such as
    * Node.js. The default value is {DOMStandardFontDataFactory}.
    */
  var StandardFontDataFactory: js.UndefOr[js.Object] = js.undefined
  
  /**
    * - Specifies if the Adobe CMaps are binary
    * packed or not.
    */
  var cMapPacked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * - The URL where the predefined Adobe CMaps are
    * located. Include the trailing slash.
    */
  var cMapUrl: js.UndefOr[String] = js.undefined
  
  /**
    * - Binary PDF data.
    * Use typed arrays (Uint8Array) to improve the memory usage. If PDF data is
    * BASE64-encoded, use `atob()` to convert it to a binary string first.
    */
  var data: js.UndefOr[BinaryData] = js.undefined
  
  /**
    * - Disable pre-fetching of PDF file
    * data. When range requests are enabled PDF.js will automatically keep
    * fetching more data even if it isn't needed to display the current page.
    * The default value is `false`.
    *
    * NOTE: It is also necessary to disable streaming, see above, in order for
    * disabling of pre-fetching to work correctly.
    */
  var disableAutoFetch: js.UndefOr[Boolean] = js.undefined
  
  /**
    * - By default fonts are converted to
    * OpenType fonts and loaded via the Font Loading API or `@font-face` rules.
    * If disabled, fonts will be rendered using a built-in font renderer that
    * constructs the glyphs with primitive path commands.
    * The default value is `false` in web environments and `true` in Node.js.
    */
  var disableFontFace: js.UndefOr[Boolean] = js.undefined
  
  /**
    * - Disable range request loading of PDF
    * files. When enabled, and if the server supports partial content requests,
    * then the PDF will be fetched in chunks. The default value is `false`.
    */
  var disableRange: js.UndefOr[Boolean] = js.undefined
  
  /**
    * - Disable streaming of PDF file data.
    * By default PDF.js attempts to load PDF files in chunks. The default value
    * is `false`.
    */
  var disableStream: js.UndefOr[Boolean] = js.undefined
  
  /**
    * - The base URL of the document, used when
    * attempting to recover valid absolute URLs for annotations, and outline
    * items, that (incorrectly) only specify relative URLs.
    */
  var docBaseUrl: js.UndefOr[String] = js.undefined
  
  /**
    * - Render Xfa forms if any.
    * The default value is `false`.
    */
  var enableXfa: js.UndefOr[Boolean] = js.undefined
  
  /**
    * - Include additional properties,
    * which are unused during rendering of PDF documents, when exporting the
    * parsed font data from the worker-thread. This may be useful for debugging
    * purposes (and backwards compatibility), but note that it will lead to
    * increased memory usage. The default value is `false`.
    */
  var fontExtraProperties: js.UndefOr[Boolean] = js.undefined
  
  /**
    * - Basic authentication headers.
    */
  var httpHeaders: js.UndefOr[js.Object] = js.undefined
  
  /**
    * - A typed array with the first portion
    * or all of the pdf data. Used by the extension since some data is already
    * loaded before the switch to range requests.
    */
  var initialData: js.UndefOr[TypedArray] = js.undefined
  
  /**
    * - Determines if we can evaluate strings
    * as JavaScript. Primarily used to improve performance of font rendering, and
    * when parsing PDF functions. The default value is `true`.
    */
  var isEvalSupported: js.UndefOr[Boolean] = js.undefined
  
  /**
    * - Determines if we can use
    * `OffscreenCanvas` in the worker. Primarily used to improve performance of
    * image conversion/rendering.
    * The default value is `true` in web environments and `false` in Node.js.
    */
  var isOffscreenCanvasSupported: js.UndefOr[Boolean] = js.undefined
  
  /**
    * - The PDF file length. It's used for progress
    * reports and range requests operations.
    */
  var length: js.UndefOr[Double] = js.undefined
  
  /**
    * - The maximum allowed image size in total
    * pixels, i.e. width * height. Images above this value will not be rendered.
    * Use -1 for no limit, which is also the default value.
    */
  var maxImageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * - Specify an explicit document
    * context to create elements with and to load resources, such as fonts,
    * into. Defaults to the current document.
    */
  var ownerDocument: js.UndefOr[HTMLDocument] = js.undefined
  
  /**
    * - For decrypting password-protected PDFs.
    */
  var password: js.UndefOr[String] = js.undefined
  
  /**
    * - Enables special hooks for debugging PDF.js
    * (see `web/debugger.js`). The default value is `false`.
    */
  var pdfBug: js.UndefOr[Boolean] = js.undefined
  
  /**
    * - Allows for using a custom range
    * transport implementation.
    */
  var range: js.UndefOr[PDFDataRangeTransport] = js.undefined
  
  /**
    * - Specify maximum number of bytes fetched
    * per range request. The default value is {@link DEFAULT_RANGE_CHUNK_SIZE }.
    */
  var rangeChunkSize: js.UndefOr[Double] = js.undefined
  
  /**
    * - The URL where the standard font
    * files are located. Include the trailing slash.
    */
  var standardFontDataUrl: js.UndefOr[String] = js.undefined
  
  /**
    * - Reject certain promises, e.g.
    * `getOperatorList`, `getTextContent`, and `RenderTask`, when the associated
    * PDF data cannot be successfully parsed, instead of attempting to recover
    * whatever possible of the data. The default value is `false`.
    */
  var stopAtErrors: js.UndefOr[Boolean] = js.undefined
  
  /**
    * - The URL of the PDF.
    */
  var url: js.UndefOr[String | URL] = js.undefined
  
  /**
    * - When `true`, fonts that aren't
    * embedded in the PDF document will fallback to a system font.
    * The default value is `true` in web environments and `false` in Node.js;
    * unless `disableFontFace === true` in which case this defaults to `false`
    * regardless of the environment (to prevent completely broken fonts).
    */
  var useSystemFonts: js.UndefOr[Boolean] = js.undefined
  
  /**
    * - Enable using the Fetch API in the
    * worker-thread when reading CMap and standard font files. When `true`,
    * the `CMapReaderFactory` and `StandardFontDataFactory` options are ignored.
    * The default value is `true` in web environments and `false` in Node.js.
    */
  var useWorkerFetch: js.UndefOr[Boolean] = js.undefined
  
  /**
    * - Controls the logging level; the constants
    * from {@link VerbosityLevel } should be used.
    */
  var verbosity: js.UndefOr[Double] = js.undefined
  
  /**
    * - Indicates whether or not
    * cross-site Access-Control requests should be made using credentials such
    * as cookies or authorization headers. The default is `false`.
    */
  var withCredentials: js.UndefOr[Boolean] = js.undefined
  
  /**
    * - The worker that will be used for loading and
    * parsing the PDF data.
    */
  var worker: js.UndefOr[PDFWorker] = js.undefined
}
object DocumentInitParameters {
  
  inline def apply(): DocumentInitParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentInitParameters]
  }
  
  extension [Self <: DocumentInitParameters](x: Self) {
    
    inline def setCMapPacked(value: Boolean): Self = StObject.set(x, "cMapPacked", value.asInstanceOf[js.Any])
    
    inline def setCMapPackedUndefined: Self = StObject.set(x, "cMapPacked", js.undefined)
    
    inline def setCMapReaderFactory(value: js.Object): Self = StObject.set(x, "CMapReaderFactory", value.asInstanceOf[js.Any])
    
    inline def setCMapReaderFactoryUndefined: Self = StObject.set(x, "CMapReaderFactory", js.undefined)
    
    inline def setCMapUrl(value: String): Self = StObject.set(x, "cMapUrl", value.asInstanceOf[js.Any])
    
    inline def setCMapUrlUndefined: Self = StObject.set(x, "cMapUrl", js.undefined)
    
    inline def setData(value: BinaryData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: Double*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setDisableAutoFetch(value: Boolean): Self = StObject.set(x, "disableAutoFetch", value.asInstanceOf[js.Any])
    
    inline def setDisableAutoFetchUndefined: Self = StObject.set(x, "disableAutoFetch", js.undefined)
    
    inline def setDisableFontFace(value: Boolean): Self = StObject.set(x, "disableFontFace", value.asInstanceOf[js.Any])
    
    inline def setDisableFontFaceUndefined: Self = StObject.set(x, "disableFontFace", js.undefined)
    
    inline def setDisableRange(value: Boolean): Self = StObject.set(x, "disableRange", value.asInstanceOf[js.Any])
    
    inline def setDisableRangeUndefined: Self = StObject.set(x, "disableRange", js.undefined)
    
    inline def setDisableStream(value: Boolean): Self = StObject.set(x, "disableStream", value.asInstanceOf[js.Any])
    
    inline def setDisableStreamUndefined: Self = StObject.set(x, "disableStream", js.undefined)
    
    inline def setDocBaseUrl(value: String): Self = StObject.set(x, "docBaseUrl", value.asInstanceOf[js.Any])
    
    inline def setDocBaseUrlUndefined: Self = StObject.set(x, "docBaseUrl", js.undefined)
    
    inline def setEnableXfa(value: Boolean): Self = StObject.set(x, "enableXfa", value.asInstanceOf[js.Any])
    
    inline def setEnableXfaUndefined: Self = StObject.set(x, "enableXfa", js.undefined)
    
    inline def setFontExtraProperties(value: Boolean): Self = StObject.set(x, "fontExtraProperties", value.asInstanceOf[js.Any])
    
    inline def setFontExtraPropertiesUndefined: Self = StObject.set(x, "fontExtraProperties", js.undefined)
    
    inline def setHttpHeaders(value: js.Object): Self = StObject.set(x, "httpHeaders", value.asInstanceOf[js.Any])
    
    inline def setHttpHeadersUndefined: Self = StObject.set(x, "httpHeaders", js.undefined)
    
    inline def setInitialData(value: TypedArray): Self = StObject.set(x, "initialData", value.asInstanceOf[js.Any])
    
    inline def setInitialDataUndefined: Self = StObject.set(x, "initialData", js.undefined)
    
    inline def setIsEvalSupported(value: Boolean): Self = StObject.set(x, "isEvalSupported", value.asInstanceOf[js.Any])
    
    inline def setIsEvalSupportedUndefined: Self = StObject.set(x, "isEvalSupported", js.undefined)
    
    inline def setIsOffscreenCanvasSupported(value: Boolean): Self = StObject.set(x, "isOffscreenCanvasSupported", value.asInstanceOf[js.Any])
    
    inline def setIsOffscreenCanvasSupportedUndefined: Self = StObject.set(x, "isOffscreenCanvasSupported", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setMaxImageSize(value: Double): Self = StObject.set(x, "maxImageSize", value.asInstanceOf[js.Any])
    
    inline def setMaxImageSizeUndefined: Self = StObject.set(x, "maxImageSize", js.undefined)
    
    inline def setOwnerDocument(value: HTMLDocument): Self = StObject.set(x, "ownerDocument", value.asInstanceOf[js.Any])
    
    inline def setOwnerDocumentUndefined: Self = StObject.set(x, "ownerDocument", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setPdfBug(value: Boolean): Self = StObject.set(x, "pdfBug", value.asInstanceOf[js.Any])
    
    inline def setPdfBugUndefined: Self = StObject.set(x, "pdfBug", js.undefined)
    
    inline def setRange(value: PDFDataRangeTransport): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeChunkSize(value: Double): Self = StObject.set(x, "rangeChunkSize", value.asInstanceOf[js.Any])
    
    inline def setRangeChunkSizeUndefined: Self = StObject.set(x, "rangeChunkSize", js.undefined)
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setStandardFontDataFactory(value: js.Object): Self = StObject.set(x, "StandardFontDataFactory", value.asInstanceOf[js.Any])
    
    inline def setStandardFontDataFactoryUndefined: Self = StObject.set(x, "StandardFontDataFactory", js.undefined)
    
    inline def setStandardFontDataUrl(value: String): Self = StObject.set(x, "standardFontDataUrl", value.asInstanceOf[js.Any])
    
    inline def setStandardFontDataUrlUndefined: Self = StObject.set(x, "standardFontDataUrl", js.undefined)
    
    inline def setStopAtErrors(value: Boolean): Self = StObject.set(x, "stopAtErrors", value.asInstanceOf[js.Any])
    
    inline def setStopAtErrorsUndefined: Self = StObject.set(x, "stopAtErrors", js.undefined)
    
    inline def setUrl(value: String | URL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUseSystemFonts(value: Boolean): Self = StObject.set(x, "useSystemFonts", value.asInstanceOf[js.Any])
    
    inline def setUseSystemFontsUndefined: Self = StObject.set(x, "useSystemFonts", js.undefined)
    
    inline def setUseWorkerFetch(value: Boolean): Self = StObject.set(x, "useWorkerFetch", value.asInstanceOf[js.Any])
    
    inline def setUseWorkerFetchUndefined: Self = StObject.set(x, "useWorkerFetch", js.undefined)
    
    inline def setVerbosity(value: Double): Self = StObject.set(x, "verbosity", value.asInstanceOf[js.Any])
    
    inline def setVerbosityUndefined: Self = StObject.set(x, "verbosity", js.undefined)
    
    inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    
    inline def setWorker(value: PDFWorker): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
    
    inline def setWorkerUndefined: Self = StObject.set(x, "worker", js.undefined)
  }
}
