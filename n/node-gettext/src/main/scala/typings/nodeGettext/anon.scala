package typings.nodeGettext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Debug extends StObject {
    
    var debug: js.UndefOr[Boolean] = js.native
    
    var sourceLocale: js.UndefOr[String] = js.native
  }
  object Debug {
    
    @scala.inline
    def apply(): Debug = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Debug]
    }
    
    @scala.inline
    implicit class DebugMutableBuilder[Self <: Debug] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setSourceLocale(value: String): Self = StObject.set(x, "sourceLocale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceLocaleUndefined: Self = StObject.set(x, "sourceLocale", js.undefined)
    }
  }
}
