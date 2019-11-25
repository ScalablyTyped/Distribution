package typings.node.dnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolveOptions extends js.Object {
  var ttl: Boolean
}

object ResolveOptions {
  @scala.inline
  def apply(ttl: Boolean): ResolveOptions = {
    val __obj = js.Dynamic.literal(ttl = ttl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResolveOptions]
  }
}

