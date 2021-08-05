package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DemoteMasterContext extends StObject {
  
  /** This is always *sql#demoteMasterContext*. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The name of the instance which will act as on-premises primary instance in the replication setup. */
  var masterInstanceName: js.UndefOr[String] = js.undefined
  
  /** Configuration specific to read-replicas replicating from the on-premises primary instance. */
  var replicaConfiguration: js.UndefOr[DemoteMasterConfiguration] = js.undefined
  
  /**
    * Verify GTID consistency for demote operation. Default value: *True*. Second Generation instances only. Setting this flag to false enables you to bypass GTID consistency check
    * between on-premises primary instance and Cloud SQL instance during the demotion operation but also exposes you to the risk of future replication failures. Change the value only if
    * you know the reason for the GTID divergence and are confident that doing so will not cause any replication issues.
    */
  var verifyGtidConsistency: js.UndefOr[Boolean] = js.undefined
}
object DemoteMasterContext {
  
  inline def apply(): DemoteMasterContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DemoteMasterContext]
  }
  
  extension [Self <: DemoteMasterContext](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMasterInstanceName(value: String): Self = StObject.set(x, "masterInstanceName", value.asInstanceOf[js.Any])
    
    inline def setMasterInstanceNameUndefined: Self = StObject.set(x, "masterInstanceName", js.undefined)
    
    inline def setReplicaConfiguration(value: DemoteMasterConfiguration): Self = StObject.set(x, "replicaConfiguration", value.asInstanceOf[js.Any])
    
    inline def setReplicaConfigurationUndefined: Self = StObject.set(x, "replicaConfiguration", js.undefined)
    
    inline def setVerifyGtidConsistency(value: Boolean): Self = StObject.set(x, "verifyGtidConsistency", value.asInstanceOf[js.Any])
    
    inline def setVerifyGtidConsistencyUndefined: Self = StObject.set(x, "verifyGtidConsistency", js.undefined)
  }
}
