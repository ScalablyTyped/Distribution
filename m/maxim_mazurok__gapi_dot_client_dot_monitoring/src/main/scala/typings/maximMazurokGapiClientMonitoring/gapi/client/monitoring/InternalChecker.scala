package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InternalChecker extends StObject {
  
  /**
    * The checker's human-readable name. The display name should be unique within a Cloud Monitoring Metrics Scope in order to make it easier to identify; however, uniqueness is not
    * enforced.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** The GCP zone the Uptime check should egress from. Only respected for internal Uptime checks, where internal_network is specified. */
  var gcpZone: js.UndefOr[String] = js.undefined
  
  /**
    * A unique resource name for this InternalChecker. The format is: projects/[PROJECT_ID_OR_NUMBER]/internalCheckers/[INTERNAL_CHECKER_ID] [PROJECT_ID_OR_NUMBER] is the Cloud Monitoring
    * Metrics Scope project for the Uptime check config associated with the internal checker.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** The GCP VPC network (https://cloud.google.com/vpc/docs/vpc) where the internal resource lives (ex: "default"). */
  var network: js.UndefOr[String] = js.undefined
  
  /** The GCP project ID where the internal checker lives. Not necessary the same as the Metrics Scope project. */
  var peerProjectId: js.UndefOr[String] = js.undefined
  
  /** The current operational state of the internal checker. */
  var state: js.UndefOr[String] = js.undefined
}
object InternalChecker {
  
  inline def apply(): InternalChecker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InternalChecker]
  }
  
  extension [Self <: InternalChecker](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setGcpZone(value: String): Self = StObject.set(x, "gcpZone", value.asInstanceOf[js.Any])
    
    inline def setGcpZoneUndefined: Self = StObject.set(x, "gcpZone", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setPeerProjectId(value: String): Self = StObject.set(x, "peerProjectId", value.asInstanceOf[js.Any])
    
    inline def setPeerProjectIdUndefined: Self = StObject.set(x, "peerProjectId", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
