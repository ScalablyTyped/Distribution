package typings.nodeDashForge.nodeDashForgeMod

import typings.nodeDashForge.nodeDashForgeMod.randomNs.CB
import typings.nodeDashForge.nodeDashForgeMod.randomNs.Random
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "random")
@js.native
object randomNs extends js.Object {
  trait Random extends js.Object {
    def seedFile(needed: Double, cb: CB): Unit
    def seedFileSync(needed: Double): String
  }
  
  def createInstance(): Random = js.native
  def getBytes(count: Double): Bytes = js.native
  def getBytes(count: Double, callback: js.Function1[/* bytes */ Bytes, _]): Bytes = js.native
  def getBytesSync(count: Double): Bytes = js.native
  type CB = js.Function2[/* _ */ js.Any, /* seed */ String, Unit]
}

