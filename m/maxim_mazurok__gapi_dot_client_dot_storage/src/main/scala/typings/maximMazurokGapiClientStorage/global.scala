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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object gapi extends js.Object {
    
    @js.native
    object client extends js.Object {
      
      /** Load Cloud Storage JSON API v1 */
      def load(name: storage, version: v1): js.Thenable[Unit] = js.native
      def load(name: storage, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object storage extends js.Object {
        
        val bucketAccessControls: BucketAccessControlsResource = js.native
        
        val buckets: BucketsResource = js.native
        
        val channels: ChannelsResource = js.native
        
        val defaultObjectAccessControls: DefaultObjectAccessControlsResource = js.native
        
        val notifications: NotificationsResource = js.native
        
        val objectAccessControls: ObjectAccessControlsResource = js.native
        
        val objects: ObjectsResource = js.native
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}
