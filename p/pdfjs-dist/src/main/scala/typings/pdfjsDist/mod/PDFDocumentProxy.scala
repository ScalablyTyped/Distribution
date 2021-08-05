package typings.pdfjsDist.mod

import typings.pdfjsDist.anon.Info
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PDFDocumentProxy extends StObject {
  
  /**
    * TODO: return type of Promise<???>
    * A promise that is resolved when the document's data is loaded.
    **/
  def dataLoaded(): PDFPromise[js.Array[js.Any]]
  
  /**
    *
    **/
  def destroy(): Unit
  
  /**
    * True if embedded document fonts are in use.  Will be set during rendering of the pages.
    **/
  def embeddedFontsUsed(): Boolean
  
  /**
    * A unique ID to identify a PDF.  Not guaranteed to be unique.  [jbaldwin: haha what]
    **/
  var fingerprint: String
  
  /**
    * A promise that is resolved with Uint8Array that has the raw PDF data.
    **/
  def getData(): PDFPromise[Uint8Array]
  
  /**
    * TODO: return type of Promise<???>
    *  A promise that is resolved with a lookup table for mapping named destinations to reference numbers.
    **/
  def getDestinations(): PDFPromise[js.Array[js.Any]]
  
  /**
    *  A promise that is resolved with an array of all the JavaScript strings in the name tree.
    **/
  def getJavaScript(): PDFPromise[js.Array[String]]
  
  /**
    * A promise that is resolved with the info and metadata of the PDF.
    **/
  def getMetadata(): PDFPromise[Info]
  
  /**
    *  A promise that is resolved with an array that is a tree outline (if it has one) of the PDF.  @see PDFTreeNode
    **/
  def getOutline(): PDFPromise[js.Array[PDFTreeNode]]
  
  /**
    * @param number The page number to get.  The first page is 1.
    * @return A promise that is resolved with a PDFPageProxy.
    **/
  def getPage(number: Double): PDFPromise[PDFPageProxy]
  
  /**
    * Is the PDF encrypted?
    **/
  def isEncrypted(): PDFPromise[Boolean]
  
  /**
    * Total number of pages the PDF contains.
    **/
  var numPages: Double
}
object PDFDocumentProxy {
  
  inline def apply(
    dataLoaded: () => PDFPromise[js.Array[js.Any]],
    destroy: () => Unit,
    embeddedFontsUsed: () => Boolean,
    fingerprint: String,
    getData: () => PDFPromise[Uint8Array],
    getDestinations: () => PDFPromise[js.Array[js.Any]],
    getJavaScript: () => PDFPromise[js.Array[String]],
    getMetadata: () => PDFPromise[Info],
    getOutline: () => PDFPromise[js.Array[PDFTreeNode]],
    getPage: Double => PDFPromise[PDFPageProxy],
    isEncrypted: () => PDFPromise[Boolean],
    numPages: Double
  ): PDFDocumentProxy = {
    val __obj = js.Dynamic.literal(dataLoaded = js.Any.fromFunction0(dataLoaded), destroy = js.Any.fromFunction0(destroy), embeddedFontsUsed = js.Any.fromFunction0(embeddedFontsUsed), fingerprint = fingerprint.asInstanceOf[js.Any], getData = js.Any.fromFunction0(getData), getDestinations = js.Any.fromFunction0(getDestinations), getJavaScript = js.Any.fromFunction0(getJavaScript), getMetadata = js.Any.fromFunction0(getMetadata), getOutline = js.Any.fromFunction0(getOutline), getPage = js.Any.fromFunction1(getPage), isEncrypted = js.Any.fromFunction0(isEncrypted), numPages = numPages.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFDocumentProxy]
  }
  
  extension [Self <: PDFDocumentProxy](x: Self) {
    
    inline def setDataLoaded(value: () => PDFPromise[js.Array[js.Any]]): Self = StObject.set(x, "dataLoaded", js.Any.fromFunction0(value))
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setEmbeddedFontsUsed(value: () => Boolean): Self = StObject.set(x, "embeddedFontsUsed", js.Any.fromFunction0(value))
    
    inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setGetData(value: () => PDFPromise[Uint8Array]): Self = StObject.set(x, "getData", js.Any.fromFunction0(value))
    
    inline def setGetDestinations(value: () => PDFPromise[js.Array[js.Any]]): Self = StObject.set(x, "getDestinations", js.Any.fromFunction0(value))
    
    inline def setGetJavaScript(value: () => PDFPromise[js.Array[String]]): Self = StObject.set(x, "getJavaScript", js.Any.fromFunction0(value))
    
    inline def setGetMetadata(value: () => PDFPromise[Info]): Self = StObject.set(x, "getMetadata", js.Any.fromFunction0(value))
    
    inline def setGetOutline(value: () => PDFPromise[js.Array[PDFTreeNode]]): Self = StObject.set(x, "getOutline", js.Any.fromFunction0(value))
    
    inline def setGetPage(value: Double => PDFPromise[PDFPageProxy]): Self = StObject.set(x, "getPage", js.Any.fromFunction1(value))
    
    inline def setIsEncrypted(value: () => PDFPromise[Boolean]): Self = StObject.set(x, "isEncrypted", js.Any.fromFunction0(value))
    
    inline def setNumPages(value: Double): Self = StObject.set(x, "numPages", value.asInstanceOf[js.Any])
  }
}
