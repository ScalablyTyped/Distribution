package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.metadataMod.OnfleetMetadata
import typings.onfleetNodeOnfleet.resourcesDestinationsMod.CreateDestinationProps
import typings.onfleetNodeOnfleet.resourcesRecipientsMod.OnfleetRecipient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompleteAfter extends StObject {
  
  var completeAfter: js.UndefOr[Double] = js.undefined
  
  var completeBefore: js.UndefOr[Double] = js.undefined
  
  var destination: js.UndefOr[String | CreateDestinationProps] = js.undefined
  
  var metadata: js.UndefOr[js.Array[OnfleetMetadata]] = js.undefined
  
  var notes: js.UndefOr[String] = js.undefined
  
  var pickupTask: js.UndefOr[Boolean] = js.undefined
  
  var recipients: js.UndefOr[OnfleetRecipient | js.Array[OnfleetRecipient]] = js.undefined
  
  var serviceTime: js.UndefOr[Double] = js.undefined
}
object CompleteAfter {
  
  inline def apply(): CompleteAfter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompleteAfter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompleteAfter] (val x: Self) extends AnyVal {
    
    inline def setCompleteAfter(value: Double): Self = StObject.set(x, "completeAfter", value.asInstanceOf[js.Any])
    
    inline def setCompleteAfterUndefined: Self = StObject.set(x, "completeAfter", js.undefined)
    
    inline def setCompleteBefore(value: Double): Self = StObject.set(x, "completeBefore", value.asInstanceOf[js.Any])
    
    inline def setCompleteBeforeUndefined: Self = StObject.set(x, "completeBefore", js.undefined)
    
    inline def setDestination(value: String | CreateDestinationProps): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setMetadata(value: js.Array[OnfleetMetadata]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setMetadataVarargs(value: OnfleetMetadata*): Self = StObject.set(x, "metadata", js.Array(value*))
    
    inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setPickupTask(value: Boolean): Self = StObject.set(x, "pickupTask", value.asInstanceOf[js.Any])
    
    inline def setPickupTaskUndefined: Self = StObject.set(x, "pickupTask", js.undefined)
    
    inline def setRecipients(value: OnfleetRecipient | js.Array[OnfleetRecipient]): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
    
    inline def setRecipientsUndefined: Self = StObject.set(x, "recipients", js.undefined)
    
    inline def setRecipientsVarargs(value: OnfleetRecipient*): Self = StObject.set(x, "recipients", js.Array(value*))
    
    inline def setServiceTime(value: Double): Self = StObject.set(x, "serviceTime", value.asInstanceOf[js.Any])
    
    inline def setServiceTimeUndefined: Self = StObject.set(x, "serviceTime", js.undefined)
  }
}
