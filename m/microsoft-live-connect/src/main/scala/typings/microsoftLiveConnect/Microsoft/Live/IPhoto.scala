package typings.microsoftLiveConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Photo object contains info about a user's photos on SkyDrive. The
  * Live Connect REST API supports creating, reading, updating, and deleting
  * Photo objects. Use the wl.photos scope to read Photo objects. Use the
  * wl.contacts_photos scope to read any albums, photos, videos, and audio
  * that other users have shared with the user. Use the wl.skydrive_update
  * scope to create, update, or delete Photo objects.
  */
@js.native
trait IPhoto extends js.Object {
  
  /**
    * The manufacturer of the camera that took the photo.
    */
  var camera_make: String = js.native
  
  /**
    * The brand and model number of the camera that took the photo.
    */
  var camera_model: String = js.native
  
  /**
    * The number of comments associated with the photo.
    */
  var comments_count: Double = js.native
  
  /**
    * A value that indicates whether comments are enabled for the photo. If
    * comments can be made, this value is true; otherwise, it is false.
    */
  var comments_enabled: Boolean = js.native
  
  /**
    * The time, in ISO 8601 format, at which the photo was created.
    */
  var created_time: String = js.native
  
  /**
    * A description of the photo, or null if no description is specified.
    */
  var description: String = js.native
  
  /**
    * The denominator of the shutter speed (for example, the "15" in "1/15
    * s") that the photo was taken at.
    */
  var exposure_denominator: Double = js.native
  
  /**
    * The numerator of the shutter speed (for example, the "1" in "1/15 s")
    * that the photo was taken at.
    */
  var exposure_numerator: Double = js.native
  
  /**
    * The focal length that the photo was taken at, typically expressed in
    * millimeters for newer lenses.
    */
  var focal_length: Double = js.native
  
  /**
    * The f-number that the photo was taken at.
    */
  var focal_ratio: Double = js.native
  
  /**
    * Info about the user who uploaded the photo.
    */
  var from: IUserInfo = js.native
  
  /**
    * The height, in pixels, of the photo.
    */
  var height: Double = js.native
  
  /**
    * The Photo object's ID.
    */
  var id: String = js.native
  
  /**
    * Info about various sizes of the photo.
    */
  var images: js.Array[IImageInfo] = js.native
  
  /**
    * A value that indicates whether this photo can be embedded. If this
    * photo can be embedded, this value is true; otherwise, it is false.
    */
  var is_embeddable: Boolean = js.native
  
  /**
    * A URL of the photo, hosted in SkyDrive.
    */
  var link: String = js.native
  
  /**
    * The location where the photo was taken.
    * Note: The location object is not available for shared photos.
    */
  var location: ILocation = js.native
  
  /**
    * The file name of the photo.
    */
  var name: String = js.native
  
  /**
    * The ID of the folder where the item is stored.
    */
  var parent_id: String = js.native
  
  /**
    * A URL of the photo's picture.
    */
  var picture: String = js.native
  
  /**
    * The object that contains permissions info for the photo.
    */
  var shared_with: ISharedWith = js.native
  
  /**
    * The size, in bytes, of the photo.
    */
  var size: Double = js.native
  
  /**
    * The download URL for the photo.
    * Warning: This value is not persistent. Use it immediately after
    * making the request, and avoid caching.
    */
  var source: String = js.native
  
  /**
    * The number of tags on the photo.
    */
  var tags_count: Double = js.native
  
  /**
    * A value that indicates whether tags are enabled for the photo. If
    * users can tag the photo, this value is true; otherwise, it is false.
    */
  var tags_enabled: Boolean = js.native
  
  /**
    * The type of object; in this case, "photo".
    */
  var `type`: String = js.native
  
  /**
    * The time, in ISO 8601 format, at which the photo was last updated.
    */
  var updated_time: String = js.native
  
  /**
    * The URL to upload photo content hosted in SkyDrive. This value is
    * returned only if the wl.skydrive scope is present.
    */
  var upload_location: String = js.native
  
  /**
    * The date, in ISO 8601 format, on which the photo was taken, or null
    * if no date is specified.
    */
  var when_taken: String = js.native
  
  /**
    * The width, in pixels, of the photo.
    */
  var width: Double = js.native
}
object IPhoto {
  
  @scala.inline
  def apply(
    camera_make: String,
    camera_model: String,
    comments_count: Double,
    comments_enabled: Boolean,
    created_time: String,
    description: String,
    exposure_denominator: Double,
    exposure_numerator: Double,
    focal_length: Double,
    focal_ratio: Double,
    from: IUserInfo,
    height: Double,
    id: String,
    images: js.Array[IImageInfo],
    is_embeddable: Boolean,
    link: String,
    location: ILocation,
    name: String,
    parent_id: String,
    picture: String,
    shared_with: ISharedWith,
    size: Double,
    source: String,
    tags_count: Double,
    tags_enabled: Boolean,
    `type`: String,
    updated_time: String,
    upload_location: String,
    when_taken: String,
    width: Double
  ): IPhoto = {
    val __obj = js.Dynamic.literal(camera_make = camera_make.asInstanceOf[js.Any], camera_model = camera_model.asInstanceOf[js.Any], comments_count = comments_count.asInstanceOf[js.Any], comments_enabled = comments_enabled.asInstanceOf[js.Any], created_time = created_time.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], exposure_denominator = exposure_denominator.asInstanceOf[js.Any], exposure_numerator = exposure_numerator.asInstanceOf[js.Any], focal_length = focal_length.asInstanceOf[js.Any], focal_ratio = focal_ratio.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], is_embeddable = is_embeddable.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent_id = parent_id.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any], shared_with = shared_with.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], tags_count = tags_count.asInstanceOf[js.Any], tags_enabled = tags_enabled.asInstanceOf[js.Any], updated_time = updated_time.asInstanceOf[js.Any], upload_location = upload_location.asInstanceOf[js.Any], when_taken = when_taken.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPhoto]
  }
  
  @scala.inline
  implicit class IPhotoOps[Self <: IPhoto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCamera_make(value: String): Self = this.set("camera_make", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCamera_model(value: String): Self = this.set("camera_model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComments_count(value: Double): Self = this.set("comments_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComments_enabled(value: Boolean): Self = this.set("comments_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_time(value: String): Self = this.set("created_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExposure_denominator(value: Double): Self = this.set("exposure_denominator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExposure_numerator(value: Double): Self = this.set("exposure_numerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocal_length(value: Double): Self = this.set("focal_length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocal_ratio(value: Double): Self = this.set("focal_ratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: IUserInfo): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesVarargs(value: IImageInfo*): Self = this.set("images", js.Array(value :_*))
    
    @scala.inline
    def setImages(value: js.Array[IImageInfo]): Self = this.set("images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_embeddable(value: Boolean): Self = this.set("is_embeddable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: ILocation): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent_id(value: String): Self = this.set("parent_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPicture(value: String): Self = this.set("picture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShared_with(value: ISharedWith): Self = this.set("shared_with", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags_count(value: Double): Self = this.set("tags_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags_enabled(value: Boolean): Self = this.set("tags_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated_time(value: String): Self = this.set("updated_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpload_location(value: String): Self = this.set("upload_location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhen_taken(value: String): Self = this.set("when_taken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
