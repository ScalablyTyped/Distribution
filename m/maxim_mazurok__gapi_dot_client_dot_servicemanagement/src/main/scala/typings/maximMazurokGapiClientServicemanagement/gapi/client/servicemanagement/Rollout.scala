package typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rollout extends StObject {
  
  /** Creation time of the rollout. Readonly. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** This field is deprecated and will be deleted. Please remove usage of this field. */
  var createdBy: js.UndefOr[String] = js.undefined
  
  /** The strategy associated with a rollout to delete a `ManagedService`. Readonly. */
  var deleteServiceStrategy: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Optional. Unique identifier of this Rollout. Must be no longer than 63 characters and only lower case letters, digits, '.', '_' and '-' are allowed. If not specified by client, the
    * server will generate one. The generated id will have the form of , where "date" is the create date in ISO 8601 format. "revision number" is a monotonically increasing positive
    * number that is reset every day for each service. An example of the generated rollout_id is '2016-02-16r1'
    */
  var rolloutId: js.UndefOr[String] = js.undefined
  
  /** The name of the service associated with this Rollout. */
  var serviceName: js.UndefOr[String] = js.undefined
  
  /** The status of this rollout. Readonly. In case of a failed rollout, the system will automatically rollback to the current Rollout version. Readonly. */
  var status: js.UndefOr[String] = js.undefined
  
  /** Google Service Control selects service configurations based on traffic percentage. */
  var trafficPercentStrategy: js.UndefOr[TrafficPercentStrategy] = js.undefined
}
object Rollout {
  
  inline def apply(): Rollout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rollout]
  }
  
  extension [Self <: Rollout](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setCreatedBy(value: String): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    inline def setDeleteServiceStrategy(value: js.Any): Self = StObject.set(x, "deleteServiceStrategy", value.asInstanceOf[js.Any])
    
    inline def setDeleteServiceStrategyUndefined: Self = StObject.set(x, "deleteServiceStrategy", js.undefined)
    
    inline def setRolloutId(value: String): Self = StObject.set(x, "rolloutId", value.asInstanceOf[js.Any])
    
    inline def setRolloutIdUndefined: Self = StObject.set(x, "rolloutId", js.undefined)
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTrafficPercentStrategy(value: TrafficPercentStrategy): Self = StObject.set(x, "trafficPercentStrategy", value.asInstanceOf[js.Any])
    
    inline def setTrafficPercentStrategyUndefined: Self = StObject.set(x, "trafficPercentStrategy", js.undefined)
  }
}
