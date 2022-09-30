package typings.maximMazurokGapiClientStorage

import typings.maximMazurokGapiClientStorage.gapi.client.storage.BucketAccessControlsResource
import typings.maximMazurokGapiClientStorage.gapi.client.storage.BucketsResource
import typings.maximMazurokGapiClientStorage.gapi.client.storage.ChannelsResource
import typings.maximMazurokGapiClientStorage.gapi.client.storage.DefaultObjectAccessControlsResource
import typings.maximMazurokGapiClientStorage.gapi.client.storage.NotificationsResource
import typings.maximMazurokGapiClientStorage.gapi.client.storage.ObjectAccessControlsResource
import typings.maximMazurokGapiClientStorage.gapi.client.storage.ObjectsResource
import typings.maximMazurokGapiClientStorage.gapi.client.storage.ProjectsResource
import typings.maximMazurokGapiClientStorage.maximMazurokGapiClientStorageStrings.storage
import typings.maximMazurokGapiClientStorage.maximMazurokGapiClientStorageStrings.v1
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
      
      /** Load Cloud Storage JSON API v1 */
      inline def load(name: storage, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: storage, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object storage {
        
        @JSGlobal("gapi.client.storage.bucketAccessControls")
        @js.native
        val bucketAccessControls: BucketAccessControlsResource = js.native
        
        @JSGlobal("gapi.client.storage.buckets")
        @js.native
        val buckets: BucketsResource = js.native
        
        @JSGlobal("gapi.client.storage.channels")
        @js.native
        val channels: ChannelsResource = js.native
        
        @JSGlobal("gapi.client.storage.defaultObjectAccessControls")
        @js.native
        val defaultObjectAccessControls: DefaultObjectAccessControlsResource = js.native
        
        @JSGlobal("gapi.client.storage.notifications")
        @js.native
        val notifications: NotificationsResource = js.native
        
        @JSGlobal("gapi.client.storage.objectAccessControls")
        @js.native
        val objectAccessControls: ObjectAccessControlsResource = js.native
        
        @JSGlobal("gapi.client.storage.objects")
        @js.native
        val objects: ObjectsResource = js.native
        
        @JSGlobal("gapi.client.storage.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}
