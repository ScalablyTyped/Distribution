package typings.node.netMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListenOptions extends js.Object {
  
  var backlog: js.UndefOr[Double] = js.native
  
  var exclusive: js.UndefOr[Boolean] = js.native
  
  var host: js.UndefOr[String] = js.native
  
  /**
    * @default false
    */
  var ipv6Only: js.UndefOr[Boolean] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var port: js.UndefOr[Double] = js.native
  
  var readableAll: js.UndefOr[Boolean] = js.native
  
  var writableAll: js.UndefOr[Boolean] = js.native
}
object ListenOptions {
  
  @scala.inline
  def apply(): ListenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListenOptions]
  }
  
  @scala.inline
  implicit class ListenOptionsOps[Self <: ListenOptions] (val x: Self) extends AnyVal {
    
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
    def setBacklog(value: Double): Self = this.set("backlog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBacklog: Self = this.set("backlog", js.undefined)
    
    @scala.inline
    def setExclusive(value: Boolean): Self = this.set("exclusive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclusive: Self = this.set("exclusive", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setIpv6Only(value: Boolean): Self = this.set("ipv6Only", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpv6Only: Self = this.set("ipv6Only", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setReadableAll(value: Boolean): Self = this.set("readableAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadableAll: Self = this.set("readableAll", js.undefined)
    
    @scala.inline
    def setWritableAll(value: Boolean): Self = this.set("writableAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWritableAll: Self = this.set("writableAll", js.undefined)
  }
}
