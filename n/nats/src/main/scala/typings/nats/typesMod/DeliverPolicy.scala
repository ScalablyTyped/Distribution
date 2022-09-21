package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeliverPolicy extends StObject
@JSImport("nats/lib/nats-base-client/types", "DeliverPolicy")
@js.native
object DeliverPolicy extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DeliverPolicy & String] = js.native
  
  @js.native
  sealed trait All
    extends StObject
       with DeliverPolicy
  /* "all" */ val All: typings.nats.typesMod.DeliverPolicy.All & String = js.native
  
  @js.native
  sealed trait Last
    extends StObject
       with DeliverPolicy
  /* "last" */ val Last: typings.nats.typesMod.DeliverPolicy.Last & String = js.native
  
  @js.native
  sealed trait LastPerSubject
    extends StObject
       with DeliverPolicy
  /* "last_per_subject" */ val LastPerSubject: typings.nats.typesMod.DeliverPolicy.LastPerSubject & String = js.native
  
  @js.native
  sealed trait New
    extends StObject
       with DeliverPolicy
  /* "new" */ val New: typings.nats.typesMod.DeliverPolicy.New & String = js.native
  
  @js.native
  sealed trait StartSequence
    extends StObject
       with DeliverPolicy
  /* "by_start_sequence" */ val StartSequence: typings.nats.typesMod.DeliverPolicy.StartSequence & String = js.native
  
  @js.native
  sealed trait StartTime
    extends StObject
       with DeliverPolicy
  /* "by_start_time" */ val StartTime: typings.nats.typesMod.DeliverPolicy.StartTime & String = js.native
}
