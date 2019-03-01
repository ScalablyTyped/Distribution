package typings
package pdfjsDashDistLib.pdfjsDashDistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFAnnotations extends js.Object {
  def getData(): PDFAnnotationData
   // throw new NotImplementedException()
  def getEmptyContainer(tagName: java.lang.String, rect: js.Array[scala.Double]): stdLib.HTMLElement
   // always false
  def getHtmlElement(commonOjbs: js.Any): stdLib.HTMLElement
  def getOperatorList(evaluator: js.Any): PDFPromise[_]
  def hasHtml(): scala.Boolean
   // deprecated
  def isViewable(): scala.Boolean
  def loadResources(keys: js.Any): PDFPromise[_]
}

object PDFAnnotations {
  @scala.inline
  def apply(
    getData: js.Function0[PDFAnnotationData],
    getEmptyContainer: js.Function2[java.lang.String, js.Array[scala.Double], stdLib.HTMLElement],
    getHtmlElement: js.Function1[js.Any, stdLib.HTMLElement],
    getOperatorList: js.Function1[js.Any, PDFPromise[_]],
    hasHtml: js.Function0[scala.Boolean],
    isViewable: js.Function0[scala.Boolean],
    loadResources: js.Function1[js.Any, PDFPromise[_]]
  ): PDFAnnotations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getData")(getData)
    __obj.updateDynamic("getEmptyContainer")(getEmptyContainer)
    __obj.updateDynamic("getHtmlElement")(getHtmlElement)
    __obj.updateDynamic("getOperatorList")(getOperatorList)
    __obj.updateDynamic("hasHtml")(hasHtml)
    __obj.updateDynamic("isViewable")(isViewable)
    __obj.updateDynamic("loadResources")(loadResources)
    __obj.asInstanceOf[PDFAnnotations]
  }
}

