package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameVersion extends StObject {
  
  /** @description The name of the tool used to generate the code scanning analysis alert. */
  var name: String
  
  /** @description The version of the tool used to detect the alert. */
  var version: String | Null
}
object NameVersion {
  
  inline def apply(name: String): NameVersion = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = null)
    __obj.asInstanceOf[NameVersion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NameVersion] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
  }
}
