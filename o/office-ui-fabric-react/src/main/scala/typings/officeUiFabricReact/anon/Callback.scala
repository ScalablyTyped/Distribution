package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.dragdropInterfacesMod.IDragDropContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Callback extends js.Object {
  
  def callback(context: IDragDropContext): scala.Unit = js.native
  def callback(context: IDragDropContext, event: js.Any): scala.Unit = js.native
  
  var eventName: String = js.native
}
