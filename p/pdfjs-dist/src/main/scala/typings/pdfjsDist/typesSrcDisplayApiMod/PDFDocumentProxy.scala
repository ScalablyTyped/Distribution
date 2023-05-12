package typings.pdfjsDist.typesSrcDisplayApiMod

import org.scalablytyped.runtime.StringDictionary
import typings.pdfjsDist.anon.Bold
import typings.pdfjsDist.anon.Info
import typings.pdfjsDist.anon.Length
import typings.pdfjsDist.anon.Marked
import typings.pdfjsDist.typesSrcDisplayAnnotationStorageMod.AnnotationStorage
import typings.pdfjsDist.typesSrcDisplayOptionalContentConfigMod.OptionalContentConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pdfjs-dist/types/src/display/api", "PDFDocumentProxy")
@js.native
open class PDFDocumentProxy protected () extends StObject {
  def this(pdfInfo: Any, transport: Any) = this()
  
  var _pdfInfo: Any = js.native
  
  var _transport: Any = js.native
  
  /**
    * NOTE: This is (mostly) intended to support printing of XFA forms.
    *
    * @type {Object | null} An object representing a HTML tree structure
    *   to render the XFA, or `null` when no XFA form exists.
    */
  def allXfaHtml: js.Object | Null = js.native
  
  /**
    * @type {AnnotationStorage} Storage for annotation data in forms.
    */
  def annotationStorage: AnnotationStorage = js.native
  
  /**
    * Cleans up resources allocated by the document on both the main and worker
    * threads.
    *
    * NOTE: Do not, under any circumstances, call this method when rendering is
    * currently ongoing since that may lead to rendering errors.
    *
    * @param {boolean} [keepLoadedFonts] - Let fonts remain attached to the DOM.
    *   NOTE: This will increase persistent memory usage, hence don't use this
    *   option unless absolutely necessary. The default value is `false`.
    * @returns {Promise} A promise that is resolved when clean-up has finished.
    */
  def cleanup(): js.Promise[Any] = js.native
  def cleanup(keepLoadedFonts: Boolean): js.Promise[Any] = js.native
  
  /**
    * Destroys the current document instance and terminates the worker.
    */
  def destroy(): js.Promise[Unit] = js.native
  
  /**
    * @type {Object} The filter factory instance.
    */
  def filterFactory: js.Object = js.native
  
  /**
    * @type {Array<string, string|null>} A (not guaranteed to be) unique ID to
    *   identify the PDF document.
    *   NOTE: The first element will always be defined for all PDF documents,
    *   whereas the second element is only defined for *modified* PDF documents.
    */
  def fingerprints: js.Array[String] = js.native
  
  /**
    * @returns {Promise<any>} A promise that is resolved with a lookup table
    *   for mapping named attachments to their content.
    */
  def getAttachments(): js.Promise[Any] = js.native
  
  /**
    * @returns {Promise<Array<string> | null>} A promise that is resolved with an
    *   {Array<string>} containing IDs of annotations that have a calculation
    *   action, or `null` when no such annotations are present in the PDF file.
    */
  def getCalculationOrderIds(): js.Promise[js.Array[String] | Null] = js.native
  
  /**
    * @returns {Promise<Uint8Array>} A promise that is resolved with a
    *   {Uint8Array} containing the raw data of the PDF document.
    */
  def getData(): js.Promise[js.typedarray.Uint8Array] = js.native
  
  /**
    * @param {string} id - The named destination to get.
    * @returns {Promise<Array<any> | null>} A promise that is resolved with all
    *   information of the given named destination, or `null` when the named
    *   destination is not present in the PDF file.
    */
  def getDestination(id: String): js.Promise[js.Array[Any] | Null] = js.native
  
  /**
    * @returns {Promise<Object<string, Array<any>>>} A promise that is resolved
    *   with a mapping from named destinations to references.
    *
    * This can be slow for large documents. Use `getDestination` instead.
    */
  def getDestinations(): js.Promise[StringDictionary[js.Array[Any]]] = js.native
  
  /**
    * @returns {Promise<{ length: number }>} A promise that is resolved when the
    *   document's data is loaded. It is resolved with an {Object} that contains
    *   the `length` property that indicates size of the PDF data in bytes.
    */
  def getDownloadInfo(): js.Promise[Length] = js.native
  
  /**
    * @returns {Promise<Object<string, Array<Object>> | null>} A promise that is
    *   resolved with an {Object} containing /AcroForm field data for the JS
    *   sandbox, or `null` when no field data is present in the PDF file.
    */
  def getFieldObjects(): js.Promise[StringDictionary[js.Array[js.Object]] | Null] = js.native
  
  /**
    * @returns {Promise<Object | null>} A promise that is resolved with
    *   an {Object} with the JavaScript actions:
    *     - from the name tree (like getJavaScript);
    *     - from A or AA entries in the catalog dictionary.
    *   , or `null` if no JavaScript exists.
    */
  def getJSActions(): js.Promise[js.Object | Null] = js.native
  
  /**
    * @returns {Promise<Array<string> | null>} A promise that is resolved with
    *   an {Array} of all the JavaScript strings in the name tree, or `null`
    *   if no JavaScript exists.
    */
  def getJavaScript(): js.Promise[js.Array[String] | Null] = js.native
  
  /**
    * @typedef {Object} MarkInfo
    * Properties correspond to Table 321 of the PDF 32000-1:2008 spec.
    * @property {boolean} Marked
    * @property {boolean} UserProperties
    * @property {boolean} Suspects
    */
  /**
    * @returns {Promise<MarkInfo | null>} A promise that is resolved with
    *   a {MarkInfo} object that contains the MarkInfo flags for the PDF
    *   document, or `null` when no MarkInfo values are present in the PDF file.
    */
  def getMarkInfo(): js.Promise[Marked | Null] = js.native
  
  /**
    * @returns {Promise<{ info: Object, metadata: Metadata }>} A promise that is
    *   resolved with an {Object} that has `info` and `metadata` properties.
    *   `info` is an {Object} filled with anything available in the information
    *   dictionary and similarly `metadata` is a {Metadata} object with
    *   information from the metadata section of the PDF.
    */
  def getMetadata(): js.Promise[Info] = js.native
  
  /**
    * @returns {Promise<any | null>} A promise that is resolved with an {Array}
    *   containing the destination, or `null` when no open action is present
    *   in the PDF.
    */
  def getOpenAction(): js.Promise[Any | Null] = js.native
  
  /**
    * @returns {Promise<OptionalContentConfig>} A promise that is resolved with
    *   an {@link OptionalContentConfig} that contains all the optional content
    *   groups (assuming that the document has any).
    */
  def getOptionalContentConfig(): js.Promise[OptionalContentConfig] = js.native
  
  /**
    * @typedef {Object} OutlineNode
    * @property {string} title
    * @property {boolean} bold
    * @property {boolean} italic
    * @property {Uint8ClampedArray} color - The color in RGB format to use for
    *   display purposes.
    * @property {string | Array<any> | null} dest
    * @property {string | null} url
    * @property {string | undefined} unsafeUrl
    * @property {boolean | undefined} newWindow
    * @property {number | undefined} count
    * @property {Array<OutlineNode>} items
    */
  /**
    * @returns {Promise<Array<OutlineNode>>} A promise that is resolved with an
    *   {Array} that is a tree outline (if it has one) of the PDF file.
    */
  def getOutline(): js.Promise[js.Array[Bold]] = js.native
  
  /**
    * @param {number} pageNumber - The page number to get. The first page is 1.
    * @returns {Promise<PDFPageProxy>} A promise that is resolved with
    *   a {@link PDFPageProxy} object.
    */
  def getPage(pageNumber: Double): js.Promise[PDFPageProxy] = js.native
  
  /**
    * @param {RefProxy} ref - The page reference.
    * @returns {Promise<number>} A promise that is resolved with the page index,
    *   starting from zero, that is associated with the reference.
    */
  def getPageIndex(ref: RefProxy): js.Promise[Double] = js.native
  
  /**
    * @returns {Promise<Array<string> | null>} A promise that is resolved with
    *   an {Array} containing the page labels that correspond to the page
    *   indexes, or `null` when no page labels are present in the PDF file.
    */
  def getPageLabels(): js.Promise[js.Array[String] | Null] = js.native
  
  /**
    * @returns {Promise<string>} A promise that is resolved with a {string}
    *   containing the page layout name.
    */
  def getPageLayout(): js.Promise[String] = js.native
  
  /**
    * @returns {Promise<string>} A promise that is resolved with a {string}
    *   containing the page mode name.
    */
  def getPageMode(): js.Promise[String] = js.native
  
  /**
    * @returns {Promise<Array<number> | null>} A promise that is resolved with
    *   an {Array} that contains the permission flags for the PDF document, or
    *   `null` when no permissions are present in the PDF file.
    */
  def getPermissions(): js.Promise[js.Array[Double] | Null] = js.native
  
  /**
    * @returns {Promise<Object | null>} A promise that is resolved with an
    *   {Object} containing the viewer preferences, or `null` when no viewer
    *   preferences are present in the PDF file.
    */
  def getViewerPreferences(): js.Promise[js.Object | Null] = js.native
  
  /**
    * @returns {Promise<boolean>} A promise that is resolved with `true`
    *   if some /AcroForm fields have JavaScript actions.
    */
  def hasJSActions(): js.Promise[Boolean] = js.native
  
  /**
    * @type {boolean} True if only XFA form.
    */
  def isPureXfa: Boolean = js.native
  
  /**
    * @type {DocumentInitParameters} A subset of the current
    *   {DocumentInitParameters}, which are needed in the viewer.
    */
  def loadingParams: DocumentInitParameters = js.native
  
  /**
    * @type {PDFDocumentLoadingTask} The loadingTask for the current document.
    */
  def loadingTask: PDFDocumentLoadingTask = js.native
  
  /**
    * @type {number} Total number of pages in the PDF file.
    */
  def numPages: Double = js.native
  
  /**
    * @returns {Promise<Uint8Array>} A promise that is resolved with a
    *   {Uint8Array} containing the full data of the saved document.
    */
  def saveDocument(): js.Promise[js.typedarray.Uint8Array] = js.native
}
