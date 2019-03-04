package typings
package pixiDashSpineLib.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Disposable extends js.Object {
  def dispose(): scala.Unit
}

object Disposable {
  @scala.inline
  def apply(dispose: js.Function0[scala.Unit]): Disposable = {
    val __obj = js.Dynamic.literal(dispose = dispose)
  
    __obj.asInstanceOf[Disposable]
  }
}

