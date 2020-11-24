package typings.nodemailer.sharedMod

import typings.nodemailer.nodemailerBooleans.`false`
import typings.nodemailer.nodemailerBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolveHostnameValue extends js.Object {
  
  var _cached: js.UndefOr[`true`] = js.native
  
  var host: String = js.native
  
  var servername: String | `false` = js.native
}
object ResolveHostnameValue {
  
  @scala.inline
  def apply(host: String, servername: String | `false`): ResolveHostnameValue = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], servername = servername.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveHostnameValue]
  }
  
  @scala.inline
  implicit class ResolveHostnameValueOps[Self <: ResolveHostnameValue] (val x: Self) extends AnyVal {
    
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
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServername(value: String | `false`): Self = this.set("servername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_cached(value: `true`): Self = this.set("_cached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_cached: Self = this.set("_cached", js.undefined)
  }
}
