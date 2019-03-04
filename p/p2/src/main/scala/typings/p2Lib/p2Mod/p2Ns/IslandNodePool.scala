package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IslandNodePool extends Pool {
  def create(): IslandNode
  def destroy(node: IslandNode): IslandNodePool
}

object IslandNodePool {
  @scala.inline
  def apply(
    create: js.Function0[IslandNode],
    destroy: js.Function1[IslandNode, IslandNodePool],
    get: js.Function0[js.Any],
    objects: js.Array[_],
    release: js.Function1[js.Any, Pool],
    resize: js.Function1[scala.Double, Pool]
  ): IslandNodePool = {
    val __obj = js.Dynamic.literal(create = create, destroy = destroy, get = get, objects = objects, release = release, resize = resize)
  
    __obj.asInstanceOf[IslandNodePool]
  }
}

