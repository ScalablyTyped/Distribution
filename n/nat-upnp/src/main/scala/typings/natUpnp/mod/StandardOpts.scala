package typings.natUpnp.mod

import typings.natUpnp.anon.Host
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StandardOpts extends js.Object {
  
  var `private`: js.UndefOr[Double | Null | Host] = js.native
  
  var protocol: js.UndefOr[String] = js.native
  
  var public: js.UndefOr[Double | Null | Host] = js.native
}
object StandardOpts {
  
  @scala.inline
  def apply(): StandardOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StandardOpts]
  }
  
  @scala.inline
  implicit class StandardOptsOps[Self <: StandardOpts] (val x: Self) extends AnyVal {
    
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
    def setPrivate(value: Double | Host): Self = this.set("private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivate: Self = this.set("private", js.undefined)
    
    @scala.inline
    def setPrivateNull: Self = this.set("private", null)
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setPublic(value: Double | Host): Self = this.set("public", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublic: Self = this.set("public", js.undefined)
    
    @scala.inline
    def setPublicNull: Self = this.set("public", null)
  }
}
