package typings.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDispose extends js.Object {
  var key: String
  def dispose(): Unit
}

object AnonDispose {
  @scala.inline
  def apply(dispose: () => Unit, key: String): AnonDispose = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), key = key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDispose]
  }
}

