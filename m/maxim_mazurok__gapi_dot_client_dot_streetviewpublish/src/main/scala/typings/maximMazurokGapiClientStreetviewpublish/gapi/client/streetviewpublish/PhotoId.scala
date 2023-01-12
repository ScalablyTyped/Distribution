package typings.maximMazurokGapiClientStreetviewpublish.gapi.client.streetviewpublish

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhotoId extends StObject {
  
  /** A unique identifier for a photo. */
  var id: js.UndefOr[String] = js.undefined
}
object PhotoId {
  
  inline def apply(): PhotoId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhotoId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PhotoId] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
