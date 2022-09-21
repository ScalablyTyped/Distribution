package typings.nats

import typings.nats.headersMod.MsgHdrs
import typings.nats.typesMod.DeliveryInfo
import typings.nats.typesMod.JsMsg
import typings.nats.typesMod.Msg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsmsgMod {
  
  @JSImport("nats/lib/nats-base-client/jsmsg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("nats/lib/nats-base-client/jsmsg", "ACK")
  @js.native
  val ACK: js.typedarray.Uint8Array = js.native
  
  @JSImport("nats/lib/nats-base-client/jsmsg", "JsMsgImpl")
  @js.native
  open class JsMsgImpl protected ()
    extends StObject
       with JsMsg {
    def this(msg: Msg) = this()
    
    @JSName("data")
    def data_MJsMsgImpl: js.typedarray.Uint8Array = js.native
    
    var di: js.UndefOr[DeliveryInfo] = js.native
    
    var didAck: Boolean = js.native
    
    def doAck(payload: js.typedarray.Uint8Array): Unit = js.native
    
    @JSName("headers")
    def headers_MJsMsgImpl: MsgHdrs = js.native
    
    @JSName("info")
    def info_MJsMsgImpl: DeliveryInfo = js.native
    
    def isWIP(p: js.typedarray.Uint8Array): Boolean = js.native
    
    var msg: Msg = js.native
    
    @JSName("redelivered")
    def redelivered_MJsMsgImpl: Boolean = js.native
    
    def reply: String = js.native
    
    @JSName("seq")
    def seq_MJsMsgImpl: Double = js.native
    
    @JSName("sid")
    def sid_MJsMsgImpl: Double = js.native
    
    @JSName("subject")
    def subject_MJsMsgImpl: String = js.native
  }
  
  inline def parseInfo(s: String): DeliveryInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("parseInfo")(s.asInstanceOf[js.Any]).asInstanceOf[DeliveryInfo]
  
  inline def toJsMsg(m: Msg): JsMsg = ^.asInstanceOf[js.Dynamic].applyDynamic("toJsMsg")(m.asInstanceOf[js.Any]).asInstanceOf[JsMsg]
}
