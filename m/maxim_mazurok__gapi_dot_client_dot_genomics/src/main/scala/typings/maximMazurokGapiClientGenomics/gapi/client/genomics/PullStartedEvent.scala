package typings.maximMazurokGapiClientGenomics.gapi.client.genomics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PullStartedEvent extends StObject {
  
  /** The URI of the image that was pulled. */
  var imageUri: js.UndefOr[String] = js.undefined
}
object PullStartedEvent {
  
  @scala.inline
  def apply(): PullStartedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PullStartedEvent]
  }
  
  @scala.inline
  implicit class PullStartedEventMutableBuilder[Self <: PullStartedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageUri(value: String): Self = StObject.set(x, "imageUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUriUndefined: Self = StObject.set(x, "imageUri", js.undefined)
  }
}
