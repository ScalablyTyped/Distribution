package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlapKeeperRecordPool extends Pool {
  def create(): OverlapKeeperRecord
  def destroy(record: OverlapKeeperRecord): OverlapKeeperRecordPool
}

object OverlapKeeperRecordPool {
  @scala.inline
  def apply(
    create: js.Function0[OverlapKeeperRecord],
    destroy: js.Function1[OverlapKeeperRecord, OverlapKeeperRecordPool],
    get: js.Function0[js.Any],
    objects: js.Array[_],
    release: js.Function1[js.Any, Pool],
    resize: js.Function1[scala.Double, Pool]
  ): OverlapKeeperRecordPool = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("objects")(objects)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("resize")(resize)
    __obj.asInstanceOf[OverlapKeeperRecordPool]
  }
}

