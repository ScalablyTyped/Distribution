package typings.onfleetNodeOnfleet.resourcesTasksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskCompletionRequirements extends StObject {
  
  var minimumAge: js.UndefOr[Double] = js.undefined
  
  var notes: js.UndefOr[Boolean] = js.undefined
  
  var photo: js.UndefOr[Boolean] = js.undefined
  
  var signature: js.UndefOr[Boolean] = js.undefined
}
object TaskCompletionRequirements {
  
  inline def apply(): TaskCompletionRequirements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskCompletionRequirements]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaskCompletionRequirements] (val x: Self) extends AnyVal {
    
    inline def setMinimumAge(value: Double): Self = StObject.set(x, "minimumAge", value.asInstanceOf[js.Any])
    
    inline def setMinimumAgeUndefined: Self = StObject.set(x, "minimumAge", js.undefined)
    
    inline def setNotes(value: Boolean): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setPhoto(value: Boolean): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
    
    inline def setPhotoUndefined: Self = StObject.set(x, "photo", js.undefined)
    
    inline def setSignature(value: Boolean): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
  }
}
