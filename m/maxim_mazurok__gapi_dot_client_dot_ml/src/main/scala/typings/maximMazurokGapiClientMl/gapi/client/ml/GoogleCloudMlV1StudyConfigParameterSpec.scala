package typings.maximMazurokGapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1StudyConfigParameterSpec extends js.Object {
  
  /** The value spec for a 'CATEGORICAL' parameter. */
  var categoricalValueSpec: js.UndefOr[GoogleCloudMlV1StudyConfigParameterSpecCategoricalValueSpec] = js.native
  
  /**
    * A child node is active if the parameter's value matches the child node's matching_parent_values. If two items in child_parameter_specs have the same name, they must have disjoint
    * matching_parent_values.
    */
  var childParameterSpecs: js.UndefOr[js.Array[GoogleCloudMlV1StudyConfigParameterSpec]] = js.native
  
  /** The value spec for a 'DISCRETE' parameter. */
  var discreteValueSpec: js.UndefOr[GoogleCloudMlV1StudyConfigParameterSpecDiscreteValueSpec] = js.native
  
  /** The value spec for a 'DOUBLE' parameter. */
  var doubleValueSpec: js.UndefOr[GoogleCloudMlV1StudyConfigParameterSpecDoubleValueSpec] = js.native
  
  /** The value spec for an 'INTEGER' parameter. */
  var integerValueSpec: js.UndefOr[GoogleCloudMlV1StudyConfigParameterSpecIntegerValueSpec] = js.native
  
  /** Required. The parameter name must be unique amongst all ParameterSpecs. */
  var parameter: js.UndefOr[String] = js.native
  
  var parentCategoricalValues: js.UndefOr[GoogleCloudMlV1StudyConfigParameterSpecMatchingParentCategoricalValueSpec] = js.native
  
  var parentDiscreteValues: js.UndefOr[GoogleCloudMlV1StudyConfigParameterSpecMatchingParentDiscreteValueSpec] = js.native
  
  var parentIntValues: js.UndefOr[GoogleCloudMlV1StudyConfigParameterSpecMatchingParentIntValueSpec] = js.native
  
  /** How the parameter should be scaled. Leave unset for categorical parameters. */
  var scaleType: js.UndefOr[String] = js.native
  
  /** Required. The type of the parameter. */
  var `type`: js.UndefOr[String] = js.native
}
object GoogleCloudMlV1StudyConfigParameterSpec {
  
  @scala.inline
  def apply(): GoogleCloudMlV1StudyConfigParameterSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1StudyConfigParameterSpec]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1StudyConfigParameterSpecOps[Self <: GoogleCloudMlV1StudyConfigParameterSpec] (val x: Self) extends AnyVal {
    
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
    def setCategoricalValueSpec(value: GoogleCloudMlV1StudyConfigParameterSpecCategoricalValueSpec): Self = this.set("categoricalValueSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategoricalValueSpec: Self = this.set("categoricalValueSpec", js.undefined)
    
    @scala.inline
    def setChildParameterSpecsVarargs(value: GoogleCloudMlV1StudyConfigParameterSpec*): Self = this.set("childParameterSpecs", js.Array(value :_*))
    
    @scala.inline
    def setChildParameterSpecs(value: js.Array[GoogleCloudMlV1StudyConfigParameterSpec]): Self = this.set("childParameterSpecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildParameterSpecs: Self = this.set("childParameterSpecs", js.undefined)
    
    @scala.inline
    def setDiscreteValueSpec(value: GoogleCloudMlV1StudyConfigParameterSpecDiscreteValueSpec): Self = this.set("discreteValueSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiscreteValueSpec: Self = this.set("discreteValueSpec", js.undefined)
    
    @scala.inline
    def setDoubleValueSpec(value: GoogleCloudMlV1StudyConfigParameterSpecDoubleValueSpec): Self = this.set("doubleValueSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoubleValueSpec: Self = this.set("doubleValueSpec", js.undefined)
    
    @scala.inline
    def setIntegerValueSpec(value: GoogleCloudMlV1StudyConfigParameterSpecIntegerValueSpec): Self = this.set("integerValueSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegerValueSpec: Self = this.set("integerValueSpec", js.undefined)
    
    @scala.inline
    def setParameter(value: String): Self = this.set("parameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameter: Self = this.set("parameter", js.undefined)
    
    @scala.inline
    def setParentCategoricalValues(value: GoogleCloudMlV1StudyConfigParameterSpecMatchingParentCategoricalValueSpec): Self = this.set("parentCategoricalValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentCategoricalValues: Self = this.set("parentCategoricalValues", js.undefined)
    
    @scala.inline
    def setParentDiscreteValues(value: GoogleCloudMlV1StudyConfigParameterSpecMatchingParentDiscreteValueSpec): Self = this.set("parentDiscreteValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentDiscreteValues: Self = this.set("parentDiscreteValues", js.undefined)
    
    @scala.inline
    def setParentIntValues(value: GoogleCloudMlV1StudyConfigParameterSpecMatchingParentIntValueSpec): Self = this.set("parentIntValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentIntValues: Self = this.set("parentIntValues", js.undefined)
    
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
