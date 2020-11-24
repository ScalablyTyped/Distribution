package typings.multer.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://github.com/expressjs/multer#api}
  */
@js.native
trait Multer extends js.Object {
  
  /**
    * Returns middleware that processes all files contained in the multipart
    * request.
    *
    * The `Request` object will be populated with a `files` array containing
    * an information object for each processed file.
    */
  def any(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  /**
    * Returns middleware that processes multiple files sharing the same field
    * name.
    *
    * The `Request` object will be populated with a `files` array containing
    * an information object for each processed file.
    *
    * @param fieldName Shared name of the multipart form fields to process.
    * @param maxCount Optional. Maximum number of files to process. (default: Infinity)
    * @throws `MulterError('LIMIT_UNEXPECTED_FILE')` if more than `maxCount` files are associated with `fieldName`
    */
  def array(fieldName: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def array(fieldName: String, maxCount: Double): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  /**
    * Returns middleware that processes multiple files associated with the
    * given form fields.
    *
    * The `Request` object will be populated with a `files` object which
    * maps each field name to an array of the associated file information
    * objects.
    *
    * @param fields Array of `Field` objects describing multipart form fields to process.
    * @throws `MulterError('LIMIT_UNEXPECTED_FILE')` if more than `maxCount` files are associated with `fieldName` for any field.
    */
  def fields(fields: js.Array[Field]): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  /**
    * Returns middleware that accepts only non-file multipart form fields.
    *
    * @throws `MulterError('LIMIT_UNEXPECTED_FILE')` if any file is encountered.
    */
  def none(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  /**
    * Returns middleware that processes a single file associated with the
    * given form field.
    *
    * The `Request` object will be populated with a `file` object containing
    * information about the processed file.
    *
    * @param fieldName Name of the multipart form field to process.
    */
  def single(fieldName: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}
