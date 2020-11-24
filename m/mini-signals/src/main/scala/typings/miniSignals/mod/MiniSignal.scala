package typings.miniSignals.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MiniSignal extends js.Object {
  
  def add(fn: js.Function): MiniSignalBinding = js.native
  def add(fn: js.Function, thisArg: js.Any): MiniSignalBinding = js.native
  
  def detach(node: MiniSignalBinding): MiniSignal = js.native
  
  def detachAll(): MiniSignal = js.native
  
  def dispatch(args: js.Any*): Boolean = js.native
  
  def handlers(): js.Array[MiniSignalBinding] | Boolean = js.native
  def handlers(exists: Boolean): js.Array[MiniSignalBinding] | Boolean = js.native
  
  def has(node: MiniSignalBinding): Boolean = js.native
  
  def once(fn: js.Function): MiniSignalBinding = js.native
  def once(fn: js.Function, thisArg: js.Any): MiniSignalBinding = js.native
}
