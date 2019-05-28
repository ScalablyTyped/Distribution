package typings
package naverDashWhaleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofpageCapture extends js.Object {
  def saveAsMHTML(
    details: chromeLib.chromeNs.pageCaptureNs.SaveDetails,
    callback: js.Function1[/* mhtmlData */ js.Any, scala.Unit]
  ): scala.Unit
}

object TypeofpageCapture {
  @scala.inline
  def apply(
    saveAsMHTML: (chromeLib.chromeNs.pageCaptureNs.SaveDetails, js.Function1[/* mhtmlData */ js.Any, scala.Unit]) => scala.Unit
  ): TypeofpageCapture = {
    val __obj = js.Dynamic.literal(saveAsMHTML = js.Any.fromFunction2(saveAsMHTML))
  
    __obj.asInstanceOf[TypeofpageCapture]
  }
}

