package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1EnvVar extends StObject {
  
  /**
    * Name of the environment variable. Must be a [valid C
    * identifier](https://github.com/kubernetes/kubernetes/blob/v1.18.8/staging/src/k8s.io/apimachinery/pkg/util/validation/validation.go#L258) and must not begin with the prefix `AIP_`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Value of the environment variable. Defaults to an empty string. In this field, you can reference [environment variables set by AI Platform
    * Prediction](/ai-platform/prediction/docs/custom-container-requirements#aip-variables) and environment variables set earlier in the same env field as where this message occurs. You
    * cannot reference environment variables set in the Docker image. In order for environment variables to be expanded, reference them by using the following syntax: $(VARIABLE_NAME)
    * Note that this differs from Bash variable expansion, which does not use parentheses. If a variable cannot be resolved, the reference in the input string is used unchanged. To avoid
    * variable expansion, you can escape this syntax with `$$`; for example: $$(VARIABLE_NAME)
    */
  var value: js.UndefOr[String] = js.undefined
}
object GoogleCloudMlV1EnvVar {
  
  inline def apply(): GoogleCloudMlV1EnvVar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1EnvVar]
  }
  
  extension [Self <: GoogleCloudMlV1EnvVar](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
