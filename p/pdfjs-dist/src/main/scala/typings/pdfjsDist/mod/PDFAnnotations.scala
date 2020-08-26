package typings.pdfjsDist.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFAnnotations extends js.Object {
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
  implicit class PDFAnnotationsOps[Self <: PDFAnnotations] (val x: Self) extends AnyVal {
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
    def setGetData(value: () => PDFAnnotationData): Self = this.set("getData", js.Any.fromFunction0(value))
    @scala.inline
    def setGetEmptyContainer(value: (String, js.Array[Double]) => HTMLElement): Self = this.set("getEmptyContainer", js.Any.fromFunction2(value))
    @scala.inline
    def setGetHtmlElement(value: js.Any => HTMLElement): Self = this.set("getHtmlElement", js.Any.fromFunction1(value))
    @scala.inline
    def setGetOperatorList(value: js.Any => PDFPromise[_]): Self = this.set("getOperatorList", js.Any.fromFunction1(value))
    @scala.inline
    def setHasHtml(value: () => Boolean): Self = this.set("hasHtml", js.Any.fromFunction0(value))
    @scala.inline
    def setIsViewable(value: () => Boolean): Self = this.set("isViewable", js.Any.fromFunction0(value))
    @scala.inline
    def setLoadResources(value: js.Any => PDFPromise[_]): Self = this.set("loadResources", js.Any.fromFunction1(value))
  }
  
}

