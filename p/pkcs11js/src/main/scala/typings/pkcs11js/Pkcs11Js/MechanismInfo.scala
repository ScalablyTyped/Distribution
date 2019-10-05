package typings.pkcs11js.Pkcs11Js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MechanismInfo extends js.Object {
  var flags: Double
  var maxKeySize: Double
  var minKeySize: Double
}

object MechanismInfo {
  @scala.inline
  def apply(flags: Double, maxKeySize: Double, minKeySize: Double): MechanismInfo = {
    val __obj = js.Dynamic.literal(flags = flags, maxKeySize = maxKeySize, minKeySize = minKeySize)
  
    __obj.asInstanceOf[MechanismInfo]
  }
}

