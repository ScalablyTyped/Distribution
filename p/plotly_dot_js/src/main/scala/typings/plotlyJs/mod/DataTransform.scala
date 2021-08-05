package typings.plotlyJs.mod

import typings.plotlyJs.plotlyJsStrings.aggregate
import typings.plotlyJs.plotlyJsStrings.ascending
import typings.plotlyJs.plotlyJsStrings.descending
import typings.plotlyJs.plotlyJsStrings.filter
import typings.plotlyJs.plotlyJsStrings.groupby
import typings.plotlyJs.plotlyJsStrings.sort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.Transform> */
trait DataTransform extends StObject {
  
  var aggregations: js.UndefOr[js.Array[TransformAggregation]] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var groups: js.UndefOr[String | (js.Array[Double | String])] = js.undefined
  
  var nameformat: js.UndefOr[String] = js.undefined
  
  var operation: js.UndefOr[String] = js.undefined
  
  var order: js.UndefOr[ascending | descending] = js.undefined
  
  var preservegaps: js.UndefOr[Boolean] = js.undefined
  
  var styles: js.UndefOr[js.Array[TransformStyle]] = js.undefined
  
  var target: js.UndefOr[Double | String | (js.Array[Double | String])] = js.undefined
  
  var `type`: js.UndefOr[aggregate | filter | groupby | sort] = js.undefined
  
  var value: js.UndefOr[js.Any] = js.undefined
}
object DataTransform {
  
  inline def apply(): DataTransform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataTransform]
  }
  
  extension [Self <: DataTransform](x: Self) {
    
    inline def setAggregations(value: js.Array[TransformAggregation]): Self = StObject.set(x, "aggregations", value.asInstanceOf[js.Any])
    
    inline def setAggregationsUndefined: Self = StObject.set(x, "aggregations", js.undefined)
    
    inline def setAggregationsVarargs(value: TransformAggregation*): Self = StObject.set(x, "aggregations", js.Array(value :_*))
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setGroups(value: String | (js.Array[Double | String])): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setGroupsVarargs(value: (Double | String)*): Self = StObject.set(x, "groups", js.Array(value :_*))
    
    inline def setNameformat(value: String): Self = StObject.set(x, "nameformat", value.asInstanceOf[js.Any])
    
    inline def setNameformatUndefined: Self = StObject.set(x, "nameformat", js.undefined)
    
    inline def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    inline def setOrder(value: ascending | descending): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setPreservegaps(value: Boolean): Self = StObject.set(x, "preservegaps", value.asInstanceOf[js.Any])
    
    inline def setPreservegapsUndefined: Self = StObject.set(x, "preservegaps", js.undefined)
    
    inline def setStyles(value: js.Array[TransformStyle]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setStylesVarargs(value: TransformStyle*): Self = StObject.set(x, "styles", js.Array(value :_*))
    
    inline def setTarget(value: Double | String | (js.Array[Double | String])): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTargetVarargs(value: (Double | String)*): Self = StObject.set(x, "target", js.Array(value :_*))
    
    inline def setType(value: aggregate | filter | groupby | sort): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
