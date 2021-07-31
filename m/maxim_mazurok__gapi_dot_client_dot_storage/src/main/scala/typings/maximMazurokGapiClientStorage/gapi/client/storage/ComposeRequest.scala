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
  
  @scala.inline
  def apply(): ComposeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComposeRequest]
  }
  
  @scala.inline
  implicit class ComposeRequestMutableBuilder[Self <: ComposeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestination(value: Object): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setSourceObjects(value: js.Array[Generation]): Self = StObject.set(x, "sourceObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceObjectsUndefined: Self = StObject.set(x, "sourceObjects", js.undefined)
    
    @scala.inline
    def setSourceObjectsVarargs(value: Generation*): Self = StObject.set(x, "sourceObjects", js.Array(value :_*))
  }
}
