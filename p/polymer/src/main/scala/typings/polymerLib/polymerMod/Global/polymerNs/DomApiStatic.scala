package typings
package polymerLib.polymerMod.Global.polymerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomApiStatic extends js.Object {
  def apply(obj: Base): DomApi = js.native
  def apply(obj: stdLib.Event): EventApi = js.native
  def apply(obj: stdLib.Node): DomApi = js.native
  def flush(): scala.Unit = js.native
}

