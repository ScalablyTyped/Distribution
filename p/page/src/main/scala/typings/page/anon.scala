package typings.page

import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<page.PageJS.Options> */
  trait PartialOptions extends StObject {
    
    var click: js.UndefOr[Boolean] = js.undefined
    
    var decodeURLComponents: js.UndefOr[Boolean] = js.undefined
    
    var dispatch: js.UndefOr[Boolean] = js.undefined
    
    var hashbang: js.UndefOr[Boolean] = js.undefined
    
    var popstate: js.UndefOr[Boolean] = js.undefined
    
    var window: js.UndefOr[Window] = js.undefined
  }
  object PartialOptions {
    
    inline def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    extension [Self <: PartialOptions](x: Self) {
      
      inline def setClick(value: Boolean): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
      
      inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      inline def setDecodeURLComponents(value: Boolean): Self = StObject.set(x, "decodeURLComponents", value.asInstanceOf[js.Any])
      
      inline def setDecodeURLComponentsUndefined: Self = StObject.set(x, "decodeURLComponents", js.undefined)
      
      inline def setDispatch(value: Boolean): Self = StObject.set(x, "dispatch", value.asInstanceOf[js.Any])
      
      inline def setDispatchUndefined: Self = StObject.set(x, "dispatch", js.undefined)
      
      inline def setHashbang(value: Boolean): Self = StObject.set(x, "hashbang", value.asInstanceOf[js.Any])
      
      inline def setHashbangUndefined: Self = StObject.set(x, "hashbang", js.undefined)
      
      inline def setPopstate(value: Boolean): Self = StObject.set(x, "popstate", value.asInstanceOf[js.Any])
      
      inline def setPopstateUndefined: Self = StObject.set(x, "popstate", js.undefined)
      
      inline def setWindow(value: Window): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    }
  }
}
