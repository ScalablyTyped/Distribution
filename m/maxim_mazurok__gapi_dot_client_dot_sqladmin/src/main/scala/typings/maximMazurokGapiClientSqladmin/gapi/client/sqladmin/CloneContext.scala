package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloneContext extends StObject {
  
  /**
    * The name of the allocated ip range for the private ip CloudSQL instance. For example: "google-managed-services-default". If set, the cloned instance ip will be created in the
    * allocated range. The range name must comply with [RFC 1035](https://tools.ietf.org/html/rfc1035). Specifically, the name must be 1-63 characters long and match the regular
    * expression [a-z]([-a-z0-9]*[a-z0-9])?. Reserved for future use.
    */
  var allocatedIpRange: js.UndefOr[String] = js.undefined
  
  /**
    * Binary log coordinates, if specified, identify the position up to which the source instance is cloned. If not specified, the source instance is cloned up to the most recent binary
    * log coordinates.
    */
  var binLogCoordinates: js.UndefOr[BinLogCoordinates] = js.undefined
  
  /** Name of the Cloud SQL instance to be created as a clone. */
  var destinationInstanceName: js.UndefOr[String] = js.undefined
  
  /** This is always `sql#cloneContext`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Reserved for future use. */
  var pitrTimestampMs: js.UndefOr[String] = js.undefined
  
  /** Timestamp, if specified, identifies the time to which the source instance is cloned. */
  var pointInTime: js.UndefOr[String] = js.undefined
}
object CloneContext {
  
  inline def apply(): CloneContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloneContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloneContext] (val x: Self) extends AnyVal {
    
    inline def setAllocatedIpRange(value: String): Self = StObject.set(x, "allocatedIpRange", value.asInstanceOf[js.Any])
    
    inline def setAllocatedIpRangeUndefined: Self = StObject.set(x, "allocatedIpRange", js.undefined)
    
    inline def setBinLogCoordinates(value: BinLogCoordinates): Self = StObject.set(x, "binLogCoordinates", value.asInstanceOf[js.Any])
    
    inline def setBinLogCoordinatesUndefined: Self = StObject.set(x, "binLogCoordinates", js.undefined)
    
    inline def setDestinationInstanceName(value: String): Self = StObject.set(x, "destinationInstanceName", value.asInstanceOf[js.Any])
    
    inline def setDestinationInstanceNameUndefined: Self = StObject.set(x, "destinationInstanceName", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPitrTimestampMs(value: String): Self = StObject.set(x, "pitrTimestampMs", value.asInstanceOf[js.Any])
    
    inline def setPitrTimestampMsUndefined: Self = StObject.set(x, "pitrTimestampMs", js.undefined)
    
    inline def setPointInTime(value: String): Self = StObject.set(x, "pointInTime", value.asInstanceOf[js.Any])
    
    inline def setPointInTimeUndefined: Self = StObject.set(x, "pointInTime", js.undefined)
  }
}
