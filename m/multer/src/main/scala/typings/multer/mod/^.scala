package typings.multer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("multer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Returns a Multer instance that provides several methods for generating
    * middleware that process files uploaded in `multipart/form-data` format.
    *
    * The `StorageEngine` specified in `storage` will be used to store files. If
    * `storage` is not set and `dest` is, files will be stored in `dest` on the
    * local file system with random names. If neither are set, files will be stored
    * in memory.
    *
    * In addition to files, all generated middleware process all text fields in
    * the request. For each non-file field, the `Request.body` object will be
    * populated with an entry mapping the field name to its string value, or array
    * of string values if multiple fields share the same name.
    */
  def apply(): Multer = js.native
  def apply(options: Options): Multer = js.native
}

