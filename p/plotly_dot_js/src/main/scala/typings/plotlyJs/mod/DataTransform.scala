package typings.plotlyJs.mod

import typings.plotlyJs.plotlyJsStrings.aggregate
import typings.plotlyJs.plotlyJsStrings.ascending
import typings.plotlyJs.plotlyJsStrings.descending
import typings.plotlyJs.plotlyJsStrings.filter
import typings.plotlyJs.plotlyJsStrings.groupby
import typings.plotlyJs.plotlyJsStrings.sort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.Transform> */
@js.native
trait DataTransform extends js.Object {
  var aggregations: js.UndefOr[js.Array[TransformAggregation]] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var groups: js.UndefOr[String | (js.Array[Double | String])] = js.native
  var nameformat: js.UndefOr[String] = js.native
  var operation: js.UndefOr[String] = js.native
  var order: js.UndefOr[ascending | descending] = js.native
  var preservegaps: js.UndefOr[Boolean] = js.native
  var styles: js.UndefOr[js.Array[TransformStyle]] = js.native
  var target: js.UndefOr[Double | String | (js.Array[Double | String])] = js.native
  var `type`: js.UndefOr[aggregate | filter | groupby | sort] = js.native
  var value: js.UndefOr[js.Any] = js.native
}

object DataTransform {
  @scala.inline
  def apply(): DataTransform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataTransform]
  }
  @scala.inline
  implicit class DataTransformOps[Self <: DataTransform] (val x: Self) extends AnyVal {
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
    def deleteAggregations: Self = this.set("aggregations", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setGroupsVarargs(value: (Double | String)*): Self = this.set("groups", js.Array(value :_*))
    @scala.inline
    def setGroups(value: String | (js.Array[Double | String])): Self = this.set("groups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroups: Self = this.set("groups", js.undefined)
    @scala.inline
    def setNameformat(value: String): Self = this.set("nameformat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNameformat: Self = this.set("nameformat", js.undefined)
    @scala.inline
    def setOperation(value: String): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperation: Self = this.set("operation", js.undefined)
    @scala.inline
    def setOrder(value: ascending | descending): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    @scala.inline
    def setPreservegaps(value: Boolean): Self = this.set("preservegaps", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreservegaps: Self = this.set("preservegaps", js.undefined)
    @scala.inline
    def setStylesVarargs(value: TransformStyle*): Self = this.set("styles", js.Array(value :_*))
    @scala.inline
    def setStyles(value: js.Array[TransformStyle]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTargetVarargs(value: (Double | String)*): Self = this.set("target", js.Array(value :_*))
    @scala.inline
    def setTarget(value: Double | String | (js.Array[Double | String])): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setType(value: aggregate | filter | groupby | sort): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

