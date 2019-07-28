package typings.multer.multerMod.Global.ExpressNs

import org.scalablytyped.runtime.StringDictionary
import typings.multer.multerMod.Global.ExpressNs.MulterNs.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var file: File
  var files: StringDictionary[js.Array[File]] | js.Array[File]
}

object Request {
  @scala.inline
  def apply(file: File, files: StringDictionary[js.Array[File]] | js.Array[File]): Request = {
    val __obj = js.Dynamic.literal(file = file, files = files.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Request]
  }
}

