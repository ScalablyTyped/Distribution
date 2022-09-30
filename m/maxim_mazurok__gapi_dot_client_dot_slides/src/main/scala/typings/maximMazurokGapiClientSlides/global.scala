package typings.maximMazurokGapiClientSlides

import typings.maximMazurokGapiClientSlides.gapi.client.slides.PresentationsResource
import typings.maximMazurokGapiClientSlides.maximMazurokGapiClientSlidesStrings.slides
import typings.maximMazurokGapiClientSlides.maximMazurokGapiClientSlidesStrings.v1
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      /** Load Google Slides API v1 */
      inline def load(name: slides, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: slides, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object slides {
        
        @JSGlobal("gapi.client.slides.presentations")
        @js.native
        val presentations: PresentationsResource = js.native
      }
    }
  }
}
