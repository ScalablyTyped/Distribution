package typings.node.domainMod

import typings.node.NodeJS.Timer
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("domain", "Domain")
@js.native
class Domain ()
  extends EventEmitter
     with typings.node.domainMod.global.NodeJS.Domain {
  
  def enter(): Unit = js.native
  
  def exit(): Unit = js.native
  
  var members: js.Array[EventEmitter | Timer] = js.native
}
