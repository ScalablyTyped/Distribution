package typings.nanomsg

import typings.nanomsg.nanomsgStrings.binary
import typings.nanomsg.nanomsgStrings.text
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nanomsg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  inline def socket(`type`: String): Socket_ = ^.asInstanceOf[js.Dynamic].applyDynamic("socket")(`type`.asInstanceOf[js.Any]).asInstanceOf[Socket_]
  inline def socket(`type`: String, opts: Options): Socket_ = (^.asInstanceOf[js.Dynamic].applyDynamic("socket")(`type`.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Socket_]
  
  trait Options extends StObject {
    
    var chan: js.UndefOr[js.Array[String]] = js.undefined
    
    var ipv6: js.UndefOr[Boolean] = js.undefined
    
    var linger: js.UndefOr[Double] = js.undefined
    
    var maxreconn: js.UndefOr[Double] = js.undefined
    
    var raw: js.UndefOr[Boolean] = js.undefined
    
    var rcvbuf: js.UndefOr[Double] = js.undefined
    
    var rcvmaxsize: js.UndefOr[Double] = js.undefined
    
    var rcvprio: js.UndefOr[Double] = js.undefined
    
    var rcvtimeo: js.UndefOr[Double] = js.undefined
    
    var reconn: js.UndefOr[Double] = js.undefined
    
    var sndbuf: js.UndefOr[Double] = js.undefined
    
    var sndprio: js.UndefOr[Double] = js.undefined
    
    var sndtimeo: js.UndefOr[Double] = js.undefined
    
    var tcpnodelay: js.UndefOr[Boolean] = js.undefined
    
    var wsopt: js.UndefOr[text | binary] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setChan(value: js.Array[String]): Self = StObject.set(x, "chan", value.asInstanceOf[js.Any])
      
      inline def setChanUndefined: Self = StObject.set(x, "chan", js.undefined)
      
      inline def setChanVarargs(value: String*): Self = StObject.set(x, "chan", js.Array(value :_*))
      
      inline def setIpv6(value: Boolean): Self = StObject.set(x, "ipv6", value.asInstanceOf[js.Any])
      
      inline def setIpv6Undefined: Self = StObject.set(x, "ipv6", js.undefined)
      
      inline def setLinger(value: Double): Self = StObject.set(x, "linger", value.asInstanceOf[js.Any])
      
      inline def setLingerUndefined: Self = StObject.set(x, "linger", js.undefined)
      
      inline def setMaxreconn(value: Double): Self = StObject.set(x, "maxreconn", value.asInstanceOf[js.Any])
      
      inline def setMaxreconnUndefined: Self = StObject.set(x, "maxreconn", js.undefined)
      
      inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      inline def setRcvbuf(value: Double): Self = StObject.set(x, "rcvbuf", value.asInstanceOf[js.Any])
      
      inline def setRcvbufUndefined: Self = StObject.set(x, "rcvbuf", js.undefined)
      
      inline def setRcvmaxsize(value: Double): Self = StObject.set(x, "rcvmaxsize", value.asInstanceOf[js.Any])
      
      inline def setRcvmaxsizeUndefined: Self = StObject.set(x, "rcvmaxsize", js.undefined)
      
      inline def setRcvprio(value: Double): Self = StObject.set(x, "rcvprio", value.asInstanceOf[js.Any])
      
      inline def setRcvprioUndefined: Self = StObject.set(x, "rcvprio", js.undefined)
      
      inline def setRcvtimeo(value: Double): Self = StObject.set(x, "rcvtimeo", value.asInstanceOf[js.Any])
      
      inline def setRcvtimeoUndefined: Self = StObject.set(x, "rcvtimeo", js.undefined)
      
      inline def setReconn(value: Double): Self = StObject.set(x, "reconn", value.asInstanceOf[js.Any])
      
      inline def setReconnUndefined: Self = StObject.set(x, "reconn", js.undefined)
      
      inline def setSndbuf(value: Double): Self = StObject.set(x, "sndbuf", value.asInstanceOf[js.Any])
      
      inline def setSndbufUndefined: Self = StObject.set(x, "sndbuf", js.undefined)
      
      inline def setSndprio(value: Double): Self = StObject.set(x, "sndprio", value.asInstanceOf[js.Any])
      
      inline def setSndprioUndefined: Self = StObject.set(x, "sndprio", js.undefined)
      
      inline def setSndtimeo(value: Double): Self = StObject.set(x, "sndtimeo", value.asInstanceOf[js.Any])
      
      inline def setSndtimeoUndefined: Self = StObject.set(x, "sndtimeo", js.undefined)
      
      inline def setTcpnodelay(value: Boolean): Self = StObject.set(x, "tcpnodelay", value.asInstanceOf[js.Any])
      
      inline def setTcpnodelayUndefined: Self = StObject.set(x, "tcpnodelay", js.undefined)
      
      inline def setWsopt(value: text | binary): Self = StObject.set(x, "wsopt", value.asInstanceOf[js.Any])
      
      inline def setWsoptUndefined: Self = StObject.set(x, "wsopt", js.undefined)
    }
  }
}
