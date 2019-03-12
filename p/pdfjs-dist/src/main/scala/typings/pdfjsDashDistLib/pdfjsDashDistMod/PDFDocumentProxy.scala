package typings
package pdfjsDashDistLib.pdfjsDashDistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFDocumentProxy extends js.Object {
  /**
    * A unique ID to identify a PDF.  Not guaranteed to be unique.  [jbaldwin: haha what]
    **/
  var fingerprint: java.lang.String
  /**
    * Total number of pages the PDF contains.
    **/
  var numPages: scala.Double
  /**
    * TODO: return type of Promise<???>
    * A promise that is resolved when the document's data is loaded.
    **/
  def dataLoaded(): PDFPromise[js.Array[_]]
  /**
    *
    **/
  def destroy(): scala.Unit
  /**
    * True if embedded document fonts are in use.  Will be set during rendering of the pages.
    **/
  def embeddedFontsUsed(): scala.Boolean
  /**
    * A promise that is resolved with Uint8Array that has the raw PDF data.
    **/
  def getData(): PDFPromise[stdLib.Uint8Array]
  /**
    * TODO: return type of Promise<???>
    *  A promise that is resolved with a lookup table for mapping named destinations to reference numbers.
    **/
  def getDestinations(): PDFPromise[js.Array[_]]
  /**
    *  A promise that is resolved with an array of all the JavaScript strings in the name tree.
    **/
  def getJavaScript(): PDFPromise[js.Array[java.lang.String]]
  /**
    * A promise that is resolved with the info and metadata of the PDF.
    **/
  def getMetadata(): PDFPromise[pdfjsDashDistLib.Anon_Info]
  /**
    *  A promise that is resolved with an array that is a tree outline (if it has one) of the PDF.  @see PDFTreeNode
    **/
  def getOutline(): PDFPromise[js.Array[PDFTreeNode]]
  /**
    * @param number The page number to get.  The first page is 1.
    * @return A promise that is resolved with a PDFPageProxy.
    **/
  def getPage(number: scala.Double): PDFPromise[PDFPageProxy]
  /**
    * Is the PDF encrypted?
    **/
  def isEncrypted(): PDFPromise[scala.Boolean]
}

object PDFDocumentProxy {
  @scala.inline
  def apply(
    dataLoaded: () => PDFPromise[js.Array[_]],
    destroy: () => scala.Unit,
    embeddedFontsUsed: () => scala.Boolean,
    fingerprint: java.lang.String,
    getData: () => PDFPromise[stdLib.Uint8Array],
    getDestinations: () => PDFPromise[js.Array[_]],
    getJavaScript: () => PDFPromise[js.Array[java.lang.String]],
    getMetadata: () => PDFPromise[pdfjsDashDistLib.Anon_Info],
    getOutline: () => PDFPromise[js.Array[PDFTreeNode]],
    getPage: scala.Double => PDFPromise[PDFPageProxy],
    isEncrypted: () => PDFPromise[scala.Boolean],
    numPages: scala.Double
  ): PDFDocumentProxy = {
    val __obj = js.Dynamic.literal(dataLoaded = js.Any.fromFunction0(dataLoaded), destroy = js.Any.fromFunction0(destroy), embeddedFontsUsed = js.Any.fromFunction0(embeddedFontsUsed), fingerprint = fingerprint, getData = js.Any.fromFunction0(getData), getDestinations = js.Any.fromFunction0(getDestinations), getJavaScript = js.Any.fromFunction0(getJavaScript), getMetadata = js.Any.fromFunction0(getMetadata), getOutline = js.Any.fromFunction0(getOutline), getPage = js.Any.fromFunction1(getPage), isEncrypted = js.Any.fromFunction0(isEncrypted), numPages = numPages)
  
    __obj.asInstanceOf[PDFDocumentProxy]
  }
}

