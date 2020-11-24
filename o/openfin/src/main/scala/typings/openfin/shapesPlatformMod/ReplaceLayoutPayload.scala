package typings.openfin.shapesPlatformMod

import typings.openfin.shapesIdentityMod.Identity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplaceLayoutPayload extends js.Object {
  
  var opts: ReplaceLayoutOpts = js.native
  
  var target: Identity = js.native
}
object ReplaceLayoutPayload {
  
  @scala.inline
  def apply(opts: ReplaceLayoutOpts, target: Identity): ReplaceLayoutPayload = {
    val __obj = js.Dynamic.literal(opts = opts.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceLayoutPayload]
  }
  
  @scala.inline
  implicit class ReplaceLayoutPayloadOps[Self <: ReplaceLayoutPayload] (val x: Self) extends AnyVal {
    
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
    def setOpts(value: ReplaceLayoutOpts): Self = this.set("opts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Identity): Self = this.set("target", value.asInstanceOf[js.Any])
  }
}
