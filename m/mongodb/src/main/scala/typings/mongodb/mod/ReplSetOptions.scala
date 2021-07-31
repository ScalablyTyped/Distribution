package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplSetOptions
  extends StObject
     with SSLOptions
     with HighAvailabilityOptions {
  
  var connectWithNoPrimary: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The max staleness to secondary reads (values under 10 seconds cannot be guaranteed);
    */
  var maxStalenessSeconds: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * The name of the replicaset to connect to.
    */
  var replicaSet: js.UndefOr[String] = js.undefined
  
  /**
    * Default: 15 ; Range of servers to pick when using NEAREST (lowest ping ms + the latency fence, ex: range of 1 to (1 + 15) ms)
    */
  var secondaryAcceptableLatencyMS: js.UndefOr[scala.Double] = js.undefined
  
  var socketOptions: js.UndefOr[SocketOptions] = js.undefined
}
object ReplSetOptions {
  
  @scala.inline
  def apply(): ReplSetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplSetOptions]
  }
  
  @scala.inline
  implicit class ReplSetOptionsMutableBuilder[Self <: ReplSetOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectWithNoPrimary(value: Boolean): Self = StObject.set(x, "connectWithNoPrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectWithNoPrimaryUndefined: Self = StObject.set(x, "connectWithNoPrimary", js.undefined)
    
    @scala.inline
    def setMaxStalenessSeconds(value: scala.Double): Self = StObject.set(x, "maxStalenessSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxStalenessSecondsUndefined: Self = StObject.set(x, "maxStalenessSeconds", js.undefined)
    
    @scala.inline
    def setReplicaSet(value: String): Self = StObject.set(x, "replicaSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicaSetUndefined: Self = StObject.set(x, "replicaSet", js.undefined)
    
    @scala.inline
    def setSecondaryAcceptableLatencyMS(value: scala.Double): Self = StObject.set(x, "secondaryAcceptableLatencyMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryAcceptableLatencyMSUndefined: Self = StObject.set(x, "secondaryAcceptableLatencyMS", js.undefined)
    
    @scala.inline
    def setSocketOptions(value: SocketOptions): Self = StObject.set(x, "socketOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocketOptionsUndefined: Self = StObject.set(x, "socketOptions", js.undefined)
  }
}
