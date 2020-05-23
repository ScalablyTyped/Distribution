package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.dragdropInterfacesMod.IDragDropContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Callback extends js.Object {
  var eventName: String = js.native
  def callback(context: IDragDropContext): scala.Unit = js.native
  def callback(context: IDragDropContext, event: js.Any): scala.Unit = js.native
}

