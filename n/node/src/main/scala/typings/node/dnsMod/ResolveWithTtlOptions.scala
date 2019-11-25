package typings.node.dnsMod

import typings.node.nodeNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolveWithTtlOptions extends ResolveOptions {
  @JSName("ttl")
  var ttl_ResolveWithTtlOptions: `true`
}

object ResolveWithTtlOptions {
  @scala.inline
  def apply(ttl: `true`): ResolveWithTtlOptions = {
    val __obj = js.Dynamic.literal(ttl = ttl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResolveWithTtlOptions]
  }
}

