package typings
package nodeLib.dnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolveOptions extends js.Object {
  var ttl: scala.Boolean
}

object ResolveOptions {
  @scala.inline
  def apply(ttl: scala.Boolean): ResolveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ttl")(ttl)
    __obj.asInstanceOf[ResolveOptions]
  }
}

