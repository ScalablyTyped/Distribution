package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyName extends StObject {
  
  /** @description The generated body describing the contents of the release supporting markdown formatting */
  var body: String
  
  /**
    * @description The generated name of the release
    * @example Release v1.0.0 is now available!
    */
  var name: String
}
object BodyName {
  
  inline def apply(body: String, name: String): BodyName = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyName]
  }
  
  extension [Self <: BodyName](x: Self) {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
