package typings.mondaySdkJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  token :string,   variables :object}> */
trait Partialtokenstringvariabl extends StObject {
  
  var token: js.UndefOr[String] = js.undefined
  
  var variables: js.UndefOr[js.Object] = js.undefined
}
object Partialtokenstringvariabl {
  
  inline def apply(): Partialtokenstringvariabl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialtokenstringvariabl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Partialtokenstringvariabl] (val x: Self) extends AnyVal {
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    inline def setVariables(value: js.Object): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    inline def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
  }
}
