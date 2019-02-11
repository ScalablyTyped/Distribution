package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlapKeeperRecordPool extends Pool {
  def create(): OverlapKeeperRecord
  def destroy(record: OverlapKeeperRecord): OverlapKeeperRecordPool
}

