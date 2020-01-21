package typings.pinterestSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pinterest-sdk", "request")
@js.native
object request extends js.Object {
  def apply(path: String): Unit = js.native
  def apply(path: String, httpMethod: String): Unit = js.native
  def apply(path: String, httpMethod: String, data: PinData): Unit = js.native
  def apply(path: String, httpMethod: String, data: PinData, callback: js.Function): Unit = js.native
  def apply(path: String, httpMethod: HttpMethod): Unit = js.native
  def apply(path: String, httpMethod: HttpMethod, data: PinData): Unit = js.native
  def apply(path: String, httpMethod: HttpMethod, data: PinData, callback: js.Function): Unit = js.native
}

