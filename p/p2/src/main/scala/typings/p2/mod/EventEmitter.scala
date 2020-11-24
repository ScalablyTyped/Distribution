package typings.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p2", "EventEmitter")
@js.native
class EventEmitter () extends js.Object {
  
  def emit(event: js.Any): EventEmitter = js.native
  
  def has(`type`: String, listener: js.Function): Boolean = js.native
  
  def off(`type`: String, listener: js.Function): EventEmitter = js.native
  
  def on(`type`: String, listener: js.Function): EventEmitter = js.native
  def on(`type`: String, listener: js.Function, context: js.Any): EventEmitter = js.native
}
