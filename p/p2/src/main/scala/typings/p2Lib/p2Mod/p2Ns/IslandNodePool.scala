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
    create: () => IslandNode,
    destroy: IslandNode => IslandNodePool,
    get: () => js.Any,
    objects: js.Array[_],
    release: js.Any => Pool,
    resize: scala.Double => Pool
  ): IslandNodePool = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create), destroy = js.Any.fromFunction1(destroy), get = js.Any.fromFunction0(get), objects = objects, release = js.Any.fromFunction1(release), resize = js.Any.fromFunction1(resize))
  
    __obj.asInstanceOf[IslandNodePool]
  }
}

