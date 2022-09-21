package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.commit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Details extends StObject {
  
  var details: Blobsha
  
  /**
    * @description The location type. Because secrets may be found in different types of resources (ie. code, comments, issues), this field identifies the type of resource where the secret was found.
    * @example commit
    * @enum {string}
    */
  var `type`: commit
}
object Details {
  
  inline def apply(details: Blobsha): Details = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("commit")
    __obj.asInstanceOf[Details]
  }
  
  extension [Self <: Details](x: Self) {
    
    inline def setDetails(value: Blobsha): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setType(value: commit): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
