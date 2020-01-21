package typings.pem.mod

import typings.pem.AnonPrime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pem", "getDhparamInfo")
@js.native
object getDhparamInfo extends js.Object {
  def apply(dh: String, callback: Callback[AnonPrime]): Unit = js.native
}

