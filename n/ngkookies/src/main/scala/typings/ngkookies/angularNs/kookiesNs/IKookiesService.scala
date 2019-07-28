package typings.ngkookies.angularNs.kookiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKookiesService extends js.Object {
  def get(): js.Any = js.native
  def get(name: String): js.Any = js.native
  def get(name: String, converter: js.Any): js.Any = js.native
  @JSName("get")
  def get_T_T[T](name: String, converter: js.Any): T = js.native
  def remove(name: String): Boolean = js.native
  def remove(name: String, options: Options): Boolean = js.native
  def set(name: String, value: String): Unit = js.native
  def set(name: String, value: String, optopns: Options): Unit = js.native
}

