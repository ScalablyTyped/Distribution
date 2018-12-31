package typings
package microsoftDashLiveDashConnectLib.MicrosoftNs.LiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Photo object contains info about a user's photos on SkyDrive. The
  * Live Connect REST API supports creating, reading, updating, and deleting
  * Photo objects. Use the wl.photos scope to read Photo objects. Use the
  * wl.contacts_photos scope to read any albums, photos, videos, and audio
  * that other users have shared with the user. Use the wl.skydrive_update
  * scope to create, update, or delete Photo objects.
  */
trait IPhoto extends js.Object {
  /**
    * The manufacturer of the camera that took the photo.
    */
  var camera_make: java.lang.String
  /**
    * The brand and model number of the camera that took the photo.
    */
  var camera_model: java.lang.String
  /**
    * The number of comments associated with the photo.
    */
  var comments_count: scala.Double
  /**
    * A value that indicates whether comments are enabled for the photo. If
    * comments can be made, this value is true; otherwise, it is false.
    */
  var comments_enabled: scala.Boolean
  /**
    * The time, in ISO 8601 format, at which the photo was created.
    */
  var created_time: java.lang.String
  /**
    * A description of the photo, or null if no description is specified.
    */
  var description: java.lang.String
  /**
    * The denominator of the shutter speed (for example, the "15" in "1/15
    * s") that the photo was taken at.
    */
  var exposure_denominator: scala.Double
  /**
    * The numerator of the shutter speed (for example, the "1" in "1/15 s")
    * that the photo was taken at.
    */
  var exposure_numerator: scala.Double
  /**
    * The focal length that the photo was taken at, typically expressed in
    * millimeters for newer lenses.
    */
  var focal_length: scala.Double
  /**
    * The f-number that the photo was taken at.
    */
  var focal_ratio: scala.Double
  /**
    * Info about the user who uploaded the photo.
    */
  var from: IUserInfo
  /**
    * The height, in pixels, of the photo.
    */
  var height: scala.Double
  /**
    * The Photo object's ID.
    */
  var id: java.lang.String
  /**
    * Info about various sizes of the photo.
    */
  var images: js.Array[IImageInfo]
  /**
    * A value that indicates whether this photo can be embedded. If this
    * photo can be embedded, this value is true; otherwise, it is false.
    */
  var is_embeddable: scala.Boolean
  /**
    * A URL of the photo, hosted in SkyDrive.
    */
  var link: java.lang.String
  /**
    * The location where the photo was taken.
    * Note: The location object is not available for shared photos.
    */
  var location: ILocation
  /**
    * The file name of the photo.
    */
  var name: java.lang.String
  /**
    * The ID of the folder where the item is stored.
    */
  var parent_id: java.lang.String
  /**
    * A URL of the photo's picture.
    */
  var picture: java.lang.String
  /**
    * The object that contains permissions info for the photo.
    */
  var shared_with: ISharedWith
  /**
    * The size, in bytes, of the photo.
    */
  var size: scala.Double
  /**
    * The download URL for the photo.
    * Warning: This value is not persistent. Use it immediately after
    * making the request, and avoid caching.
    */
  var source: java.lang.String
  /**
    * The number of tags on the photo.
    */
  var tags_count: scala.Double
  /**
    * A value that indicates whether tags are enabled for the photo. If
    * users can tag the photo, this value is true; otherwise, it is false.
    */
  var tags_enabled: scala.Boolean
  /**
    * The type of object; in this case, "photo".
    */
  var `type`: java.lang.String
  /**
    * The time, in ISO 8601 format, at which the photo was last updated.
    */
  var updated_time: java.lang.String
  /**
    * The URL to upload photo content hosted in SkyDrive. This value is
    * returned only if the wl.skydrive scope is present.
    */
  var upload_location: java.lang.String
  /**
    * The date, in ISO 8601 format, on which the photo was taken, or null
    * if no date is specified.
    */
  var when_taken: java.lang.String
  /**
    * The width, in pixels, of the photo.
    */
  var width: scala.Double
}

