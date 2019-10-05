package typings.pkcs11js.Pkcs11Js

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
  var `type`: Double
}

object IParams {
  @scala.inline
  def apply(`type`: Double): IParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IParams]
  }
}

