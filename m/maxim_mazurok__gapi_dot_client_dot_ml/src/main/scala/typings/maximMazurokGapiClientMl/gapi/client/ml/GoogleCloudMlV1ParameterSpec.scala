package typings.maximMazurokGapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1ParameterSpec extends js.Object {
  
  /** Required if type is `CATEGORICAL`. The list of possible categories. */
  var categoricalValues: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Required if type is `DISCRETE`. A list of feasible points. The list should be in strictly increasing order. For instance, this parameter might have possible settings of 1.5, 2.5,
    * and 4.0. This list should not contain more than 1,000 values.
    */
  var discreteValues: js.UndefOr[js.Array[Double]] = js.native
  
  /** Required if type is `DOUBLE` or `INTEGER`. This field should be unset if type is `CATEGORICAL`. This value should be integers if type is `INTEGER`. */
  var maxValue: js.UndefOr[Double] = js.native
  
  /** Required if type is `DOUBLE` or `INTEGER`. This field should be unset if type is `CATEGORICAL`. This value should be integers if type is INTEGER. */
  var minValue: js.UndefOr[Double] = js.native
  
  /** Required. The parameter name must be unique amongst all ParameterConfigs in a HyperparameterSpec message. E.g., "learning_rate". */
  var parameterName: js.UndefOr[String] = js.native
  
  /**
    * Optional. How the parameter should be scaled to the hypercube. Leave unset for categorical parameters. Some kind of scaling is strongly recommended for real or integral parameters
    * (e.g., `UNIT_LINEAR_SCALE`).
    */
  var scaleType: js.UndefOr[String] = js.native
  
  /** Required. The type of the parameter. */
  var `type`: js.UndefOr[String] = js.native
}
object GoogleCloudMlV1ParameterSpec {
  
  @scala.inline
  def apply(): GoogleCloudMlV1ParameterSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1ParameterSpec]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1ParameterSpecOps[Self <: GoogleCloudMlV1ParameterSpec] (val x: Self) extends AnyVal {
    
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
    def setCategoricalValuesVarargs(value: String*): Self = this.set("categoricalValues", js.Array(value :_*))
    
    @scala.inline
    def setCategoricalValues(value: js.Array[String]): Self = this.set("categoricalValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategoricalValues: Self = this.set("categoricalValues", js.undefined)
    
    @scala.inline
    def setDiscreteValuesVarargs(value: Double*): Self = this.set("discreteValues", js.Array(value :_*))
    
    @scala.inline
    def setDiscreteValues(value: js.Array[Double]): Self = this.set("discreteValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiscreteValues: Self = this.set("discreteValues", js.undefined)
    
    @scala.inline
    def setMaxValue(value: Double): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    
    @scala.inline
    def setMinValue(value: Double): Self = this.set("minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
    
    @scala.inline
    def setParameterName(value: String): Self = this.set("parameterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterName: Self = this.set("parameterName", js.undefined)
    
    @scala.inline
    def setScaleType(value: String): Self = this.set("scaleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleType: Self = this.set("scaleType", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
