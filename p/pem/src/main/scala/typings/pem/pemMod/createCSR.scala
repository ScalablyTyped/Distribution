package typings.pem.pemMod

import typings.pem.Anon_ClientKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pem", "createCSR")
@js.native
object createCSR extends js.Object {
  def apply(callback: Callback[Anon_ClientKey]): Unit = js.native
  def apply(options: CSRCreationOptions, callback: Callback[Anon_ClientKey]): Unit = js.native
}

