package typings.overlayscrollbars.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Initialize extends StObject {
  
  var initialize: js.UndefOr[Boolean] = js.undefined
  
  var showNativeScrollbars: js.UndefOr[Boolean] = js.undefined
}
object Initialize {
  
  inline def apply(): Initialize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Initialize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Initialize] (val x: Self) extends AnyVal {
    
    inline def setInitialize(value: Boolean): Self = StObject.set(x, "initialize", value.asInstanceOf[js.Any])
    
    inline def setInitializeUndefined: Self = StObject.set(x, "initialize", js.undefined)
    
    inline def setShowNativeScrollbars(value: Boolean): Self = StObject.set(x, "showNativeScrollbars", value.asInstanceOf[js.Any])
    
    inline def setShowNativeScrollbarsUndefined: Self = StObject.set(x, "showNativeScrollbars", js.undefined)
  }
}
