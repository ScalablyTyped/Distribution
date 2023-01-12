package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultTemplate extends StObject {
  
  // JSON schema of the result template.
  var body: js.UndefOr[NullableOption[Any]] = js.undefined
  
  // Name of the result template.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
}
object ResultTemplate {
  
  inline def apply(): ResultTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultTemplate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResultTemplate] (val x: Self) extends AnyVal {
    
    inline def setBody(value: NullableOption[Any]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
