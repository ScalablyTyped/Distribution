package typings.node.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncomingHttpHeaders
  extends typings.node.httpMod.IncomingHttpHeaders {
  
  @JSName(":authority")
  var Colonauthority: js.UndefOr[String] = js.native
  
  @JSName(":method")
  var Colonmethod: js.UndefOr[String] = js.native
  
  @JSName(":path")
  var Colonpath: js.UndefOr[String] = js.native
  
  @JSName(":scheme")
  var Colonscheme: js.UndefOr[String] = js.native
}
object IncomingHttpHeaders {
  
  @scala.inline
  def apply(): IncomingHttpHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncomingHttpHeaders]
  }
  
  @scala.inline
  implicit class IncomingHttpHeadersOps[Self <: IncomingHttpHeaders] (val x: Self) extends AnyVal {
    
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
    def setColonauthority(value: String): Self = this.set(":authority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColonauthority: Self = this.set(":authority", js.undefined)
    
    @scala.inline
    def setColonmethod(value: String): Self = this.set(":method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColonmethod: Self = this.set(":method", js.undefined)
    
    @scala.inline
    def setColonpath(value: String): Self = this.set(":path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColonpath: Self = this.set(":path", js.undefined)
    
    @scala.inline
    def setColonscheme(value: String): Self = this.set(":scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColonscheme: Self = this.set(":scheme", js.undefined)
  }
}
