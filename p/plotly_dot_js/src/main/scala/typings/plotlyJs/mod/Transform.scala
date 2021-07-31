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

trait Transform extends StObject {
  
  var aggregations: js.Array[TransformAggregation]
  
  var enabled: Boolean
  
  var groups: String | (js.Array[Double | String])
  
  var nameformat: String
  
  var operation: String
  
  var order: ascending | descending
  
  var preservegaps: Boolean
  
  var styles: js.Array[TransformStyle]
  
  var target: Double | String | (js.Array[Double | String])
  
  var `type`: aggregate | filter | groupby | sort
  
  var value: js.Any
}
object Transform {
  
  @scala.inline
  def apply(
    aggregations: js.Array[TransformAggregation],
    enabled: Boolean,
    groups: String | (js.Array[Double | String]),
    nameformat: String,
    operation: String,
    order: ascending | descending,
    preservegaps: Boolean,
    styles: js.Array[TransformStyle],
    target: Double | String | (js.Array[Double | String]),
    `type`: aggregate | filter | groupby | sort,
    value: js.Any
  ): Transform = {
    val __obj = js.Dynamic.literal(aggregations = aggregations.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], nameformat = nameformat.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], preservegaps = preservegaps.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transform]
  }
  
  @scala.inline
  implicit class TransformMutableBuilder[Self <: Transform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregations(value: js.Array[TransformAggregation]): Self = StObject.set(x, "aggregations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregationsVarargs(value: TransformAggregation*): Self = StObject.set(x, "aggregations", js.Array(value :_*))
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroups(value: String | (js.Array[Double | String])): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsVarargs(value: (Double | String)*): Self = StObject.set(x, "groups", js.Array(value :_*))
    
    @scala.inline
    def setNameformat(value: String): Self = StObject.set(x, "nameformat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrder(value: ascending | descending): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreservegaps(value: Boolean): Self = StObject.set(x, "preservegaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyles(value: js.Array[TransformStyle]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesVarargs(value: TransformStyle*): Self = StObject.set(x, "styles", js.Array(value :_*))
    
    @scala.inline
    def setTarget(value: Double | String | (js.Array[Double | String])): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetVarargs(value: (Double | String)*): Self = StObject.set(x, "target", js.Array(value :_*))
    
    @scala.inline
    def setType(value: aggregate | filter | groupby | sort): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
