package typings.pdfjsDist.mod

import typings.pdfjsDist.anon.Info
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFDocumentProxy extends js.Object {
  
  /**
    * TODO: return type of Promise<???>
    * A promise that is resolved when the document's data is loaded.
    **/
  def dataLoaded(): PDFPromise[js.Array[_]] = js.native
  
  /**
    *
    **/
  def destroy(): Unit = js.native
  
  /**
    * True if embedded document fonts are in use.  Will be set during rendering of the pages.
    **/
  def embeddedFontsUsed(): Boolean = js.native
  
  /**
    * A unique ID to identify a PDF.  Not guaranteed to be unique.  [jbaldwin: haha what]
    **/
  var fingerprint: String = js.native
  
  /**
    * A promise that is resolved with Uint8Array that has the raw PDF data.
    **/
  def getData(): PDFPromise[Uint8Array] = js.native
  
  /**
    * TODO: return type of Promise<???>
    *  A promise that is resolved with a lookup table for mapping named destinations to reference numbers.
    **/
  def getDestinations(): PDFPromise[js.Array[_]] = js.native
  
  /**
    *  A promise that is resolved with an array of all the JavaScript strings in the name tree.
    **/
  def getJavaScript(): PDFPromise[js.Array[String]] = js.native
  
  /**
    * A promise that is resolved with the info and metadata of the PDF.
    **/
  def getMetadata(): PDFPromise[Info] = js.native
  
  /**
    *  A promise that is resolved with an array that is a tree outline (if it has one) of the PDF.  @see PDFTreeNode
    **/
  def getOutline(): PDFPromise[js.Array[PDFTreeNode]] = js.native
  
  /**
    * @param number The page number to get.  The first page is 1.
    * @return A promise that is resolved with a PDFPageProxy.
    **/
  def getPage(number: Double): PDFPromise[PDFPageProxy] = js.native
  
  /**
    * Is the PDF encrypted?
    **/
  def isEncrypted(): PDFPromise[Boolean] = js.native
  
  /**
    * Total number of pages the PDF contains.
    **/
  var numPages: Double = js.native
}
object PDFDocumentProxy {
  
  @scala.inline
  def apply(
    dataLoaded: () => PDFPromise[js.Array[_]],
    destroy: () => Unit,
    embeddedFontsUsed: () => Boolean,
    fingerprint: String,
    getData: () => PDFPromise[Uint8Array],
    getDestinations: () => PDFPromise[js.Array[_]],
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
  
  @scala.inline
  implicit class PDFDocumentProxyOps[Self <: PDFDocumentProxy] (val x: Self) extends AnyVal {
    
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
    def setDataLoaded(value: () => PDFPromise[js.Array[_]]): Self = this.set("dataLoaded", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEmbeddedFontsUsed(value: () => Boolean): Self = this.set("embeddedFontsUsed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetData(value: () => PDFPromise[Uint8Array]): Self = this.set("getData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDestinations(value: () => PDFPromise[js.Array[_]]): Self = this.set("getDestinations", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetJavaScript(value: () => PDFPromise[js.Array[String]]): Self = this.set("getJavaScript", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMetadata(value: () => PDFPromise[Info]): Self = this.set("getMetadata", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOutline(value: () => PDFPromise[js.Array[PDFTreeNode]]): Self = this.set("getOutline", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPage(value: Double => PDFPromise[PDFPageProxy]): Self = this.set("getPage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsEncrypted(value: () => PDFPromise[Boolean]): Self = this.set("isEncrypted", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNumPages(value: Double): Self = this.set("numPages", value.asInstanceOf[js.Any])
  }
}
