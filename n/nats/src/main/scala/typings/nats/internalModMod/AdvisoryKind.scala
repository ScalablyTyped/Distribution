package typings.nats.internalModMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nats/lib/nats-base-client/internal_mod", "AdvisoryKind")
@js.native
object AdvisoryKind extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.nats.typesMod.AdvisoryKind & String] = js.native
  
  /* "api_audit" */ val API: typings.nats.typesMod.AdvisoryKind.API & String = js.native
  
  /* "consumer_ack" */ val Ack: typings.nats.typesMod.AdvisoryKind.Ack & String = js.native
  
  /* "consumer_action" */ val ConsumerAction: typings.nats.typesMod.AdvisoryKind.ConsumerAction & String = js.native
  
  /* "consumer_leader_elected" */ val ConsumerLeaderElected: typings.nats.typesMod.AdvisoryKind.ConsumerLeaderElected & String = js.native
  
  /* "consumer_quorum_lost" */ val ConsumerQuorumLost: typings.nats.typesMod.AdvisoryKind.ConsumerQuorumLost & String = js.native
  
  /* "max_deliver" */ val MaxDeliver: typings.nats.typesMod.AdvisoryKind.MaxDeliver & String = js.native
  
  /* "restore_complete" */ val RestoreComplete: typings.nats.typesMod.AdvisoryKind.RestoreComplete & String = js.native
  
  /* "restore_create" */ val RestoreCreate: typings.nats.typesMod.AdvisoryKind.RestoreCreate & String = js.native
  
  /* "snapshot_complete" */ val SnapshotComplete: typings.nats.typesMod.AdvisoryKind.SnapshotComplete & String = js.native
  
  /* "snapshot_create" */ val SnapshotCreate: typings.nats.typesMod.AdvisoryKind.SnapshotCreate & String = js.native
  
  /* "stream_action" */ val StreamAction: typings.nats.typesMod.AdvisoryKind.StreamAction & String = js.native
  
  /* "stream_leader_elected" */ val StreamLeaderElected: typings.nats.typesMod.AdvisoryKind.StreamLeaderElected & String = js.native
  
  /* "stream_quorum_lost" */ val StreamQuorumLost: typings.nats.typesMod.AdvisoryKind.StreamQuorumLost & String = js.native
  
  /* "terminated" */ val Terminated: typings.nats.typesMod.AdvisoryKind.Terminated & String = js.native
}
