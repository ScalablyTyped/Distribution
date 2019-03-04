package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IslandPool extends Pool {
  def create(): Island
  def destroy(island: Island): IslandPool
}

object IslandPool {
  @scala.inline
  def apply(
    create: js.Function0[Island],
    destroy: js.Function1[Island, IslandPool],
    get: js.Function0[js.Any],
    objects: js.Array[_],
    release: js.Function1[js.Any, Pool],
    resize: js.Function1[scala.Double, Pool]
  ): IslandPool = {
    val __obj = js.Dynamic.literal(create = create, destroy = destroy, get = get, objects = objects, release = release, resize = resize)
  
    __obj.asInstanceOf[IslandPool]
  }
}

