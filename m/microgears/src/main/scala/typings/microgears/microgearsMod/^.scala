package typings.microgears.microgearsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("microgears", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def addPlugin[T /* <: Plugin */](plugin: T): Unit = js.native
  def addService[T /* <: Service */](service: T): T = js.native
}

