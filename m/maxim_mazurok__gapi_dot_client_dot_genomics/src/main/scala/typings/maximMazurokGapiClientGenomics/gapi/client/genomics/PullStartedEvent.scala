package typings.maximMazurokGapiClientGenomics.gapi.client.genomics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PullStartedEvent extends StObject {
  
  /** The URI of the image that was pulled. */
  var imageUri: js.UndefOr[String] = js.undefined
}
object PullStartedEvent {
  
  inline def apply(): PullStartedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PullStartedEvent]
  }
  
  extension [Self <: PullStartedEvent](x: Self) {
    
    inline def setImageUri(value: String): Self = StObject.set(x, "imageUri", value.asInstanceOf[js.Any])
    
    inline def setImageUriUndefined: Self = StObject.set(x, "imageUri", js.undefined)
  }
}
