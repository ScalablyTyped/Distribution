package typings.maximMazurokGapiClientStreetviewpublish.gapi.client.streetviewpublish

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhotoId extends StObject {
  
  /** Required. A unique identifier for a photo. */
  var id: js.UndefOr[String] = js.undefined
}
object PhotoId {
  
  @scala.inline
  def apply(): PhotoId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhotoId]
  }
  
  @scala.inline
  implicit class PhotoIdMutableBuilder[Self <: PhotoId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
