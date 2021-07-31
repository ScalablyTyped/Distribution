package typings.page

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
  }
  object PartialOptions {
    
    @scala.inline
    def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    @scala.inline
    implicit class PartialOptionsMutableBuilder[Self <: PartialOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClick(value: Boolean): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      @scala.inline
      def setDecodeURLComponents(value: Boolean): Self = StObject.set(x, "decodeURLComponents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecodeURLComponentsUndefined: Self = StObject.set(x, "decodeURLComponents", js.undefined)
      
      @scala.inline
      def setDispatch(value: Boolean): Self = StObject.set(x, "dispatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDispatchUndefined: Self = StObject.set(x, "dispatch", js.undefined)
      
      @scala.inline
      def setHashbang(value: Boolean): Self = StObject.set(x, "hashbang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashbangUndefined: Self = StObject.set(x, "hashbang", js.undefined)
      
      @scala.inline
      def setPopstate(value: Boolean): Self = StObject.set(x, "popstate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopstateUndefined: Self = StObject.set(x, "popstate", js.undefined)
    }
  }
}
