package typings
package ngkookiesLib.angularNs.kookiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKookiesService extends js.Object {
  def get(): js.Any = js.native
  def get(name: java.lang.String): js.Any = js.native
  def get(name: java.lang.String, converter: js.Any): js.Any = js.native
  @JSName("get")
  def get_TT[T](name: java.lang.String, converter: js.Any): T = js.native
  def remove(name: java.lang.String): scala.Boolean = js.native
  def remove(name: java.lang.String, options: Options): scala.Boolean = js.native
  def set(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def set(name: java.lang.String, value: java.lang.String, optopns: Options): scala.Unit = js.native
}

