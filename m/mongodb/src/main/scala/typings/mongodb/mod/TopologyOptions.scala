package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof mongodb.mongodb.ConnectionPoolOptions, 'id' | 'generation' | 'hostAddress'> ]: mongodb.mongodb.ConnectionPoolOptions[P]} */ trait TopologyOptions
  extends StObject
     with BSONSerializeOptions
     with MonitorOptions {
  
  /* Excluded from this release type: srvPoller */
  /** Indicates that a client should directly connect to a node without attempting to discover its topology type */
  var directConnection: Boolean
  
  var hosts: js.Array[HostAddress]
  
  var loadBalanced: Boolean
  
  var metadata: ClientMetadata
  
  /** The name of the replica set to connect to */
  var replicaSet: js.UndefOr[String] = js.undefined
  
  var retryReads: Boolean
  
  var retryWrites: Boolean
  
  /** MongoDB server API version */
  var serverApi: js.UndefOr[ServerApi] = js.undefined
  
  /** How long to block for server selection before throwing an error */
  var serverSelectionTimeoutMS: scala.Double
  
  var srvHost: js.UndefOr[String] = js.undefined
  
  var srvMaxHosts: scala.Double
  
  var srvServiceName: String
}
object TopologyOptions {
  
  inline def apply(
    connectTimeoutMS: scala.Double,
    directConnection: Boolean,
    heartbeatFrequencyMS: scala.Double,
    hosts: js.Array[HostAddress],
    loadBalanced: Boolean,
    metadata: ClientMetadata,
    minHeartbeatFrequencyMS: scala.Double,
    retryReads: Boolean,
    retryWrites: Boolean,
    serverSelectionTimeoutMS: scala.Double,
    srvMaxHosts: scala.Double,
    srvServiceName: String
  ): TopologyOptions = {
    val __obj = js.Dynamic.literal(connectTimeoutMS = connectTimeoutMS.asInstanceOf[js.Any], directConnection = directConnection.asInstanceOf[js.Any], heartbeatFrequencyMS = heartbeatFrequencyMS.asInstanceOf[js.Any], hosts = hosts.asInstanceOf[js.Any], loadBalanced = loadBalanced.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], minHeartbeatFrequencyMS = minHeartbeatFrequencyMS.asInstanceOf[js.Any], retryReads = retryReads.asInstanceOf[js.Any], retryWrites = retryWrites.asInstanceOf[js.Any], serverSelectionTimeoutMS = serverSelectionTimeoutMS.asInstanceOf[js.Any], srvMaxHosts = srvMaxHosts.asInstanceOf[js.Any], srvServiceName = srvServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopologyOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TopologyOptions] (val x: Self) extends AnyVal {
    
    inline def setDirectConnection(value: Boolean): Self = StObject.set(x, "directConnection", value.asInstanceOf[js.Any])
    
    inline def setHosts(value: js.Array[HostAddress]): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
    
    inline def setHostsVarargs(value: HostAddress*): Self = StObject.set(x, "hosts", js.Array(value*))
    
    inline def setLoadBalanced(value: Boolean): Self = StObject.set(x, "loadBalanced", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: ClientMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setReplicaSet(value: String): Self = StObject.set(x, "replicaSet", value.asInstanceOf[js.Any])
    
    inline def setReplicaSetUndefined: Self = StObject.set(x, "replicaSet", js.undefined)
    
    inline def setRetryReads(value: Boolean): Self = StObject.set(x, "retryReads", value.asInstanceOf[js.Any])
    
    inline def setRetryWrites(value: Boolean): Self = StObject.set(x, "retryWrites", value.asInstanceOf[js.Any])
    
    inline def setServerApi(value: ServerApi): Self = StObject.set(x, "serverApi", value.asInstanceOf[js.Any])
    
    inline def setServerApiUndefined: Self = StObject.set(x, "serverApi", js.undefined)
    
    inline def setServerSelectionTimeoutMS(value: scala.Double): Self = StObject.set(x, "serverSelectionTimeoutMS", value.asInstanceOf[js.Any])
    
    inline def setSrvHost(value: String): Self = StObject.set(x, "srvHost", value.asInstanceOf[js.Any])
    
    inline def setSrvHostUndefined: Self = StObject.set(x, "srvHost", js.undefined)
    
    inline def setSrvMaxHosts(value: scala.Double): Self = StObject.set(x, "srvMaxHosts", value.asInstanceOf[js.Any])
    
    inline def setSrvServiceName(value: String): Self = StObject.set(x, "srvServiceName", value.asInstanceOf[js.Any])
  }
}
