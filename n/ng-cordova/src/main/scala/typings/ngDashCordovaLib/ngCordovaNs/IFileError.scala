package typings
package ngDashCordovaLib.ngCordovaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileError
  extends cordovaDashPluginDashFileLib.FileError {
  var message: java.lang.String
}

object IFileError {
  @scala.inline
  def apply(code: scala.Double, message: java.lang.String): IFileError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[IFileError]
  }
}

