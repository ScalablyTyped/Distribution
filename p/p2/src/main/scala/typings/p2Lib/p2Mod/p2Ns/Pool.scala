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
  def apply(
    get: js.Function0[js.Any],
    objects: js.Array[_],
    release: js.Function1[js.Any, Pool],
    resize: js.Function1[scala.Double, Pool]
  ): Pool = {
    val __obj = js.Dynamic.literal(get = get, objects = objects, release = release, resize = resize)
  
    __obj.asInstanceOf[Pool]
  }
}

