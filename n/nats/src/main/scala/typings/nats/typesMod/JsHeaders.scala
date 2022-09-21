package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JsHeaders extends StObject
@JSImport("nats/lib/nats-base-client/types", "JsHeaders")
@js.native
object JsHeaders extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[JsHeaders & String] = js.native
  
  @js.native
  sealed trait ConsumerStalledHdr
    extends StObject
       with JsHeaders
  /* "Nats-Consumer-Stalled" */ val ConsumerStalledHdr: typings.nats.typesMod.JsHeaders.ConsumerStalledHdr & String = js.native
  
  @js.native
  sealed trait LastConsumerSeqHdr
    extends StObject
       with JsHeaders
  /* "Nats-Last-Consumer" */ val LastConsumerSeqHdr: typings.nats.typesMod.JsHeaders.LastConsumerSeqHdr & String = js.native
  
  @js.native
  sealed trait LastStreamSeqHdr
    extends StObject
       with JsHeaders
  /* "Nats-Last-Stream" */ val LastStreamSeqHdr: typings.nats.typesMod.JsHeaders.LastStreamSeqHdr & String = js.native
  
  @js.native
  sealed trait MessageSizeHdr
    extends StObject
       with JsHeaders
  /* "Nats-Msg-Size" */ val MessageSizeHdr: typings.nats.typesMod.JsHeaders.MessageSizeHdr & String = js.native
  
  @js.native
  sealed trait RollupHdr
    extends StObject
       with JsHeaders
  /* "Nats-Rollup" */ val RollupHdr: typings.nats.typesMod.JsHeaders.RollupHdr & String = js.native
  
  @js.native
  sealed trait RollupValueAll
    extends StObject
       with JsHeaders
  /* "all" */ val RollupValueAll: typings.nats.typesMod.JsHeaders.RollupValueAll & String = js.native
  
  @js.native
  sealed trait RollupValueSubject
    extends StObject
       with JsHeaders
  /* "sub" */ val RollupValueSubject: typings.nats.typesMod.JsHeaders.RollupValueSubject & String = js.native
  
  @js.native
  sealed trait StreamSourceHdr
    extends StObject
       with JsHeaders
  /* "Nats-Stream-Source" */ val StreamSourceHdr: typings.nats.typesMod.JsHeaders.StreamSourceHdr & String = js.native
}
