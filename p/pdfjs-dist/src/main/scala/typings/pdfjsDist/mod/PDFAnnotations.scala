package typings.pdfjsDist.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PDFAnnotations extends StObject {
  
  def getData(): PDFAnnotationData
  
  // throw new NotImplementedException()
  def getEmptyContainer(tagName: String, rect: js.Array[Double]): HTMLElement
  
  // always false
  def getHtmlElement(commonOjbs: js.Any): HTMLElement
  
  def getOperatorList(evaluator: js.Any): PDFPromise[js.Any]
  
  def hasHtml(): Boolean
  
  // deprecated
  def isViewable(): Boolean
  
  def loadResources(keys: js.Any): PDFPromise[js.Any]
}
object PDFAnnotations {
  
  inline def apply(
    getData: () => PDFAnnotationData,
    getEmptyContainer: (String, js.Array[Double]) => HTMLElement,
    getHtmlElement: js.Any => HTMLElement,
    getOperatorList: js.Any => PDFPromise[js.Any],
    hasHtml: () => Boolean,
    isViewable: () => Boolean,
    loadResources: js.Any => PDFPromise[js.Any]
  ): PDFAnnotations = {
    val __obj = js.Dynamic.literal(getData = js.Any.fromFunction0(getData), getEmptyContainer = js.Any.fromFunction2(getEmptyContainer), getHtmlElement = js.Any.fromFunction1(getHtmlElement), getOperatorList = js.Any.fromFunction1(getOperatorList), hasHtml = js.Any.fromFunction0(hasHtml), isViewable = js.Any.fromFunction0(isViewable), loadResources = js.Any.fromFunction1(loadResources))
    __obj.asInstanceOf[PDFAnnotations]
  }
  
  extension [Self <: PDFAnnotations](x: Self) {
    
    inline def setGetData(value: () => PDFAnnotationData): Self = StObject.set(x, "getData", js.Any.fromFunction0(value))
    
    inline def setGetEmptyContainer(value: (String, js.Array[Double]) => HTMLElement): Self = StObject.set(x, "getEmptyContainer", js.Any.fromFunction2(value))
    
    inline def setGetHtmlElement(value: js.Any => HTMLElement): Self = StObject.set(x, "getHtmlElement", js.Any.fromFunction1(value))
    
    inline def setGetOperatorList(value: js.Any => PDFPromise[js.Any]): Self = StObject.set(x, "getOperatorList", js.Any.fromFunction1(value))
    
    inline def setHasHtml(value: () => Boolean): Self = StObject.set(x, "hasHtml", js.Any.fromFunction0(value))
    
    inline def setIsViewable(value: () => Boolean): Self = StObject.set(x, "isViewable", js.Any.fromFunction0(value))
    
    inline def setLoadResources(value: js.Any => PDFPromise[js.Any]): Self = StObject.set(x, "loadResources", js.Any.fromFunction1(value))
  }
}
