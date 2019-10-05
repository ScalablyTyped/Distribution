package typings.polymer.polymerMod.Global.polymer

import typings.std.Event
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomApiStatic extends js.Object {
  def apply(obj: Base): DomApi = js.native
  def apply(obj: Event): EventApi = js.native
  def apply(obj: Node): DomApi = js.native
  def flush(): Unit = js.native
}

