package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMFDocListCtrl extends StObject {
  
  def AttachToListingWindow(shellListing: js.Any): Unit
}
object IMFDocListCtrl {
  
  inline def apply(AttachToListingWindow: js.Any => Unit): IMFDocListCtrl = {
    val __obj = js.Dynamic.literal(AttachToListingWindow = js.Any.fromFunction1(AttachToListingWindow))
    __obj.asInstanceOf[IMFDocListCtrl]
  }
  
  extension [Self <: IMFDocListCtrl](x: Self) {
    
    inline def setAttachToListingWindow(value: js.Any => Unit): Self = StObject.set(x, "AttachToListingWindow", js.Any.fromFunction1(value))
  }
}
