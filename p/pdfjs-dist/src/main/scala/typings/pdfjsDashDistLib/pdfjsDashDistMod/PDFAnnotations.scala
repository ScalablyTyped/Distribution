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

