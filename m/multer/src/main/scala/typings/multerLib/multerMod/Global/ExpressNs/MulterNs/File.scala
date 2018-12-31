package typings
package multerLib.multerMod.Global.ExpressNs.MulterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  /** A Buffer of the entire file (MemoryStorage) */
  var buffer: nodeLib.Buffer
  /** The folder to which the file has been saved (DiskStorage) */
  var destination: java.lang.String
  /** Encoding type of the file */
  var encoding: java.lang.String
  /** Field name specified in the form */
  var fieldname: java.lang.String
  /** The name of the file within the destination (DiskStorage) */
  var filename: java.lang.String
  /** Mime type of the file */
  var mimetype: java.lang.String
  /** Name of the file on the user's computer */
  var originalname: java.lang.String
  /** Location of the uploaded file (DiskStorage) */
  var path: java.lang.String
  /** Size of the file in bytes */
  var size: scala.Double
}

