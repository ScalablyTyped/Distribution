package typings.pdfjsDist.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFAnnotations extends js.Object {
  def getData(): PDFAnnotationData
   // throw new NotImplementedException()
  def getEmptyContainer(tagName: String, rect: js.Array[Double]): HTMLElement
   // always false
  def getHtmlElement(commonOjbs: js.Any): HTMLElement
  def getOperatorList(evaluator: js.Any): PDFPromise[_]
  def hasHtml(): Boolean
   // deprecated
  def isViewable(): Boolean
  def loadResources(keys: js.Any): PDFPromise[_]
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
}

