package typings.maximMazurokGapiClientGenomics.gapi.client.genomics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PullStoppedEvent extends StObject {
  
  /** The URI of the image that was pulled. */
  var imageUri: js.UndefOr[String] = js.undefined
}
object PullStoppedEvent {
  
  inline def apply(): PullStoppedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PullStoppedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PullStoppedEvent] (val x: Self) extends AnyVal {
    
    inline def setImageUri(value: String): Self = StObject.set(x, "imageUri", value.asInstanceOf[js.Any])
    
    inline def setImageUriUndefined: Self = StObject.set(x, "imageUri", js.undefined)
  }
}
