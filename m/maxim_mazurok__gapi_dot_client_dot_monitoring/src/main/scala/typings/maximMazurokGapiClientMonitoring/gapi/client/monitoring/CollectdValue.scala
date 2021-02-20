package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectdValue extends StObject {
  
  /** The data source for the collectd value. For example, there are two data sources for network measurements: "rx" and "tx". */
  var dataSourceName: js.UndefOr[String] = js.native
  
  /** The type of measurement. */
  var dataSourceType: js.UndefOr[String] = js.native
  
  /** The measurement value. */
  var value: js.UndefOr[TypedValue] = js.native
}
object CollectdValue {
  
  @scala.inline
  def apply(): CollectdValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectdValue]
  }
  
  @scala.inline
  implicit class CollectdValueMutableBuilder[Self <: CollectdValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSourceName(value: String): Self = StObject.set(x, "dataSourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceNameUndefined: Self = StObject.set(x, "dataSourceName", js.undefined)
    
    @scala.inline
    def setDataSourceType(value: String): Self = StObject.set(x, "dataSourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceTypeUndefined: Self = StObject.set(x, "dataSourceType", js.undefined)
    
    @scala.inline
    def setValue(value: TypedValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
