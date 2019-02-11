package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "Pool")
@js.native
class Pool ()
  extends p2Lib.p2Mod.p2Ns.Pool {
  def this(options: p2Lib.p2Mod.p2Ns.PoolOptions) = this()
  /* CompleteClass */
  override var objects: js.Array[_] = js.native
  /* CompleteClass */
  override def get(): js.Any = js.native
  /* CompleteClass */
  override def release(`object`: js.Any): p2Lib.p2Mod.p2Ns.Pool = js.native
  /* CompleteClass */
  override def resize(size: scala.Double): p2Lib.p2Mod.p2Ns.Pool = js.native
}

