package typings.node.dgramMod

import typings.node.NodeJS.ErrnoException
import typings.node.dnsMod.LookupOneOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SocketOptions extends js.Object {
  
  /**
    * @default false
    */
  var ipv6Only: js.UndefOr[Boolean] = js.native
  
  var lookup: js.UndefOr[
    js.Function3[
      /* hostname */ String, 
      /* options */ LookupOneOptions, 
      /* callback */ js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit], 
      Unit
    ]
  ] = js.native
  
  var recvBufferSize: js.UndefOr[Double] = js.native
  
  var reuseAddr: js.UndefOr[Boolean] = js.native
  
  var sendBufferSize: js.UndefOr[Double] = js.native
  
  var `type`: SocketType = js.native
}
object SocketOptions {
  
  @scala.inline
  def apply(`type`: SocketType): SocketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketOptions]
  }
  
  @scala.inline
  implicit class SocketOptionsOps[Self <: SocketOptions] (val x: Self) extends AnyVal {
    
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
    def setType(value: SocketType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6Only(value: Boolean): Self = this.set("ipv6Only", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpv6Only: Self = this.set("ipv6Only", js.undefined)
    
    @scala.inline
    def setLookup(
      value: (/* hostname */ String, /* options */ LookupOneOptions, /* callback */ js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]) => Unit
    ): Self = this.set("lookup", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteLookup: Self = this.set("lookup", js.undefined)
    
    @scala.inline
    def setRecvBufferSize(value: Double): Self = this.set("recvBufferSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecvBufferSize: Self = this.set("recvBufferSize", js.undefined)
    
    @scala.inline
    def setReuseAddr(value: Boolean): Self = this.set("reuseAddr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReuseAddr: Self = this.set("reuseAddr", js.undefined)
    
    @scala.inline
    def setSendBufferSize(value: Double): Self = this.set("sendBufferSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSendBufferSize: Self = this.set("sendBufferSize", js.undefined)
  }
}
