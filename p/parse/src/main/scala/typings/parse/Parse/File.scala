package typings.parse.Parse

import typings.parse.Anon_Base64
import typings.parse.Anon_ForceSecure
import typings.parse.Anon_Name
import typings.parse.Anon_Uri
import typings.parse.Parse.Schema._TYPE
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Parse.File is a local representation of a file that is saved to the Parse
  * cloud.
  * @param name The file's name. This will be prefixed by a unique
  *     value once the file has finished saving. The file name must begin with
  *     an alphanumeric character, and consist of alphanumeric characters,
  *     periods, spaces, underscores, or dashes.
  * @param data The data for the file, as either:
  *     1. an Array of byte value Numbers, or
  *     2. an Object like { base64: "..." } with a base64-encoded String.
  *     3. a File object selected with a file upload control. (3) only works
  *        in Firefox 3.6+, Safari 6.0.2+, Chrome 7+, and IE 10+.
  *        For example:<pre>
  * var fileUploadControl = $("#profilePhotoFileUpload")[0];
  * if (fileUploadControl.files.length > 0) {
  *   var file = fileUploadControl.files[0];
  *   var name = "photo.jpg";
  *   var parseFile = new Parse.File(name, file);
  *   parseFile.save().then(function() {
  *     // The file has been saved to Parse.
  *   }, function(error) {
  *     // The file either could not be read, or could not be saved to Parse.
  *   });
  * }</pre>
  * @param type Optional Content-Type header to use for the file. If
  *     this is omitted, the content type will be inferred from the name's
  *     extension.
  */
@JSGlobal("Parse.File")
@js.native
class File protected () extends _TYPE {
  def this(name: String, data: js.Array[Double]) = this()
  def this(name: String, data: Anon_Base64) = this()
  def this(name: String, data: Anon_Uri) = this()
  def this(name: String, data: Blob) = this()
  def this(name: String, data: js.Array[Double], `type`: String) = this()
  def this(name: String, data: Anon_Base64, `type`: String) = this()
  def this(name: String, data: Anon_Uri, `type`: String) = this()
  def this(name: String, data: Blob, `type`: String) = this()
  /**
    * Return the data for the file, downloading it if not already present.
    * Data is present if initialized with Byte Array, Base64 or Saved with Uri.
    * Data is cleared if saved with File object selected with a file upload control
    *
    * @returns Promise that is resolved with base64 data
    */
  def getData(): js.Promise[String] = js.native
  def name(): String = js.native
  def save(): js.Promise[File] = js.native
  def save(options: SuccessFailureOptions): js.Promise[File] = js.native
  def toJSON(): Anon_Name = js.native
  def url(): String = js.native
  def url(options: Anon_ForceSecure): String = js.native
}

