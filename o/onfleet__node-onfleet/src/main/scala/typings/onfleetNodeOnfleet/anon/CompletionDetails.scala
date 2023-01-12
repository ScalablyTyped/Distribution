package typings.onfleetNodeOnfleet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompletionDetails extends StObject {
  
  var completionDetails: Notes
}
object CompletionDetails {
  
  inline def apply(completionDetails: Notes): CompletionDetails = {
    val __obj = js.Dynamic.literal(completionDetails = completionDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompletionDetails] (val x: Self) extends AnyVal {
    
    inline def setCompletionDetails(value: Notes): Self = StObject.set(x, "completionDetails", value.asInstanceOf[js.Any])
  }
}
