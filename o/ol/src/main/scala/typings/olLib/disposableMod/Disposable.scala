package typings
package olLib.disposableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Disposable extends js.Object {
  def dispose(): scala.Unit
  /* protected */ def disposeInternal(): scala.Unit
}

object Disposable {
  @scala.inline
  def apply(dispose: () => scala.Unit, disposeInternal: () => scala.Unit): Disposable = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), disposeInternal = js.Any.fromFunction0(disposeInternal))
  
    __obj.asInstanceOf[Disposable]
  }
}

