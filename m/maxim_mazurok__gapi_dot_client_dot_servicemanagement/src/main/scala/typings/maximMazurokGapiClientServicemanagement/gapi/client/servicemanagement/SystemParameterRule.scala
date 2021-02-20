package typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemParameterRule extends StObject {
  
  /**
    * Define parameters. Multiple names may be defined for a parameter. For a given method call, only one of them should be used. If multiple names are used the behavior is
    * implementation-dependent. If none of the specified names are present the behavior is parameter-dependent.
    */
  var parameters: js.UndefOr[js.Array[SystemParameter]] = js.native
  
  /** Selects the methods to which this rule applies. Use '*' to indicate all methods in all APIs. Refer to selector for syntax details. */
  var selector: js.UndefOr[String] = js.native
}
object SystemParameterRule {
  
  @scala.inline
  def apply(): SystemParameterRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SystemParameterRule]
  }
  
  @scala.inline
  implicit class SystemParameterRuleMutableBuilder[Self <: SystemParameterRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: js.Array[SystemParameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: SystemParameter*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    @scala.inline
    def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
  }
}
