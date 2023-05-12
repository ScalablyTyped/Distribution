package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Created extends StObject {
  
  /**
    * @description The date and time the SPDX document was created.
    * @example 2021-11-03T00:00:00Z
    */
  var created: String
  
  /** @description The tools that were used to generate the SPDX document. */
  var creators: js.Array[String]
}
object Created {
  
  inline def apply(created: String, creators: js.Array[String]): Created = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], creators = creators.asInstanceOf[js.Any])
    __obj.asInstanceOf[Created]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Created] (val x: Self) extends AnyVal {
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreators(value: js.Array[String]): Self = StObject.set(x, "creators", value.asInstanceOf[js.Any])
    
    inline def setCreatorsVarargs(value: String*): Self = StObject.set(x, "creators", js.Array(value*))
  }
}
