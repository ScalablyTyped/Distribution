package typings.pem.mod

import typings.pem.AnonClientKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pem", "createCSR")
@js.native
object createCSR extends js.Object {
  def apply(callback: Callback[AnonClientKey]): Unit = js.native
  def apply(options: CSRCreationOptions, callback: Callback[AnonClientKey]): Unit = js.native
}

