package typings.node.http2Mod

import typings.node.fsMod.Stats
import typings.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerStreamFileResponseOptions extends js.Object {
  
  var length: js.UndefOr[Double] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var statCheck: js.UndefOr[
    js.Function3[
      /* stats */ Stats, 
      /* headers */ OutgoingHttpHeaders, 
      /* statOptions */ StatOptions, 
      Unit | Boolean
    ]
  ] = js.native
  
  var waitForTrailers: js.UndefOr[Boolean] = js.native
}
object ServerStreamFileResponseOptions {
  
  @scala.inline
  def apply(): ServerStreamFileResponseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerStreamFileResponseOptions]
  }
  
  @scala.inline
  implicit class ServerStreamFileResponseOptionsOps[Self <: ServerStreamFileResponseOptions] (val x: Self) extends AnyVal {
    
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
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setStatCheck(
      value: (/* stats */ Stats, /* headers */ OutgoingHttpHeaders, /* statOptions */ StatOptions) => Unit | Boolean
    ): Self = this.set("statCheck", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteStatCheck: Self = this.set("statCheck", js.undefined)
    
    @scala.inline
    def setWaitForTrailers(value: Boolean): Self = this.set("waitForTrailers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitForTrailers: Self = this.set("waitForTrailers", js.undefined)
  }
}
