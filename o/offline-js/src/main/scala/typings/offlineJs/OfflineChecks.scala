package typings.offlineJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OfflineChecks extends StObject {
  
  var active: js.UndefOr[String] = js.undefined
  
  var image: js.UndefOr[OfflineCheck] = js.undefined
  
  // TODO "xhr" and "image" probably have different options.
  // However, this is not stated in the project documentation.
  var xhr: js.UndefOr[OfflineCheck] = js.undefined
}
object OfflineChecks {
  
  @scala.inline
  def apply(): OfflineChecks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OfflineChecks]
  }
  
  @scala.inline
  implicit class OfflineChecksMutableBuilder[Self <: OfflineChecks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setImage(value: OfflineCheck): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setXhr(value: OfflineCheck): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
  }
}
