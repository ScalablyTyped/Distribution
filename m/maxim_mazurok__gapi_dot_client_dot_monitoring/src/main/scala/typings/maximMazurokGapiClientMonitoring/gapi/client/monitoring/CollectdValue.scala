package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectdValue extends StObject {
  
  /** The data source for the collectd value. For example, there are two data sources for network measurements: "rx" and "tx". */
  var dataSourceName: js.UndefOr[String] = js.undefined
  
  /** The type of measurement. */
  var dataSourceType: js.UndefOr[String] = js.undefined
  
  /** The measurement value. */
  var value: js.UndefOr[TypedValue] = js.undefined
}
object CollectdValue {
  
  inline def apply(): CollectdValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectdValue]
  }
  
  extension [Self <: CollectdValue](x: Self) {
    
    inline def setDataSourceName(value: String): Self = StObject.set(x, "dataSourceName", value.asInstanceOf[js.Any])
    
    inline def setDataSourceNameUndefined: Self = StObject.set(x, "dataSourceName", js.undefined)
    
    inline def setDataSourceType(value: String): Self = StObject.set(x, "dataSourceType", value.asInstanceOf[js.Any])
    
    inline def setDataSourceTypeUndefined: Self = StObject.set(x, "dataSourceType", js.undefined)
    
    inline def setValue(value: TypedValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
