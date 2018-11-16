package typings
package microgearsLib.microgearsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("microgears", JSImport.Namespace)
@js.native
object microgearsModMembers extends js.Object {
  def addPlugin[T /* <: Plugin */](plugin: T): scala.Unit = js.native
  def addService[T /* <: Service */](service: T): T = js.native
}

