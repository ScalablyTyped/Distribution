package typings
package microgearsLib.microgearsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("microgears", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def addPlugin[T /* <: microgearsLib.microgearsMod.Plugin */](plugin: T): scala.Unit = js.native
  def addService[T /* <: microgearsLib.microgearsMod.Service */](service: T): T = js.native
}

