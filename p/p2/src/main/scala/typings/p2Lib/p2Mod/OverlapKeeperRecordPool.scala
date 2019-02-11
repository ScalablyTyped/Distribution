package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "OverlapKeeperRecordPool")
@js.native
class OverlapKeeperRecordPool ()
  extends p2Lib.p2Mod.p2Ns.OverlapKeeperRecordPool {
  /* CompleteClass */
  override var objects: js.Array[_] = js.native
  /* CompleteClass */
  override def create(): p2Lib.p2Mod.p2Ns.OverlapKeeperRecord = js.native
  /* CompleteClass */
  override def destroy(record: p2Lib.p2Mod.p2Ns.OverlapKeeperRecord): p2Lib.p2Mod.p2Ns.OverlapKeeperRecordPool = js.native
  /* CompleteClass */
  override def get(): js.Any = js.native
  /* CompleteClass */
  override def release(`object`: js.Any): p2Lib.p2Mod.p2Ns.Pool = js.native
  /* CompleteClass */
  override def resize(size: scala.Double): p2Lib.p2Mod.p2Ns.Pool = js.native
}

