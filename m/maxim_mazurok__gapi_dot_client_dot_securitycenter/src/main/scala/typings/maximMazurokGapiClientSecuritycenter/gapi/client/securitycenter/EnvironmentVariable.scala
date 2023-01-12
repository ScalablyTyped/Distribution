package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentVariable extends StObject {
  
  /** Environment variable name as a JSON encoded string. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Environment variable value as a JSON encoded string. */
  var `val`: js.UndefOr[String] = js.undefined
}
object EnvironmentVariable {
  
  inline def apply(): EnvironmentVariable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentVariable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnvironmentVariable] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setVal(value: String): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
    
    inline def setValUndefined: Self = StObject.set(x, "val", js.undefined)
  }
}
