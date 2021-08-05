package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GistsGetEndpoint extends StObject {
  
  var gist_id: String
}
object GistsGetEndpoint {
  
  inline def apply(gist_id: String): GistsGetEndpoint = {
    val __obj = js.Dynamic.literal(gist_id = gist_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsGetEndpoint]
  }
  
  extension [Self <: GistsGetEndpoint](x: Self) {
    
    inline def setGist_id(value: String): Self = StObject.set(x, "gist_id", value.asInstanceOf[js.Any])
  }
}
