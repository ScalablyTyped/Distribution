package typings.nats.natsBaseClientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nats/lib/src/nats-base-client", "JsHeaders")
@js.native
object JsHeaders extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.nats.typesMod.JsHeaders & String] = js.native
  
  /* "Nats-Consumer-Stalled" */ val ConsumerStalledHdr: typings.nats.typesMod.JsHeaders.ConsumerStalledHdr & String = js.native
  
  /* "Nats-Last-Consumer" */ val LastConsumerSeqHdr: typings.nats.typesMod.JsHeaders.LastConsumerSeqHdr & String = js.native
  
  /* "Nats-Last-Stream" */ val LastStreamSeqHdr: typings.nats.typesMod.JsHeaders.LastStreamSeqHdr & String = js.native
  
  /* "Nats-Msg-Size" */ val MessageSizeHdr: typings.nats.typesMod.JsHeaders.MessageSizeHdr & String = js.native
  
  /* "Nats-Rollup" */ val RollupHdr: typings.nats.typesMod.JsHeaders.RollupHdr & String = js.native
  
  /* "all" */ val RollupValueAll: typings.nats.typesMod.JsHeaders.RollupValueAll & String = js.native
  
  /* "sub" */ val RollupValueSubject: typings.nats.typesMod.JsHeaders.RollupValueSubject & String = js.native
  
  /* "Nats-Stream-Source" */ val StreamSourceHdr: typings.nats.typesMod.JsHeaders.StreamSourceHdr & String = js.native
}
