package typings.maximMazurokGapiClientStreetviewpublish

import typings.maximMazurokGapiClientStreetviewpublish.gapi.client.streetviewpublish.PhotoResource
import typings.maximMazurokGapiClientStreetviewpublish.gapi.client.streetviewpublish.PhotosResource
import typings.maximMazurokGapiClientStreetviewpublish.maximMazurokGapiClientStreetviewpublishStrings.streetviewpublish
import typings.maximMazurokGapiClientStreetviewpublish.maximMazurokGapiClientStreetviewpublishStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      /** Load Street View Publish API v1 */
      inline def load(name: streetviewpublish, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: streetviewpublish, version: v1, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object streetviewpublish {
        
        @JSGlobal("gapi.client.streetviewpublish.photo")
        @js.native
        val photo: PhotoResource = js.native
        
        @JSGlobal("gapi.client.streetviewpublish.photos")
        @js.native
        val photos: PhotosResource = js.native
      }
    }
  }
}
