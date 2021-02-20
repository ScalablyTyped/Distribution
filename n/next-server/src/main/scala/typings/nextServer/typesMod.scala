package typings.nextServer

import typings.nextServer.anon.BodyParser
import typings.nextServer.nextServerStrings.hybrid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait PageConfig extends StObject {
    
    var amp: js.UndefOr[Boolean | hybrid] = js.native
    
    var api: js.UndefOr[BodyParser] = js.native
    
    var experimentalPrerender: js.UndefOr[Boolean] = js.native
  }
  object PageConfig {
    
    @scala.inline
    def apply(): PageConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageConfig]
    }
    
    @scala.inline
    implicit class PageConfigMutableBuilder[Self <: PageConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmp(value: Boolean | hybrid): Self = StObject.set(x, "amp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmpUndefined: Self = StObject.set(x, "amp", js.undefined)
      
      @scala.inline
      def setApi(value: BodyParser): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
      
      @scala.inline
      def setExperimentalPrerender(value: Boolean): Self = StObject.set(x, "experimentalPrerender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExperimentalPrerenderUndefined: Self = StObject.set(x, "experimentalPrerender", js.undefined)
    }
  }
}
