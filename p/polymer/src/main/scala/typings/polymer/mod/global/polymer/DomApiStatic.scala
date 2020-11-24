package typings.polymer.mod.global.polymer

import typings.std.Event
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomApiStatic extends js.Object {
  
  def apply(obj: Base): DomApi = js.native
  def apply(obj: Event): EventApi = js.native
  def apply(obj: Node): DomApi = js.native
  
  def flush(): Unit = js.native
}
