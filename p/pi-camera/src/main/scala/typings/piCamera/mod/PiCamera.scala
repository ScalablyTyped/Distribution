package typings.piCamera.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PiCamera extends js.Object {
  def get(prop: String): String | Double | Boolean = js.native
  def record(): js.Promise[String] = js.native
  def set(prop: String, value: String): String | Double | Boolean = js.native
  def set(prop: String, value: Boolean): String | Double | Boolean = js.native
  def set(prop: String, value: Double): String | Double | Boolean = js.native
  def snap(): js.Promise[String] = js.native
}

