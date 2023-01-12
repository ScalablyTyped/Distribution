package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentVariable extends StObject {
  
  /** Key for the environment variable. */
  var key: js.UndefOr[String] = js.undefined
  
  /** Value for the environment variable. */
  var value: js.UndefOr[String] = js.undefined
}
object EnvironmentVariable {
  
  inline def apply(): EnvironmentVariable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentVariable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnvironmentVariable] (val x: Self) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
