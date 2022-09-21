package typings.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait V1Beta1ProducerQuotaPolicy extends StObject {
  
  /** The cloud resource container at which the quota policy is created. The format is {container_type}/{container_number} */
  var container: js.UndefOr[String] = js.undefined
  
  /**
    * If this map is nonempty, then this policy applies only to specific values for dimensions defined in the limit unit. For example, an policy on a limit with the unit
    * 1/{project}/{region} could contain an entry with the key "region" and the value "us-east-1"; the policy is only applied to quota consumed in that region. This map has the following
    * restrictions: * Keys that are not defined in the limit's unit are not valid keys. Any string appearing in {brackets} in the unit (besides {project} or {user}) is a defined key. *
    * "project" is not a valid key; the project is already specified in the parent resource name. * "user" is not a valid key; the API does not support quota polcies that apply only to a
    * specific user. * If "region" appears as a key, its value must be a valid Cloud region. * If "zone" appears as a key, its value must be a valid Cloud zone. * If any valid key other
    * than "region" or "zone" appears in the map, then all valid keys other than "region" or "zone" must also appear in the map.
    */
  var dimensions: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientServiceconsumermanagement.maximMazurokGapiClientServiceconsumermanagementStrings.V1Beta1ProducerQuotaPolicy & TopLevel[Any]
  ] = js.undefined
  
  /** The name of the metric to which this policy applies. An example name would be: `compute.googleapis.com/cpus` */
  var metric: js.UndefOr[String] = js.undefined
  
  /**
    * The resource name of the producer policy. An example name would be:
    * `services/compute.googleapis.com/organizations/123/consumerQuotaMetrics/compute.googleapis.com%2Fcpus/limits/%2Fproject%2Fregion/producerQuotaPolicies/4a3f2c1d`
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** The quota policy value. Can be any nonnegative integer, or -1 (unlimited quota). */
  var policyValue: js.UndefOr[String] = js.undefined
  
  /**
    * The limit unit of the limit to which this policy applies. An example unit would be: `1/{project}/{region}` Note that `{project}` and `{region}` are not placeholders in this example;
    * the literal characters `{` and `}` occur in the string.
    */
  var unit: js.UndefOr[String] = js.undefined
}
object V1Beta1ProducerQuotaPolicy {
  
  inline def apply(): V1Beta1ProducerQuotaPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[V1Beta1ProducerQuotaPolicy]
  }
  
  extension [Self <: V1Beta1ProducerQuotaPolicy](x: Self) {
    
    inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setDimensions(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientServiceconsumermanagement.maximMazurokGapiClientServiceconsumermanagementStrings.V1Beta1ProducerQuotaPolicy & TopLevel[Any]
    ): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    inline def setMetric(value: String): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPolicyValue(value: String): Self = StObject.set(x, "policyValue", value.asInstanceOf[js.Any])
    
    inline def setPolicyValueUndefined: Self = StObject.set(x, "policyValue", js.undefined)
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
