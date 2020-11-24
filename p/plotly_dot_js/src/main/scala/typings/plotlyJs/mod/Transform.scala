package typings.plotlyJs.mod

import typings.plotlyJs.plotlyJsStrings.aggregate
import typings.plotlyJs.plotlyJsStrings.ascending
import typings.plotlyJs.plotlyJsStrings.descending
import typings.plotlyJs.plotlyJsStrings.filter
import typings.plotlyJs.plotlyJsStrings.groupby
import typings.plotlyJs.plotlyJsStrings.sort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transform extends js.Object {
  
  var aggregations: js.Array[TransformAggregation] = js.native
  
  var enabled: Boolean = js.native
  
  var groups: String | (js.Array[Double | String]) = js.native
  
  var nameformat: String = js.native
  
  var operation: String = js.native
  
  var order: ascending | descending = js.native
  
  var preservegaps: Boolean = js.native
  
  var styles: js.Array[TransformStyle] = js.native
  
  var target: Double | String | (js.Array[Double | String]) = js.native
  
  var `type`: aggregate | filter | groupby | sort = js.native
  
  var value: js.Any = js.native
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
  implicit class TransformOps[Self <: Transform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAggregationsVarargs(value: TransformAggregation*): Self = this.set("aggregations", js.Array(value :_*))
    
    @scala.inline
    def setAggregations(value: js.Array[TransformAggregation]): Self = this.set("aggregations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsVarargs(value: (Double | String)*): Self = this.set("groups", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: String | (js.Array[Double | String])): Self = this.set("groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameformat(value: String): Self = this.set("nameformat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperation(value: String): Self = this.set("operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrder(value: ascending | descending): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreservegaps(value: Boolean): Self = this.set("preservegaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesVarargs(value: TransformStyle*): Self = this.set("styles", js.Array(value :_*))
    
    @scala.inline
    def setStyles(value: js.Array[TransformStyle]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetVarargs(value: (Double | String)*): Self = this.set("target", js.Array(value :_*))
    
    @scala.inline
    def setTarget(value: Double | String | (js.Array[Double | String])): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: aggregate | filter | groupby | sort): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
