package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathLicense extends StObject {
  
  /** Get a license */
  var get: ParametersPathLicense
}
object GetParametersPathLicense {
  
  inline def apply(get: ParametersPathLicense): GetParametersPathLicense = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathLicense]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathLicense] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathLicense): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
