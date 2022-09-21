package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsumerConfig
  extends StObject
     with ConsumerUpdateConfig {
  
  var ack_policy: AckPolicy
  
  var deliver_group: js.UndefOr[String] = js.undefined
  
  var deliver_policy: DeliverPolicy
  
  var durable_name: js.UndefOr[String] = js.undefined
  
  var filter_subject: js.UndefOr[String] = js.undefined
  
  var flow_control: js.UndefOr[Boolean] = js.undefined
  
  var idle_heartbeat: js.UndefOr[Nanos] = js.undefined
  
  var opt_start_seq: js.UndefOr[Double] = js.undefined
  
  var opt_start_time: js.UndefOr[String] = js.undefined
  
  var rate_limit_bps: js.UndefOr[Double] = js.undefined
  
  var replay_policy: ReplayPolicy
}
object ConsumerConfig {
  
  inline def apply(ack_policy: AckPolicy, deliver_policy: DeliverPolicy, replay_policy: ReplayPolicy): ConsumerConfig = {
    val __obj = js.Dynamic.literal(ack_policy = ack_policy.asInstanceOf[js.Any], deliver_policy = deliver_policy.asInstanceOf[js.Any], replay_policy = replay_policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumerConfig]
  }
  
  extension [Self <: ConsumerConfig](x: Self) {
    
    inline def setAck_policy(value: AckPolicy): Self = StObject.set(x, "ack_policy", value.asInstanceOf[js.Any])
    
    inline def setDeliver_group(value: String): Self = StObject.set(x, "deliver_group", value.asInstanceOf[js.Any])
    
    inline def setDeliver_groupUndefined: Self = StObject.set(x, "deliver_group", js.undefined)
    
    inline def setDeliver_policy(value: DeliverPolicy): Self = StObject.set(x, "deliver_policy", value.asInstanceOf[js.Any])
    
    inline def setDurable_name(value: String): Self = StObject.set(x, "durable_name", value.asInstanceOf[js.Any])
    
    inline def setDurable_nameUndefined: Self = StObject.set(x, "durable_name", js.undefined)
    
    inline def setFilter_subject(value: String): Self = StObject.set(x, "filter_subject", value.asInstanceOf[js.Any])
    
    inline def setFilter_subjectUndefined: Self = StObject.set(x, "filter_subject", js.undefined)
    
    inline def setFlow_control(value: Boolean): Self = StObject.set(x, "flow_control", value.asInstanceOf[js.Any])
    
    inline def setFlow_controlUndefined: Self = StObject.set(x, "flow_control", js.undefined)
    
    inline def setIdle_heartbeat(value: Nanos): Self = StObject.set(x, "idle_heartbeat", value.asInstanceOf[js.Any])
    
    inline def setIdle_heartbeatUndefined: Self = StObject.set(x, "idle_heartbeat", js.undefined)
    
    inline def setOpt_start_seq(value: Double): Self = StObject.set(x, "opt_start_seq", value.asInstanceOf[js.Any])
    
    inline def setOpt_start_seqUndefined: Self = StObject.set(x, "opt_start_seq", js.undefined)
    
    inline def setOpt_start_time(value: String): Self = StObject.set(x, "opt_start_time", value.asInstanceOf[js.Any])
    
    inline def setOpt_start_timeUndefined: Self = StObject.set(x, "opt_start_time", js.undefined)
    
    inline def setRate_limit_bps(value: Double): Self = StObject.set(x, "rate_limit_bps", value.asInstanceOf[js.Any])
    
    inline def setRate_limit_bpsUndefined: Self = StObject.set(x, "rate_limit_bps", js.undefined)
    
    inline def setReplay_policy(value: ReplayPolicy): Self = StObject.set(x, "replay_policy", value.asInstanceOf[js.Any])
  }
}
