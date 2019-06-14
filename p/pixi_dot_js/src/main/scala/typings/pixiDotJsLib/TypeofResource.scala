package typings
package pixiDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofResource extends js.Object {
  val EMPTY_GIF: java.lang.String
  def setExtensionLoadType(extname: java.lang.String, loadType: pixiDotJsLib.PIXINs.loadersNs.ResourceNs.LOAD_TYPE): scala.Unit
  def setExtensionXhrType(extname: java.lang.String, xhrType: pixiDotJsLib.PIXINs.loadersNs.ResourceNs.XHR_RESPONSE_TYPE): scala.Unit
}

object TypeofResource {
  @scala.inline
  def apply(
    EMPTY_GIF: java.lang.String,
    setExtensionLoadType: (java.lang.String, pixiDotJsLib.PIXINs.loadersNs.ResourceNs.LOAD_TYPE) => scala.Unit,
    setExtensionXhrType: (java.lang.String, pixiDotJsLib.PIXINs.loadersNs.ResourceNs.XHR_RESPONSE_TYPE) => scala.Unit
  ): TypeofResource = {
    val __obj = js.Dynamic.literal(EMPTY_GIF = EMPTY_GIF, setExtensionLoadType = js.Any.fromFunction2(setExtensionLoadType), setExtensionXhrType = js.Any.fromFunction2(setExtensionXhrType))
  
    __obj.asInstanceOf[TypeofResource]
  }
}

