package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointData extends StObject {
  
  /** The time interval associated with the point. */
  var timeInterval: js.UndefOr[TimeInterval] = js.native
  
  /** The values that make up the point. */
  var values: js.UndefOr[js.Array[TypedValue]] = js.native
}
object PointData {
  
  @scala.inline
  def apply(): PointData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointData]
  }
  
  @scala.inline
  implicit class PointDataMutableBuilder[Self <: PointData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimeInterval(value: TimeInterval): Self = StObject.set(x, "timeInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeIntervalUndefined: Self = StObject.set(x, "timeInterval", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[TypedValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: TypedValue*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
