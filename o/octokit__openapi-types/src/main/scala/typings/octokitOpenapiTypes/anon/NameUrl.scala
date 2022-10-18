package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameUrl extends StObject {
  
  /**
    * @description The name of the detector used.
    * @example docker buildtime detector
    */
  var name: String
  
  /**
    * @description The url of the detector used.
    * @example http://example.com/docker-buildtimer-detector
    */
  var url: String
  
  /**
    * @description The version of the detector used.
    * @example 1.0.0
    */
  var version: String
}
object NameUrl {
  
  inline def apply(name: String, url: String, version: String): NameUrl = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameUrl]
  }
  
  extension [Self <: NameUrl](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
