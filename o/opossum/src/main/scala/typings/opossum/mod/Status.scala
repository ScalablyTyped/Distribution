package typings.opossum.mod

import typings.node.eventsMod.EventEmitter
import typings.opossum.opossumStrings.snapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Status extends EventEmitter {
  
  @JSName("on")
  def on_snapshot(event: snapshot, listener: js.Function1[/* snapshot */ Stats, Unit]): this.type = js.native
  
  var stats: Stats = js.native
  
  var window: Window = js.native
}
