package typings
package nconfLib.nconfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStore extends js.Object {
  var `type`: java.lang.String = js.native
  def clear(key: java.lang.String): scala.Boolean = js.native
  def get(key: java.lang.String): js.Any = js.native
  def merge(key: java.lang.String, value: js.Any): scala.Boolean = js.native
  def reset(): scala.Boolean = js.native
  def reset(callback: ICallbackFunction): scala.Boolean = js.native
  def set(key: java.lang.String, value: js.Any): scala.Boolean = js.native
}

