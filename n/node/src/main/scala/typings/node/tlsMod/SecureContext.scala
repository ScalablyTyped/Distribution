package typings.node.tlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecureContext extends js.Object {
  var context: js.Any
}

object SecureContext {
  @scala.inline
  def apply(context: js.Any): SecureContext = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SecureContext]
  }
}

