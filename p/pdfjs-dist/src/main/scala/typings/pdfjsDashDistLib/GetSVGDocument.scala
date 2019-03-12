package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSVGDocument extends js.Object {
  def getSVGDocument(): Document
}

object GetSVGDocument {
  @scala.inline
  def apply(getSVGDocument: () => Document): GetSVGDocument = {
    val __obj = js.Dynamic.literal(getSVGDocument = js.Any.fromFunction0(getSVGDocument))
  
    __obj.asInstanceOf[GetSVGDocument]
  }
}

