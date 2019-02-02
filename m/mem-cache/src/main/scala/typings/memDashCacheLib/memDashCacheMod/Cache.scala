package typings
package memDashCacheLib.memDashCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cache
  extends nodeLib.eventsMod.EventEmitter {
  var keys: js.Array[java.lang.String] = js.native
  var length: scala.Double = js.native
  def clean(): scala.Unit = js.native
  def get(key: java.lang.String): js.Any = js.native
  def remove(key: java.lang.String): scala.Unit = js.native
  def set(key: java.lang.String, value: js.Any): scala.Unit = js.native
  def set(key: java.lang.String, value: js.Any, timeout: scala.Double): scala.Unit = js.native
}

