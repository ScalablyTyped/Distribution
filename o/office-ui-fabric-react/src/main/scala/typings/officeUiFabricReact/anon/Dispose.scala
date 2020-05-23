package typings.officeUiFabricReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dispose extends js.Object {
  var key: String
  def dispose(): scala.Unit
}

object Dispose {
  @scala.inline
  def apply(dispose: () => scala.Unit, key: String): Dispose = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dispose]
  }
}

