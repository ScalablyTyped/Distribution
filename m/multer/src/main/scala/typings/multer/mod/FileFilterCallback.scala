package typings.multer.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * a function to control which files should be uploaded and which should be skipped
  * pass a boolean to indicate if the file should be accepted
  * pass an error if something goes wrong
  */
@js.native
trait FileFilterCallback extends js.Object {
  def apply(error: Null, acceptFile: Boolean): Unit = js.native
  def apply(error: Error): Unit = js.native
}

