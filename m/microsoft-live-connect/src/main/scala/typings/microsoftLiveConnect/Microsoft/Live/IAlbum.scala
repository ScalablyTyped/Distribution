package typings.microsoftLiveConnect.Microsoft.Live

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Album object contains info about a user's albums in Microsoft
  * SkyDrive. Albums are stored at the root level of a user's SkyDrive
  * directory, and can contain combinations of photos, videos, audio, files,
  * and folders. The Live Connect REST API supports reading Album objects.
  * Use the wl.photos scope to read a user's Album objects. Use the
  * wl.skydrive scope to read a user's files. Use the wl.contacts_photos
  * scope to read any albums, photos, videos, and audio that other users have
  * shared with the user.
  */
trait IAlbum extends StObject {
  
  /**
    * The time, in ISO 8601 format, that the file was last updated.
    */
  var client_updated_time: String
  
  /**
    * The total number of items in the album.
    */
  var count: Double
  
  /**
    * The time, in ISO 8601 format, at which the album was created.
    */
  var created_time: String
  
  /**
    * A description of the album, or null if no description is specified.
    */
  var description: String
  
  /**
    * Info about the user who authored the album.
    */
  var from: IUserInfo
  
  /**
    * The Album object's ID.
    */
  var id: String
  
  /**
    * A value that indicates whether this album can be embedded. If this
    * album can be embedded, this value is true; otherwise, it is false.
    */
  var is_embeddable: Boolean
  
  /**
    * A URL of the album, hosted in SkyDrive.
    */
  var link: String
  
  /**
    * The name of the album.
    */
  var name: String
  
  /**
    * The resource ID of the parent.
    */
  var parent_id: String
  
  /**
    * The object that contains permissions info for the album. Requires the
    * wl.skydrive scope.
    */
  var shared_with: ISharedWith
  
  /**
    * The type of object; in this case, "album".
    */
  var `type`: String
  
  /**
    * The time, in ISO 8601 format, that the system updated the album last.
    */
  var updated_time: String
  
  /**
    * The URL to upload items to the album, hosted in SkyDrive. Requires
    * the wl.skydrive scope.
    */
  var upload_location: String
}
object IAlbum {
  
  @scala.inline
  def apply(
    client_updated_time: String,
    count: Double,
    created_time: String,
    description: String,
    from: IUserInfo,
    id: String,
    is_embeddable: Boolean,
    link: String,
    name: String,
    parent_id: String,
    shared_with: ISharedWith,
    `type`: String,
    updated_time: String,
    upload_location: String
  ): IAlbum = {
    val __obj = js.Dynamic.literal(client_updated_time = client_updated_time.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], created_time = created_time.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_embeddable = is_embeddable.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent_id = parent_id.asInstanceOf[js.Any], shared_with = shared_with.asInstanceOf[js.Any], updated_time = updated_time.asInstanceOf[js.Any], upload_location = upload_location.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAlbum]
  }
  
  @scala.inline
  implicit class IAlbumMutableBuilder[Self <: IAlbum] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClient_updated_time(value: String): Self = StObject.set(x, "client_updated_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_time(value: String): Self = StObject.set(x, "created_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: IUserInfo): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_embeddable(value: Boolean): Self = StObject.set(x, "is_embeddable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent_id(value: String): Self = StObject.set(x, "parent_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShared_with(value: ISharedWith): Self = StObject.set(x, "shared_with", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated_time(value: String): Self = StObject.set(x, "updated_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpload_location(value: String): Self = StObject.set(x, "upload_location", value.asInstanceOf[js.Any])
  }
}
