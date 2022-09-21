package typings.nats.natsBaseClientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nats/lib/src/nats-base-client", "DeliverPolicy")
@js.native
object DeliverPolicy extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.nats.typesMod.DeliverPolicy & String] = js.native
  
  /* "all" */ val All: typings.nats.typesMod.DeliverPolicy.All & String = js.native
  
  /* "last" */ val Last: typings.nats.typesMod.DeliverPolicy.Last & String = js.native
  
  /* "last_per_subject" */ val LastPerSubject: typings.nats.typesMod.DeliverPolicy.LastPerSubject & String = js.native
  
  /* "new" */ val New: typings.nats.typesMod.DeliverPolicy.New & String = js.native
  
  /* "by_start_sequence" */ val StartSequence: typings.nats.typesMod.DeliverPolicy.StartSequence & String = js.native
  
  /* "by_start_time" */ val StartTime: typings.nats.typesMod.DeliverPolicy.StartTime & String = js.native
}
