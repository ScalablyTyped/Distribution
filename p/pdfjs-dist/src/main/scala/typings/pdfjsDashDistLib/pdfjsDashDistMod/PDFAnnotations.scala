package typings
package pdfjsDashDistLib.pdfjsDashDistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFAnnotations extends js.Object {
  def getData(): PDFAnnotationData
   // throw new NotImplementedException()
  def getEmptyContainer(tagName: java.lang.String, rect: js.Array[scala.Double]): pdfjsDashDistLib.HTMLElement
   // always false
  def getHtmlElement(commonOjbs: js.Any): pdfjsDashDistLib.HTMLElement
  def getOperatorList(evaluator: js.Any): PDFPromise[_]
  def hasHtml(): scala.Boolean
   // deprecated
  def isViewable(): scala.Boolean
  def loadResources(keys: js.Any): PDFPromise[_]
}

object PDFAnnotations {
  @scala.inline
  def apply(
    getData: () => PDFAnnotationData,
    getEmptyContainer: (java.lang.String, js.Array[scala.Double]) => pdfjsDashDistLib.HTMLElement,
    getHtmlElement: js.Any => pdfjsDashDistLib.HTMLElement,
    getOperatorList: js.Any => PDFPromise[_],
    hasHtml: () => scala.Boolean,
    isViewable: () => scala.Boolean,
    loadResources: js.Any => PDFPromise[_]
  ): PDFAnnotations = {
    val __obj = js.Dynamic.literal(getData = js.Any.fromFunction0(getData), getEmptyContainer = js.Any.fromFunction2(getEmptyContainer), getHtmlElement = js.Any.fromFunction1(getHtmlElement), getOperatorList = js.Any.fromFunction1(getOperatorList), hasHtml = js.Any.fromFunction0(hasHtml), isViewable = js.Any.fromFunction0(isViewable), loadResources = js.Any.fromFunction1(loadResources))
  
    __obj.asInstanceOf[PDFAnnotations]
  }
}

