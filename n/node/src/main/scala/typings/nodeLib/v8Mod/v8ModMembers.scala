package typings
package nodeLib.v8Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("v8", JSImport.Namespace)
@js.native
object v8ModMembers extends js.Object {
  def getHeapSpaceStatistics(): js.Array[HeapSpaceInfo] = js.native
  def getHeapStatistics(): HeapInfo = js.native
  def setFlagsFromString(flags: java.lang.String): scala.Unit = js.native
}

