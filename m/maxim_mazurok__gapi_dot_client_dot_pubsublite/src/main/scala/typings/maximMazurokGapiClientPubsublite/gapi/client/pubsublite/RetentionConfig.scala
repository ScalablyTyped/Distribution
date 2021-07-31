package typings.maximMazurokGapiClientPubsublite.gapi.client.pubsublite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetentionConfig extends StObject {
  
  /**
    * The provisioned storage, in bytes, per partition. If the number of bytes stored in any of the topic's partitions grows beyond this value, older messages will be dropped to make room
    * for newer ones, regardless of the value of `period`.
    */
  var perPartitionBytes: js.UndefOr[String] = js.undefined
  
  /** How long a published message is retained. If unset, messages will be retained as long as the bytes retained for each partition is below `per_partition_bytes`. */
  var period: js.UndefOr[String] = js.undefined
}
object RetentionConfig {
  
  @scala.inline
  def apply(): RetentionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetentionConfig]
  }
  
  @scala.inline
  implicit class RetentionConfigMutableBuilder[Self <: RetentionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPerPartitionBytes(value: String): Self = StObject.set(x, "perPartitionBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerPartitionBytesUndefined: Self = StObject.set(x, "perPartitionBytes", js.undefined)
    
    @scala.inline
    def setPeriod(value: String): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
  }
}
