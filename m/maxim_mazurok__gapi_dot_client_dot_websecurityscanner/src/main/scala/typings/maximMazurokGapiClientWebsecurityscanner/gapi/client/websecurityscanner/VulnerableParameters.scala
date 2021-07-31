package typings.maximMazurokGapiClientWebsecurityscanner.gapi.client.websecurityscanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VulnerableParameters extends StObject {
  
  /** The vulnerable parameter names. */
  var parameterNames: js.UndefOr[js.Array[String]] = js.undefined
}
object VulnerableParameters {
  
  @scala.inline
  def apply(): VulnerableParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VulnerableParameters]
  }
  
  @scala.inline
  implicit class VulnerableParametersMutableBuilder[Self <: VulnerableParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameterNames(value: js.Array[String]): Self = StObject.set(x, "parameterNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterNamesUndefined: Self = StObject.set(x, "parameterNames", js.undefined)
    
    @scala.inline
    def setParameterNamesVarargs(value: String*): Self = StObject.set(x, "parameterNames", js.Array(value :_*))
  }
}
