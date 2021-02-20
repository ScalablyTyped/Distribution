package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1StudyConfigParameterSpec extends StObject {
  
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
  implicit class GoogleCloudMlV1StudyConfigParameterSpecMutableBuilder[Self <: GoogleCloudMlV1StudyConfigParameterSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategoricalValueSpec(value: GoogleCloudMlV1StudyConfigParameterSpecCategoricalValueSpec): Self = StObject.set(x, "categoricalValueSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoricalValueSpecUndefined: Self = StObject.set(x, "categoricalValueSpec", js.undefined)
    
    @scala.inline
    def setChildParameterSpecs(value: js.Array[GoogleCloudMlV1StudyConfigParameterSpec]): Self = StObject.set(x, "childParameterSpecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildParameterSpecsUndefined: Self = StObject.set(x, "childParameterSpecs", js.undefined)
    
    @scala.inline
    def setChildParameterSpecsVarargs(value: GoogleCloudMlV1StudyConfigParameterSpec*): Self = StObject.set(x, "childParameterSpecs", js.Array(value :_*))
    
    @scala.inline
    def setDiscreteValueSpec(value: GoogleCloudMlV1StudyConfigParameterSpecDiscreteValueSpec): Self = StObject.set(x, "discreteValueSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscreteValueSpecUndefined: Self = StObject.set(x, "discreteValueSpec", js.undefined)
    
    @scala.inline
    def setDoubleValueSpec(value: GoogleCloudMlV1StudyConfigParameterSpecDoubleValueSpec): Self = StObject.set(x, "doubleValueSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubleValueSpecUndefined: Self = StObject.set(x, "doubleValueSpec", js.undefined)
    
    @scala.inline
    def setIntegerValueSpec(value: GoogleCloudMlV1StudyConfigParameterSpecIntegerValueSpec): Self = StObject.set(x, "integerValueSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegerValueSpecUndefined: Self = StObject.set(x, "integerValueSpec", js.undefined)
    
    @scala.inline
    def setParameter(value: String): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterUndefined: Self = StObject.set(x, "parameter", js.undefined)
    
    @scala.inline
    def setParentCategoricalValues(value: GoogleCloudMlV1StudyConfigParameterSpecMatchingParentCategoricalValueSpec): Self = StObject.set(x, "parentCategoricalValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentCategoricalValuesUndefined: Self = StObject.set(x, "parentCategoricalValues", js.undefined)
    
    @scala.inline
    def setParentDiscreteValues(value: GoogleCloudMlV1StudyConfigParameterSpecMatchingParentDiscreteValueSpec): Self = StObject.set(x, "parentDiscreteValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentDiscreteValuesUndefined: Self = StObject.set(x, "parentDiscreteValues", js.undefined)
    
    @scala.inline
    def setParentIntValues(value: GoogleCloudMlV1StudyConfigParameterSpecMatchingParentIntValueSpec): Self = StObject.set(x, "parentIntValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentIntValuesUndefined: Self = StObject.set(x, "parentIntValues", js.undefined)
    
    @scala.inline
    def setScaleType(value: String): Self = StObject.set(x, "scaleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleTypeUndefined: Self = StObject.set(x, "scaleType", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
