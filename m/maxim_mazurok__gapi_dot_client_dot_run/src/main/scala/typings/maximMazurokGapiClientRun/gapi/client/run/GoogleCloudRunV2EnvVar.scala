package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRunV2EnvVar extends StObject {
  
  /** Required. Name of the environment variable. Must be a C_IDENTIFIER, and mnay not exceed 32768 characters. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Variable references $(VAR_NAME) are expanded using the previous defined environment variables in the container and any route environment variables. If a variable cannot be resolved,
    * the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless
    * of whether the variable exists or not. Defaults to "", and the maximum length is 32768 bytes.
    */
  var value: js.UndefOr[String] = js.undefined
  
  /** Source for the environment variable's value. */
  var valueSource: js.UndefOr[GoogleCloudRunV2EnvVarSource] = js.undefined
}
object GoogleCloudRunV2EnvVar {
  
  inline def apply(): GoogleCloudRunV2EnvVar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRunV2EnvVar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudRunV2EnvVar] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueSource(value: GoogleCloudRunV2EnvVarSource): Self = StObject.set(x, "valueSource", value.asInstanceOf[js.Any])
    
    inline def setValueSourceUndefined: Self = StObject.set(x, "valueSource", js.undefined)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
