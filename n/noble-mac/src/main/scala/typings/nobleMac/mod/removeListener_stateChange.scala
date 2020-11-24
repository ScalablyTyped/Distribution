package typings.nobleMac.mod

import typings.nobleMac.nobleMacStrings.stateChange
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("noble-mac", "removeListener")
@js.native
object removeListener_stateChange extends js.Object {
  
  def apply(event: stateChange, listener: js.Function1[/* state */ String, Unit]): EventEmitter = js.native
}
