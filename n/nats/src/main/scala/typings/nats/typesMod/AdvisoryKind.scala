package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AdvisoryKind extends StObject
@JSImport("nats/lib/nats-base-client/types", "AdvisoryKind")
@js.native
object AdvisoryKind extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AdvisoryKind & String] = js.native
  
  @js.native
  sealed trait API
    extends StObject
       with AdvisoryKind
  /* "api_audit" */ val API: typings.nats.typesMod.AdvisoryKind.API & String = js.native
  
  @js.native
  sealed trait Ack
    extends StObject
       with AdvisoryKind
  /* "consumer_ack" */ val Ack: typings.nats.typesMod.AdvisoryKind.Ack & String = js.native
  
  @js.native
  sealed trait ConsumerAction
    extends StObject
       with AdvisoryKind
  /* "consumer_action" */ val ConsumerAction: typings.nats.typesMod.AdvisoryKind.ConsumerAction & String = js.native
  
  @js.native
  sealed trait ConsumerLeaderElected
    extends StObject
       with AdvisoryKind
  /* "consumer_leader_elected" */ val ConsumerLeaderElected: typings.nats.typesMod.AdvisoryKind.ConsumerLeaderElected & String = js.native
  
  @js.native
  sealed trait ConsumerQuorumLost
    extends StObject
       with AdvisoryKind
  /* "consumer_quorum_lost" */ val ConsumerQuorumLost: typings.nats.typesMod.AdvisoryKind.ConsumerQuorumLost & String = js.native
  
  @js.native
  sealed trait MaxDeliver
    extends StObject
       with AdvisoryKind
  /* "max_deliver" */ val MaxDeliver: typings.nats.typesMod.AdvisoryKind.MaxDeliver & String = js.native
  
  @js.native
  sealed trait RestoreComplete
    extends StObject
       with AdvisoryKind
  /* "restore_complete" */ val RestoreComplete: typings.nats.typesMod.AdvisoryKind.RestoreComplete & String = js.native
  
  @js.native
  sealed trait RestoreCreate
    extends StObject
       with AdvisoryKind
  /* "restore_create" */ val RestoreCreate: typings.nats.typesMod.AdvisoryKind.RestoreCreate & String = js.native
  
  @js.native
  sealed trait SnapshotComplete
    extends StObject
       with AdvisoryKind
  /* "snapshot_complete" */ val SnapshotComplete: typings.nats.typesMod.AdvisoryKind.SnapshotComplete & String = js.native
  
  @js.native
  sealed trait SnapshotCreate
    extends StObject
       with AdvisoryKind
  /* "snapshot_create" */ val SnapshotCreate: typings.nats.typesMod.AdvisoryKind.SnapshotCreate & String = js.native
  
  @js.native
  sealed trait StreamAction
    extends StObject
       with AdvisoryKind
  /* "stream_action" */ val StreamAction: typings.nats.typesMod.AdvisoryKind.StreamAction & String = js.native
  
  @js.native
  sealed trait StreamLeaderElected
    extends StObject
       with AdvisoryKind
  /* "stream_leader_elected" */ val StreamLeaderElected: typings.nats.typesMod.AdvisoryKind.StreamLeaderElected & String = js.native
  
  @js.native
  sealed trait StreamQuorumLost
    extends StObject
       with AdvisoryKind
  /* "stream_quorum_lost" */ val StreamQuorumLost: typings.nats.typesMod.AdvisoryKind.StreamQuorumLost & String = js.native
  
  @js.native
  sealed trait Terminated
    extends StObject
       with AdvisoryKind
  /* "terminated" */ val Terminated: typings.nats.typesMod.AdvisoryKind.Terminated & String = js.native
}
