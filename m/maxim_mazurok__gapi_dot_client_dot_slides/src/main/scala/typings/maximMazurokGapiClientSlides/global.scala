package typings.maximMazurokGapiClientSlides

import typings.maximMazurokGapiClientSlides.gapi.client.slides.PresentationsResource
import typings.maximMazurokGapiClientSlides.maximMazurokGapiClientSlidesStrings.slides
import typings.maximMazurokGapiClientSlides.maximMazurokGapiClientSlidesStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Google Slides API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: slides, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: slides, version: v1, callback: js.Function0[_]): Unit = js.native
      
      object slides {
        
        @JSGlobal("gapi.client.slides.presentations")
        @js.native
        val presentations: PresentationsResource = js.native
      }
    }
  }
}
