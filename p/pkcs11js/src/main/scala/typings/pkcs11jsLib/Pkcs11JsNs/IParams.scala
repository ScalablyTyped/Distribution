package typings
package pkcs11jsLib.Pkcs11JsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Crypto parameters
trait IParams extends js.Object {
  /**
    * Type of crypto param. Uses constants CK_PARAMS_*
    *
    * @type {number}
    */
  var `type`: scala.Double
}

object IParams {
  @scala.inline
  def apply(`type`: scala.Double): IParams = {
    val __obj = js.Dynamic.literal(`type` = `type`)
  
    __obj.asInstanceOf[IParams]
  }
}

