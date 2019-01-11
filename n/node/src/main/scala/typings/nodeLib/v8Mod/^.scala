package typings
package nodeLib.v8Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("v8", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getHeapSpaceStatistics(): js.Array[nodeLib.v8Mod.HeapSpaceInfo] = js.native
  def getHeapStatistics(): nodeLib.v8Mod.HeapInfo = js.native
  def setFlagsFromString(flags: java.lang.String): scala.Unit = js.native
}

