package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pool extends js.Object {
  var objects: js.Array[_]
  def get(): js.Any
  def release(`object`: js.Any): Pool
  def resize(size: scala.Double): Pool
}

object Pool {
  @scala.inline
  def apply(get: () => js.Any, objects: js.Array[_], release: js.Any => Pool, resize: scala.Double => Pool): Pool = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), objects = objects, release = js.Any.fromFunction1(release), resize = js.Any.fromFunction1(resize))
  
    __obj.asInstanceOf[Pool]
  }
}

