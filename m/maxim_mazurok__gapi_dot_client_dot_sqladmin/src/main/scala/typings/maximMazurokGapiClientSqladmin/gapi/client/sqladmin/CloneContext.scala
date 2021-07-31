package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloneContext extends StObject {
  
  /**
    * Binary log coordinates, if specified, identify the position up to which the source instance is cloned. If not specified, the source instance is cloned up to the most recent binary
    * log coordinates.
    */
  var binLogCoordinates: js.UndefOr[BinLogCoordinates] = js.undefined
  
  /** Name of the Cloud SQL instance to be created as a clone. */
  var destinationInstanceName: js.UndefOr[String] = js.undefined
  
  /** This is always *sql#cloneContext*. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Reserved for future use. */
  var pitrTimestampMs: js.UndefOr[String] = js.undefined
  
  /** Reserved for future use. */
  var pointInTime: js.UndefOr[String] = js.undefined
}
object CloneContext {
  
  @scala.inline
  def apply(): CloneContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloneContext]
  }
  
  @scala.inline
  implicit class CloneContextMutableBuilder[Self <: CloneContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinLogCoordinates(value: BinLogCoordinates): Self = StObject.set(x, "binLogCoordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinLogCoordinatesUndefined: Self = StObject.set(x, "binLogCoordinates", js.undefined)
    
    @scala.inline
    def setDestinationInstanceName(value: String): Self = StObject.set(x, "destinationInstanceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationInstanceNameUndefined: Self = StObject.set(x, "destinationInstanceName", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPitrTimestampMs(value: String): Self = StObject.set(x, "pitrTimestampMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPitrTimestampMsUndefined: Self = StObject.set(x, "pitrTimestampMs", js.undefined)
    
    @scala.inline
    def setPointInTime(value: String): Self = StObject.set(x, "pointInTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointInTimeUndefined: Self = StObject.set(x, "pointInTime", js.undefined)
  }
}
