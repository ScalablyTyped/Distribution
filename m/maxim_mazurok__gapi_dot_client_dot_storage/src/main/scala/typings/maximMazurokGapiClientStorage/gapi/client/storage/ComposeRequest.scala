package typings.maximMazurokGapiClientStorage.gapi.client.storage

import typings.maximMazurokGapiClientStorage.anon.Generation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComposeRequest extends StObject {
  
  /** Properties of the resulting object. */
  // tslint:disable-next-line:ban-types
  var destination: js.UndefOr[Object] = js.undefined
  
  /** The kind of item this is. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The list of source objects that will be concatenated into a single object. */
  var sourceObjects: js.UndefOr[js.Array[Generation]] = js.undefined
}
object ComposeRequest {
  
  inline def apply(): ComposeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComposeRequest]
  }
  
  extension [Self <: ComposeRequest](x: Self) {
    
    inline def setDestination(value: Object): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setSourceObjects(value: js.Array[Generation]): Self = StObject.set(x, "sourceObjects", value.asInstanceOf[js.Any])
    
    inline def setSourceObjectsUndefined: Self = StObject.set(x, "sourceObjects", js.undefined)
    
    inline def setSourceObjectsVarargs(value: Generation*): Self = StObject.set(x, "sourceObjects", js.Array(value*))
  }
}
