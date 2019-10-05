package typings.ngDashCordova.ngCordova

import typings.cordovaDashPluginDashFile.FileError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileError extends FileError {
  var message: String
}

object IFileError {
  @scala.inline
  def apply(code: Double, message: String): IFileError = {
    val __obj = js.Dynamic.literal(code = code, message = message)
  
    __obj.asInstanceOf[IFileError]
  }
}

