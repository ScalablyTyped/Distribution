package typings
package ngDashCordovaLib.ngCordovaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileRemoveResult[TEntry] extends js.Object {
  var fileRemoved: TEntry
  var success: scala.Boolean
}

object IFileRemoveResult {
  @scala.inline
  def apply[TEntry](fileRemoved: TEntry, success: scala.Boolean): IFileRemoveResult[TEntry] = {
    val __obj = js.Dynamic.literal(fileRemoved = fileRemoved.asInstanceOf[js.Any], success = success)
  
    __obj.asInstanceOf[IFileRemoveResult[TEntry]]
  }
}

