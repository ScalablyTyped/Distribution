package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GuidNameVersion extends StObject {
  
  var guid: js.UndefOr[String | Null] = js.undefined
  
  /** @description The name of the tool used to generate the code scanning analysis alert. */
  var name: String
  
  /** @description The version of the tool used to detect the alert. */
  var version: String | Null
}
object GuidNameVersion {
  
  inline def apply(name: String): GuidNameVersion = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = null)
    __obj.asInstanceOf[GuidNameVersion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GuidNameVersion] (val x: Self) extends AnyVal {
    
    inline def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    inline def setGuidNull: Self = StObject.set(x, "guid", null)
    
    inline def setGuidUndefined: Self = StObject.set(x, "guid", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
  }
}
