package typings.multer.multerMod

import typings.express.expressMod.RequestHandler
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance extends js.Object {
  /** Accepts all files that comes over the wire. An array of files will be stored in req.files. */
  def any(): RequestHandler[ParamsDictionary] = js.native
  /** Accept an array of files, all with the name fieldName. Optionally error out if more than maxCount files are uploaded. The array of files will be stored in req.files. */
  def array(fieldName: String): RequestHandler[ParamsDictionary] = js.native
  def array(fieldName: String, maxCount: Double): RequestHandler[ParamsDictionary] = js.native
  /** Accept a mix of files, specified by fields. An object with arrays of files will be stored in req.files. */
  def fields(fields: js.Array[Field]): RequestHandler[ParamsDictionary] = js.native
  /** Accept only text fields. If any file upload is made, error with code “LIMIT_UNEXPECTED_FILE” will be issued. This is the same as doing upload.fields([]). */
  def none(): RequestHandler[ParamsDictionary] = js.native
  /** In case you need to handle a text-only multipart form, you can use any of the multer methods (.single(), .array(), fields()), req.body contains the text fields */
  /** Accept a single file with the name fieldName. The single file will be stored in req.file. */
  def single(): RequestHandler[ParamsDictionary] = js.native
  def single(fieldName: String): RequestHandler[ParamsDictionary] = js.native
}

