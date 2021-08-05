package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.ShaType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitUpdateRefResponseData extends StObject {
  
  var node_id: String
  
  var `object`: ShaType
  
  var ref: String
  
  var url: String
}
object GitUpdateRefResponseData {
  
  inline def apply(node_id: String, `object`: ShaType, ref: String, url: String): GitUpdateRefResponseData = {
    val __obj = js.Dynamic.literal(node_id = node_id.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitUpdateRefResponseData]
  }
  
  extension [Self <: GitUpdateRefResponseData](x: Self) {
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setObject(value: ShaType): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
