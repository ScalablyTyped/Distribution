package typings.maximMazurokGapiClientRedis.gapi.client.redis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpgradeInstanceRequest extends js.Object {
  
  /** Required. Specifies the target version of Redis software to upgrade to. */
  var redisVersion: js.UndefOr[String] = js.native
}
object UpgradeInstanceRequest {
  
  @scala.inline
  def apply(): UpgradeInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpgradeInstanceRequest]
  }
  
  @scala.inline
  implicit class UpgradeInstanceRequestOps[Self <: UpgradeInstanceRequest] (val x: Self) extends AnyVal {
    
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
    def setRedisVersion(value: String): Self = this.set("redisVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedisVersion: Self = this.set("redisVersion", js.undefined)
  }
}
