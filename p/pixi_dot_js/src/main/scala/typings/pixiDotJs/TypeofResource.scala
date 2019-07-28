package typings.pixiDotJs

import typings.pixiDotJs.PIXINs.loadersNs.ResourceNs.LOAD_TYPE
import typings.pixiDotJs.PIXINs.loadersNs.ResourceNs.XHR_RESPONSE_TYPE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofResource extends js.Object {
  val EMPTY_GIF: String
  def setExtensionLoadType(extname: String, loadType: LOAD_TYPE): Unit
  def setExtensionXhrType(extname: String, xhrType: XHR_RESPONSE_TYPE): Unit
}

object TypeofResource {
  @scala.inline
  def apply(
    EMPTY_GIF: String,
    setExtensionLoadType: (String, LOAD_TYPE) => Unit,
    setExtensionXhrType: (String, XHR_RESPONSE_TYPE) => Unit
  ): TypeofResource = {
    val __obj = js.Dynamic.literal(EMPTY_GIF = EMPTY_GIF, setExtensionLoadType = js.Any.fromFunction2(setExtensionLoadType), setExtensionXhrType = js.Any.fromFunction2(setExtensionXhrType))
  
    __obj.asInstanceOf[TypeofResource]
  }
}

