package typings.node.dnsMod

import typings.node.nodeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolveWithTtlOptions extends ResolveOptions {
  @JSName("ttl")
  var ttl_ResolveWithTtlOptions: `true` = js.native
}

object ResolveWithTtlOptions {
  @scala.inline
  def apply(ttl: `true`): ResolveWithTtlOptions = {
    val __obj = js.Dynamic.literal(ttl = ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveWithTtlOptions]
  }
  @scala.inline
  implicit class ResolveWithTtlOptionsOps[Self <: ResolveWithTtlOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTtl(value: `true`): Self = this.set("ttl", value.asInstanceOf[js.Any])
  }
  
}

