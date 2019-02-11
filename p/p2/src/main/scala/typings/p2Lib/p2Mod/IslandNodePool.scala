package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "IslandNodePool")
@js.native
class IslandNodePool ()
  extends p2Lib.p2Mod.p2Ns.IslandNodePool {
  /* CompleteClass */
  override var objects: js.Array[_] = js.native
  /* CompleteClass */
  override def create(): p2Lib.p2Mod.p2Ns.IslandNode = js.native
  /* CompleteClass */
  override def destroy(node: p2Lib.p2Mod.p2Ns.IslandNode): p2Lib.p2Mod.p2Ns.IslandNodePool = js.native
  /* CompleteClass */
  override def get(): js.Any = js.native
  /* CompleteClass */
  override def release(`object`: js.Any): p2Lib.p2Mod.p2Ns.Pool = js.native
  /* CompleteClass */
  override def resize(size: scala.Double): p2Lib.p2Mod.p2Ns.Pool = js.native
}

