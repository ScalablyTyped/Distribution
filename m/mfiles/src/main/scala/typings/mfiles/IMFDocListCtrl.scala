package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMFDocListCtrl extends StObject {
  
  def AttachToListingWindow(shellListing: Any): Unit
}
object IMFDocListCtrl {
  
  inline def apply(AttachToListingWindow: Any => Unit): IMFDocListCtrl = {
    val __obj = js.Dynamic.literal(AttachToListingWindow = js.Any.fromFunction1(AttachToListingWindow))
    __obj.asInstanceOf[IMFDocListCtrl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMFDocListCtrl] (val x: Self) extends AnyVal {
    
    inline def setAttachToListingWindow(value: Any => Unit): Self = StObject.set(x, "AttachToListingWindow", js.Any.fromFunction1(value))
  }
}
