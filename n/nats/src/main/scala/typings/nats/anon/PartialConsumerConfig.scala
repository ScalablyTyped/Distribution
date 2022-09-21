package typings.nats.anon

import typings.nats.typesMod.AckPolicy
import typings.nats.typesMod.DeliverPolicy
import typings.nats.typesMod.Nanos
import typings.nats.typesMod.ReplayPolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<nats.nats/lib/nats-base-client/types.ConsumerConfig> */
trait PartialConsumerConfig extends StObject {
  
  var ack_policy: js.UndefOr[AckPolicy] = js.undefined
  
  var ack_wait: js.UndefOr[Nanos] = js.undefined
  
  var backoff: js.UndefOr[js.Array[Nanos]] = js.undefined
  
  var deliver_group: js.UndefOr[String] = js.undefined
  
  var deliver_policy: js.UndefOr[DeliverPolicy] = js.undefined
  
  var deliver_subject: js.UndefOr[String] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var durable_name: js.UndefOr[String] = js.undefined
  
  var filter_subject: js.UndefOr[String] = js.undefined
  
  var flow_control: js.UndefOr[Boolean] = js.undefined
  
  var headers_only: js.UndefOr[Boolean] = js.undefined
  
  var idle_heartbeat: js.UndefOr[Nanos] = js.undefined
  
  var inactive_threshold: js.UndefOr[Nanos] = js.undefined
  
  var max_ack_pending: js.UndefOr[Double] = js.undefined
  
  var max_batch: js.UndefOr[Double] = js.undefined
  
  var max_deliver: js.UndefOr[Double] = js.undefined
  
  var max_expires: js.UndefOr[Nanos] = js.undefined
  
  var max_waiting: js.UndefOr[Double] = js.undefined
  
  var opt_start_seq: js.UndefOr[Double] = js.undefined
  
  var opt_start_time: js.UndefOr[String] = js.undefined
  
  var rate_limit_bps: js.UndefOr[Double] = js.undefined
  
  var replay_policy: js.UndefOr[ReplayPolicy] = js.undefined
  
  var sample_freq: js.UndefOr[String] = js.undefined
}
object PartialConsumerConfig {
  
  inline def apply(): PartialConsumerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialConsumerConfig]
  }
  
  extension [Self <: PartialConsumerConfig](x: Self) {
    
    inline def setAck_policy(value: AckPolicy): Self = StObject.set(x, "ack_policy", value.asInstanceOf[js.Any])
    
    inline def setAck_policyUndefined: Self = StObject.set(x, "ack_policy", js.undefined)
    
    inline def setAck_wait(value: Nanos): Self = StObject.set(x, "ack_wait", value.asInstanceOf[js.Any])
    
    inline def setAck_waitUndefined: Self = StObject.set(x, "ack_wait", js.undefined)
    
    inline def setBackoff(value: js.Array[Nanos]): Self = StObject.set(x, "backoff", value.asInstanceOf[js.Any])
    
    inline def setBackoffUndefined: Self = StObject.set(x, "backoff", js.undefined)
    
    inline def setBackoffVarargs(value: Nanos*): Self = StObject.set(x, "backoff", js.Array(value*))
    
    inline def setDeliver_group(value: String): Self = StObject.set(x, "deliver_group", value.asInstanceOf[js.Any])
    
    inline def setDeliver_groupUndefined: Self = StObject.set(x, "deliver_group", js.undefined)
    
    inline def setDeliver_policy(value: DeliverPolicy): Self = StObject.set(x, "deliver_policy", value.asInstanceOf[js.Any])
    
    inline def setDeliver_policyUndefined: Self = StObject.set(x, "deliver_policy", js.undefined)
    
    inline def setDeliver_subject(value: String): Self = StObject.set(x, "deliver_subject", value.asInstanceOf[js.Any])
    
    inline def setDeliver_subjectUndefined: Self = StObject.set(x, "deliver_subject", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDurable_name(value: String): Self = StObject.set(x, "durable_name", value.asInstanceOf[js.Any])
    
    inline def setDurable_nameUndefined: Self = StObject.set(x, "durable_name", js.undefined)
    
    inline def setFilter_subject(value: String): Self = StObject.set(x, "filter_subject", value.asInstanceOf[js.Any])
    
    inline def setFilter_subjectUndefined: Self = StObject.set(x, "filter_subject", js.undefined)
    
    inline def setFlow_control(value: Boolean): Self = StObject.set(x, "flow_control", value.asInstanceOf[js.Any])
    
    inline def setFlow_controlUndefined: Self = StObject.set(x, "flow_control", js.undefined)
    
    inline def setHeaders_only(value: Boolean): Self = StObject.set(x, "headers_only", value.asInstanceOf[js.Any])
    
    inline def setHeaders_onlyUndefined: Self = StObject.set(x, "headers_only", js.undefined)
    
    inline def setIdle_heartbeat(value: Nanos): Self = StObject.set(x, "idle_heartbeat", value.asInstanceOf[js.Any])
    
    inline def setIdle_heartbeatUndefined: Self = StObject.set(x, "idle_heartbeat", js.undefined)
    
    inline def setInactive_threshold(value: Nanos): Self = StObject.set(x, "inactive_threshold", value.asInstanceOf[js.Any])
    
    inline def setInactive_thresholdUndefined: Self = StObject.set(x, "inactive_threshold", js.undefined)
    
    inline def setMax_ack_pending(value: Double): Self = StObject.set(x, "max_ack_pending", value.asInstanceOf[js.Any])
    
    inline def setMax_ack_pendingUndefined: Self = StObject.set(x, "max_ack_pending", js.undefined)
    
    inline def setMax_batch(value: Double): Self = StObject.set(x, "max_batch", value.asInstanceOf[js.Any])
    
    inline def setMax_batchUndefined: Self = StObject.set(x, "max_batch", js.undefined)
    
    inline def setMax_deliver(value: Double): Self = StObject.set(x, "max_deliver", value.asInstanceOf[js.Any])
    
    inline def setMax_deliverUndefined: Self = StObject.set(x, "max_deliver", js.undefined)
    
    inline def setMax_expires(value: Nanos): Self = StObject.set(x, "max_expires", value.asInstanceOf[js.Any])
    
    inline def setMax_expiresUndefined: Self = StObject.set(x, "max_expires", js.undefined)
    
    inline def setMax_waiting(value: Double): Self = StObject.set(x, "max_waiting", value.asInstanceOf[js.Any])
    
    inline def setMax_waitingUndefined: Self = StObject.set(x, "max_waiting", js.undefined)
    
    inline def setOpt_start_seq(value: Double): Self = StObject.set(x, "opt_start_seq", value.asInstanceOf[js.Any])
    
    inline def setOpt_start_seqUndefined: Self = StObject.set(x, "opt_start_seq", js.undefined)
    
    inline def setOpt_start_time(value: String): Self = StObject.set(x, "opt_start_time", value.asInstanceOf[js.Any])
    
    inline def setOpt_start_timeUndefined: Self = StObject.set(x, "opt_start_time", js.undefined)
    
    inline def setRate_limit_bps(value: Double): Self = StObject.set(x, "rate_limit_bps", value.asInstanceOf[js.Any])
    
    inline def setRate_limit_bpsUndefined: Self = StObject.set(x, "rate_limit_bps", js.undefined)
    
    inline def setReplay_policy(value: ReplayPolicy): Self = StObject.set(x, "replay_policy", value.asInstanceOf[js.Any])
    
    inline def setReplay_policyUndefined: Self = StObject.set(x, "replay_policy", js.undefined)
    
    inline def setSample_freq(value: String): Self = StObject.set(x, "sample_freq", value.asInstanceOf[js.Any])
    
    inline def setSample_freqUndefined: Self = StObject.set(x, "sample_freq", js.undefined)
  }
}
