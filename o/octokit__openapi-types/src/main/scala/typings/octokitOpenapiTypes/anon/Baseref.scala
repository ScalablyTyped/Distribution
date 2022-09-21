package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Baseref extends StObject {
  
  var base_ref: String
  
  var head_ref: String
  
  var head_sha: String
}
object Baseref {
  
  inline def apply(base_ref: String, head_ref: String, head_sha: String): Baseref = {
    val __obj = js.Dynamic.literal(base_ref = base_ref.asInstanceOf[js.Any], head_ref = head_ref.asInstanceOf[js.Any], head_sha = head_sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[Baseref]
  }
  
  extension [Self <: Baseref](x: Self) {
    
    inline def setBase_ref(value: String): Self = StObject.set(x, "base_ref", value.asInstanceOf[js.Any])
    
    inline def setHead_ref(value: String): Self = StObject.set(x, "head_ref", value.asInstanceOf[js.Any])
    
    inline def setHead_sha(value: String): Self = StObject.set(x, "head_sha", value.asInstanceOf[js.Any])
  }
}
