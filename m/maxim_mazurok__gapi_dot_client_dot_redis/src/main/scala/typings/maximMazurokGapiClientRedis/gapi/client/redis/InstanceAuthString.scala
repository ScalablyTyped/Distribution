package typings.maximMazurokGapiClientRedis.gapi.client.redis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceAuthString extends js.Object {
  
  /** AUTH string set on the instance. */
  var authString: js.UndefOr[String] = js.native
}
object InstanceAuthString {
  
  @scala.inline
  def apply(): InstanceAuthString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceAuthString]
  }
  
  @scala.inline
  implicit class InstanceAuthStringOps[Self <: InstanceAuthString] (val x: Self) extends AnyVal {
    
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
    def setAuthString(value: String): Self = this.set("authString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthString: Self = this.set("authString", js.undefined)
  }
}
