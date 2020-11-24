package typings.node.dnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LookupOptions extends js.Object {
  
  var all: js.UndefOr[Boolean] = js.native
  
  var family: js.UndefOr[Double] = js.native
  
  var hints: js.UndefOr[Double] = js.native
  
  var verbatim: js.UndefOr[Boolean] = js.native
}
object LookupOptions {
  
  @scala.inline
  def apply(): LookupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LookupOptions]
  }
  
  @scala.inline
  implicit class LookupOptionsOps[Self <: LookupOptions] (val x: Self) extends AnyVal {
    
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
    def setAll(value: Boolean): Self = this.set("all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAll: Self = this.set("all", js.undefined)
    
    @scala.inline
    def setFamily(value: Double): Self = this.set("family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFamily: Self = this.set("family", js.undefined)
    
    @scala.inline
    def setHints(value: Double): Self = this.set("hints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHints: Self = this.set("hints", js.undefined)
    
    @scala.inline
    def setVerbatim(value: Boolean): Self = this.set("verbatim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerbatim: Self = this.set("verbatim", js.undefined)
  }
}
