package typings.nanomsg

import typings.nanomsg.nanomsgStrings.binary
import typings.nanomsg.nanomsgStrings.text
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nanomsg", "Socket")
  @js.native
  class Socket_ protected () extends StObject {
    def this(`type`: String, opts: Options) = this()
    
    def bind(addr: String): Unit = js.native
    
    def close(): Unit = js.native
    
    def connect(addr: String): Unit = js.native
    
    def on(event: String, cb: js.Function1[/* data */ Buffer, Unit]): Unit = js.native
    
    def send(buf: String): Double = js.native
    def send(buf: Buffer): Double = js.native
    
    def shutdown(addr: String): Unit = js.native
  }
  
  @JSImport("nanomsg", "socket")
  @js.native
  def socket(`type`: String): Socket_ = js.native
  @JSImport("nanomsg", "socket")
  @js.native
  def socket(`type`: String, opts: Options): Socket_ = js.native
  
  @js.native
  trait Options extends StObject {
    
    var chan: js.UndefOr[js.Array[String]] = js.native
    
    var ipv6: js.UndefOr[Boolean] = js.native
    
    var linger: js.UndefOr[Double] = js.native
    
    var maxreconn: js.UndefOr[Double] = js.native
    
    var raw: js.UndefOr[Boolean] = js.native
    
    var rcvbuf: js.UndefOr[Double] = js.native
    
    var rcvmaxsize: js.UndefOr[Double] = js.native
    
    var rcvprio: js.UndefOr[Double] = js.native
    
    var rcvtimeo: js.UndefOr[Double] = js.native
    
    var reconn: js.UndefOr[Double] = js.native
    
    var sndbuf: js.UndefOr[Double] = js.native
    
    var sndprio: js.UndefOr[Double] = js.native
    
    var sndtimeo: js.UndefOr[Double] = js.native
    
    var tcpnodelay: js.UndefOr[Boolean] = js.native
    
    var wsopt: js.UndefOr[text | binary] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChan(value: js.Array[String]): Self = StObject.set(x, "chan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChanUndefined: Self = StObject.set(x, "chan", js.undefined)
      
      @scala.inline
      def setChanVarargs(value: String*): Self = StObject.set(x, "chan", js.Array(value :_*))
      
      @scala.inline
      def setIpv6(value: Boolean): Self = StObject.set(x, "ipv6", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpv6Undefined: Self = StObject.set(x, "ipv6", js.undefined)
      
      @scala.inline
      def setLinger(value: Double): Self = StObject.set(x, "linger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLingerUndefined: Self = StObject.set(x, "linger", js.undefined)
      
      @scala.inline
      def setMaxreconn(value: Double): Self = StObject.set(x, "maxreconn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxreconnUndefined: Self = StObject.set(x, "maxreconn", js.undefined)
      
      @scala.inline
      def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      @scala.inline
      def setRcvbuf(value: Double): Self = StObject.set(x, "rcvbuf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRcvbufUndefined: Self = StObject.set(x, "rcvbuf", js.undefined)
      
      @scala.inline
      def setRcvmaxsize(value: Double): Self = StObject.set(x, "rcvmaxsize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRcvmaxsizeUndefined: Self = StObject.set(x, "rcvmaxsize", js.undefined)
      
      @scala.inline
      def setRcvprio(value: Double): Self = StObject.set(x, "rcvprio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRcvprioUndefined: Self = StObject.set(x, "rcvprio", js.undefined)
      
      @scala.inline
      def setRcvtimeo(value: Double): Self = StObject.set(x, "rcvtimeo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRcvtimeoUndefined: Self = StObject.set(x, "rcvtimeo", js.undefined)
      
      @scala.inline
      def setReconn(value: Double): Self = StObject.set(x, "reconn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReconnUndefined: Self = StObject.set(x, "reconn", js.undefined)
      
      @scala.inline
      def setSndbuf(value: Double): Self = StObject.set(x, "sndbuf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSndbufUndefined: Self = StObject.set(x, "sndbuf", js.undefined)
      
      @scala.inline
      def setSndprio(value: Double): Self = StObject.set(x, "sndprio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSndprioUndefined: Self = StObject.set(x, "sndprio", js.undefined)
      
      @scala.inline
      def setSndtimeo(value: Double): Self = StObject.set(x, "sndtimeo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSndtimeoUndefined: Self = StObject.set(x, "sndtimeo", js.undefined)
      
      @scala.inline
      def setTcpnodelay(value: Boolean): Self = StObject.set(x, "tcpnodelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTcpnodelayUndefined: Self = StObject.set(x, "tcpnodelay", js.undefined)
      
      @scala.inline
      def setWsopt(value: text | binary): Self = StObject.set(x, "wsopt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWsoptUndefined: Self = StObject.set(x, "wsopt", js.undefined)
    }
  }
}
