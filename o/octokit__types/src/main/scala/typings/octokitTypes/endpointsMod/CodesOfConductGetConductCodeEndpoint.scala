package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`0`
import typings.octokitTypes.octokitTypesStrings.`scarlet-witch`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodesOfConductGetConductCodeEndpoint
  extends StObject
     with RequiredPreview[`scarlet-witch`] {
  
  var key: String
}
object CodesOfConductGetConductCodeEndpoint {
  
  inline def apply(key: String, mediaType: `0`[`scarlet-witch`]): CodesOfConductGetConductCodeEndpoint = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodesOfConductGetConductCodeEndpoint]
  }
  
  extension [Self <: CodesOfConductGetConductCodeEndpoint](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
