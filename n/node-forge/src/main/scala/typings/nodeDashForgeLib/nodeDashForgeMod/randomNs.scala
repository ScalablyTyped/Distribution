package typings
package nodeDashForgeLib.nodeDashForgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "random")
@js.native
object randomNs extends js.Object {
  trait Random extends js.Object {
    def seedFile(needed: scala.Double, cb: CB): scala.Unit
    def seedFileSync(needed: scala.Double): java.lang.String
  }
  
  def createInstance(): Random = js.native
  def getBytes(count: scala.Double): nodeDashForgeLib.nodeDashForgeMod.Bytes = js.native
  def getBytes(
    count: scala.Double,
    callback: js.Function1[/* bytes */ nodeDashForgeLib.nodeDashForgeMod.Bytes, _]
  ): nodeDashForgeLib.nodeDashForgeMod.Bytes = js.native
  def getBytesSync(count: scala.Double): nodeDashForgeLib.nodeDashForgeMod.Bytes = js.native
  type CB = js.Function2[/* _ */ js.Any, /* seed */ java.lang.String, scala.Unit]
}

