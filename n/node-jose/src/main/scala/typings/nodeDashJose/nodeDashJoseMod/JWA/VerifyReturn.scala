package typings.nodeDashJose.nodeDashJoseMod.JWA

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyReturn extends js.Object {
  var data: Buffer
   // the data passed into the verify function
  var mac: Buffer
   // the signature for `data`
  var valid: Boolean
}

object VerifyReturn {
  @scala.inline
  def apply(data: Buffer, mac: Buffer, valid: Boolean): VerifyReturn = {
    val __obj = js.Dynamic.literal(data = data, mac = mac, valid = valid)
  
    __obj.asInstanceOf[VerifyReturn]
  }
}

