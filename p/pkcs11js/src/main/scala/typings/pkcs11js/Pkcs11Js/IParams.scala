package typings.pkcs11js.Pkcs11Js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Crypto parameters
@js.native
trait IParams extends js.Object {
  /**
    * Type of crypto param. Uses constants CK_PARAMS_*
    *
    * @type {number}
    */
  var `type`: Double = js.native
}

object IParams {
  @scala.inline
  def apply(`type`: Double): IParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IParams]
  }
  @scala.inline
  implicit class IParamsOps[Self <: IParams] (val x: Self) extends AnyVal {
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
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

