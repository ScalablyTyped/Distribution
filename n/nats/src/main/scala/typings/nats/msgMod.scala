package typings.nats

import typings.nats.anon.Headers
import typings.nats.errorMod.NatsError
import typings.nats.headersMod.MsgHdrs
import typings.nats.parserMod.MsgArg
import typings.nats.protocolMod.Publisher
import typings.nats.typesMod.Msg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object msgMod {
  
  @JSImport("nats/lib/nats-base-client/msg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("nats/lib/nats-base-client/msg", "MsgImpl")
  @js.native
  open class MsgImpl protected ()
    extends StObject
       with Msg {
    def this(msg: MsgArg, data: js.typedarray.Uint8Array, publisher: Publisher) = this()
    
    var _headers: js.UndefOr[MsgHdrs] = js.native
    
    var _msg: MsgArg = js.native
    
    var _rdata: js.typedarray.Uint8Array = js.native
    
    var _reply: String = js.native
    
    var _subject: String = js.native
    
    @JSName("data")
    def data_MMsgImpl: js.typedarray.Uint8Array = js.native
    
    @JSName("headers")
    def headers_MMsgImpl: js.UndefOr[MsgHdrs] = js.native
    
    var publisher: Publisher = js.native
    
    @JSName("reply")
    def reply_MMsgImpl: String = js.native
    
    def respond(data: js.typedarray.Uint8Array, opts: Headers): Boolean = js.native
    def respond(data: Unit, opts: Headers): Boolean = js.native
    
    @JSName("sid")
    def sid_MMsgImpl: Double = js.native
    
    @JSName("subject")
    def subject_MMsgImpl: String = js.native
  }
  
  inline def isRequestError(msg: Msg): NatsError | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("isRequestError")(msg.asInstanceOf[js.Any]).asInstanceOf[NatsError | Null]
}
