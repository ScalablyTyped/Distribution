package typings
package nodeLib.dnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolveWithTtlOptions extends ResolveOptions {
  @JSName("ttl")
  var ttl_ResolveWithTtlOptions: nodeLib.nodeLibNumbers.`true`
}

object ResolveWithTtlOptions {
  @scala.inline
  def apply(ttl: nodeLib.nodeLibNumbers.`true`): ResolveWithTtlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ttl")(ttl)
    __obj.asInstanceOf[ResolveWithTtlOptions]
  }
}

