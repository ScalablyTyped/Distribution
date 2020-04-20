package typings.microsoftLiveConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sub object of REST objects that contains information about who the
  * item is shared with.
  */
trait ISharedWith extends js.Object {
  /**
    * A localized string that contains info about who can access the
    * item. The options are:
    * - People I selected
    * - Just me
    * - Everyone (public)
    * - Friends
    * - My friends and their friends
    * - People with a link
    * The default is Just me.
    */
  var access: String
}

object ISharedWith {
  @scala.inline
  def apply(access: String): ISharedWith = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISharedWith]
  }
}

