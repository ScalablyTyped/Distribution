package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Guid extends StObject {
  
  var guid: js.UndefOr[String | Null] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var version: js.UndefOr[String | Null] = js.undefined
}
object Guid {
  
  inline def apply(): Guid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Guid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Guid] (val x: Self) extends AnyVal {
    
    inline def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    inline def setGuidNull: Self = StObject.set(x, "guid", null)
    
    inline def setGuidUndefined: Self = StObject.set(x, "guid", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
