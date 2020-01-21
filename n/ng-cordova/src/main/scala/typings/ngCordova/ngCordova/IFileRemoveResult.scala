package typings.ngCordova.ngCordova

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileRemoveResult[TEntry] extends js.Object {
  var fileRemoved: TEntry
  var success: Boolean
}

object IFileRemoveResult {
  @scala.inline
  def apply[TEntry](fileRemoved: TEntry, success: Boolean): IFileRemoveResult[TEntry] = {
    val __obj = js.Dynamic.literal(fileRemoved = fileRemoved.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IFileRemoveResult[TEntry]]
  }
}

