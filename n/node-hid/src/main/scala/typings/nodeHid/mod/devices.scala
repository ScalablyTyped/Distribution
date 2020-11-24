package typings.nodeHid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-hid", "devices")
@js.native
object devices extends js.Object {
  
  def apply(): js.Array[Device] = js.native
  def apply(vid: Double, pid: Double): js.Array[Device] = js.native
}
