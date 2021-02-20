package typings.pdfjsDist.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFAnnotations extends StObject {
  
  def getData(): PDFAnnotationData = js.native
  
  // throw new NotImplementedException()
  def getEmptyContainer(tagName: String, rect: js.Array[Double]): HTMLElement = js.native
  
  // always false
  def getHtmlElement(commonOjbs: js.Any): HTMLElement = js.native
  
  def getOperatorList(evaluator: js.Any): PDFPromise[_] = js.native
  
  def hasHtml(): Boolean = js.native
  
  // deprecated
  def isViewable(): Boolean = js.native
  
  def loadResources(keys: js.Any): PDFPromise[_] = js.native
}
object PDFAnnotations {
  
  @scala.inline
  def apply(
    getData: () => PDFAnnotationData,
    getEmptyContainer: (String, js.Array[Double]) => HTMLElement,
    getHtmlElement: js.Any => HTMLElement,
    getOperatorList: js.Any => PDFPromise[_],
    hasHtml: () => Boolean,
    isViewable: () => Boolean,
    loadResources: js.Any => PDFPromise[_]
  ): PDFAnnotations = {
    val __obj = js.Dynamic.literal(getData = js.Any.fromFunction0(getData), getEmptyContainer = js.Any.fromFunction2(getEmptyContainer), getHtmlElement = js.Any.fromFunction1(getHtmlElement), getOperatorList = js.Any.fromFunction1(getOperatorList), hasHtml = js.Any.fromFunction0(hasHtml), isViewable = js.Any.fromFunction0(isViewable), loadResources = js.Any.fromFunction1(loadResources))
    __obj.asInstanceOf[PDFAnnotations]
  }
  
  @scala.inline
  implicit class PDFAnnotationsMutableBuilder[Self <: PDFAnnotations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetData(value: () => PDFAnnotationData): Self = StObject.set(x, "getData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEmptyContainer(value: (String, js.Array[Double]) => HTMLElement): Self = StObject.set(x, "getEmptyContainer", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetHtmlElement(value: js.Any => HTMLElement): Self = StObject.set(x, "getHtmlElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetOperatorList(value: js.Any => PDFPromise[_]): Self = StObject.set(x, "getOperatorList", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasHtml(value: () => Boolean): Self = StObject.set(x, "hasHtml", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsViewable(value: () => Boolean): Self = StObject.set(x, "isViewable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLoadResources(value: js.Any => PDFPromise[_]): Self = StObject.set(x, "loadResources", js.Any.fromFunction1(value))
  }
}
