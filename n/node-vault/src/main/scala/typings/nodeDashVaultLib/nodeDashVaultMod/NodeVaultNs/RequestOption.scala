package typings
package nodeDashVaultLib.nodeDashVaultMod.NodeVaultNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOption extends Option {
  var method: java.lang.String
  var path: java.lang.String
}

object RequestOption {
  @scala.inline
  def apply(method: java.lang.String, path: java.lang.String): RequestOption = {
    val __obj = js.Dynamic.literal(method = method, path = path)
  
    __obj.asInstanceOf[RequestOption]
  }
}

