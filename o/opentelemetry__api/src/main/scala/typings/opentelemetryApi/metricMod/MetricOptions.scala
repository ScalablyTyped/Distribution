package typings.opentelemetryApi.metricMod

import typings.opentelemetryApi.loggerMod.Logger
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricOptions extends js.Object {
  
  /** The name of the component that reports the Metric. */
  var component: js.UndefOr[String] = js.native
  
  /** The map of constant labels for the Metric. */
  var constantLabels: js.UndefOr[Map[String, String]] = js.native
  
  /**
    * The description of the Metric.
    * @default ''
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Indicates the metric is a verbose metric that is disabled by default
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * User provided logger.
    */
  var logger: js.UndefOr[Logger] = js.native
  
  /**
    * The unit of the Metric values.
    * @default '1'
    */
  var unit: js.UndefOr[String] = js.native
  
  /**
    * Indicates the type of the recorded value.
    * @default {@link ValueType.DOUBLE}
    */
  var valueType: js.UndefOr[ValueType] = js.native
}
object MetricOptions {
  
  @scala.inline
  def apply(): MetricOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricOptions]
  }
  
  @scala.inline
  implicit class MetricOptionsOps[Self <: MetricOptions] (val x: Self) extends AnyVal {
    
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
    def setComponent(value: String): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setConstantLabels(value: Map[String, String]): Self = this.set("constantLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstantLabels: Self = this.set("constantLabels", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setLogger(value: Logger): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    
    @scala.inline
    def setUnit(value: String): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
    
    @scala.inline
    def setValueType(value: ValueType): Self = this.set("valueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueType: Self = this.set("valueType", js.undefined)
  }
}
