package typings.phone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("phone", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(phoneNumber: String): js.Array[String] = js.native
  def apply(phoneNumber: String, countryCode: js.UndefOr[scala.Nothing], allowLandLine: Boolean): js.Array[String] = js.native
  def apply(phoneNumber: String, countryCode: String): js.Array[String] = js.native
  def apply(phoneNumber: String, countryCode: String, allowLandLine: Boolean): js.Array[String] = js.native
}

