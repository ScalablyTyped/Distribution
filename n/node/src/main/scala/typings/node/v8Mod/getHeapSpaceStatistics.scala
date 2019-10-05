package typings.node.v8Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("v8", "getHeapSpaceStatistics")
@js.native
object getHeapSpaceStatistics extends js.Object {
  def apply(): js.Array[HeapSpaceInfo] = js.native
}

