package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvVar extends StObject {
  
  /** Name of the environment variable. Must be a C_IDENTIFIER. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * (Optional) Variable references $(VAR_NAME) are expanded using the previous defined environment variables in the container and any route environment variables. If a variable cannot
    * be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be
    * expanded, regardless of whether the variable exists or not. Defaults to "".
    */
  var value: js.UndefOr[String] = js.undefined
  
  /** (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Source for the environment variable's value. Cannot be used if value is not empty. */
  var valueFrom: js.UndefOr[EnvVarSource] = js.undefined
}
object EnvVar {
  
  @scala.inline
  def apply(): EnvVar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvVar]
  }
  
  @scala.inline
  implicit class EnvVarMutableBuilder[Self <: EnvVar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueFrom(value: EnvVarSource): Self = StObject.set(x, "valueFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueFromUndefined: Self = StObject.set(x, "valueFrom", js.undefined)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
