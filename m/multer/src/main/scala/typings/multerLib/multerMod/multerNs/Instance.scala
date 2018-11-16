package typings
package multerLib.multerMod.multerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance extends js.Object {
  /** Accepts all files that comes over the wire. An array of files will be stored in req.files. */
  def any(): expressLib.expressMod.eNs.RequestHandler = js.native
  /** Accept an array of files, all with the name fieldName. Optionally error out if more than maxCount files are uploaded. The array of files will be stored in req.files. */
  def array(fieldName: java.lang.String): expressLib.expressMod.eNs.RequestHandler = js.native
  /** Accept an array of files, all with the name fieldName. Optionally error out if more than maxCount files are uploaded. The array of files will be stored in req.files. */
  def array(fieldName: java.lang.String, maxCount: scala.Double): expressLib.expressMod.eNs.RequestHandler = js.native
  /** Accept a mix of files, specified by fields. An object with arrays of files will be stored in req.files. */
  def fields(fields: js.Array[Field]): expressLib.expressMod.eNs.RequestHandler = js.native
  /** Accept only text fields. If any file upload is made, error with code “LIMIT_UNEXPECTED_FILE” will be issued. This is the same as doing upload.fields([]). */
  def none(): expressLib.expressMod.eNs.RequestHandler = js.native
  /** In case you need to handle a text-only multipart form, you can use any of the multer methods (.single(), .array(), fields()), req.body contains the text fields */
  /** Accept a single file with the name fieldName. The single file will be stored in req.file. */
  def single(): expressLib.expressMod.eNs.RequestHandler = js.native
  /** In case you need to handle a text-only multipart form, you can use any of the multer methods (.single(), .array(), fields()), req.body contains the text fields */
  /** Accept a single file with the name fieldName. The single file will be stored in req.file. */
  def single(fieldName: java.lang.String): expressLib.expressMod.eNs.RequestHandler = js.native
}

