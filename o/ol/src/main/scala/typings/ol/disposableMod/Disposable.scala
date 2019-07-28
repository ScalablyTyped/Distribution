package typings.ol.disposableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Disposable extends js.Object {
  def dispose(): Unit
  /* protected */ def disposeInternal(): Unit
}

object Disposable {
  @scala.inline
  def apply(dispose: () => Unit, disposeInternal: () => Unit): Disposable = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), disposeInternal = js.Any.fromFunction0(disposeInternal))
  
    __obj.asInstanceOf[Disposable]
  }
}

