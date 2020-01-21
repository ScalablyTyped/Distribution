package typings.ngCordova.ngCordova

import typings.cordovaPluginFile.FileError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileError extends FileError {
  var message: String
}

object IFileError {
  @scala.inline
  def apply(code: Double, message: String): IFileError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IFileError]
  }
}

