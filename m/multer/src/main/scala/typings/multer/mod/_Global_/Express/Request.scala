package typings.multer.mod._Global_.Express

import org.scalablytyped.runtime.StringDictionary
import typings.multer.mod._Global_.Express.Multer.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  /** `Multer.File` object populated by `single()` middleware. */
  var file: File
  /**
    * Array or dictionary of `Multer.File` object populated by `array()`,
    * `fields()`, and `any()` middleware.
    */
  var files: StringDictionary[js.Array[File]] | js.Array[File]
}

object Request {
  @scala.inline
  def apply(file: File, files: StringDictionary[js.Array[File]] | js.Array[File]): Request = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Request]
  }
}

